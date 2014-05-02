package callumhutchy.co.uk.runecraft.items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;

public class BaseModItem extends Item{

	public BaseModItem() {
	
	}
		

	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister iconRegister) {
	itemIcon = iconRegister.registerIcon("runecraft:" + getUnlocalizedName().substring(5).toLowerCase());
	}
	
}
