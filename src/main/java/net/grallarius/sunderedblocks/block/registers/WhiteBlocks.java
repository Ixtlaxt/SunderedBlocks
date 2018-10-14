package net.grallarius.sunderedblocks.block.registers;

import net.grallarius.sunderedblocks.block.*;
import net.minecraft.block.material.Material;

public class WhiteBlocks {

    public static BlockBase blockStoneWhiteDark = new BlockBase(Material.ROCK, "block_stone_white_dark");
    public static BlockBase blockStoneWhiteDarkBrick = new BlockBase(Material.ROCK, "block_stone_white_dark_brick");
    public static BlockBase blockStoneWhiteDarkFloor = new BlockBase(Material.ROCK, "block_stone_white_dark_floor");
    public static BlockBase blockStoneWhiteDarkPanel = new BlockBase(Material.ROCK, "block_stone_white_dark_panel");

    public static BlockBase blockStoneWhiteLight = new BlockBase(Material.ROCK, "block_stone_white_light");
    public static BlockBase blockStoneWhiteLightBrick = new BlockBase(Material.ROCK, "block_stone_white_light_brick");
    public static BlockBase blockStoneWhiteLightFloor = new BlockBase(Material.ROCK, "block_stone_white_light_floor");
    public static BlockBase blockStoneWhiteLightPanel = new BlockBase(Material.ROCK, "block_stone_white_light_panel");

    public static BlockBase blockStoneWhiteDarkChisel = new BlockBase(Material.ROCK, "block_stone_white_dark_chisel");
    public static BlockModAxis blockStoneWhiteDarkTrim = new BlockModAxis(Material.ROCK, "block_stone_white_dark_trim");

    public static BlockBase blockStoneWhiteLightChisel = new BlockBase(Material.ROCK, "block_stone_white_light_chisel");
    public static BlockModAxis blockStoneWhiteLightTrim = new BlockModAxis(Material.ROCK, "block_stone_white_light_trim");

    public static BlockModDoubleSlab slabDoubleStoneWhiteDark = new BlockModDoubleSlab(Material.ROCK, "slab_stone_white_dark_double");
    public static BlockModSlab slabStoneWhiteDark = new BlockModSlab(Material.ROCK,"slab_stone_white_dark", slabDoubleStoneWhiteDark);
    public static ItemModSlab slabItemStoneWhiteDark = new ItemModSlab(slabStoneWhiteDark, slabDoubleStoneWhiteDark);

    public static BlockModDoubleSlab slabDoubleStoneWhiteLight = new BlockModDoubleSlab(Material.ROCK, "slab_stone_white_light_double");
    public static BlockModSlab slabStoneWhiteLight = new BlockModSlab(Material.ROCK,"slab_stone_white_light", slabDoubleStoneWhiteLight);
    public static ItemModSlab slabItemStoneWhiteLight = new ItemModSlab(slabStoneWhiteLight, slabDoubleStoneWhiteLight);

    public static BlockModDoubleSlab slabDoubleStoneWhiteDarkFloor = new BlockModDoubleSlab(Material.ROCK, "slab_stone_white_dark_floor_double");
    public static BlockModSlab slabStoneWhiteDarkFloor = new BlockModSlab(Material.ROCK,"slab_stone_white_dark_floor", slabDoubleStoneWhiteDarkFloor);
    public static ItemModSlab slabItemStoneWhiteDarkFloor = new ItemModSlab(slabStoneWhiteDarkFloor, slabDoubleStoneWhiteDarkFloor);

    public static BlockModDoubleSlab slabDoubleStoneWhiteLightFloor = new BlockModDoubleSlab(Material.ROCK, "slab_stone_white_light_floor_double");
    public static BlockModSlab slabStoneWhiteLightFloor = new BlockModSlab(Material.ROCK,"slab_stone_white_light_floor", slabDoubleStoneWhiteLightFloor);
    public static ItemModSlab slabItemStoneWhiteLightFloor = new ItemModSlab(slabStoneWhiteLightFloor, slabDoubleStoneWhiteLightFloor);

    public static BlockModDoubleSlab slabDoubleStoneWhiteDarkBrick = new BlockModDoubleSlab(Material.ROCK, "slab_stone_white_dark_brick_double");
    public static BlockModSlab slabStoneWhiteDarkBrick = new BlockModSlab(Material.ROCK,"slab_stone_white_dark_brick", slabDoubleStoneWhiteDarkBrick);
    public static ItemModSlab slabItemStoneWhiteDarkBrick = new ItemModSlab(slabStoneWhiteDarkBrick, slabDoubleStoneWhiteDarkBrick);

    public static BlockModDoubleSlab slabDoubleStoneWhiteLightBrick = new BlockModDoubleSlab(Material.ROCK, "slab_stone_white_light_brick_double");
    public static BlockModSlab slabStoneWhiteLightBrick = new BlockModSlab(Material.ROCK,"slab_stone_white_light_brick", slabDoubleStoneWhiteLightBrick);
    public static ItemModSlab slabItemStoneWhiteLightBrick = new ItemModSlab(slabStoneWhiteLightBrick, slabDoubleStoneWhiteLightBrick);

    public static BlockPanel panelStoneWhiteDark = new BlockPanel("panel_stone_white_dark");
    public static BlockVertslab vertslabStoneWhiteDark = new BlockVertslab("vertslab_stone_white_dark");
    public static BlockModStairs stairsStoneWhiteDark = new BlockModStairs(blockStoneWhiteDarkPanel.getDefaultState(), "stairs_stone_white_dark");

