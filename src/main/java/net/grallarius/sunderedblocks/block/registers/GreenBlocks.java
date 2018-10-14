package net.grallarius.sunderedblocks.block.registers;

import net.grallarius.sunderedblocks.block.*;
import net.minecraft.block.material.Material;

public class GreenBlocks {

    public static BlockBase blockStoneGreenDark = new BlockBase(Material.ROCK, "block_stone_green_dark");
    public static BlockBase blockStoneGreenDarkBrick = new BlockBase(Material.ROCK, "block_stone_green_dark_brick");
    public static BlockBase blockStoneGreenDarkFloor = new BlockBase(Material.ROCK, "block_stone_green_dark_floor");
    public static BlockBase blockStoneGreenDarkPanel = new BlockBase(Material.ROCK, "block_stone_green_dark_panel");

    public static BlockBase blockStoneGreenLight = new BlockBase(Material.ROCK, "block_stone_green_light");
    public static BlockBase blockStoneGreenLightBrick = new BlockBase(Material.ROCK, "block_stone_green_light_brick");
    public static BlockBase blockStoneGreenLightFloor = new BlockBase(Material.ROCK, "block_stone_green_light_floor");
    public static BlockBase blockStoneGreenLightPanel = new BlockBase(Material.ROCK, "block_stone_green_light_panel");

    public static BlockBase blockStoneGreenDarkChisel = new BlockBase(Material.ROCK, "block_stone_green_dark_chisel");
    public static BlockModAxis blockStoneGreenDarkTrim = new BlockModAxis(Material.ROCK, "block_stone_green_dark_trim");

    public static BlockBase blockStoneGreenLightChisel = new BlockBase(Material.ROCK, "block_stone_green_light_chisel");
    public static BlockModAxis blockStoneGreenLightTrim = new BlockModAxis(Material.ROCK, "block_stone_green_light_trim");

    public static BlockModDoubleSlab slabDoubleStoneGreenDark = new BlockModDoubleSlab(Material.ROCK, "slab_stone_green_dark_double");
    public static BlockModSlab slabStoneGreenDark = new BlockModSlab(Material.ROCK,"slab_stone_green_dark", slabDoubleStoneGreenDark);
    public static ItemModSlab slabItemStoneGreenDark = new ItemModSlab(slabStoneGreenDark, slabDoubleStoneGreenDark);

    public static BlockModDoubleSlab slabDoubleStoneGreenLight = new BlockModDoubleSlab(Material.ROCK, "slab_stone_green_light_double");
    public static BlockModSlab slabStoneGreenLight = new BlockModSlab(Material.ROCK,"slab_stone_green_light", slabDoubleStoneGreenLight);
    public static ItemModSlab slabItemStoneGreenLight = new ItemModSlab(slabStoneGreenLight, slabDoubleStoneGreenLight);

    public static BlockModDoubleSlab slabDoubleStoneGreenDarkFloor = new BlockModDoubleSlab(Material.ROCK, "slab_stone_green_dark_floor_double");
    public static BlockModSlab slabStoneGreenDarkFloor = new BlockModSlab(Material.ROCK,"slab_stone_green_dark_floor", slabDoubleStoneGreenDarkFloor);
    public static ItemModSlab slabItemStoneGreenDarkFloor = new ItemModSlab(slabStoneGreenDarkFloor, slabDoubleStoneGreenDarkFloor);

    public static BlockModDoubleSlab slabDoubleStoneGreenLightFloor = new BlockModDoubleSlab(Material.ROCK, "slab_stone_green_light_floor_double");
    public static BlockModSlab slabStoneGreenLightFloor = new BlockModSlab(Material.ROCK,"slab_stone_green_light_floor", slabDoubleStoneGreenLightFloor);
    public static ItemModSlab slabItemStoneGreenLightFloor = new ItemModSlab(slabStoneGreenLightFloor, slabDoubleStoneGreenLightFloor);

    public static BlockModDoubleSlab slabDoubleStoneGreenDarkBrick = new BlockModDoubleSlab(Material.ROCK, "slab_stone_green_dark_brick_double");
    public static BlockModSlab slabStoneGreenDarkBrick = new BlockModSlab(Material.ROCK,"slab_stone_green_dark_brick", slabDoubleStoneGreenDarkBrick);
    public static ItemModSlab slabItemStoneGreenDarkBrick = new ItemModSlab(slabStoneGreenDarkBrick, slabDoubleStoneGreenDarkBrick);

    public static BlockModDoubleSlab slabDoubleStoneGreenLightBrick = new BlockModDoubleSlab(Material.ROCK, "slab_stone_green_light_brick_double");
    public static BlockModSlab slabStoneGreenLightBrick = new BlockModSlab(Material.ROCK,"slab_stone_green_light_brick", slabDoubleStoneGreenLightBrick);
    public static ItemModSlab slabItemStoneGreenLightBrick = new ItemModSlab(slabStoneGreenLightBrick, slabDoubleStoneGreenLightBrick);

    public static BlockPanel panelStoneGreenDark = new BlockPanel("panel_stone_green_dark");
    public static BlockVertslab vertslabStoneGreenDark = new BlockVertslab("vertslab_stone_green_dark");
    public static BlockModStairs stairsStoneGreenDark = new BlockModStairs(blockStoneGreenDarkPanel.getDefaultState(), "stairs_stone_green_dark");

