package callumhutchy.co.uk.runecraft.items.weapons.rune;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import callumhutchy.co.uk.runecraft.Runecraft;
import net.minecraft.item.Item;

public class RuneBattleAxe extends Item{

	public RuneBattleAxe() {
		this.setTextureName("runecraft:weapons/runeBattleAxe");
		this.setUnlocalizedName("runeBattleAxe");
		this.setCreativeTab(Runecraft.tabRunecraftWeapons);
	}
	@SideOnly(Side.CLIENT)
    public boolean isFull3D()
    {
        return true;
    }
}
