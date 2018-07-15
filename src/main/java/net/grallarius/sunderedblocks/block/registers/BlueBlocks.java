package net.grallarius.sunderedblocks.block.registers;

import net.grallarius.sunderedblocks.block.*;
import net.minecraft.block.material.Material;

public class BlueBlocks {

    public static BlockBase blockStoneBlueDark = new BlockBase(Material.ROCK, "block_stone_blue_dark");
    public static BlockBase blockStoneBlueDarkBrick = new BlockBase(Material.ROCK, "block_stone_blue_dark_brick");
    public static BlockBase blockStoneBlueDarkFloor = new BlockBase(Material.ROCK, "block_stone_blue_dark_floor");
    public static BlockBase blockStoneBlueDarkPanel = new BlockBase(Material.ROCK, "block_stone_blue_dark_panel");

    public static BlockBase blockStoneBlueLight = new BlockBase(Material.ROCK, "block_stone_blue_light");
    public static BlockBase blockStoneBlueLightBrick = new BlockBase(Material.ROCK, "block_stone_blue_light_brick");
    public static BlockBase blockStoneBlueLightFloor = new BlockBase(Material.ROCK, "block_stone_blue_light_floor");
    public static BlockBase blockStoneBlueLightPanel = new BlockBase(Material.ROCK, "block_stone_blue_light_panel");

    public static BlockBase blockStoneBlueDarkChisel = new BlockBase(Material.ROCK, "block_stone_blue_dark_chisel");
    public static BlockModAxis blockStoneBlueDarkTrim = new BlockModAxis(Material.ROCK, "block_stone_blue_dark_trim");

    public static BlockBase blockStoneBlueLightChisel = new BlockBase(Material.ROCK, "block_stone_blue_light_chisel");
    public static BlockModAxis blockStoneBlueLightTrim = new BlockModAxis(Material.ROCK, "block_stone_blue_light_trim");

    public static BlockModDoubleSlab slabDoubleStoneBlueDark = new BlockModDoubleSlab(Material.ROCK, "slab_stone_blue_dark_double");
    public static BlockModSlab slabStoneBlueDark = new BlockModSlab(Material.ROCK,"slab_stone_blue_dark", slabDoubleStoneBlueDark);
    public static ItemModSlab slabItemStoneBlueDark = new ItemModSlab(slabStoneBlueDark, slabDoubleStoneBlueDark);

    public static BlockModDoubleSlab slabDoubleStoneBlueLight = new BlockModDoubleSlab(Material.ROCK, "slab_stone_blue_light_double");
    public static BlockModSlab slabStoneBlueLight = new BlockModSlab(Material.ROCK,"slab_stone_blue_light", slabDoubleStoneBlueLight);
    public static ItemModSlab slabItemStoneBlueLight = new ItemModSlab(slabStoneBlueLight, slabDoubleStoneBlueLight);

    public static BlockModDoubleSlab slabDoubleStoneBlueDarkFloor = new BlockModDoubleSlab(Material.ROCK, "slab_stone_blue_dark_floor_double");
    public static BlockModSlab slabStoneBlueDarkFloor = new BlockModSlab(Material.ROCK,"slab_stone_blue_dark_floor", slabDoubleStoneBlueDarkFloor);
    public static ItemModSlab slabItemStoneBlueDarkFloor = new ItemModSlab(slabStoneBlueDarkFloor, slabDoubleStoneBlueDarkFloor);

    public static BlockModDoubleSlab slabDoubleStoneBlueLightFloor = new BlockModDoubleSlab(Material.ROCK, "slab_stone_blue_light_floor_double");
    public static BlockModSlab slabStoneBlueLightFloor = new BlockModSlab(Material.ROCK,"slab_stone_blue_light_floor", slabDoubleStoneBlueLightFloor);
    public static ItemModSlab slabItemStoneBlueLightFloor = new ItemModSlab(slabStoneBlueLightFloor, slabDoubleStoneBlueLightFloor);

