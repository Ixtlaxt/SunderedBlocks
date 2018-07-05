package net.grallarius.sunderedblocks.network;

import io.netty.buffer.ByteBuf;
import net.grallarius.sunderedblocks.block.workbench.TileEntityWorkbench;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

public class PacketRequestUpdateWorkbench implements IMessage {
    private BlockPos pos;
    private int dimension;

    public PacketRequestUpdateWorkbench(BlockPos pos, int dimension) {
        this.pos = pos;
        this.dimension = dimension;
    }

    public  PacketRequestUpdateWorkbench(TileEntityWorkbench te) {
        this(te.getPos(), te.getWorld().provider.getDimension());
    }

    public PacketRequestUpdateWorkbench(){}

    @Override
    public void toBytes(ByteBuf buf) {
        buf.writeLong(pos.toLong());
        buf.writeInt(dimension);
    }

    @Override
    public void fromBytes(ByteBuf buf) {
        pos = BlockPos.fromLong(buf.readLong());
        dimension = buf.readInt();
    }

    public static class Handler implements IMessageHandler<PacketRequestUpdateWorkbench, PacketUpdateWorkbench> {

        @Override
        public PacketUpdateWorkbench onMessage(PacketRequestUpdateWorkbench message, MessageContext ctx) {
            World world = FMLCommonHandler.instance().getMinecraftServerInstance().getWorld(message.dimension);
            TileEntityWorkbench te = (TileEntityWorkbench) world.getTileEntity(message.pos);
            if (te != null) {
                return new PacketUpdateWorkbench(te);
            } else {
                return null;
            }
        }

    }

}
