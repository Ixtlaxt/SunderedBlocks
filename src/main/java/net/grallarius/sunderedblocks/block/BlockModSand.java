package net.grallarius.sunderedblocks.block;

import net.grallarius.sunderedblocks.InvModel;
import net.grallarius.sunderedblocks.SunderedBlocks;
import net.minecraft.block.BlockFalling;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

import static net.grallarius.sunderedblocks.SunderedBlocks.BLOCK_REGISTRY;
import static net.grallarius.sunderedblocks.SunderedBlocks.ITEM_REGISTRY;

public class BlockModSand extends BlockFalling {

    protected String name;

    public BlockModSand(String name) {

        this.name = name;

        setRegistryName(SunderedBlocks.MODID + ":" + name);
        setUnlocalizedName(name);
        setCreativeTab(SunderedBlocks.ixTab);
        setHardness(0.5F);
        setSoundType(SoundType.SAND);

    }

    public boolean canSustainPlant(IBlockState state, IBlockAccess world, BlockPos pos, EnumFacing direction, net.minecraftforge.common.IPlantable plantable) {

        IBlockState plant = plantable.getPlant(world, pos.offset(direction));
        net.minecraftforge.common.EnumPlantType plantType = plantable.getPlantType(world, pos.offset(direction));

        if (plant.getBlock() == net.minecraft.init.Blocks.CACTUS) { return true; }

        switch (plantType) {
            case Desert: return true;
            case Cave:   return state.isSideSolid(world, pos, EnumFacing.UP);
            case Beach:  boolean hasWater = (world.getBlockState(pos.east()).getMaterial() == Material.WATER ||
                                             world.getBlockState(pos.west()).getMaterial() == Material.WATER ||
                                             world.getBlockState(pos.north()).getMaterial() == Material.WATER ||
                                             world.getBlockState(pos.south()).getMaterial() == Material.WATER);
                return hasWater;
        }

        return false;
    }

    public void register(Item item) {
        BLOCK_REGISTRY.register(this);
        ITEM_REGISTRY.register(item);
        InvModel.add(item, name);
    }

    public void register() {
        register(new ItemBlock(this).setRegistryName(getRegistryName()));
    }
}
