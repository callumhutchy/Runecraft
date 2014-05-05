package callumhutchy.co.uk.runecraft.blocks;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import callumhutchy.co.uk.runecraft.blocks.ores.copperOre;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;


public class Blocks{

	//Ores
	
	//Misc
	public static Block RCfurnace;
	public static Block lit_RCfurnace;
	public static Block oreCopper;
	public static Block blockGag;
	
	
public static void init(){
	oreCopper = new copperOre(Material.rock);
	RCfurnace = new RCfurnace(Material.iron);
	blockGag = new BlockGag(Material.air);
	
	GameRegistry.registerBlock(oreCopper, "oreCopper");
	GameRegistry.registerBlock(RCfurnace, "RCfurnace");
	GameRegistry.registerBlock(blockGag, "Block Gag");
	
	LanguageRegistry.addName(oreCopper, "Copper Ore");
	LanguageRegistry.addName(RCfurnace, "Rc Furnace");
	
	
	
	
}

}
