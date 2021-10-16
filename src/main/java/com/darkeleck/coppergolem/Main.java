package com.darkeleck.coppergolem;

import com.darkeleck.coppergolem.entity.CopperGolemEntity;
import com.darkeleck.coppergolem.registries.Registries;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Main implements ModInitializer {

    public static final String MOD_ID = "coppergolem";

    public static final EntityType<CopperGolemEntity> COPPER_GOLEM = Registry.register(
            Registry.ENTITY_TYPE,
            new Identifier(Main.MOD_ID, "copper_golem"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, CopperGolemEntity::new).dimensions(EntityDimensions.fixed(0.75f, 0.75f)).build()
    );

    @Override
    public void onInitialize() {
        Registries.registerRegistries();
        FabricDefaultAttributeRegistry.register(COPPER_GOLEM, CopperGolemEntity.createMobAttributes());
    }
}
