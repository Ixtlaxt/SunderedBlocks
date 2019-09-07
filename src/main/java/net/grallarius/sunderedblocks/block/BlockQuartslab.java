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
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class BlockQuartslab extends Block implements IBucketPickupHandler, ILiquidContainer {

    public static final DirectionProperty FACING;
    public static final BooleanProperty TOP;
    public static final BooleanProperty NW;
    public static final BooleanProperty NE;
    public static final BooleanProperty SE;
    public static final BooleanProperty SW;
    public static final BooleanProperty WATERLOGGED;

    public static final VoxelShape NWD;
    public static final VoxelShape NWU;
    public static final VoxelShape NED;
    public static final VoxelShape NEU;
    public static final VoxelShape SED;
    public static final VoxelShape SEU;
    public static final VoxelShape SWD;
    public static final VoxelShape SWU;

    public BlockQuartslab(Properties props) {
        super(props);
        this.setDefaultState(this.getDefaultState().with(FACING, Direction.NORTH).with(TOP, false).with(NW, true).with(NE, true).with(WATERLOGGED, false));
    }

    protected void fillStateContainer(StateContainer.Builder<Block, BlockState> stateBuilder) {
        stateBuilder.add(new IProperty[]{FACING, TOP, NW, NE, SE, SW, WATERLOGGED});
    }

    private BlockState shapeState(IWorld world, BlockState state, BlockPos pos) {
        Boolean[] quarters = new Boolean[4];
        quarters[0] = true;
        quarters[1] = true;
        quarters[2] = false;
        quarters[3] = false;

        Direction facing = state.get(FACING);
        BlockState front = world.getBlockState(pos.offset(facing.getOpposite()));
        BlockState back = world.getBlockState(pos.offset(facing));
        if (front.getBlock() instanceof BlockQuartslab) {
            if (facing.getAxis() != front.get(FACING).getAxis() && state.get(TOP) == front.get(TOP)) {
                if (facing.rotateY() == front.get(FACING)) {
                    quarters[2] = true;
                }
                else {
                    quarters[3] = true;
                }
            }
        }
        else if (back.getBlock() instanceof BlockQuartslab) {
            if (facing.getAxis() != back.get(FACING).getAxis() && state.get(TOP) == back.get(TOP)) {
                if (facing.rotateY() == back.get(FACING)) {
                    quarters[0] = false;
                }
                else {
                    quarters[1] = false;
                }
            }
        }

        switch (facing) {
            case EAST:  return state.with(NW, quarters[3]).with(NE, quarters[0]).with(SE, quarters[1]).with(SW, quarters[2]);
            case SOUTH: return state.with(NW, quarters[2]).with(NE, quarters[3]).with(SE, quarters[0]).with(SW, quarters[1]);
            case WEST:  return state.with(NW, quarters[1]).with(NE, quarters[2]).with(SE, quarters[3]).with(SW, quarters[0]);
        }
        return state.with(NW, quarters[0]).with(NE, quarters[1]).with(SE, quarters[2]).with(SW, quarters[3]);
    }

    public VoxelShape getShape(BlockState state, IBlockReader reader, BlockPos pos, ISelectionContext context) {
        VoxelShape shape = Block.makeCuboidShape(0,0,0,0,0,0);
        if (state.get(TOP) == true) {
            if (state.get(NW)) {
                shape = VoxelShapes.or(shape, NWU);}
            if (state.get(NE)) {
                shape = VoxelShapes.or(shape, NEU);}
            if (state.get(SE)) {
                shape = VoxelShapes.or(shape, SEU);}
            if (state.get(SW)) {
                shape = VoxelShapes.or(shape, SWU);}
        }
        else {
            if (state.get(NW)) {
                shape = VoxelShapes.or(shape, NWD);}
            if (state.get(NE)) {
                shape = VoxelShapes.or(shape, NED);}
            if (state.get(SE)) {
                shape = VoxelShapes.or(shape, SED);}
            if (state.get(SW)) {
                shape = VoxelShapes.or(shape, SWD);}
        }

        return shape;
    }

    public BlockState getStateForPlacement(BlockItemUseContext context) {
        Direction direction = context.getFace();
        BlockPos blockpos = context.getPos();
        IFluidState fluidState = context.getWorld().getFluidState(blockpos);
        BlockState state = this.getDefaultState().with(FACING, context.getPlacementHorizontalFacing()).with(WATERLOGGED, fluidState.getFluid() == Fluids.WATER).with(TOP, direction == Direction.DOWN || direction != Direction.UP && context.getHitVec().y - (double)blockpos.getY() > 0.5D);
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
        WATERLOGGED = BlockStateProperties.WATERLOGGED;
        TOP = BooleanProperty.create("top");
        NW = BooleanProperty.create("northwest");
        NE = BooleanProperty.create("northeast");
        SE = BooleanProperty.create("southeast");
        SW = BooleanProperty.create("southwest");
        NWD = Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 8.0D, 8.0D, 8.0D);
        SWD = Block.makeCuboidShape(0.0D, 0.0D, 8.0D, 8.0D, 8.0D, 16.0D);
        NWU = Block.makeCuboidShape(0.0D, 8.0D, 0.0D, 8.0D, 16.0D, 8.0D);
        SWU = Block.makeCuboidShape(0.0D, 8.0D, 8.0D, 8.0D, 16.0D, 16.0D);
        NED = Block.makeCuboidShape(8.0D, 0.0D, 0.0D, 16.0D, 8.0D, 8.0D);
        SED = Block.makeCuboidShape(8.0D, 0.0D, 8.0D, 16.0D, 8.0D, 16.0D);
        NEU = Block.makeCuboidShape(8.0D, 8.0D, 0.0D, 16.0D, 16.0D, 8.0D);
        SEU = Block.makeCuboidShape(8.0D, 8.0D, 8.0D, 16.0D, 16.0D, 16.0D);
    }
}
