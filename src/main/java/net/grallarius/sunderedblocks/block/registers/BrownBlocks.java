package net.grallarius.sunderedblocks.block.registers;

import net.grallarius.sunderedblocks.block.*;
import net.minecraft.block.material.Material;

public class BrownBlocks {

    public static BlockBase blockStoneBrownDark = new BlockBase(Material.ROCK, "block_stone_brown_dark");
    public static BlockBase blockStoneBrownDarkBrick = new BlockBase(Material.ROCK, "block_stone_brown_dark_brick");
    public static BlockBase blockStoneBrownDarkFloor = new BlockBase(Material.ROCK, "block_stone_brown_dark_floor");
    public static BlockBase blockStoneBrownDarkPanel = new BlockBase(Material.ROCK, "block_stone_brown_dark_panel");

    public static BlockBase blockStoneBrownLight = new BlockBase(Material.ROCK, "block_stone_brown_light");
    public static BlockBase blockStoneBrownLightBrick = new BlockBase(Material.ROCK, "block_stone_brown_light_brick");
    public static BlockBase blockStoneBrownLightFloor = new BlockBase(Material.ROCK, "block_stone_brown_light_floor");
    public static BlockBase blockStoneBrownLightPanel = new BlockBase(Material.ROCK, "block_stone_brown_light_panel");

    public static BlockBase blockStoneBrownDarkChisel = new BlockBase(Material.ROCK, "block_stone_brown_dark_chisel");
    public static BlockModAxis blockStoneBrownDarkTrim = new BlockModAxis(Material.ROCK, "block_stone_brown_dark_trim");

    public static BlockBase blockStoneBrownLightChisel = new BlockBase(Material.ROCK, "block_stone_brown_light_chisel");
    public static BlockModAxis blockStoneBrownLightTrim = new BlockModAxis(Material.ROCK, "block_stone_brown_light_trim");

    public static BlockModDoubleSlab slabDoubleStoneBrownDark = new BlockModDoubleSlab(Material.ROCK, "slab_stone_brown_dark_double");
    public static BlockModSlab slabStoneBrownDark = new BlockModSlab(Material.ROCK,"slab_stone_brown_dark", slabDoubleStoneBrownDark);
    public static ItemModSlab slabItemStoneBrownDark = new ItemModSlab(slabStoneBrownDark, slabDoubleStoneBrownDark);

    public static BlockModDoubleSlab slabDoubleStoneBrownLight = new BlockModDoubleSlab(Material.ROCK, "slab_stone_brown_light_double");
    public static BlockModSlab slabStoneBrownLight = new BlockModSlab(Material.ROCK,"slab_stone_brown_light", slabDoubleStoneBrownLight);
    public static ItemModSlab slabItemStoneBrownLight = new ItemModSlab(slabStoneBrownLight, slabDoubleStoneBrownLight);

    public static BlockModDoubleSlab slabDoubleStoneBrownDarkFloor = new BlockModDoubleSlab(Material.ROCK, "slab_stone_brown_dark_floor_double");
    public static BlockModSlab slabStoneBrownDarkFloor = new BlockModSlab(Material.ROCK,"slab_stone_brown_dark_floor", slabDoubleStoneBrownDarkFloor);
    public static ItemModSlab slabItemStoneBrownDarkFloor = new ItemModSlab(slabStoneBrownDarkFloor, slabDoubleStoneBrownDarkFloor);

    public static BlockModDoubleSlab slabDoubleStoneBrownLightFloor = new BlockModDoubleSlab(Material.ROCK, "slab_stone_brown_light_floor_double");
    public static BlockModSlab slabStoneBrownLightFloor = new BlockModSlab(Material.ROCK,"slab_stone_brown_light_floor", slabDoubleStoneBrownLightFloor);
    public static ItemModSlab slabItemStoneBrownLightFloor = new ItemModSlab(slabStoneBrownLightFloor, slabDoubleStoneBrownLightFloor);

    public static BlockModDoubleSlab slabDoubleStoneBrownDarkBrick = new BlockModDoubleSlab(Material.ROCK, "slab_stone_brown_dark_brick_double");
    public static BlockModSlab slabStoneBrownDarkBrick = new BlockModSlab(Material.ROCK,"slab_stone_brown_dark_brick", slabDoubleStoneBrownDarkBrick);
    public static ItemModSlab slabItemStoneBrownDarkBrick = new ItemModSlab(slabStoneBrownDarkBrick, slabDoubleStoneBrownDarkBrick);

    public static BlockModDoubleSlab slabDoubleStoneBrownLightBrick = new BlockModDoubleSlab(Material.ROCK, "slab_stone_brown_light_brick_double");
    public static BlockModSlab slabStoneBrownLightBrick = new BlockModSlab(Material.ROCK,"slab_stone_brown_light_brick", slabDoubleStoneBrownLightBrick);
    public static ItemModSlab slabItemStoneBrownLightBrick = new ItemModSlab(slabStoneBrownLightBrick, slabDoubleStoneBrownLightBrick);

    public static BlockPanel panelStoneBrownDark = new BlockPanel("panel_stone_brown_dark");
    public static BlockVertslab vertslabStoneBrownDark = new BlockVertslab("vertslab_stone_brown_dark");
    public static BlockModStairs stairsStoneBrownDark = new BlockModStairs(blockStoneBrownDarkPanel.getDefaultState(), "stairs_stone_brown_dark");

