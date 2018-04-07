package net.grallarius.sunderedblocks.block;

import net.minecraft.block.material.Material;

public class ModBlocks {

    public static BlockBase blockTest = new BlockBase(Material.ROCK, "test_block");
    public static BlockBase crateTest = new BlockBase(Material.WOOD, "crate_test");

    public static BlockVertslab vertslabTest = new BlockVertslab("vertslab_test");

    public static BlockCrate crateGoods = new BlockCrate("block_crate");

    public static void preInit() {
        blockTest.register();
        crateTest.register();

        vertslabTest.register();

        crateGoods.register();

    }

    public static void registerBlocks() {

    }

    public static void registerItemBlocks() {

    }

    public static void registerModels() {

    }
}
