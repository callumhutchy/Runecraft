package callumhutchy.co.uk.runecraft.gui;

import java.util.Collection;
import java.util.Iterator;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Gui;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.client.event.RenderGameOverlayEvent.ElementType;

import org.lwjgl.opengl.GL11;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;

public class GuiHealth extends Gui{

	private Minecraft mc;
	private static final ResourceLocation resourcelocation = new ResourceLocation("runecraft:textures/gui/hearticon.png");
    

	  public GuiHealth(Minecraft mc)
	  {
	    super();
	    
	    // We need this to invoke the render engine.
	    this.mc = mc;
	  }

	  private static final int BUFF_ICON_SIZE = 18;
	  private static final int BUFF_ICON_SPACING = BUFF_ICON_SIZE + 2; // 2 pixels between buff icons
	  private static final int BUFF_ICON_BASE_U_OFFSET = 0;
	  private static final int BUFF_ICON_BASE_V_OFFSET = 198;
	  private static final int BUFF_ICONS_PER_ROW = 8;
	  
	  @SubscribeEvent
	  public void onRenderExperienceBar(RenderGameOverlayEvent event)
	  {
	    // 
	    // We draw after the ExperienceBar has drawn.  The event raised by GuiIngameForge.pre()
	    // will return true from isCancelable.  If you call event.setCanceled(true) in
	    // that case, the portion of rendering which this event represents will be canceled.
	    // We want to draw *after* the experience bar is drawn, so we make sure isCancelable() returns
	    // false and that the eventType represents the ExperienceBar event.
	    if(event.isCancelable() || event.type != ElementType.EXPERIENCE)
	    {      
	      return;
	    }

	    // Starting position for the buff bar - 2 pixels from the top left corner.
	    int xPos = 2;
	    int yPos = 2;
	    float health = this.mc.thePlayer.getHealth();
	    if (health>0)
	    {
	      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
	      GL11.glDisable(GL11.GL_LIGHTING);      
	      this.mc.renderEngine.bindTexture(resourcelocation);
	      
	      
	      
	    }
	  }
	
}
