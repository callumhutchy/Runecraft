package callumhutchy.co.uk.runecraft.items;

import net.minecraft.item.Item;
import net.minecraft.item.ItemFireball;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import callumhutchy.co.uk.runecraft.items.metal.Bar;
import callumhutchy.co.uk.runecraft.items.metal.RuneBar;
import callumhutchy.co.uk.runecraft.items.runes.AirRune;
import callumhutchy.co.uk.runecraft.items.runes.ArmadylRune;
import callumhutchy.co.uk.runecraft.items.runes.AstralRune;
import callumhutchy.co.uk.runecraft.items.runes.BloodRune;
import callumhutchy.co.uk.runecraft.items.runes.BodyRune;
import callumhutchy.co.uk.runecraft.items.runes.ChaosRune;
import callumhutchy.co.uk.runecraft.items.runes.CosmicRune;
import callumhutchy.co.uk.runecraft.items.runes.DeathRune;
import callumhutchy.co.uk.runecraft.items.runes.DustRune;
import callumhutchy.co.uk.runecraft.items.runes.EarthRune;
import callumhutchy.co.uk.runecraft.items.runes.FireRune;
import callumhutchy.co.uk.runecraft.items.runes.LavaRune;
import callumhutchy.co.uk.runecraft.items.runes.LawRune;
import callumhutchy.co.uk.runecraft.items.runes.MindRune;
import callumhutchy.co.uk.runecraft.items.runes.MistRune;
import callumhutchy.co.uk.runecraft.items.runes.MudRune;
import callumhutchy.co.uk.runecraft.items.runes.NatureRune;
import callumhutchy.co.uk.runecraft.items.runes.RuneItem;
import callumhutchy.co.uk.runecraft.items.runes.SmokeRune;
import callumhutchy.co.uk.runecraft.items.runes.SoulRune;
import callumhutchy.co.uk.runecraft.items.runes.SteamRune;
import callumhutchy.co.uk.runecraft.items.runes.WaterRune;
import callumhutchy.co.uk.runecraft.items.weapons.rune.RuneBattleAxe;
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
	
	
	
	
	public static Item airBlast;
	
	public static void init() {
		//Runes
		airRune = new AirRune();
		mindRune = new MindRune();
		waterRune = new WaterRune();
		earthRune = new EarthRune();
		fireRune = new FireRune();
		bodyRune = new BodyRune();
		cosmicRune = new CosmicRune();
		chaosRune = new ChaosRune();
		natureRune = new NatureRune();
		lawRune = new LawRune();
		deathRune = new DeathRune();
		astralRune = new AstralRune();
		bloodRune = new BloodRune();
		soulRune = new SoulRune();
		armadylRune = new ArmadylRune();
		dustRune = new DustRune();
		lavaRune = new LavaRune();
		mistRune = new MistRune();
		mudRune = new MudRune();
		smokeRune = new SmokeRune();
		steamRune = new SteamRune();
		
		
		//Metal Bars
		runeBar = new RuneBar();
		
		//Weapons
		skeletalAirStaff = new SkeletalAirStaff();
		runeDagger = new RuneDagger();
		runeBattleAxe = new RuneBattleAxe();
		
		
		
		//Misc
		airBlast = new AirBlast();
	}

	@SuppressWarnings("deprecation")
	public static void addNames(){
		
		//Runes
		LanguageRegistry.addName(airRune, "Air Rune");
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
		LanguageRegistry.addName(armadylRune, "Armadyl Rune");
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
	}
	
	public static void addItemsToGame(){
		//Rune
		GameRegistry.registerItem(airRune, airRune.getUnlocalizedName());
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
		GameRegistry.registerItem(armadylRune, armadylRune.getUnlocalizedName());
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
	
	}
	
	public static void addCraftingRecipes(){
		
	}
	
	
}
