package net.grallarius.sunderedblocks.block;

import net.grallarius.sunderedblocks.InvModel;
import net.grallarius.sunderedblocks.item.ItemBlockCrate;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.IStringSerializable;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import static net.grallarius.sunderedblocks.SunderedBlocks.BLOCK_REGISTRY;
import static net.grallarius.sunderedblocks.SunderedBlocks.ITEM_REGISTRY;

public class BlockCrate extends BlockBase {

    public static final PropertyEnum<EnumGood> GOOD = PropertyEnum.create("good", EnumGood.class);

    public BlockCrate(String name) {

        super(Material.WOOD, name);
    }

    @Override
    public IBlockState getStateForPlacement(World world, BlockPos pos, EnumFacing facing, float hitX, float hitY, float hitZ, int i, EntityLivingBase player, EnumHand hand) {
        return getStateFromMeta(i);
    }

    public int damageDropped(IBlockState state) {
        return state.getValue(GOOD).getMetadata();
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void getSubBlocks(CreativeTabs tab, NonNullList<ItemStack> items) {
        EnumGood[] allGoods = EnumGood.values();
        for(EnumGood good : allGoods) {
            items.add(new ItemStack(this,1, good.getMetadata()));
        }
    }

    @Override
    public void register() {
        //System.out.println("Block: " + this.getUnlocalizedName().substring(5));
        BLOCK_REGISTRY.register(this);
        Item item = new ItemBlockCrate(this).setRegistryName(this.getUnlocalizedName().substring(5));
        //System.out.println("Item: " + item.getRegistryName());
        ITEM_REGISTRY.register(item);
        for(int i = 0; i < EnumGood.values().length; i++) {
            InvModel.add(item, i, this.getUnlocalizedName().substring(5), "good=" + EnumGood.byMetadata(i).getName());
        }
    }

    @Override
    @Deprecated
    public IBlockState getStateFromMeta(int meta) {
        return this.getDefaultState().withProperty(GOOD, EnumGood.byMetadata(meta));
    }

    public int getMetaFromState(IBlockState state) {
        return state.getValue(GOOD).getMetadata();
    }

    @Override
    @Deprecated
    public IBlockState getStateForPlacement(World world, BlockPos pos, EnumFacing facing, float hitX, float hitY, float hitZ, int meta, EntityLivingBase placer) {
        EnumGood good = EnumGood.byMetadata(meta);
        return this.getDefaultState().withProperty(GOOD, good);
    }

    @Override
    protected BlockStateContainer createBlockState() {
        return new BlockStateContainer(this, new IProperty[] {GOOD});
    }

    public enum EnumGood implements IStringSerializable {

        APPLE( 0, "apple"),
        BERRY( 1, "berry"),
        CARROT(2, "carrot"),
        FISH(  3, "fish"),
        GRAIN( 4, "grain"),
        INGOT( 5, "ingot"),
        POTATO(6, "potato"),
        SUGAR( 7, "sugar");

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
