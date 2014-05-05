package callumhutchy.co.uk.runecraft.blocks;

import java.util.Random;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.MathHelper;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import callumhutchy.co.uk.runecraft.Runecraft;
import callumhutchy.co.uk.runecraft.entity.EntityCopperOre;
import callumhutchy.co.uk.runecraft.entity.EntityRCFurnace;
import callumhutchy.co.uk.runecraft.entity.TileEntityGag;

public class RCfurnace extends BlockContainer {

	private int blockID;

	public RCfurnace(Material p_i45394_1_) {
		super(p_i45394_1_);
		this.setCreativeTab(Runecraft.tabRunecraftMetal);
        this.setBlockBounds(1F, 0F, -1F, -1F, 1.75F, 2F);
        this.setBlockTextureName("runecraft:RunecraftFurnaceTextureMap");
        this.setHardness(5F);
        this.setHarvestLevel("pickaxe", 1);
        }

	 

	//You don't want the normal render type, or it wont render properly.
	@Override
	public int getRenderType() {
	        return -1;
	}
	
	public int idDropped(int par1, Random random, int par2){
		return this.blockID;

	}
	
	
	public boolean shouldSideBeRendered(IBlockAccess iblockaccess, int i, int j, int k, int l)
	{
	   return false;
	}

	//And this tell it that you can see through this block, and neighbor blocks should be rendered.
	public boolean isOpaqueCube()
	{
	   return false;
	}

	@Override
	public TileEntity createNewTileEntity(World var1, int var2) {
		 return new EntityRCFurnace();
	}
	
	public void onBlockPlacedBy(World p_149689_1_, int p_149689_2_, int p_149689_3_, int p_149689_4_, EntityLivingBase p_149689_5_, ItemStack p_149689_6_)
    {
        int l = determineOrientation(p_149689_1_, p_149689_2_, p_149689_3_, p_149689_4_, p_149689_5_);
        p_149689_1_.setBlockMetadataWithNotify(p_149689_2_, p_149689_3_, p_149689_4_, l, 2);
        
    }



	 public static int determineOrientation(World p_150071_0_, int p_150071_1_, int p_150071_2_, int p_150071_3_, EntityLivingBase p_150071_4_)
	    {
	        if (MathHelper.abs((float)p_150071_4_.posX - (float)p_150071_1_) < 2.0F && MathHelper.abs((float)p_150071_4_.posZ - (float)p_150071_3_) < 2.0F)
	        {
	            double d0 = p_150071_4_.posY + 1.82D - (double)p_150071_4_.yOffset;

	            if (d0 - (double)p_150071_2_ > 2.0D)
	            {
	                return 1;
	            }

	            if ((double)p_150071_2_ - d0 > 0.0D)
	            {
	                return 0;
	            }
	        }

	        int l = MathHelper.floor_double((double)(p_150071_4_.rotationYaw * 4.0F / 360.0F) + 0.5D) & 3;
	        return l == 0 ? 2 : (l == 1 ? 5 : (l == 2 ? 3 : (l == 3 ? 4 : 0)));
	    }

	 @SubscribeEvent
	
	    public boolean onItemUse(ItemStack item, EntityPlayer player, World world, int x, int y, int z, int side, float xOffset, float yOffset, float zOffSet){
	        //Prevents itemstack from decreasing when in creative mod
	        //Prevents from making changes in inactive world
	        if (!world.isRemote){
	                //Increases y coordinate, so our block will be placed on top of the block you clicked, just as it should be
	                y++;
	                //Takes the player sight direction
	                int dir = MathHelper.floor_double((double)((player.rotationYaw * 4F) / 360F) + 0.5D) & 3;
	                //This array will store information about the coordinates where we want to place our gags relatively to the primary block.
	                //To add blocks, just add some more {rel_x, rel_y, rel_z} into the array.
	                //Exactly this array will add three gag block from the side of the primary block.
	                int[][] gagShift = {{-1, 0, -1}, {-1, 0, 0}, {-1, 0, 1}};
	                int[] shift;
	                //This cycle will prevent us from placing block instead of other ones, more commonly, it checks if the places where we want
	                //to place gags are empty.
	                boolean canPlace = true;
	                for(int i = 0; i < gagShift.length; i++){
	                        shift = rotXZByDir(gagShift[i][0], y, gagShift[i][1], dir);
	                        if(!world.isAirBlock(x + shift[0], y + shift[1], z + shift[2])){
	                                canPlace = false;
	                        }
	                }
	                //If the check was successful
	                if(canPlace){
	                        //0x02 flag will update neighboring flags, we have to use it, or we'll have some glitches.
	                        world.setBlock(x, y, z, Blocks.blockGag, dir, 0x02);
	                        //This code is placing gags one after another into the coordinates we've set.
	                        for(int i = 0; i < gagShift.length; i++){
	                                shift = rotXZByDir(gagShift[i][0], y, gagShift[i][1], dir);
	                                world.setBlock(x + shift[0], y + shift[1], z + shift[2], Blocks.blockGag, dir, 0x02);
	                                //For gags to know, where primary block is placed.
	                                TileEntityGag tileGag = (TileEntityGag)world.getTileEntity(
	                                                x + shift[0], y, z + shift[1]);
	                                if(tileGag != null){
	                                tileGag.primary_x = x;
	                                tileGag.primary_y = y;
	                                tileGag.primary_z = z;
	                                }
	                        }
	                }
	                        return true;
	                }
	        return false;
	    }
	        //This function rotates the relative coordinates accordingly to the given direction
	        public int[] rotXZByDir(int x, int y, int z, int dir){
	                if (dir == 0){
	                        return new int[]{x, y, z};
	                }else if(dir == 1){
	                        return new int[]{-z, y, x};
	                }else if(dir == 2){
	                        return new int[]{-x, y, -z};
	                }else{
	                        return new int[]{z, y, -x};
	                }
	        }
}
