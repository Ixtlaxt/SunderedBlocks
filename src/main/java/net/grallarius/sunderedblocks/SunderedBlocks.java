package net.grallarius.sunderedblocks;

import net.grallarius.sunderedblocks.block.ModBlocks;
import net.grallarius.sunderedblocks.proxy.ServerProxy;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.registries.IForgeRegistry;

@Mod(modid = SunderedBlocks.MODID, name = SunderedBlocks.NAME, version = SunderedBlocks.VERSION)

public class SunderedBlocks {

    public static final String MODID = "sunderedblocks";
    public static final String NAME = "Sundered Blocks";
    public static final String VERSION = "0.0.1";

    public static IForgeRegistry<Block> BLOCK_REGISTRY = GameRegistry.findRegistry(Block.class);
    public static IForgeRegistry<Item>  ITEM_REGISTRY  = GameRegistry.findRegistry(Item.class);

    public static CreativeTabs ixTab = new CreativeTabs("sundered.block") {
        @Override
        public ItemStack getTabIconItem() {
            return new ItemStack(ModBlocks.blockTest);
        }
    };


    @Mod.Instance
    public static SunderedBlocks instance;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        proxy.preInit(event);
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        proxy.init(event);
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        proxy.postInit(event);
    }

    @SidedProxy(serverSide = "net.grallarius.sunderedblocks.proxy.ServerProxy",
                clientSide = "net.grallarius.sunderedblocks.proxy.ClientProxy",
                modId = MODID)
    public static ServerProxy proxy;
}
