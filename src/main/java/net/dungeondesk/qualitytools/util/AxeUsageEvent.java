package net.dungeondesk.qualitytools.util;

import net.dungeondesk.qualitytools.item.custom.TreeAxeItem;
import net.fabricmc.fabric.api.event.player.PlayerBlockBreakEvents;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.AxeItem;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.text.Text;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class AxeUsageEvent implements PlayerBlockBreakEvents.Before{

    private static final Set<BlockPos> HARVESTED_BLOCKS = new HashSet<>();
    @Override
    public boolean beforeBlockBreak(World world, PlayerEntity player, BlockPos pos, BlockState blockState, @Nullable BlockEntity blockEntity) {
        ItemStack mainHandItem = player.getMainHandStack();

        if(mainHandItem.getItem() instanceof AxeItem axe && player instanceof ServerPlayerEntity serverPlayer && serverPlayer.isSneaking() && world.getBlockState(pos).isIn(BlockTags.LOGS)) {
            if(HARVESTED_BLOCKS.contains(pos)) {
                return true;
            }
            List<BlockPos> blocksToBreak = TreeAxeItem.getBlocksToBeDestroyed(world, pos, serverPlayer);
            for(BlockPos position : blocksToBreak) {
                if(!axe.isCorrectForDrops(mainHandItem, world.getBlockState(position))) {
                    continue;
                }
                HARVESTED_BLOCKS.add(position);
                try {
                    serverPlayer.interactionManager.tryBreakBlock(position);
                } catch(Exception ex) {
                    player.sendMessage(Text.literal("Something went horribly wrong with the treeaxe."), false);
                }
                HARVESTED_BLOCKS.remove(position);
            }
        }
        return true;
    }
}
