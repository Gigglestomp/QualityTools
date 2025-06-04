package net.dungeondesk.qualitytools.item.custom;

import net.minecraft.block.BlockState;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.component.type.TooltipDisplayComponent;
import net.minecraft.item.AxeItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ToolMaterial;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.text.Text;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class TreeAxeItem extends AxeItem {
    private static List<BlockPos> absPosConfirmed;

    public TreeAxeItem(ToolMaterial material, float attackDamage, float attackSpeed, Settings settings) {
        super(material, attackDamage, attackSpeed, settings);
    }

    public static List<BlockPos> getBlocksToBeDestroyed(World world, BlockPos initalBlockPos, ServerPlayerEntity player) {
        absPosConfirmed = new ArrayList<BlockPos>();
        getNearbyTreeBlocks(world, initalBlockPos, player);
        return absPosConfirmed;
    }

    private static void getNearbyTreeBlocks(World world, BlockPos recBlockPos, ServerPlayerEntity player) {

        BlockState thisBlockState = world.getBlockState(recBlockPos);
        if (isTreeNode(thisBlockState) && !absPosConfirmed.contains(recBlockPos)) {
            absPosConfirmed.add(recBlockPos);
            for (int x = -1; x < 2; x++) {
                for (int y = -1; y < 2; y++) {
                    for (int z = -1; z < 2; z++) {
                        BlockPos kidPos = new BlockPos(recBlockPos.getX()+x, recBlockPos.getY()+y, recBlockPos.getZ()+z);
                        if(!absPosConfirmed.contains(kidPos)) {
                            getNearbyTreeBlocks(world, kidPos, player);
                        }

                    }
                }
            }
        }
    }

    private static boolean isTreeNode(BlockState node) {
        boolean isTreeNode = node.isIn(BlockTags.LOGS) || node.isIn(BlockTags.LEAVES);
        return isTreeNode;
    }

}
