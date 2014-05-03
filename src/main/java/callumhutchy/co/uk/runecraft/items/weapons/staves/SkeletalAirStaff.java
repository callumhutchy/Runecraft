package callumhutchy.co.uk.runecraft.items.weapons.staves;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import callumhutchy.co.uk.runecraft.Runecraft;
import callumhutchy.co.uk.runecraft.entity.EntityAirBlast;
import callumhutchy.co.uk.runecraft.items.Items;
import callumhutchy.co.uk.runecraft.items.weapons.Weapon;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityFireball;
import net.minecraft.entity.projectile.EntityLargeFireball;
import net.minecraft.entity.projectile.EntitySnowball;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class SkeletalAirStaff extends Weapon {
	private double accelerationX = 1;
	private double accelerationY = 0;
	private double accelerationZ = 0;
	public SkeletalAirStaff(){
		this.setCreativeTab(Runecraft.tabRunecraftMagic);
		
		
		this.setUnlocalizedName("skeletalAirStaff");
	}
	
	@Override
	 public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World,EntityPlayer par3EntityPlayer) {
	   if(par3EntityPlayer.capabilities.isCreativeMode||par3EntityPlayer.inventory.consumeInventoryItem(Items.airrune))
	   {
	     par2World.playSoundAtEntity(par3EntityPlayer, "random.bow", 0.5F, 0.4F / (itemRand.nextFloat() * 0.4F + 0.8F));
	     if (!par2World.isRemote)
	     {
	    	 	
	    
	       par2World.spawnEntityInWorld(new EntityAirBlast(par2World, par3EntityPlayer));
	     }
	   }
	   return par1ItemStack;
	   }
	
	
}
