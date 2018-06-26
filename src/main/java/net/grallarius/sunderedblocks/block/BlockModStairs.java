package net.grallarius.sunderedblocks.block;

import net.grallarius.sunderedblocks.InvModel;
import net.grallarius.sunderedblocks.SunderedBlocks;
import net.minecraft.block.BlockStairs;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

import static net.grallarius.sunderedblocks.SunderedBlocks.BLOCK_REGISTRY;
import static net.grallarius.sunderedblocks.SunderedBlocks.ITEM_REGISTRY;

public class BlockModStairs extends BlockStairs {

    protected String name;

    public BlockModStairs (IBlockState state, String name) {

        super(state);
        this.name = name;

        setRegistryName(SunderedBlocks.MODID + ":" + name);
        setUnlocalizedName(name);
        setCreativeTab(SunderedBlocks.ixTab);
        setHardness(1F);
        this.useNeighborBrightness = true;
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
