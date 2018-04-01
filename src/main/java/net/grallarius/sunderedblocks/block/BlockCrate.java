package net.grallarius.sunderedblocks.block;

import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IStringSerializable;
import net.minecraft.util.NonNullList;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import static net.grallarius.sunderedblocks.SunderedBlocks.BLOCK_REGISTRY;
import static net.grallarius.sunderedblocks.SunderedBlocks.ITEM_REGISTRY;

public class BlockCrate extends BlockBase {

    public static final PropertyEnum<EnumGood> GOOD = PropertyEnum.create("good", EnumGood.class);

    public BlockCrate() {

        super(Material.WOOD,"block_crate");
    }

    @SideOnly(Side.CLIENT)
    public void getSubBlocks(CreativeTabs tab, NonNullList<ItemStack> items) {
        EnumGood[] allGoods = EnumGood.values();
        for(EnumGood good : allGoods) {
            items.add(new ItemStack(this,1, good.getMetadata()));
        }
    }

    @Override
    public void register() {
        BLOCK_REGISTRY.register(this);
        EnumGood[] allGoods = EnumGood.values();
        for(EnumGood good : allGoods) {
            System.out.println("good: " + good);
            System.out.println("good registry name: " + getRegistryName());
            ITEM_REGISTRY.register(new ItemBlock(this).setRegistryName(getRegistryName()));

        }
    }

    public int getMetaFromState(IBlockState state) {
        EnumGood good = state.getValue(GOOD);
        return good.getMetadata();
    }

    @Override
    protected BlockStateContainer createBlockState() {
        return new BlockStateContainer(this, new IProperty[] {GOOD});
    }

    public enum EnumGood implements IStringSerializable {

        APPLE(0, "apple"),
        BERRY(1, "berry"),
        CARROT(2, "carrot"),
        FISH(3, "fish"),
        GRAIN(4, "grain"),
        INGOT(5, "ingot"),
        POTATO(6, "potato"),
        SUGAR(7, "sugar");

        private final int meta;
        private final String name;
        private static final EnumGood[] LOOKUP = new EnumGood[values().length];

        EnumGood(int meta, String name) {
            this.meta = meta;
            this.name = name;
        }

        static {
            for(EnumGood good : values()) {
                LOOKUP[good.getMetadata()] = good;
            }
        }

        public static EnumGood byMetadata(int meta) {
            if(meta < 0 || meta >= LOOKUP.length) {
                meta = 0;
            }
            return LOOKUP[meta];
        }

        public int getMetadata() {
            return this.meta;
        }

        public String toString() {
            return this.name;
        }

        public String getName() {
            return this.name;
        }

    }

}
