package callumhutchy.co.uk.runecraft;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import cpw.mods.fml.common.network.IGuiHandler;

public class CommonProxy implements IGuiHandler{
	public void registerRenderers() {
        // Nothing here as the server doesn't render graphics or entities!
}

	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world,int x, int y, int z) {
		TileEntity tileEntity = world.getTileEntity(x, y, z);

		if(tileEntity != null)
		{
		switch(ID)
		{
		case 0: /* your Containers go here*/
		}
		}
		return tileEntity;
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world,
			int x, int y, int z) {
		// TODO Auto-generated method stub
		return null;
	}
}
