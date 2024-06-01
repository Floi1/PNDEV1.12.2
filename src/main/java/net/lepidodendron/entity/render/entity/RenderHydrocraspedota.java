package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraHydrocraspedota;
import net.lepidodendron.entity.model.entity.ModelHydrocraspedota;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderHydrocraspedota extends RenderLiving<EntityPrehistoricFloraHydrocraspedota> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/hydrocraspedota.png");

    public static float getScaler() {return 0.5F;}

    public RenderHydrocraspedota(RenderManager mgr) {
        super(mgr, new ModelHydrocraspedota(), 0.0f);
        this.addLayer(new LayerHydrocraspedotaCap(this));
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraHydrocraspedota entity) {
        return RenderHydrocraspedota.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraHydrocraspedota entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraHydrocraspedota entity, float f) {
        float scale = getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.50F;
    }

}