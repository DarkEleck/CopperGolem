package com.darkeleck.coppergolem;

import com.darkeleck.coppergolem.client.model.CopperGolemEntityModel;
import com.darkeleck.coppergolem.client.renderer.CopperGolemEntityRenderer;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.util.Identifier;

@Environment(EnvType.CLIENT)
public class Client implements ClientModInitializer {
    public static final EntityModelLayer MODEL_COPPER_GOOLEM_LAYER = new EntityModelLayer(new Identifier("coppergolem", "copper_golem"), "main");

    @Override
    public void onInitializeClient() {

        EntityRendererRegistry.register(Main.COPPER_GOLEM, (context) -> {
            return new CopperGolemEntityRenderer(context);
        });

        EntityModelLayerRegistry.registerModelLayer(MODEL_COPPER_GOOLEM_LAYER, CopperGolemEntityModel::getTexturedModelData);
    }
}
