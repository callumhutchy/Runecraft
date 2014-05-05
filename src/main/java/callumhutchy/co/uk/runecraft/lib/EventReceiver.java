package callumhutchy.co.uk.runecraft.lib;

import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.common.MinecraftForge;

public class EventReceiver {

	public void eventHandler(RenderGameOverlayEvent event){
    	MinecraftForge.EVENT_BUS.register(new EventReceiver());
    }

}
