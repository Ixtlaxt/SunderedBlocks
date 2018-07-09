package net.grallarius.sunderedblocks.block.workbench;

import net.grallarius.sunderedblocks.slots.*;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.items.IItemHandler;

public class ContainerWorkbench extends Container {

    public ContainerWorkbench(InventoryPlayer playerInv, final TileEntityWorkbench workbench) {
        IItemHandler inventory = workbench.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, EnumFacing.NORTH);
        addSlotToContainer(new SlotCraftableBlock(inventory, 0, 27, 38) {
            @Override
            public void onSlotChanged() { workbench.markDirty(); }
        });
        addSlotToContainer(new SlotSaw(inventory, 1, 134, 29) {
            @Override
            public void onSlotChanged() { workbench.markDirty(); }
        });
        addSlotToContainer(new SlotChisel(inventory, 2, 152, 29) {
            @Override
            public void onSlotChanged() { workbench.markDirty(); }
        });
        addSlotToContainer(new SlotHammer(inventory, 3, 134, 47) {
            @Override
            public void onSlotChanged() { workbench.markDirty(); }
        });
        addSlotToContainer(new SlotWrench(inventory, 4, 152, 47) {
            @Override
            public void onSlotChanged() { workbench.markDirty(); }
        });
        //this is the player's inventory://
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 9; j++) {
                addSlotToContainer(new Slot(playerInv, j + i * 9 + 9, 8 + j * 18, 84 + i * 18));
            }
        }
        for (int k = 0; k < 9; k++) {
            addSlotToContainer(new Slot(playerInv, k, 8 + k * 18, 142));
        }
    }

    @Override
    public boolean canInteractWith(EntityPlayer player) {
        return true;
    }

    @Override
    public ItemStack transferStackInSlot(EntityPlayer player, int index) {
        ItemStack itemstack = ItemStack.EMPTY;
        Slot slot = inventorySlots.get(index);

        if (slot != null && slot.getHasStack()) {
            ItemStack itemstack1 = slot.getStack();
            itemstack = itemstack1.copy();

            int containerSlots = inventorySlots.size() - player.inventory.mainInventory.size();

            if (index < containerSlots) {
                if (!this.mergeItemStack(itemstack1, containerSlots, inventorySlots.size(), true)) {
                    return ItemStack.EMPTY;
                }
            } else if (!this.mergeItemStack(itemstack1, 0, containerSlots, false)) {
                return ItemStack.EMPTY;
            }

            if (itemstack1.getCount() == 0) {
                slot.putStack(ItemStack.EMPTY);
            } else {
                slot.onSlotChanged();
            }

            if (itemstack1.getCount() == itemstack.getCount()) {
                return ItemStack.EMPTY;
            }

            slot.onTake(player, itemstack1);
        }

        return itemstack;
    }
}