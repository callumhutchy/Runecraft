package callumhutchy.co.uk.runecraft.blocks.ores;

import java.util.Random;

import callumhutchy.co.uk.runecraft.Runecraft;
import callumhutchy.co.uk.runecraft.entity.EntityCopperOre;
import callumhutchy.co.uk.runecraft.items.Items;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class copperOre extends BlockContainer{

	private int blockID;

	public copperOre(Material p_i45394_1_) {
		super(p_i45394_1_);
		this.setCreativeTab(Runecraft.tabRunecraftMetal);
        this.setBlockBounds(0.0625F, 0F, 0.0625F, 0.9375F, 0.8125F, 0.9375F);
        this.setBlockTextureName("runecraft:OreModelCopperTexture");
        this.setHardness(3F);
        this.setHarvestLevel("pickaxe", 1);
	}

	 

	//You don't want the normal render type, or it wont render properly.
	@Override
	public int getRenderType() {
	        return -1;
	}
	
	public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_)
    {
        return Items.oreCopper;
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
		 return new EntityCopperOre();
	}



}
