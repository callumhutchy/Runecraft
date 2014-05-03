package callumhutchy.co.uk.runecraft;

import net.minecraft.client.renderer.entity.RenderSnowball;
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
}
