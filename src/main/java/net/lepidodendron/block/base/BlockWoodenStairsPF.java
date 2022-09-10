
package net.lepidodendron.block.base;

import net.lepidodendron.creativetab.TabLepidodendronBuilding;
import net.minecraft.block.Block;
import net.minecraft.block.BlockStairs;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class BlockWoodenStairsPF extends BlockStairs {

	public BlockWoodenStairsPF() {
		super(new Block(Material.WOOD).getDefaultState());
		setSoundType(SoundType.WOOD);
		setHarvestLevel("axe", 1);
		setHardness(2F);
		setResistance(3F);
		setLightLevel(0F);
		setLightOpacity(0);
		setCreativeTab(TabLepidodendronBuilding.tab);
	}

	@Override
	public boolean isOpaqueCube(IBlockState state) {
		return false;
	}

	@Override
	public int getFlammability(IBlockAccess world, BlockPos pos, EnumFacing face) {
		return 20;
	}

	@Override
	public int getFireSpreadSpeed(IBlockAccess world, BlockPos pos, EnumFacing face) {
		return 5;
	}

	@Override
	public MapColor getMapColor(IBlockState state, IBlockAccess blockAccess, BlockPos pos) {
		return MapColor.WOOD;
	}

}


