package net.grallarius.sunderedblocks.init;

import net.grallarius.sunderedblocks.SunderedBlocks;
import net.grallarius.sunderedblocks.block.BlockModDoor;
import net.grallarius.sunderedblocks.block.BlockModStairs;
import net.grallarius.sunderedblocks.block.BlockModTrapDoor;
import net.grallarius.sunderedblocks.block.BlockVertslab;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.ArrayList;
import java.util.List;

import static net.grallarius.sunderedblocks.init.ModItems.creativeTab;

@Mod.EventBusSubscriber(modid = SunderedBlocks.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
//@ObjectHolder(SunderedBlocks.MODID)
public class ModBlocks {

    public static final List<Block> BLOCKS = new ArrayList<>();
    public static final List<Item> ITEMBLOCKS = new ArrayList<>();

    public static final Block sand_black_block = register("sand_black_block", new SandBlock(14406560, Block.Properties.create(Material.SAND).hardnessAndResistance(0.5f, 0.5f).sound(SoundType.SAND)));
    public static final Block sand_brown_block = register("sand_brown_block", new SandBlock(14406560, Block.Properties.create(Material.SAND).hardnessAndResistance(0.5f, 0.5f).sound(SoundType.SAND)));
    public static final Block sand_grey_block = register("sand_grey_block", new SandBlock(14406560, Block.Properties.create(Material.SAND).hardnessAndResistance(0.5f, 0.5f).sound(SoundType.SAND)));
    public static final Block sand_tropic_block = register("sand_tropic_block", new SandBlock(14406560, Block.Properties.create(Material.SAND).hardnessAndResistance(0.5f, 0.5f).sound(SoundType.SAND)));
    public static final Block sand_white_block = register("sand_white_block", new SandBlock(14406560, Block.Properties.create(Material.SAND).hardnessAndResistance(0.5f, 0.5f).sound(SoundType.SAND)));

    public static Block register(String name, Block block) {
        return register(name, block, new Item.Properties().group(creativeTab));
    }

    public static Block register(String name, Block block, Item.Properties properties){
        return register(name, block, new BlockItem(block, properties));
    }

    public static Block register(String name, Block block, Item item) {
        block.setRegistryName(SunderedBlocks.MODID, name);
        BLOCKS.add(block);
        if(block.getRegistryName() != null) {
            item.setRegistryName(name);
            ITEMBLOCKS.add(item);
        }
        return block;
    }

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event) {

        InitAspile.init();
        InitAventar.init();
        InitBalk.init();
        InitClarate.init();
        InitGargrave.init();
        InitLinggot.init();
        InitRhodian.init();
        InitSpartine.init();
        InitSterist.init();
        InitUmberlite.init();

        InitVanilla.init();

        BLOCKS.forEach(block -> event.getRegistry().register(block));
        BLOCKS.clear();

    }

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        ITEMBLOCKS.forEach(item -> event.getRegistry().register(item));
        ITEMBLOCKS.clear();
    }
}
