package callumhutchy.co.uk.runecraft.items.runes;

import callumhutchy.co.uk.runecraft.Runecraft;
import net.minecraft.item.Item;

public class RuneItem extends Item {
	public RuneItem(){
		this.setCreativeTab(Runecraft.tabRunecraftMagic);
		this.setMaxStackSize(64);
	}
}
