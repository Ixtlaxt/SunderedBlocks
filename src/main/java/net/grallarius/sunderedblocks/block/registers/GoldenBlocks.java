package net.grallarius.sunderedblocks.block.registers;

import net.grallarius.sunderedblocks.block.*;
import net.minecraft.block.material.Material;

public class GoldenBlocks {

    public static BlockBase blockStoneGoldenDark = new BlockBase(Material.ROCK, "block_stone_golden_dark");
    public static BlockBase blockStoneGoldenDarkBrick = new BlockBase(Material.ROCK, "block_stone_golden_dark_brick");
    public static BlockBase blockStoneGoldenDarkFloor = new BlockBase(Material.ROCK, "block_stone_golden_dark_floor");
    public static BlockBase blockStoneGoldenDarkPanel = new BlockBase(Material.ROCK, "block_stone_golden_dark_panel");

    public static BlockBase blockStoneGoldenLight = new BlockBase(Material.ROCK, "block_stone_golden_light");
    public static BlockBase blockStoneGoldenLightBrick = new BlockBase(Material.ROCK, "block_stone_golden_light_brick");
    public static BlockBase blockStoneGoldenLightFloor = new BlockBase(Material.ROCK, "block_stone_golden_light_floor");
    public static BlockBase blockStoneGoldenLightPanel = new BlockBase(Material.ROCK, "block_stone_golden_light_panel");

    public static BlockBase blockStoneGoldenDarkChisel = new BlockBase(Material.ROCK, "block_stone_golden_dark_chisel");
    public static BlockModAxis blockStoneGoldenDarkTrim = new BlockModAxis(Material.ROCK, "block_stone_golden_dark_trim");

    public static BlockBase blockStoneGoldenLightChisel = new BlockBase(Material.ROCK, "block_stone_golden_light_chisel");
    public static BlockModAxis blockStoneGoldenLightTrim = new BlockModAxis(Material.ROCK, "block_stone_golden_light_trim");

    public static BlockModDoubleSlab slabDoubleStoneGoldenDark = new BlockModDoubleSlab(Material.ROCK, "slab_stone_golden_dark_double");
    public static BlockModSlab slabStoneGoldenDark = new BlockModSlab(Material.ROCK,"slab_stone_golden_dark", slabDoubleStoneGoldenDark);
    public static ItemModSlab slabItemStoneGoldenDark = new ItemModSlab(slabStoneGoldenDark, slabDoubleStoneGoldenDark);

    public static BlockModDoubleSlab slabDoubleStoneGoldenLight = new BlockModDoubleSlab(Material.ROCK, "slab_stone_golden_light_double");
    public static BlockModSlab slabStoneGoldenLight = new BlockModSlab(Material.ROCK,"slab_stone_golden_light", slabDoubleStoneGoldenLight);
    public static ItemModSlab slabItemStoneGoldenLight = new ItemModSlab(slabStoneGoldenLight, slabDoubleStoneGoldenLight);

    public static BlockModDoubleSlab slabDoubleStoneGoldenDarkFloor = new BlockModDoubleSlab(Material.ROCK, "slab_stone_golden_dark_floor_double");
    public static BlockModSlab slabStoneGoldenDarkFloor = new BlockModSlab(Material.ROCK,"slab_stone_golden_dark_floor", slabDoubleStoneGoldenDarkFloor);
    public static ItemModSlab slabItemStoneGoldenDarkFloor = new ItemModSlab(slabStoneGoldenDarkFloor, slabDoubleStoneGoldenDarkFloor);

    public static BlockModDoubleSlab slabDoubleStoneGoldenLightFloor = new BlockModDoubleSlab(Material.ROCK, "slab_stone_golden_light_floor_double");
    public static BlockModSlab slabStoneGoldenLightFloor = new BlockModSlab(Material.ROCK,"slab_stone_golden_light_floor", slabDoubleStoneGoldenLightFloor);
    public static ItemModSlab slabItemStoneGoldenLightFloor = new ItemModSlab(slabStoneGoldenLightFloor, slabDoubleStoneGoldenLightFloor);

    public static BlockModDoubleSlab slabDoubleStoneGoldenDarkBrick = new BlockModDoubleSlab(Material.ROCK, "slab_stone_golden_dark_brick_double");
    public static BlockModSlab slabStoneGoldenDarkBrick = new BlockModSlab(Material.ROCK,"slab_stone_golden_dark_brick", slabDoubleStoneGoldenDarkBrick);
    public static ItemModSlab slabItemStoneGoldenDarkBrick = new ItemModSlab(slabStoneGoldenDarkBrick, slabDoubleStoneGoldenDarkBrick);

    public static BlockModDoubleSlab slabDoubleStoneGoldenLightBrick = new BlockModDoubleSlab(Material.ROCK, "slab_stone_golden_light_brick_double");
    public static BlockModSlab slabStoneGoldenLightBrick = new BlockModSlab(Material.ROCK,"slab_stone_golden_light_brick", slabDoubleStoneGoldenLightBrick);
    public static ItemModSlab slabItemStoneGoldenLightBrick = new ItemModSlab(slabStoneGoldenLightBrick, slabDoubleStoneGoldenLightBrick);

    public static BlockPanel panelStoneGoldenDark = new BlockPanel("panel_stone_golden_dark");
    public static BlockVertslab vertslabStoneGoldenDark = new BlockVertslab("vertslab_stone_golden_dark");
    public static BlockModStairs stairsStoneGoldenDark = new BlockModStairs(blockStoneGoldenDarkPanel.getDefaultState(), "stairs_stone_golden_dark");

