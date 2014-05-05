package callumhutchy.co.uk.runecraft.items;

import net.minecraft.item.Item;
import net.minecraft.item.ItemFireball;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import callumhutchy.co.uk.runecraft.items.metal.Bar;
import callumhutchy.co.uk.runecraft.items.metal.RuneBar;
import callumhutchy.co.uk.runecraft.items.weapons.BattleAxe;
import callumhutchy.co.uk.runecraft.items.weapons.Dagger;
import callumhutchy.co.uk.runecraft.items.weapons.Weapon;
import callumhutchy.co.uk.runecraft.items.weapons.rune.RuneBattleAxe;
import callumhutchy.co.uk.runecraft.items.weapons.rune.RuneDagger;
import callumhutchy.co.uk.runecraft.items.weapons.staves.SkeletalAirStaff;

public class Items {

	//Runes
	public static Item airrune;
	public static Item armadylrune;
	public static Item astralRune;
	public static Item bloodRune;
	public static Item bodyRune;
	public static Item chaosRune;
	public static Item cosmicRune;
	public static Item deathRune;
	public static Item dustRune;
	public static Item earthRune;
	public static Item fireRune;
	public static Item lavaRune;
	public static Item lawRune;
	public static Item mindRune;
	public static Item mistRune;
	public static Item mudRune;
	public static Item natureRune;
	public static Item smokeRune;
	public static Item soulRune;
	public static Item steamRune;
	public static Item waterRune;
	
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
	public static Item runeBattleAxe;
	
	
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
	
	//Ore Items
	public static Item oreCopper;
	
	
	
	public static Item airBlast;
	
	public static void init() {
		//Runes
		airrune = new RuneItem().setUnlocalizedName("airrune");
		mindRune = new RuneItem().setUnlocalizedName("mindrune");
		waterRune = new RuneItem().setUnlocalizedName("waterrune");
		earthRune = new RuneItem().setUnlocalizedName("earthrune");
		fireRune = new RuneItem().setUnlocalizedName("firerune");
		bodyRune = new RuneItem().setUnlocalizedName("bodyrune");
		cosmicRune = new RuneItem().setUnlocalizedName("cosmicrune");
		chaosRune = new RuneItem().setUnlocalizedName("chaosrune");
		natureRune = new RuneItem().setUnlocalizedName("naturerune");
		lawRune = new RuneItem().setUnlocalizedName("lawrune");
		deathRune = new RuneItem().setUnlocalizedName("deathrune");
		astralRune = new RuneItem().setUnlocalizedName("astralrune");
		bloodRune = new RuneItem().setUnlocalizedName("bloodrune");
		soulRune = new RuneItem().setUnlocalizedName("soulrune");
		armadylrune = new RuneItem().setUnlocalizedName("armadylrune");
		dustRune = new RuneItem().setUnlocalizedName("dustrune");
		lavaRune = new RuneItem().setUnlocalizedName("lavarune");
		mistRune = new RuneItem().setUnlocalizedName("mistrune");
		mudRune = new RuneItem().setUnlocalizedName("mudrune");
		smokeRune = new RuneItem().setUnlocalizedName("smokerune");
		steamRune = new RuneItem().setUnlocalizedName("steamrune");
		
		
		//Metal Bars
		runeBar = new RuneBar();
		
		//Weapons
		skeletalAirStaff = new SkeletalAirStaff();
		runeDagger = new Dagger().setUnlocalizedName("runedagger");
		runeBattleAxe = new BattleAxe().setUnlocalizedName("runebattleaxe");
		
		//Ore Items
		oreCopper = new OreItem().setUnlocalizedName("oreCopper");
		
		
		//Misc
		airBlast = new AirBlast().setUnlocalizedName("airblast");;
	}

