package callumhutchy.co.uk.runecraft.items;

import net.minecraft.item.Item;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import callumhutchy.co.uk.runecraft.items.metal.Bar;
import callumhutchy.co.uk.runecraft.items.metal.RuneBar;
import callumhutchy.co.uk.runecraft.items.runes.AirRune;
import callumhutchy.co.uk.runecraft.items.runes.RuneItem;
import callumhutchy.co.uk.runecraft.items.weapons.staves.SkeletalAirStaff;

public class Items {

	//Runes
	public static RuneItem airRune;
	public static RuneItem armadylRune;
	public static RuneItem astralRune;
	public static RuneItem bloodRune;
	public static RuneItem bodyRune;
	public static RuneItem chaosRune;
	public static RuneItem cosmicRune;
	public static RuneItem deathRune;
	public static RuneItem dustRune;
	public static RuneItem earthRune;
	public static RuneItem fireRune;
	public static RuneItem lavaRune;
	public static RuneItem lawRune;
	public static RuneItem mindRune;
	public static RuneItem mistRune;
	public static RuneItem mudRune;
	public static RuneItem natureRune;
	public static RuneItem smokeRune;
	public static RuneItem soulRune;
	public static RuneItem steamRune;
	public static RuneItem waterRune;
	
	//Metal Bars
	public static Bar adamantBar;
	public static Bar bronzeBar;
	public static Bar goldBar;
	public static Bar ironBar;
	public static Bar mithrilBar;
	public static Bar runeBar;
	public static Bar silverBar;
	public static Bar steelBar;
	
	
	//Ores
	
	
	//Weapons
	public static Item skeletalAirStaff;
	
	//Food
	
	
	//Tools
	
	public static void init() {
		//Runes
		airRune = new AirRune();
		
		
		//Metal Bars
		runeBar = new RuneBar();
		
		//Weapons
		skeletalAirStaff = new SkeletalAirStaff();
		
	}

	@SuppressWarnings("deprecation")
	public static void addNames(){
		LanguageRegistry.addName(airRune, "Air Rune");
		LanguageRegistry.addName(runeBar, "Rune Bar");
		LanguageRegistry.addName(skeletalAirStaff, "Skeletal Air Staff");
	}
	
	public static void addItemsToGame(){
		GameRegistry.registerItem(airRune, airRune.getUnlocalizedName());
		GameRegistry.registerItem(runeBar, runeBar.getUnlocalizedName());
		GameRegistry.registerItem(skeletalAirStaff, skeletalAirStaff.getUnlocalizedName());
	}
	
	public static void addCraftingRecipes(){
		
	}
	
	
}
