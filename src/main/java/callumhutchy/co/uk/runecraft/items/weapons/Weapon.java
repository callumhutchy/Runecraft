package callumhutchy.co.uk.runecraft.items.weapons;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import callumhutchy.co.uk.runecraft.Runecraft;
import callumhutchy.co.uk.runecraft.items.BaseModItem;

public class Weapon extends BaseModItem{

	public Weapon() {
		this.setCreativeTab(Runecraft.tabRunecraftWeapons);
		this.setMaxStackSize(1);
	}
	@SideOnly(Side.CLIENT)
    public boolean isFull3D()
    {
        return true;
    }
}
