package net.grallarius.sunderedblocks.block.workbench;

import net.grallarius.sunderedblocks.SunderedBlocks;
import net.grallarius.sunderedblocks.network.PacketRequestUpdateWorkbench;
import net.grallarius.sunderedblocks.network.PacketUpdateWorkbench;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.items.ItemStackHandler;

import javax.annotation.Nullable;

public class TileEntityWorkbench extends TileEntity {
    public int facing;

    public ItemStackHandler inventory = new ItemStackHandler(2) {

        @Override
        protected void onContentsChanged(int slot){
            if (!world.isRemote) {
                SunderedBlocks.wrapper.sendToAllAround(new PacketUpdateWorkbench(TileEntityWorkbench.this), new NetworkRegistry.TargetPoint(world.provider.getDimension(), pos.getX(), pos.getY(), pos.getZ(), 64));
            }
        }

    };

    @Override
    public void onLoad() {
        if (world.isRemote) {
            SunderedBlocks.wrapper.sendToServer(new PacketRequestUpdateWorkbench(this));
        }
    }

    public NBTTagCompound writeToNBT(NBTTagCompound compound) {
        compound.setTag("inventory", inventory.serializeNBT());
        compound.setInteger("facing", getFacing());
        return super.writeToNBT(compound);
    }


    @Override
    public void readFromNBT(NBTTagCompound compound) {
        inventory.deserializeNBT(compound.getCompoundTag("inventory"));
        facing = compound.getInteger("facing");
        super.readFromNBT(compound);
    }

    public int getFacing() { return facing; }

    public void setFacing(int facing) { this.facing = facing; }

    @Override
    public boolean hasCapability(Capability<?> capability, @Nullable EnumFacing facing) {
        return capability == CapabilityItemHandler.ITEM_HANDLER_CAPABILITY || super.hasCapability(capability, facing);
    }

    @Nullable
    @Override
    public <T> T getCapability(Capability<T> capability, @Nullable EnumFacing facing) {
        return capability == CapabilityItemHandler.ITEM_HANDLER_CAPABILITY ? (T)inventory : super.getCapability(capability, facing);
    }

    @Override
    public AxisAlignedBB getRenderBoundingBox() {
        return new AxisAlignedBB(getPos(), getPos().add(1, 2, 1));
    }
}
