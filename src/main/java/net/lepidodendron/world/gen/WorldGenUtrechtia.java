package net.lepidodendron.world.gen;

import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import net.lepidodendron.block.BlockUtrechtiaSapling;
import net.lepidodendron.block.BlockUtrechtiaStem;
import net.lepidodendron.procedure.ProcedureWorldGenUtrechtia;
import net.lepidodendron.util.Functions;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

import java.util.HashMap;
import java.util.Random;


public class WorldGenUtrechtia extends WorldGenerator
{

    public boolean generate(World worldIn, Random rand, BlockPos position)
    {
        boolean flag = false;

        for (int i = 0; i < 12; ++i)
        {
            BlockPos blockpos = position.add(rand.nextInt(4) - rand.nextInt(4), rand.nextInt(4) - rand.nextInt(4), rand.nextInt(4) - rand.nextInt(4));

            if (blockpos.getY() >= Functions.getAdjustedSeaLevel(worldIn, blockpos)-4 && worldIn.isAirBlock(blockpos) && (!worldIn.provider.isNether() || blockpos.getY() < 254) && BlockUtrechtiaSapling.block.canPlaceBlockAt(worldIn, blockpos)
            	&& (worldIn.getBlockState(blockpos.east()).getBlock() != BlockUtrechtiaStem.block)
            	&& (worldIn.getBlockState(blockpos.west()).getBlock() != BlockUtrechtiaStem.block)
            	&& (worldIn.getBlockState(blockpos.north()).getBlock() != BlockUtrechtiaStem.block)
            	&& (worldIn.getBlockState(blockpos.south()).getBlock() != BlockUtrechtiaStem.block)
                && (blockpos.getY() < 100)
            	)
            {
                Object2ObjectOpenHashMap<String, Object> $_dependencies = new Object2ObjectOpenHashMap <> ();
					$_dependencies.put("x", blockpos.getX());
					$_dependencies.put("y", blockpos.getY());
					$_dependencies.put("z", blockpos.getZ());
					$_dependencies.put("world", worldIn);
				ProcedureWorldGenUtrechtia.executeProcedure($_dependencies);
                flag = true;
            }
        }

        return flag;
    }
}
