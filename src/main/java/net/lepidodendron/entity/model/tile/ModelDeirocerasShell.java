package net.lepidodendron.entity.model.tile;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.client.model.ModelRenderer;

public class ModelDeirocerasShell extends AdvancedModelBase {
    public AdvancedModelRenderer shellbase;
    public AdvancedModelRenderer shellbasebottom;
    public AdvancedModelRenderer shellbasetop;
    public AdvancedModelRenderer shell1;
    public AdvancedModelRenderer shellcover1;
    public AdvancedModelRenderer shell2;
    public AdvancedModelRenderer shell1top;
    public AdvancedModelRenderer shell1bottom;
    public AdvancedModelRenderer shell3;
    public AdvancedModelRenderer shell2top;
    public AdvancedModelRenderer shell2bottom;
    public AdvancedModelRenderer shell4;
    public AdvancedModelRenderer shell3top;
    public AdvancedModelRenderer shell3bottom;
    public AdvancedModelRenderer shell5;
    public AdvancedModelRenderer shell4top;
    public AdvancedModelRenderer shell4bottom;
    public AdvancedModelRenderer shell6;
    public AdvancedModelRenderer shell5top;
    public AdvancedModelRenderer shell5bottom;
    public AdvancedModelRenderer shell7;
    public AdvancedModelRenderer shell6top;
    public AdvancedModelRenderer shell6bottom;
    public AdvancedModelRenderer shell8;
    public AdvancedModelRenderer shell7top;
    public AdvancedModelRenderer shell7bottom;
    public AdvancedModelRenderer shell9;
    public AdvancedModelRenderer shell8top;
    public AdvancedModelRenderer shell8bottom;
    public AdvancedModelRenderer shell10;
    public AdvancedModelRenderer shell9top;
    public AdvancedModelRenderer shell9bottom;
    public AdvancedModelRenderer shell11;
    public AdvancedModelRenderer shell10top;
    public AdvancedModelRenderer shell10bottom;
    public AdvancedModelRenderer shelltip;
    public AdvancedModelRenderer shellcover2;
    public AdvancedModelRenderer shellcovertop;
    public AdvancedModelRenderer shellcover2a;
    public AdvancedModelRenderer shellcover3;
    public AdvancedModelRenderer shellcovertop1;
    public AdvancedModelRenderer shellcovertop2;

