
package net.lepidodendron.entity;

import net.ilexiconn.llibrary.client.model.tools.ChainBuffer;
import net.lepidodendron.LepidodendronConfig;
import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.ai.EatFishFoodAIAgeable;
import net.lepidodendron.entity.ai.EntityMateAIAgeableBase;
import net.lepidodendron.entity.ai.NautiloidWander;
import net.lepidodendron.entity.base.EntityPrehistoricFloraNautiloidBase;
import net.lepidodendron.item.ItemFishFood;
import net.lepidodendron.item.entities.ItemNautiloidEggsCenoceras;
import net.lepidodendron.item.entities.ItemNautiloidEggsKosmoceras;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nullable;

public class EntityPrehistoricFloraCenoceras extends EntityPrehistoricFloraNautiloidBase {

	public BlockPos currentTarget;
	@SideOnly(Side.CLIENT)
	public ChainBuffer chainBuffer;

	public EntityPrehistoricFloraCenoceras(World world) {
		super(world);
		setSize(0.3F, 0.25F);
		minWidth = 0.07F;
		maxWidth = 0.3F;
		maxHeight = 0.25F;
		maxHealthAgeable = 3.0D;
	}

	@Override
	public boolean isSmall() {
		return true;
	}

	public static String getPeriod() {return "Triassic - Jurassic";}

	//public static String getHabitat() {return "Aquatic";}

	@Override
	public boolean dropsEggs() {
		return false;
	}
	
	@Override
	public boolean laysEggs() {
		return false;
	}

	@Override
	public int getAdultAge() {
		return 64000;
	}

	@Override
	protected float getAISpeedNautiloid() {
		//return 0;
		return 0.0698f;
	}

	protected void initEntityAI() {
		tasks.addTask(0, new EntityMateAIAgeableBase(this, 1));
		tasks.addTask(1, new NautiloidWander(this, NO_ANIMATION));
		tasks.addTask(2, new EntityAILookIdle(this));
		this.targetTasks.addTask(0, new EatFishFoodAIAgeable(this));
	}

	@Override
	public boolean isBreedingItem(ItemStack stack)
	{
		return (stack.getItem() == new ItemStack(ItemFishFood.block, (int) (1)).getItem());
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
	public SoundEvent getAmbientSound() {
		return (SoundEvent) SoundEvent.REGISTRY.getObject(new ResourceLocation(""));
	}

	@Override
	public SoundEvent getHurtSound(DamageSource ds) {
		return (SoundEvent) SoundEvent.REGISTRY.getObject(new ResourceLocation("entity.generic.hurt"));
	}

	public void onEntityUpdate() {
		super.onEntityUpdate();
		//Drop an egg perhaps:
		if (!world.isRemote && this.isPFAdult() && this.getCanBreed() && (LepidodendronConfig.doMultiplyMobs || this.getLaying())) {
			if (Math.random() > 0.5) {
				ItemStack itemstack = new ItemStack(ItemNautiloidEggsCenoceras.block, (int) (1));
				EntityItem entityToSpawn = new EntityItem(world, this.getPosition().getX(), this.getPosition().getY(), this.getPosition().getZ(), itemstack);
				entityToSpawn.setPickupDelay(10);
				world.spawnEntity(entityToSpawn);
			}
			this.setTicks(0);
		}

	}

	@Override
	public SoundEvent getDeathSound() {
		return (SoundEvent) SoundEvent.REGISTRY.getObject(new ResourceLocation("entity.generic.death"));
	}

	@Nullable
	protected ResourceLocation getLootTable() {
		if (!this.isPFAdult()) {
			return LepidodendronMod.CENOCERAS_LOOT_YOUNG;
		}
		return LepidodendronMod.CENOCERAS_LOOT;
	}

	//Rendering taxidermy:
	//--------------------

}