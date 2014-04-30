package callumhutchy.co.uk.runecraft;

import callumhutchy.co.uk.runecraft.items.Items;
import callumhutchy.co.uk.runecraft.lib.IDs;
import callumhutchy.co.uk.runecraft.lib.Names;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Runecraft.MODID, version = Runecraft.VERSION)
public class Runecraft
{
    public static final String MODID = "runecraft";
    public static final String VERSION = "1.0";
    
    
    
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
    	
    }
    
    @EventHandler
    public void postInit(FMLPostInitializationEvent event){
    	
    }
    
    
}

