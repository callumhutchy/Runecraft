package callumhutchy.co.uk.runecraft.items;

import net.minecraft.item.Item;
import net.minecraft.item.ItemFireball;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import callumhutchy.co.uk.runecraft.items.metal.Bar;
import callumhutchy.co.uk.runecraft.items.metal.RuneBar;
import callumhutchy.co.uk.runecraft.items.runes.AirRune;
import callumhutchy.co.uk.runecraft.items.runes.RuneItem;
import callumhutchy.co.uk.runecraft.items.weapons.rune.RuneDagger;
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
	public static Item runeDagger;
	
	
	//Food
	
	
	//Tools
	public static Item fishingNet;
	public static Item bigfishingNet;
	public static Item flyFishingRod;
	public static Item harpoon;
	public static Item cage;
	
	
	//Misc
	
	
	//Fish
	public static Item crayFish;//
	public static Item shrimp;//
	public static Item sardines;
	public static Item herring;
	public static Item achovies;//
	public static Item mackerel;
	public static Item trout;
	public static Item pike;
	public static Item salmon;
	public static Item tuna;
	public static Item lobsters;
	public static Item swordFish;
	public static Item monkFish;
	public static Item shark;
	public static Item caveFish;
	public static Item rocktails;
	
	public static Item cooked_crayFish;//
	public static Item cooked_shrimp;//
	public static Item cooked_sardines;
	public static Item cooked_herring;
	public static Item cooked_achovies;//
	public static Item cooked_mackerel;
	public static Item cooked_trout;
	public static Item cooked_pike;
	public static Item cooked_salmon;
	public static Item cooked_tuna;
	public static Item cooked_lobsters;
	public static Item cooked_swordFish;
	public static Item cooked_monkFish;
	public static Item cooked_shark;
	public static Item cooked_caveFish;
	public static Item cooked_rocktails;
	
	
	
	
	public static Item airBlast;
	
	public static void init() {
		//Runes
		airRune = new AirRune();
		
		
		//Metal Bars
		runeBar = new RuneBar();
		
		//Weapons
		skeletalAirStaff = new SkeletalAirStaff();
		runeDagger = new RuneDagger();
		
		
		
		//Misc
		airBlast = new AirBlast();
	}

	@SuppressWarnings("deprecation")
	public static void addNames(){
		LanguageRegistry.addName(airRune, "Air Rune");
		LanguageRegistry.addName(runeBar, "Rune Bar");
		LanguageRegistry.addName(skeletalAirStaff, "Skeletal Air Staff");
		LanguageRegistry.addName(runeDagger, "Rune Dagger");
	}
	
	public static void addItemsToGame(){
		GameRegistry.registerItem(airRune, airRune.getUnlocalizedName());
		GameRegistry.registerItem(runeBar, runeBar.getUnlocalizedName());
		GameRegistry.registerItem(skeletalAirStaff, skeletalAirStaff.getUnlocalizedName());
		GameRegistry.registerItem(runeDagger, runeDagger.getUnlocalizedName());
	
	}
	
	public static void addCraftingRecipes(){
		
	}
	
	
}
