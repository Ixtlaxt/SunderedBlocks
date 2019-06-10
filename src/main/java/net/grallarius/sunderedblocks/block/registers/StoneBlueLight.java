package net.grallarius.sunderedblocks.block.registers;

import net.grallarius.sunderedblocks.block.*;
import net.minecraft.block.material.Material;

public class StoneBlueLight {

    public static BlockBase blockStoneBlueLightRaw = new BlockBase(Material.ROCK, "block_stone_blue_light_raw");
    public static BlockBase blockStoneBlueLightBrick = new BlockBase(Material.ROCK, "block_stone_blue_light_brick");
    public static BlockBase blockStoneBlueLightFloor = new BlockBase(Material.ROCK, "block_stone_blue_light_floor");
    public static BlockBase blockStoneBlueLightPanel = new BlockBase(Material.ROCK, "block_stone_blue_light_panel");
    public static BlockBase blockStoneBlueLightChisel = new BlockBase(Material.ROCK, "block_stone_blue_light_chisel");
    public static BlockBase blockStoneBlueLightBrickMoss = new BlockBase(Material.ROCK, "block_stone_blue_light_brick_moss");
    public static BlockBase blockStoneBlueLightRawMoss = new BlockBase(Material.ROCK, "block_stone_blue_light_raw_moss");

    public static BlockModDoubleSlab slabDoubleStoneBlueLight = new BlockModDoubleSlab(Material.ROCK, "slab_stone_blue_light_double");
    public static BlockModSlab slabStoneBlueLight = new BlockModSlab(Material.ROCK,"slab_stone_blue_light", slabDoubleStoneBlueLight);
    public static ItemModSlab slabItemStoneBlueLight = new ItemModSlab(slabStoneBlueLight, slabDoubleStoneBlueLight);

    public static BlockModDoubleSlab slabDoubleStoneBlueLightFloor = new BlockModDoubleSlab(Material.ROCK, "slab_stone_blue_light_floor_double");
    public static BlockModSlab slabStoneBlueLightFloor = new BlockModSlab(Material.ROCK,"slab_stone_blue_light_floor", slabDoubleStoneBlueLightFloor);
    public static ItemModSlab slabItemStoneBlueLightFloor = new ItemModSlab(slabStoneBlueLightFloor, slabDoubleStoneBlueLightFloor);

    public static BlockModDoubleSlab slabDoubleStoneBlueLightBrick = new BlockModDoubleSlab(Material.ROCK, "slab_stone_blue_light_brick_double");
    public static BlockModSlab slabStoneBlueLightBrick = new BlockModSlab(Material.ROCK,"slab_stone_blue_light_brick", slabDoubleStoneBlueLightBrick);
    public static ItemModSlab slabItemStoneBlueLightBrick = new ItemModSlab(slabStoneBlueLightBrick, slabDoubleStoneBlueLightBrick);

    public static BlockModDoubleSlab slabDoubleStoneBlueLightRaw = new BlockModDoubleSlab(Material.ROCK, "slab_stone_blue_light_raw_double");
    public static BlockModSlab slabStoneBlueLightRaw = new BlockModSlab(Material.ROCK,"slab_stone_blue_light_raw", slabDoubleStoneBlueLightRaw);
    public static ItemModSlab slabItemStoneBlueLightRaw = new ItemModSlab(slabStoneBlueLightRaw, slabDoubleStoneBlueLightRaw);

    public static BlockVertslab vertslabStoneBlueLightPanel = new BlockVertslab("vertslab_stone_blue_light_panel");
    public static BlockVertslab vertslabStoneBlueLightRaw = new BlockVertslab("vertslab_stone_blue_light_raw");

    public static BlockModStairs stairsStoneBlueLightPanel = new BlockModStairs(blockStoneBlueLightPanel.getDefaultState(), "stairs_stone_blue_light_panel");
    public static BlockModStairs stairsStoneBlueLightRaw = new BlockModStairs(blockStoneBlueLightRaw.getDefaultState(), "stairs_stone_blue_light_raw");
    public static BlockModStairs stairsStoneBlueLightFloor = new BlockModStairs(blockStoneBlueLightFloor.getDefaultState(), "stairs_stone_blue_light_floor");

    public static BlockPanel panelStoneBlueLight = new BlockPanel("panel_stone_blue_light");
    public static ItemBlockPanel panelItemStoneBlueLight = new ItemBlockPanel(panelStoneBlueLight);

    public static BlockModAxis blockStoneBlueLightTrim = new BlockModAxis(Material.ROCK, "block_stone_blue_light_trim");
    public static BlockModAxis blockStoneBlueLightTrimCarved = new BlockModAxis(Material.ROCK, "block_stone_blue_light_trim_carved");

    //wall

    public static void register(){

        blockStoneBlueLightRaw.register();
        blockStoneBlueLightBrick.register();
        blockStoneBlueLightFloor.register();
        blockStoneBlueLightPanel.register();
        blockStoneBlueLightChisel.register();
        blockStoneBlueLightBrickMoss.register();
        blockStoneBlueLightRawMoss.register();

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

        slabStoneBlueLightRaw.register();
        slabDoubleStoneBlueLightRaw.register();
        slabDoubleStoneBlueLightRaw.setSlab(slabStoneBlueLightRaw);
        slabItemStoneBlueLightRaw.register();

        vertslabStoneBlueLightPanel.register();
        vertslabStoneBlueLightRaw.register();

        stairsStoneBlueLightPanel.register();
        stairsStoneBlueLightRaw.register();
        stairsStoneBlueLightFloor.register();

        panelStoneBlueLight.register();
        panelItemStoneBlueLight.register();

        blockStoneBlueLightTrim.register();
        blockStoneBlueLightTrimCarved.register();
    }
}
