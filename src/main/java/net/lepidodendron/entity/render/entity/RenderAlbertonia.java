package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraAlbertonia;
import net.lepidodendron.entity.model.entity.ModelAlbertonia;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderAlbertonia extends RenderLiving<EntityPrehistoricFloraAlbertonia> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/albertonia.png");

    public RenderAlbertonia(RenderManager mgr) {
        super(mgr, new ModelAlbertonia(), 0.0f);
    }

    public static float getScaler() {return 0.15F; }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraAlbertonia entity) {
        return RenderAlbertonia.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraAlbertonia entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraAlbertonia entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {scale = 0.1f;}
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.0F;
    }

}