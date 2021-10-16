package com.darkeleck.coppergolem.client.renderer;

import com.darkeleck.coppergolem.Client;
import com.darkeleck.coppergolem.Main;
import com.darkeleck.coppergolem.client.model.CopperGolemEntityModel;
import com.darkeleck.coppergolem.entity.CopperGolemEntity;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;

public class CopperGolemEntityRenderer extends MobEntityRenderer<CopperGolemEntity, CopperGolemEntityModel> {

    public CopperGolemEntityRenderer(EntityRendererFactory.Context context) {
        super(context,new CopperGolemEntityModel(context.getPart(Client.MODEL_COPPER_GOOLEM_LAYER)), 0.5f);
    }
    @Override
    public Identifier getTexture(CopperGolemEntity entity) {
        return new Identifier(Main.MOD_ID, "textures/entity/copper_golem/copper_golem.png");
    }
}
