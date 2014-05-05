package callumhutchy.co.uk.runecraft;

import net.minecraft.client.renderer.entity.RenderSnowball;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;
import callumhutchy.co.uk.runecraft.blocks.render.RenderCopperOre;
import callumhutchy.co.uk.runecraft.blocks.render.RenderRCFurnace;
import callumhutchy.co.uk.runecraft.entity.EntityAirBlast;
import callumhutchy.co.uk.runecraft.entity.EntityCopperOre;
import callumhutchy.co.uk.runecraft.entity.EntityRCFurnace;
import callumhutchy.co.uk.runecraft.entity.render.RenderAirBlast;
import callumhutchy.co.uk.runecraft.items.Items;
import callumhutchy.co.uk.runecraft.models.oreModel;

public class ClientProxy extends CommonProxy{
	@Override
    public void registerRenderers() {
		RenderingRegistry.registerEntityRenderingHandler(EntityAirBlast.class, new RenderAirBlast(Items.airBlast));    
		// This is for rendering entities and so forth later on
		ClientRegistry.bindTileEntitySpecialRenderer(EntityCopperOre.class, new RenderCopperOre());
		ClientRegistry.bindTileEntitySpecialRenderer(EntityRCFurnace.class, new RenderRCFurnace());
		
	
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
