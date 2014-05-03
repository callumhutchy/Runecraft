package callumhutchy.co.uk.runecraft.entity.render;

import net.minecraft.client.renderer.entity.RenderSnowball;
import net.minecraft.item.Item;

public class RenderAirBlast extends RenderSnowball{

	public RenderAirBlast(Item item) {
		this(item, 0);
		}

		public RenderAirBlast(Item item, int par2) {
		super(item, par2);
		}

}
