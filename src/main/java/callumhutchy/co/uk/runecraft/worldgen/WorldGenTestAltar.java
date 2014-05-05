package callumhutchy.co.uk.runecraft.worldgen;

import java.util.Random;

import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

public class WorldGenTestAltar extends WorldGenerator{
	
	public WorldGenTestAltar() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean generate(World var1, Random var2, int var3, int var4,
			int var5) {
		while (var1.isAirBlock(var3, var4, var5) && var4 > 2)
        {
            --var4;
        }
		
		
		var4++;
		 var1.setBlock(var3, var4++, var5, net.minecraft.init.Blocks.diamond_block);
		 var1.setBlock(var3, var4++, var5, net.minecraft.init.Blocks.diamond_block);
		 var1.setBlock(var3, var4++, var5, net.minecraft.init.Blocks.diamond_block);
		
		return true;
	}

}
