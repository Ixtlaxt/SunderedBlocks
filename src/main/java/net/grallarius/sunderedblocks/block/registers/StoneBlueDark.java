package net.grallarius.sunderedblocks.block.registers;

import net.grallarius.sunderedblocks.block.*;
import net.minecraft.block.material.Material;

public class StoneBlueDark {

    public static BlockBase blockStoneBlueDarkRaw = new BlockBase(Material.ROCK, "block_stone_blue_dark_raw");
    public static BlockBase blockStoneBlueDarkBrick = new BlockBase(Material.ROCK, "block_stone_blue_dark_brick");
    public static BlockBase blockStoneBlueDarkFloor = new BlockBase(Material.ROCK, "block_stone_blue_dark_floor");
    public static BlockBase blockStoneBlueDarkPanel = new BlockBase(Material.ROCK, "block_stone_blue_dark_panel");
    public static BlockBase blockStoneBlueDarkChisel = new BlockBase(Material.ROCK, "block_stone_blue_dark_chisel");
    public static BlockBase blockStoneBlueDarkBrickMoss = new BlockBase(Material.ROCK, "block_stone_blue_dark_brick_moss");
    public static BlockBase blockStoneBlueDarkRawMoss = new BlockBase(Material.ROCK, "block_stone_blue_dark_raw_moss");

    public static BlockModDoubleSlab slabDoubleStoneBlueDark = new BlockModDoubleSlab(Material.ROCK, "slab_stone_blue_dark_double");
    public static BlockModSlab slabStoneBlueDark = new BlockModSlab(Material.ROCK,"slab_stone_blue_dark", slabDoubleStoneBlueDark);
    public static ItemModSlab slabItemStoneBlueDark = new ItemModSlab(slabStoneBlueDark, slabDoubleStoneBlueDark);

    public static BlockModDoubleSlab slabDoubleStoneBlueDarkFloor = new BlockModDoubleSlab(Material.ROCK, "slab_stone_blue_dark_floor_double");
    public static BlockModSlab slabStoneBlueDarkFloor = new BlockModSlab(Material.ROCK,"slab_stone_blue_dark_floor", slabDoubleStoneBlueDarkFloor);
    public static ItemModSlab slabItemStoneBlueDarkFloor = new ItemModSlab(slabStoneBlueDarkFloor, slabDoubleStoneBlueDarkFloor);

    public static BlockModDoubleSlab slabDoubleStoneBlueDarkBrick = new BlockModDoubleSlab(Material.ROCK, "slab_stone_blue_dark_brick_double");
    public static BlockModSlab slabStoneBlueDarkBrick = new BlockModSlab(Material.ROCK,"slab_stone_blue_dark_brick", slabDoubleStoneBlueDarkBrick);
    public static ItemModSlab slabItemStoneBlueDarkBrick = new ItemModSlab(slabStoneBlueDarkBrick, slabDoubleStoneBlueDarkBrick);

    public static BlockModDoubleSlab slabDoubleStoneBlueDarkRaw = new BlockModDoubleSlab(Material.ROCK, "slab_stone_blue_dark_raw_double");
    public static BlockModSlab slabStoneBlueDarkRaw = new BlockModSlab(Material.ROCK,"slab_stone_blue_dark_raw", slabDoubleStoneBlueDarkRaw);
    public static ItemModSlab slabItemStoneBlueDarkRaw = new ItemModSlab(slabStoneBlueDarkRaw, slabDoubleStoneBlueDarkRaw);

    public static BlockVertslab vertslabStoneBlueDarkPanel = new BlockVertslab("vertslab_stone_blue_dark_panel");
    public static BlockVertslab vertslabStoneBlueDarkRaw = new BlockVertslab("vertslab_stone_blue_dark_raw");

    public static BlockModStairs stairsStoneBlueDarkPanel = new BlockModStairs(blockStoneBlueDarkPanel.getDefaultState(), "stairs_stone_blue_dark_panel");
    public static BlockModStairs stairsStoneBlueDarkRaw = new BlockModStairs(blockStoneBlueDarkRaw.getDefaultState(), "stairs_stone_blue_dark_raw");
    public static BlockModStairs stairsStoneBlueDarkFloor = new BlockModStairs(blockStoneBlueDarkFloor.getDefaultState(), "stairs_stone_blue_dark_floor");

    public static BlockPanel panelStoneBlueDark = new BlockPanel("panel_stone_blue_dark");
    public static ItemBlockPanel panelItemStoneBlueDark = new ItemBlockPanel(panelStoneBlueDark);

    public static BlockModAxis blockStoneBlueDarkTrim = new BlockModAxis(Material.ROCK, "block_stone_blue_dark_trim");
    public static BlockModAxis blockStoneBlueDarkTrimCarved = new BlockModAxis(Material.ROCK, "block_stone_blue_dark_trim_carved");

    //wall

    public static void register(){

        blockStoneBlueDarkRaw.register();
        blockStoneBlueDarkBrick.register();
        blockStoneBlueDarkFloor.register();
        blockStoneBlueDarkPanel.register();
        blockStoneBlueDarkChisel.register();
        blockStoneBlueDarkBrickMoss.register();
        blockStoneBlueDarkRawMoss.register();

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

        slabStoneBlueDarkRaw.register();
        slabDoubleStoneBlueDarkRaw.register();
        slabDoubleStoneBlueDarkRaw.setSlab(slabStoneBlueDarkRaw);
        slabItemStoneBlueDarkRaw.register();

        vertslabStoneBlueDarkPanel.register();
        vertslabStoneBlueDarkRaw.register();

        stairsStoneBlueDarkPanel.register();
        stairsStoneBlueDarkRaw.register();
        stairsStoneBlueDarkFloor.register();

        panelStoneBlueDark.register();
        panelItemStoneBlueDark.register();

        blockStoneBlueDarkTrim.register();
        blockStoneBlueDarkTrimCarved.register();
    }
}
