package net.dungeondesk.qualitytools.util;

import net.dungeondesk.qualitytools.QualityTools;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModTags {

    public static class Blocks {
        public static final TagKey<Block> NEEDS_COPPER_TOOL = createTag("needs_copper_tool");
        public static final TagKey<Block> INCORRECT_FOR_COPPER_TOOL = createTag("incorrect_for_copper_tool");
        public static final TagKey<Block> NEEDS_QUARTZ_TOOL = createTag("needs_quartz_tool");
        public static final TagKey<Block> INCORRECT_FOR_QUARTZ_TOOL = createTag("incorrect_for_quartz_tool");
        public static final TagKey<Block> NEEDS_EMERALD_TOOL = createTag("needs_emerald_tool");
        public static final TagKey<Block> INCORRECT_FOR_EMERALD_TOOL = createTag("incorrect_for_emerald_tool");
        public static final TagKey<Block> NEEDS_AMETHYST_TOOL = createTag("needs_amethyst_tool");
        public static final TagKey<Block> INCORRECT_FOR_AMETHYST_TOOL = createTag("incorrect_for_amethyst_tool");
        public static final TagKey<Block> NEEDS_RUBY_TOOL = createTag("needs_ruby_tool");
        public static final TagKey<Block> INCORRECT_FOR_RUBY_TOOL = createTag("incorrect_for_ruby_tool");
        public static final TagKey<Block> NEEDS_SAPPHIRE_TOOL = createTag("needs_sapphire_tool");
        public static final TagKey<Block> INCORRECT_FOR_SAPPHIRE_TOOL = createTag("incorrect_for_sapphire_tool");

        public static TagKey<Block> createTag(String name) {
            return TagKey.of(RegistryKeys.BLOCK, Identifier.of(QualityTools.MOD_ID, name));
        }
    }

    public static class Items {
        public static final TagKey<Item> HAMMERS = createTag("hammers");
        public static final TagKey<Item> EXCAVATORS = createTag("excavators");

        public static final TagKey<Item> COPPER_TOOL_MATERIALS = createTag("copper_tool_materials");
        public static final TagKey<Item> QUARTZ_TOOL_MATERIALS = createTag("quartz_tool_materials");
        public static final TagKey<Item> EMERALD_TOOL_MATERIALS = createTag("emerald_tool_materials");
        public static final TagKey<Item> AMETHYST_TOOL_MATERIALS = createTag("amethyst_tool_materials");
        public static final TagKey<Item> RUBY_TOOL_MATERIALS = createTag("ruby_tool_materials");
        public static final TagKey<Item> SAPPHIRE_TOOL_MATERIALS = createTag("sapphire_tool_materials");

        public static final TagKey<Item> COPPER_REPAIR = createTag("copper_repair");
        public static final TagKey<Item> QUARTZ_REPAIR = createTag("quartz_repair");
        public static final TagKey<Item> EMERALD_REPAIR = createTag("emerald_repair");
        public static final TagKey<Item> AMETHYST_REPAIR = createTag("amethyst_repair");
        public static final TagKey<Item> RUBY_REPAIR = createTag("ruby_repair");
        public static final TagKey<Item> SAPPHIRE_REPAIR = createTag("sapphire_repair");

        public static TagKey<Item> createTag(String name) {
            return TagKey.of(RegistryKeys.ITEM, Identifier.of(QualityTools.MOD_ID, name));
        }
    }
}