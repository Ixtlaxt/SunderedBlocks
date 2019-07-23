package net.grallarius.sunderedblocks.proxy;

import net.minecraftforge.client.model.obj.OBJLoader;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;

import static net.grallarius.sunderedblocks.SunderedBlocks.MODID;

public class ClientProxy implements IProxy{

    @Override
    public void setup(FMLCommonSetupEvent event) {
        OBJLoader.INSTANCE.addDomain(MODID);
    }

/*    @Override
    public void registerRenderers() {
       *//* ClientRegistry.bindTileEntitySpecialRenderer(TileEntityWorkbench.class, new TESRWorkbench());*//*
    }*/


}
