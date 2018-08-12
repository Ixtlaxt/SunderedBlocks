package net.grallarius.sunderedblocks.block;

import net.grallarius.sunderedblocks.SunderedBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import static net.grallarius.sunderedblocks.SunderedBlocks.BLOCK_REGISTRY;


public class BlockModSlab extends BlockSlab {

    protected String name;
    public Item itemBlock = null;
    private Block doubleSlab;

    public BlockModSlab(Material materialIn, String name, Block block) {
        super(materialIn);
        this.name = name;
        setRegistryName(name);
        setUnlocalizedName(SunderedBlocks.MODID + "." + name);
        this.setHardness(2.0F);
        this.useNeighborBrightness = true;
        this.doubleSlab = block;
        setCreativeTab(SunderedBlocks.ixTab);
    }

    public void register(Item item) {

/*        ITEM_REGISTRY.register(item);
        InvModel.add(item, name);*/
    }

    public void register() {
        BLOCK_REGISTRY.register(this);
    }

    @SideOnly(Side.CLIENT)
    protected static boolean isHalfSlab(IBlockState state) {
        return true;
    }

    @Override
    public int damageDropped(IBlockState state) {
        return this.getMetaFromState(state.withProperty(HALF, BlockSlab.EnumBlockHalf.BOTTOM));
    }

    @Override
    public boolean isOpaqueCube(IBlockState state) {
        return false;
    }

    @Override
    public boolean isFullCube(IBlockState state) {
        return false;
    }


    @Override
    @Deprecated
    public IBlockState getStateFromMeta(int meta) {
        IBlockState iblockstate = this.getDefaultState();
        if (!this.isDouble())
            iblockstate = iblockstate.withProperty(HALF,
                    (meta) == 0 ? BlockSlab.EnumBlockHalf.BOTTOM : BlockSlab.EnumBlockHalf.TOP);

        return iblockstate;
    }

    @Override
    public int getMetaFromState(IBlockState state) {
        return state.getValue(HALF) == EnumBlockHalf.BOTTOM ? 0 : 1;
    }

    @Override
    protected BlockStateContainer createBlockState() {
        return new BlockStateContainer(this, HALF);
    }

    @Override
    public boolean isDouble() {
        return false;
    }

    @Override
    public String getUnlocalizedName(int meta) {
        return null;
    }

    @Override
    public IProperty getVariantProperty() {
        return HALF;
    }

    @Override
    public Comparable<?> getTypeForItem(ItemStack stack) {
        return 0;
    }


}
