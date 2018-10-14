package net.grallarius.sunderedblocks.block.registers;

import net.grallarius.sunderedblocks.block.*;
import net.minecraft.block.material.Material;

public class CyanBlocks {

    public static BlockBase blockStoneCyanDark = new BlockBase(Material.ROCK, "block_stone_cyan_dark");
    public static BlockBase blockStoneCyanDarkBrick = new BlockBase(Material.ROCK, "block_stone_cyan_dark_brick");
    public static BlockBase blockStoneCyanDarkFloor = new BlockBase(Material.ROCK, "block_stone_cyan_dark_floor");
    public static BlockBase blockStoneCyanDarkPanel = new BlockBase(Material.ROCK, "block_stone_cyan_dark_panel");

    public static BlockBase blockStoneCyanLight = new BlockBase(Material.ROCK, "block_stone_cyan_light");
    public static BlockBase blockStoneCyanLightBrick = new BlockBase(Material.ROCK, "block_stone_cyan_light_brick");
    public static BlockBase blockStoneCyanLightFloor = new BlockBase(Material.ROCK, "block_stone_cyan_light_floor");
    public static BlockBase blockStoneCyanLightPanel = new BlockBase(Material.ROCK, "block_stone_cyan_light_panel");

    public static BlockBase blockStoneCyanDarkChisel = new BlockBase(Material.ROCK, "block_stone_cyan_dark_chisel");
    public static BlockModAxis blockStoneCyanDarkTrim = new BlockModAxis(Material.ROCK, "block_stone_cyan_dark_trim");

    public static BlockBase blockStoneCyanLightChisel = new BlockBase(Material.ROCK, "block_stone_cyan_light_chisel");
    public static BlockModAxis blockStoneCyanLightTrim = new BlockModAxis(Material.ROCK, "block_stone_cyan_light_trim");

    public static BlockModDoubleSlab slabDoubleStoneCyanDark = new BlockModDoubleSlab(Material.ROCK, "slab_stone_cyan_dark_double");
    public static BlockModSlab slabStoneCyanDark = new BlockModSlab(Material.ROCK,"slab_stone_cyan_dark", slabDoubleStoneCyanDark);
    public static ItemModSlab slabItemStoneCyanDark = new ItemModSlab(slabStoneCyanDark, slabDoubleStoneCyanDark);

    public static BlockModDoubleSlab slabDoubleStoneCyanLight = new BlockModDoubleSlab(Material.ROCK, "slab_stone_cyan_light_double");
    public static BlockModSlab slabStoneCyanLight = new BlockModSlab(Material.ROCK,"slab_stone_cyan_light", slabDoubleStoneCyanLight);
    public static ItemModSlab slabItemStoneCyanLight = new ItemModSlab(slabStoneCyanLight, slabDoubleStoneCyanLight);

    public static BlockModDoubleSlab slabDoubleStoneCyanDarkFloor = new BlockModDoubleSlab(Material.ROCK, "slab_stone_cyan_dark_floor_double");
    public static BlockModSlab slabStoneCyanDarkFloor = new BlockModSlab(Material.ROCK,"slab_stone_cyan_dark_floor", slabDoubleStoneCyanDarkFloor);
    public static ItemModSlab slabItemStoneCyanDarkFloor = new ItemModSlab(slabStoneCyanDarkFloor, slabDoubleStoneCyanDarkFloor);

    public static BlockModDoubleSlab slabDoubleStoneCyanLightFloor = new BlockModDoubleSlab(Material.ROCK, "slab_stone_cyan_light_floor_double");
    public static BlockModSlab slabStoneCyanLightFloor = new BlockModSlab(Material.ROCK,"slab_stone_cyan_light_floor", slabDoubleStoneCyanLightFloor);
    public static ItemModSlab slabItemStoneCyanLightFloor = new ItemModSlab(slabStoneCyanLightFloor, slabDoubleStoneCyanLightFloor);

    public static BlockModDoubleSlab slabDoubleStoneCyanDarkBrick = new BlockModDoubleSlab(Material.ROCK, "slab_stone_cyan_dark_brick_double");
    public static BlockModSlab slabStoneCyanDarkBrick = new BlockModSlab(Material.ROCK,"slab_stone_cyan_dark_brick", slabDoubleStoneCyanDarkBrick);
    public static ItemModSlab slabItemStoneCyanDarkBrick = new ItemModSlab(slabStoneCyanDarkBrick, slabDoubleStoneCyanDarkBrick);

    public static BlockModDoubleSlab slabDoubleStoneCyanLightBrick = new BlockModDoubleSlab(Material.ROCK, "slab_stone_cyan_light_brick_double");
    public static BlockModSlab slabStoneCyanLightBrick = new BlockModSlab(Material.ROCK,"slab_stone_cyan_light_brick", slabDoubleStoneCyanLightBrick);
    public static ItemModSlab slabItemStoneCyanLightBrick = new ItemModSlab(slabStoneCyanLightBrick, slabDoubleStoneCyanLightBrick);

    public static BlockPanel panelStoneCyanDark = new BlockPanel("panel_stone_cyan_dark");
    public static BlockVertslab vertslabStoneCyanDark = new BlockVertslab("vertslab_stone_cyan_dark");
    public static BlockModStairs stairsStoneCyanDark = new BlockModStairs(blockStoneCyanDarkPanel.getDefaultState(), "stairs_stone_cyan_dark");

