package callumhutchy.co.uk.runecraft.worldgen;

import java.util.Random;

import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

public class WorldGenAirAltar extends WorldGenerator{
	
	public WorldGenAirAltar() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean generate(World var1, Random var2, int varX, int varY,
			int varZ) {
		while (var1.isAirBlock(varX, varY, varZ) && varY > 2)
        {
            --varY;
        }
		varY++;
		int varX3 = varX + 3;
		int varX_3 = varX - 3;
		int varZ3 = varZ + 3;
		int varZ_3 = varZ - 3;
		var1.setBlock(varX, varY, varZ, net.minecraft.init.Blocks.air);
		var1.setBlock(varX3, varY, varZ, net.minecraft.init.Blocks.diamond_block);
		var1.setBlock(varX_3, varY, varZ, net.minecraft.init.Blocks.diamond_block);
		var1.setBlock(varX, varY, varZ3, net.minecraft.init.Blocks.diamond_block);
		var1.setBlock(varX, varY, varZ_3, net.minecraft.init.Blocks.diamond_block);
		return true;
	}

}
