package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraLimusaurus;
import net.lepidodendron.entity.model.entity.ModelLimusaurus;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderLimusaurus extends RenderLiving<EntityPrehistoricFloraLimusaurus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/limusaurus.png");

    public RenderLimusaurus(RenderManager mgr) {
        super(mgr, new ModelLimusaurus(), 0.3f);
    }

    public static float getScaler() {
        return 0.9F;
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraLimusaurus entity) {
        return RenderLimusaurus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraLimusaurus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraLimusaurus entity, float f) {
        float scale = entity.getAgeScale() * this.getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.35F;
    }

}