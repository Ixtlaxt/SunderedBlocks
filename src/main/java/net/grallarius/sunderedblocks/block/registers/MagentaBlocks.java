package net.grallarius.sunderedblocks.block.registers;

import net.grallarius.sunderedblocks.block.*;
import net.minecraft.block.material.Material;

public class MagentaBlocks {

    public static BlockBase blockStoneMagentaDark = new BlockBase(Material.ROCK, "block_stone_magenta_dark");
    public static BlockBase blockStoneMagentaDarkBrick = new BlockBase(Material.ROCK, "block_stone_magenta_dark_brick");
    public static BlockBase blockStoneMagentaDarkFloor = new BlockBase(Material.ROCK, "block_stone_magenta_dark_floor");
    public static BlockBase blockStoneMagentaDarkPanel = new BlockBase(Material.ROCK, "block_stone_magenta_dark_panel");

    public static BlockBase blockStoneMagentaLight = new BlockBase(Material.ROCK, "block_stone_magenta_light");
    public static BlockBase blockStoneMagentaLightBrick = new BlockBase(Material.ROCK, "block_stone_magenta_light_brick");
    public static BlockBase blockStoneMagentaLightFloor = new BlockBase(Material.ROCK, "block_stone_magenta_light_floor");
    public static BlockBase blockStoneMagentaLightPanel = new BlockBase(Material.ROCK, "block_stone_magenta_light_panel");

    public static BlockBase blockStoneMagentaDarkChisel = new BlockBase(Material.ROCK, "block_stone_magenta_dark_chisel");
    public static BlockModAxis blockStoneMagentaDarkTrim = new BlockModAxis(Material.ROCK, "block_stone_magenta_dark_trim");

    public static BlockBase blockStoneMagentaLightChisel = new BlockBase(Material.ROCK, "block_stone_magenta_light_chisel");
    public static BlockModAxis blockStoneMagentaLightTrim = new BlockModAxis(Material.ROCK, "block_stone_magenta_light_trim");

    public static BlockModDoubleSlab slabDoubleStoneMagentaDark = new BlockModDoubleSlab(Material.ROCK, "slab_stone_magenta_dark_double");
    public static BlockModSlab slabStoneMagentaDark = new BlockModSlab(Material.ROCK,"slab_stone_magenta_dark", slabDoubleStoneMagentaDark);
    public static ItemModSlab slabItemStoneMagentaDark = new ItemModSlab(slabStoneMagentaDark, slabDoubleStoneMagentaDark);

    public static BlockModDoubleSlab slabDoubleStoneMagentaLight = new BlockModDoubleSlab(Material.ROCK, "slab_stone_magenta_light_double");
    public static BlockModSlab slabStoneMagentaLight = new BlockModSlab(Material.ROCK,"slab_stone_magenta_light", slabDoubleStoneMagentaLight);
    public static ItemModSlab slabItemStoneMagentaLight = new ItemModSlab(slabStoneMagentaLight, slabDoubleStoneMagentaLight);

    public static BlockModDoubleSlab slabDoubleStoneMagentaDarkFloor = new BlockModDoubleSlab(Material.ROCK, "slab_stone_magenta_dark_floor_double");
    public static BlockModSlab slabStoneMagentaDarkFloor = new BlockModSlab(Material.ROCK,"slab_stone_magenta_dark_floor", slabDoubleStoneMagentaDarkFloor);
    public static ItemModSlab slabItemStoneMagentaDarkFloor = new ItemModSlab(slabStoneMagentaDarkFloor, slabDoubleStoneMagentaDarkFloor);

    public static BlockModDoubleSlab slabDoubleStoneMagentaLightFloor = new BlockModDoubleSlab(Material.ROCK, "slab_stone_magenta_light_floor_double");
    public static BlockModSlab slabStoneMagentaLightFloor = new BlockModSlab(Material.ROCK,"slab_stone_magenta_light_floor", slabDoubleStoneMagentaLightFloor);
    public static ItemModSlab slabItemStoneMagentaLightFloor = new ItemModSlab(slabStoneMagentaLightFloor, slabDoubleStoneMagentaLightFloor);

    public static BlockModDoubleSlab slabDoubleStoneMagentaDarkBrick = new BlockModDoubleSlab(Material.ROCK, "slab_stone_magenta_dark_brick_double");
    public static BlockModSlab slabStoneMagentaDarkBrick = new BlockModSlab(Material.ROCK,"slab_stone_magenta_dark_brick", slabDoubleStoneMagentaDarkBrick);
    public static ItemModSlab slabItemStoneMagentaDarkBrick = new ItemModSlab(slabStoneMagentaDarkBrick, slabDoubleStoneMagentaDarkBrick);

    public static BlockModDoubleSlab slabDoubleStoneMagentaLightBrick = new BlockModDoubleSlab(Material.ROCK, "slab_stone_magenta_light_brick_double");
    public static BlockModSlab slabStoneMagentaLightBrick = new BlockModSlab(Material.ROCK,"slab_stone_magenta_light_brick", slabDoubleStoneMagentaLightBrick);
    public static ItemModSlab slabItemStoneMagentaLightBrick = new ItemModSlab(slabStoneMagentaLightBrick, slabDoubleStoneMagentaLightBrick);

    public static BlockPanel panelStoneMagentaDark = new BlockPanel("panel_stone_magenta_dark");
    public static BlockVertslab vertslabStoneMagentaDark = new BlockVertslab("vertslab_stone_magenta_dark");
    public static BlockModStairs stairsStoneMagentaDark = new BlockModStairs(blockStoneMagentaDarkPanel.getDefaultState(), "stairs_stone_magenta_dark");

