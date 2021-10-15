package com.darkeleck.coppergolem;

import com.darkeleck.coppergolem.entity.CopperGolemEntity;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Main implements ModInitializer {

    public static final EntityType<CopperGolemEntity> COPPER_GOLEM = Registry.register(
            Registry.ENTITY_TYPE,
            new Identifier("coppergolem", "copper_golem"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, CopperGolemEntity::new).dimensions(EntityDimensions.fixed(0.75f, 0.75f)).build()
    );

    @Override
    public void onInitialize() {
        FabricDefaultAttributeRegistry.register(COPPER_GOLEM, CopperGolemEntity.createMobAttributes());
    }
}
