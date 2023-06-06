
package net.lepidodendron.entity;

import net.ilexiconn.llibrary.client.model.tools.ChainBuffer;
import net.ilexiconn.llibrary.server.animation.Animation;
import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.ai.EatFishFoodAIFish;
import net.lepidodendron.entity.ai.EntityMateAIFishBase;
import net.lepidodendron.entity.ai.FishWander;
import net.lepidodendron.entity.base.EntityPrehistoricFloraFishBase;
import net.lepidodendron.item.entities.spawneggs.*;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.IEntityLivingData;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.util.DamageSource;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.text.translation.I18n;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nullable;

public class EntityPrehistoricFloraConodont extends EntityPrehistoricFloraFishBase {

	public BlockPos currentTarget;
	@SideOnly(Side.CLIENT)
	public ChainBuffer chainBuffer;
	private int animationTick;
	private Animation animation = NO_ANIMATION;

	private static final float[] IOWAGNATHUS_SIZE = new float[]{0.8F, 0.2F};
	private static final float[] PROCONODONTUS_SIZE = new float[]{0.2F, 0.2F};
	private static final float[] CLARKINA_SIZE = new float[]{0.3F, 0.2F};
	private static final float[] OZARKODINIA_SIZE = new float[]{0.4F, 0.2F};
	private static final float[] MISIKELLA_SIZE = new float[]{0.4F, 0.2F};
	private static final float[] HINDEODUS_SIZE = new float[]{0.4F, 0.2F};
	private static final float[] PROMISSUM_SIZE = new float[]{0.4F, 0.2F};
	private static final float[] CLYDAGNATHUS_SIZE = new float[]{0.4F, 0.2F};


	private static final DataParameter<Integer> CONODONT_TYPE = EntityDataManager.<Integer>createKey(EntityPrehistoricFloraConodont.class, DataSerializers.VARINT);

	public EntityPrehistoricFloraConodont(World world) {
		super(world);
		setSize(getHitBoxSize()[0], getHitBoxSize()[1]);
	}

	@Override
	public boolean canMateWith(EntityAnimal otherAnimal)
	{
		if (otherAnimal == this)
		{
			return false;
		}
		else if (otherAnimal.getClass() != this.getClass())
		{
			return false;
		}
		else if (((EntityPrehistoricFloraConodont)otherAnimal).getPNType() != this.getPNType()) {
			return false;
		}
		return this.isInLove() && otherAnimal.isInLove();
	}

	public ResourceLocation getStandardLoot() {
		switch (this.getPNType()) {
			case IOWAGNATHUS: default:
				return LepidodendronMod.IOWAGNATHUS_LOOT;

			case PROCONODONTUS:
				return LepidodendronMod.PROCONODONTUS_LOOT;

			case CLARKINA:
				return LepidodendronMod.CLARKINA_LOOT;

			case OZARKODINA:
				return LepidodendronMod.OZARKODINA_LOOT;

			case MISIKELLA:
				return LepidodendronMod.MISIKELLA_LOOT;

			case HINDEODUS:
				return LepidodendronMod.HINDEODUS_LOOT;

			case PROMISSUM:
				return LepidodendronMod.PROMISSUM_LOOT;

			case CLYDAGNATHUS:
				return LepidodendronMod.CLYDAGNATHUS_LOOT;

		}
	}


	public boolean hasPNVariants() {
		return true;
	}

	public enum Type
	{
		IOWAGNATHUS(1, "iowagnathus"),
		PROCONODONTUS(2, "proconodontus"),
		CLARKINA(3, "clarkina"),
		OZARKODINA(4, "ozarkodina"),
		MISIKELLA(5, "misikella"),
		HINDEODUS(6, "hindeodus"),
		PROMISSUM(7, "promissum"),
		CLYDAGNATHUS(8, "clydagnathus"),
		;

		private final String name;
		private final int metadata;

		Type(int metadataIn, String nameIn)
		{
			this.name = nameIn;
			this.metadata = metadataIn;
		}

		public String getName()
		{
			return this.name;
		}

		public int getMetadata()
		{
			return this.metadata;
		}

		public String toString()
		{
			return this.name;
		}

		public static EntityPrehistoricFloraConodont.Type byId(int id)
		{
			if (id < 0 || id >= values().length)
			{
				id = 0;
			}

			return values()[id];
		}

		public static EntityPrehistoricFloraConodont.Type getTypeFromString(String nameIn)
		{
			for (int i = 0; i < values().length; ++i)
			{
				if (values()[i].getName().equals(nameIn))
				{
					return values()[i];
				}
			}

			return values()[0];
		}

	}

	public float[] getHitBoxSize() {
		switch (this.getPNType()) {
			case IOWAGNATHUS: default:
				return IOWAGNATHUS_SIZE;

			case PROCONODONTUS:
				return PROCONODONTUS_SIZE;

			case CLARKINA:
				return CLARKINA_SIZE;

			case OZARKODINA:
				return OZARKODINIA_SIZE;

			case MISIKELLA:
				return MISIKELLA_SIZE;

			case HINDEODUS:
				return HINDEODUS_SIZE;

			case PROMISSUM:
				return PROMISSUM_SIZE;

			case CLYDAGNATHUS:
				return CLYDAGNATHUS_SIZE;
		}
	}
	@Override
	public boolean isSmall() {
		return true;
	}

	public static String getPeriod() {return "Ordovician";}

