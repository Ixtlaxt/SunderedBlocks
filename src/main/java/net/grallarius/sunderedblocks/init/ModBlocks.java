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

    public static final Block test_block = null;
    public static final BlockVertslab test_vertslab = null;

    public static final SandBlock sand_black_block = null;
    public static final SandBlock sand_brown_block = null;
    public static final SandBlock sand_grey_block = null;
    public static final SandBlock sand_tropic_block = null;
    public static final SandBlock sand_white_block = null;

    public static final Block stone_red_dark_raw_block = register("stone_red_dark_raw_block", new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.2f, 3.2f)));
    public static final Block stone_red_dark_brick_block = register("stone_red_dark_brick_block", new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.0f, 3.0f)));
    public static final Block stone_red_dark_tile_block = register("stone_red_dark_tile_block", new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.0f, 3.0f)));
    public static final Block stone_red_dark_cut_block = register("stone_red_dark_cut_block", new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.0f, 3.0f)));

    public static final BlockModStairs stone_red_dark_raw_stairs = null;
    public static final BlockModStairs stone_red_dark_brick_stairs = null;
    public static final BlockModStairs stone_red_dark_tile_stairs = null;
    public static final BlockModStairs stone_red_dark_cut_stairs = null;

    public static final BlockVertslab stone_red_dark_raw_vertslab = null;
    public static final BlockVertslab stone_red_dark_brick_vertslab = null;
    public static final BlockVertslab stone_red_dark_tile_vertslab = null;
    public static final BlockVertslab stone_red_dark_cut_vertslab = null;

    public static final SlabBlock stone_red_dark_raw_slab = null;
    public static final SlabBlock stone_red_dark_brick_slab = null;
    public static final SlabBlock stone_red_dark_tile_slab = null;
    public static final SlabBlock stone_red_dark_cut_slab = null;

    public static final RotatedPillarBlock stone_red_dark_pillar_basic = null;

    public static final BlockModDoor stone_red_dark_door = null;
    public static final BlockModTrapDoor stone_red_dark_trapdoor = null;

    public static Block register(String name, Block block) {

        BlockItem item = new BlockItem(block, new Item.Properties().group(creativeTab));
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
        InitSterist.init();
        BLOCKS.forEach(block -> event.getRegistry().register(block));
        BLOCKS.clear();

        event.getRegistry().registerAll(
                new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.0f, 3.0f)).setRegistryName(SunderedBlocks.MODID, "test_block"),
                new BlockModStairs(stone_red_dark_raw_block.getDefaultState(), Block.Properties.from(stone_red_dark_raw_block)).setRegistryName(SunderedBlocks.MODID, "stone_red_dark_raw_stairs"),
                new BlockModStairs(stone_red_dark_brick_block.getDefaultState(), Block.Properties.from(stone_red_dark_brick_block)).setRegistryName(SunderedBlocks.MODID, "stone_red_dark_brick_stairs"),
                new BlockModStairs(stone_red_dark_tile_block.getDefaultState(), Block.Properties.from(stone_red_dark_tile_block)).setRegistryName(SunderedBlocks.MODID, "stone_red_dark_tile_stairs"),
                new BlockModStairs(stone_red_dark_cut_block.getDefaultState(), Block.Properties.from(stone_red_dark_cut_block)).setRegistryName(SunderedBlocks.MODID, "stone_red_dark_cut_stairs"),
                new BlockVertslab(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.0f, 3.0f)).setRegistryName(SunderedBlocks.MODID, "test_vertslab"),
                new BlockVertslab(Block.Properties.from(stone_red_dark_raw_block)).setRegistryName(SunderedBlocks.MODID, "stone_red_dark_raw_vertslab"),
                new BlockVertslab(Block.Properties.from(stone_red_dark_brick_block)).setRegistryName(SunderedBlocks.MODID, "stone_red_dark_brick_vertslab"),
                new BlockVertslab(Block.Properties.from(stone_red_dark_tile_block)).setRegistryName(SunderedBlocks.MODID, "stone_red_dark_tile_vertslab"),
                new BlockVertslab(Block.Properties.from(stone_red_dark_cut_block)).setRegistryName(SunderedBlocks.MODID, "stone_red_dark_cut_vertslab"),
                new SlabBlock(Block.Properties.from(stone_red_dark_raw_block)).setRegistryName(SunderedBlocks.MODID, "stone_red_dark_raw_slab"),
                new SlabBlock(Block.Properties.from(stone_red_dark_brick_block)).setRegistryName(SunderedBlocks.MODID, "stone_red_dark_brick_slab"),
                new SlabBlock(Block.Properties.from(stone_red_dark_tile_block)).setRegistryName(SunderedBlocks.MODID, "stone_red_dark_tile_slab"),
                new SlabBlock(Block.Properties.from(stone_red_dark_cut_block)).setRegistryName(SunderedBlocks.MODID, "stone_red_dark_cut_slab"),
                new RotatedPillarBlock(Block.Properties.from(stone_red_dark_cut_block)).setRegistryName(SunderedBlocks.MODID, "stone_red_dark_pillar_basic"),
                new BlockModDoor(Block.Properties.from(stone_red_dark_cut_block)).setRegistryName(SunderedBlocks.MODID, "stone_red_dark_door"),
                new BlockModTrapDoor(Block.Properties.from(stone_red_dark_cut_block)).setRegistryName(SunderedBlocks.MODID, "stone_red_dark_trapdoor"),
                new SandBlock(14406560, Block.Properties.create(Material.SAND).hardnessAndResistance(0.5f, 0.5f).sound(SoundType.SAND)).setRegistryName(SunderedBlocks.MODID, "sand_black_block"),
                new SandBlock(14406560, Block.Properties.create(Material.SAND).hardnessAndResistance(0.5f, 0.5f).sound(SoundType.SAND)).setRegistryName(SunderedBlocks.MODID, "sand_brown_block"),
                new SandBlock(14406560, Block.Properties.create(Material.SAND).hardnessAndResistance(0.5f, 0.5f).sound(SoundType.SAND)).setRegistryName(SunderedBlocks.MODID, "sand_grey_block"),
                new SandBlock(14406560, Block.Properties.create(Material.SAND).hardnessAndResistance(0.5f, 0.5f).sound(SoundType.SAND)).setRegistryName(SunderedBlocks.MODID, "sand_tropic_block"),
                new SandBlock(14406560, Block.Properties.create(Material.SAND).hardnessAndResistance(0.5f, 0.5f).sound(SoundType.SAND)).setRegistryName(SunderedBlocks.MODID, "sand_white_block")
        );
        //InitSterist.registerBlocks(event);
    }

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        ITEMBLOCKS.forEach(item -> event.getRegistry().register(item));
        ITEMBLOCKS.clear();
    }
}