    public static BlockPanel panelStoneBrownLight = new BlockPanel("panel_stone_brown_light");
    public static BlockVertslab vertslabStoneBrownLight = new BlockVertslab("vertslab_stone_brown_light");
    public static BlockModStairs stairsStoneBrownLight = new BlockModStairs(blockStoneBrownLightPanel.getDefaultState(), "stairs_stone_brown_light");

    public static ItemBlockPanel panelItemStoneBrownDark = new ItemBlockPanel(panelStoneBrownDark);
    public static ItemBlockPanel panelItemStoneBrownLight = new ItemBlockPanel(panelStoneBrownLight);

    public static BlockVertslab vertslabStoneBrownDarkRaw = new BlockVertslab("vertslab_stone_brown_dark_raw");
    public static BlockModStairs stairsStoneBrownDarkRaw = new BlockModStairs(blockStoneBrownDark.getDefaultState(), "stairs_stone_brown_dark_raw");

    public static BlockVertslab vertslabStoneBrownLightRaw = new BlockVertslab("vertslab_stone_brown_dark_raw");
    public static BlockModStairs stairsStoneBrownLightRaw = new BlockModStairs(blockStoneBrownLight.getDefaultState(), "stairs_stone_brown_light_raw");


    public static BlockModDoubleSlab slabDoubleStoneBrownDarkRaw = new BlockModDoubleSlab(Material.ROCK, "slab_stone_brown_dark_raw_double");
    public static BlockModSlab slabStoneBrownDarkRaw = new BlockModSlab(Material.ROCK,"slab_stone_brown_dark_raw", slabDoubleStoneBrownDarkRaw);
    public static ItemModSlab slabItemStoneBrownDarkRaw = new ItemModSlab(slabStoneBrownDarkRaw, slabDoubleStoneBrownDarkRaw);

    public static BlockModDoubleSlab slabDoubleStoneBrownLightRaw = new BlockModDoubleSlab(Material.ROCK, "slab_stone_brown_light_raw_double");
    public static BlockModSlab slabStoneBrownLightRaw = new BlockModSlab(Material.ROCK,"slab_stone_brown_light_raw", slabDoubleStoneBrownLightRaw);
    public static ItemModSlab slabItemStoneBrownLightRaw = new ItemModSlab(slabStoneBrownLightRaw, slabDoubleStoneBrownLightRaw);


    public static void register(){

        blockStoneBrownDark.register();
        blockStoneBrownDarkBrick.register();
        blockStoneBrownDarkFloor.register();
        blockStoneBrownDarkPanel.register();

        blockStoneBrownDarkChisel.register();
        blockStoneBrownDarkTrim.register();

        slabStoneBrownDark.register();
        slabDoubleStoneBrownDark.register();
        slabDoubleStoneBrownDark.setSlab(slabStoneBrownDark);
        slabItemStoneBrownDark.register();

        slabStoneBrownDarkFloor.register();
        slabDoubleStoneBrownDarkFloor.register();
        slabDoubleStoneBrownDarkFloor.setSlab(slabStoneBrownDarkFloor);
        slabItemStoneBrownDarkFloor.register();

        slabStoneBrownDarkBrick.register();
        slabDoubleStoneBrownDarkBrick.register();
        slabDoubleStoneBrownDarkBrick.setSlab(slabStoneBrownDarkFloor);
        slabItemStoneBrownDarkBrick.register();

        vertslabStoneBrownDark.register();
        panelStoneBrownDark.register();
        stairsStoneBrownDark.register();

        blockStoneBrownLight.register();
        blockStoneBrownLightBrick.register();
        blockStoneBrownLightFloor.register();
        blockStoneBrownLightPanel.register();

        blockStoneBrownLightChisel.register();
        blockStoneBrownLightTrim.register();

        slabStoneBrownLight.register();
        slabDoubleStoneBrownLight.register();
        slabDoubleStoneBrownLight.setSlab(slabStoneBrownLight);
        slabItemStoneBrownLight.register();

        slabStoneBrownLightFloor.register();
        slabDoubleStoneBrownLightFloor.register();
        slabDoubleStoneBrownLightFloor.setSlab(slabStoneBrownLightFloor);
        slabItemStoneBrownLightFloor.register();

        slabStoneBrownLightBrick.register();
        slabDoubleStoneBrownLightBrick.register();
        slabDoubleStoneBrownLightBrick.setSlab(slabStoneBrownLightFloor);
        slabItemStoneBrownLightBrick.register();

        vertslabStoneBrownLight.register();
        panelStoneBrownLight.register();
        stairsStoneBrownLight.register();

        panelItemStoneBrownDark.register();
        panelItemStoneBrownLight.register();

        slabStoneBrownLightRaw.register();
        slabDoubleStoneBrownLightRaw.register();
        slabDoubleStoneBrownLightRaw.setSlab(slabStoneBrownLightRaw);
        slabItemStoneBrownLightRaw.register();

        stairsStoneBrownDarkRaw.register();
        vertslabStoneBrownDarkRaw.register();
        stairsStoneBrownLightRaw.register();
        vertslabStoneBrownLightRaw.register();

    }
}
