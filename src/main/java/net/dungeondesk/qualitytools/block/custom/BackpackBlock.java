package net.dungeondesk.qualitytools.block.custom;

import com.mojang.serialization.MapCodec;
import net.dungeondesk.qualitytools.block.entity.custom.BackpackBlockEntity;
import net.minecraft.block.*;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.EnumProperty;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import org.jetbrains.annotations.Nullable;

public class BackpackBlock extends HorizontalFacingBlock implements BlockEntityProvider {

    public static final MapCodec<BackpackBlock> CODEC = BackpackBlock.createCodec(BackpackBlock::new);

    public  BackpackBlock(Settings settings) {
        super(settings);
    }

    @Override
    protected MapCodec<? extends HorizontalFacingBlock> getCodec() {
        return CODEC;
    }

    @Override
    public @Nullable BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        return new BackpackBlockEntity(pos, state);
    }

    @Override
    public @Nullable BlockState getPlacementState(ItemPlacementContext ctx) {
        return this.getDefaultState().with(FACING, ctx.getHorizontalPlayerFacing().getOpposite());
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(FACING);
    }

    /*public static final EnumProperty<Direction> FACING =  EnumProperty.of("facing", Direction.class, Direction.Type.HORIZONTAL);

    private static final VoxelShape SHAPE = VoxelShapes.union(
            VoxelShapes.cuboid(0.25, 0.0625, 0.75, 0.375, 0.75, 0.8125),
            VoxelShapes.cuboid(0.125, 0, 0.3125, 0.875, 0.8125, 0.75),
            VoxelShapes.cuboid(0.1875, 0, 0.25, 0.8125, 0.6875, 0.375),
            VoxelShapes.cuboid(0.1875, 0, 0.1875, 0.8125, 0.3125, 0.25),
            VoxelShapes.cuboid(0.1875, 0.8125, 0.5, 0.8125, 0.9375, 0.6875),
            VoxelShapes.cuboid(0.1875, 0.8125, 0.4375, 0.8125, 0.875, 0.5),
            VoxelShapes.cuboid(0.0625, 0, 0.375, 0.125, 0.375, 0.6875),
            VoxelShapes.cuboid(0.875, 0, 0.375, 0.9375, 0.375, 0.6875),
            VoxelShapes.cuboid(0.625, 0.0625, 0.75, 0.75, 0.75, 0.8125)
    );

    public static final MapCodec<BackpackBlock> CODEC = BackpackBlock.createCodec(BackpackBlock::new);

    public BackpackBlock(Settings settings) {
        super(settings.strength(1.0f).solid());
    }

    @Override
    protected VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return SHAPE;
    }

    @Override
    protected MapCodec<? extends BlockWithEntity> getCodec() {
        return CODEC;
    }

    @Override
    public @Nullable BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        return new BackpackBlockEntity(pos, state);
    }

    @Override
    protected BlockRenderType getRenderType(BlockState state) {
        return BlockRenderType.MODEL;
    }*/

}
