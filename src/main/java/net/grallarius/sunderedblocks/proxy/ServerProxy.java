package net.grallarius.sunderedblocks.proxy;

import net.grallarius.sunderedblocks.block.ModBlocks;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ServerProxy {

    public void preInit(FMLPreInitializationEvent event) {
        ModBlocks.preInit();
    }

    public void init(FMLInitializationEvent event) {

    }

    public void postInit(FMLPostInitializationEvent event) {

    }
}