    public static BlockPanel panelStoneWhiteLight = new BlockPanel("panel_stone_white_light");
    public static BlockVertslab vertslabStoneWhiteLight = new BlockVertslab("vertslab_stone_white_light");
    public static BlockModStairs stairsStoneWhiteLight = new BlockModStairs(blockStoneWhiteLightPanel.getDefaultState(), "stairs_stone_white_light");

    public static ItemBlockPanel panelItemStoneWhiteDark = new ItemBlockPanel(panelStoneWhiteDark);
    public static ItemBlockPanel panelItemStoneWhiteLight = new ItemBlockPanel(panelStoneWhiteLight);

    public static BlockVertslab vertslabStoneWhiteDarkRaw = new BlockVertslab("vertslab_stone_white_dark_raw");
    public static BlockModStairs stairsStoneWhiteDarkRaw = new BlockModStairs(blockStoneWhiteDark.getDefaultState(), "stairs_stone_white_dark_raw");

    public static BlockVertslab vertslabStoneWhiteLightRaw = new BlockVertslab("vertslab_stone_white_light_raw");
    public static BlockModStairs stairsStoneWhiteLightRaw = new BlockModStairs(blockStoneWhiteLight.getDefaultState(), "stairs_stone_white_light_raw");


    public static BlockModDoubleSlab slabDoubleStoneWhiteDarkRaw = new BlockModDoubleSlab(Material.ROCK, "slab_stone_white_dark_raw_double");
    public static BlockModSlab slabStoneWhiteDarkRaw = new BlockModSlab(Material.ROCK,"slab_stone_white_dark_raw", slabDoubleStoneWhiteDarkRaw);
    public static ItemModSlab slabItemStoneWhiteDarkRaw = new ItemModSlab(slabStoneWhiteDarkRaw, slabDoubleStoneWhiteDarkRaw);

    public static BlockModDoubleSlab slabDoubleStoneWhiteLightRaw = new BlockModDoubleSlab(Material.ROCK, "slab_stone_white_light_raw_double");
    public static BlockModSlab slabStoneWhiteLightRaw = new BlockModSlab(Material.ROCK,"slab_stone_white_light_raw", slabDoubleStoneWhiteLightRaw);
    public static ItemModSlab slabItemStoneWhiteLightRaw = new ItemModSlab(slabStoneWhiteLightRaw, slabDoubleStoneWhiteLightRaw);


    public static void register(){

        blockStoneWhiteDark.register();
        blockStoneWhiteDarkBrick.register();
        blockStoneWhiteDarkFloor.register();
        blockStoneWhiteDarkPanel.register();

        blockStoneWhiteDarkChisel.register();
        blockStoneWhiteDarkTrim.register();

        slabStoneWhiteDark.register();
        slabDoubleStoneWhiteDark.register();
        slabDoubleStoneWhiteDark.setSlab(slabStoneWhiteDark);
        slabItemStoneWhiteDark.register();

        slabStoneWhiteDarkFloor.register();
        slabDoubleStoneWhiteDarkFloor.register();
        slabDoubleStoneWhiteDarkFloor.setSlab(slabStoneWhiteDarkFloor);
        slabItemStoneWhiteDarkFloor.register();

        slabStoneWhiteDarkBrick.register();
        slabDoubleStoneWhiteDarkBrick.register();
        slabDoubleStoneWhiteDarkBrick.setSlab(slabStoneWhiteDarkFloor);
        slabItemStoneWhiteDarkBrick.register();

        vertslabStoneWhiteDark.register();
        panelStoneWhiteDark.register();
        stairsStoneWhiteDark.register();

        blockStoneWhiteLight.register();
        blockStoneWhiteLightBrick.register();
        blockStoneWhiteLightFloor.register();
        blockStoneWhiteLightPanel.register();

        blockStoneWhiteLightChisel.register();
        blockStoneWhiteLightTrim.register();

        slabStoneWhiteLight.register();
        slabDoubleStoneWhiteLight.register();
        slabDoubleStoneWhiteLight.setSlab(slabStoneWhiteLight);
        slabItemStoneWhiteLight.register();

        slabStoneWhiteLightFloor.register();
        slabDoubleStoneWhiteLightFloor.register();
        slabDoubleStoneWhiteLightFloor.setSlab(slabStoneWhiteLightFloor);
        slabItemStoneWhiteLightFloor.register();

        slabStoneWhiteLightBrick.register();
        slabDoubleStoneWhiteLightBrick.register();
        slabDoubleStoneWhiteLightBrick.setSlab(slabStoneWhiteLightFloor);
        slabItemStoneWhiteLightBrick.register();

        vertslabStoneWhiteLight.register();
        panelStoneWhiteLight.register();
        stairsStoneWhiteLight.register();

        panelItemStoneWhiteDark.register();
        panelItemStoneWhiteLight.register();

        slabStoneWhiteDarkRaw.register();
        slabDoubleStoneWhiteDarkRaw.register();
        slabDoubleStoneWhiteDarkRaw.setSlab(slabStoneWhiteDarkRaw);
        slabItemStoneWhiteDarkRaw.register();

        slabStoneWhiteLightRaw.register();
        slabDoubleStoneWhiteLightRaw.register();
        slabDoubleStoneWhiteLightRaw.setSlab(slabStoneWhiteLightRaw);
        slabItemStoneWhiteLightRaw.register();

        stairsStoneWhiteDarkRaw.register();
        vertslabStoneWhiteDarkRaw.register();
        stairsStoneWhiteLightRaw.register();
        vertslabStoneWhiteLightRaw.register();

    }
}
