package net.grallarius.sunderedblocks.block.registers;

import net.grallarius.sunderedblocks.block.*;
import net.minecraft.block.material.Material;

public class PurpleBlocks {

    public static BlockBase blockStonePurpleDark = new BlockBase(Material.ROCK, "block_stone_purple_dark");
    public static BlockBase blockStonePurpleDarkBrick = new BlockBase(Material.ROCK, "block_stone_purple_dark_brick");
    public static BlockBase blockStonePurpleDarkFloor = new BlockBase(Material.ROCK, "block_stone_purple_dark_floor");
    public static BlockBase blockStonePurpleDarkPanel = new BlockBase(Material.ROCK, "block_stone_purple_dark_panel");

    public static BlockBase blockStonePurpleLight = new BlockBase(Material.ROCK, "block_stone_purple_light");
    public static BlockBase blockStonePurpleLightBrick = new BlockBase(Material.ROCK, "block_stone_purple_light_brick");
    public static BlockBase blockStonePurpleLightFloor = new BlockBase(Material.ROCK, "block_stone_purple_light_floor");
    public static BlockBase blockStonePurpleLightPanel = new BlockBase(Material.ROCK, "block_stone_purple_light_panel");

    public static BlockBase blockStonePurpleDarkChisel = new BlockBase(Material.ROCK, "block_stone_purple_dark_chisel");
    public static BlockModAxis blockStonePurpleDarkTrim = new BlockModAxis(Material.ROCK, "block_stone_purple_dark_trim");

    public static BlockBase blockStonePurpleLightChisel = new BlockBase(Material.ROCK, "block_stone_purple_light_chisel");
    public static BlockModAxis blockStonePurpleLightTrim = new BlockModAxis(Material.ROCK, "block_stone_purple_light_trim");

    public static BlockModDoubleSlab slabDoubleStonePurpleDark = new BlockModDoubleSlab(Material.ROCK, "slab_stone_purple_dark_double");
    public static BlockModSlab slabStonePurpleDark = new BlockModSlab(Material.ROCK,"slab_stone_purple_dark", slabDoubleStonePurpleDark);
    public static ItemModSlab slabItemStonePurpleDark = new ItemModSlab(slabStonePurpleDark, slabDoubleStonePurpleDark);

    public static BlockModDoubleSlab slabDoubleStonePurpleLight = new BlockModDoubleSlab(Material.ROCK, "slab_stone_purple_light_double");
    public static BlockModSlab slabStonePurpleLight = new BlockModSlab(Material.ROCK,"slab_stone_purple_light", slabDoubleStonePurpleLight);
    public static ItemModSlab slabItemStonePurpleLight = new ItemModSlab(slabStonePurpleLight, slabDoubleStonePurpleLight);

    public static BlockModDoubleSlab slabDoubleStonePurpleDarkFloor = new BlockModDoubleSlab(Material.ROCK, "slab_stone_purple_dark_floor_double");
    public static BlockModSlab slabStonePurpleDarkFloor = new BlockModSlab(Material.ROCK,"slab_stone_purple_dark_floor", slabDoubleStonePurpleDarkFloor);
    public static ItemModSlab slabItemStonePurpleDarkFloor = new ItemModSlab(slabStonePurpleDarkFloor, slabDoubleStonePurpleDarkFloor);

    public static BlockModDoubleSlab slabDoubleStonePurpleLightFloor = new BlockModDoubleSlab(Material.ROCK, "slab_stone_purple_light_floor_double");
    public static BlockModSlab slabStonePurpleLightFloor = new BlockModSlab(Material.ROCK,"slab_stone_purple_light_floor", slabDoubleStonePurpleLightFloor);
    public static ItemModSlab slabItemStonePurpleLightFloor = new ItemModSlab(slabStonePurpleLightFloor, slabDoubleStonePurpleLightFloor);

    public static BlockModDoubleSlab slabDoubleStonePurpleDarkBrick = new BlockModDoubleSlab(Material.ROCK, "slab_stone_purple_dark_brick_double");
    public static BlockModSlab slabStonePurpleDarkBrick = new BlockModSlab(Material.ROCK,"slab_stone_purple_dark_brick", slabDoubleStonePurpleDarkBrick);
    public static ItemModSlab slabItemStonePurpleDarkBrick = new ItemModSlab(slabStonePurpleDarkBrick, slabDoubleStonePurpleDarkBrick);

