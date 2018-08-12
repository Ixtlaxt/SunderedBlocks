package net.grallarius.sunderedblocks.block;

import com.google.common.collect.Lists;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
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

import static net.grallarius.sunderedblocks.SunderedBlocks.BLOCK_REGISTRY;

public class BlockPanel extends BlockBase {

    public static final PropertyEnum<EnumShape> SHAPE = PropertyEnum.create("shape", EnumShape.class);

    protected static final AxisAlignedBB NORTH_AABB = new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 1.0D, 0.125D);
    protected static final AxisAlignedBB EAST_AABB =  new AxisAlignedBB(0.875D, 0.0D, 0.0D, 1.0D, 1.0D, 1.0D);
    protected static final AxisAlignedBB SOUTH_AABB = new AxisAlignedBB(0.0D, 0.0D, 0.875D, 1.0D, 1.0D, 1.0D);
    protected static final AxisAlignedBB WEST_AABB =  new AxisAlignedBB(0.0D, 0.0D, 0.0D, 0.125D, 1.0D, 1.0D);
    protected static final AxisAlignedBB UP_AABB =    new AxisAlignedBB(0.0D, 0.875D, 0.0D, 1.0D, 1.0D, 1.0D);
    protected static final AxisAlignedBB DOWN_AABB =  new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.125D, 1.0D);

    public BlockPanel(String name) {
            super(Material.ROCK, name);
            this.setDefaultState(this.blockState.getBaseState().withProperty(SHAPE, EnumShape.NORTH));
        }

    public IBlockState getStateForPlacement(World worldIn, BlockPos pos, EnumFacing facing, float hitX, float hitY, float hitZ, int meta, EntityLivingBase placer)
    {
        System.out.println("BlockPanel: getStateForPlacement BlockPos pos - " + worldIn.getBlockState(pos).getBlock().getUnlocalizedName());
        return this.getDefaultState().withProperty(SHAPE, EnumShape.byMetadata(facing.getOpposite().getIndex()));
    }

    @Override
    public void breakBlock(World world, BlockPos pos, IBlockState state) {
        if(state.getValue(SHAPE).getMetadata() > 5) {
            EntityItem droppedItem = new EntityItem(world, pos.getX(), pos.getY(), pos.getZ(), getItem(world, pos, state));
            world.spawnEntity(droppedItem);
        }
        super.breakBlock(world, pos, state);
    }

    @Override
    public void addCollisionBoxToList(IBlockState state, World worldIn, BlockPos pos, AxisAlignedBB entityBox, List<AxisAlignedBB> collidingBoxes, @Nullable Entity entityIn, boolean isActualState)
    {
        if (!isActualState)
        {
            state = this.getActualState(state, worldIn, pos);
        }

        for (AxisAlignedBB axisalignedbb : getCollisionBoxList(state))
        {
            addCollisionBoxToList(pos, entityBox, collidingBoxes, axisalignedbb);
        }
    }

    private static List<AxisAlignedBB> getCollisionBoxList(IBlockState state)
    {
        //System.out.println("BlockPanel:getCollisionBoxList - called.");
        List<AxisAlignedBB> list = Lists.<AxisAlignedBB>newArrayList();

        String shape = state.getValue(SHAPE).getName();

        if(shape.equals("down")) { list.add(DOWN_AABB); }
        else if(shape.equals("north")) { list.add(NORTH_AABB); }
        else if(shape.equals("east"))  { list.add(EAST_AABB); }
        else if(shape.equals("south")) { list.add(SOUTH_AABB); }
        else if(shape.equals("west"))  { list.add(WEST_AABB); }
        else if(shape.equals("up"))    { list.add(UP_AABB); }
        else if(shape.equals("northwest"))  { list.add(NORTH_AABB); list.add(WEST_AABB); }
        else if(shape.equals("northeast"))  { list.add(NORTH_AABB); list.add(EAST_AABB); }
        else if(shape.equals("southeast"))  { list.add(SOUTH_AABB); list.add(EAST_AABB); }
        else if(shape.equals("southwest"))  { list.add(SOUTH_AABB); list.add(WEST_AABB); }
        else if(shape.equals("updown"))     { list.add(UP_AABB);    list.add(DOWN_AABB); }
        else if(shape.equals("northsouth")) { list.add(NORTH_AABB); list.add(SOUTH_AABB); }
        else if(shape.equals("eastwest"))   { list.add(WEST_AABB); list.add(EAST_AABB); }


        //System.out.println("BlockPanel:getCollisionBoxList - return list = " + list);
        return list;
    }

    /**
     * Ray traces through the blocks collision from start vector to end vector returning a ray trace hit.
     */
    @Nullable
    public RayTraceResult collisionRayTrace(IBlockState blockState, World worldIn, BlockPos pos, Vec3d start, Vec3d end)
    {
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
    protected BlockStateContainer createBlockState() {
        return new BlockStateContainer(this, new IProperty[] {SHAPE});
    }

    @Override
    @Deprecated
    public IBlockState getStateFromMeta(int meta) {
        return this.getDefaultState().withProperty(SHAPE, EnumShape.byMetadata(meta));
    }

    public int getMetaFromState(IBlockState state) {
        return state.getValue(SHAPE).getMetadata();
    }

    public void register() {
        BLOCK_REGISTRY.register(this);
    }

    public enum EnumShape implements IStringSerializable {

        DOWN(   0, "down"),
        UP(     1, "up"),
        NORTH(  2, "north"),
        SOUTH(  3, "south"),
        WEST(   4, "west"),
        EAST(   5, "east"),
        CORNNE( 6, "northeast"),
        CORNNW( 7, "northwest"),
        CORNSE( 8, "southeast"),
        CORNSW( 9, "southwest"),
        CHANNS(10, "northsouth"),
        CHANEW(11, "eastwest"),
        CHANUD(12, "updown");

        private final int meta;
        private final String name;
        private static final EnumShape[] LOOKUP = new EnumShape[values().length];

        EnumShape(int meta, String name) {
            this.meta = meta;
            this.name = name;
        }

        static {
            for(EnumShape shape : values()) {
                LOOKUP[shape.getMetadata()] = shape;
            }
        }

        public static EnumShape byMetadata(int meta) {
            if(meta < 0 || meta >= LOOKUP.length) {
                meta = 0;
            }
            return LOOKUP[meta];
        }

        public int getMetadata() {
            return this.meta;
        }

        public String toString() {
            return this.name;
        }

        public String getName() {
            return this.name;
        }

        public boolean isVert() {
            return this.meta >= 2 && this.meta <= 5;
        }

        public boolean isCorner() {
            return this.meta >= 6 && this.meta <= 9;
        }

        public boolean isChannel() {
            return this.meta >= 10 && this.meta <= 12;
        }

        public boolean isSingle() {
            return this.meta < 6;
        }

    }

}
