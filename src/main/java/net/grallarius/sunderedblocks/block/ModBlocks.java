package net.grallarius.sunderedblocks.block;

import net.grallarius.sunderedblocks.block.registers.*;
import net.grallarius.sunderedblocks.block.workbench.BlockWorkbench;
import net.minecraft.block.material.Material;

public class ModBlocks {

    public static BlockBase blockTest = new BlockBase(Material.ROCK, "test_block");
    public static BlockBase blockTileBlack = new BlockBase(Material.ROCK, "block_tile_black");
    public static BlockBase blockTileBlue = new BlockBase(Material.ROCK, "block_tile_blue");
    public static BlockBase blockTileGreen = new BlockBase(Material.ROCK, "block_tile_green");
    public static BlockBase blockTileRed = new BlockBase(Material.ROCK, "block_tile_red");

    public static BlockModStairs stairsTileBlack = new BlockModStairs(blockTileBlack.getDefaultState(), "stairs_tile_black");
    public static BlockModStairs stairsTileBlue = new BlockModStairs(blockTileBlue.getDefaultState(), "stairs_tile_blue");
    public static BlockModStairs stairsTileGreen = new BlockModStairs(blockTileGreen.getDefaultState(), "stairs_tile_green");
    public static BlockModStairs stairsTileRed = new BlockModStairs(blockTileRed.getDefaultState(), "stairs_tile_red");

    public static BlockModDoubleSlab doubleslabTileBlack = new BlockModDoubleSlab(Material.ROCK, "doubleslab_tile_black");
    public static BlockModSlab slabTileBlack = new BlockModSlab(Material.ROCK,"slab_tile_black", doubleslabTileBlack);
    public static ItemModSlab slabItemTileBlack = new ItemModSlab(slabTileBlack, doubleslabTileBlack);
    public static BlockModDoubleSlab doubleslabTileBlue = new BlockModDoubleSlab(Material.ROCK, "doubleslab_tile_blue");
    public static BlockModSlab slabTileBlue = new BlockModSlab(Material.ROCK,"slab_tile_blue", doubleslabTileBlue);
    public static ItemModSlab slabItemTileBlue = new ItemModSlab(slabTileBlue, doubleslabTileBlue);
    public static BlockModDoubleSlab doubleslabTileGreen = new BlockModDoubleSlab(Material.ROCK, "doubleslab_tile_green");
    public static BlockModSlab slabTileGreen = new BlockModSlab(Material.ROCK,"slab_tile_green", doubleslabTileGreen);
    public static ItemModSlab slabItemTileGreen = new ItemModSlab(slabTileGreen, doubleslabTileGreen);
    public static BlockModDoubleSlab doubleslabTileRed = new BlockModDoubleSlab(Material.ROCK, "doubleslab_tile_red");
    public static BlockModSlab slabTileRed = new BlockModSlab(Material.ROCK,"slab_tile_red", doubleslabTileRed);
    public static ItemModSlab slabItemTileRed = new ItemModSlab(slabTileRed, doubleslabTileRed);

    public static BlockVertslab vertslabTest = new BlockVertslab("vertslab_test");
    public static BlockVertslab vertslabTileBlack = new BlockVertslab("vertslab_tile_black");
    public static BlockVertslab vertslabTileBlue = new BlockVertslab("vertslab_tile_blue");
    public static BlockVertslab vertslabTileGreen = new BlockVertslab("vertslab_tile_green");
    public static BlockVertslab vertslabTileRed = new BlockVertslab("vertslab_tile_red");

    public static BlockModSand blockSandBlack = new BlockModSand("block_sand_black");
    public static BlockModSand blockSandBrown = new BlockModSand("block_sand_brown");
    public static BlockModSand blockSandGrey = new BlockModSand("block_sand_grey");
    public static BlockModSand blockSandTropic = new BlockModSand("block_sand_tropic");
    public static BlockModSand blockSandWhite = new BlockModSand("block_sand_white");


//    public static ClothesLine clothesline = new ClothesLine();

    public static BlockMoss blockMoss1 = new BlockMoss("moss1");

    public static BlockShrub blockShrub = new BlockShrub("shrub_red");
//    public static BlockMoss blockMoss2 = new BlockMoss("moss2");
//    public static BlockMoss blockMoss3 = new BlockMoss("moss3");
//    public static BlockMoss blockMoss4 = new BlockMoss("moss4");



    public static BlockWorkbench workbench = new BlockWorkbench("block_workbench");


    public static void preInit() {
        blockTest.register();
        blockTileBlack.register();
        blockTileBlue.register();
        blockTileGreen.register();
        blockTileRed.register();

        blockMoss1.register();
        blockShrub.register();
//        blockMoss2.register();
//        blockMoss3.register();
//        blockMoss4.register();






        BlueBlocks.register();
        BrownBlocks.register();
        CyanBlocks.register();
        GoldenBlocks.register();
        GreenBlocks.register();
        MagentaBlocks.register();
        PurpleBlocks.register();
        RedBlocks.register();
        WhiteBlocks.register();
        YellowBlocks.register();

        VanillaExtras.register();

        blockSandBlack.register();
        blockSandBrown.register();
        blockSandGrey.register();
        blockSandTropic.register();
        blockSandWhite.register();

        stairsTileBlack.register();
        stairsTileBlue.register();
        stairsTileGreen.register();
        stairsTileRed.register();

        slabTileBlack.register();
        doubleslabTileBlack.register();
        doubleslabTileBlack.setSlab(slabTileBlack);
        slabItemTileBlack.register();
        slabTileBlue.register();
        doubleslabTileBlue.register();
        doubleslabTileBlue.setSlab(slabTileBlue);
        slabItemTileBlue.register();
        slabTileGreen.register();
        doubleslabTileGreen.register();
        doubleslabTileGreen.setSlab(slabTileGreen);
        slabItemTileGreen.register();
        slabTileRed.register();
        doubleslabTileRed.register();
        doubleslabTileRed.setSlab(slabTileRed);
        slabItemTileRed.register();



        vertslabTest.register();

        vertslabTileBlack.register();
        vertslabTileBlue.register();
        vertslabTileGreen.register();
        vertslabTileRed.register();

//        clothesline.register();


    }

    public static void Init(){

    }

    public static void registerBlocks() {

    }

    public static void registerItemBlocks() {

    }

    public static void registerModels() {

    }

}
