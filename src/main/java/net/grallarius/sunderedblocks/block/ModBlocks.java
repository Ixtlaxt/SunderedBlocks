package net.grallarius.sunderedblocks.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockStairs;
import net.minecraft.block.material.Material;

public class ModBlocks {

    public static BlockBase blockTest = new BlockBase(Material.ROCK, "test_block");
    public static BlockBase crateTest = new BlockBase(Material.WOOD, "crate_test");
    public static BlockBase blockTileBlack = new BlockBase(Material.ROCK, "block_tile_black");
    public static BlockBase blockTileBlue = new BlockBase(Material.ROCK, "block_tile_blue");
    public static BlockBase blockTileGreen = new BlockBase(Material.ROCK, "block_tile_green");
    public static BlockBase blockTileRed = new BlockBase(Material.ROCK, "block_tile_red");

    public static BlockModStairs stairsTileBlack = new BlockModStairs(blockTileBlack.getDefaultState(), "stairs_tile_black");

    public static BlockVertslab vertslabTest = new BlockVertslab("vertslab_test");
    public static BlockVertslab vertslabTileBlack = new BlockVertslab("vertslab_tile_black");
    public static BlockVertslab vertslabTileBlue = new BlockVertslab("vertslab_tile_blue");
    public static BlockVertslab vertslabTileGreen = new BlockVertslab("vertslab_tile_green");
    public static BlockVertslab vertslabTileRed = new BlockVertslab("vertslab_tile_red");

    public static BlockCrate crateGoods = new BlockCrate("block_crate");

    public static ClothesLine clothesline = new ClothesLine();

    public static void preInit() {
        blockTest.register();
        crateTest.register();
        blockTileBlack.register();
        blockTileBlue.register();
        blockTileGreen.register();
        blockTileRed.register();

        stairsTileBlack.register();

        vertslabTest.register();

        vertslabTileBlack.register();
        vertslabTileBlue.register();
        vertslabTileGreen.register();
        vertslabTileRed.register();

        crateGoods.register();

        clothesline.register();

    }

    public static void registerBlocks() {

    }

    public static void registerItemBlocks() {

    }

    public static void registerModels() {

    }
}
