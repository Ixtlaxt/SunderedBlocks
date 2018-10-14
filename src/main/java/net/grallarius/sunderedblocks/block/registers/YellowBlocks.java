package net.grallarius.sunderedblocks.block.registers;

import net.grallarius.sunderedblocks.block.*;
import net.minecraft.block.material.Material;

public class YellowBlocks {

    public static BlockBase blockStoneYellowDark = new BlockBase(Material.ROCK, "block_stone_yellow_dark");
    public static BlockBase blockStoneYellowDarkBrick = new BlockBase(Material.ROCK, "block_stone_yellow_dark_brick");
    public static BlockBase blockStoneYellowDarkFloor = new BlockBase(Material.ROCK, "block_stone_yellow_dark_floor");
    public static BlockBase blockStoneYellowDarkPanel = new BlockBase(Material.ROCK, "block_stone_yellow_dark_panel");

    public static BlockBase blockStoneYellowLight = new BlockBase(Material.ROCK, "block_stone_yellow_light");
    public static BlockBase blockStoneYellowLightBrick = new BlockBase(Material.ROCK, "block_stone_yellow_light_brick");
    public static BlockBase blockStoneYellowLightFloor = new BlockBase(Material.ROCK, "block_stone_yellow_light_floor");
    public static BlockBase blockStoneYellowLightPanel = new BlockBase(Material.ROCK, "block_stone_yellow_light_panel");

    public static BlockBase blockStoneYellowDarkChisel = new BlockBase(Material.ROCK, "block_stone_yellow_dark_chisel");
    public static BlockModAxis blockStoneYellowDarkTrim = new BlockModAxis(Material.ROCK, "block_stone_yellow_dark_trim");

    public static BlockBase blockStoneYellowLightChisel = new BlockBase(Material.ROCK, "block_stone_yellow_light_chisel");
    public static BlockModAxis blockStoneYellowLightTrim = new BlockModAxis(Material.ROCK, "block_stone_yellow_light_trim");

    public static BlockModDoubleSlab slabDoubleStoneYellowDark = new BlockModDoubleSlab(Material.ROCK, "slab_stone_yellow_dark_double");
    public static BlockModSlab slabStoneYellowDark = new BlockModSlab(Material.ROCK,"slab_stone_yellow_dark", slabDoubleStoneYellowDark);
    public static ItemModSlab slabItemStoneYellowDark = new ItemModSlab(slabStoneYellowDark, slabDoubleStoneYellowDark);

    public static BlockModDoubleSlab slabDoubleStoneYellowLight = new BlockModDoubleSlab(Material.ROCK, "slab_stone_yellow_light_double");
    public static BlockModSlab slabStoneYellowLight = new BlockModSlab(Material.ROCK,"slab_stone_yellow_light", slabDoubleStoneYellowLight);
    public static ItemModSlab slabItemStoneYellowLight = new ItemModSlab(slabStoneYellowLight, slabDoubleStoneYellowLight);

    public static BlockModDoubleSlab slabDoubleStoneYellowDarkFloor = new BlockModDoubleSlab(Material.ROCK, "slab_stone_yellow_dark_floor_double");
    public static BlockModSlab slabStoneYellowDarkFloor = new BlockModSlab(Material.ROCK,"slab_stone_yellow_dark_floor", slabDoubleStoneYellowDarkFloor);
    public static ItemModSlab slabItemStoneYellowDarkFloor = new ItemModSlab(slabStoneYellowDarkFloor, slabDoubleStoneYellowDarkFloor);

    public static BlockModDoubleSlab slabDoubleStoneYellowLightFloor = new BlockModDoubleSlab(Material.ROCK, "slab_stone_yellow_light_floor_double");
    public static BlockModSlab slabStoneYellowLightFloor = new BlockModSlab(Material.ROCK,"slab_stone_yellow_light_floor", slabDoubleStoneYellowLightFloor);
    public static ItemModSlab slabItemStoneYellowLightFloor = new ItemModSlab(slabStoneYellowLightFloor, slabDoubleStoneYellowLightFloor);

    public static BlockModDoubleSlab slabDoubleStoneYellowDarkBrick = new BlockModDoubleSlab(Material.ROCK, "slab_stone_yellow_dark_brick_double");
    public static BlockModSlab slabStoneYellowDarkBrick = new BlockModSlab(Material.ROCK,"slab_stone_yellow_dark_brick", slabDoubleStoneYellowDarkBrick);
    public static ItemModSlab slabItemStoneYellowDarkBrick = new ItemModSlab(slabStoneYellowDarkBrick, slabDoubleStoneYellowDarkBrick);

    public static BlockModDoubleSlab slabDoubleStoneYellowLightBrick = new BlockModDoubleSlab(Material.ROCK, "slab_stone_yellow_light_brick_double");
    public static BlockModSlab slabStoneYellowLightBrick = new BlockModSlab(Material.ROCK,"slab_stone_yellow_light_brick", slabDoubleStoneYellowLightBrick);
    public static ItemModSlab slabItemStoneYellowLightBrick = new ItemModSlab(slabStoneYellowLightBrick, slabDoubleStoneYellowLightBrick);

    public static BlockPanel panelStoneYellowDark = new BlockPanel("panel_stone_yellow_dark");
    public static BlockVertslab vertslabStoneYellowDark = new BlockVertslab("vertslab_stone_yellow_dark");
    public static BlockModStairs stairsStoneYellowDark = new BlockModStairs(blockStoneYellowDarkPanel.getDefaultState(), "stairs_stone_yellow_dark");

