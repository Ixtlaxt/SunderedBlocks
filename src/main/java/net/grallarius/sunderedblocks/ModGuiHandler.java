package net.grallarius.sunderedblocks;

import net.grallarius.sunderedblocks.block.workbench.ContainerWorkbench;
import net.grallarius.sunderedblocks.block.workbench.GuiWorkbench;
import net.grallarius.sunderedblocks.block.workbench.TileEntityWorkbench;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;

public class ModGuiHandler implements IGuiHandler {

    public static final int WORKBENCH = 0;

    @Override
    public Container getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        switch (ID) {
            case WORKBENCH:
                return new ContainerWorkbench(player.inventory, (TileEntityWorkbench)world.getTileEntity(new BlockPos(x, y, z)));

            default:
                return null;
        }
    }

    @Override
    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        switch (ID) {
            case WORKBENCH:
                return new GuiWorkbench(getServerGuiElement(ID, player, world, x, y, z), player.inventory);
            default:
                return null;
        }
    }
}