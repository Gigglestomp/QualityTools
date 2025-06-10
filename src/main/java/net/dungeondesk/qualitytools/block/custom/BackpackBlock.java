package net.dungeondesk.qualitytools.block.custom;

import com.mojang.serialization.MapCodec;
import net.dungeondesk.qualitytools.block.entity.custom.BackpackBlockEntity;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.BlockWithEntity;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.ItemEntity;
import net.minecraft.entity.mob.PiglinBrain;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.item.ItemStack;
import net.minecraft.loot.context.LootContextParameters;
import net.minecraft.loot.context.LootWorldContext;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.state.StateManager;
import net.minecraft.util.*;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

import static net.minecraft.block.HorizontalFacingBlock.FACING;


public class BackpackBlock extends BlockWithEntity {

    public static final MapCodec<BackpackBlock> CODEC = BackpackBlock.createCodec(BackpackBlock::new);

    public static final Identifier CONTENTS_DYNAMIC_DROP_ID = Identifier.ofVanilla("contents");

    public BackpackBlock(AbstractBlock.Settings settings) {
        super(settings);
        this.setDefaultState(this.stateManager.getDefaultState().with(FACING, Direction.NORTH));
    }

    @Override
    public MapCodec<BackpackBlock> getCodec() {
        return CODEC;
    }

    @Override
    public @Nullable BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        return new BackpackBlockEntity(pos, state);
    }

    @Override
    protected ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, BlockHitResult hit) {
        if (world instanceof ServerWorld serverWorld
                && world.getBlockEntity(pos) instanceof BackpackBlockEntity backpackBlockEntity) {
            player.openHandledScreen(backpackBlockEntity);
            PiglinBrain.onGuardedBlockInteracted(serverWorld, player, true);
        }

        return ActionResult.SUCCESS;
    }

    @Override
    public @Nullable BlockState getPlacementState(ItemPlacementContext ctx) {
        return this.getDefaultState().with(FACING, ctx.getHorizontalPlayerFacing().getOpposite());
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(FACING);
    }

    @Override
    public BlockState onBreak(World world, BlockPos pos, BlockState state, PlayerEntity player) {
        BlockEntity blockEntity = world.getBlockEntity(pos);
        if (blockEntity instanceof BackpackBlockEntity backpackBoxBlockEntity) {
            if (!world.isClient && player.shouldSkipBlockDrops() && !backpackBoxBlockEntity.isEmpty()) {
                ItemStack itemStack = state.getPickStack(world, pos, true);
                //ItemStack itemStack = new ItemStack(ModBlocks.BACKPACK);
                itemStack.applyComponentsFrom(blockEntity.createComponentMap());
                ItemEntity itemEntity = new ItemEntity(world, pos.getX() + 0.5, pos.getY() + 0.5, pos.getZ() + 0.5, itemStack);
                itemEntity.setToDefaultPickupDelay();
                world.spawnEntity(itemEntity);
            } else {
                backpackBoxBlockEntity.generateLoot(player);
            }
        }

        return super.onBreak(world, pos, state, player);
    }

    @Override
    protected List<ItemStack> getDroppedStacks(BlockState state, LootWorldContext.Builder builder) {
        BlockEntity blockEntity = builder.getOptional(LootContextParameters.BLOCK_ENTITY);
        if (blockEntity instanceof BackpackBlockEntity backpackBoxBlockEntity) {
            builder = builder.addDynamicDrop(CONTENTS_DYNAMIC_DROP_ID, lootConsumer -> {
                for (int i = 0; i < backpackBoxBlockEntity.size(); i++) {
                    lootConsumer.accept(backpackBoxBlockEntity.getStack(i));
                }
            });
        }

        return super.getDroppedStacks(state, builder);
    }

    @Override
    protected void onStateReplaced(BlockState state, ServerWorld world, BlockPos pos, boolean moved) {
        ItemScatterer.onStateReplaced(state, world, pos);
    }

    @Override
    protected BlockState rotate(BlockState state, BlockRotation rotation) {
        return state.with(FACING, rotation.rotate(state.get(FACING)));
    }

    @Override
    protected BlockState mirror(BlockState state, BlockMirror mirror) {
        return state.rotate(mirror.getRotation(state.get(FACING)));
    }

}