    public static BlockPanel panelStoneGreenLight = new BlockPanel("panel_stone_green_light");
    public static BlockVertslab vertslabStoneGreenLight = new BlockVertslab("vertslab_stone_green_light");
    public static BlockModStairs stairsStoneGreenLight = new BlockModStairs(blockStoneGreenLightPanel.getDefaultState(), "stairs_stone_green_light");

    public static ItemBlockPanel panelItemStoneGreenDark = new ItemBlockPanel(panelStoneGreenDark);
    public static ItemBlockPanel panelItemStoneGreenLight = new ItemBlockPanel(panelStoneGreenLight);

    public static BlockVertslab vertslabStoneGreenDarkRaw = new BlockVertslab("vertslab_stone_green_dark_raw");
    public static BlockModStairs stairsStoneGreenDarkRaw = new BlockModStairs(blockStoneGreenDark.getDefaultState(), "stairs_stone_green_dark_raw");

    public static BlockVertslab vertslabStoneGreenLightRaw = new BlockVertslab("vertslab_stone_green_light_raw");
    public static BlockModStairs stairsStoneGreenLightRaw = new BlockModStairs(blockStoneGreenLight.getDefaultState(), "stairs_stone_green_light_raw");


    public static BlockModDoubleSlab slabDoubleStoneGreenDarkRaw = new BlockModDoubleSlab(Material.ROCK, "slab_stone_green_dark_raw_double");
    public static BlockModSlab slabStoneGreenDarkRaw = new BlockModSlab(Material.ROCK,"slab_stone_green_dark_raw", slabDoubleStoneGreenDarkRaw);
    public static ItemModSlab slabItemStoneGreenDarkRaw = new ItemModSlab(slabStoneGreenDarkRaw, slabDoubleStoneGreenDarkRaw);

    public static BlockModDoubleSlab slabDoubleStoneGreenLightRaw = new BlockModDoubleSlab(Material.ROCK, "slab_stone_green_light_raw_double");
    public static BlockModSlab slabStoneGreenLightRaw = new BlockModSlab(Material.ROCK,"slab_stone_green_light_raw", slabDoubleStoneGreenLightRaw);
    public static ItemModSlab slabItemStoneGreenLightRaw = new ItemModSlab(slabStoneGreenLightRaw, slabDoubleStoneGreenLightRaw);

    public static void register(){

        blockStoneGreenDark.register();
        blockStoneGreenDarkBrick.register();
        blockStoneGreenDarkFloor.register();
        blockStoneGreenDarkPanel.register();

        blockStoneGreenDarkChisel.register();
        blockStoneGreenDarkTrim.register();

        slabStoneGreenDark.register();
        slabDoubleStoneGreenDark.register();
        slabDoubleStoneGreenDark.setSlab(slabStoneGreenDark);
        slabItemStoneGreenDark.register();

        slabStoneGreenDarkFloor.register();
        slabDoubleStoneGreenDarkFloor.register();
        slabDoubleStoneGreenDarkFloor.setSlab(slabStoneGreenDarkFloor);
        slabItemStoneGreenDarkFloor.register();

        slabStoneGreenDarkBrick.register();
        slabDoubleStoneGreenDarkBrick.register();
        slabDoubleStoneGreenDarkBrick.setSlab(slabStoneGreenDarkFloor);
        slabItemStoneGreenDarkBrick.register();

        vertslabStoneGreenDark.register();
        panelStoneGreenDark.register();
        stairsStoneGreenDark.register();

        blockStoneGreenLight.register();
        blockStoneGreenLightBrick.register();
        blockStoneGreenLightFloor.register();
        blockStoneGreenLightPanel.register();

        blockStoneGreenLightChisel.register();
        blockStoneGreenLightTrim.register();

        slabStoneGreenLight.register();
        slabDoubleStoneGreenLight.register();
        slabDoubleStoneGreenLight.setSlab(slabStoneGreenLight);
        slabItemStoneGreenLight.register();

        slabStoneGreenLightFloor.register();
        slabDoubleStoneGreenLightFloor.register();
        slabDoubleStoneGreenLightFloor.setSlab(slabStoneGreenLightFloor);
        slabItemStoneGreenLightFloor.register();

        slabStoneGreenLightBrick.register();
        slabDoubleStoneGreenLightBrick.register();
        slabDoubleStoneGreenLightBrick.setSlab(slabStoneGreenLightFloor);
        slabItemStoneGreenLightBrick.register();

        vertslabStoneGreenLight.register();
        panelStoneGreenLight.register();
        stairsStoneGreenLight.register();

        panelItemStoneGreenDark.register();
        panelItemStoneGreenLight.register();

        slabStoneGreenDarkRaw.register();
        slabDoubleStoneGreenDarkRaw.register();
        slabDoubleStoneGreenDarkRaw.setSlab(slabStoneGreenDarkRaw);
        slabItemStoneGreenDarkRaw.register();

        slabStoneGreenLightRaw.register();
        slabDoubleStoneGreenLightRaw.register();
        slabDoubleStoneGreenLightRaw.setSlab(slabStoneGreenLightRaw);
        slabItemStoneGreenLightRaw.register();

        stairsStoneGreenDarkRaw.register();
        vertslabStoneGreenDarkRaw.register();
        stairsStoneGreenLightRaw.register();
        vertslabStoneGreenLightRaw.register();

    }
}
