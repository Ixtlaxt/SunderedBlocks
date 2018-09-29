package net.grallarius.sunderedblocks.block;

import net.grallarius.sunderedblocks.InvModel;
import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumHand;

import static net.grallarius.sunderedblocks.SunderedBlocks.ITEM_REGISTRY;

public class ItemBlockMoss extends ItemBlock {

    protected String name;

    public ItemBlockMoss(Block block){
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
}