    public static BlockPanel panelStoneGoldenLight = new BlockPanel("panel_stone_golden_light");
    public static BlockVertslab vertslabStoneGoldenLight = new BlockVertslab("vertslab_stone_golden_light");
    public static BlockModStairs stairsStoneGoldenLight = new BlockModStairs(blockStoneGoldenLightPanel.getDefaultState(), "stairs_stone_golden_light");

    public static ItemBlockPanel panelItemStoneGoldenDark = new ItemBlockPanel(panelStoneGoldenDark);
    public static ItemBlockPanel panelItemStoneGoldenLight = new ItemBlockPanel(panelStoneGoldenLight);

    public static BlockVertslab vertslabStoneGoldenDarkRaw = new BlockVertslab("vertslab_stone_golden_dark_raw");
    public static BlockModStairs stairsStoneGoldenDarkRaw = new BlockModStairs(blockStoneGoldenDark.getDefaultState(), "stairs_stone_golden_dark_raw");

    public static BlockVertslab vertslabStoneGoldenLightRaw = new BlockVertslab("vertslab_stone_golden_light_raw");
    public static BlockModStairs stairsStoneGoldenLightRaw = new BlockModStairs(blockStoneGoldenLight.getDefaultState(), "stairs_stone_golden_light_raw");


    public static BlockModDoubleSlab slabDoubleStoneGoldenDarkRaw = new BlockModDoubleSlab(Material.ROCK, "slab_stone_golden_dark_raw_double");
    public static BlockModSlab slabStoneGoldenDarkRaw = new BlockModSlab(Material.ROCK,"slab_stone_golden_dark_raw", slabDoubleStoneGoldenDarkRaw);
    public static ItemModSlab slabItemStoneGoldenDarkRaw = new ItemModSlab(slabStoneGoldenDarkRaw, slabDoubleStoneGoldenDarkRaw);

    public static BlockModDoubleSlab slabDoubleStoneGoldenLightRaw = new BlockModDoubleSlab(Material.ROCK, "slab_stone_golden_light_raw_double");
    public static BlockModSlab slabStoneGoldenLightRaw = new BlockModSlab(Material.ROCK,"slab_stone_golden_light_raw", slabDoubleStoneGoldenLightRaw);
    public static ItemModSlab slabItemStoneGoldenLightRaw = new ItemModSlab(slabStoneGoldenLightRaw, slabDoubleStoneGoldenLightRaw);

    public static void register(){

        blockStoneGoldenDark.register();
        blockStoneGoldenDarkBrick.register();
        blockStoneGoldenDarkFloor.register();
        blockStoneGoldenDarkPanel.register();

        blockStoneGoldenDarkChisel.register();
        blockStoneGoldenDarkTrim.register();

        slabStoneGoldenDark.register();
        slabDoubleStoneGoldenDark.register();
        slabDoubleStoneGoldenDark.setSlab(slabStoneGoldenDark);
        slabItemStoneGoldenDark.register();

        slabStoneGoldenDarkFloor.register();
        slabDoubleStoneGoldenDarkFloor.register();
        slabDoubleStoneGoldenDarkFloor.setSlab(slabStoneGoldenDarkFloor);
        slabItemStoneGoldenDarkFloor.register();

        slabStoneGoldenDarkBrick.register();
        slabDoubleStoneGoldenDarkBrick.register();
        slabDoubleStoneGoldenDarkBrick.setSlab(slabStoneGoldenDarkFloor);
        slabItemStoneGoldenDarkBrick.register();

        vertslabStoneGoldenDark.register();
        panelStoneGoldenDark.register();
        stairsStoneGoldenDark.register();

        blockStoneGoldenLight.register();
        blockStoneGoldenLightBrick.register();
        blockStoneGoldenLightFloor.register();
        blockStoneGoldenLightPanel.register();

        blockStoneGoldenLightChisel.register();
        blockStoneGoldenLightTrim.register();

        slabStoneGoldenLight.register();
        slabDoubleStoneGoldenLight.register();
        slabDoubleStoneGoldenLight.setSlab(slabStoneGoldenLight);
        slabItemStoneGoldenLight.register();

        slabStoneGoldenLightFloor.register();
        slabDoubleStoneGoldenLightFloor.register();
        slabDoubleStoneGoldenLightFloor.setSlab(slabStoneGoldenLightFloor);
        slabItemStoneGoldenLightFloor.register();

        slabStoneGoldenLightBrick.register();
        slabDoubleStoneGoldenLightBrick.register();
        slabDoubleStoneGoldenLightBrick.setSlab(slabStoneGoldenLightFloor);
        slabItemStoneGoldenLightBrick.register();

        vertslabStoneGoldenLight.register();
        panelStoneGoldenLight.register();
        stairsStoneGoldenLight.register();

        panelItemStoneGoldenDark.register();
        panelItemStoneGoldenLight.register();

        slabStoneGoldenDarkRaw.register();
        slabDoubleStoneGoldenDarkRaw.register();
        slabDoubleStoneGoldenDarkRaw.setSlab(slabStoneGoldenDarkRaw);
        slabItemStoneGoldenDarkRaw.register();

        slabStoneGoldenLightRaw.register();
        slabDoubleStoneGoldenLightRaw.register();
        slabDoubleStoneGoldenLightRaw.setSlab(slabStoneGoldenLightRaw);
        slabItemStoneGoldenLightRaw.register();

        stairsStoneGoldenDarkRaw.register();
        vertslabStoneGoldenDarkRaw.register();
        stairsStoneGoldenLightRaw.register();
        vertslabStoneGoldenLightRaw.register();

    }
}
