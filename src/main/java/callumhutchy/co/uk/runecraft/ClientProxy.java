package callumhutchy.co.uk.runecraft;

import net.minecraft.client.renderer.entity.RenderSnowball;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import cpw.mods.fml.client.registry.RenderingRegistry;
import callumhutchy.co.uk.runecraft.entity.EntityAirBlast;
import callumhutchy.co.uk.runecraft.entity.render.RenderAirBlast;
import callumhutchy.co.uk.runecraft.items.Items;

public class ClientProxy extends CommonProxy{
	@Override
    public void registerRenderers() {
		RenderingRegistry.registerEntityRenderingHandler(EntityAirBlast.class, new RenderAirBlast(Items.airBlast));    
		// This is for rendering entities and so forth later on
    }
	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z)
	{
	TileEntity tileEntity = world.getTileEntity(x, y, z);
	if (tileEntity != null)
	{
	switch(ID)
	{
	case 0: /* your GUIs go here */
	}
	}
	return tileEntity;
}
}