    public static BlockPanel panelStoneYellowLight = new BlockPanel("panel_stone_yellow_light");
    public static BlockVertslab vertslabStoneYellowLight = new BlockVertslab("vertslab_stone_yellow_light");
    public static BlockModStairs stairsStoneYellowLight = new BlockModStairs(blockStoneYellowLightPanel.getDefaultState(), "stairs_stone_yellow_light");

    public static ItemBlockPanel panelItemStoneYellowDark = new ItemBlockPanel(panelStoneYellowDark);
    public static ItemBlockPanel panelItemStoneYellowLight = new ItemBlockPanel(panelStoneYellowLight);

    public static BlockVertslab vertslabStoneYellowDarkRaw = new BlockVertslab("vertslab_stone_yellow_dark_raw");
    public static BlockModStairs stairsStoneYellowDarkRaw = new BlockModStairs(blockStoneYellowDark.getDefaultState(), "stairs_stone_yellow_dark_raw");

    public static BlockVertslab vertslabStoneYellowLightRaw = new BlockVertslab("vertslab_stone_yellow_light_raw");
    public static BlockModStairs stairsStoneYellowLightRaw = new BlockModStairs(blockStoneYellowLight.getDefaultState(), "stairs_stone_yellow_light_raw");


    public static BlockModDoubleSlab slabDoubleStoneYellowDarkRaw = new BlockModDoubleSlab(Material.ROCK, "slab_stone_yellow_dark_raw_double");
    public static BlockModSlab slabStoneYellowDarkRaw = new BlockModSlab(Material.ROCK,"slab_stone_yellow_dark_raw", slabDoubleStoneYellowDarkRaw);
    public static ItemModSlab slabItemStoneYellowDarkRaw = new ItemModSlab(slabStoneYellowDarkRaw, slabDoubleStoneYellowDarkRaw);

    public static BlockModDoubleSlab slabDoubleStoneYellowLightRaw = new BlockModDoubleSlab(Material.ROCK, "slab_stone_yellow_light_raw_double");
    public static BlockModSlab slabStoneYellowLightRaw = new BlockModSlab(Material.ROCK,"slab_stone_yellow_light_raw", slabDoubleStoneYellowLightRaw);
    public static ItemModSlab slabItemStoneYellowLightRaw = new ItemModSlab(slabStoneYellowLightRaw, slabDoubleStoneYellowLightRaw);

    public static void register(){

        blockStoneYellowDark.register();
        blockStoneYellowDarkBrick.register();
        blockStoneYellowDarkFloor.register();
        blockStoneYellowDarkPanel.register();

        blockStoneYellowDarkChisel.register();
        blockStoneYellowDarkTrim.register();

        slabStoneYellowDark.register();
        slabDoubleStoneYellowDark.register();
        slabDoubleStoneYellowDark.setSlab(slabStoneYellowDark);
        slabItemStoneYellowDark.register();

        slabStoneYellowDarkFloor.register();
        slabDoubleStoneYellowDarkFloor.register();
        slabDoubleStoneYellowDarkFloor.setSlab(slabStoneYellowDarkFloor);
        slabItemStoneYellowDarkFloor.register();

        slabStoneYellowDarkBrick.register();
        slabDoubleStoneYellowDarkBrick.register();
        slabDoubleStoneYellowDarkBrick.setSlab(slabStoneYellowDarkFloor);
        slabItemStoneYellowDarkBrick.register();

        vertslabStoneYellowDark.register();
        panelStoneYellowDark.register();
        stairsStoneYellowDark.register();

        blockStoneYellowLight.register();
        blockStoneYellowLightBrick.register();
        blockStoneYellowLightFloor.register();
        blockStoneYellowLightPanel.register();

        blockStoneYellowLightChisel.register();
        blockStoneYellowLightTrim.register();

        slabStoneYellowLight.register();
        slabDoubleStoneYellowLight.register();
        slabDoubleStoneYellowLight.setSlab(slabStoneYellowLight);
        slabItemStoneYellowLight.register();

        slabStoneYellowLightFloor.register();
        slabDoubleStoneYellowLightFloor.register();
        slabDoubleStoneYellowLightFloor.setSlab(slabStoneYellowLightFloor);
        slabItemStoneYellowLightFloor.register();

        slabStoneYellowLightBrick.register();
        slabDoubleStoneYellowLightBrick.register();
        slabDoubleStoneYellowLightBrick.setSlab(slabStoneYellowLightFloor);
        slabItemStoneYellowLightBrick.register();

        vertslabStoneYellowLight.register();
        panelStoneYellowLight.register();
        stairsStoneYellowLight.register();

        panelItemStoneYellowDark.register();
        panelItemStoneYellowLight.register();

        slabStoneYellowDarkRaw.register();
        slabDoubleStoneYellowDarkRaw.register();
        slabDoubleStoneYellowDarkRaw.setSlab(slabStoneYellowDarkRaw);
        slabItemStoneYellowDarkRaw.register();

        slabStoneYellowLightRaw.register();
        slabDoubleStoneYellowLightRaw.register();
        slabDoubleStoneYellowLightRaw.setSlab(slabStoneYellowLightRaw);
        slabItemStoneYellowLightRaw.register();

        stairsStoneYellowDarkRaw.register();
        vertslabStoneYellowDarkRaw.register();
        stairsStoneYellowLightRaw.register();
        vertslabStoneYellowLightRaw.register();
    }
}
