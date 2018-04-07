package net.grallarius.sunderedblocks.item;

import net.grallarius.sunderedblocks.block.BlockCrate;
import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;

public class ItemBlockCrate extends ItemBlockMeta {

    public ItemBlockCrate(Block block) {
        super(block);
    }

    // add variant name to base block name
    public String getUnlocalizedName(ItemStack stack) {
//        System.out.println("ItemBlockCrate: " + super.getUnlocalizedName(stack) + "." + BlockCrate.EnumGood.byMetadata(stack.getMetadata()));
        return super.getUnlocalizedName(stack) + "." + BlockCrate.EnumGood.byMetadata(stack.getMetadata());
    }
}
