package net.grallarius.sunderedblocks.item;


import net.grallarius.sunderedblocks.item.tools.ItemSaw;

public class ModItems {
public static ItemSaw saw = new ItemSaw("saw");

    public static void preInit(){ }

    public static void registerModels() {
        saw.register();
    }
}
