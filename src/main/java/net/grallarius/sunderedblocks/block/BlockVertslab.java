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

public class BlockVertslab extends Block implements IBucketPickupHandler, ILiquidContainer{

    public static final DirectionProperty FACING;
    public static final BooleanProperty NW;
    public static final BooleanProperty NE;
    public static final BooleanProperty SE;
    public static final BooleanProperty SW;
    public static final BooleanProperty WATERLOGGED;
    public static final VoxelShape VXNW;
    public static final VoxelShape VXNE;
    public static final VoxelShape VXSE;
    public static final VoxelShape VXSW;


    public BlockVertslab(Properties properties) {
        super(properties);
        this.setDefaultState(this.getDefaultState().with(FACING, Direction.NORTH).with(NW, true).with(NE, true).with(WATERLOGGED, false));
    }

    protected void fillStateContainer(StateContainer.Builder<Block, BlockState> stateBuilder) {
        stateBuilder.add(new IProperty[]{FACING, NW, NE, SE, SW, WATERLOGGED});
    }

    private BlockState shapeState(IWorld world, BlockState state, BlockPos pos) {

        boolean ul = true;
        boolean ur = true;
        boolean ll = false;
        boolean lr = false;

        Direction facing = state.get(FACING);
        BlockState front = world.getBlockState(pos.offset(facing.getOpposite()));
        BlockState back = world.getBlockState(pos.offset(facing));
        if (front.getBlock() instanceof BlockVertslab && facing.getAxis() != front.get(FACING).getAxis()) {
            if (facing.rotateY() == front.get(FACING)) {
                lr = true;
            }
            else {
                ll = true;
            }
        }
        else if (back.getBlock() instanceof BlockVertslab && facing.getAxis() != back.get(FACING).getAxis()) {
            if (facing.rotateY() == back.get(FACING)) {
                ul = false;
            }
            else {
                ur = false;
            }
        }

        switch (facing) {
            case EAST:  return state.with(NW, ll).with(NE, ul).with(SE, ur).with(SW, lr);
            case SOUTH: return state.with(NW, lr).with(NE, ll).with(SE, ul).with(SW, ur);
            case WEST:  return state.with(NW, ur).with(NE, lr).with(SE, ll).with(SW, ul);
        }
        return state.with(NW, ul).with(NE, ur).with(SE, lr).with(SW, ll);
    }

    @Override
    public BlockState getStateForPlacement(BlockItemUseContext context) {
        IFluidState fluidState = context.getWorld().getFluidState(context.getPos());
        BlockState state = this.getDefaultState().with(FACING, context.getPlacementHorizontalFacing()).with(WATERLOGGED, fluidState.getFluid() == Fluids.WATER);
        return shapeState(context.getWorld(), state, context.getPos());
}

    @Override
    public BlockState updatePostPlacement(BlockState stateIn, Direction facing, BlockState facingState, IWorld world, BlockPos currentPos, BlockPos facingPos) {
        if (stateIn.get(WATERLOGGED)) {
            world.getPendingFluidTicks().scheduleTick(currentPos, Fluids.WATER, Fluids.WATER.getTickRate(world));
        }
        BlockState state = this.shapeState(world, stateIn, currentPos);
        return state;
    }

    public VoxelShape getShape(BlockState state, IBlockReader reader, BlockPos pos, ISelectionContext context) {
        VoxelShape shape = Block.makeCuboidShape(0,0,0,0,0,0);
        if (state.get(NW)) {
            shape = VoxelShapes.or(shape, VXNW);}
        if (state.get(NE)) {
            shape = VoxelShapes.or(shape, VXNE);}
        if (state.get(SE)) {
            shape = VoxelShapes.or(shape, VXSE);}
        if (state.get(SW)) {
            shape = VoxelShapes.or(shape, VXSW);}
        return shape;
    }

//    @Override
//    public boolean isFullCube(IBlockState state) {
//        return false;
//    }

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
        FACING = HorizontalBlock.HORIZONTAL_FACING;
        NW = BooleanProperty.create("northwest");
        NE = BooleanProperty.create("northeast");
        SE = BooleanProperty.create("southeast");
        SW = BooleanProperty.create("southwest");
        WATERLOGGED = BlockStateProperties.WATERLOGGED;
        VXNW = Block.makeCuboidShape(0,0,0,8,16,8);
        VXNE = Block.makeCuboidShape(8,0,0,16,16,8);
        VXSE = Block.makeCuboidShape(8,0,8,16,16,16);
        VXSW = Block.makeCuboidShape(0,0,8,8,16,16);

    }
}
