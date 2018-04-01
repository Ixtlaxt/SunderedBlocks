package net.grallarius.sunderedblocks.blocks;

import net.grallarius.sunderedblocks.SunderedBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockBase extends Block {

    protected String name;

    public BlockBase(Material material, String name) {

        super(material);
        this.name = name;

        setRegistryName(name);
        setUnlocalizedName(SunderedBlocks.MODID + "." + name);

        register();

        setCreativeTab(SunderedBlocks.ixTab);
    }

    public void register(Item item) {

    }

    public void register() {
        register(new ItemBlock(this).setRegistryName(getRegistryName()))
    }
}
