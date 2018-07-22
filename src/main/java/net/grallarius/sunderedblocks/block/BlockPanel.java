package net.grallarius.sunderedblocks.block;

import com.ibm.icu.lang.UProperty;
import jdk.management.resource.internal.inst.SocketOutputStreamRMHooks;
import net.minecraft.block.BlockLog;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.IStringSerializable;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockPanel extends BlockBase {

    public static final PropertyEnum<EnumFaceShape> FACESHAPE = PropertyEnum.create("faceshape", EnumFaceShape.class);

    protected static final AxisAlignedBB NORTH_AABB = new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 1.0D, 0.125D);
    protected static final AxisAlignedBB EAST_AABB =  new AxisAlignedBB(0.875D, 0.0D, 0.0D, 1.0D, 1.0D, 1.0D);
    protected static final AxisAlignedBB SOUTH_AABB = new AxisAlignedBB(0.0D, 0.0D, 0.875D, 1.0D, 1.0D, 1.0D);
    protected static final AxisAlignedBB WEST_AABB =  new AxisAlignedBB(0.0D, 0.0D, 0.0D, 0.125D, 1.0D, 1.0D);
    protected static final AxisAlignedBB UP_AABB =    new AxisAlignedBB(0.0D, 0.875D, 0.0D, 1.0D, 1.0D, 1.0D);
    protected static final AxisAlignedBB DOWN_AABB =  new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.125D, 1.0D);


    public BlockPanel(String name) {
            super(Material.ROCK, name);
            this.setDefaultState(this.blockState.getBaseState().withProperty(FACESHAPE, EnumFaceShape.DOWN));
        }

    public IBlockState getStateForPlacement(World worldIn, BlockPos pos, EnumFacing facing, float hitX, float hitY, float hitZ, int meta, EntityLivingBase placer)
    {
                EnumFacing side = facing.getOpposite();
                System.out.println(side);
                return this.getDefaultState();
    }


//    public void onBlockPlacedBy(World worldIn, BlockPos pos, IBlockState state, EntityLivingBase placer, ItemStack stack) {
//        worldIn.setBlockState(pos, state.withProperty(FACING, placer.getHorizontalFacing()), 2);
//    }

    @Override
    @Deprecated
    public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {

            if (FACESHAPE.getName() == "east")       { return EAST_AABB; }
            else if (FACESHAPE.getName() == "south") { return SOUTH_AABB; }
            else if (FACESHAPE.getName() == "west")  { return WEST_AABB; }
            else if (FACESHAPE.getName() == "north") { return NORTH_AABB; }
            else if (FACESHAPE.getName() == "up")    { return UP_AABB; }
            else                                     { return DOWN_AABB; }
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
        return new BlockStateContainer(this, new IProperty[] {FACESHAPE});
    }

    @Override
    @Deprecated
    public IBlockState getStateFromMeta(int meta) {
        return this.getDefaultState().withProperty(FACESHAPE, EnumFaceShape.byIndex(meta));
    }

    public int getMetaFromState(IBlockState state) {
        return state.getValue(FACESHAPE).getIndex();
    }

    public enum  EnumFaceShape implements IStringSerializable {

            DOWN(0, "down"),
            UP(1, "up"),
            NORTH(2, "north"),
            SOUTH(3, "south"),
            WEST(4, "west"),
            EAST(5, "east");

            private final int index;
            private final String name;

            EnumFaceShape(int index, String name) {
                this.index = index;
                this.name = name;
            }

            public String toString() {
                return this.name;
            }

            public int getIndex() { return this.index; }

            public static EnumFaceShape byIndex(int index) {
                switch (index) {
                    case 0:
                        return EnumFaceShape.DOWN;
                    case 1:
                        return EnumFaceShape.UP;
                    case 2:
                        return EnumFaceShape.NORTH;
                    case 3:
                        return EnumFaceShape.SOUTH;
                    case 4:
                        return EnumFaceShape.WEST;
                    default:
                        return EnumFaceShape.EAST;

                }
            }

            @Override
            public String getName() { return this.name; }
    }
}
