
package net.lepidodendron.block;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronConfig;
import net.lepidodendron.LepidodendronSorter;
import net.lepidodendron.item.ItemBuckthornBerries;
import net.minecraft.block.Block;
import net.minecraft.block.BlockLeaves;
import net.minecraft.block.BlockPlanks;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.state.BlockFaceShape;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.statemap.StateMap;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.items.ItemHandlerHelper;
import net.minecraftforge.oredict.OreDictionary;

import javax.annotation.Nullable;

@ElementsLepidodendronMod.ModElement.Tag
public class BlockBuckthornBerries extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:buckthorn_berries")
	public static final Block block = null;
	public BlockBuckthornBerries(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.buckthorn);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom().setRegistryName("buckthorn_berries"));
		//elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		//ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
		//		new ModelResourceLocation("lepidodendron:buckthorn_berries", "inventory"));
		ModelLoader.setCustomStateMapper(block, (new StateMap.Builder()).ignore(BlockLeaves.DECAYABLE, BlockLeaves.CHECK_DECAY).build());
	}

	@Override
	public void init(FMLInitializationEvent event) {
		super.init(event);
		OreDictionary.registerOre("plantdnaPNlepidodendron:buckthorn", BlockBuckthornBerries.block);
		OreDictionary.registerOre("plantPrehistoric", BlockBuckthornBerries.block);
		OreDictionary.registerOre("plant", BlockBuckthornBerries.block);
	}

	public static final PropertyBool VAR = PropertyBool.create("var");

	public static class BlockCustom extends BlockLeaves {
		public BlockCustom() {
			super();
			setTranslationKey("pf_buckthorn_berries");
			setSoundType(SoundType.PLANT);
			setHardness(0.3F);
			setResistance(0.3F);
			setLightLevel(0F);
			setLightOpacity(0);
			setCreativeTab(null);
			this.setDefaultState(this.blockState.getBaseState().withProperty(CHECK_DECAY, false).withProperty(DECAYABLE, false));
		}

		@Override
		public IBlockState getActualState(IBlockState state, IBlockAccess worldIn, BlockPos pos)
		{
			boolean boolVar = false;
			if ((double) (pos.getX() + pos.getZ())/3 == (int) (pos.getX() + pos.getZ())/3) {
				boolVar = true;
			}
			return state.withProperty(VAR, boolVar);
		}

		@Override
		public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
			//right-click block:
			if ((!playerIn.capabilities.allowEdit) || (!playerIn.getHeldItemMainhand().isEmpty()) || !LepidodendronConfig.doPropagation)
			{
				return super.onBlockActivated(worldIn, pos, state, playerIn, hand, facing, hitX, hitY, hitZ);
			}
			else {
				if (!((hand != playerIn.getActiveHand()) && (hand == EnumHand.MAIN_HAND))) {
					ItemStack stackSeed = new ItemStack(ItemBuckthornBerries.block, (int) (1));
					stackSeed.setCount(1);
					ItemHandlerHelper.giveItemToPlayer(playerIn, stackSeed);
					worldIn.setBlockState(pos, BlockBuckthorn.block.getDefaultState());
					worldIn.setBlockState(pos.up(), BlockBuckthorn2.block.getDefaultState());
					return true;
				}
				return true;
			}
		}

		@Override
		public void harvestBlock(World worldIn, EntityPlayer player, BlockPos pos, IBlockState state, @Nullable TileEntity te, ItemStack stack) {
			if (stack.getItem() == Items.SHEARS && LepidodendronConfig.doPropagation
					&&
					(worldIn.getBlockState(pos.down()).getMaterial() == Material.GROUND
							|| worldIn.getBlockState(pos.down()).getMaterial() == Material.SAND
							|| worldIn.getBlockState(pos.down()).getMaterial() == Material.ROCK
							|| worldIn.getBlockState(pos.down()).getMaterial() == Material.CLAY
							|| worldIn.getBlockState(pos.down()).getMaterial() == Material.GRASS
					)
			) {
				EntityItem entityToSpawn = new EntityItem(worldIn, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(this, (int) (1)));
				entityToSpawn.setPickupDelay(10);
				worldIn.spawnEntity(entityToSpawn);
			}
			else {
				super.harvestBlock(worldIn, player, pos, state, te, stack);
			}
		}

		@Override
		@Nullable
		public AxisAlignedBB getCollisionBoundingBox(IBlockState blockState, IBlockAccess worldIn, BlockPos pos) {
			return NULL_AABB;
		}

		@Override
		public boolean isPassable(IBlockAccess worldIn, BlockPos pos) {
			return true;
		}

		@Override
		public BlockPlanks.EnumType getWoodType(int meta) {
			return null;
		}

		@Override
		public NonNullList<ItemStack> onSheared(ItemStack item, IBlockAccess world, BlockPos pos, int fortune) {
			return NonNullList.withSize(1, new ItemStack(BlockBuckthorn.block, (int) (1)));
		}

		@Override
		protected net.minecraft.block.state.BlockStateContainer createBlockState() {
			return new net.minecraft.block.state.BlockStateContainer(this, new IProperty[]{CHECK_DECAY, DECAYABLE, VAR});
		}

		public IBlockState getStateFromMeta(int meta) {
			return this.getDefaultState().withProperty(DECAYABLE, (meta & 1) != 0).withProperty(CHECK_DECAY, (meta & 2) != 0);
		}

		public int getMetaFromState(IBlockState state) {
			int i = 0;
			if (!(Boolean) state.getValue(DECAYABLE))
				i |= 1;
			if ((Boolean) state.getValue(CHECK_DECAY))
				i |= 2;
			return i;
		}

		@SideOnly(Side.CLIENT)
		@Override
		public BlockRenderLayer getRenderLayer()
		{
			return BlockRenderLayer.CUTOUT;
		}
		
		@Override
		public boolean canRenderInLayer(IBlockState state, BlockRenderLayer layer) {
			return layer == BlockRenderLayer.CUTOUT_MIPPED;
		}

		@Override
		public boolean isOpaqueCube(IBlockState state) {
			return false;
		}

		public boolean isFullCube(IBlockState state)
	    {
	        return false;
	    }

		@Override
		public int getFlammability(IBlockAccess world, BlockPos pos, EnumFacing face) {
			return 60;
		}

		@Override
		public int getFireSpreadSpeed(IBlockAccess world, BlockPos pos, EnumFacing face) {
			return 30;
		}

		@Override
		public MapColor getMapColor(IBlockState state, IBlockAccess blockAccess, BlockPos pos) {
			return MapColor.FOLIAGE;
		}

		@Override
		protected int getSaplingDropChance(IBlockState state) {
			return 1;
		}

		@Override
		public Item getItemDropped(IBlockState state, java.util.Random rand, int fortune) {
			if (LepidodendronConfig.doPropagation) {
				return new ItemStack(Items.AIR, (int) (1)).getItem();
			}
			else {
				return Item.getItemFromBlock(BlockBuckthorn.block);
			}
		}
		
		public boolean isLeaves(IBlockState state, IBlockAccess world, BlockPos pos) {
        	return false;
    	}

		@Override
		protected boolean canSilkHarvest()
	    {
	        return true;
	    }

		@Override
		public void neighborChanged(IBlockState state, World world, BlockPos pos, Block neighborBlock, BlockPos fromPos) {
			
			super.neighborChanged(state, world, pos, neighborBlock, fromPos);

			if (world.isAirBlock(pos.down())) {
				world.destroyBlock(pos, false);
				if (Math.random() > 0.66) {
					if (!LepidodendronConfig.doPropagation) {
						//Spawn another sapling:
						if (!world.isRemote) {
							EntityItem entityToSpawn = new EntityItem(world, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(BlockBuckthorn.block, (int) (1)));
							entityToSpawn.setPickupDelay(10);
							world.spawnEntity(entityToSpawn);
						}
					}
				}
			}
			else {
				Block block = world.getBlockState(pos.up()).getBlock();
				if (block != BlockBuckthorn2Berries.block) {
					world.setBlockToAir(pos);
					if (Math.random() > 0.66) {
						if (!LepidodendronConfig.doPropagation) {
							//Spawn another sapling:
							if (!world.isRemote) {
								EntityItem entityToSpawn = new EntityItem(world, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(BlockBuckthorn.block, (int) (1)));
								entityToSpawn.setPickupDelay(10);
								world.spawnEntity(entityToSpawn);
							}
						}
					}
				}

			}
			
		}
		
		@Override
		public boolean canPlaceBlockAt(World worldIn, BlockPos pos) {
	        return super.canPlaceBlockAt(worldIn, pos)
				&& worldIn.isAirBlock(pos.up());
	    }

	    public void onBlockAdded(World world, BlockPos pos, IBlockState state) {
			world.setBlockState(pos.up(), BlockBuckthorn2Berries.block.getDefaultState(), 3);
			super.onBlockAdded(world, pos, state);
		}

		@Override
	    public BlockFaceShape getBlockFaceShape(IBlockAccess worldIn, IBlockState state, BlockPos pos, EnumFacing face)
	    {
	        return BlockFaceShape.UNDEFINED;
	    }

		@Override
	    public boolean canBeReplacedByLeaves(IBlockState state, IBlockAccess world, BlockPos pos)
	    {
	        return true;
	    }
	    
	}
}