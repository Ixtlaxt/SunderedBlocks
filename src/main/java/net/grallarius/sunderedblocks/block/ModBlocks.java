package net.grallarius.sunderedblocks.block;

import net.grallarius.sunderedblocks.block.workbench.BlockWorkbench;
import net.minecraft.block.material.Material;

public class ModBlocks {

    public static BlockBase blockTest = new BlockBase(Material.ROCK, "test_block");
    public static BlockBase crateTest = new BlockBase(Material.WOOD, "crate_test");
    public static BlockBase blockTileBlack = new BlockBase(Material.ROCK, "block_tile_black");
    public static BlockBase blockTileBlue = new BlockBase(Material.ROCK, "block_tile_blue");
    public static BlockBase blockTileGreen = new BlockBase(Material.ROCK, "block_tile_green");
    public static BlockBase blockTileRed = new BlockBase(Material.ROCK, "block_tile_red");

    public static BlockBase blockStoneBlueDark = new BlockBase(Material.ROCK, "block_stone_blue_dark");
    public static BlockBase blockStoneBlueDarkBrick = new BlockBase(Material.ROCK, "block_stone_blue_dark_brick");
    public static BlockBase blockStoneBlueDarkFloor = new BlockBase(Material.ROCK, "block_stone_blue_dark_floor");
    public static BlockBase blockStoneBlueDarkPanel = new BlockBase(Material.ROCK, "block_stone_blue_dark_panel");
    public static BlockBase blockStoneBlueLight = new BlockBase(Material.ROCK, "block_stone_blue_light");
    public static BlockBase blockStoneBlueLightBrick = new BlockBase(Material.ROCK, "block_stone_blue_light_brick");
    public static BlockBase blockStoneBlueLightFloor = new BlockBase(Material.ROCK, "block_stone_blue_light_floor");
    public static BlockBase blockStoneBlueLightPanel = new BlockBase(Material.ROCK, "block_stone_blue_light_panel");

    public static BlockModDoubleSlab slabDoubleStoneBlueDark = new BlockModDoubleSlab(Material.ROCK, "slab_stone_blue_dark_double");
    public static BlockModSlab slabStoneBlueDark = new BlockModSlab(Material.ROCK,"slab_stone_blue_dark", slabDoubleStoneBlueDark);
    public static ItemModSlab slabItemStoneBlueDark = new ItemModSlab(slabStoneBlueDark, slabDoubleStoneBlueDark);
    public static BlockModDoubleSlab slabDoubleStoneBlueDarkFloor = new BlockModDoubleSlab(Material.ROCK, "slab_stone_blue_dark_floor_double");
    public static BlockModSlab slabStoneBlueDarkFloor = new BlockModSlab(Material.ROCK,"slab_stone_blue_dark_floor", slabDoubleStoneBlueDarkFloor);
    public static ItemModSlab slabItemStoneBlueDarkFloor = new ItemModSlab(slabStoneBlueDarkFloor, slabDoubleStoneBlueDarkFloor);

    public static BlockBase blockStoneBrownDark = new BlockBase(Material.ROCK, "block_stone_brown_dark");
    public static BlockBase blockStoneBrownDarkBrick = new BlockBase(Material.ROCK, "block_stone_brown_dark_brick");
    public static BlockBase blockStoneBrownDarkFloor = new BlockBase(Material.ROCK, "block_stone_brown_dark_floor");
    public static BlockBase blockStoneBrownDarkPanel = new BlockBase(Material.ROCK, "block_stone_brown_dark_panel");
    public static BlockBase blockStoneBrownLight = new BlockBase(Material.ROCK, "block_stone_brown_light");
    public static BlockBase blockStoneBrownLightBrick = new BlockBase(Material.ROCK, "block_stone_brown_light_brick");
    public static BlockBase blockStoneBrownLightFloor = new BlockBase(Material.ROCK, "block_stone_brown_light_floor");
    public static BlockBase blockStoneBrownLightPanel = new BlockBase(Material.ROCK, "block_stone_brown_light_panel");

    public static BlockBase blockStoneCyanDark = new BlockBase(Material.ROCK, "block_stone_cyan_dark");
    public static BlockBase blockStoneCyanDarkBrick = new BlockBase(Material.ROCK, "block_stone_cyan_dark_brick");
    public static BlockBase blockStoneCyanDarkFloor = new BlockBase(Material.ROCK, "block_stone_cyan_dark_floor");
    public static BlockBase blockStoneCyanDarkPanel = new BlockBase(Material.ROCK, "block_stone_cyan_dark_panel");
    public static BlockBase blockStoneCyanLight = new BlockBase(Material.ROCK, "block_stone_cyan_light");
    public static BlockBase blockStoneCyanLightBrick = new BlockBase(Material.ROCK, "block_stone_cyan_light_brick");
    public static BlockBase blockStoneCyanLightFloor = new BlockBase(Material.ROCK, "block_stone_cyan_light_floor");
    public static BlockBase blockStoneCyanLightPanel = new BlockBase(Material.ROCK, "block_stone_cyan_light_panel");

