package callumhutchy.co.uk.runecraft.blocks.render;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

import org.lwjgl.opengl.GL11;

import callumhutchy.co.uk.runecraft.blocks.Blocks;
import callumhutchy.co.uk.runecraft.entity.EntityRCFurnace;
import callumhutchy.co.uk.runecraft.models.oreModel;
import callumhutchy.co.uk.runecraft.models.rcfurnaceModel;

public class RenderRCFurnace extends TileEntitySpecialRenderer {
	//The model of your block
    private final rcfurnaceModel model;
    
    public RenderRCFurnace() {
            this.model = new rcfurnaceModel();
    }
    
    private void adjustRotatePivotViaMeta(World world, int x, int y, int z) {
            int meta = world.getBlockMetadata(x, y, z);
            GL11.glPushMatrix();
            GL11.glRotatef(meta * (-90), 0.0F, 0.0F, 1.0F);
            GL11.glPopMatrix();
    }
    
    @Override
    public void renderTileEntityAt(TileEntity te, double x, double y, double z, float scale) {
    
    	int metadata = te.getBlockMetadata();
    	World world = null;
    	float rotationAngle = 0;
    	int parX1 = (int)x + 1;
        int parY1 = (int)y;
        int parZ1 = (int)z;
        
		if (metadata%4 == 0)
    	         {
    	                         rotationAngle = 0;
    	                        world.setBlock(parX1, parY1, parZ1, Blocks.blockGag);
    	                        world.setBlock(parX1, parY1, parZ1--, Blocks.blockGag);
    	                        world.setBlock(parX1--, parY1, parZ1, Blocks.blockGag);
    	                        world.setBlock(parX1--, parY1, parZ1, Blocks.blockGag);
    	                        world.setBlock(parX1, parY1, parZ1++, Blocks.blockGag);
    	                        world.setBlock(parX1, parY1++, parZ1, Blocks.blockGag);
    	                        world.setBlock(parX1, parY1, parZ1--, Blocks.blockGag);
    	                        world.setBlock(parX1++, parY1, parZ1, Blocks.blockGag);
    	                        world.setBlock(parX1++, parY1, parZ1, Blocks.blockGag);
    	                        world.setBlock(parX1, parY1, parZ1++, Blocks.blockGag);
    	                        world.setBlock(parX1--, parY1, parZ1, Blocks.blockGag);
    	         }

    	         if (metadata%4 == 1)
    	         {
    	                         rotationAngle = 999999;
    	         }

    	         if (metadata%4 == 2)
    	         {
    	                         rotationAngle = 180;
    	         }

    	         if (metadata%4 == 3)
    	         {
    	                         rotationAngle = -180;
    	         }

    	
    	//The PushMatrix tells the renderer to "start" doing something.
            GL11.glPushMatrix();
    //This is setting the initial location.
            GL11.glTranslatef((float) x + 0.5F, (float) parY1 + 1.5F, (float) parZ1 + 0.5F);
    //This is the texture of your block. It's pathed to be the same place as your other blocks here.
            //Outdated bindTextureByName("/mods/roads/textures/blocks/TrafficLightPoleRed.png");
   //Use in 1.6.2  this
            ResourceLocation textures = (new ResourceLocation("runecraft:textures/blocks/RunecraftFurnaceTextureMap.png"));
    //the ':' is very important
    //binding the textures
            Minecraft.getMinecraft().renderEngine.bindTexture(textures);

    //This rotation part is very important! Without it, your model will render upside-down! And for some reason you DO need PushMatrix again!                       
            GL11.glPushMatrix();
            GL11.glRotatef(180.0F, 180.0F, 0.0F, rotationAngle);
    //A reference to your Model file. Again, very important.
            this.model.render((Entity)null, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F);
    //Tell it to stop rendering for both the PushMatrix's
            GL11.glPopMatrix();
            GL11.glPopMatrix();
    }

    
}

