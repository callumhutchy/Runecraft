package callumhutchy.co.uk.runecraft;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import callumhutchy.co.uk.runecraft.items.Items;
import callumhutchy.co.uk.runecraft.lib.IDs;
import callumhutchy.co.uk.runecraft.lib.Names;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(modid = Runecraft.MODID, version = Runecraft.VERSION)
public class Runecraft
{
    public static final String MODID = "runecraft";
    public static final String VERSION = "1.0";
    
    public static CreativeTabs tabRunecraftMagic = new CreativeTabs("tabRunecraftMagic"){
			@Override
			public Item getTabIconItem() {
				return Items.airrune;
			}
    };
    
    public static CreativeTabs tabRunecraftMetal = new CreativeTabs("tabRunecraftMetal"){
		@Override
		public Item getTabIconItem() {
			return Items.runeBar;
		}
    };
    
    public static CreativeTabs tabRunecraftWeapons = new CreativeTabs("tabRunecraftWeapons"){
		@Override
		public Item getTabIconItem() {
			return Items.runeDagger;
		}
    };
    
    
    @SidedProxy(clientSide="callumhutchy.co.uk.runecraft.ClientProxy", serverSide="callumhutchy.co.uk.runecraft.CommonProxy")
    public static CommonProxy proxy;
    
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event){
    	Names.init();
    	IDs.init();
    	
    }
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
    	
    	Items.init();
    	Items.addNames();
    	Items.addItemsToGame();
    	Items.addCraftingRecipes();
    	
    	
    	LanguageRegistry.instance().addStringLocalization("itemGroup.tabRunecraftMagic","en_US","Runecraft Magic");
    	LanguageRegistry.instance().addStringLocalization("itemGroup.tabRunecraftMetal","en_US","Runecraft Metal");
    	LanguageRegistry.instance().addStringLocalization("itemGroup.tabRunecraftWeapons","en_US","Runecraft Weapons");

    	
    }
    
    @EventHandler
    public void postInit(FMLPostInitializationEvent event){
    	
    }
    
    
}