    public static BlockBase blockStoneGreenDark = new BlockBase(Material.ROCK, "block_stone_green_dark");
    public static BlockBase blockStoneGreenDarkBrick = new BlockBase(Material.ROCK, "block_stone_green_dark_brick");
    public static BlockBase blockStoneGreenDarkFloor = new BlockBase(Material.ROCK, "block_stone_green_dark_floor");
    public static BlockBase blockStoneGreenDarkPanel = new BlockBase(Material.ROCK, "block_stone_green_dark_panel");
    public static BlockBase blockStoneGreenLight = new BlockBase(Material.ROCK, "block_stone_green_light");
    public static BlockBase blockStoneGreenLightBrick = new BlockBase(Material.ROCK, "block_stone_green_light_brick");
    public static BlockBase blockStoneGreenLightFloor = new BlockBase(Material.ROCK, "block_stone_green_light_floor");
    public static BlockBase blockStoneGreenLightPanel = new BlockBase(Material.ROCK, "block_stone_green_light_panel");

    public static BlockBase blockStoneMagentaDark = new BlockBase(Material.ROCK, "block_stone_magenta_dark");
    public static BlockBase blockStoneMagentaDarkBrick = new BlockBase(Material.ROCK, "block_stone_magenta_dark_brick");
    public static BlockBase blockStoneMagentaDarkFloor = new BlockBase(Material.ROCK, "block_stone_magenta_dark_floor");
    public static BlockBase blockStoneMagentaDarkPanel = new BlockBase(Material.ROCK, "block_stone_magenta_dark_panel");
    public static BlockBase blockStoneMagentaLight = new BlockBase(Material.ROCK, "block_stone_magenta_light");
    public static BlockBase blockStoneMagentaLightBrick = new BlockBase(Material.ROCK, "block_stone_magenta_light_brick");
    public static BlockBase blockStoneMagentaLightFloor = new BlockBase(Material.ROCK, "block_stone_magenta_light_floor");
    public static BlockBase blockStoneMagentaLightPanel = new BlockBase(Material.ROCK, "block_stone_magenta_light_panel");

    public static BlockBase blockStonePurpleDark = new BlockBase(Material.ROCK, "block_stone_purple_dark");
    public static BlockBase blockStonePurpleDarkBrick = new BlockBase(Material.ROCK, "block_stone_purple_dark_brick");
    public static BlockBase blockStonePurpleDarkFloor = new BlockBase(Material.ROCK, "block_stone_purple_dark_floor");
    public static BlockBase blockStonePurpleDarkPanel = new BlockBase(Material.ROCK, "block_stone_purple_dark_panel");
    public static BlockBase blockStonePurpleLight = new BlockBase(Material.ROCK, "block_stone_purple_light");
    public static BlockBase blockStonePurpleLightBrick = new BlockBase(Material.ROCK, "block_stone_purple_light_brick");
    public static BlockBase blockStonePurpleLightFloor = new BlockBase(Material.ROCK, "block_stone_purple_light_floor");
    public static BlockBase blockStonePurpleLightPanel = new BlockBase(Material.ROCK, "block_stone_purple_light_panel");

    public static BlockBase blockStoneRedDark = new BlockBase(Material.ROCK, "block_stone_red_dark");
    public static BlockBase blockStoneRedDarkBrick = new BlockBase(Material.ROCK, "block_stone_red_dark_brick");
    public static BlockBase blockStoneRedDarkFloor = new BlockBase(Material.ROCK, "block_stone_red_dark_floor");
    public static BlockBase blockStoneRedDarkPanel = new BlockBase(Material.ROCK, "block_stone_red_dark_panel");
    public static BlockBase blockStoneRedLight = new BlockBase(Material.ROCK, "block_stone_red_light");
    public static BlockBase blockStoneRedLightBrick = new BlockBase(Material.ROCK, "block_stone_red_light_brick");
    public static BlockBase blockStoneRedLightFloor = new BlockBase(Material.ROCK, "block_stone_red_light_floor");
    public static BlockBase blockStoneRedLightPanel = new BlockBase(Material.ROCK, "block_stone_red_light_panel");

    public static BlockBase blockStoneWhiteDark = new BlockBase(Material.ROCK, "block_stone_white_dark");
    public static BlockBase blockStoneWhiteDarkBrick = new BlockBase(Material.ROCK, "block_stone_white_dark_brick");
    public static BlockBase blockStoneWhiteDarkFloor = new BlockBase(Material.ROCK, "block_stone_white_dark_floor");
    public static BlockBase blockStoneWhiteDarkPanel = new BlockBase(Material.ROCK, "block_stone_white_dark_panel");
    public static BlockBase blockStoneWhiteLight = new BlockBase(Material.ROCK, "block_stone_white_light");
    public static BlockBase blockStoneWhiteLightBrick = new BlockBase(Material.ROCK, "block_stone_white_light_brick");
    public static BlockBase blockStoneWhiteLightFloor = new BlockBase(Material.ROCK, "block_stone_white_light_floor");
    public static BlockBase blockStoneWhiteLightPanel = new BlockBase(Material.ROCK, "block_stone_white_light_panel");

