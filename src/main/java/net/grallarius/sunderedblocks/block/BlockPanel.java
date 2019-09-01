package net.grallarius.sunderedblocks.block;

import net.minecraft.block.*;
import net.minecraft.fluid.Fluid;
import net.minecraft.fluid.Fluids;
import net.minecraft.fluid.IFluidState;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.state.BooleanProperty;
import net.minecraft.state.DirectionProperty;
import net.minecraft.state.IProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorld;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class BlockPanel extends Block implements IBucketPickupHandler, ILiquidContainer {

    public static final DirectionProperty FACING;

    public static final BooleanProperty DOUBLE;
    public static final BooleanProperty WATERLOGGED;

    public static final VoxelShape VXUP;
    public static final VoxelShape VXDOWN;
    public static final VoxelShape VXNORTH;
    public static final VoxelShape VXEAST;
    public static final VoxelShape VXSOUTH;
    public static final VoxelShape VXWEST;

    public BlockPanel(Properties properties) {
        super(properties);
        this.setDefaultState(this.getDefaultState().with(FACING, Direction.DOWN).with(WATERLOGGED, false).with(DOUBLE, false));
    }

    protected void fillStateContainer(StateContainer.Builder<Block, BlockState> stateBuilder) {
        stateBuilder.add(new IProperty[]{FACING, DOUBLE, WATERLOGGED});
    }


    @Override
    public BlockState getStateForPlacement(BlockItemUseContext context) {
        BlockPos blockpos = context.getPos();
        BlockState blockstate = context.getWorld().getBlockState(blockpos);
        if (blockstate.getBlock() == this) {
            return (BlockState) ((BlockState)blockstate.with(DOUBLE, true));
        }
        else {
            IFluidState fluidState = context.getWorld().getFluidState(blockpos);
            BlockState state = this.getDefaultState().with(FACING, context.getFace()).with(WATERLOGGED, fluidState.getFluid() == Fluids.WATER);
            return state;
        }
    }

    @Override
    public BlockState updatePostPlacement(BlockState stateIn, Direction facing, BlockState facingState, IWorld world, BlockPos currentPos, BlockPos facingPos) {
        if (stateIn.get(WATERLOGGED)) {
            world.getPendingFluidTicks().scheduleTick(currentPos, Fluids.WATER, Fluids.WATER.getTickRate(world));
        }
        return stateIn;
    }

    @Override
    public VoxelShape getShape(BlockState state, IBlockReader reader, BlockPos pos, ISelectionContext context) {
        VoxelShape shape = Block.makeCuboidShape(0,0,0,0,0,0);
        Direction face = state.get(FACING);
        if (face == Direction.UP) {
            shape = VoxelShapes.or(shape, VXUP);
            if(state.get(DOUBLE)){shape = VoxelShapes.or(shape, VXDOWN);}}
        else if (face == Direction.DOWN) {
            shape = VoxelShapes.or(shape, VXDOWN);
            if(state.get(DOUBLE)){shape = VoxelShapes.or(shape, VXUP);}}
        else if (face == Direction.NORTH) {
            shape = VoxelShapes.or(shape, VXNORTH);
            if(state.get(DOUBLE)){shape = VoxelShapes.or(shape, VXSOUTH);}}
        else if (face == Direction.EAST) {
            shape = VoxelShapes.or(shape, VXEAST);
            if(state.get(DOUBLE)){shape = VoxelShapes.or(shape, VXWEST);}}
        else if (face == Direction.SOUTH) {
            shape = VoxelShapes.or(shape, VXSOUTH);
            if(state.get(DOUBLE)){shape = VoxelShapes.or(shape, VXNORTH);}}
        else if (face == Direction.WEST) {
            shape = VoxelShapes.or(shape, VXWEST);
            if(state.get(DOUBLE)){shape = VoxelShapes.or(shape, VXWEST);}}
        return shape;
    }

    public Fluid pickupFluid(IWorld world, BlockPos pos, BlockState state) {
        if (state.get(WATERLOGGED)) {
            world.setBlockState(pos, state.with(WATERLOGGED, false), 3);
            return Fluids.WATER;
        } else {
            return Fluids.EMPTY;
        }
    }

    public IFluidState getFluidState(BlockState state) {
        return state.get(WATERLOGGED) ? Fluids.WATER.getStillFluidState(false) : super.getFluidState(state);
    }

    public boolean canContainFluid(IBlockReader reader, BlockPos pos, BlockState state, Fluid fluid) {
        return !state.get(WATERLOGGED) && fluid == Fluids.WATER;
    }

    public boolean receiveFluid(IWorld world, BlockPos pos, BlockState blockState, IFluidState fluidState) {
        if (!blockState.get(WATERLOGGED) && fluidState.getFluid() == Fluids.WATER) {
            if (!world.isRemote()) {
                world.setBlockState(pos, blockState.with(WATERLOGGED, true), 3);
                world.getPendingFluidTicks().scheduleTick(pos, fluidState.getFluid(), fluidState.getFluid().getTickRate(world));
            }
            return true;
        } else {
            return false;
        }
    }

    @Override
    @OnlyIn(Dist.CLIENT)
    public BlockRenderLayer getRenderLayer(){
        return BlockRenderLayer.CUTOUT_MIPPED;
    }

    static {
        FACING = DirectionalBlock.FACING;

        DOUBLE = BooleanProperty.create("double");
        WATERLOGGED = BlockStateProperties.WATERLOGGED;

        VXDOWN = Block.makeCuboidShape(0, 14, 0, 16, 16, 16);
        VXUP = Block.makeCuboidShape(0, 0, 0, 16, 2, 16);
        VXSOUTH = Block.makeCuboidShape(0, 0, 0, 16, 16, 2);
        VXWEST = Block.makeCuboidShape(14, 0, 0, 16, 16, 16);
        VXNORTH = Block.makeCuboidShape(0, 0, 14, 16, 16, 16);
        VXEAST = Block.makeCuboidShape(0, 0, 0, 2, 16, 16);

    }


}
