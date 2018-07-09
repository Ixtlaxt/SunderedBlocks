package net.grallarius.sunderedblocks.slots;

import net.minecraft.block.*;
import net.minecraft.item.ItemStack;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.IItemHandlerModifiable;
import net.minecraftforge.items.SlotItemHandler;

import javax.annotation.Nonnull;

public class SlotCraftableBlock extends SlotItemHandler {

    private final IItemHandler itemHandler;
    private final int index;

    public SlotCraftableBlock(IItemHandler itemHandler, int index, int xPosition, int yPosition){
        super(itemHandler, index, xPosition, yPosition);
        this.itemHandler = itemHandler;
        this.index = index;
    }

    @Override
    public boolean isItemValid(@Nonnull ItemStack stack)
    {
        if (stack.isEmpty())
            return false;

        //there are better ways to write this, needs to be redone but will work for testing//
        Block block = Block.getBlockFromItem(stack.getItem());
        Boolean isPlanks = block instanceof BlockPlanks;
        Boolean isStone = block instanceof BlockStone;
        Boolean isSandstone = block instanceof BlockSandStone | block instanceof BlockRedSandstone;

        if ((!isPlanks) && (!isStone) && (!isSandstone))
        {return false;
        }

        IItemHandler handler = this.getItemHandler();
        ItemStack remainder;
        if (handler instanceof IItemHandlerModifiable)
        {
            IItemHandlerModifiable handlerModifiable = (IItemHandlerModifiable) handler;
            ItemStack currentStack = handlerModifiable.getStackInSlot(index);

            handlerModifiable.setStackInSlot(index, ItemStack.EMPTY);

            remainder = handlerModifiable.insertItem(index, stack, true);

            handlerModifiable.setStackInSlot(index, currentStack);
        }
        else
        {
            remainder = handler.insertItem(index, stack, true);
        }
        return remainder.isEmpty() || remainder.getCount() < stack.getCount();
    }
}
