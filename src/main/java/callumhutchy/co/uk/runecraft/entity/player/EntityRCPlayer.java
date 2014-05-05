package callumhutchy.co.uk.runecraft.entity.player;

import com.mojang.authlib.GameProfile;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ChunkCoordinates;
import net.minecraft.util.IChatComponent;
import net.minecraft.world.World;

public class EntityRCPlayer extends EntityPlayer {

	//Stats
	public float skillMining, skillStrength, skillSmithing, skillDefence, skillFishing, skillRanged, skillCooking, skillPrayer, skillCrafting, skillMagic, skillFletching, skillWoddcutting, skillRunecrafting, skillSlayer, skillFarming, skillConstruction, skillSummoning;
	

	public EntityRCPlayer(World p_i45324_1_, GameProfile p_i45324_2_) {
		super(p_i45324_1_, p_i45324_2_);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void addChatMessage(IChatComponent var1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean canCommandSenderUseCommand(int var1, String var2) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ChunkCoordinates getPlayerCoordinates() {
		// TODO Auto-generated method stub
		return null;
	}

}
