package net.grallarius.sunderedblocks.block;

import com.ibm.icu.lang.UCharacter;
import net.minecraft.block.BlockHorizontal;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nullable;

public class ClothesLine extends BlockBase {

    public static final PropertyBool EASTWEST = PropertyBool.create("eastwest");

    protected static final AxisAlignedBB EASTWEST_AABB = new AxisAlignedBB(0.4D, 0.0D, 0.0D, 0.6D, 1.0D, 1.0D);
    protected static final AxisAlignedBB NORTHSOUTH_AABB =   new AxisAlignedBB(0.0D, 0.0D, 0.4D, 1.0D, 1.0D, 0.6D);


    public ClothesLine() {
        super(Material.CLOTH, "clothesline");

    }

    @Override
    public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {
        if(state.getValue(EASTWEST) == true) {
            return EASTWEST_AABB;
        }
        else {
            return NORTHSOUTH_AABB;
        }
    }

    @Nullable
    public AxisAlignedBB getCollisionBoundingBox(IBlockState blockState, IBlockAccess worldIn, BlockPos pos) {
        return NULL_AABB;
    }

    protected BlockStateContainer createBlockState() {
        return new BlockStateContainer(this, new IProperty[] {EASTWEST});
    }

    @Override
    @Deprecated
    public IBlockState getStateForPlacement(World worldIn, BlockPos pos, EnumFacing facing, float hitX, float hitY, float hitZ, int meta, EntityLivingBase placer)
    {
        if(placer.getHorizontalFacing().getAxis() == EnumFacing.Axis.Z) {
            return this.getDefaultState().withProperty(EASTWEST, true);
        }
        else {
            return this.getDefaultState().withProperty(EASTWEST, false);
        }
    }

    @Override
    public IBlockState getStateFromMeta(int meta) {
        if(meta == 1) {
            return this.getDefaultState().withProperty(EASTWEST, true);
        }
        else {
            return this.getDefaultState().withProperty(EASTWEST, false);
        }
    }

    public int getMetaFromState(IBlockState state) {
        if(state.getValue(EASTWEST) == true) {
            return 1;
        }
        else {
            return 0;
        }
    }

    @Override
    public boolean isOpaqueCube(IBlockState state) {
        return false;
    }

    @Override
    public boolean isFullCube(IBlockState state) {
        return false;
    }

    @Override public boolean isLadder(IBlockState state, IBlockAccess world, BlockPos pos, EntityLivingBase entity){
        return true;
    }

    @SideOnly(Side.CLIENT)
    public BlockRenderLayer getBlockLayer()
    {
        return BlockRenderLayer.CUTOUT;
    }

}