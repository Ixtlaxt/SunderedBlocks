package net.grallarius.sunderedblocks.init;

import net.grallarius.sunderedblocks.block.BlockQuartslab;
import net.grallarius.sunderedblocks.block.BlockVertslab;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class InitVanilla {

    public static final ItemGroup vanillaTab = new ItemGroup("vanillaSlabs") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(vanilla_oak_vertslab);
        }
    };

    public static Item.Properties tab = new Item.Properties().group(vanillaTab);

    public static final Block vanilla_oak_vertslab = ModBlocks.register("vanilla_oak_vertslab", new BlockVertslab(Block.Properties.create(Material.WOOD, MaterialColor.WOOD).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)), tab);
    public static final Block vanilla_oak_quartslab = ModBlocks.register("vanilla_oak_quartslab", new BlockQuartslab(Block.Properties.from(vanilla_oak_vertslab)), tab);
    public static final Block vanilla_spruce_vertslab = ModBlocks.register("vanilla_spruce_vertslab", new BlockVertslab(Block.Properties.create(Material.WOOD, MaterialColor.OBSIDIAN).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)), tab);
    public static final Block vanilla_spruce_quartslab = ModBlocks.register("vanilla_spruce_quartslab", new BlockQuartslab(Block.Properties.from(vanilla_spruce_vertslab)), tab);
    public static final Block vanilla_birch_vertslab = ModBlocks.register("vanilla_birch_vertslab", new BlockVertslab(Block.Properties.create(Material.WOOD, MaterialColor.SAND).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)), tab);
    public static final Block vanilla_birch_quartslab = ModBlocks.register("vanilla_birch_quartslab", new BlockQuartslab(Block.Properties.from(vanilla_birch_vertslab)), tab);
    public static final Block vanilla_jungle_vertslab = ModBlocks.register("vanilla_jungle_vertslab", new BlockVertslab(Block.Properties.create(Material.WOOD, MaterialColor.DIRT).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)), tab);
    public static final Block vanilla_jungle_quartslab = ModBlocks.register("vanilla_jungle_quartslab", new BlockQuartslab(Block.Properties.from(vanilla_jungle_vertslab)), tab);
    public static final Block vanilla_acacia_vertslab = ModBlocks.register("vanilla_acacia_vertslab", new BlockVertslab(Block.Properties.create(Material.WOOD, MaterialColor.ADOBE).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)), tab);
    public static final Block vanilla_acacia_quartslab = ModBlocks.register("vanilla_acacia_quartslab", new BlockQuartslab(Block.Properties.from(vanilla_acacia_vertslab)), tab);
    public static final Block vanilla_dark_oak_vertslab = ModBlocks.register("vanilla_dark_oak_vertslab", new BlockVertslab(Block.Properties.create(Material.WOOD, MaterialColor.BROWN).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)), tab);
    public static final Block vanilla_dark_oak_quartslab = ModBlocks.register("vanilla_dark_oak_quartslab", new BlockQuartslab(Block.Properties.from(vanilla_dark_oak_vertslab)), tab);
    public static final Block vanilla_stone_vertslab = ModBlocks.register("vanilla_stone_vertslab", new BlockVertslab(Block.Properties.create(Material.ROCK, MaterialColor.STONE).hardnessAndResistance(1.5F, 6.0F)), tab);
    public static final Block vanilla_stone_quartslab = ModBlocks.register("vanilla_stone_quartslab", new BlockQuartslab(Block.Properties.from(vanilla_stone_vertslab)), tab);
    public static final Block vanilla_stone_brick_vertslab = ModBlocks.register("vanilla_stone_brick_vertslab", new BlockVertslab(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5F, 6.0F)), tab);
    public static final Block vanilla_stone_brick_quartslab = ModBlocks.register("vanilla_stone_brick_quartslab", new BlockQuartslab(Block.Properties.from(vanilla_stone_brick_vertslab)), tab);
    public static final Block vanilla_mossy_stone_brick_vertslab = ModBlocks.register("vanilla_mossy_stone_brick_vertslab", new BlockVertslab(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5F, 6.0F)), tab);
    public static final Block vanilla_mossy_stone_brick_quartslab = ModBlocks.register("vanilla_mossy_stone_brick_quartslab", new BlockQuartslab(Block.Properties.from(vanilla_mossy_stone_brick_vertslab)), tab);
    public static final Block vanilla_granite_vertslab = ModBlocks.register("vanilla_granite_vertslab", new BlockVertslab(Block.Properties.create(Material.ROCK, MaterialColor.DIRT).hardnessAndResistance(1.5F, 6.0F)), tab);
    public static final Block vanilla_granite_quartslab = ModBlocks.register("vanilla_granite_quartslab", new BlockQuartslab(Block.Properties.from(vanilla_granite_vertslab)), tab);
    public static final Block vanilla_polished_granite_vertslab = ModBlocks.register("vanilla_polished_granite_vertslab", new BlockVertslab(Block.Properties.create(Material.ROCK, MaterialColor.DIRT).hardnessAndResistance(1.5F, 6.0F)), tab);
    public static final Block vanilla_polished_granite_quartslab = ModBlocks.register("vanilla_polished_granite_quartslab", new BlockQuartslab(Block.Properties.from(vanilla_polished_granite_vertslab)), tab);
    public static final Block vanilla_diorite_vertslab = ModBlocks.register("vanilla_diorite_vertslab", new BlockVertslab(Block.Properties.create(Material.ROCK, MaterialColor.QUARTZ).hardnessAndResistance(1.5F, 6.0F)), tab);
    public static final Block vanilla_diorite_quartslab = ModBlocks.register("vanilla_diorite_quartslab", new BlockQuartslab(Block.Properties.from(vanilla_diorite_vertslab)), tab);
    public static final Block vanilla_polished_diorite_vertslab = ModBlocks.register("vanilla_polished_diorite_vertslab", new BlockVertslab(Block.Properties.create(Material.ROCK, MaterialColor.QUARTZ).hardnessAndResistance(1.5F, 6.0F)), tab);
    public static final Block vanilla_polished_diorite_quartslab = ModBlocks.register("vanilla_polished_diorite_quartslab", new BlockQuartslab(Block.Properties.from(vanilla_polished_diorite_vertslab)), tab);
    public static final Block vanilla_andesite_vertslab = ModBlocks.register("vanilla_andesite_vertslab", new BlockVertslab(Block.Properties.create(Material.ROCK, MaterialColor.STONE).hardnessAndResistance(1.5F, 6.0F)), tab);
    public static final Block vanilla_andesite_quartslab = ModBlocks.register("vanilla_andesite_quartslab", new BlockQuartslab(Block.Properties.from(vanilla_andesite_vertslab)), tab);
    public static final Block vanilla_polished_andesite_vertslab = ModBlocks.register("vanilla_polished_andesite_vertslab", new BlockVertslab(Block.Properties.create(Material.ROCK, MaterialColor.STONE).hardnessAndResistance(1.5F, 6.0F)), tab);
    public static final Block vanilla_polished_andesite_quartslab = ModBlocks.register("vanilla_polished_andesite_quartslab", new BlockQuartslab(Block.Properties.from(vanilla_polished_andesite_vertslab)), tab);
    public static final Block vanilla_sandstone_vertslab = ModBlocks.register("vanilla_sandstone_vertslab", new BlockVertslab(Block.Properties.create(Material.ROCK, MaterialColor.SAND).hardnessAndResistance(0.8F)), tab);
    public static final Block vanilla_sandstone_quartslab = ModBlocks.register("vanilla_sandstone_quartslab", new BlockQuartslab(Block.Properties.from(vanilla_sandstone_vertslab)), tab);
    public static final Block vanilla_smooth_sandstone_vertslab = ModBlocks.register("vanilla_smooth_sandstone_vertslab", new BlockVertslab(Block.Properties.create(Material.ROCK, MaterialColor.SAND).hardnessAndResistance(0.8F)), tab);
    public static final Block vanilla_smooth_sandstone_quartslab = ModBlocks.register("vanilla_smooth_sandstone_quartslab", new BlockQuartslab(Block.Properties.from(vanilla_smooth_sandstone_vertslab)), tab);
    public static final Block vanilla_red_sandstone_vertslab = ModBlocks.register("vanilla_red_sandstone_vertslab", new BlockVertslab(Block.Properties.create(Material.ROCK, MaterialColor.ADOBE).hardnessAndResistance(0.8F)), tab);
    public static final Block vanilla_red_sandstone_quartslab = ModBlocks.register("vanilla_red_sandstone_quartslab", new BlockQuartslab(Block.Properties.from(vanilla_red_sandstone_vertslab)), tab);
    public static final Block vanilla_smooth_red_sandstone_vertslab = ModBlocks.register("vanilla_smooth_red_sandstone_vertslab", new BlockVertslab(Block.Properties.create(Material.ROCK, MaterialColor.ADOBE).hardnessAndResistance(0.8F)), tab);
    public static final Block vanilla_smooth_red_sandstone_quartslab = ModBlocks.register("vanilla_smooth_red_sandstone_quartslab", new BlockQuartslab(Block.Properties.from(vanilla_smooth_red_sandstone_vertslab)), tab);
    public static final Block vanilla_cobblestone_vertslab = ModBlocks.register("vanilla_cobblestone_vertslab", new BlockVertslab(Block.Properties.create(Material.ROCK).hardnessAndResistance(2.0F, 6.0F)), tab);
    public static final Block vanilla_cobblestone_quartslab = ModBlocks.register("vanilla_cobblestone_quartslab", new BlockQuartslab(Block.Properties.from(vanilla_cobblestone_vertslab)), tab);
    public static final Block vanilla_mossy_cobblestone_vertslab = ModBlocks.register("vanilla_mossy_cobblestone_vertslab", new BlockVertslab(Block.Properties.create(Material.ROCK).hardnessAndResistance(2.0F, 6.0F)), tab);
    public static final Block vanilla_mossy_cobblestone_quartslab = ModBlocks.register("vanilla_mossy_cobblestone_quartslab", new BlockQuartslab(Block.Properties.from(vanilla_mossy_cobblestone_vertslab)), tab);
    public static final Block vanilla_brick_vertslab = ModBlocks.register("vanilla_brick_vertslab", new BlockVertslab(Block.Properties.create(Material.ROCK, MaterialColor.RED).hardnessAndResistance(2.0F, 6.0F)), tab);
    public static final Block vanilla_brick_quartslab = ModBlocks.register("vanilla_brick_quartslab", new BlockQuartslab(Block.Properties.from(vanilla_brick_vertslab)), tab);
    public static final Block vanilla_nether_brick_vertslab = ModBlocks.register("vanilla_nether_brick_vertslab", new BlockVertslab(Block.Properties.create(Material.ROCK, MaterialColor.NETHERRACK).hardnessAndResistance(2.0F, 6.0F)), tab);
    public static final Block vanilla_nether_brick_quartslab = ModBlocks.register("vanilla_nether_brick_quartslab", new BlockQuartslab(Block.Properties.from(vanilla_nether_brick_vertslab)), tab);
    public static final Block vanilla_red_nether_brick_vertslab = ModBlocks.register("vanilla_red_nether_brick_vertslab", new BlockVertslab(Block.Properties.create(Material.ROCK, MaterialColor.NETHERRACK).hardnessAndResistance(2.0F, 6.0F)), tab);
    public static final Block vanilla_red_nether_brick_quartslab = ModBlocks.register("vanilla_red_nether_brick_quartslab", new BlockQuartslab(Block.Properties.from(vanilla_red_nether_brick_vertslab)), tab);
    public static final Block vanilla_purpur_vertslab = ModBlocks.register("vanilla_purpur_vertslab", new BlockVertslab(Block.Properties.create(Material.ROCK, MaterialColor.MAGENTA).hardnessAndResistance(2.0F, 6.0F)), tab);
    public static final Block vanilla_purpur_quartslab = ModBlocks.register("vanilla_purpur_quartslab", new BlockQuartslab(Block.Properties.from(vanilla_purpur_vertslab)), tab);
    public static final Block vanilla_quartz_vertslab = ModBlocks.register("vanilla_quartz_vertslab", new BlockVertslab(Block.Properties.create(Material.ROCK, MaterialColor.QUARTZ).hardnessAndResistance(0.8F)), tab);
    public static final Block vanilla_quartz_quartslab = ModBlocks.register("vanilla_quartz_quartslab", new BlockQuartslab(Block.Properties.from(vanilla_quartz_vertslab)), tab);
    public static final Block vanilla_smooth_quartz_vertslab = ModBlocks.register("vanilla_smooth_quartz_vertslab", new BlockVertslab(Block.Properties.create(Material.ROCK, MaterialColor.QUARTZ).hardnessAndResistance(0.8F)), tab);
    public static final Block vanilla_smooth_quartz_quartslab = ModBlocks.register("vanilla_smooth_quartz_quartslab", new BlockQuartslab(Block.Properties.from(vanilla_smooth_quartz_vertslab)), tab);
    public static final Block vanilla_prismarine_vertslab = ModBlocks.register("vanilla_prismarine_vertslab", new BlockVertslab(Block.Properties.create(Material.ROCK, MaterialColor.CYAN).hardnessAndResistance(1.5F, 6.0F)), tab);
    public static final Block vanilla_prismarine_quartslab = ModBlocks.register("vanilla_prismarine_quartslab", new BlockQuartslab(Block.Properties.from(vanilla_prismarine_vertslab)), tab);
    public static final Block vanilla_prismarine_brick_vertslab = ModBlocks.register("vanilla_prismarine_brick_vertslab", new BlockVertslab(Block.Properties.create(Material.ROCK, MaterialColor.DIAMOND).hardnessAndResistance(1.5F, 6.0F)), tab);
    public static final Block vanilla_prismarine_brick_quartslab = ModBlocks.register("vanilla_prismarine_brick_quartslab", new BlockQuartslab(Block.Properties.from(vanilla_prismarine_brick_vertslab)), tab);
    public static final Block vanilla_dark_prismarine_vertslab = ModBlocks.register("vanilla_dark_prismarine_vertslab", new BlockVertslab(Block.Properties.create(Material.ROCK, MaterialColor.DIAMOND).hardnessAndResistance(1.5F, 6.0F)), tab);
    public static final Block vanilla_dark_prismarine_quartslab = ModBlocks.register("vanilla_dark_prismarine_quartslab", new BlockQuartslab(Block.Properties.from(vanilla_dark_prismarine_vertslab)), tab);
    public static final Block vanilla_end_stone_brick_vertslab = ModBlocks.register("vanilla_end_stone_brick_vertslab", new BlockVertslab(Block.Properties.create(Material.ROCK, MaterialColor.SAND).hardnessAndResistance(0.8F)), tab);
    public static final Block vanilla_end_stone_brick_quartslab = ModBlocks.register("vanilla_end_stone_brick_quartslab", new BlockQuartslab(Block.Properties.from(vanilla_end_stone_brick_vertslab)), tab);

    public static void init() {
        System.out.println("Vanilla registerBlocks finished");
    }
}

