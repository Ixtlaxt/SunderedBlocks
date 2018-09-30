package net.grallarius.sunderedblocks.block;

import net.grallarius.sunderedblocks.InvModel;
import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.state.BlockFaceShape;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import static net.grallarius.sunderedblocks.SunderedBlocks.ITEM_REGISTRY;
import static net.grallarius.sunderedblocks.block.BlockPanel.SHAPE;

public class ItemBlockPanel extends ItemBlock {

    protected String name;

    public ItemBlockPanel(Block block) {

        super(block);
        setRegistryName(block.getRegistryName() + "_item");
        setUnlocalizedName(name);
    }

    public void register() {
        ITEM_REGISTRY.register(this);
        InvModel.add(this, name);
    }

    public void decrementHeldStack(EntityPlayer player, ItemStack stack, EnumHand hand) {
        if (!player.capabilities.isCreativeMode) {
            stack.shrink(1);
            if (stack.getCount() == 0) {
                player.setItemStackToSlot(
                        hand == EnumHand.MAIN_HAND ? EntityEquipmentSlot.MAINHAND : EntityEquipmentSlot.OFFHAND,
                        ItemStack.EMPTY);
            }
        }
    }

//    @Override
//    public int getMetadata(int damage) {
//        return damage;
//    }

    @Override
    public EnumActionResult onItemUse(EntityPlayer playerIn, World worldIn, BlockPos pos, EnumHand hand, EnumFacing side, float hitX, float hitY, float hitZ) {
        ItemStack stack = playerIn.getHeldItem(hand);
        if (stack.getCount() == 0) { return EnumActionResult.FAIL; }
        else if (!playerIn.canPlayerEdit(pos.offset(side), side, stack)) { return EnumActionResult.FAIL; }
        else {
            IBlockState iblockstate = worldIn.getBlockState(pos);
            System.out.println("onItemUse: block in blockstate - " + iblockstate.getBlock().getUnlocalizedName());

            if (iblockstate.getBlock() == getBlock()) {
                System.out.println("onItemUse: is panel");
                BlockPanel.EnumShape enumShape = iblockstate.getValue(SHAPE);

                if (enumShape.isSingle()) {
                    System.out.println("onItemUse: is single panel");
                    worldIn.setBlockState(pos, iblockstate.withProperty(SHAPE, genShape(iblockstate, side)), 2);
                    return EnumActionResult.SUCCESS;
                }
                else return EnumActionResult.FAIL;
            }

            System.out.println("onItemUse: else check, calling place.");
            return ( this.place(stack, worldIn, pos.offset(side), side) || (super.onItemUse(playerIn, worldIn, pos,
                    hand, side, hitX, hitY, hitZ) == EnumActionResult.SUCCESS ? true : false))
                    ? EnumActionResult.SUCCESS : EnumActionResult.FAIL;

        }
       // return EnumActionResult.FAIL;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public boolean canPlaceBlockOnSide(World worldIn, BlockPos pos, EnumFacing facing, EntityPlayer player, ItemStack itemstack) {
        BlockPos blockpos1 = pos;
        IBlockState iblockstate = worldIn.getBlockState(pos);
        System.out.println("canPlaceBlockOnSide: checking.");
        System.out.println("canPlaceBlockOnSide: blockstate - " + iblockstate.getBlock().getUnlocalizedName() + " item - " + getBlock().getUnlocalizedName());

        if (iblockstate.getBlock() == getBlock()) {
            System.out.println("canPlaceBlockOnSide: is panel.");
            if(iblockstate.getValue(BlockPanel.SHAPE).isSingle()) { System.out.println("canPlaceBlockOnSide: is single."); return true; }
        }

        pos = pos.offset(facing);
        IBlockState iblockstate1 = worldIn.getBlockState(pos);
        System.out.println("canPlaceBlockOnSide: checking offset.");
        return iblockstate1.getBlock() == getBlock() || super.canPlaceBlockOnSide(worldIn, blockpos1, facing, player, itemstack);
    }

    private int checksides(EnumFacing facing, BlockPanel.EnumShape shape) {
        EnumFacing panelfacing = EnumFacing.byName(shape.getName());
        if(facing.getAxis() != EnumFacing.Axis.Y && shape.isVert()) {
            if (facing.rotateY() == panelfacing) {
                System.out.println("checksides: left");
                return 1;
            } else if (facing.rotateYCCW() == panelfacing) {
                System.out.println("checksides: right");
                return 2;
            }
        }
        if (facing.getOpposite() == panelfacing) {
            System.out.println("checksides: opposite");
            return 3;
        }
        System.out.println("checksides, none found");
        return 0;
    }

    private boolean place(ItemStack itemStack, World worldIn, BlockPos pos, EnumFacing facing) {
        IBlockState iblockstate = worldIn.getBlockState(pos);
        System.out.println("place: called.");

        if (iblockstate.getBlock() == getBlock()) {
            System.out.println("place: block is panel.  Setting BlockState.");
            IBlockState iblockstate1 = this.block.getDefaultState().withProperty(SHAPE, genShape(iblockstate, facing));
            System.out.println("place: Blockstate set to - " + iblockstate1.getValue(SHAPE).getName());

            if (worldIn.checkNoEntityCollision(this.block.getBoundingBox(iblockstate1, worldIn, pos))
                    && worldIn.setBlockState(pos, iblockstate1, 3)) {
                System.out.println("place: able to place.  Placing block.");
                worldIn.playSound(pos.getX() + 0.5F, pos.getY() + 0.5F, pos.getZ() + 0.5F,
                        this.block.getSoundType().getPlaceSound(), SoundCategory.BLOCKS,
                        (this.block.getSoundType().getVolume() + 1.0F) / 2.0F,
                        this.block.getSoundType().getPitch() * 0.8F, true);
                itemStack.shrink(1);
            }

            return true;
        }

        return false;
    }

    private BlockPanel.EnumShape genShape(IBlockState blockState, EnumFacing facing){
        System.out.println("genShape: called.");
        int extra = checksides(facing.getOpposite(), blockState.getValue(SHAPE));
        BlockPanel.EnumShape shape = blockState.getValue(SHAPE);
        String dir = shape.getName();
        if (extra == 3) {
            switch (dir) {
                case "up":
                case "down":
                    shape = BlockPanel.EnumShape.CHANUD;
                    break;
                case "north":
                case "south":
                    shape = BlockPanel.EnumShape.CHANNS;
                    break;
                case "east":
                case "west":
                    shape = BlockPanel.EnumShape.CHANEW;
                    break;
            }
        }
        if (extra > 0 && extra < 3) {
            switch (dir) {
                case "north":
                    shape = extra == 1 ? BlockPanel.EnumShape.CORNNW : BlockPanel.EnumShape.CORNNE;
                    break;
                case "east":
                    shape = extra == 1 ? BlockPanel.EnumShape.CORNNE : BlockPanel.EnumShape.CORNSE;
                    break;
                case "south":
                    shape = extra == 1 ? BlockPanel.EnumShape.CORNSE : BlockPanel.EnumShape.CORNSW;
                    break;
                case "west":
                    shape = extra == 1 ? BlockPanel.EnumShape.CORNSW : BlockPanel.EnumShape.CORNNW;
                    break;
            }
        }
        System.out.println("genShape: generated - " + shape.getName());
        return shape;
    }
}
