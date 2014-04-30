package callumhutchy.co.uk.runecraft.items.weapons.staves;

import callumhutchy.co.uk.runecraft.Runecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntitySnowball;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class SkeletalAirStaff extends Item {
	public SkeletalAirStaff(){
		this.setCreativeTab(Runecraft.tabRunecraftMagic);
		this.setMaxStackSize(1);
		this.setTextureName("runecraft:weapons/skeletalAirStaff");
		this.setUnlocalizedName("skeletalAirStaff");
	}
	
	public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
    {
        if (!par3EntityPlayer.capabilities.isCreativeMode)
        {
            --par1ItemStack.stackSize;
        }

        par2World.playSoundAtEntity(par3EntityPlayer, "random.bow", 0.5F, 0.4F / (itemRand.nextFloat() * 0.4F + 0.8F));

        if (!par2World.isRemote)
        {
            par2World.spawnEntityInWorld(new EntitySnowball(par2World, par3EntityPlayer));
        }

        return par1ItemStack;
    }
	
}
