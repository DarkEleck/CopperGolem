package com.darkeleck.coppergolem.registries;

import com.darkeleck.coppergolem.Main;
import com.darkeleck.coppergolem.block.custom.ModPressurePlateBlock;
import com.darkeleck.coppergolem.block.custom.ModStoneButtonBlock;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.GrindstoneBlock;
import net.minecraft.block.Material;
import net.minecraft.block.PressurePlateBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Registries {

    public static final Block COPPER_BUTTON = registerBlock("copper_button",
            new ModStoneButtonBlock(FabricBlockSettings.of(Material.METAL).strength(3f)
                    .breakByTool(FabricToolTags.PICKAXES, 1).requiresTool()));

    public static final Block COPPER_PRESSURE_PLATE = registerBlock("copper_pressure_plate",
            new ModPressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,
                    FabricBlockSettings.of(Material.METAL).strength(3f)
                    .breakByTool(FabricToolTags.PICKAXES, 1).requiresTool()));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(ItemGroup.REDSTONE)));
    }

    public static void registerRegistries() {
        System.out.println("Registering Registries for " + Main.MOD_ID);
    }
}