    public static BlockPanel panelStoneMagentaLight = new BlockPanel("panel_stone_magenta_light");
    public static BlockVertslab vertslabStoneMagentaLight = new BlockVertslab("vertslab_stone_magenta_light");
    public static BlockModStairs stairsStoneMagentaLight = new BlockModStairs(blockStoneMagentaLightPanel.getDefaultState(), "stairs_stone_magenta_light");

    public static ItemBlockPanel panelItemStoneMagentaDark = new ItemBlockPanel(panelStoneMagentaDark);
    public static ItemBlockPanel panelItemStoneMagentaLight = new ItemBlockPanel(panelStoneMagentaLight);

    public static BlockVertslab vertslabStoneMagentaDarkRaw = new BlockVertslab("vertslab_stone_magenta_dark_raw");
    public static BlockModStairs stairsStoneMagentaDarkRaw = new BlockModStairs(blockStoneMagentaDark.getDefaultState(), "stairs_stone_magenta_dark_raw");

    public static BlockVertslab vertslabStoneMagentaLightRaw = new BlockVertslab("vertslab_stone_magenta_dark_raw");
    public static BlockModStairs stairsStoneMagentaLightRaw = new BlockModStairs(blockStoneMagentaLight.getDefaultState(), "stairs_stone_magenta_light_raw");


    public static BlockModDoubleSlab slabDoubleStoneMagentaDarkRaw = new BlockModDoubleSlab(Material.ROCK, "slab_stone_magenta_dark_raw_double");
    public static BlockModSlab slabStoneMagentaDarkRaw = new BlockModSlab(Material.ROCK,"slab_stone_magenta_dark_raw", slabDoubleStoneMagentaDarkRaw);
    public static ItemModSlab slabItemStoneMagentaDarkRaw = new ItemModSlab(slabStoneMagentaDarkRaw, slabDoubleStoneMagentaDarkRaw);

    public static BlockModDoubleSlab slabDoubleStoneMagentaLightRaw = new BlockModDoubleSlab(Material.ROCK, "slab_stone_magenta_light_raw_double");
    public static BlockModSlab slabStoneMagentaLightRaw = new BlockModSlab(Material.ROCK,"slab_stone_magenta_light_raw", slabDoubleStoneMagentaLightRaw);
    public static ItemModSlab slabItemStoneMagentaLightRaw = new ItemModSlab(slabStoneMagentaLightRaw, slabDoubleStoneMagentaLightRaw);

    public static void register(){

        blockStoneMagentaDark.register();
        blockStoneMagentaDarkBrick.register();
        blockStoneMagentaDarkFloor.register();
        blockStoneMagentaDarkPanel.register();

        blockStoneMagentaDarkChisel.register();
        blockStoneMagentaDarkTrim.register();

        slabStoneMagentaDark.register();
        slabDoubleStoneMagentaDark.register();
        slabDoubleStoneMagentaDark.setSlab(slabStoneMagentaDark);
        slabItemStoneMagentaDark.register();

        slabStoneMagentaDarkFloor.register();
        slabDoubleStoneMagentaDarkFloor.register();
        slabDoubleStoneMagentaDarkFloor.setSlab(slabStoneMagentaDarkFloor);
        slabItemStoneMagentaDarkFloor.register();

        slabStoneMagentaDarkBrick.register();
        slabDoubleStoneMagentaDarkBrick.register();
        slabDoubleStoneMagentaDarkBrick.setSlab(slabStoneMagentaDarkFloor);
        slabItemStoneMagentaDarkBrick.register();

        vertslabStoneMagentaDark.register();
        panelStoneMagentaDark.register();
        stairsStoneMagentaDark.register();

        blockStoneMagentaLight.register();
        blockStoneMagentaLightBrick.register();
        blockStoneMagentaLightFloor.register();
        blockStoneMagentaLightPanel.register();

        blockStoneMagentaLightChisel.register();
        blockStoneMagentaLightTrim.register();

        slabStoneMagentaLight.register();
        slabDoubleStoneMagentaLight.register();
        slabDoubleStoneMagentaLight.setSlab(slabStoneMagentaLight);
        slabItemStoneMagentaLight.register();

        slabStoneMagentaLightFloor.register();
        slabDoubleStoneMagentaLightFloor.register();
        slabDoubleStoneMagentaLightFloor.setSlab(slabStoneMagentaLightFloor);
        slabItemStoneMagentaLightFloor.register();

        slabStoneMagentaLightBrick.register();
        slabDoubleStoneMagentaLightBrick.register();
        slabDoubleStoneMagentaLightBrick.setSlab(slabStoneMagentaLightFloor);
        slabItemStoneMagentaLightBrick.register();

        vertslabStoneMagentaLight.register();
        panelStoneMagentaLight.register();
        stairsStoneMagentaLight.register();

        panelItemStoneMagentaDark.register();
        panelItemStoneMagentaLight.register();

        slabStoneMagentaLightRaw.register();
        slabDoubleStoneMagentaLightRaw.register();
        slabDoubleStoneMagentaLightRaw.setSlab(slabStoneMagentaLightRaw);
        slabItemStoneMagentaLightRaw.register();

        stairsStoneMagentaDarkRaw.register();
        vertslabStoneMagentaDarkRaw.register();
        stairsStoneMagentaLightRaw.register();
        vertslabStoneMagentaLightRaw.register();

    }
}
