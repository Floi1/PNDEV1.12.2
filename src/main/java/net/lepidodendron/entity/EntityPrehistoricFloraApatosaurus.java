
package net.lepidodendron.entity;

import net.ilexiconn.llibrary.client.model.tools.ChainBuffer;
import net.ilexiconn.llibrary.server.animation.Animation;
import net.ilexiconn.llibrary.server.animation.AnimationHandler;
import net.lepidodendron.LepidodendronConfig;
import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.block.base.IAdvancementGranter;
import net.lepidodendron.entity.ai.*;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.base.EntityPrehistoricFloraLandWadingBase;
import net.lepidodendron.util.CustomTrigger;
import net.lepidodendron.util.Functions;
import net.lepidodendron.util.ModTriggers;
import net.minecraft.block.BlockDirectional;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.attributes.IAttributeInstance;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.apache.commons.lang3.ArrayUtils;

import javax.annotation.Nullable;

public class EntityPrehistoricFloraApatosaurus extends EntityPrehistoricFloraLandWadingBase implements IAdvancementGranter {
	private static final DataParameter<Boolean> JUVENILE = EntityDataManager.createKey(EntityPrehistoricFloraApatosaurus.class, DataSerializers.BOOLEAN);

	public BlockPos currentTarget;

	@SideOnly(Side.CLIENT)
	public ChainBuffer tailBuffer;
	public Animation TAIL_ANIMATION;
	private int standCooldown;
	public int ambientSoundTime;
	public Animation NOISE_ANIMATION;

	public EntityPrehistoricFloraApatosaurus(World world) {
		super(world);
		setSize(3.0F, 6F);
		minWidth = 0.8F;
		maxWidth = 3.0F;
		maxHeight = 6F;
		maxHealthAgeable = 200.0D;
		TAIL_ANIMATION = Animation.create(80);
		if (FMLCommonHandler.instance().getSide().isClient()) {
			tailBuffer = new ChainBuffer();
		}
		NOISE_ANIMATION = Animation.create(40);
	}

	@Override
	public int wadeDepth() {
		return 5;
	}

	@Override
	protected float getJumpUpwardsMotion() {
		if (this.isInWater()) {
			return super.getJumpUpwardsMotion() * 1.5F;
		}
		if (this.isReallyInWater()) {
			return super.getJumpUpwardsMotion() * 1.25F;
		}
		return super.getJumpUpwardsMotion();
	}

	@Override
	public int getWalkCycleLength() {
		return 40;
	}

	@Override
	public int getFootstepOffset() {
		return 6;
	}

	@Override
	public int tetrapodWalkFootstepOffset() {
		return 15;
	}

	@Override
	public int getRunCycleLength() {
		return 35;
	}

	@Override
	public int getRunFootstepOffset() {
		return 0;
	}

	@Override
	public int tetrapodRunFootstepOffset() {
		return 5;
	}

	@Override
	public int getGrazeLength() {
		return 80;
	}

	@Override
	protected void entityInit() {
		super.entityInit();
		this.dataManager.register(JUVENILE, false);
		this.setScaleForAge(false);
	}

	public void writeEntityToNBT(NBTTagCompound compound)
	{
		super.writeEntityToNBT(compound);
		compound.setBoolean("juvenile", this.getJuvenile());
	}

	public void readEntityFromNBT(NBTTagCompound compound) {
		super.readEntityFromNBT(compound);
		this.setJuvenile(compound.getBoolean("juvenile"));
	}

	public void setJuvenile(boolean val)
	{
		this.dataManager.set(JUVENILE, val);
	}

	public boolean getJuvenile() {
		return this.dataManager.get(JUVENILE);
	}

	@Override
	public Animation[] getAnimations() {
		return new Animation[]{GRAZE_ANIMATION, ATTACK_ANIMATION, NOISE_ANIMATION, DRINK_ANIMATION, ROAR_ANIMATION, MAKE_NEST_ANIMATION, LAY_ANIMATION, EAT_ANIMATION, TAIL_ANIMATION};
	}

