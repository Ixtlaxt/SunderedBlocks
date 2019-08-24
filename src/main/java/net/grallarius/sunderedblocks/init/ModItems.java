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



@Mod.EventBusSubscriber(modid = SunderedBlocks.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModItems {

    public static final ItemGroup creativeTab = new ItemGroup("sunderBlocks") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ModBlocks.stone_red_dark_cut_block);
        }
    };

/*    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event){
        event.getRegistry().registerAll(
                new Item(new Item.Properties().group(creativeTab)).setRegistryName(SunderedBlocks.MODID, "test_item"),
                createItemBlock(ModBlocks.test_block, new Item.Properties().group(creativeTab).maxStackSize(64)),
                //createItemBlock(ModBlocks.stone_red_dark_raw_block, new Item.Properties().group(creativeTab)),
                createItemBlock(ModBlocks.stone_red_dark_cut_block, new Item.Properties().group(creativeTab)),
                createItemBlock(ModBlocks.stone_red_dark_tile_block, new Item.Properties().group(creativeTab)),
                createItemBlock(ModBlocks.stone_red_dark_brick_block, new Item.Properties().group(creativeTab)),
                createItemBlock(ModBlocks.stone_red_dark_raw_stairs, new Item.Properties().group(creativeTab)),
                createItemBlock(ModBlocks.stone_red_dark_brick_stairs, new Item.Properties().group(creativeTab)),
                createItemBlock(ModBlocks.stone_red_dark_tile_stairs, new Item.Properties().group(creativeTab)),
                createItemBlock(ModBlocks.stone_red_dark_cut_stairs, new Item.Properties().group(creativeTab)),
                createItemBlock(ModBlocks.test_vertslab, new Item.Properties().group(creativeTab)),
                createItemBlock(ModBlocks.stone_red_dark_raw_vertslab, new Item.Properties().group(creativeTab)),
                createItemBlock(ModBlocks.stone_red_dark_brick_vertslab, new Item.Properties().group(creativeTab)),
                createItemBlock(ModBlocks.stone_red_dark_tile_vertslab, new Item.Properties().group(creativeTab)),
                createItemBlock(ModBlocks.stone_red_dark_cut_vertslab, new Item.Properties().group(creativeTab)),
                createItemBlock(ModBlocks.stone_red_dark_raw_slab, new Item.Properties().group(creativeTab)),
                createItemBlock(ModBlocks.stone_red_dark_brick_slab, new Item.Properties().group(creativeTab)),
                createItemBlock(ModBlocks.stone_red_dark_tile_slab, new Item.Properties().group(creativeTab)),
                createItemBlock(ModBlocks.stone_red_dark_cut_slab, new Item.Properties().group(creativeTab)),
                createItemBlock(ModBlocks.stone_red_dark_pillar_basic, new Item.Properties().group(creativeTab)),
                createItemBlock(ModBlocks.stone_red_dark_door, new Item.Properties().group(creativeTab)),
                createItemBlock(ModBlocks.stone_red_dark_trapdoor, new Item.Properties().group(creativeTab)),
                createItemBlock(ModBlocks.sand_black_block, new Item.Properties().group(creativeTab)),
                createItemBlock(ModBlocks.sand_brown_block, new Item.Properties().group(creativeTab)),
                createItemBlock(ModBlocks.sand_grey_block, new Item.Properties().group(creativeTab)),
                createItemBlock(ModBlocks.sand_tropic_block, new Item.Properties().group(creativeTab)),
                createItemBlock(ModBlocks.sand_white_block, new Item.Properties().group(creativeTab))
        );
        //InitSterist.registerItems(event);
    }*/

    public static BlockItem createItemBlock(Block block, Item.Properties properties) {
        System.out.println("CreateItemBlock: " + block.getRegistryName());
        return (BlockItem) new BlockItem(block, properties).setRegistryName(block.getRegistryName());
    }
}
