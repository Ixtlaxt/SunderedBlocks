package net.grallarius.sunderedblocks.block.registers;

import net.grallarius.sunderedblocks.block.*;
import net.minecraft.block.material.Material;

public class RedBlocks {

    public static BlockBase blockStoneRedDark = new BlockBase(Material.ROCK, "block_stone_red_dark");
    public static BlockBase blockStoneRedDarkBrick = new BlockBase(Material.ROCK, "block_stone_red_dark_brick");
    public static BlockBase blockStoneRedDarkFloor = new BlockBase(Material.ROCK, "block_stone_red_dark_floor");
    public static BlockBase blockStoneRedDarkPanel = new BlockBase(Material.ROCK, "block_stone_red_dark_panel");

    public static BlockBase blockStoneRedLight = new BlockBase(Material.ROCK, "block_stone_red_light");
    public static BlockBase blockStoneRedLightBrick = new BlockBase(Material.ROCK, "block_stone_red_light_brick");
    public static BlockBase blockStoneRedLightFloor = new BlockBase(Material.ROCK, "block_stone_red_light_floor");
    public static BlockBase blockStoneRedLightPanel = new BlockBase(Material.ROCK, "block_stone_red_light_panel");

    public static BlockBase blockStoneRedDarkChisel = new BlockBase(Material.ROCK, "block_stone_red_dark_chisel");
    public static BlockModAxis blockStoneRedDarkTrim = new BlockModAxis(Material.ROCK, "block_stone_red_dark_trim");

    public static BlockBase blockStoneRedLightChisel = new BlockBase(Material.ROCK, "block_stone_red_light_chisel");
    public static BlockModAxis blockStoneRedLightTrim = new BlockModAxis(Material.ROCK, "block_stone_red_light_trim");

    public static BlockModDoubleSlab slabDoubleStoneRedDark = new BlockModDoubleSlab(Material.ROCK, "slab_stone_red_dark_double");
    public static BlockModSlab slabStoneRedDark = new BlockModSlab(Material.ROCK,"slab_stone_red_dark", slabDoubleStoneRedDark);
    public static ItemModSlab slabItemStoneRedDark = new ItemModSlab(slabStoneRedDark, slabDoubleStoneRedDark);

    public static BlockModDoubleSlab slabDoubleStoneRedLight = new BlockModDoubleSlab(Material.ROCK, "slab_stone_red_light_double");
    public static BlockModSlab slabStoneRedLight = new BlockModSlab(Material.ROCK,"slab_stone_red_light", slabDoubleStoneRedLight);
    public static ItemModSlab slabItemStoneRedLight = new ItemModSlab(slabStoneRedLight, slabDoubleStoneRedLight);

    public static BlockModDoubleSlab slabDoubleStoneRedDarkFloor = new BlockModDoubleSlab(Material.ROCK, "slab_stone_red_dark_floor_double");
    public static BlockModSlab slabStoneRedDarkFloor = new BlockModSlab(Material.ROCK,"slab_stone_red_dark_floor", slabDoubleStoneRedDarkFloor);
    public static ItemModSlab slabItemStoneRedDarkFloor = new ItemModSlab(slabStoneRedDarkFloor, slabDoubleStoneRedDarkFloor);

    public static BlockModDoubleSlab slabDoubleStoneRedLightFloor = new BlockModDoubleSlab(Material.ROCK, "slab_stone_red_light_floor_double");
    public static BlockModSlab slabStoneRedLightFloor = new BlockModSlab(Material.ROCK,"slab_stone_red_light_floor", slabDoubleStoneRedLightFloor);
    public static ItemModSlab slabItemStoneRedLightFloor = new ItemModSlab(slabStoneRedLightFloor, slabDoubleStoneRedLightFloor);

    public static BlockModDoubleSlab slabDoubleStoneRedDarkBrick = new BlockModDoubleSlab(Material.ROCK, "slab_stone_red_dark_brick_double");
    public static BlockModSlab slabStoneRedDarkBrick = new BlockModSlab(Material.ROCK,"slab_stone_red_dark_brick", slabDoubleStoneRedDarkBrick);
    public static ItemModSlab slabItemStoneRedDarkBrick = new ItemModSlab(slabStoneRedDarkBrick, slabDoubleStoneRedDarkBrick);

    public static BlockModDoubleSlab slabDoubleStoneRedLightBrick = new BlockModDoubleSlab(Material.ROCK, "slab_stone_red_light_brick_double");
    public static BlockModSlab slabStoneRedLightBrick = new BlockModSlab(Material.ROCK,"slab_stone_red_light_brick", slabDoubleStoneRedLightBrick);
    public static ItemModSlab slabItemStoneRedLightBrick = new ItemModSlab(slabStoneRedLightBrick, slabDoubleStoneRedLightBrick);

    public static BlockPanel panelStoneRedDark = new BlockPanel("panel_stone_red_dark");
    public static BlockVertslab vertslabStoneRedDark = new BlockVertslab("vertslab_stone_red_dark");
    public static BlockModStairs stairsStoneRedDark = new BlockModStairs(blockStoneRedDarkPanel.getDefaultState(), "stairs_stone_red_dark");

    public static BlockPanel panelStoneRedLight = new BlockPanel("panel_stone_red_light");
    public static BlockVertslab vertslabStoneRedLight = new BlockVertslab("vertslab_stone_red_light");
    public static BlockModStairs stairsStoneRedLight = new BlockModStairs(blockStoneRedLightPanel.getDefaultState(), "stairs_stone_red_light");


    public static void register(){

        blockStoneRedDark.register();
        blockStoneRedDarkBrick.register();
        blockStoneRedDarkFloor.register();
        blockStoneRedDarkPanel.register();

        blockStoneRedDarkChisel.register();
        blockStoneRedDarkTrim.register();

        slabStoneRedDark.register();
        slabDoubleStoneRedDark.register();
        slabDoubleStoneRedDark.setSlab(slabStoneRedDark);
        slabItemStoneRedDark.register();

        slabStoneRedDarkFloor.register();
        slabDoubleStoneRedDarkFloor.register();
        slabDoubleStoneRedDarkFloor.setSlab(slabStoneRedDarkFloor);
        slabItemStoneRedDarkFloor.register();

        slabStoneRedDarkBrick.register();
        slabDoubleStoneRedDarkBrick.register();
        slabDoubleStoneRedDarkBrick.setSlab(slabStoneRedDarkFloor);
        slabItemStoneRedDarkBrick.register();

        vertslabStoneRedDark.register();
        panelStoneRedDark.register();
        stairsStoneRedDark.register();

        blockStoneRedLight.register();
        blockStoneRedLightBrick.register();
        blockStoneRedLightFloor.register();
        blockStoneRedLightPanel.register();

        blockStoneRedLightChisel.register();
        blockStoneRedLightTrim.register();

        slabStoneRedLight.register();
        slabDoubleStoneRedLight.register();
        slabDoubleStoneRedLight.setSlab(slabStoneRedLight);
        slabItemStoneRedLight.register();

        slabStoneRedLightFloor.register();
        slabDoubleStoneRedLightFloor.register();
        slabDoubleStoneRedLightFloor.setSlab(slabStoneRedLightFloor);
        slabItemStoneRedLightFloor.register();

        slabStoneRedLightBrick.register();
        slabDoubleStoneRedLightBrick.register();
        slabDoubleStoneRedLightBrick.setSlab(slabStoneRedLightFloor);
        slabItemStoneRedLightBrick.register();

        vertslabStoneRedLight.register();
        panelStoneRedLight.register();
        stairsStoneRedLight.register();

    }
}
