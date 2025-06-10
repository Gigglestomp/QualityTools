package net.dungeondesk.qualitytools.item;

import net.dungeondesk.qualitytools.QualityTools;
import net.dungeondesk.qualitytools.block.ModBlocks;
import net.dungeondesk.qualitytools.item.custom.BackpackItem;
import net.dungeondesk.qualitytools.item.custom.ExcavatorItem;
import net.dungeondesk.qualitytools.item.custom.HammerItem;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.Block;
import net.minecraft.item.*;
import net.minecraft.item.equipment.EquipmentType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item RUBY=registerItem("ruby",new Item(new Item.Settings()
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(QualityTools.MOD_ID,"ruby")))));

    public static final Item SAPPHIRE=registerItem("sapphire",new Item(new Item.Settings()
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(QualityTools.MOD_ID,"sapphire")))));

    public static final Item WOOD_HAMMER=registerItem("wood_hammer",
            new HammerItem(new Item.Settings()
                    .pickaxe(ToolMaterial.WOOD, 7.0f, -3.4f)
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(QualityTools.MOD_ID,"wood_hammer")))));

    public static final Item STONE_HAMMER=registerItem("stone_hammer",
            new HammerItem(new Item.Settings()
                    .pickaxe(ToolMaterial.STONE, 7.0f, -3.4f)
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(QualityTools.MOD_ID,"stone_hammer")))));

    public static final Item GOLD_HAMMER=registerItem("gold_hammer",
            new HammerItem(new Item.Settings()
                    .pickaxe(ToolMaterial.GOLD, 7.0f, -3.4f)
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(QualityTools.MOD_ID,"gold_hammer")))));

    public static final Item COPPER_HAMMER=registerItem("copper_hammer",
            new HammerItem(new Item.Settings()
                    .pickaxe(ModToolMaterials.COPPER, 7.0f, -3.4f)
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(QualityTools.MOD_ID,"copper_hammer")))));

    public static final Item IRON_HAMMER=registerItem("iron_hammer",
            new HammerItem(new Item.Settings()
                    .pickaxe(ToolMaterial.IRON, 7.0f, -3.4f)
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(QualityTools.MOD_ID,"iron_hammer")))));

    public static final Item QUARTZ_HAMMER=registerItem("quartz_hammer",
            new HammerItem(new Item.Settings()
                    .pickaxe(ModToolMaterials.QUARTZ, 7.0f, -3.4f)
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(QualityTools.MOD_ID,"quartz_hammer")))));

    public static final Item EMERALD_HAMMER=registerItem("emerald_hammer",
            new HammerItem(new Item.Settings()
                    .pickaxe(ModToolMaterials.EMERALD, 7.0f, -3.4f)
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(QualityTools.MOD_ID,"emerald_hammer")))));

    public static final Item AMETHYST_HAMMER=registerItem("amethyst_hammer",
            new HammerItem(new Item.Settings()
                    .pickaxe(ModToolMaterials.AMETHYST, 7.0f, -3.4f)
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(QualityTools.MOD_ID,"amethyst_hammer")))));

    public static final Item RUBY_HAMMER=registerItem("ruby_hammer",
            new HammerItem(new Item.Settings()
                    .pickaxe(ModToolMaterials.RUBY, 7.0f, -3.4f)
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(QualityTools.MOD_ID,"ruby_hammer")))));

    public static final Item SAPPHIRE_HAMMER=registerItem("sapphire_hammer",
            new HammerItem(new Item.Settings()
                    .pickaxe(ModToolMaterials.SAPPHIRE, 7.0f, -3.4f)
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(QualityTools.MOD_ID,"sapphire_hammer")))));

    public static final Item DIAMOND_HAMMER=registerItem("diamond_hammer",
            new HammerItem(new Item.Settings()
                    .pickaxe(ToolMaterial.DIAMOND, 7.0f, -3.4f)
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(QualityTools.MOD_ID,"diamond_hammer")))));

    public static final Item NETHERITE_HAMMER=registerItem("netherite_hammer",
            new HammerItem(new Item.Settings()
                    .pickaxe(ToolMaterial.NETHERITE, 7.0f, -3.4f)
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(QualityTools.MOD_ID,"netherite_hammer")))));

    public static final Item WOOD_EXCAVATOR=registerItem("wood_excavator",
            new ExcavatorItem(new Item.Settings()
                    .shovel(ToolMaterial.WOOD, 7.0f, -3.4f)
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(QualityTools.MOD_ID,"wood_excavator")))));

    public static final Item STONE_EXCAVATOR=registerItem("stone_excavator",
            new ExcavatorItem(new Item.Settings()
                    .shovel(ToolMaterial.STONE, 7.0f, -3.4f)
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(QualityTools.MOD_ID,"stone_excavator")))));

    public static final Item GOLD_EXCAVATOR=registerItem("gold_excavator",
            new ExcavatorItem(new Item.Settings()
                    .shovel(ToolMaterial.GOLD, 7.0f, -3.4f)
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(QualityTools.MOD_ID,"gold_excavator")))));

    public static final Item COPPER_EXCAVATOR=registerItem("copper_excavator",
            new ExcavatorItem(new Item.Settings()
                    .shovel(ModToolMaterials.COPPER, 7.0f, -3.4f)
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(QualityTools.MOD_ID,"copper_excavator")))));

    public static final Item IRON_EXCAVATOR=registerItem("iron_excavator",
            new ExcavatorItem(new Item.Settings()
                    .shovel(ToolMaterial.IRON, 7.0f, -3.4f)
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(QualityTools.MOD_ID,"iron_excavator")))));

    public static final Item QUARTZ_EXCAVATOR=registerItem("quartz_excavator",
            new ExcavatorItem(new Item.Settings()
                    .shovel(ModToolMaterials.QUARTZ, 7.0f, -3.4f)
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(QualityTools.MOD_ID,"quartz_excavator")))));

    public static final Item EMERALD_EXCAVATOR=registerItem("emerald_excavator",
            new ExcavatorItem(new Item.Settings()
                    .shovel(ModToolMaterials.EMERALD, 7.0f, -3.4f)
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(QualityTools.MOD_ID,"emerald_excavator")))));

    public static final Item AMETHYST_EXCAVATOR=registerItem("amethyst_excavator",
            new ExcavatorItem(new Item.Settings()
                    .shovel(ModToolMaterials.AMETHYST, 7.0f, -3.4f)
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(QualityTools.MOD_ID,"amethyst_excavator")))));

    public static final Item RUBY_EXCAVATOR=registerItem("ruby_excavator",
            new ExcavatorItem(new Item.Settings()
                    .shovel(ModToolMaterials.RUBY, 7.0f, -3.4f)
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(QualityTools.MOD_ID,"ruby_excavator")))));

    public static final Item SAPPHIRE_EXCAVATOR=registerItem("sapphire_excavator",
            new ExcavatorItem(new Item.Settings()
                    .shovel(ModToolMaterials.SAPPHIRE, 7.0f, -3.4f)
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(QualityTools.MOD_ID,"sapphire_excavator")))));

    public static final Item DIAMOND_EXCAVATOR=registerItem("diamond_excavator",
            new ExcavatorItem(new Item.Settings()
                    .shovel(ToolMaterial.DIAMOND, 7.0f, -3.4f)
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(QualityTools.MOD_ID,"diamond_excavator")))));

    public static final Item NETHERITE_EXCAVATOR=registerItem("netherite_excavator",
            new ExcavatorItem(new Item.Settings()
                    .shovel(ToolMaterial.NETHERITE, 7.0f, -3.4f)
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(QualityTools.MOD_ID,"netherite_excavator")))));


    public static final Item COPPER_PICKAXE=registerItem("copper_pickaxe",
            new Item(new Item.Settings()
                    .pickaxe(ModToolMaterials.COPPER, 1.0F, -2.8F)
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(QualityTools.MOD_ID,"copper_pickaxe")))));

    public static final Item COPPER_SHOVEL=registerItem("copper_shovel",
            new ShovelItem(ModToolMaterials.COPPER, 1.5F, -3.0F, new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(QualityTools.MOD_ID,"copper_shovel")))));

    public static final Item COPPER_HOE = registerItem("copper_hoe",
            new HoeItem(ModToolMaterials.COPPER, -2.0F, -1.0F, new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(QualityTools.MOD_ID,"copper_hoe")))));

    public static final Item COPPER_AXE = registerItem("copper_axe",
            new AxeItem(ModToolMaterials.COPPER, 6.0F, -3.1F, new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(QualityTools.MOD_ID,"copper_axe")))));

    public static final Item COPPER_SWORD = registerItem("copper_sword",
            new Item(new Item.Settings()
                    .sword(ModToolMaterials.COPPER, 3.0F, -2.4F)
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(QualityTools.MOD_ID,"copper_sword")))));

    public static final Item AMETHYST_PICKAXE=registerItem("amethyst_pickaxe",
            new Item(new Item.Settings()
                    .pickaxe(ModToolMaterials.AMETHYST, 1.0F, -2.8F)
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(QualityTools.MOD_ID,"amethyst_pickaxe")))));

    public static final Item AMETHYST_SHOVEL=registerItem("amethyst_shovel",
            new ShovelItem(ModToolMaterials.AMETHYST, 1.5F, -3.0F, new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(QualityTools.MOD_ID,"amethyst_shovel")))));

    public static final Item AMETHYST_HOE = registerItem("amethyst_hoe",
            new HoeItem(ModToolMaterials.AMETHYST, -3.0F, 0.0F, new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(QualityTools.MOD_ID,"amethyst_hoe")))));

    public static final Item AMETHYST_AXE = registerItem("amethyst_axe",
            new AxeItem(ModToolMaterials.AMETHYST, 5.0F, -3.0F, new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(QualityTools.MOD_ID,"amethyst_axe")))));

    public static final Item AMETHYST_SWORD = registerItem("amethyst_sword",
            new Item(new Item.Settings()
                    .sword(ModToolMaterials.AMETHYST, 3.0F, -2.4F)
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(QualityTools.MOD_ID,"amethyst_sword")))));

    public static final Item EMERALD_PICKAXE=registerItem("emerald_pickaxe",
            new Item(new Item.Settings()
                    .pickaxe(ModToolMaterials.EMERALD, 1.0F, -2.8F)
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(QualityTools.MOD_ID,"emerald_pickaxe")))));

    public static final Item EMERALD_SHOVEL=registerItem("emerald_shovel",
            new ShovelItem(ModToolMaterials.EMERALD, 1.5F, -3.0F, new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(QualityTools.MOD_ID,"emerald_shovel")))));

    public static final Item EMERALD_HOE = registerItem("emerald_hoe",
            new HoeItem(ModToolMaterials.EMERALD, -3.0F, 0.0F, new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(QualityTools.MOD_ID,"emerald_hoe")))));

    public static final Item EMERALD_AXE = registerItem("emerald_axe",
            new AxeItem(ModToolMaterials.EMERALD, 5.0F, -3.0F, new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(QualityTools.MOD_ID,"emerald_axe")))));

    public static final Item EMERALD_SWORD = registerItem("emerald_sword",
            new Item(new Item.Settings()
                    .sword(ModToolMaterials.EMERALD, 3.0F, -2.4F)
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(QualityTools.MOD_ID,"emerald_sword")))));

    public static final Item QUARTZ_PICKAXE=registerItem("quartz_pickaxe",
            new Item(new Item.Settings()
                    .pickaxe(ModToolMaterials.QUARTZ, 1.0F, -2.8F)
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(QualityTools.MOD_ID,"quartz_pickaxe")))));

    public static final Item QUARTZ_SHOVEL=registerItem("quartz_shovel",
            new ShovelItem(ModToolMaterials.QUARTZ, 1.5F, -3.0F, new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(QualityTools.MOD_ID,"quartz_shovel")))));

    public static final Item QUARTZ_HOE = registerItem("quartz_hoe",
            new HoeItem(ModToolMaterials.QUARTZ, -3.0F, 0.0F, new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(QualityTools.MOD_ID,"quartz_hoe")))));

    public static final Item QUARTZ_AXE = registerItem("quartz_axe",
            new AxeItem(ModToolMaterials.QUARTZ, 5.0F, -3.0F, new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(QualityTools.MOD_ID,"quartz_axe")))));

    public static final Item QUARTZ_SWORD = registerItem("quartz_sword",
            new Item(new Item.Settings()
                    .sword(ModToolMaterials.QUARTZ, 3.0F, -2.4F)
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(QualityTools.MOD_ID,"quartz_sword")))));

    public static final Item RUBY_PICKAXE=registerItem("ruby_pickaxe",
            new Item(new Item.Settings()
                    .pickaxe(ModToolMaterials.RUBY, 1.0F, -2.8F)
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(QualityTools.MOD_ID,"ruby_pickaxe")))));

    public static final Item RUBY_SHOVEL=registerItem("ruby_shovel",
            new ShovelItem(ModToolMaterials.RUBY, 1.5F, -3.0F, new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(QualityTools.MOD_ID,"ruby_shovel")))));

    public static final Item RUBY_HOE = registerItem("ruby_hoe",
            new HoeItem(ModToolMaterials.RUBY, -3.0F, 0.0F, new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(QualityTools.MOD_ID,"ruby_hoe")))));

    public static final Item RUBY_AXE = registerItem("ruby_axe",
            new AxeItem(ModToolMaterials.RUBY, 5.0F, -3.0F, new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(QualityTools.MOD_ID,"ruby_axe")))));

    public static final Item RUBY_SWORD = registerItem("ruby_sword",
            new Item(new Item.Settings()
                    .sword(ModToolMaterials.RUBY, 3.0F, -2.4F)
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(QualityTools.MOD_ID,"ruby_sword")))));

    public static final Item SAPPHIRE_PICKAXE=registerItem("sapphire_pickaxe",
            new Item(new Item.Settings()
                    .pickaxe(ModToolMaterials.SAPPHIRE, 1.0F, -2.8F)
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(QualityTools.MOD_ID,"sapphire_pickaxe")))));

    public static final Item SAPPHIRE_SHOVEL=registerItem("sapphire_shovel",
            new ShovelItem(ModToolMaterials.SAPPHIRE, 1.5F, -3.0F, new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(QualityTools.MOD_ID,"sapphire_shovel")))));

    public static final Item SAPPHIRE_HOE = registerItem("sapphire_hoe",
            new HoeItem(ModToolMaterials.SAPPHIRE, -3.0F, 0.0F, new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(QualityTools.MOD_ID,"sapphire_hoe")))));

    public static final Item SAPPHIRE_AXE = registerItem("sapphire_axe",
            new AxeItem(ModToolMaterials.SAPPHIRE, 5.0F, -3.0F, new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(QualityTools.MOD_ID,"sapphire_axe")))));

    public static final Item SAPPHIRE_SWORD = registerItem("sapphire_sword",
            new Item(new Item.Settings()
                    .sword(ModToolMaterials.SAPPHIRE, 3.0F, -2.4F)
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(QualityTools.MOD_ID,"sapphire_sword")))));

    public static final Item COPPER_HELMET = registerItem("copper_helmet",
            new Item(new Item.Settings()
                    .armor(ModArmorMaterials.COPPER_ARMOR_MATERIAL, EquipmentType.HELMET)
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(QualityTools.MOD_ID,"copper_helmet")))));

    public static final Item COPPER_CHESTPLATE = registerItem("copper_chestplate",
            new Item(new Item.Settings()
                    .armor(ModArmorMaterials.COPPER_ARMOR_MATERIAL, EquipmentType.CHESTPLATE)
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(QualityTools.MOD_ID,"copper_chestplate")))));

    public static final Item COPPER_LEGGINGS = registerItem("copper_leggings",
            new Item(new Item.Settings()
                    .armor(ModArmorMaterials.COPPER_ARMOR_MATERIAL, EquipmentType.LEGGINGS)
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(QualityTools.MOD_ID,"copper_leggings")))));

    public static final Item COPPER_BOOTS= registerItem("copper_boots",
            new Item(new Item.Settings()
                    .armor(ModArmorMaterials.COPPER_ARMOR_MATERIAL, EquipmentType.BOOTS)
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(QualityTools.MOD_ID,"copper_boots")))));

    public static final Item COPPER_HORSE_ARMOR= registerItem("copper_horse_armor",
            new Item(new Item.Settings()
                    .horseArmor(ModArmorMaterials.COPPER_ARMOR_MATERIAL)
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(QualityTools.MOD_ID,"copper_horse_armor")))));

    public static final Item AMETHYST_HELMET = registerItem("amethyst_helmet",
            new Item(new Item.Settings()
                    .armor(ModArmorMaterials.AMETHYST_ARMOR_MATERIAL, EquipmentType.HELMET)
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(QualityTools.MOD_ID,"amethyst_helmet")))));

    public static final Item AMETHYST_CHESTPLATE = registerItem("amethyst_chestplate",
            new Item(new Item.Settings()
                    .armor(ModArmorMaterials.AMETHYST_ARMOR_MATERIAL, EquipmentType.CHESTPLATE)
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(QualityTools.MOD_ID,"amethyst_chestplate")))));

    public static final Item AMETHYST_LEGGINGS = registerItem("amethyst_leggings",
            new Item(new Item.Settings()
                    .armor(ModArmorMaterials.AMETHYST_ARMOR_MATERIAL, EquipmentType.LEGGINGS)
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(QualityTools.MOD_ID,"amethyst_leggings")))));

    public static final Item AMETHYST_BOOTS= registerItem("amethyst_boots",
            new Item(new Item.Settings()
                    .armor(ModArmorMaterials.AMETHYST_ARMOR_MATERIAL, EquipmentType.BOOTS)
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(QualityTools.MOD_ID,"amethyst_boots")))));

    public static final Item AMETHYST_HORSE_ARMOR= registerItem("amethyst_horse_armor",
            new Item(new Item.Settings()
                    .horseArmor(ModArmorMaterials.AMETHYST_ARMOR_MATERIAL)
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(QualityTools.MOD_ID,"amethyst_horse_armor")))));

    public static final Item QUARTZ_HELMET = registerItem("quartz_helmet",
            new Item(new Item.Settings()
                    .armor(ModArmorMaterials.QUARTZ_ARMOR_MATERIAL, EquipmentType.HELMET)
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(QualityTools.MOD_ID,"quartz_helmet")))));

    public static final Item QUARTZ_CHESTPLATE = registerItem("quartz_chestplate",
            new Item(new Item.Settings()
                    .armor(ModArmorMaterials.QUARTZ_ARMOR_MATERIAL, EquipmentType.CHESTPLATE)
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(QualityTools.MOD_ID,"quartz_chestplate")))));

    public static final Item QUARTZ_LEGGINGS = registerItem("quartz_leggings",
            new Item(new Item.Settings()
                    .armor(ModArmorMaterials.QUARTZ_ARMOR_MATERIAL, EquipmentType.LEGGINGS)
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(QualityTools.MOD_ID,"quartz_leggings")))));

    public static final Item QUARTZ_BOOTS= registerItem("quartz_boots",
            new Item(new Item.Settings()
                    .armor(ModArmorMaterials.QUARTZ_ARMOR_MATERIAL, EquipmentType.BOOTS)
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(QualityTools.MOD_ID,"quartz_boots")))));

    public static final Item QUARTZ_HORSE_ARMOR= registerItem("quartz_horse_armor",
            new Item(new Item.Settings()
                    .horseArmor(ModArmorMaterials.QUARTZ_ARMOR_MATERIAL)
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(QualityTools.MOD_ID,"quartz_horse_armor")))));

    public static final Item EMERALD_HELMET = registerItem("emerald_helmet",
            new Item(new Item.Settings()
                    .armor(ModArmorMaterials.EMERALD_ARMOR_MATERIAL, EquipmentType.HELMET)
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(QualityTools.MOD_ID,"emerald_helmet")))));

    public static final Item EMERALD_CHESTPLATE = registerItem("emerald_chestplate",
            new Item(new Item.Settings()
                    .armor(ModArmorMaterials.EMERALD_ARMOR_MATERIAL, EquipmentType.CHESTPLATE)
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(QualityTools.MOD_ID,"emerald_chestplate")))));

    public static final Item EMERALD_LEGGINGS = registerItem("emerald_leggings",
            new Item(new Item.Settings()
                    .armor(ModArmorMaterials.EMERALD_ARMOR_MATERIAL, EquipmentType.LEGGINGS)
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(QualityTools.MOD_ID,"emerald_leggings")))));

    public static final Item EMERALD_BOOTS= registerItem("emerald_boots",
            new Item(new Item.Settings()
                    .armor(ModArmorMaterials.EMERALD_ARMOR_MATERIAL, EquipmentType.BOOTS)
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(QualityTools.MOD_ID,"emerald_boots")))));

    public static final Item EMERALD_HORSE_ARMOR= registerItem("emerald_horse_armor",
            new Item(new Item.Settings()
                    .horseArmor(ModArmorMaterials.EMERALD_ARMOR_MATERIAL)
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(QualityTools.MOD_ID,"emerald_horse_armor")))));

    public static final Item RUBY_HELMET = registerItem("ruby_helmet",
            new Item(new Item.Settings()
                    .armor(ModArmorMaterials.RUBY_ARMOR_MATERIAL, EquipmentType.HELMET)
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(QualityTools.MOD_ID,"ruby_helmet")))));

    public static final Item RUBY_CHESTPLATE = registerItem("ruby_chestplate",
            new Item(new Item.Settings()
                    .armor(ModArmorMaterials.RUBY_ARMOR_MATERIAL, EquipmentType.CHESTPLATE)
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(QualityTools.MOD_ID,"ruby_chestplate")))));

    public static final Item RUBY_LEGGINGS = registerItem("ruby_leggings",
            new Item(new Item.Settings()
                    .armor(ModArmorMaterials.RUBY_ARMOR_MATERIAL, EquipmentType.LEGGINGS)
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(QualityTools.MOD_ID,"ruby_leggings")))));

    public static final Item RUBY_BOOTS= registerItem("ruby_boots",
            new Item(new Item.Settings()
                    .armor(ModArmorMaterials.RUBY_ARMOR_MATERIAL, EquipmentType.BOOTS)
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(QualityTools.MOD_ID,"ruby_boots")))));

    public static final Item RUBY_HORSE_ARMOR= registerItem("ruby_horse_armor",
            new Item(new Item.Settings()
                    .horseArmor(ModArmorMaterials.RUBY_ARMOR_MATERIAL)
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(QualityTools.MOD_ID,"ruby_horse_armor")))));

    public static final Item SAPPHIRE_HELMET = registerItem("sapphire_helmet",
            new Item(new Item.Settings()
                    .armor(ModArmorMaterials.SAPPHIRE_ARMOR_MATERIAL, EquipmentType.HELMET)
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(QualityTools.MOD_ID,"sapphire_helmet")))));

    public static final Item SAPPHIRE_CHESTPLATE = registerItem("sapphire_chestplate",
            new Item(new Item.Settings()
                    .armor(ModArmorMaterials.SAPPHIRE_ARMOR_MATERIAL, EquipmentType.CHESTPLATE)
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(QualityTools.MOD_ID,"sapphire_chestplate")))));

    public static final Item SAPPHIRE_LEGGINGS = registerItem("sapphire_leggings",
            new Item(new Item.Settings()
                    .armor(ModArmorMaterials.SAPPHIRE_ARMOR_MATERIAL, EquipmentType.LEGGINGS)
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(QualityTools.MOD_ID,"sapphire_leggings")))));

    public static final Item SAPPHIRE_BOOTS= registerItem("sapphire_boots",
            new Item(new Item.Settings()
                    .armor(ModArmorMaterials.SAPPHIRE_ARMOR_MATERIAL, EquipmentType.BOOTS)
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(QualityTools.MOD_ID,"sapphire_boots")))));

    public static final Item SAPPHIRE_HORSE_ARMOR= registerItem("sapphire_horse_armor",
            new Item(new Item.Settings()
                    .horseArmor(ModArmorMaterials.SAPPHIRE_ARMOR_MATERIAL)
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(QualityTools.MOD_ID,"sapphire_horse_armor")))));

    public static final BackpackItem BACKPACK = registerBackpackItem("backpack", ModBlocks.BACKPACK);


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(QualityTools.MOD_ID, name), item);
    }
    public static BackpackItem registerBackpackItem(String name, Block block) {
        return Registry.register(Registries.ITEM, Identifier.of(QualityTools.MOD_ID, name),
                new BackpackItem(block, new Item.Settings()
                        .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(QualityTools.MOD_ID,"backpack")))));
    }


    public static void registerModItems() {
        QualityTools.LOGGER.info("Registering Mod Items for " + QualityTools.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(RUBY);
            entries.add(SAPPHIRE);
        });
    }
    
}
