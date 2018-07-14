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

    public static BlockModDoubleSlab slabDoubleStoneGreenDark = new BlockModDoubleSlab(Material.ROCK, "slab_stone_green_dark_double");
    public static BlockModSlab slabStoneGreenDark = new BlockModSlab(Material.ROCK,"slab_stone_green_dark", slabDoubleStoneGreenDark);
    public static ItemModSlab slabItemStoneGreenDark = new ItemModSlab(slabStoneGreenDark, slabDoubleStoneGreenDark);

    public static BlockModDoubleSlab slabDoubleStoneGreenDarkFloor = new BlockModDoubleSlab(Material.ROCK, "slab_stone_green_dark_floor_double");
    public static BlockModSlab slabStoneGreenDarkFloor = new BlockModSlab(Material.ROCK,"slab_stone_green_dark_floor", slabDoubleStoneGreenDarkFloor);
    public static ItemModSlab slabItemStoneGreenDarkFloor = new ItemModSlab(slabStoneGreenDarkFloor, slabDoubleStoneGreenDarkFloor);

    public static BlockModDoubleSlab slabDoubleStoneGreenDarkBrick = new BlockModDoubleSlab(Material.ROCK, "slab_stone_green_dark_brick_double");
    public static BlockModSlab slabStoneGreenDarkBrick = new BlockModSlab(Material.ROCK,"slab_stone_green_dark_brick", slabDoubleStoneGreenDarkBrick);
    public static ItemModSlab slabItemStoneGreenDarkBrick = new ItemModSlab(slabStoneGreenDarkBrick, slabDoubleStoneGreenDarkBrick);

    public static BlockPanel panelStoneGreenDark = new BlockPanel("panel_stone_green_dark");
    public static BlockVertslab vertslabStoneGreenDark = new BlockVertslab("vertslab_stone_green_dark");
    public static BlockModStairs stairsStoneGreenDark = new BlockModStairs(blockStoneGreenDarkPanel.getDefaultState(), "stairs_stone_green_dark");


    public static void register(){

        blockStoneGreenDark.register();
        blockStoneGreenDarkBrick.register();
        blockStoneGreenDarkFloor.register();
        blockStoneGreenDarkPanel.register();

        blockStoneGreenLight.register();
        blockStoneGreenLightBrick.register();
        blockStoneGreenLightFloor.register();
        blockStoneGreenLightPanel.register();

        blockStoneGreenDarkChisel.register();

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

    }
}