	@SuppressWarnings("deprecation")
	public static void addNames(){
		
		//Runes
		LanguageRegistry.addName(airrune, "Air Rune");
		LanguageRegistry.addName(mindRune, "Mind Rune");
		LanguageRegistry.addName(waterRune, "Water Rune");
		LanguageRegistry.addName(earthRune, "Earth Rune");
		LanguageRegistry.addName(fireRune, "Fire Rune");
		LanguageRegistry.addName(bodyRune, "Body Rune");
		LanguageRegistry.addName(cosmicRune, "Cosmic Rune");
		LanguageRegistry.addName(chaosRune, "Chaos Rune");
		LanguageRegistry.addName(natureRune, "Nature Rune");
		LanguageRegistry.addName(lawRune, "Law Rune");
		LanguageRegistry.addName(deathRune, "Death Rune");
		LanguageRegistry.addName(astralRune, "Astral Rune");
		LanguageRegistry.addName(bloodRune, "Blood Rune");
		LanguageRegistry.addName(soulRune, "Soul Rune");
		LanguageRegistry.addName(armadylrune, "Armadyl Rune");
		LanguageRegistry.addName(dustRune, "Dust Rune");
		LanguageRegistry.addName(lavaRune, "Lava Rune");
		LanguageRegistry.addName(mistRune, "Mist Rune");
		LanguageRegistry.addName(mudRune, "Mud Rune");
		LanguageRegistry.addName(smokeRune, "Smoke Rune");
		LanguageRegistry.addName(steamRune, "Steam Rune");
		
		
		//Metals
		LanguageRegistry.addName(runeBar, "Rune Bar");
		
		
		//Weapons
		LanguageRegistry.addName(skeletalAirStaff, "Skeletal Air Staff");
		LanguageRegistry.addName(runeDagger, "Rune Dagger");
		LanguageRegistry.addName(runeBattleAxe, "Rune BattleAxe");
		
		//Ore Item
		LanguageRegistry.addName(oreCopper, "Copper Ore");
		
		LanguageRegistry.addName(airBlast, "Air Blast");
	}
	
	public static void addItemsToGame(){
		//Rune
		GameRegistry.registerItem(airrune, airrune.getUnlocalizedName());
		GameRegistry.registerItem(mindRune, mindRune.getUnlocalizedName());
		GameRegistry.registerItem(waterRune, waterRune.getUnlocalizedName());
		GameRegistry.registerItem(earthRune, earthRune.getUnlocalizedName());
		GameRegistry.registerItem(fireRune, fireRune.getUnlocalizedName());
		GameRegistry.registerItem(bodyRune, bodyRune.getUnlocalizedName());
		GameRegistry.registerItem(cosmicRune, cosmicRune.getUnlocalizedName());
		GameRegistry.registerItem(chaosRune, chaosRune.getUnlocalizedName());
		GameRegistry.registerItem(natureRune, natureRune.getUnlocalizedName());
		GameRegistry.registerItem(lawRune, lawRune.getUnlocalizedName());
		GameRegistry.registerItem(deathRune, deathRune.getUnlocalizedName());
		GameRegistry.registerItem(astralRune, astralRune.getUnlocalizedName());
		GameRegistry.registerItem(bloodRune, bloodRune.getUnlocalizedName());
		GameRegistry.registerItem(soulRune, soulRune.getUnlocalizedName());
		GameRegistry.registerItem(armadylrune, armadylrune.getUnlocalizedName());
		GameRegistry.registerItem(dustRune, dustRune.getUnlocalizedName());
		GameRegistry.registerItem(lavaRune, lavaRune.getUnlocalizedName());
		GameRegistry.registerItem(mistRune, mistRune.getUnlocalizedName());
		GameRegistry.registerItem(mudRune, mudRune.getUnlocalizedName());
		GameRegistry.registerItem(smokeRune, smokeRune.getUnlocalizedName());
		GameRegistry.registerItem(steamRune, steamRune.getUnlocalizedName());
		
		
		//Metal
		GameRegistry.registerItem(runeBar, runeBar.getUnlocalizedName());
		
		
		//Weapons
		GameRegistry.registerItem(skeletalAirStaff, skeletalAirStaff.getUnlocalizedName());
		GameRegistry.registerItem(runeDagger, runeDagger.getUnlocalizedName());
		GameRegistry.registerItem(runeBattleAxe, runeBattleAxe.getUnlocalizedName());
	
		//Ore Item
		GameRegistry.registerItem(oreCopper, oreCopper.getUnlocalizedName());
		
		GameRegistry.registerItem(airBlast, airBlast.getUnlocalizedName());
	}
	
	public static void addCraftingRecipes(){
		
	}
	
	
}
