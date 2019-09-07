package net.grallarius.sunderedblocks.init;

import net.grallarius.sunderedblocks.SunderedBlocks;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.ArrayList;
import java.util.List;


@Mod.EventBusSubscriber(modid = SunderedBlocks.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModItems {

    public static final List<Item> ITEMS = new ArrayList<>();

    public static final ItemGroup creativeTab = new ItemGroup("sunderBlocks") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(InitSpartine.stone_spartine_pale_cut_block);
        }
    };

    public static BlockItem createItemBlock(Block block, Item.Properties properties) {
        System.out.println("CreateItemBlock: " + block.getRegistryName());
        return (BlockItem) new BlockItem(block, properties).setRegistryName(block.getRegistryName());
    }

    public static Item register(String name) {
        Item item = new Item(new Item.Properties().group(creativeTab));
        item.setRegistryName(SunderedBlocks.MODID, name);
        ITEMS.add(item);
        return item;
    }

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        ITEMS.forEach(item -> event.getRegistry().register(item));
        ITEMS.clear();

    }
}
