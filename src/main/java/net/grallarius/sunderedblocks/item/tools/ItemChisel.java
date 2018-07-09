package net.grallarius.sunderedblocks.item.tools;

import net.grallarius.sunderedblocks.InvModel;
import net.grallarius.sunderedblocks.SunderedBlocks;
import net.grallarius.sunderedblocks.item.ItemBase;

public class ItemChisel  extends ItemBase {


    public ItemChisel (String name) {
        super(name);
        setRegistryName(name);
        setUnlocalizedName(name);
        this.name = name;
        setCreativeTab(SunderedBlocks.ixTab);

        register();
    }

    public void register() {
        SunderedBlocks.ITEM_REGISTRY.register(this);
        InvModel.add(this, name);
    }
}