    public static BlockModDoubleSlab slabDoubleStonePurpleLightBrick = new BlockModDoubleSlab(Material.ROCK, "slab_stone_purple_light_brick_double");
    public static BlockModSlab slabStonePurpleLightBrick = new BlockModSlab(Material.ROCK,"slab_stone_purple_light_brick", slabDoubleStonePurpleLightBrick);
    public static ItemModSlab slabItemStonePurpleLightBrick = new ItemModSlab(slabStonePurpleLightBrick, slabDoubleStonePurpleLightBrick);

    public static BlockPanel panelStonePurpleDark = new BlockPanel("panel_stone_purple_dark");
    public static BlockVertslab vertslabStonePurpleDark = new BlockVertslab("vertslab_stone_purple_dark");
    public static BlockModStairs stairsStonePurpleDark = new BlockModStairs(blockStonePurpleDarkPanel.getDefaultState(), "stairs_stone_purple_dark");

    public static BlockPanel panelStonePurpleLight = new BlockPanel("panel_stone_purple_light");
    public static BlockVertslab vertslabStonePurpleLight = new BlockVertslab("vertslab_stone_purple_light");
    public static BlockModStairs stairsStonePurpleLight = new BlockModStairs(blockStonePurpleLightPanel.getDefaultState(), "stairs_stone_purple_light");

    public static ItemBlockPanel panelItemStonePurpleDark = new ItemBlockPanel(panelStonePurpleDark);
    public static ItemBlockPanel panelItemStonePurpleLight = new ItemBlockPanel(panelStonePurpleLight);


    public static void register(){

        blockStonePurpleDark.register();
        blockStonePurpleDarkBrick.register();
        blockStonePurpleDarkFloor.register();
        blockStonePurpleDarkPanel.register();

        blockStonePurpleDarkChisel.register();
        blockStonePurpleDarkTrim.register();

        slabStonePurpleDark.register();
        slabDoubleStonePurpleDark.register();
        slabDoubleStonePurpleDark.setSlab(slabStonePurpleDark);
        slabItemStonePurpleDark.register();

        slabStonePurpleDarkFloor.register();
        slabDoubleStonePurpleDarkFloor.register();
        slabDoubleStonePurpleDarkFloor.setSlab(slabStonePurpleDarkFloor);
        slabItemStonePurpleDarkFloor.register();

        slabStonePurpleDarkBrick.register();
        slabDoubleStonePurpleDarkBrick.register();
        slabDoubleStonePurpleDarkBrick.setSlab(slabStonePurpleDarkFloor);
        slabItemStonePurpleDarkBrick.register();

        vertslabStonePurpleDark.register();
        panelStonePurpleDark.register();
        stairsStonePurpleDark.register();

        blockStonePurpleLight.register();
        blockStonePurpleLightBrick.register();
        blockStonePurpleLightFloor.register();
        blockStonePurpleLightPanel.register();

        blockStonePurpleLightChisel.register();
        blockStonePurpleLightTrim.register();

        slabStonePurpleLight.register();
        slabDoubleStonePurpleLight.register();
        slabDoubleStonePurpleLight.setSlab(slabStonePurpleLight);
        slabItemStonePurpleLight.register();

        slabStonePurpleLightFloor.register();
        slabDoubleStonePurpleLightFloor.register();
        slabDoubleStonePurpleLightFloor.setSlab(slabStonePurpleLightFloor);
        slabItemStonePurpleLightFloor.register();

        slabStonePurpleLightBrick.register();
        slabDoubleStonePurpleLightBrick.register();
        slabDoubleStonePurpleLightBrick.setSlab(slabStonePurpleLightFloor);
        slabItemStonePurpleLightBrick.register();

        vertslabStonePurpleLight.register();
        panelStonePurpleLight.register();
        stairsStonePurpleLight.register();

        panelItemStonePurpleDark.register();
        panelItemStonePurpleLight.register();

    }
}