    public ModelDeirocerasShell() {
        this.textureWidth = 256;
        this.textureHeight = 256;
        this.shell10 = new AdvancedModelRenderer(this, 188, 49);
        this.shell10.setRotationPoint(0.0F, 0.0F, 7.0F);
        this.shell10.addBox(-1.5F, -0.5F, 0.0F, 3, 1, 5, 0.0F);
        this.shell10top = new AdvancedModelRenderer(this, 173, 49);
        this.shell10top.setRotationPoint(0.0F, -1.5F, 10.0F);
        this.shell10top.addBox(-1.0F, 0.0F, -10.0F, 2, 1, 5, 0.0F);
        this.shellcover3 = new AdvancedModelRenderer(this, 0, 88);
        this.shellcover3.setRotationPoint(0.0F, 0.0F, -1.0F);
        this.shellcover3.addBox(-4.5F, 0.0F, 0.0F, 9, 2, 1, 0.0F);
        this.shellcovertop1 = new AdvancedModelRenderer(this, 68, 60);
        this.shellcovertop1.setRotationPoint(0.0F, -1.0F, -1.0F);
        this.shellcovertop1.addBox(-4.0F, 0.0F, 0.0F, 8, 1, 1, 0.0F);
        this.shell3top = new AdvancedModelRenderer(this, 124, 145);
        this.shell3top.setRotationPoint(0.0F, -5.0F, 10.0F);
        this.shell3top.addBox(-4.5F, 0.0F, -10.0F, 9, 1, 11, 0.0F);
        this.shell6top = new AdvancedModelRenderer(this, 152, 93);
        this.shell6top.setRotationPoint(0.0F, -3.5F, 10.0F);
        this.shell6top.addBox(-3.0F, 0.0F, -10.0F, 6, 1, 8, 0.0F);
        this.shell3 = new AdvancedModelRenderer(this, 165, 138);
        this.shell3.setRotationPoint(0.0F, 0.0F, 13.0F);
        this.shell3.addBox(-5.0F, -4.0F, 0.0F, 10, 8, 11, 0.0F);
        this.shell4top = new AdvancedModelRenderer(this, 135, 126);
        this.shell4top.setRotationPoint(0.0F, -4.5F, 10.0F);
        this.shell4top.addBox(-4.0F, 0.0F, -10.0F, 8, 1, 10, 0.0F);
        this.shell10bottom = new AdvancedModelRenderer(this, 205, 49);
        this.shell10bottom.setRotationPoint(0.0F, 0.5F, 10.0F);
        this.shell10bottom.addBox(-1.0F, 0.0F, -10.0F, 2, 1, 5, 0.0F);
        this.shell7top = new AdvancedModelRenderer(this, 157, 80);
        this.shell7top.setRotationPoint(0.0F, -3.0F, 10.0F);
        this.shell7top.addBox(-2.5F, 0.0F, -10.0F, 5, 1, 7, 0.0F);
        this.shell8 = new AdvancedModelRenderer(this, 184, 66);
        this.shell8.setRotationPoint(0.0F, 0.0F, 7.0F);
        this.shell8.addBox(-2.5F, -1.5F, 0.0F, 5, 3, 7, 0.0F);
        this.shell1bottom = new AdvancedModelRenderer(this, 66, 62);
        this.shell1bottom.setRotationPoint(0.0F, 5.0F, 10.0F);
        this.shell1bottom.addBox(-5.0F, 0.0F, -10.0F, 10, 1, 13, 0.0F);
        this.shellbasetop = new AdvancedModelRenderer(this, 39, 11);
        this.shellbasetop.setRotationPoint(0.0F, -6.5F, 0.0F);
        this.shellbasetop.addBox(-5.5F, 0.0F, -10.0F, 11, 1, 13, 0.0F);
        this.shell1 = new AdvancedModelRenderer(this, 0, 24);
        this.shell1.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.shell1.addBox(-6.0F, -5.0F, 0.0F, 12, 10, 13, 0.0F);
        this.shell4 = new AdvancedModelRenderer(this, 172, 120);
        this.shell4.setRotationPoint(0.0F, 0.0F, 11.0F);
        this.shell4.addBox(-4.5F, -3.5F, 0.0F, 9, 7, 10, 0.0F);
        this.shelltip = new AdvancedModelRenderer(this, 175, 37);
        this.shelltip.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.shelltip.addBox(-0.5F, -0.5F, 0.0F, 1, 1, 3, 0.0F);
        this.shellcover1 = new AdvancedModelRenderer(this, 37, 25);
        this.shellcover1.setRotationPoint(0.0F, 0.7F, -11.8F);
        this.shellcover1.addBox(-6.5F, 0.0F, 0.0F, 13, 2, 5, 0.0F);
        this.setRotateAngle(shellcover1, 1.5495033099205657F, 0.0F, 0.0F);
        this.shell2bottom = new AdvancedModelRenderer(this, 207, 166);
        this.shell2bottom.setRotationPoint(0.0F, 4.5F, 10.0F);
        this.shell2bottom.addBox(-5.0F, 0.0F, -10.0F, 10, 1, 13, 0.0F);
        this.shellbase = new AdvancedModelRenderer(this, 0, 0);
        this.shellbase.setRotationPoint(0.0F, 0.5F, -16.6F);
        this.shellbase.addBox(-6.5F, -5.5F, -10.0F, 13, 11, 13, 0.0F);
        this.setRotateAngle(shellbase, 0.0F, 3.141592653589793F, 0.0F);
        this.shell5top = new AdvancedModelRenderer(this, 143, 108);
        this.shell5top.setRotationPoint(0.0F, -4.0F, 10.0F);
        this.shell5top.addBox(-3.5F, 0.0F, -10.0F, 7, 1, 10, 0.0F);
        this.shell9top = new AdvancedModelRenderer(this, 164, 57);
        this.shell9top.setRotationPoint(0.0F, -2.0F, 10.0F);
        this.shell9top.addBox(-1.5F, 0.0F, -10.0F, 3, 1, 7, 0.0F);
        this.shellcover2 = new AdvancedModelRenderer(this, 72, 39);
        this.shellcover2.setRotationPoint(0.0F, 0.0F, -2.0F);
        this.shellcover2.addBox(-5.5F, 0.0F, 0.0F, 11, 2, 2, 0.0F);
        this.shell4bottom = new AdvancedModelRenderer(this, 211, 126);
        this.shell4bottom.setRotationPoint(0.0F, 3.5F, 10.0F);
        this.shell4bottom.addBox(-4.0F, 0.0F, -10.0F, 8, 1, 10, 0.0F);
        this.shell11 = new AdvancedModelRenderer(this, 175, 42);
        this.shell11.setRotationPoint(0.0F, 0.0F, 5.0F);
        this.shell11.addBox(-1.0F, -1.0F, 0.0F, 2, 2, 3, 0.0F);
        this.shellcovertop = new AdvancedModelRenderer(this, 74, 17);
        this.shellcovertop.setRotationPoint(0.0F, 0.0F, -1.0F);
        this.shellcovertop.addBox(-5.0F, -1.0F, 0.0F, 10, 1, 6, 0.0F);
        this.shell6 = new AdvancedModelRenderer(this, 181, 89);
        this.shell6.setRotationPoint(0.0F, 0.0F, 10.0F);
        this.shell6.addBox(-3.5F, -2.5F, 0.0F, 7, 5, 8, 0.0F);
        this.shell9bottom = new AdvancedModelRenderer(this, 208, 57);
        this.shell9bottom.setRotationPoint(0.0F, 1.0F, 10.0F);
        this.shell9bottom.addBox(-1.5F, 0.0F, -10.0F, 3, 1, 7, 0.0F);
        this.shell6bottom = new AdvancedModelRenderer(this, 212, 93);
        this.shell6bottom.setRotationPoint(0.0F, 2.5F, 10.0F);
        this.shell6bottom.addBox(-3.0F, 0.0F, -10.0F, 6, 1, 8, 0.0F);
        this.shell3bottom = new AdvancedModelRenderer(this, 208, 145);
        this.shell3bottom.setRotationPoint(0.0F, 4.0F, 10.0F);
        this.shell3bottom.addBox(-4.5F, 0.0F, -10.0F, 9, 1, 11, 0.0F);
        this.shell5bottom = new AdvancedModelRenderer(this, 215, 108);
        this.shell5bottom.setRotationPoint(0.0F, 3.0F, 10.0F);
        this.shell5bottom.addBox(-3.5F, 0.0F, -10.0F, 7, 1, 10, 0.0F);
        this.shell2top = new AdvancedModelRenderer(this, 111, 166);
        this.shell2top.setRotationPoint(0.0F, -5.5F, 10.0F);
        this.shell2top.addBox(-5.0F, 0.0F, -10.0F, 10, 1, 13, 0.0F);
        this.shell8bottom = new AdvancedModelRenderer(this, 209, 68);
        this.shell8bottom.setRotationPoint(0.0F, 1.5F, 10.0F);
        this.shell8bottom.addBox(-2.0F, 0.0F, -10.0F, 4, 1, 7, 0.0F);
        this.shell9 = new AdvancedModelRenderer(this, 185, 56);
        this.shell9.setRotationPoint(0.0F, 0.0F, 7.0F);
        this.shell9.addBox(-2.0F, -1.0F, 0.0F, 4, 2, 7, 0.0F);
        this.shell8top = new AdvancedModelRenderer(this, 161, 68);
        this.shell8top.setRotationPoint(0.0F, -2.5F, 10.0F);
        this.shell8top.addBox(-2.0F, 0.0F, -10.0F, 4, 1, 7, 0.0F);
        this.shell7 = new AdvancedModelRenderer(this, 182, 77);
        this.shell7.setRotationPoint(0.0F, 0.0F, 8.0F);
        this.shell7.addBox(-3.0F, -2.0F, 0.0F, 6, 4, 7, 0.0F);
        this.shellcovertop2 = new AdvancedModelRenderer(this, 63, 8);
        this.shellcovertop2.setRotationPoint(0.0F, -1.0F, 6.0F);
        this.shellcovertop2.addBox(-4.0F, 0.0F, 0.0F, 8, 1, 1, 0.0F);
        this.shellbasebottom = new AdvancedModelRenderer(this, 0, 47);
        this.shellbasebottom.setRotationPoint(0.0F, 5.5F, 0.0F);
        this.shellbasebottom.addBox(-5.5F, 0.0F, -10.0F, 11, 1, 13, 0.0F);
        this.shell2 = new AdvancedModelRenderer(this, 158, 158);
        this.shell2.setRotationPoint(0.0F, 0.0F, 13.0F);
        this.shell2.addBox(-5.5F, -4.5F, 0.0F, 11, 9, 13, 0.0F);
        this.shell5 = new AdvancedModelRenderer(this, 178, 103);
        this.shell5.setRotationPoint(0.0F, 0.0F, 10.0F);
        this.shell5.addBox(-4.0F, -3.0F, 0.0F, 8, 6, 10, 0.0F);
        this.shell1top = new AdvancedModelRenderer(this, 0, 62);
        this.shell1top.setRotationPoint(0.0F, -6.0F, 10.0F);
        this.shell1top.addBox(-5.0F, 0.0F, -10.0F, 10, 1, 13, 0.0F);
        this.shell7bottom = new AdvancedModelRenderer(this, 209, 80);
        this.shell7bottom.setRotationPoint(0.0F, 2.0F, 10.0F);
        this.shell7bottom.addBox(-2.5F, 0.0F, -10.0F, 5, 1, 7, 0.0F);
        this.shellcover2a = new AdvancedModelRenderer(this, 68, 57);
        this.shellcover2a.setRotationPoint(0.0F, 0.0F, 5.0F);
        this.shellcover2a.addBox(-5.5F, 0.0F, 0.0F, 11, 2, 1, 0.0F);
        this.shell9.addChild(this.shell10);
        this.shell10.addChild(this.shell10top);
        this.shellcover2.addChild(this.shellcover3);
        this.shellcovertop.addChild(this.shellcovertop1);
        this.shell3.addChild(this.shell3top);
        this.shell6.addChild(this.shell6top);
        this.shell2.addChild(this.shell3);
        this.shell4.addChild(this.shell4top);
        this.shell10.addChild(this.shell10bottom);
        this.shell7.addChild(this.shell7top);
        this.shell7.addChild(this.shell8);
        this.shell1.addChild(this.shell1bottom);
        this.shellbase.addChild(this.shellbasetop);
        this.shellbase.addChild(this.shell1);
        this.shell3.addChild(this.shell4);
        this.shell11.addChild(this.shelltip);
        this.shellbase.addChild(this.shellcover1);
        this.shell2.addChild(this.shell2bottom);
        this.shell5.addChild(this.shell5top);
        this.shell9.addChild(this.shell9top);
        this.shellcover1.addChild(this.shellcover2);
        this.shell4.addChild(this.shell4bottom);
        this.shell10.addChild(this.shell11);
        this.shellcover1.addChild(this.shellcovertop);
        this.shell5.addChild(this.shell6);
        this.shell9.addChild(this.shell9bottom);
        this.shell6.addChild(this.shell6bottom);
        this.shell3.addChild(this.shell3bottom);
        this.shell5.addChild(this.shell5bottom);
        this.shell2.addChild(this.shell2top);
        this.shell8.addChild(this.shell8bottom);
        this.shell8.addChild(this.shell9);
        this.shell8.addChild(this.shell8top);
        this.shell6.addChild(this.shell7);
        this.shellcovertop.addChild(this.shellcovertop2);
        this.shellbase.addChild(this.shellbasebottom);
        this.shell1.addChild(this.shell2);
        this.shell4.addChild(this.shell5);
        this.shell1.addChild(this.shell1top);
        this.shell7.addChild(this.shell7bottom);
        this.shellcover1.addChild(this.shellcover2a);

        updateDefaultPose();
    }

    public void renderAll(float f) {
        this.resetToDefaultPose();
        this.shellbase.offsetY = 0.5F;
        this.shellbase.offsetZ = 4.5F;
        this.shellbase.render(0.1f);
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

}