    public static BlockModDoubleSlab slabDoubleStoneBlueDarkBrick = new BlockModDoubleSlab(Material.ROCK, "slab_stone_blue_dark_brick_double");
    public static BlockModSlab slabStoneBlueDarkBrick = new BlockModSlab(Material.ROCK,"slab_stone_blue_dark_brick", slabDoubleStoneBlueDarkBrick);
    public static ItemModSlab slabItemStoneBlueDarkBrick = new ItemModSlab(slabStoneBlueDarkBrick, slabDoubleStoneBlueDarkBrick);

    public static BlockModDoubleSlab slabDoubleStoneBlueLightBrick = new BlockModDoubleSlab(Material.ROCK, "slab_stone_blue_light_brick_double");
    public static BlockModSlab slabStoneBlueLightBrick = new BlockModSlab(Material.ROCK,"slab_stone_blue_light_brick", slabDoubleStoneBlueLightBrick);
    public static ItemModSlab slabItemStoneBlueLightBrick = new ItemModSlab(slabStoneBlueLightBrick, slabDoubleStoneBlueLightBrick);

    public static BlockPanel panelStoneBlueDark = new BlockPanel("panel_stone_blue_dark");
    public static BlockVertslab vertslabStoneBlueDark = new BlockVertslab("vertslab_stone_blue_dark");
    public static BlockModStairs stairsStoneBlueDark = new BlockModStairs(blockStoneBlueDarkPanel.getDefaultState(), "stairs_stone_blue_dark");

    public static BlockPanel panelStoneBlueLight = new BlockPanel("panel_stone_blue_light");
    public static BlockVertslab vertslabStoneBlueLight = new BlockVertslab("vertslab_stone_blue_light");
    public static BlockModStairs stairsStoneBlueLight = new BlockModStairs(blockStoneBlueLightPanel.getDefaultState(), "stairs_stone_blue_light");


    public static void register(){

        blockStoneBlueDark.register();
        blockStoneBlueDarkBrick.register();
        blockStoneBlueDarkFloor.register();
        blockStoneBlueDarkPanel.register();

        blockStoneBlueDarkChisel.register();
        blockStoneBlueDarkTrim.register();

        slabStoneBlueDark.register();
        slabDoubleStoneBlueDark.register();
        slabDoubleStoneBlueDark.setSlab(slabStoneBlueDark);
        slabItemStoneBlueDark.register();

        slabStoneBlueDarkFloor.register();
        slabDoubleStoneBlueDarkFloor.register();
        slabDoubleStoneBlueDarkFloor.setSlab(slabStoneBlueDarkFloor);
        slabItemStoneBlueDarkFloor.register();

        slabStoneBlueDarkBrick.register();
        slabDoubleStoneBlueDarkBrick.register();
        slabDoubleStoneBlueDarkBrick.setSlab(slabStoneBlueDarkFloor);
        slabItemStoneBlueDarkBrick.register();

        vertslabStoneBlueDark.register();
        panelStoneBlueDark.register();
        stairsStoneBlueDark.register();

        blockStoneBlueLight.register();
        blockStoneBlueLightBrick.register();
        blockStoneBlueLightFloor.register();
        blockStoneBlueLightPanel.register();

        blockStoneBlueLightChisel.register();
        blockStoneBlueLightTrim.register();

        slabStoneBlueLight.register();
        slabDoubleStoneBlueLight.register();
        slabDoubleStoneBlueLight.setSlab(slabStoneBlueLight);
        slabItemStoneBlueLight.register();

        slabStoneBlueLightFloor.register();
        slabDoubleStoneBlueLightFloor.register();
        slabDoubleStoneBlueLightFloor.setSlab(slabStoneBlueLightFloor);
        slabItemStoneBlueLightFloor.register();

        slabStoneBlueLightBrick.register();
        slabDoubleStoneBlueLightBrick.register();
        slabDoubleStoneBlueLightBrick.setSlab(slabStoneBlueLightFloor);
        slabItemStoneBlueLightBrick.register();

        vertslabStoneBlueLight.register();
        panelStoneBlueLight.register();
        stairsStoneBlueLight.register();

    }
}