    public static BlockPanel panelStoneCyanLight = new BlockPanel("panel_stone_cyan_light");
    public static BlockVertslab vertslabStoneCyanLight = new BlockVertslab("vertslab_stone_cyan_light");
    public static BlockModStairs stairsStoneCyanLight = new BlockModStairs(blockStoneCyanLightPanel.getDefaultState(), "stairs_stone_cyan_light");

    public static ItemBlockPanel panelItemStoneCyanDark = new ItemBlockPanel(panelStoneCyanDark);
    public static ItemBlockPanel panelItemStoneCyanLight = new ItemBlockPanel(panelStoneCyanLight);

    public static BlockVertslab vertslabStoneCyanDarkRaw = new BlockVertslab("vertslab_stone_cyan_dark_raw");
    public static BlockModStairs stairsStoneCyanDarkRaw = new BlockModStairs(blockStoneCyanDark.getDefaultState(), "stairs_stone_cyan_dark_raw");

    public static BlockVertslab vertslabStoneCyanLightRaw = new BlockVertslab("vertslab_stone_cyan_dark_raw");
    public static BlockModStairs stairsStoneCyanLightRaw = new BlockModStairs(blockStoneCyanLight.getDefaultState(), "stairs_stone_cyan_light_raw");


    public static BlockModDoubleSlab slabDoubleStoneCyanDarkRaw = new BlockModDoubleSlab(Material.ROCK, "slab_stone_cyan_dark_raw_double");
    public static BlockModSlab slabStoneCyanDarkRaw = new BlockModSlab(Material.ROCK,"slab_stone_cyan_dark_raw", slabDoubleStoneCyanDarkRaw);
    public static ItemModSlab slabItemStoneCyanDarkRaw = new ItemModSlab(slabStoneCyanDarkRaw, slabDoubleStoneCyanDarkRaw);

    public static BlockModDoubleSlab slabDoubleStoneCyanLightRaw = new BlockModDoubleSlab(Material.ROCK, "slab_stone_cyan_light_raw_double");
    public static BlockModSlab slabStoneCyanLightRaw = new BlockModSlab(Material.ROCK,"slab_stone_cyan_light_raw", slabDoubleStoneCyanLightRaw);
    public static ItemModSlab slabItemStoneCyanLightRaw = new ItemModSlab(slabStoneCyanLightRaw, slabDoubleStoneCyanLightRaw);

    public static void register(){

        blockStoneCyanDark.register();
        blockStoneCyanDarkBrick.register();
        blockStoneCyanDarkFloor.register();
        blockStoneCyanDarkPanel.register();

        blockStoneCyanDarkChisel.register();
        blockStoneCyanDarkTrim.register();

        slabStoneCyanDark.register();
        slabDoubleStoneCyanDark.register();
        slabDoubleStoneCyanDark.setSlab(slabStoneCyanDark);
        slabItemStoneCyanDark.register();

        slabStoneCyanDarkFloor.register();
        slabDoubleStoneCyanDarkFloor.register();
        slabDoubleStoneCyanDarkFloor.setSlab(slabStoneCyanDarkFloor);
        slabItemStoneCyanDarkFloor.register();

        slabStoneCyanDarkBrick.register();
        slabDoubleStoneCyanDarkBrick.register();
        slabDoubleStoneCyanDarkBrick.setSlab(slabStoneCyanDarkFloor);
        slabItemStoneCyanDarkBrick.register();

        vertslabStoneCyanDark.register();
        panelStoneCyanDark.register();
        stairsStoneCyanDark.register();

        blockStoneCyanLight.register();
        blockStoneCyanLightBrick.register();
        blockStoneCyanLightFloor.register();
        blockStoneCyanLightPanel.register();

        blockStoneCyanLightChisel.register();
        blockStoneCyanLightTrim.register();

        slabStoneCyanLight.register();
        slabDoubleStoneCyanLight.register();
        slabDoubleStoneCyanLight.setSlab(slabStoneCyanLight);
        slabItemStoneCyanLight.register();

        slabStoneCyanLightFloor.register();
        slabDoubleStoneCyanLightFloor.register();
        slabDoubleStoneCyanLightFloor.setSlab(slabStoneCyanLightFloor);
        slabItemStoneCyanLightFloor.register();

        slabStoneCyanLightBrick.register();
        slabDoubleStoneCyanLightBrick.register();
        slabDoubleStoneCyanLightBrick.setSlab(slabStoneCyanLightFloor);
        slabItemStoneCyanLightBrick.register();

        vertslabStoneCyanLight.register();
        panelStoneCyanLight.register();
        stairsStoneCyanLight.register();

        panelItemStoneCyanDark.register();
        panelItemStoneCyanLight.register();

        slabStoneCyanLightRaw.register();
        slabDoubleStoneCyanLightRaw.register();
        slabDoubleStoneCyanLightRaw.setSlab(slabStoneCyanLightRaw);
        slabItemStoneCyanLightRaw.register();

        stairsStoneCyanDarkRaw.register();
        vertslabStoneCyanDarkRaw.register();
        stairsStoneCyanLightRaw.register();
        vertslabStoneCyanLightRaw.register();

    }
}
