package net.dungeondesk.qualitytools.datagen;

import net.dungeondesk.qualitytools.QualityTools;
import net.dungeondesk.qualitytools.block.ModBlocks;
import net.dungeondesk.qualitytools.item.ModItems;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.client.data.BlockStateModelGenerator;
import net.minecraft.client.data.ItemModelGenerator;
import net.minecraft.client.data.Models;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.BACKPACK);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

        itemModelGenerator.register(ModItems.RUBY, Models.GENERATED);
        itemModelGenerator.register(ModItems.SAPPHIRE, Models.GENERATED);

        itemModelGenerator.register(ModItems.WOOD_HAMMER, Models.HANDHELD);
        itemModelGenerator.register(ModItems.STONE_HAMMER, Models.HANDHELD);
        itemModelGenerator.register(ModItems.GOLD_HAMMER, Models.HANDHELD);
        itemModelGenerator.register(ModItems.COPPER_HAMMER, Models.HANDHELD);
        itemModelGenerator.register(ModItems.IRON_HAMMER, Models.HANDHELD);
        itemModelGenerator.register(ModItems.DIAMOND_HAMMER, Models.HANDHELD);
        itemModelGenerator.register(ModItems.QUARTZ_HAMMER, Models.HANDHELD);
        itemModelGenerator.register(ModItems.EMERALD_HAMMER, Models.HANDHELD);
        itemModelGenerator.register(ModItems.AMETHYST_HAMMER, Models.HANDHELD);
        itemModelGenerator.register(ModItems.RUBY_HAMMER, Models.HANDHELD);
        itemModelGenerator.register(ModItems.SAPPHIRE_HAMMER, Models.HANDHELD);
        itemModelGenerator.register(ModItems.NETHERITE_HAMMER, Models.HANDHELD);

        itemModelGenerator.register(ModItems.WOOD_EXCAVATOR, Models.HANDHELD);
        itemModelGenerator.register(ModItems.STONE_EXCAVATOR, Models.HANDHELD);
        itemModelGenerator.register(ModItems.GOLD_EXCAVATOR, Models.HANDHELD);
        itemModelGenerator.register(ModItems.COPPER_EXCAVATOR, Models.HANDHELD);
        itemModelGenerator.register(ModItems.IRON_EXCAVATOR, Models.HANDHELD);
        itemModelGenerator.register(ModItems.DIAMOND_EXCAVATOR, Models.HANDHELD);
        itemModelGenerator.register(ModItems.QUARTZ_EXCAVATOR, Models.HANDHELD);
        itemModelGenerator.register(ModItems.EMERALD_EXCAVATOR, Models.HANDHELD);
        itemModelGenerator.register(ModItems.AMETHYST_EXCAVATOR, Models.HANDHELD);
        itemModelGenerator.register(ModItems.RUBY_EXCAVATOR, Models.HANDHELD);
        itemModelGenerator.register(ModItems.SAPPHIRE_EXCAVATOR, Models.HANDHELD);
        itemModelGenerator.register(ModItems.NETHERITE_EXCAVATOR, Models.HANDHELD);

        itemModelGenerator.register(ModItems.COPPER_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.COPPER_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.COPPER_HOE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.COPPER_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.COPPER_SWORD, Models.HANDHELD);

        itemModelGenerator.register(ModItems.AMETHYST_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.AMETHYST_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.AMETHYST_HOE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.AMETHYST_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.AMETHYST_SWORD, Models.HANDHELD);

        itemModelGenerator.register(ModItems.EMERALD_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.EMERALD_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.EMERALD_HOE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.EMERALD_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.EMERALD_SWORD, Models.HANDHELD);

        itemModelGenerator.register(ModItems.QUARTZ_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.QUARTZ_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.QUARTZ_HOE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.QUARTZ_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.QUARTZ_SWORD, Models.HANDHELD);

        itemModelGenerator.register(ModItems.RUBY_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.RUBY_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.RUBY_HOE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.RUBY_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.RUBY_SWORD, Models.HANDHELD);

        itemModelGenerator.register(ModItems.SAPPHIRE_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.SAPPHIRE_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.SAPPHIRE_HOE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.SAPPHIRE_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.SAPPHIRE_SWORD, Models.HANDHELD);

        itemModelGenerator.registerArmor(ModItems.COPPER_HELMET, RegistryKey.of(
                RegistryKey.ofRegistry(Identifier.ofVanilla("equipment_asset")),
                Identifier.of(QualityTools.MOD_ID, "copper")), ItemModelGenerator.HELMET_TRIM_ID_PREFIX, false);

        itemModelGenerator.registerArmor(ModItems.COPPER_CHESTPLATE, RegistryKey.of(
                RegistryKey.ofRegistry(Identifier.ofVanilla("equipment_asset")),
                Identifier.of(QualityTools.MOD_ID, "copper")), ItemModelGenerator.CHESTPLATE_TRIM_ID_PREFIX, false);

        itemModelGenerator.registerArmor(ModItems.COPPER_LEGGINGS, RegistryKey.of(
                RegistryKey.ofRegistry(Identifier.ofVanilla("equipment_asset")),
                Identifier.of(QualityTools.MOD_ID, "copper")), ItemModelGenerator.LEGGINGS_TRIM_ID_PREFIX, false);

        itemModelGenerator.registerArmor(ModItems.COPPER_BOOTS, RegistryKey.of(
                RegistryKey.ofRegistry(Identifier.ofVanilla("equipment_asset")),
                Identifier.of(QualityTools.MOD_ID, "copper")), ItemModelGenerator.BOOTS_TRIM_ID_PREFIX, false);

        itemModelGenerator.registerArmor(ModItems.AMETHYST_HELMET, RegistryKey.of(
                RegistryKey.ofRegistry(Identifier.ofVanilla("equipment_asset")),
                Identifier.of(QualityTools.MOD_ID, "amethyst")), ItemModelGenerator.HELMET_TRIM_ID_PREFIX, false);

        itemModelGenerator.registerArmor(ModItems.AMETHYST_CHESTPLATE, RegistryKey.of(
                RegistryKey.ofRegistry(Identifier.ofVanilla("equipment_asset")),
                Identifier.of(QualityTools.MOD_ID, "amethyst")), ItemModelGenerator.CHESTPLATE_TRIM_ID_PREFIX, false);

        itemModelGenerator.registerArmor(ModItems.AMETHYST_LEGGINGS, RegistryKey.of(
                RegistryKey.ofRegistry(Identifier.ofVanilla("equipment_asset")),
                Identifier.of(QualityTools.MOD_ID, "amethyst")), ItemModelGenerator.LEGGINGS_TRIM_ID_PREFIX, false);

        itemModelGenerator.registerArmor(ModItems.AMETHYST_BOOTS, RegistryKey.of(
                RegistryKey.ofRegistry(Identifier.ofVanilla("equipment_asset")),
                Identifier.of(QualityTools.MOD_ID, "amethyst")), ItemModelGenerator.BOOTS_TRIM_ID_PREFIX, false);

        itemModelGenerator.registerArmor(ModItems.QUARTZ_HELMET, RegistryKey.of(
                RegistryKey.ofRegistry(Identifier.ofVanilla("equipment_asset")),
                Identifier.of(QualityTools.MOD_ID, "quartz")), ItemModelGenerator.HELMET_TRIM_ID_PREFIX, false);

        itemModelGenerator.registerArmor(ModItems.QUARTZ_CHESTPLATE, RegistryKey.of(
                RegistryKey.ofRegistry(Identifier.ofVanilla("equipment_asset")),
                Identifier.of(QualityTools.MOD_ID, "quartz")), ItemModelGenerator.CHESTPLATE_TRIM_ID_PREFIX, false);

        itemModelGenerator.registerArmor(ModItems.QUARTZ_LEGGINGS, RegistryKey.of(
                RegistryKey.ofRegistry(Identifier.ofVanilla("equipment_asset")),
                Identifier.of(QualityTools.MOD_ID, "quartz")), ItemModelGenerator.LEGGINGS_TRIM_ID_PREFIX, false);

        itemModelGenerator.registerArmor(ModItems.QUARTZ_BOOTS, RegistryKey.of(
                RegistryKey.ofRegistry(Identifier.ofVanilla("equipment_asset")),
                Identifier.of(QualityTools.MOD_ID, "quartz")), ItemModelGenerator.BOOTS_TRIM_ID_PREFIX, false);

        itemModelGenerator.registerArmor(ModItems.EMERALD_HELMET, RegistryKey.of(
                RegistryKey.ofRegistry(Identifier.ofVanilla("equipment_asset")),
                Identifier.of(QualityTools.MOD_ID, "emerald")), ItemModelGenerator.HELMET_TRIM_ID_PREFIX, false);

        itemModelGenerator.registerArmor(ModItems.EMERALD_CHESTPLATE, RegistryKey.of(
                RegistryKey.ofRegistry(Identifier.ofVanilla("equipment_asset")),
                Identifier.of(QualityTools.MOD_ID, "emerald")), ItemModelGenerator.CHESTPLATE_TRIM_ID_PREFIX, false);

        itemModelGenerator.registerArmor(ModItems.EMERALD_LEGGINGS, RegistryKey.of(
                RegistryKey.ofRegistry(Identifier.ofVanilla("equipment_asset")),
                Identifier.of(QualityTools.MOD_ID, "emerald")), ItemModelGenerator.LEGGINGS_TRIM_ID_PREFIX, false);

        itemModelGenerator.registerArmor(ModItems.EMERALD_BOOTS, RegistryKey.of(
                RegistryKey.ofRegistry(Identifier.ofVanilla("equipment_asset")),
                Identifier.of(QualityTools.MOD_ID, "emerald")), ItemModelGenerator.BOOTS_TRIM_ID_PREFIX, false);

        itemModelGenerator.registerArmor(ModItems.RUBY_HELMET, RegistryKey.of(
                RegistryKey.ofRegistry(Identifier.ofVanilla("equipment_asset")),
                Identifier.of(QualityTools.MOD_ID, "ruby")), ItemModelGenerator.HELMET_TRIM_ID_PREFIX, false);

        itemModelGenerator.registerArmor(ModItems.RUBY_CHESTPLATE, RegistryKey.of(
                RegistryKey.ofRegistry(Identifier.ofVanilla("equipment_asset")),
                Identifier.of(QualityTools.MOD_ID, "ruby")), ItemModelGenerator.CHESTPLATE_TRIM_ID_PREFIX, false);

        itemModelGenerator.registerArmor(ModItems.RUBY_LEGGINGS, RegistryKey.of(
                RegistryKey.ofRegistry(Identifier.ofVanilla("equipment_asset")),
                Identifier.of(QualityTools.MOD_ID, "ruby")), ItemModelGenerator.LEGGINGS_TRIM_ID_PREFIX, false);

        itemModelGenerator.registerArmor(ModItems.RUBY_BOOTS, RegistryKey.of(
                RegistryKey.ofRegistry(Identifier.ofVanilla("equipment_asset")),
                Identifier.of(QualityTools.MOD_ID, "ruby")), ItemModelGenerator.BOOTS_TRIM_ID_PREFIX, false);

        itemModelGenerator.registerArmor(ModItems.SAPPHIRE_HELMET, RegistryKey.of(
                RegistryKey.ofRegistry(Identifier.ofVanilla("equipment_asset")),
                Identifier.of(QualityTools.MOD_ID, "sapphire")), ItemModelGenerator.HELMET_TRIM_ID_PREFIX, false);

        itemModelGenerator.registerArmor(ModItems.SAPPHIRE_CHESTPLATE, RegistryKey.of(
                RegistryKey.ofRegistry(Identifier.ofVanilla("equipment_asset")),
                Identifier.of(QualityTools.MOD_ID, "sapphire")), ItemModelGenerator.CHESTPLATE_TRIM_ID_PREFIX, false);

        itemModelGenerator.registerArmor(ModItems.SAPPHIRE_LEGGINGS, RegistryKey.of(
                RegistryKey.ofRegistry(Identifier.ofVanilla("equipment_asset")),
                Identifier.of(QualityTools.MOD_ID, "sapphire")), ItemModelGenerator.LEGGINGS_TRIM_ID_PREFIX, false);

        itemModelGenerator.registerArmor(ModItems.SAPPHIRE_BOOTS, RegistryKey.of(
                RegistryKey.ofRegistry(Identifier.ofVanilla("equipment_asset")),
                Identifier.of(QualityTools.MOD_ID, "sapphire")), ItemModelGenerator.BOOTS_TRIM_ID_PREFIX, false);

        itemModelGenerator.register(ModItems.COPPER_HORSE_ARMOR, Models.GENERATED);
        itemModelGenerator.register(ModItems.AMETHYST_HORSE_ARMOR, Models.GENERATED);
        itemModelGenerator.register(ModItems.QUARTZ_HORSE_ARMOR, Models.GENERATED);
        itemModelGenerator.register(ModItems.EMERALD_HORSE_ARMOR, Models.GENERATED);
        itemModelGenerator.register(ModItems.RUBY_HORSE_ARMOR, Models.GENERATED);
        itemModelGenerator.register(ModItems.SAPPHIRE_HORSE_ARMOR, Models.GENERATED);

    }
}
