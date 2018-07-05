package net.grallarius.sunderedblocks.network;

import io.netty.buffer.ByteBuf;
import net.grallarius.sunderedblocks.block.workbench.TileEntityWorkbench;
import net.minecraft.client.Minecraft;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraftforge.fml.common.network.ByteBufUtils;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

public class PacketUpdateWorkbench implements IMessage{
    private BlockPos pos;
    private ItemStack stack;
    private ItemStack stack2;

    public PacketUpdateWorkbench(BlockPos pos, ItemStack stack, ItemStack stack2){
        this.pos = pos;
        this.stack = stack;
        this.stack2 =stack2;
    }

    public PacketUpdateWorkbench(TileEntityWorkbench te) {
        this(te.getPos(), te.inventory.getStackInSlot(0), te.inventory.getStackInSlot(1));
    }

    public PacketUpdateWorkbench() {}

    @Override
    public void toBytes(ByteBuf buf) {
        buf.writeLong(pos.toLong());
        ByteBufUtils.writeItemStack(buf, stack);
        ByteBufUtils.writeItemStack(buf, stack2);
    }

    @Override
    public void fromBytes(ByteBuf buf) {
        pos = BlockPos.fromLong(buf.readLong());
        stack = ByteBufUtils.readItemStack(buf);
        stack2 = ByteBufUtils.readItemStack(buf);
    }

    public static class Handler implements IMessageHandler<PacketUpdateWorkbench, IMessage> {

        @Override
        public IMessage onMessage(PacketUpdateWorkbench message, MessageContext ctx) {
            Minecraft.getMinecraft().addScheduledTask(() -> {
                TileEntityWorkbench te = (TileEntityWorkbench)Minecraft.getMinecraft().world.getTileEntity(message.pos);
                te.inventory.setStackInSlot(0, message.stack);
                te.inventory.setStackInSlot(1,message.stack2);
            });
            return null;
        }

    }
}
