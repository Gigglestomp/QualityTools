package net.dungeondesk.qualitytools.item;

import net.dungeondesk.qualitytools.QualityTools;
import net.dungeondesk.qualitytools.item.custom.ExcavatorItem;
import net.dungeondesk.qualitytools.item.custom.HammerItem;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.ToolMaterial;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item WOOD_HAMMER=registerItem("wood_hammer",
            new HammerItem(new Item.Settings()
                    .pickaxe(ToolMaterial.WOOD, 7.0f, -3.4f)
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(QualityTools.MOD_ID,"wood_hammer")))));

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

    public static final Item DIAMOND_EXCAVATOR=registerItem("diamond_excavator",
            new ExcavatorItem(new Item.Settings()
                    .shovel(ToolMaterial.DIAMOND, 7.0f, -3.4f)
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(QualityTools.MOD_ID,"diamond_excavator")))));

    public static final Item NETHERITE_EXCAVATOR=registerItem("netherite_excavator",
            new ExcavatorItem(new Item.Settings()
                    .shovel(ToolMaterial.NETHERITE, 7.0f, -3.4f)
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(QualityTools.MOD_ID,"netherite_excavator")))));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(QualityTools.MOD_ID, name), item);
    }

    public static void registerModItems() {
        QualityTools.LOGGER.info("Registering Mod Items for " + QualityTools.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            //entries.add(RUBY);
            //entries.add(SAPPHIRE);
        });
    }
    
}
