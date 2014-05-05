package callumhutchy.co.uk.runecraft.blocks;

import callumhutchy.co.uk.runecraft.entity.TileEntityGag;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockGag extends BlockContainer{
    
    public BlockGag(Material material){
    super(material);
    //register a texture for block for textureloader not to crash the game. This image can be even empty, 
    //cause we are not going to render the gag.
    this.setBlockTextureName("runecraft:GagBlock");
    }
    //This block is called when block is broken and destroys the primary block.
    public void breakBlock(World world, int i, int j, int k, int par5, int par6){
            //Reading the gag's tile entity.
            TileEntityGag tileEntity = (TileEntityGag)world.getTileEntity(i, j, k);
            //If not make this check, the game may crash if there's no tile entity at i, j, k.
            if (tileEntity != null){
                    //Actually destroys primary block.
                    world.setBlockToAir(tileEntity.primary_x, tileEntity.primary_y, tileEntity.primary_z);
                    //Forces removing tile entity from primary block coordinates,
                    //cause sometimes minecraft forgets to do that.
                    world.removeTileEntity(tileEntity.primary_x, tileEntity.primary_y, tileEntity.primary_z);
            }
            //Same as above, but for the gag block tile entity.
            world.removeTileEntity(i, j, k);
    }
    //This method checks if primary block exists. 
    public void onNeighborBlockChange(World world, int i, int j, int k, int par5){
            TileEntityGag tileEntity = (TileEntityGag)world.getTileEntity(i, j, k);
            if (tileEntity != null){
                    //No need to check if block's Id matches the Id of our primary block, 
                    //because if a player want to change a block, he needs to brake it first, 
                    //and in this case block will be set to Air (Id = 0)
                   
                    if(world.getBlockMetadata(tileEntity.primary_x,tileEntity.primary_y ,tileEntity.primary_z) < 1)
                    {
                    	world.setBlockToAir(i, j, k);
                        world.removeTileEntity(i, j, k);
                    }
            }
    }
    //This makes our gag invisible.
    @Override
    public boolean shouldSideBeRendered(IBlockAccess iblockaccess, int i, int j, int k, int l){
            return false;
    }
    //This tells minecraft to render surrounding blocks.
    @Override
    public boolean isOpaqueCube(){
            return false;
    }
    
	@Override
	public TileEntity createNewTileEntity(World var1, int var2) {
		// TODO Auto-generated method stub
		return new TileEntityGag();
	}
}
