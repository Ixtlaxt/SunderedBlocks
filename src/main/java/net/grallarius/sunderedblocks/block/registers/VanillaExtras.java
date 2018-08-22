package net.grallarius.sunderedblocks.block.registers;

import net.grallarius.sunderedblocks.block.*;
import net.minecraft.block.material.Material;


public class VanillaExtras {

    public static BlockModDoubleSlab slabDoubleVanillaAndesite = new BlockModDoubleSlab(Material.ROCK, "slab_vanilla_andesite_double");
    public static BlockModSlab slabVanillaAndesite = new BlockModSlab(Material.ROCK,"slab_vanilla_andesite", slabDoubleVanillaAndesite);
    public static ItemModSlab slabItemVanillaAndesite = new ItemModSlab(slabVanillaAndesite, slabDoubleVanillaAndesite);

    public static BlockModDoubleSlab slabDoubleVanillaDiorite = new BlockModDoubleSlab(Material.ROCK, "slab_vanilla_diorite_double");
    public static BlockModSlab slabVanillaDiorite = new BlockModSlab(Material.ROCK,"slab_vanilla_diorite", slabDoubleVanillaDiorite);
    public static ItemModSlab slabItemVanillaDiorite = new ItemModSlab(slabVanillaDiorite, slabDoubleVanillaDiorite);

    public static BlockModDoubleSlab slabDoubleVanillaGranite = new BlockModDoubleSlab(Material.ROCK, "slab_vanilla_granite_double");
    public static BlockModSlab slabVanillaGranite = new BlockModSlab(Material.ROCK,"slab_vanilla_granite", slabDoubleVanillaGranite);
    public static ItemModSlab slabItemVanillaGranite = new ItemModSlab(slabVanillaGranite, slabDoubleVanillaGranite);

    public static BlockModStairs stairsVanillaAndesite = new BlockModStairs(slabDoubleVanillaAndesite.getDefaultState(), "stairs_vanilla_andesite");
    public static BlockModStairs stairsVanillaDiorite = new BlockModStairs(slabDoubleVanillaDiorite.getDefaultState(), "stairs_vanilla_diorite");
    public static BlockModStairs stairsVanillaGranite = new BlockModStairs(slabDoubleVanillaGranite.getDefaultState(), "stairs_vanilla_granite");

    public static BlockVertslab vertslabVanillaAndesite = new BlockVertslab("vertslab_vanilla_andesite");
    public static BlockVertslab vertslabVanillaDiorite = new BlockVertslab("vertslab_vanilla_diorite");
    public static BlockVertslab vertslabVanillaGranite = new BlockVertslab("vertslab_vanilla_granite");

    public static BlockVertslab vertslabVanillaWoodAcacia = new BlockVertslab("vertslab_vanilla_wood_acacia");
    public static BlockVertslab vertslabVanillaWoodBirch = new BlockVertslab("vertslab_vanilla_wood_birch");
    public static BlockVertslab vertslabVanillaWoodDark = new BlockVertslab("vertslab_vanilla_wood_dark");
    public static BlockVertslab vertslabVanillaWoodJungle = new BlockVertslab("vertslab_vanilla_wood_jungle");
    public static BlockVertslab vertslabVanillaWoodOak = new BlockVertslab("vertslab_vanilla_wood_oak");
    public static BlockVertslab vertslabVanillaWoodSpruce = new BlockVertslab("vertslab_vanilla_wood_spruce");

    public static BlockVertslab vertslabVanillaBrick = new BlockVertslab("vertslab_vanilla_brick");
    public static BlockVertslab vertslabVanillaCobblestone = new BlockVertslab("vertslab_vanilla_cobblestone");
    public static BlockVertslab vertslabVanillaNetherBrick = new BlockVertslab("vertslab_vanilla_nether_brick");
    public static BlockVertslab vertslabVanillaSandstone = new BlockVertslab("vertslab_vanilla_sandstone");
    public static BlockVertslab vertslabVanillaSandstoneRed = new BlockVertslab("vertslab_vanilla_sandstone_red");
    public static BlockVertslab vertslabVanillaStonebrick = new BlockVertslab("vertslab_vanilla_stonebrick");


    public static void register() {

        slabVanillaAndesite.register();
        slabDoubleVanillaAndesite.register();
        slabDoubleVanillaAndesite.setSlab(slabVanillaAndesite);
        slabItemVanillaAndesite.register();

        slabVanillaDiorite.register();
        slabDoubleVanillaDiorite.register();
        slabDoubleVanillaDiorite.setSlab(slabVanillaDiorite);
        slabItemVanillaDiorite.register();

        slabVanillaGranite.register();
        slabDoubleVanillaGranite.register();
        slabDoubleVanillaGranite.setSlab(slabVanillaGranite);
        slabItemVanillaGranite.register();

        stairsVanillaAndesite.register();
        stairsVanillaDiorite.register();
        stairsVanillaGranite.register();

        vertslabVanillaAndesite.register();
        vertslabVanillaDiorite.register();
        vertslabVanillaGranite.register();

        vertslabVanillaWoodAcacia.register();
        vertslabVanillaWoodBirch.register();
        vertslabVanillaWoodDark.register();
        vertslabVanillaWoodJungle.register();
        vertslabVanillaWoodOak.register();
        vertslabVanillaWoodSpruce.register();

        vertslabVanillaBrick.register();
        vertslabVanillaCobblestone.register();
        vertslabVanillaNetherBrick.register();
        vertslabVanillaSandstone.register();
        vertslabVanillaSandstoneRed.register();
        vertslabVanillaStonebrick.register();

    }
}
