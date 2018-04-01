package net.grallarius.sunderedblocks.item;

import net.grallarius.sunderedblocks.InvModel;
import net.grallarius.sunderedblocks.SunderedBlocks;
import net.minecraft.item.Item;

import static net.grallarius.sunderedblocks.SunderedBlocks.ITEM_REGISTRY;

public class ItemBase extends Item {

    protected String name;

    public ItemBase(String name) {

        this.name = name;

        setRegistryName(name);
        setUnlocalizedName(name);
        setCreativeTab(SunderedBlocks.ixTab);

        register();
    }

    public void register() {
        ITEM_REGISTRY.register(this);
        InvModel.add(this, 0, name);
    }
}
