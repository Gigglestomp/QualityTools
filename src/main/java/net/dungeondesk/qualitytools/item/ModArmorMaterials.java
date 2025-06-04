package net.dungeondesk.qualitytools.item;

import net.dungeondesk.qualitytools.QualityTools;
import net.dungeondesk.qualitytools.util.ModTags;
import net.minecraft.item.equipment.ArmorMaterial;
import net.minecraft.item.equipment.EquipmentAsset;
import net.minecraft.item.equipment.EquipmentType;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;

import java.util.EnumMap;

public class ModArmorMaterials {

    static RegistryKey<? extends Registry<EquipmentAsset>> REGISTRY_KEY = RegistryKey.ofRegistry(Identifier.ofVanilla("equipment_asset"));
    public static final RegistryKey<EquipmentAsset> COPPER_KEY = RegistryKey.of(REGISTRY_KEY, Identifier.of(QualityTools.MOD_ID, "copper"));
    public static final RegistryKey<EquipmentAsset> AMETHYST_KEY = RegistryKey.of(REGISTRY_KEY, Identifier.of(QualityTools.MOD_ID, "amethyst"));
    public static final RegistryKey<EquipmentAsset> EMERALD_KEY = RegistryKey.of(REGISTRY_KEY, Identifier.of(QualityTools.MOD_ID, "emerald"));
    public static final RegistryKey<EquipmentAsset> QUARTZ_KEY = RegistryKey.of(REGISTRY_KEY, Identifier.of(QualityTools.MOD_ID, "quartz"));
    public static final RegistryKey<EquipmentAsset> RUBY_KEY = RegistryKey.of(REGISTRY_KEY, Identifier.of(QualityTools.MOD_ID, "ruby"));
    public static final RegistryKey<EquipmentAsset> SAPPHIRE_KEY = RegistryKey.of(REGISTRY_KEY, Identifier.of(QualityTools.MOD_ID, "sapphire"));

    public static final ArmorMaterial COPPER_ARMOR_MATERIAL = new ArmorMaterial(15, Util.make(new EnumMap<>(EquipmentType.class), map -> {
        map.put(EquipmentType.BOOTS, 2);
        map.put(EquipmentType.LEGGINGS, 5);
        map.put(EquipmentType.CHESTPLATE, 6);
        map.put(EquipmentType.HELMET, 2);
        map.put(EquipmentType.BODY, 5);
    }), 9, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0, 0, ModTags.Items.COPPER_REPAIR, COPPER_KEY);

    public static final ArmorMaterial AMETHYST_ARMOR_MATERIAL = new ArmorMaterial(33, Util.make(new EnumMap<>(EquipmentType.class), map -> {
        map.put(EquipmentType.BOOTS, 3);
        map.put(EquipmentType.LEGGINGS, 6);
        map.put(EquipmentType.CHESTPLATE, 8);
        map.put(EquipmentType.HELMET, 3);
        map.put(EquipmentType.BODY, 11);
    }), 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.0F, 0, ModTags.Items.AMETHYST_REPAIR, AMETHYST_KEY);

    public static final ArmorMaterial EMERALD_ARMOR_MATERIAL = new ArmorMaterial(33, Util.make(new EnumMap<>(EquipmentType.class), map -> {
        map.put(EquipmentType.BOOTS, 3);
        map.put(EquipmentType.LEGGINGS, 6);
        map.put(EquipmentType.CHESTPLATE, 8);
        map.put(EquipmentType.HELMET, 3);
        map.put(EquipmentType.BODY, 11);
    }), 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.0F, 0, ModTags.Items.EMERALD_REPAIR, EMERALD_KEY);

    public static final ArmorMaterial QUARTZ_ARMOR_MATERIAL = new ArmorMaterial(33, Util.make(new EnumMap<>(EquipmentType.class), map -> {
        map.put(EquipmentType.BOOTS, 3);
        map.put(EquipmentType.LEGGINGS, 6);
        map.put(EquipmentType.CHESTPLATE, 8);
        map.put(EquipmentType.HELMET, 3);
        map.put(EquipmentType.BODY, 11);
    }), 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.0F, 0, ModTags.Items.QUARTZ_REPAIR, QUARTZ_KEY);

    public static final ArmorMaterial RUBY_ARMOR_MATERIAL = new ArmorMaterial(33, Util.make(new EnumMap<>(EquipmentType.class), map -> {
        map.put(EquipmentType.BOOTS, 3);
        map.put(EquipmentType.LEGGINGS, 6);
        map.put(EquipmentType.CHESTPLATE, 8);
        map.put(EquipmentType.HELMET, 3);
        map.put(EquipmentType.BODY, 11);
    }), 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.0F, 0, ModTags.Items.RUBY_REPAIR, RUBY_KEY);

    public static final ArmorMaterial SAPPHIRE_ARMOR_MATERIAL = new ArmorMaterial(33, Util.make(new EnumMap<>(EquipmentType.class), map -> {
        map.put(EquipmentType.BOOTS, 3);
        map.put(EquipmentType.LEGGINGS, 6);
        map.put(EquipmentType.CHESTPLATE, 8);
        map.put(EquipmentType.HELMET, 3);
        map.put(EquipmentType.BODY, 11);
    }), 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.0F, 0, ModTags.Items.SAPPHIRE_REPAIR, SAPPHIRE_KEY);

}
