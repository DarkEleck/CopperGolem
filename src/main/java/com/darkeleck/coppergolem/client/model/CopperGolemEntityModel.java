package com.darkeleck.coppergolem.client.model;

import com.darkeleck.coppergolem.entity.CopperGolemEntity;
import com.google.common.collect.ImmutableList;
import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.render.entity.model.EntityModelPartNames;
import net.minecraft.client.util.math.MatrixStack;

public class CopperGolemEntityModel extends EntityModel<CopperGolemEntity> {

    private final ModelPart body;
    private final ModelPart rarm;
    private final ModelPart larm;
    private final ModelPart rleg;
    private final ModelPart lleg;
    private final ModelPart head;
    private final ModelPart nose;
    private final ModelPart rod;
    private final ModelPart headrod;

    public CopperGolemEntityModel(ModelPart modelPart) {

        this.body = modelPart.getChild(EntityModelPartNames.BODY);
        this.rarm = modelPart.getChild(EntityModelPartNames.RIGHT_ARM);
        this.larm = modelPart.getChild(EntityModelPartNames.LEFT_ARM);
        this.rleg = modelPart.getChild(EntityModelPartNames.RIGHT_LEG);
        this.lleg = modelPart.getChild(EntityModelPartNames.LEFT_LEG);
        this.head = modelPart.getChild(EntityModelPartNames.HEAD);
        this.nose = modelPart.getChild(EntityModelPartNames.CUBE);
        this.rod = modelPart.getChild(EntityModelPartNames.HAT);
        this.headrod =modelPart.getChild(EntityModelPartNames.HAT_RIM);
    }

    public static TexturedModelData getTexturedModelData() {
        ModelData modelData = new ModelData();
        ModelPartData modelPartData = modelData.getRoot();
        modelPartData.addChild(EntityModelPartNames.HAT, ModelPartBuilder.create().uv(24, 0).cuboid(-1f, -14f, -1f, 2f, 2f, 2f), ModelTransform.pivot(0.0f, 24.0f, 0.0f));
        modelPartData.addChild(EntityModelPartNames.HAT_RIM, ModelPartBuilder.create().uv(32, 2).cuboid(-1.5F, -17.0F, -1.5F, 3.0F, 3.0F, 3.0F), ModelTransform.pivot(0.0f, 24.0f, 0.0f));
        modelPartData.addChild(EntityModelPartNames.HEAD, ModelPartBuilder.create().uv(0, 0).cuboid(-4f, -12f, -4f, 8f, 5f, 8f), ModelTransform.pivot(0.0f, 24.0f, 0.0f));
        modelPartData.addChild(EntityModelPartNames.CUBE, ModelPartBuilder.create().uv(24, 0).cuboid(-1f, -9f, -6f, 2f, 3f, 2f), ModelTransform.pivot(0.0f, 24.0f, 0.0f));
        modelPartData.addChild(EntityModelPartNames.BODY, ModelPartBuilder.create().uv(0, 13).cuboid(-4f, -7f, -2f, 8f, 4f, 4f), ModelTransform.pivot(0.0f, 14.0f, 0.0f));
        modelPartData.addChild(EntityModelPartNames.RIGHT_ARM, ModelPartBuilder.create().uv(0, 21).cuboid(-7f, -8f, -1.5f, 3f, 8f, 3f), ModelTransform.pivot(0.0f, 24.0f, 0.0f));
        modelPartData.addChild(EntityModelPartNames.LEFT_ARM, ModelPartBuilder.create().uv(0, 32).cuboid(4f, -8f, -1.5f, 3f, 8f, 3f), ModelTransform.pivot(0.0f, 24.0f, 0.0f));
        modelPartData.addChild(EntityModelPartNames.RIGHT_LEG, ModelPartBuilder.create().uv(12, 21).cuboid(-4f, -3f, -2f, 4f, 3f, 4f), ModelTransform.pivot(0.0f, 24.0f, 0.0f));
        modelPartData.addChild(EntityModelPartNames.LEFT_LEG, ModelPartBuilder.create().uv(12, 21).cuboid(0.0F, -3.0F, -2.0F, 4.0F, 3.0F, 4.0F), ModelTransform.pivot(0.0f, 24.0f, 0.0f));

        return TexturedModelData.of(modelData, 64, 64);
    }

    @Override
    public void setAngles(CopperGolemEntity entity, float limbAngle, float limbDistance, float animationProgress, float headYaw, float headPitch) {
        body.setPivot(0.0F, 24.0F, 0.0F);
        rarm.setPivot(0.0F, 24.0F, 0.0F);
        larm.setPivot(0.0F, 24.0F, 0.0F);
        rleg.setPivot(0.0F, 24.0F, 0.0F);
        lleg.setPivot(0.0F, 24.0F, 0.0F);
        head.setPivot(0.0F, 24.0F, 0.0F);
        rod.setPivot(0.0F, 24.0F, 0.0F);
        headrod.setPivot(0.0F, 24.0F, 0.0F);
    }

    @Override
    public void render(MatrixStack matrices, VertexConsumer vertices, int light, int overlay, float red, float green, float blue, float alpha) {
        ImmutableList.of(this.body, this.rarm, this.larm, this.rleg, this.lleg, this.head, this.nose, this.rod, this.headrod).forEach((modelRenderer) -> {
            modelRenderer.render(matrices, vertices, light, overlay, red, green, blue, alpha);
        });
    }
}
