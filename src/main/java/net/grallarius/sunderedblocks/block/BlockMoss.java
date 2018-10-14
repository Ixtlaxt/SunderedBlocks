package net.grallarius.sunderedblocks.block;

import com.google.common.collect.Lists;
import net.minecraft.block.Block;
import net.minecraft.block.IGrowable;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.properties.PropertyInteger;
import net.minecraft.block.state.BlockFaceShape;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.IStringSerializable;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nullable;
import java.util.List;
import java.util.Random;

import static net.grallarius.sunderedblocks.SunderedBlocks.BLOCK_REGISTRY;

public class BlockMoss extends BlockBase {

    public static final PropertyBool UP    = PropertyBool.create("up");
    public static final PropertyBool DOWN  = PropertyBool.create("down");
    public static final PropertyBool NORTH = PropertyBool.create("north");
    public static final PropertyBool EAST  = PropertyBool.create("east");
    public static final PropertyBool SOUTH = PropertyBool.create("south");
    public static final PropertyBool WEST  = PropertyBool.create("west");
    public static final PropertyInteger MATURITY = PropertyInteger.create("maturity", 0, 4);

    protected static final AxisAlignedBB NORTH_AABB = new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 1.0D, 0.0625D);
    protected static final AxisAlignedBB EAST_AABB =  new AxisAlignedBB(0.9375D, 0.0D, 0.0D, 1.0D, 1.0D, 1.0D);
    protected static final AxisAlignedBB SOUTH_AABB = new AxisAlignedBB(0.0D, 0.0D, 0.9375D, 1.0D, 1.0D, 1.0D);
    protected static final AxisAlignedBB WEST_AABB =  new AxisAlignedBB(0.0D, 0.0D, 0.0D, 0.0625D, 1.0D, 1.0D);
    protected static final AxisAlignedBB UP_AABB =    new AxisAlignedBB(0.0D, 0.9375D, 0.0D, 1.0D, 1.0D, 1.0D);
    protected static final AxisAlignedBB DOWN_AABB =  new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.0625D, 1.0D);

    public BlockMoss(String name){
        super(Material.PLANTS, name);
        this.setLightLevel(0.1f);
        this.setTickRandomly(true);
        this.setDefaultState(this.blockState.getBaseState().withProperty(MATURITY,0));
    }

    @Override
    @Deprecated
    public IBlockState getActualState(IBlockState state, IBlockAccess world, BlockPos pos) {
        boolean up    = isFaceSolid(world, pos, EnumFacing.UP);
        boolean down  = isFaceSolid(world, pos, EnumFacing.DOWN);
        boolean north = isFaceSolid(world, pos, EnumFacing.NORTH);
        boolean east  = isFaceSolid(world, pos, EnumFacing.EAST);
        boolean south = isFaceSolid(world, pos, EnumFacing.SOUTH);
        boolean west  = isFaceSolid(world, pos, EnumFacing.WEST);

        return state.withProperty(UP, up).withProperty(DOWN, down).withProperty(NORTH, north).withProperty(EAST, east).withProperty(SOUTH, south).withProperty(WEST, west);
    }

    public boolean isFaceSolid(IBlockAccess world, BlockPos pos, EnumFacing facing){
        return world.getBlockState(pos.offset(facing)).getBlockFaceShape(world, pos, facing.getOpposite()) == BlockFaceShape.SOLID;
    }

    public boolean canPlaceBlockAt(World world, BlockPos pos){
        for (EnumFacing facing : EnumFacing.values()){
            if(isFaceSolid(world, pos, facing)) return true;
        }
        return false;
    }

    public void updateTick(World world, BlockPos pos, IBlockState state, Random rand){

        System.out.println("BlockMoss:updateTick - I'm ticking! " + pos);

        if (rand.nextInt(20) == 0)
        {
            int i = 5;

            for (BlockPos blockpos : BlockPos.getAllInBoxMutable(pos.add(-1, -1, -1), pos.add(1, 1, 1))){
                if (world.getBlockState(blockpos).getBlock() == this){
                    //System.out.println("BlockMoss:updateTick - found moss at: " + blockpos);
                    --i;
                    if (i <= 0){
                        //System.out.println("BlockMoss:updateTick - Too many moss.");
                        return;
                    }
                }
            }

            BlockPos blockpos1 = pos.add(rand.nextInt(2) -1, rand.nextInt(2) -1, rand.nextInt(2) -1);
            //System.out.println("BlockMoss:updateTick - attempting to add moss from " + pos + " to: " + blockpos1);

            for (int k = 0; k < 4; ++k){
                if (world.isAirBlock(blockpos1) && this.canPlaceBlockAt(world, blockpos1)){
                    //System.out.println("BlockMoss:updateTick - intermediate position selected: " + blockpos1);
                    pos = blockpos1;
                }
                blockpos1 = pos.add(rand.nextInt(2) -1, rand.nextInt(2) -1, rand.nextInt(2) -1);
            }

            if (world.getBlockState(blockpos1).getBlock() == this.getBlockState().getBlock()){
                IBlockState mossState = world.getBlockState(blockpos1);
                if(mossState.getValue(MATURITY) < 3) {
                    //System.out.println("BlockMoss:updateTick - maturing moss at: " + blockpos1);
                    world.setBlockState(blockpos1, mossState.withProperty(MATURITY, mossState.getValue(MATURITY) + 1));
                }
            }
            else if (world.isAirBlock(blockpos1) && this.canPlaceBlockAt(world, blockpos1)){
                //System.out.println("BlockMoss:updateTick - added moss to: " + blockpos1);
                world.setBlockState(blockpos1, this.getDefaultState());
            }
        }
    }

    public void neighborChanged(IBlockState state, World world, BlockPos pos, Block blockIn, BlockPos fromPos) {
        if (!canPlaceBlockAt(world, pos)) {
            world.setBlockToAir(pos);
            for (EnumFacing enumfacing : EnumFacing.values()) {
                world.notifyNeighborsOfStateChange(pos.offset(enumfacing), this,  false);
            }
        }
    }

    @Override
    @SideOnly(Side.CLIENT)
    public BlockRenderLayer getBlockLayer(){
        return BlockRenderLayer.CUTOUT_MIPPED;
    }

    @Override
    public void addCollisionBoxToList(IBlockState state, World worldIn, BlockPos pos, AxisAlignedBB entityBox, List<AxisAlignedBB> collidingBoxes, @Nullable Entity entityIn, boolean isActualState)    {
        if (!isActualState)
        {
            state = this.getActualState(state, worldIn, pos);
        }

        for (AxisAlignedBB axisalignedbb : getCollisionBoxList(state))
        {
            addCollisionBoxToList(pos, entityBox, collidingBoxes, axisalignedbb);
        }
    }


    /**
     * Simply returns a list of bounding boxes based on the collision box list
     */
    private static List<AxisAlignedBB> getCollisionBoxList(IBlockState state){
        List<AxisAlignedBB> list = Lists.<AxisAlignedBB>newArrayList();
        if(state.getValue(DOWN))  {list.add(DOWN_AABB);}
        if(state.getValue(NORTH)) {list.add(NORTH_AABB);}
        if(state.getValue(EAST))  {list.add(EAST_AABB);}
        if(state.getValue(SOUTH)) {list.add(SOUTH_AABB);}
        if(state.getValue(WEST))  {list.add(WEST_AABB);}
        if(state.getValue(UP))    {list.add(UP_AABB);}
        return list;
    }

    /**
     * Ray traces through the blocks collision from start vector to end vector returning a ray trace hit.
     * Makes it so the block is only selected when the cursor is pointing at a part of the block.
     */
    @Nullable
    public RayTraceResult collisionRayTrace(IBlockState blockState, World worldIn, BlockPos pos, Vec3d start, Vec3d end){
        List<RayTraceResult> list = Lists.<RayTraceResult>newArrayList();

        for (AxisAlignedBB axisalignedbb : getCollisionBoxList(this.getActualState(blockState, worldIn, pos)))
        {
            list.add(this.rayTrace(pos, start, end, axisalignedbb));
        }

        RayTraceResult raytraceresult1 = null;
        double d1 = 0.0D;

        for (RayTraceResult raytraceresult : list)
        {
            if (raytraceresult != null)
            {
                double d0 = raytraceresult.hitVec.squareDistanceTo(end);

                if (d0 > d1)
                {
                    raytraceresult1 = raytraceresult;
                    d1 = d0;
                }
            }
        }

        return raytraceresult1;
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
    public int getLightValue(IBlockState state){
        return state.getValue(MATURITY) * 2;
    }

    @Override
    public boolean isReplaceable(IBlockAccess blockAccess, BlockPos pos) {
        return true;
    }

    public int getMetaFromState(IBlockState state){
        return state.getValue(MATURITY);
    }

    @Override
    @Deprecated
    public IBlockState getStateFromMeta(int meta){
        return this.getDefaultState().withProperty(MATURITY, meta);
    }

    @Deprecated
    public BlockFaceShape getBlockFaceShape(IBlockAccess worldIn, IBlockState state, BlockPos pos, EnumFacing face)
    {
        return BlockFaceShape.UNDEFINED;
    }

    @Override
    protected BlockStateContainer createBlockState() {
        return new BlockStateContainer(this, new IProperty[] {UP, DOWN, NORTH, EAST, SOUTH, WEST, MATURITY});
    }

}
