package net.dungeondesk.qualitytools.block;

import net.dungeondesk.qualitytools.QualityTools;
import net.dungeondesk.qualitytools.block.custom.BackpackBlock;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

public class ModBlocks {

    public static final Block BACKPACK = registerBlock("backpack",
            new BackpackBlock(
                    AbstractBlock.Settings.create()
                            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(QualityTools.MOD_ID, "backpack")))
                            .nonOpaque()));

    private static Block registerBlockWithoutBlockItem(String name, Block block) {
        return Registry.register(Registries.BLOCK, Identifier.of(QualityTools.MOD_ID, name), block);
    }

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(QualityTools.MOD_ID, name), block);
    }

    public static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(QualityTools.MOD_ID, name),
                new BlockItem(block, new Item.Settings()
                        .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(QualityTools.MOD_ID, name))).useBlockPrefixedTranslationKey()));
    }

    public static void registerModBlocks() {
        QualityTools.LOGGER.info("Registering Mod Blocks for " + QualityTools.MOD_ID);
    }
}