    public static BlockBase blockStoneYellowDark = new BlockBase(Material.ROCK, "block_stone_yellow_dark");
    public static BlockBase blockStoneYellowDarkBrick = new BlockBase(Material.ROCK, "block_stone_yellow_dark_brick");
    public static BlockBase blockStoneYellowDarkFloor = new BlockBase(Material.ROCK, "block_stone_yellow_dark_floor");
    public static BlockBase blockStoneYellowDarkPanel = new BlockBase(Material.ROCK, "block_stone_yellow_dark_panel");
    public static BlockBase blockStoneYellowLight = new BlockBase(Material.ROCK, "block_stone_yellow_light");
    public static BlockBase blockStoneYellowLightBrick = new BlockBase(Material.ROCK, "block_stone_yellow_light_brick");
    public static BlockBase blockStoneYellowLightFloor = new BlockBase(Material.ROCK, "block_stone_yellow_light_floor");
    public static BlockBase blockStoneYellowLightPanel = new BlockBase(Material.ROCK, "block_stone_yellow_light_panel");

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

    public static BlockCrate crateGoods = new BlockCrate("block_crate");

    public static ClothesLine clothesline = new ClothesLine();

    public static BlockWorkbench workbench = new BlockWorkbench("block_workbench");

    public static void preInit() {
        blockTest.register();
        crateTest.register();
        blockTileBlack.register();
        blockTileBlue.register();
        blockTileGreen.register();
        blockTileRed.register();

        blockStoneBlueDark.register();
        blockStoneBlueDarkBrick.register();
        blockStoneBlueDarkFloor.register();
        blockStoneBlueDarkPanel.register();
        blockStoneBlueLight.register();
        blockStoneBlueLightBrick.register();
        blockStoneBlueLightFloor.register();
        blockStoneBlueLightPanel.register();
        slabStoneBlueDark.register();
        slabDoubleStoneBlueDark.register();
        slabDoubleStoneBlueDark.setSlab(slabStoneBlueDark);
        slabItemStoneBlueDark.register();
        slabStoneBlueDarkFloor.register();
        slabDoubleStoneBlueDarkFloor.register();
        slabDoubleStoneBlueDarkFloor.setSlab(slabStoneBlueDarkFloor);
        slabItemStoneBlueDarkFloor.register();

        blockStoneBrownDark.register();
        blockStoneBrownDarkBrick.register();
        blockStoneBrownDarkFloor.register();
        blockStoneBrownDarkPanel.register();
        blockStoneBrownLight.register();
        blockStoneBrownLightBrick.register();
        blockStoneBrownLightFloor.register();
        blockStoneBrownLightPanel.register();

        blockStoneCyanDark.register();
        blockStoneCyanDarkBrick.register();
        blockStoneCyanDarkFloor.register();
        blockStoneCyanDarkPanel.register();
        blockStoneCyanLight.register();
        blockStoneCyanLightBrick.register();
        blockStoneCyanLightFloor.register();
        blockStoneCyanLightPanel.register();

        blockStoneGreenDark.register();
        blockStoneGreenDarkBrick.register();
        blockStoneGreenDarkFloor.register();
        blockStoneGreenDarkPanel.register();
        blockStoneGreenLight.register();
        blockStoneGreenLightBrick.register();
        blockStoneGreenLightFloor.register();
        blockStoneGreenLightPanel.register();

        blockStoneMagentaDark.register();
        blockStoneMagentaDarkBrick.register();
        blockStoneMagentaDarkFloor.register();
        blockStoneMagentaDarkPanel.register();
        blockStoneMagentaLight.register();
        blockStoneMagentaLightBrick.register();
        blockStoneMagentaLightFloor.register();
        blockStoneMagentaLightPanel.register();

        blockStonePurpleDark.register();
        blockStonePurpleDarkBrick.register();
        blockStonePurpleDarkFloor.register();
        blockStonePurpleDarkPanel.register();
        blockStonePurpleLight.register();
        blockStonePurpleLightBrick.register();
        blockStonePurpleLightFloor.register();
        blockStonePurpleLightPanel.register();

        blockStoneRedDark.register();
        blockStoneRedDarkBrick.register();
        blockStoneRedDarkFloor.register();
        blockStoneRedDarkPanel.register();
        blockStoneRedLight.register();
        blockStoneRedLightBrick.register();
        blockStoneRedLightFloor.register();
        blockStoneRedLightPanel.register();

        blockStoneWhiteDark.register();
        blockStoneWhiteDarkBrick.register();
        blockStoneWhiteDarkFloor.register();
        blockStoneWhiteDarkPanel.register();
        blockStoneWhiteLight.register();
        blockStoneWhiteLightBrick.register();
        blockStoneWhiteLightFloor.register();
        blockStoneWhiteLightPanel.register();

        blockStoneYellowDark.register();
        blockStoneYellowDarkBrick.register();
        blockStoneYellowDarkFloor.register();
        blockStoneYellowDarkPanel.register();
        blockStoneYellowLight.register();
        blockStoneYellowLightBrick.register();
        blockStoneYellowLightFloor.register();
        blockStoneYellowLightPanel.register();

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

        crateGoods.register();

        clothesline.register();

        workbench.register();

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
