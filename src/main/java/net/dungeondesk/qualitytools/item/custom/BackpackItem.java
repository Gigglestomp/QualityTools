package net.dungeondesk.qualitytools.item.custom;

import net.dungeondesk.qualitytools.QualityTools;
import net.dungeondesk.qualitytools.block.custom.BackpackBlock;
import net.dungeondesk.qualitytools.block.entity.custom.BackpackBlockEntity;
import net.dungeondesk.qualitytools.screen.custom.BackpackScreenHandler;
import net.minecraft.block.Block;
import net.minecraft.component.ComponentType;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.component.type.NbtComponent;
import net.minecraft.component.type.TooltipDisplayComponent;
import net.minecraft.entity.mob.PiglinBrain;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.Inventories;
import net.minecraft.item.AxeItem;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.nbt.NbtList;
import net.minecraft.screen.NamedScreenHandlerFactory;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.world.World;

import java.util.Optional;
import java.util.function.Consumer;

public class BackpackItem extends BlockItem {

    public BackpackItem(Block block, Settings settings) {
        super(block, settings);
    }

    @Override
    public ActionResult place(ItemPlacementContext context) {
        //Player can place backpack by sneaking and using it on a block.
        PlayerEntity player = context.getPlayer();
        if(player.isSneaking() && player instanceof ServerPlayerEntity serverPlayer){
            serverPlayer.sendMessage(Text.literal("[Server] Block Item : place"), false);
            return super.place(context);
        }
        return ActionResult.PASS;
    }

    @Override
    public ActionResult use(World world, PlayerEntity user, Hand hand) {
        if(!user.isSneaking() && user instanceof ServerPlayerEntity serverPlayer){
            serverPlayer.sendMessage(Text.literal("[Server] Block Item : use"), false);
            return super.use(world, user, hand);
        }
        return ActionResult.PASS;
    }

}