	@Override
	public void onUpdate() {
		super.onUpdate();
		if (world.isRemote && !this.isAIDisabled()) {
			tailBuffer.calculateChainSwingBuffer(120, 10, 5F, this);
		}
	}

	@Override
	public int getEggType(@Nullable String PNType) {
		return 2; //large
	}

	public static String getPeriod() {return "Jurassic";}


	@Override
	public boolean hasNest() {
		return true;
	}

	@Override
	public int getAttackLength() {
		return 30;
	}

	@Override
	public int getRoarLength() {
		return 60;
	}

	@Override
	public int getEatLength() {
		return 140;
	}

	@Override
	public String getTexture() {
		return this.getTexture();
	}

	@Override
	public boolean dropsEggs() {
		return false;
	}

	@Override
	public boolean laysEggs() {
		return true;
	}

	public float getAISpeedLand() {
		float speedBase = 0.4F;
		if (this.getTicks() < 0) {
			return 0.0F; //Is laying eggs
		}
		if (this.getAnimation() == DRINK_ANIMATION || this.getAnimation() == MAKE_NEST_ANIMATION
			|| this.getAnimation() == ATTACK_ANIMATION || this.getAnimation() == EAT_ANIMATION
			|| this.getAnimation() == GRAZE_ANIMATION || this.getAnimation() == TAIL_ANIMATION) {
			return 0.0F;
		}
		if (this.getIsFast()) {
			speedBase = speedBase * 1.4F;
		}
		return speedBase;
	}

	@Override
	public int getAdultAge() {
		return 128000;
	}

	public AxisAlignedBB getAttackBoundingBox() {
		float size = this.getRenderSizeModifier() * getAgeScale() * 1F;
		return this.getEntityBoundingBox().grow(1.0F + size, 1.0F + size, 1.0F + size);
	}

	public AxisAlignedBB getAttackBoundingBoxForDamage() {
		float size = this.getRenderSizeModifier() * getAgeScale() * 2F;
		return this.getEntityBoundingBox().grow(1.0F + size, 1.0F + size, 1.0F + size);
	}

	@Override
	public float getEyeHeight()
	{
		return Math.max(super.getEyeHeight(), this.height * 0.975F);
	}

