package net.grallarius.sunderedblocks.init;

import net.grallarius.sunderedblocks.block.*;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.item.Item;

public class InitClarate {

    public static final Block stone_clarate_dark_raw_block = ModBlocks.register("stone_clarate_dark_raw_block", new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.2f, 3.2f)));
    public static final Block stone_clarate_dark_brick_block = ModBlocks.register("stone_clarate_dark_brick_block", new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.0f, 3.0f)));
    public static final Block stone_clarate_dark_tile_block = ModBlocks.register("stone_clarate_dark_tile_block", new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.0f, 3.0f)));
    public static final Block stone_clarate_dark_cut_block = ModBlocks.register("stone_clarate_dark_cut_block", new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.0f, 3.0f)));

    public static final Block stone_clarate_dark_raw_stairs = ModBlocks.register("stone_clarate_dark_raw_stairs", new BlockModStairs(stone_clarate_dark_raw_block.getDefaultState(), Block.Properties.from(stone_clarate_dark_raw_block)));
    public static final Block stone_clarate_dark_brick_stairs = ModBlocks.register("stone_clarate_dark_brick_stairs", new BlockModStairs(stone_clarate_dark_brick_block.getDefaultState(), Block.Properties.from(stone_clarate_dark_brick_block)));
    public static final Block stone_clarate_dark_tile_stairs = ModBlocks.register("stone_clarate_dark_tile_stairs", new BlockModStairs(stone_clarate_dark_tile_block.getDefaultState(), Block.Properties.from(stone_clarate_dark_tile_block)));
    public static final Block stone_clarate_dark_cut_stairs = ModBlocks.register("stone_clarate_dark_cut_stairs", new BlockModStairs(stone_clarate_dark_cut_block.getDefaultState(), Block.Properties.from(stone_clarate_dark_cut_block)));

    public static final Block stone_clarate_dark_raw_vertslab = ModBlocks.register("stone_clarate_dark_raw_vertslab", new BlockVertslab(Block.Properties.from(stone_clarate_dark_raw_block)));
    public static final Block stone_clarate_dark_brick_vertslab = ModBlocks.register("stone_clarate_dark_brick_vertslab", new BlockVertslab(Block.Properties.from(stone_clarate_dark_brick_block)));
    public static final Block stone_clarate_dark_tile_vertslab = ModBlocks.register("stone_clarate_dark_tile_vertslab", new BlockVertslab(Block.Properties.from(stone_clarate_dark_tile_block)));
    public static final Block stone_clarate_dark_cut_vertslab = ModBlocks.register("stone_clarate_dark_cut_vertslab", new BlockVertslab(Block.Properties.from(stone_clarate_dark_cut_block)));

    public static final Block stone_clarate_dark_raw_slab = ModBlocks.register("stone_clarate_dark_raw_slab", new SlabBlock(Block.Properties.from(stone_clarate_dark_raw_block)));
    public static final Block stone_clarate_dark_brick_slab = ModBlocks.register("stone_clarate_dark_brick_slab", new SlabBlock(Block.Properties.from(stone_clarate_dark_brick_block)));
    public static final Block stone_clarate_dark_tile_slab = ModBlocks.register("stone_clarate_dark_tile_slab", new SlabBlock(Block.Properties.from(stone_clarate_dark_tile_block)));
    public static final Block stone_clarate_dark_cut_slab = ModBlocks.register("stone_clarate_dark_cut_slab", new SlabBlock(Block.Properties.from(stone_clarate_dark_cut_block)));

    public static final Block stone_clarate_dark_pillar_basic = ModBlocks.register("stone_clarate_dark_pillar_basic", new RotatedPillarBlock(Block.Properties.from(stone_clarate_dark_cut_block)));

    public static final Block stone_clarate_dark_door = ModBlocks.register("stone_clarate_dark_door", new BlockModDoor(Block.Properties.from(stone_clarate_dark_cut_block)));
    public static final Block stone_clarate_dark_trapdoor = ModBlocks.register("stone_clarate_dark_trapdoor", new BlockModTrapDoor(Block.Properties.from(stone_clarate_dark_cut_block)));

    public static final Block stone_clarate_pale_raw_block = ModBlocks.register("stone_clarate_pale_raw_block", new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.2f, 3.2f)));
    public static final Block stone_clarate_pale_brick_block = ModBlocks.register("stone_clarate_pale_brick_block", new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.0f, 3.0f)));
    public static final Block stone_clarate_pale_tile_block = ModBlocks.register("stone_clarate_pale_tile_block", new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.0f, 3.0f)));
    public static final Block stone_clarate_pale_cut_block = ModBlocks.register("stone_clarate_pale_cut_block", new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.0f, 3.0f)));

    public static final Block stone_clarate_pale_raw_stairs = ModBlocks.register("stone_clarate_pale_raw_stairs", new BlockModStairs(stone_clarate_pale_raw_block.getDefaultState(), Block.Properties.from(stone_clarate_pale_raw_block)));
    public static final Block stone_clarate_pale_brick_stairs = ModBlocks.register("stone_clarate_pale_brick_stairs", new BlockModStairs(stone_clarate_pale_brick_block.getDefaultState(), Block.Properties.from(stone_clarate_pale_brick_block)));
    public static final Block stone_clarate_pale_tile_stairs = ModBlocks.register("stone_clarate_pale_tile_stairs", new BlockModStairs(stone_clarate_pale_tile_block.getDefaultState(), Block.Properties.from(stone_clarate_pale_tile_block)));
    public static final Block stone_clarate_pale_cut_stairs = ModBlocks.register("stone_clarate_pale_cut_stairs", new BlockModStairs(stone_clarate_pale_cut_block.getDefaultState(), Block.Properties.from(stone_clarate_pale_cut_block)));

    public static final Block stone_clarate_pale_raw_vertslab = ModBlocks.register("stone_clarate_pale_raw_vertslab", new BlockVertslab(Block.Properties.from(stone_clarate_pale_raw_block)));
    public static final Block stone_clarate_pale_brick_vertslab = ModBlocks.register("stone_clarate_pale_brick_vertslab", new BlockVertslab(Block.Properties.from(stone_clarate_pale_brick_block)));
    public static final Block stone_clarate_pale_tile_vertslab = ModBlocks.register("stone_clarate_pale_tile_vertslab", new BlockVertslab(Block.Properties.from(stone_clarate_pale_tile_block)));
    public static final Block stone_clarate_pale_cut_vertslab = ModBlocks.register("stone_clarate_pale_cut_vertslab", new BlockVertslab(Block.Properties.from(stone_clarate_pale_cut_block)));

    public static final Block stone_clarate_pale_raw_slab = ModBlocks.register("stone_clarate_pale_raw_slab", new SlabBlock(Block.Properties.from(stone_clarate_pale_raw_block)));
    public static final Block stone_clarate_pale_brick_slab = ModBlocks.register("stone_clarate_pale_brick_slab", new SlabBlock(Block.Properties.from(stone_clarate_pale_brick_block)));
    public static final Block stone_clarate_pale_tile_slab = ModBlocks.register("stone_clarate_pale_tile_slab", new SlabBlock(Block.Properties.from(stone_clarate_pale_tile_block)));
    public static final Block stone_clarate_pale_cut_slab = ModBlocks.register("stone_clarate_pale_cut_slab", new SlabBlock(Block.Properties.from(stone_clarate_pale_cut_block)));

    public static final Block stone_clarate_pale_pillar_basic = ModBlocks.register("stone_clarate_pale_pillar_basic", new RotatedPillarBlock(Block.Properties.from(stone_clarate_pale_cut_block)));

    public static final Block stone_clarate_pale_door = ModBlocks.register("stone_clarate_pale_door", new BlockModDoor(Block.Properties.from(stone_clarate_pale_cut_block)));
    public static final Block stone_clarate_pale_trapdoor = ModBlocks.register("stone_clarate_pale_trapdoor", new BlockModTrapDoor(Block.Properties.from(stone_clarate_pale_cut_block)));

    public static final Block stone_clarate_dark_quartslab = ModBlocks.register("stone_clarate_dark_quartslab", new BlockQuartslab(Block.Properties.from(stone_clarate_dark_cut_block)));
    public static final Block stone_clarate_pale_quartslab = ModBlocks.register("stone_clarate_pale_quartslab", new BlockQuartslab(Block.Properties.from(stone_clarate_pale_cut_block)));
    
    public static final Block stone_clarate_gravel = ModBlocks.register("stone_clarate_gravel", new GravelBlock(Block.Properties.create(Material.SAND, MaterialColor.STONE).hardnessAndResistance(0.6F).sound(SoundType.GROUND)));

    public static final Item stone_clarate_rubble = ModItems.register("stone_clarate_rubble");
    //public static final Block stone_clarate_dark_panel = ModBlocks.register("stone_clarate_dark_panel", new BlockPanel(Block.Properties.from(stone_clarate_pale_cut_block)));

    public static void init() {
        System.out.println("Clarate registerBlocks finished");
    }
}
