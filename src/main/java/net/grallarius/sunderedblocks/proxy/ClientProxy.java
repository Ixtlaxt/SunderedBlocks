package net.grallarius.sunderedblocks.proxy;

import net.grallarius.sunderedblocks.InvModel;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends ServerProxy {

    @Override
    public void preInit(FMLPreInitializationEvent event) {
        super.preInit(event);
        InvModel.register();
    }

    @Override
    public void init(FMLInitializationEvent event) {
        super.init(event);
    }

    @Override
    public void postInit(FMLPostInitializationEvent event) {
        super.postInit(event);
    }
}