	protected void initEntityAI() {
		tasks.addTask(0, new EntityMateAIAgeableBase(this, 1.0D));
		tasks.addTask(1, new EntityTemptAI(this, 1, false, true, 0));
		//tasks.addTask(2, new LandEntitySwimmingAI(this, 0.75, false));
		tasks.addTask(3, new AttackAI(this, 1.0D, false, this.getAttackLength()));
		tasks.addTask(4, new LandWanderNestAI(this));
		tasks.addTask(5, new LandWanderFollowParent(this, 1.05D));
		tasks.addTask(6, new LandWanderHerd(this, 1.00D, this.getNavigator().getPathSearchRange()*0.75F));
		tasks.addTask(7, new LandWanderWader(this, NO_ANIMATION, 0.5D, 0, this.wadeDepth()));
		tasks.addTask(8, new EntityWatchClosestAI(this, EntityPlayer.class, 6.0F));
		tasks.addTask(9, new EntityWatchClosestAI(this, EntityPrehistoricFloraAgeableBase.class, 8.0F));
		tasks.addTask(10, new EntityLookIdleAI(this));
		this.targetTasks.addTask(0, new EatItemsEntityPrehistoricFloraAgeableBaseAI(this, 1));
		this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, false));
		//this.targetTasks.addTask(1, new HuntAI(this, EntityPrehistoricFloraLandClimbingBase.class, true, (Predicate<Entity>) entity -> entity instanceof EntityLivingBase));
		//this.targetTasks.addTask(2, new HuntAI(this, EntityPrehistoricInsectFlyingBase.class, true, (Predicate<Entity>) entity -> entity instanceof EntityLivingBase));
	}

	@Override
	public String[] getFoodOreDicts() {
		return ArrayUtils.addAll(DietString.PLANTS);
	}
	
	@Override
	public EnumCreatureAttribute getCreatureAttribute() {
		return EnumCreatureAttribute.UNDEFINED;
	}

	//TODO override to allow targeting water for drinking, currently targets grass
	@Override
	public boolean drinksWater() {
		return true;
	}

	@Override
	public int getDrinkLength() {
		return 160;
	}

	@Override
	public int getDrinkCooldown() {
		return 400;
	}

	private boolean isDrinkable(World world, BlockPos pos, EnumFacing facing) {
		if (world.getBlockState(pos.offset(facing)).getBlock().causesSuffocation(world.getBlockState(pos.offset(facing)))) {
			return false;
		}
		if (world.getBlockState(pos.offset(facing).up()).getBlock().causesSuffocation(world.getBlockState(pos.offset(facing).up()))) {
			return false;
		}
		if (world.getBlockState(pos.offset(facing).up(2)).getBlock().causesSuffocation(world.getBlockState(pos.offset(facing).up(2)))) {
			return false;
		}

		if (world.getBlockState(pos.offset(facing).offset(facing)).getBlock().causesSuffocation(world.getBlockState(pos.offset(facing).offset(facing)))) {
			return false;
		}
		if (world.getBlockState(pos.offset(facing).offset(facing).up()).getBlock().causesSuffocation(world.getBlockState(pos.offset(facing).offset(facing).up()))) {
			return false;
		}
		if (world.getBlockState(pos.offset(facing).offset(facing).up(2)).getBlock().causesSuffocation(world.getBlockState(pos.offset(facing).offset(facing).up(2)))) {
			return false;
		}

		if (world.getBlockState(pos.offset(facing).offset(facing).offset(facing)).getBlock().causesSuffocation(world.getBlockState(pos.offset(facing).offset(facing).offset(facing)))) {
			return false;
		}
		if (world.getBlockState(pos.offset(facing).offset(facing).offset(facing).up()).getBlock().causesSuffocation(world.getBlockState(pos.offset(facing).offset(facing).offset(facing).up()))) {
			return false;
		}
		if (world.getBlockState(pos.offset(facing).offset(facing).offset(facing).up(2)).getBlock().causesSuffocation(world.getBlockState(pos.offset(facing).offset(facing).offset(facing).up(2)))) {
			return false;
		}
		return true;
	}

	@Override
	public boolean isDrinking()
	{
		if (getJuvenile()) {
			return false;
		}
		
		BlockPos entityPos = Functions.getEntityBlockPos(this);

		boolean test = (this.getPFDrinking() <= 0
			&& !world.isRemote
			&& !this.getIsFast()
			//&& !this.getIsMoving()
			&& this.DRINK_ANIMATION.getDuration() > 0
			&& this.getAnimation() == NO_ANIMATION
			&& this.onGround
			&& !this.isReallyInWater()
			&&
			(
				(this.world.getBlockState(entityPos.north(6).down()).getMaterial() == Material.WATER
				&& isDrinkable(this.world, entityPos, EnumFacing.NORTH))

				|| (this.world.getBlockState(entityPos.south(6).down()).getMaterial() == Material.WATER
				&& isDrinkable(this.world, entityPos, EnumFacing.SOUTH))

				|| (this.world.getBlockState(entityPos.east(6).down()).getMaterial() == Material.WATER
				&& isDrinkable(this.world, entityPos, EnumFacing.EAST))

				|| (this.world.getBlockState(entityPos.west(6).down()).getMaterial() == Material.WATER
				&& isDrinkable(this.world, entityPos, EnumFacing.WEST))
			)
		);
		if (test) {
			//Which one is water?
			EnumFacing facing = null;
			if (this.world.getBlockState(entityPos.north(6).down()).getMaterial() == Material.WATER) {
				facing = EnumFacing.NORTH;
			}
			else if (this.world.getBlockState(entityPos.south(6).down()).getMaterial() == Material.WATER) {
				facing = EnumFacing.SOUTH;
			}
			else if (this.world.getBlockState(entityPos.east(6).down()).getMaterial() == Material.WATER) {
				facing = EnumFacing.EAST;
			}
			else if (this.world.getBlockState(entityPos.west(6).down()).getMaterial() == Material.WATER) {
				facing = EnumFacing.WEST;
			}
			if (facing != null) {
				this.setDrinkingFrom(entityPos.offset(facing).offset(facing).offset(facing).offset(facing).offset(facing).offset(facing));
				this.faceBlock(this.getDrinkingFrom(), 10F, 10F);
			}
		}
		return test;
	}

	private boolean isBlockGrazable(IBlockState state) {
		return (state.getMaterial() == Material.LEAVES || state.getMaterial() == Material.PLANTS);
	}

	private boolean isGrazable(World world, BlockPos pos, EnumFacing facing) {
		if (world.getBlockState(pos.offset(facing).up(2)).getBlock().causesSuffocation(world.getBlockState(pos.offset(facing).up(2)))) {
			return false;
		}
		if (world.getBlockState(pos.offset(facing).up(3)).getBlock().causesSuffocation(world.getBlockState(pos.offset(facing).up(3)))) {
			return false;
		}
		if (world.getBlockState(pos.offset(facing).up(3)).getBlock().causesSuffocation(world.getBlockState(pos.offset(facing).up(4)))) {
			return false;
		}
		if (world.getBlockState(pos.offset(facing).up(2)).getBlock().causesSuffocation(world.getBlockState(pos.offset(facing).offset(facing).up(2)))) {
			return false;
		}
		if (world.getBlockState(pos.offset(facing).up(3)).getBlock().causesSuffocation(world.getBlockState(pos.offset(facing).offset(facing).up(3)))) {
			return false;
		}
		if (world.getBlockState(pos.offset(facing).up(3)).getBlock().causesSuffocation(world.getBlockState(pos.offset(facing).offset(facing).up(4)))) {
			return false;
		}
		if (world.getBlockState(pos.offset(facing).up(2)).getBlock().causesSuffocation(world.getBlockState(pos.offset(facing).offset(facing).offset(facing).up(2)))) {
			return false;
		}
		if (world.getBlockState(pos.offset(facing).up(3)).getBlock().causesSuffocation(world.getBlockState(pos.offset(facing).offset(facing).offset(facing).up(3)))) {
			return false;
		}
		if (world.getBlockState(pos.offset(facing).up(3)).getBlock().causesSuffocation(world.getBlockState(pos.offset(facing).offset(facing).offset(facing).up(4)))) {
			return false;
		}
		if (world.getBlockState(pos.offset(facing).up(2)).getBlock().causesSuffocation(world.getBlockState(pos.offset(facing).offset(facing).offset(facing).offset(facing).up(2)))) {
			return false;
		}
		if (world.getBlockState(pos.offset(facing).up(3)).getBlock().causesSuffocation(world.getBlockState(pos.offset(facing).offset(facing).offset(facing).offset(facing).up(3)))) {
			return false;
		}
		if (world.getBlockState(pos.offset(facing).up(3)).getBlock().causesSuffocation(world.getBlockState(pos.offset(facing).offset(facing).offset(facing).offset(facing).up(4)))) {
			return false;
		}
		if (world.getBlockState(pos.offset(facing).up(2)).getBlock().causesSuffocation(world.getBlockState(pos.offset(facing).offset(facing).offset(facing).offset(facing).offset(facing).up(2)))) {
			return false;
		}
		if (world.getBlockState(pos.offset(facing).up(3)).getBlock().causesSuffocation(world.getBlockState(pos.offset(facing).offset(facing).offset(facing).offset(facing).offset(facing).up(3)))) {
			return false;
		}
		if (world.getBlockState(pos.offset(facing).up(3)).getBlock().causesSuffocation(world.getBlockState(pos.offset(facing).offset(facing).offset(facing).offset(facing).offset(facing).up(4)))) {
			return false;
		}
		if (world.getBlockState(pos.offset(facing).up(2)).getBlock().causesSuffocation(world.getBlockState(pos.offset(facing).offset(facing).offset(facing).offset(facing).offset(facing).offset(facing).up(2)))) {
			return false;
		}
		if (world.getBlockState(pos.offset(facing).up(3)).getBlock().causesSuffocation(world.getBlockState(pos.offset(facing).offset(facing).offset(facing).offset(facing).offset(facing).offset(facing).up(3)))) {
			return false;
		}
		if (world.getBlockState(pos.offset(facing).up(3)).getBlock().causesSuffocation(world.getBlockState(pos.offset(facing).offset(facing).offset(facing).offset(facing).offset(facing).offset(facing).up(4)))) {
			return false;
		}
		return true;
	}

	@Override
	public boolean isGrazing()
	{
		if (getJuvenile() || !this.isPFAdult()) {
			return false;
		}
		
		BlockPos entityPos = Functions.getEntityBlockPos(this);

		boolean test2 = false;
		boolean test = (this.getPFGrazing() <= 0
				&& !world.isRemote
				&& !this.getIsFast()
				//&& !this.getIsMoving()
				&& this.GRAZE_ANIMATION.getDuration() > 0
				&& this.getAnimation() == NO_ANIMATION
				&& !this.isReallyInWater()
				&&
				(
					(isBlockGrazable(this.world.getBlockState(entityPos.north(6).up(6)))
						&& isGrazable(this.world, entityPos, EnumFacing.NORTH))

						|| (isBlockGrazable(this.world.getBlockState(entityPos.south(6).up(6)))
						&& isGrazable(this.world, entityPos, EnumFacing.SOUTH))

						|| (isBlockGrazable(this.world.getBlockState(entityPos.east(6).up(6)))
						&& isGrazable(this.world, entityPos, EnumFacing.EAST))

						|| (isBlockGrazable(this.world.getBlockState(entityPos.west(6).up(6)))
						&& isGrazable(this.world, entityPos, EnumFacing.WEST))
				)
		);
		if (test) {
			//Which one is grazable?
			EnumFacing facing = null;
			if (!test2 && isBlockGrazable(this.world.getBlockState(entityPos.north(6).up(6)))) {
				facing = EnumFacing.NORTH;
				if (Functions.getEntityCentre(this).z - Functions.getEntityBlockPos(this).getZ() <= 0.5D) {
					test2 = true;
				}
			}
			else if (!test2 && isBlockGrazable(this.world.getBlockState(entityPos.south(6).up(6)))) {
				facing = EnumFacing.SOUTH;
				if (Functions.getEntityCentre(this).z - Functions.getEntityBlockPos(this).getZ() >= 0.5D) {
					test2 = true;
				}
			}
			else if (!test2 && isBlockGrazable(this.world.getBlockState(entityPos.east(6).up(6)))) {
				facing = EnumFacing.EAST;
				if (Functions.getEntityCentre(this).z - Functions.getEntityBlockPos(this).getX() >= 0.5D) {
					test2 = true;
				}
			}
			else if (!test2 && isBlockGrazable(this.world.getBlockState(entityPos.west(6).up(6)))) {
				facing = EnumFacing.WEST;
				if (Functions.getEntityCentre(this).z - Functions.getEntityBlockPos(this).getX() <= 0.5D) {
					test2 = true;
				}
			}
			if (facing != null && test && test2) {
				this.setGrazingFrom(entityPos.up(6).offset(facing).offset(facing).offset(facing).offset(facing).offset(facing).offset(facing));
				this.faceBlock(this.getGrazingFrom(), 10F, 10F);
			}
		}
		return test && test2;
	}

	@Override
	protected boolean canDespawn() {
		return false;
	}

	@Override
	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		this.getAttributeMap().registerAttribute(SharedMonsterAttributes.ATTACK_DAMAGE);
		this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(30.0D);
		this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.25D);
		this.getEntityAttribute(SharedMonsterAttributes.KNOCKBACK_RESISTANCE).setBaseValue(0.8D);
	}

	@Override
	public int getTalkInterval() {
		return 1000;
	}

	public int getAmbientTalkInterval() {
		return 300;
	}

	@Override
	public SoundEvent getAmbientSound() {
	    return (SoundEvent) SoundEvent.REGISTRY
	            .getObject(new ResourceLocation("lepidodendron:apatosaurus_roar"));
	}

	public SoundEvent getAmbientAmbientSound() {
		return (SoundEvent) SoundEvent.REGISTRY
				.getObject(new ResourceLocation("lepidodendron:apatosaurus_idle"));
	}

	@Override
	public SoundEvent getHurtSound(DamageSource ds) {
	    return (SoundEvent) SoundEvent.REGISTRY
	            .getObject(new ResourceLocation("lepidodendron:apatosaurus_hurt"));
	}

	@Override
	public SoundEvent getDeathSound() {
	    return (SoundEvent) SoundEvent.REGISTRY
	            .getObject(new ResourceLocation("lepidodendron:apatosaurus_death"));
	}

	@Override
	protected float getSoundVolume() {
		return 1.0F;
	}

	@Override
	public boolean getCanSpawnHere() {
		return this.posY < (double) this.world.getSeaLevel() && this.isInWater();
	}

	@Override
	public void onLivingUpdate() {
		super.onLivingUpdate();

		if (!world.isRemote) {
			double width = this.getEntityBoundingBox().maxX - this.getEntityBoundingBox().minX;
			double depth = this.getEntityBoundingBox().maxZ - this.getEntityBoundingBox().minZ;
			double height = this.getEntityBoundingBox().maxY - this.getEntityBoundingBox().minY;
			if (height <= 0.9375 && width <= 1.0 && depth <= 1.0) {
				if (!this.getJuvenile()) {
					this.setJuvenile(true);
				}
			}
			else if (this.getJuvenile()) {
				this.setJuvenile(false);
			}
		}

		if (this.getAnimation() == GRAZE_ANIMATION) {
			if (LepidodendronConfig.doGrazeGrief && world.getGameRules().getBoolean("mobGriefing") && this.getWillHunt() && (!world.isRemote) && this.getAnimationTick() >= this.getAnimation().getDuration() * 0.75F) {
				ItemStack item = world.getBlockState(this.getGrazingFrom()).getBlock().getPickBlock(world.getBlockState(this.getGrazingFrom()), null, world, this.getGrazingFrom(), null);
				world.destroyBlock(this.getGrazingFrom(), true);
				float itemHealth = 0.5F; //Default minimal nutrition
				if (item.getItem() instanceof ItemFood) {
					itemHealth = ((ItemFood) item.getItem()).getHealAmount(item);
				}
				this.setHealth(Math.min(this.getHealth() + itemHealth, (float) this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).getBaseValue()));
			}
		}

		if (this.getAnimation() == ATTACK_ANIMATION && this.getAnimationTick() == 16 && this.getAttackTarget() != null) {
			launchAttack();
		}

		AnimationHandler.INSTANCE.updateAnimations(this);
	}

	@Override
	public void launchAttack() {
		if (this.getAttackTarget() != null) {
			if (this.getAttackBoundingBoxForDamage().intersects(this.getAttackTarget().getEntityBoundingBox())) {
				IAttributeInstance iattributeinstance = this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE);
				EnumFacing facing = this.getAdjustedHorizontalFacing();
				if (facing == EnumFacing.NORTH) {
					this.getAttackTarget().addVelocity(0.25, 0.15, 0);
				}
				else if (facing == EnumFacing.SOUTH) {
					this.getAttackTarget().addVelocity(-0.25, 0.15, 0);
				}
				else if (facing == EnumFacing.EAST) {
					this.getAttackTarget().addVelocity(0, 0.15, 0.25);
				}
				else if (facing == EnumFacing.WEST) {
					this.getAttackTarget().addVelocity(0, 0.15, -0.25);
				}
				boolean b = this.getAttackTarget().attackEntityFrom(DamageSource.causeMobDamage(this), (float) iattributeinstance.getAttributeValue());
				if (this.getOneHit()) {
					this.setAttackTarget(null);
					this.setRevengeTarget(null);
					this.setWarnTarget(null);
				}
				this.setOneHit(false);
			}
		}
	}

	@Override
	@SideOnly(Side.CLIENT)
	public AxisAlignedBB getRenderBoundingBox() {
		if (LepidodendronConfig.renderBigMobsProperly && (this.maxWidth * this.getAgeScale()) > 1F) {
			return this.getEntityBoundingBox().grow(15.0, 15.00, 15.0);
		}
		return this.getEntityBoundingBox();
	}


	public static final PropertyDirection FACING = BlockDirectional.FACING;

	public boolean testLay(World world, BlockPos pos) {
		//System.err.println("Testing laying conditions");
		BlockPos posNest = pos;
		if (isLayableNest(world, posNest)) {
			String eggRenderType = new Object() {
				public String getValue(BlockPos posNest, String tag) {
					TileEntity tileEntity = world.getTileEntity(posNest);
					if (tileEntity != null)
						return tileEntity.getTileData().getString(tag);
					return "";
				}
			}.getValue(new BlockPos(posNest), "egg");

			//System.err.println("eggRenderType " + eggRenderType);

			if (eggRenderType.equals("")) {
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean attackEntityAsMob(Entity entity) {
		if (this.getAnimation() == NO_ANIMATION) {
			this.setAnimation(ATTACK_ANIMATION);
			//System.err.println("set attack");
		}
		return false;
	}

	@Override
	public void onEntityUpdate() {
		super.onEntityUpdate();
		//Sometimes stand up and look around:
		if (this.getEatTarget() == null && this.getAttackTarget() == null && this.getRevengeTarget() == null
				&& !this.getIsMoving() && this.getAnimation() == NO_ANIMATION && standCooldown == 0) {

			this.setAnimation(TAIL_ANIMATION);


			this.standCooldown = 3000;
		}
		//forces animation to return to base pose by grabbing the last tick and setting it to that.
		if (this.getAnimation() == TAIL_ANIMATION && this.getAnimationTick() == TAIL_ANIMATION.getDuration() - 1) {
			this.standCooldown = 3000;
			this.setAnimation(NO_ANIMATION);
		}

		if (this.isEntityAlive() && this.rand.nextInt(1000) < this.ambientSoundTime++ && !this.world.isRemote)
		{
			this.ambientSoundTime = -this.getAmbientTalkInterval();
			SoundEvent soundevent = this.getAmbientAmbientSound();
			if (soundevent != null)
			{
				if (this.getAnimation() == NO_ANIMATION) {
					this.setAnimation(NOISE_ANIMATION);
					//System.err.println("Playing noise sound on remote: " + (world.isRemote));
					this.playSound(soundevent, this.getSoundVolume(), this.getSoundPitch());
				}
			}
		}

	}

	public boolean isDirectPathBetweenPoints(Vec3d vec1, Vec3d vec2) {
		RayTraceResult movingobjectposition = this.world.rayTraceBlocks(vec1, new Vec3d(vec2.x, vec2.y, vec2.z), false, true, false);
		return movingobjectposition == null || movingobjectposition.typeOfHit != RayTraceResult.Type.BLOCK;
	}

	@Nullable
	@Override
	public CustomTrigger getModTrigger() {
		return ModTriggers.CLICK_APATOSAURUS;
	}

	@Nullable
	protected ResourceLocation getLootTable() {
		if (!this.isPFAdult()) {
			return LepidodendronMod.APATOSAURUS_LOOT_YOUNG;
		}
		return LepidodendronMod.APATOSAURUS_LOOT;
	}

	//Rendering taxidermy:
	//--------------------


}