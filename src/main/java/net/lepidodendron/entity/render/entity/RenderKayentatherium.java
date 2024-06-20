package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraKayentatherium;
import net.lepidodendron.entity.model.entity.ModelKayentatherium;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderKayentatherium extends RenderLivingBaseWithBook<EntityPrehistoricFloraKayentatherium> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/kayentatherium.png");

    public static float getScaler() {return 0.75f;}
    public RenderKayentatherium(RenderManager mgr) {
        super(mgr, new ModelKayentatherium(), 0.14f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraKayentatherium entity) {
        return RenderKayentatherium.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraKayentatherium entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraKayentatherium entity, float f) {
        float scale = entity.getAgeScale()*getScaler(); //This is smaller than Kayentatherium
        GlStateManager.scale(scale, scale, scale);
        //this.shadowSize = entity.width * scale * 0.125F;
    }

}