	//public static String getHabitat() {return "Aquatic";}

	@Override
	public boolean dropsEggs() {
		return true;
	}

	@Override
	protected float getAISpeedFish() {
		switch (this.getPNType()) {
			case IOWAGNATHUS: default:
				return 0.2f;

			case PROCONODONTUS:
				return 0.2f;

			case CLARKINA:
				return 0.2f;

			case OZARKODINA:
				return 0.2f;

			case MISIKELLA:
				return 0.2f;

			case HINDEODUS:
				return 0.2f;

			case PROMISSUM:
				return 0.2f;

			case CLYDAGNATHUS:
				return 0.2f;
		}
	}

	@Override
	protected boolean isSlowAtBottom() {
		return false;
	}

	@Override
	public int getAnimationTick() {
		return getAnimationTick();
	}

	@Override
	public void setAnimationTick(int tick) {
		animationTick = tick;
	}

	@Override
	public Animation getAnimation() {
		return null;
	}

	@Override
	public void setAnimation(Animation animation) {
		this.animation = animation;
	}

	@Override
	public Animation[] getAnimations() {
		return null;
	}

	protected void initEntityAI() {
		tasks.addTask(0, new EntityMateAIFishBase(this, 1));
		tasks.addTask(1, new FishWander(this, NO_ANIMATION));
		this.targetTasks.addTask(0, new EatFishFoodAIFish(this));
	}

	@Override
	public boolean isAIDisabled() {
		return false;
	}

	@Override
	public String getTexture() {
		return this.getTexture();
	}

	@Override
	public EnumCreatureAttribute getCreatureAttribute() {
		return EnumCreatureAttribute.UNDEFINED;
	}

	@Override
	protected boolean canDespawn() {
		return false;
	}

	@Override
	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(4.0D);
		this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.25D);
	}

	@Override
	public net.minecraft.util.SoundEvent getAmbientSound() {
		return (net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation(""));
	}

	@Override
	public net.minecraft.util.SoundEvent getHurtSound(DamageSource ds) {
		return (net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("entity.generic.hurt"));
	}

	@Override
	public net.minecraft.util.SoundEvent getDeathSound() {
		return (net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("entity.generic.death"));
	}

	@Override
	protected float getSoundVolume() {
		return 1.0F;
	}

	@Override
	public void onLivingUpdate() {
		super.onLivingUpdate();
		this.renderYawOffset = this.rotationYaw;
	}

	@Override
	protected void entityInit() {
		super.entityInit();
		this.dataManager.register(CONODONT_TYPE, 0);
	}

	@Override
	public IEntityLivingData onInitialSpawn(DifficultyInstance difficulty, @Nullable IEntityLivingData livingdata) {
		livingdata = super.onInitialSpawn(difficulty, livingdata);
		this.setPNType(EntityPrehistoricFloraConodont.Type.byId(rand.nextInt(EntityPrehistoricFloraConodont.Type.values().length) + 1));
		return livingdata;
	}
	public void setPNType(Type type)
	{
		this.dataManager.set(CONODONT_TYPE, Integer.valueOf(type.ordinal()));
	}

	public Type getPNType()
	{
		return Type.byId(((Integer)this.dataManager.get(CONODONT_TYPE)).intValue());
	}
	public void onEntityUpdate() {
		super.onEntityUpdate();
	}

	@Nullable
	protected ResourceLocation getLootTable() {
		return getStandardLoot();
	}

	@Override
	public ItemStack getPickedResult(RayTraceResult target)
	{
		if (target.entityHit instanceof EntityPrehistoricFloraConodont) {
			EntityPrehistoricFloraConodont cono = (EntityPrehistoricFloraConodont) target.entityHit;
			switch (cono.getPNType()) {
				case IOWAGNATHUS: default:
					return new ItemStack(ItemSpawnEggConodontIowagnathus.block, 1);

				case PROCONODONTUS:
					return new ItemStack(ItemSpawnEggConodontProconodontus.block, 1);

				case CLARKINA:
					return new ItemStack(ItemSpawnEggConodontClarkina.block, 1);

				case OZARKODINA:
					return new ItemStack(ItemSpawnEggConodontOzarkodina.block, 1);

				case MISIKELLA:
					return new ItemStack(ItemSpawnEggConodontMisikella.block, 1);

				case HINDEODUS:
					return new ItemStack(ItemSpawnEggConodontHindeodus.block, 1);

				case PROMISSUM:
					return new ItemStack(ItemSpawnEggConodontPromissum.block, 1);

				case CLYDAGNATHUS:
					return new ItemStack(ItemSpawnEggConodontClydagnathus.block, 1);
			}
		}
		return ItemStack.EMPTY;
	}

	@Override
	public String getName() {
		if (this.hasCustomName())
		{
			return this.getCustomNameTag();
		}
		else
		{
			return I18n.translateToLocal("entity.prehistoric_flora_" + this.getPNType().getName() + ".name");
		}
	}

	public void writeEntityToNBT(NBTTagCompound compound) {
		super.writeEntityToNBT(compound);
		compound.setString("PNType", this.getPNType().getName());
	}

	public void readEntityFromNBT(NBTTagCompound compound) {
		super.readEntityFromNBT(compound);
		if (compound.hasKey("PNType", 8))
		{
			this.setPNType(EntityPrehistoricFloraConodont.Type.getTypeFromString(compound.getString("PNType")));
		}
	}

}