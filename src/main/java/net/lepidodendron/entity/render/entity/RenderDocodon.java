package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraDocodon;
import net.lepidodendron.entity.model.entity.ModelDocodon;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderDocodon extends RenderLivingBaseWithBook<EntityPrehistoricFloraDocodon> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/docodon.png");

    public static float getScaler() {return 0.2f;}
    public RenderDocodon(RenderManager mgr) {
        super(mgr, new ModelDocodon(), 0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraDocodon entity) {
        return RenderDocodon.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraDocodon entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraDocodon entity, float f) {
        float scale = entity.getAgeScale() * getScaler();
        GlStateManager.scale(scale, scale, scale);
        //this.shadowSize = entity.width * scale * 0.125F;
    }

}