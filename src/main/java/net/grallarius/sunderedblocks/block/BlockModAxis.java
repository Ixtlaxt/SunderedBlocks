package net.grallarius.sunderedblocks.block;

import net.grallarius.sunderedblocks.InvModel;
import net.grallarius.sunderedblocks.SunderedBlocks;
import net.minecraft.block.BlockDirectional;
import net.minecraft.block.BlockRotatedPillar;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

import static net.grallarius.sunderedblocks.SunderedBlocks.BLOCK_REGISTRY;
import static net.grallarius.sunderedblocks.SunderedBlocks.ITEM_REGISTRY;

public class BlockModAxis extends BlockRotatedPillar {

    protected String name;

    public BlockModAxis(Material material, String name) {

        super(material);
        this.name = name;

        setRegistryName(SunderedBlocks.MODID + ":" + name);
        setUnlocalizedName(name);
        setCreativeTab(SunderedBlocks.ixTab);
        setHardness(1F);
    }

    public void register(Item item) {
        BLOCK_REGISTRY.register(this);
        ITEM_REGISTRY.register(item);
        InvModel.add(item, name);
    }

    public void register() {
        register(new ItemBlock(this).setRegistryName(getRegistryName()));
    }
}
