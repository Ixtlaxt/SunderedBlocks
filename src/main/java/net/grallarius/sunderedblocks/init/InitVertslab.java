package net.grallarius.sunderedblocks.init;

import net.grallarius.sunderedblocks.block.BlockVertslab;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class InitVertslab {

    public static final ItemGroup vertslabTab = new ItemGroup("vanillaVertslabs") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(vanilla_oak_vertslab);
        }
    };

    public static final Block vanilla_oak_vertslab = ModBlocks.register("vanilla_oak_vertslab", new BlockVertslab(Block.Properties.create(Material.WOOD, MaterialColor.WOOD).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)), new Item.Properties().group(vertslabTab));
    public static final Block vanilla_spruce_vertslab = ModBlocks.register("vanilla_spruce_vertslab", new BlockVertslab(Block.Properties.create(Material.WOOD, MaterialColor.OBSIDIAN).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)), new Item.Properties().group(vertslabTab));
    public static final Block vanilla_birch_vertslab = ModBlocks.register("vanilla_birch_vertslab", new BlockVertslab(Block.Properties.create(Material.WOOD, MaterialColor.SAND).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)), new Item.Properties().group(vertslabTab));
    public static final Block vanilla_jungle_vertslab = ModBlocks.register("vanilla_jungle_vertslab", new BlockVertslab(Block.Properties.create(Material.WOOD, MaterialColor.DIRT).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)), new Item.Properties().group(vertslabTab));
    public static final Block vanilla_acacia_vertslab = ModBlocks.register("vanilla_acacia_vertslab", new BlockVertslab(Block.Properties.create(Material.WOOD, MaterialColor.ADOBE).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)), new Item.Properties().group(vertslabTab));
    public static final Block vanilla_dark_oak_vertslab = ModBlocks.register("vanilla_dark_oak_vertslab", new BlockVertslab(Block.Properties.create(Material.WOOD, MaterialColor.BROWN).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)), new Item.Properties().group(vertslabTab));
    public static final Block vanilla_stone_vertslab = ModBlocks.register("vanilla_stone_vertslab", new BlockVertslab(Block.Properties.create(Material.ROCK, MaterialColor.STONE).hardnessAndResistance(1.5F, 6.0F)), new Item.Properties().group(vertslabTab));
    public static final Block vanilla_stone_brick_vertslab = ModBlocks.register("vanilla_stone_brick_vertslab", new BlockVertslab(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5F, 6.0F)), new Item.Properties().group(vertslabTab));
    public static final Block vanilla_mossy_stone_brick_vertslab = ModBlocks.register("vanilla_mossy_stone_brick_vertslab", new BlockVertslab(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5F, 6.0F)), new Item.Properties().group(vertslabTab));
    public static final Block vanilla_granite_vertslab = ModBlocks.register("vanilla_granite_vertslab", new BlockVertslab(Block.Properties.create(Material.ROCK, MaterialColor.DIRT).hardnessAndResistance(1.5F, 6.0F)), new Item.Properties().group(vertslabTab));
    public static final Block vanilla_polished_granite_vertslab = ModBlocks.register("vanilla_polished_granite_vertslab", new BlockVertslab(Block.Properties.create(Material.ROCK, MaterialColor.DIRT).hardnessAndResistance(1.5F, 6.0F)), new Item.Properties().group(vertslabTab));
    public static final Block vanilla_diorite_vertslab = ModBlocks.register("vanilla_diorite_vertslab", new BlockVertslab(Block.Properties.create(Material.ROCK, MaterialColor.QUARTZ).hardnessAndResistance(1.5F, 6.0F)), new Item.Properties().group(vertslabTab));
    public static final Block vanilla_polished_diorite_vertslab = ModBlocks.register("vanilla_polished_diorite_vertslab", new BlockVertslab(Block.Properties.create(Material.ROCK, MaterialColor.QUARTZ).hardnessAndResistance(1.5F, 6.0F)), new Item.Properties().group(vertslabTab));
    public static final Block vanilla_andesite_vertslab = ModBlocks.register("vanilla_andesite_vertslab", new BlockVertslab(Block.Properties.create(Material.ROCK, MaterialColor.STONE).hardnessAndResistance(1.5F, 6.0F)), new Item.Properties().group(vertslabTab));
    public static final Block vanilla_polished_andesite_vertslab = ModBlocks.register("vanilla_polished_andesite_vertslab", new BlockVertslab(Block.Properties.create(Material.ROCK, MaterialColor.STONE).hardnessAndResistance(1.5F, 6.0F)), new Item.Properties().group(vertslabTab));
    public static final Block vanilla_sandstone_vertslab = ModBlocks.register("vanilla_sandstone_vertslab", new BlockVertslab(Block.Properties.create(Material.ROCK, MaterialColor.SAND).hardnessAndResistance(0.8F)), new Item.Properties().group(vertslabTab));
    public static final Block vanilla_smooth_sandstone_vertslab = ModBlocks.register("vanilla_smooth_sandstone_vertslab", new BlockVertslab(Block.Properties.create(Material.ROCK, MaterialColor.SAND).hardnessAndResistance(0.8F)), new Item.Properties().group(vertslabTab));
    public static final Block vanilla_red_sandstone_vertslab = ModBlocks.register("vanilla_red_sandstone_vertslab", new BlockVertslab(Block.Properties.create(Material.ROCK, MaterialColor.ADOBE).hardnessAndResistance(0.8F)), new Item.Properties().group(vertslabTab));
    public static final Block vanilla_smooth_red_sandstone_vertslab = ModBlocks.register("vanilla_smooth_red_sandstone_vertslab", new BlockVertslab(Block.Properties.create(Material.ROCK, MaterialColor.ADOBE).hardnessAndResistance(0.8F)), new Item.Properties().group(vertslabTab));
    public static final Block vanilla_cobblestone_vertslab = ModBlocks.register("vanilla_cobblestone_vertslab", new BlockVertslab(Block.Properties.create(Material.ROCK).hardnessAndResistance(2.0F, 6.0F)), new Item.Properties().group(vertslabTab));
    public static final Block vanilla_mossy_cobblestone_vertslab = ModBlocks.register("vanilla_mossy_cobblestone_vertslab", new BlockVertslab(Block.Properties.create(Material.ROCK).hardnessAndResistance(2.0F, 6.0F)), new Item.Properties().group(vertslabTab));
    public static final Block vanilla_brick_vertslab = ModBlocks.register("vanilla_brick_vertslab", new BlockVertslab(Block.Properties.create(Material.ROCK, MaterialColor.RED).hardnessAndResistance(2.0F, 6.0F)), new Item.Properties().group(vertslabTab));
    public static final Block vanilla_nether_brick_vertslab = ModBlocks.register("vanilla_nether_brick_vertslab", new BlockVertslab(Block.Properties.create(Material.ROCK, MaterialColor.NETHERRACK).hardnessAndResistance(2.0F, 6.0F)), new Item.Properties().group(vertslabTab));
    public static final Block vanilla_red_nether_brick_vertslab = ModBlocks.register("vanilla_red_nether_brick_vertslab", new BlockVertslab(Block.Properties.create(Material.ROCK, MaterialColor.NETHERRACK).hardnessAndResistance(2.0F, 6.0F)), new Item.Properties().group(vertslabTab));
    public static final Block vanilla_purpur_vertslab = ModBlocks.register("vanilla_purpur_vertslab", new BlockVertslab(Block.Properties.create(Material.ROCK, MaterialColor.MAGENTA).hardnessAndResistance(2.0F, 6.0F)), new Item.Properties().group(vertslabTab));
    public static final Block vanilla_quartz_vertslab = ModBlocks.register("vanilla_quartz_vertslab", new BlockVertslab(Block.Properties.create(Material.ROCK, MaterialColor.QUARTZ).hardnessAndResistance(0.8F)), new Item.Properties().group(vertslabTab));
    public static final Block vanilla_smooth_quartz_vertslab = ModBlocks.register("vanilla_smooth_quartz_vertslab", new BlockVertslab(Block.Properties.create(Material.ROCK, MaterialColor.QUARTZ).hardnessAndResistance(0.8F)), new Item.Properties().group(vertslabTab));
    public static final Block vanilla_prismarine_vertslab = ModBlocks.register("vanilla_prismarine_vertslab", new BlockVertslab(Block.Properties.create(Material.ROCK, MaterialColor.CYAN).hardnessAndResistance(1.5F, 6.0F)), new Item.Properties().group(vertslabTab));
    public static final Block vanilla_prismarine_brick_vertslab = ModBlocks.register("vanilla_prismarine_brick_vertslab", new BlockVertslab(Block.Properties.create(Material.ROCK, MaterialColor.DIAMOND).hardnessAndResistance(1.5F, 6.0F)), new Item.Properties().group(vertslabTab));
    public static final Block vanilla_dark_prismarine_vertslab = ModBlocks.register("vanilla_dark_prismarine_vertslab", new BlockVertslab(Block.Properties.create(Material.ROCK, MaterialColor.DIAMOND).hardnessAndResistance(1.5F, 6.0F)), new Item.Properties().group(vertslabTab));
    public static final Block vanilla_end_stone_brick_vertslab = ModBlocks.register("vanilla_end_stone_brick_vertslab", new BlockVertslab(Block.Properties.create(Material.ROCK, MaterialColor.SAND).hardnessAndResistance(0.8F)), new Item.Properties().group(vertslabTab));

    public static void init() {
        System.out.println("Sterist registerBlocks finished");
    }
}
