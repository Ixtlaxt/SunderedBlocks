package net.grallarius.sunderedblocks.block;

import com.google.common.collect.Lists;
import net.minecraft.block.BlockHorizontal;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.IStringSerializable;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.List;

public class BlockVertslab extends BlockBase{

    public static final PropertyDirection FACING = BlockHorizontal.FACING;
    public static final PropertyEnum<EnumShape> SHAPE = PropertyEnum.create("shape", EnumShape.class);

    protected static final AxisAlignedBB NORTH_AABB = new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 1.0D, 0.5D);
    protected static final AxisAlignedBB EAST_AABB =  new AxisAlignedBB(0.5D, 0.0D, 0.0D, 1.0D, 1.0D, 1.0D);
    protected static final AxisAlignedBB SOUTH_AABB = new AxisAlignedBB(0.0D, 0.0D, 0.5D, 1.0D, 1.0D, 1.0D);
    protected static final AxisAlignedBB WEST_AABB =  new AxisAlignedBB(0.0D, 0.0D, 0.0D, 0.5D, 1.0D, 1.0D);


    protected static final AxisAlignedBB NORTHWEST_AABB = new AxisAlignedBB(0.0D, 0.0D, 0.0D, 0.5D, 1.0D, 0.5D);
    protected static final AxisAlignedBB NORTHEAST_AABB = new AxisAlignedBB(0.5D, 0.0D, 0.0D, 1.0D, 1.0D, 0.5D);
    protected static final AxisAlignedBB SOUTHWEST_AABB = new AxisAlignedBB(0.0D, 0.0D, 0.5D, 0.5D, 1.0D, 1.0D);
    protected static final AxisAlignedBB SOUTHEAST_AABB = new AxisAlignedBB(0.5D, 0.0D, 0.5D, 1.0D, 1.0D, 1.0D);


    public BlockVertslab(String name) {
        super(Material.ROCK, name);
        this.setDefaultState(this.blockState.getBaseState().withProperty(FACING, EnumFacing.NORTH));
    }

    @Override
    public IBlockState getActualState(IBlockState state, IBlockAccess world, BlockPos pos) {

        EnumShape shape = getShape(state, world, pos);
        return state.withProperty(SHAPE, shape);
    }

    public static EnumShape getShape(IBlockState state, IBlockAccess world, BlockPos pos) {

        IBlockState front = world.getBlockState(pos.offset(state.getValue(FACING).getOpposite()));

        if (front.getBlock() instanceof BlockVertslab && (state.getValue(FACING).getAxis() != front.getValue(FACING).getAxis())) {
            if (state.getValue(FACING).rotateY()  == front.getValue(FACING)) {
                return EnumShape.CORNERFLIP;
            }
            return EnumShape.CORNER;
        }

        IBlockState back = world.getBlockState(pos.offset(state.getValue(FACING)));

        if (back.getBlock() instanceof BlockVertslab && (state.getValue(FACING).getAxis() != back.getValue(FACING).getAxis())) {
            if (state.getValue(FACING).rotateY()  == back.getValue(FACING)) {
                return EnumShape.EDGEFLIP;
            }
            return EnumShape.EDGE;
        }
        return EnumShape.SLAB;
    }

    public IBlockState getStateForPlacement(World worldIn, BlockPos pos, EnumFacing facing, float hitX, float hitY, float hitZ, int meta, EntityLivingBase placer) {
        return this.getDefaultState().withProperty(FACING, placer.getHorizontalFacing().getOpposite());
    }

    public void onBlockPlacedBy(World worldIn, BlockPos pos, IBlockState state, EntityLivingBase placer, ItemStack stack) {
        worldIn.setBlockState(pos, state.withProperty(FACING, placer.getHorizontalFacing()), 2);
    }

    @Override
    public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {

        if(state.getValue(SHAPE) == EnumShape.EDGE) {
            switch (state.getValue(FACING)) {
                case EAST:
                    return NORTHEAST_AABB;
                case SOUTH:
                    return SOUTHEAST_AABB;
                case WEST:
                    return SOUTHWEST_AABB;
                case NORTH:
                default:
                    return NORTHWEST_AABB;
            }
        }
        else if(state.getValue(SHAPE) == EnumShape.EDGEFLIP) {
            switch (state.getValue(FACING)) {
                case EAST:
                    return SOUTHEAST_AABB;
                case SOUTH:
                    return SOUTHWEST_AABB;
                case WEST:
                    return NORTHWEST_AABB;
                case NORTH:
                default:
                    return NORTHEAST_AABB;
            }
        }
        else {
            switch (state.getValue(FACING)) {
                case EAST:
                    return EAST_AABB;
                case SOUTH:
                    return SOUTH_AABB;
                case WEST:
                    return WEST_AABB;
                case NORTH:
                default:
                    return NORTH_AABB;
            }
        }
    }

    @Override
    public void addCollisionBoxToList(IBlockState state, World worldIn, BlockPos pos, AxisAlignedBB entityBox, List<AxisAlignedBB> collidingBoxes, @Nullable Entity entityIn, boolean isActualState) {
        if (!isActualState) {
            state = this.getActualState(state, worldIn, pos);
        }
        for (AxisAlignedBB axisalignedbb : getCollisionBoxList(state)) {
            super.addCollisionBoxToList(pos, entityBox, collidingBoxes, axisalignedbb);
        }
    }

    private static List<AxisAlignedBB> getCollisionBoxList(IBlockState state) {
        List<AxisAlignedBB> list = Lists.newArrayList();
        EnumShape shape = state.getValue(SHAPE);


        if(shape != EnumShape.EDGE || shape != EnumShape.EDGEFLIP) {
            list.add(getSlabBB(state));
        }
        if(shape != EnumShape.SLAB) {
            list.add(getCornerBB(state));
        }

        return list;
    }

    private static AxisAlignedBB getCornerBB(IBlockState state) {
        EnumFacing facing;
        switch(state.getValue(SHAPE)) {
            case EDGEFLIP:
            case CORNERFLIP:
                facing = state.getValue(FACING).rotateY();
                break;
            case CORNER:
                facing = state.getValue(FACING).rotateYCCW();
                break;
            case EDGE:
            default:
                facing = state.getValue(FACING);
        }

        switch(facing) {
            case NORTH:
            default:
                return NORTHWEST_AABB;
            case EAST:
                return NORTHEAST_AABB;
            case SOUTH:
                return SOUTHEAST_AABB;
            case WEST:
                return SOUTHWEST_AABB;
        }
    }

    private static AxisAlignedBB getSlabBB(IBlockState state) {
        switch(state.getValue(FACING)){
            case EAST:
                return EAST_AABB;
            case SOUTH:
                return SOUTH_AABB;
            case WEST:
                return WEST_AABB;
            case NORTH:
            default:
                return NORTH_AABB;
        }
    }

    @Override
    @Deprecated
    public boolean isOpaqueCube(IBlockState state) {
        return false;
    }

    @Override
    @Deprecated
    public boolean isFullCube(IBlockState state) {
        return false;
    }

    @Override
    @Deprecated
    public boolean isFullBlock(IBlockState state) {
        return false;
    }

    @Override
    protected BlockStateContainer createBlockState() {
        return new BlockStateContainer(this, new IProperty[] {FACING, SHAPE});
    }

    @Override
    public IBlockState getStateFromMeta(int meta) {
        return this.getDefaultState().withProperty(FACING, EnumFacing.getFront(meta));
    }

    public int getMetaFromState(IBlockState state) {
        return state.getValue(FACING).getIndex();
    }

    public enum EnumShape implements IStringSerializable {

        SLAB("slab"),
        CORNER("corner"),
        CORNERFLIP("cornerflip"),
        EDGE("edge"),
        EDGEFLIP("edgeflip");

        private final String name;

        EnumShape(String name) {
            this.name = name;
        }

        public String toString() {
            return this.name;
        }

        @Override
        public String getName() {
            return this.name;
        }
    }

}
