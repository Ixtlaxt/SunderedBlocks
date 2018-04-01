package net.grallarius.sunderedblocks.block;

import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class ModBlocks {

    public static BlockBase blockTest = new BlockBase(Material.ROCK, "test_block");
    public static BlockBase crateTest = new BlockBase(Material.WOOD, "crate_test");
    public static BlockCrate crateGoods = new BlockCrate();

    public static void preInit() {
        blockTest.register();
        crateTest.register();
        crateGoods.register();

    }

    public static void registerBlocks() {

    }

    public static void registerItemBlocks() {

    }

    public static void registerModels() {

    }
}
