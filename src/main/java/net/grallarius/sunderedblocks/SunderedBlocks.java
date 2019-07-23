package net.grallarius.sunderedblocks;

import net.grallarius.sunderedblocks.proxy.ClientProxy;
import net.grallarius.sunderedblocks.proxy.IProxy;
import net.grallarius.sunderedblocks.proxy.ServerProxy;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.IForgeRegistry;

@Mod(SunderedBlocks.MODID)
@Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD)

public class SunderedBlocks {

    public static final String MODID = "sunderedblocks";

    public static IForgeRegistry<Block> BLOCK_REGISTRY = GameRegistry.findRegistry(Block.class);
    public static IForgeRegistry<Item>  ITEM_REGISTRY  = GameRegistry.findRegistry(Item.class);

    public static IProxy proxy = DistExecutor.runForDist(() -> () -> new ClientProxy(), () -> () -> new ServerProxy());

    public SunderedBlocks() {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) {
        //proxy.preInit(event);

        //NetworkRegistry.INSTANCE.registerGuiHandler(this, new ModGuiHandler());

        int index = 0;

        //wrapper.registerMessage(new PacketUpdateWorkbench.Handler(), PacketUpdateWorkbench.class, index++, Side.CLIENT);
        //wrapper.registerMessage(new PacketRequestUpdateWorkbench.Handler(), PacketRequestUpdateWorkbench.class, index++, Side.SERVER);
    }

    //public static SimpleNetworkWrapper wrapper = NetworkRegistry.INSTANCE.newSimpleChannel(SunderedBlocks.MODID);


    //public static CreativeTabs ixTab = new CreativeTabs("sundered.block") {
    //    @Override
    //    public ItemStack getTabIconItem() {
    //        return new ItemStack(ModBlocks.blockTest);
    //    }
    //};
}
