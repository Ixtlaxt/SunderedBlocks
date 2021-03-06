package net.grallarius.sunderedblocks.block.workbench;

import net.grallarius.sunderedblocks.ModGuiHandler;
import net.grallarius.sunderedblocks.SunderedBlocks;
import net.grallarius.sunderedblocks.block.BlockTileEntity;
import net.minecraft.block.BlockHorizontal;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.items.IItemHandler;
import org.lwjgl.Sys;

import javax.annotation.Nullable;

public class BlockWorkbench extends BlockTileEntity<TileEntityWorkbench> {

    protected static final AxisAlignedBB NBOUNDBOX = new AxisAlignedBB(0.0D, 0.0D,0.0D,2.0D,2.0D,1.0D);
    protected static final AxisAlignedBB EBOUNDBOX = new AxisAlignedBB(0.0D, 0.0D,0.0D,1.0D,2.0D,2.0D);
    protected static final AxisAlignedBB SBOUNDBOX = new AxisAlignedBB(-1.0D, 0.0D,0.0D,1.0D,2.0D,1.0D);
    protected static final AxisAlignedBB WBOUNDBOX = new AxisAlignedBB(0.0D, 0.0D,-1.0D,1.0D,2.0D,1.0D);


    public static final PropertyDirection FACING = BlockHorizontal.FACING;

    public static final PropertyBool HASSAW = PropertyBool.create("hassaw");
    public static final PropertyBool HASHAMMER = PropertyBool.create("hashammer");
    public static final PropertyBool HASCHISEL = PropertyBool.create("haschisel");
    public static final PropertyBool HASWRENCH = PropertyBool.create("haswrench");


    public BlockWorkbench(String name){
        super(Material.WOOD, name);
        this.setDefaultState(this.blockState.getBaseState().withProperty(FACING, EnumFacing.NORTH).withProperty(HASSAW, false).withProperty(HASHAMMER, false).withProperty(HASCHISEL, false).withProperty(HASWRENCH, false));
    }

    @Override
    @Deprecated
    public IBlockState getStateForPlacement(World worldIn, BlockPos pos, EnumFacing facing, float hitX, float hitY, float hitZ, int meta, EntityLivingBase placer) {

        TileEntityWorkbench te = getTileEntity(worldIn, pos);
        System.out.println("does my te have an inventory? maybe not");

        return this.getDefaultState().withProperty(FACING, placer.getHorizontalFacing());
    }

    @Override
    @Deprecated
    public IBlockState getActualState(IBlockState state, IBlockAccess worldIn, BlockPos pos)
    {
        TileEntityWorkbench te = getTileEntity(worldIn, pos);

        return state.withProperty(HASSAW, !te.inventory.getStackInSlot(1).isEmpty())
                .withProperty(HASCHISEL, !te.inventory.getStackInSlot(2).isEmpty())
                .withProperty(HASHAMMER, !te.inventory.getStackInSlot(3).isEmpty())
                .withProperty(HASWRENCH,  !te.inventory.getStackInSlot(4).isEmpty());
    }

    @Override
    public boolean onBlockActivated(World world, BlockPos pos, IBlockState state, EntityPlayer player, EnumHand hand, EnumFacing side, float hitX, float hitY, float hitZ) {
        if (!world.isRemote) {
            TileEntityWorkbench te = getTileEntity(world, pos);
/*            IItemHandler itemHandler = te.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, side);*/

            if (!player.isSneaking()) {
                player.openGui(SunderedBlocks.instance, ModGuiHandler.WORKBENCH, world, pos.getX(), pos.getY(), pos.getZ());
                te.markDirty();
            } else {
                return false;
            }
        }
        return true;
    }

    @Override
    public void breakBlock(World world, BlockPos pos, IBlockState state) {
        TileEntityWorkbench tile = getTileEntity(world, pos);
        IItemHandler itemHandler = tile.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, EnumFacing.NORTH);
        if (itemHandler != null) {
            ItemStack stack1 = itemHandler.getStackInSlot(0);
            ItemStack stack2 = itemHandler.getStackInSlot(1);
            ItemStack stack3 = itemHandler.getStackInSlot(2);
            ItemStack stack4 = itemHandler.getStackInSlot(3);
            ItemStack stack5 = itemHandler.getStackInSlot(4);
            if (!stack1.isEmpty()) {
                EntityItem item1 = new EntityItem(world, pos.getX(), pos.getY(), pos.getZ(), stack1);
                world.spawnEntity(item1);
            }
            if (!stack2.isEmpty()) {
                EntityItem item2 = new EntityItem(world, pos.getX(), pos.getY(), pos.getZ(), stack2);
                world.spawnEntity(item2);
            }
            if (!stack1.isEmpty()) {
                EntityItem item = new EntityItem(world, pos.getX(), pos.getY(), pos.getZ(), stack3);
                world.spawnEntity(item);
            }
            if (!stack2.isEmpty()) {
                EntityItem item = new EntityItem(world, pos.getX(), pos.getY(), pos.getZ(), stack4);
                world.spawnEntity(item);
            }
            if (!stack2.isEmpty()) {
                EntityItem item = new EntityItem(world, pos.getX(), pos.getY(), pos.getZ(), stack5);
                world.spawnEntity(item);
            }
        }
        super.breakBlock(world, pos, state);
    }

    @Override
    public Class<TileEntityWorkbench> getTileEntityClass() {
        return TileEntityWorkbench.class;
    }

    @Nullable
    @Override
    public TileEntityWorkbench createTileEntity(World world, IBlockState state) {
        return new TileEntityWorkbench();
    }
    
    @Override
    protected BlockStateContainer createBlockState() {
        return new BlockStateContainer(this, new IProperty[] {FACING, HASSAW, HASCHISEL, HASHAMMER, HASWRENCH});
    }

    @Override
    @Deprecated
    public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {

        switch ((EnumFacing)state.getValue(FACING))
        {
            case NORTH:
                return NBOUNDBOX;
            case SOUTH:
                return SBOUNDBOX;
            case WEST:
                return WBOUNDBOX;
            case EAST:
            default:
                return EBOUNDBOX;
        } }

    @Override
    @Deprecated
    public IBlockState getStateFromMeta(int meta) {
        return this.getDefaultState().withProperty(FACING, EnumFacing.getFront(meta));
    }

    public int getMetaFromState(IBlockState state) {
        return state.getValue(FACING).getIndex();
    }


    }
