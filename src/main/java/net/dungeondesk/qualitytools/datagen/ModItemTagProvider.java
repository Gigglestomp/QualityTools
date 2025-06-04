package net.dungeondesk.qualitytools.datagen;

import net.dungeondesk.qualitytools.item.ModItems;
import net.dungeondesk.qualitytools.util.ModTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.item.Items;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {

        getOrCreateTagBuilder(ModTags.Items.COPPER_TOOL_MATERIALS)
                .add(Items.COPPER_INGOT);

        getOrCreateTagBuilder(ModTags.Items.QUARTZ_TOOL_MATERIALS)
                .add(Items.QUARTZ);

        getOrCreateTagBuilder(ModTags.Items.EMERALD_TOOL_MATERIALS)
                .add(Items.EMERALD);

        getOrCreateTagBuilder(ModTags.Items.AMETHYST_TOOL_MATERIALS)
                .add(Items.AMETHYST_SHARD);

        getOrCreateTagBuilder(ModTags.Items.RUBY_TOOL_MATERIALS)
                .add(ModItems.RUBY);

        getOrCreateTagBuilder(ModTags.Items.SAPPHIRE_TOOL_MATERIALS)
                .add(ModItems.SAPPHIRE);

        getOrCreateTagBuilder(ItemTags.PIGLIN_LOVED)
                .add(ModItems.GOLD_EXCAVATOR)
                .add(ModItems.GOLD_HAMMER);

        getOrCreateTagBuilder(ItemTags.BREAKS_DECORATED_POTS)
                .addTag(ModTags.Items.HAMMERS)
                .addTag(ModTags.Items.EXCAVATORS);

        getOrCreateTagBuilder(ItemTags.MINING_ENCHANTABLE)
                .addTag(ModTags.Items.HAMMERS)
                .addTag(ModTags.Items.EXCAVATORS);

        getOrCreateTagBuilder(ItemTags.MINING_LOOT_ENCHANTABLE)
                .addTag(ModTags.Items.HAMMERS)
                .addTag(ModTags.Items.EXCAVATORS);

        getOrCreateTagBuilder(ItemTags.DURABILITY_ENCHANTABLE)
                .addTag(ModTags.Items.HAMMERS)
                .addTag(ModTags.Items.EXCAVATORS);
        
        getOrCreateTagBuilder(ModTags.Items.HAMMERS)
                .add(ModItems.WOOD_HAMMER)
                .add(ModItems.STONE_HAMMER)
                .add(ModItems.GOLD_HAMMER)
                .add(ModItems.COPPER_HAMMER)
                .add(ModItems.IRON_HAMMER)
                .add(ModItems.QUARTZ_HAMMER)
                .add(ModItems.EMERALD_HAMMER)
                .add(ModItems.AMETHYST_HAMMER)
                .add(ModItems.RUBY_HAMMER)
                .add(ModItems.SAPPHIRE_HAMMER)
                .add(ModItems.DIAMOND_HAMMER)
                .add(ModItems.NETHERITE_HAMMER);
                
        getOrCreateTagBuilder(ModTags.Items.EXCAVATORS)
                .add(ModItems.WOOD_EXCAVATOR)
                .add(ModItems.STONE_EXCAVATOR)
                .add(ModItems.GOLD_EXCAVATOR)
                .add(ModItems.COPPER_EXCAVATOR)
                .add(ModItems.IRON_EXCAVATOR)
                .add(ModItems.QUARTZ_EXCAVATOR)
                .add(ModItems.EMERALD_EXCAVATOR)
                .add(ModItems.AMETHYST_EXCAVATOR)
                .add(ModItems.RUBY_EXCAVATOR)
                .add(ModItems.SAPPHIRE_EXCAVATOR)
                .add(ModItems.DIAMOND_EXCAVATOR)
                .add(ModItems.NETHERITE_EXCAVATOR);

        getOrCreateTagBuilder(ModTags.Items.RUBY_REPAIR)
                .add(ModItems.RUBY);

        getOrCreateTagBuilder(ModTags.Items.SAPPHIRE_REPAIR)
                .add(ModItems.SAPPHIRE);

        getOrCreateTagBuilder(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.COPPER_HELMET)
                .add(ModItems.COPPER_CHESTPLATE)
                .add(ModItems.COPPER_LEGGINGS)
                .add(ModItems.COPPER_BOOTS)
                .add(ModItems.AMETHYST_HELMET)
                .add(ModItems.AMETHYST_CHESTPLATE)
                .add(ModItems.AMETHYST_LEGGINGS)
                .add(ModItems.AMETHYST_BOOTS)
                .add(ModItems.EMERALD_HELMET)
                .add(ModItems.EMERALD_CHESTPLATE)
                .add(ModItems.EMERALD_LEGGINGS)
                .add(ModItems.EMERALD_BOOTS)
                .add(ModItems.QUARTZ_HELMET)
                .add(ModItems.QUARTZ_CHESTPLATE)
                .add(ModItems.QUARTZ_LEGGINGS)
                .add(ModItems.QUARTZ_BOOTS)
                .add(ModItems.RUBY_HELMET)
                .add(ModItems.RUBY_CHESTPLATE)
                .add(ModItems.RUBY_LEGGINGS)
                .add(ModItems.RUBY_BOOTS)
                .add(ModItems.SAPPHIRE_HELMET)
                .add(ModItems.SAPPHIRE_CHESTPLATE)
                .add(ModItems.SAPPHIRE_LEGGINGS)
                .add(ModItems.SAPPHIRE_BOOTS);

        getOrCreateTagBuilder(ItemTags.ARMOR_ENCHANTABLE)
                .add(ModItems.COPPER_HELMET)
                .add(ModItems.COPPER_CHESTPLATE)
                .add(ModItems.COPPER_LEGGINGS)
                .add(ModItems.COPPER_BOOTS)
                .add(ModItems.AMETHYST_HELMET)
                .add(ModItems.AMETHYST_CHESTPLATE)
                .add(ModItems.AMETHYST_LEGGINGS)
                .add(ModItems.AMETHYST_BOOTS)
                .add(ModItems.EMERALD_HELMET)
                .add(ModItems.EMERALD_CHESTPLATE)
                .add(ModItems.EMERALD_LEGGINGS)
                .add(ModItems.EMERALD_BOOTS)
                .add(ModItems.QUARTZ_HELMET)
                .add(ModItems.QUARTZ_CHESTPLATE)
                .add(ModItems.QUARTZ_LEGGINGS)
                .add(ModItems.QUARTZ_BOOTS)
                .add(ModItems.RUBY_HELMET)
                .add(ModItems.RUBY_CHESTPLATE)
                .add(ModItems.RUBY_LEGGINGS)
                .add(ModItems.RUBY_BOOTS)
                .add(ModItems.SAPPHIRE_HELMET)
                .add(ModItems.SAPPHIRE_CHESTPLATE)
                .add(ModItems.SAPPHIRE_LEGGINGS)
                .add(ModItems.SAPPHIRE_BOOTS);

        getOrCreateTagBuilder(ItemTags.DURABILITY_ENCHANTABLE)
                .add(ModItems.COPPER_HELMET)
                .add(ModItems.COPPER_CHESTPLATE)
                .add(ModItems.COPPER_LEGGINGS)
                .add(ModItems.COPPER_BOOTS)
                .add(ModItems.AMETHYST_HELMET)
                .add(ModItems.AMETHYST_CHESTPLATE)
                .add(ModItems.AMETHYST_LEGGINGS)
                .add(ModItems.AMETHYST_BOOTS)
                .add(ModItems.EMERALD_HELMET)
                .add(ModItems.EMERALD_CHESTPLATE)
                .add(ModItems.EMERALD_LEGGINGS)
                .add(ModItems.EMERALD_BOOTS)
                .add(ModItems.QUARTZ_HELMET)
                .add(ModItems.QUARTZ_CHESTPLATE)
                .add(ModItems.QUARTZ_LEGGINGS)
                .add(ModItems.QUARTZ_BOOTS)
                .add(ModItems.RUBY_HELMET)
                .add(ModItems.RUBY_CHESTPLATE)
                .add(ModItems.RUBY_LEGGINGS)
                .add(ModItems.RUBY_BOOTS)
                .add(ModItems.SAPPHIRE_HELMET)
                .add(ModItems.SAPPHIRE_CHESTPLATE)
                .add(ModItems.SAPPHIRE_LEGGINGS)
                .add(ModItems.SAPPHIRE_BOOTS);

        getOrCreateTagBuilder(ItemTags.EQUIPPABLE_ENCHANTABLE)
                .add(ModItems.COPPER_HELMET)
                .add(ModItems.COPPER_CHESTPLATE)
                .add(ModItems.COPPER_LEGGINGS)
                .add(ModItems.COPPER_BOOTS)
                .add(ModItems.AMETHYST_HELMET)
                .add(ModItems.AMETHYST_CHESTPLATE)
                .add(ModItems.AMETHYST_LEGGINGS)
                .add(ModItems.AMETHYST_BOOTS)
                .add(ModItems.EMERALD_HELMET)
                .add(ModItems.EMERALD_CHESTPLATE)
                .add(ModItems.EMERALD_LEGGINGS)
                .add(ModItems.EMERALD_BOOTS)
                .add(ModItems.QUARTZ_HELMET)
                .add(ModItems.QUARTZ_CHESTPLATE)
                .add(ModItems.QUARTZ_LEGGINGS)
                .add(ModItems.QUARTZ_BOOTS)
                .add(ModItems.RUBY_HELMET)
                .add(ModItems.RUBY_CHESTPLATE)
                .add(ModItems.RUBY_LEGGINGS)
                .add(ModItems.RUBY_BOOTS)
                .add(ModItems.SAPPHIRE_HELMET)
                .add(ModItems.SAPPHIRE_CHESTPLATE)
                .add(ModItems.SAPPHIRE_LEGGINGS)
                .add(ModItems.SAPPHIRE_BOOTS);

        getOrCreateTagBuilder(ItemTags.CHEST_ARMOR_ENCHANTABLE)
                .add(ModItems.COPPER_CHESTPLATE)
                .add(ModItems.AMETHYST_CHESTPLATE)
                .add(ModItems.EMERALD_CHESTPLATE)
                .add(ModItems.QUARTZ_CHESTPLATE)
                .add(ModItems.RUBY_CHESTPLATE)
                .add(ModItems.SAPPHIRE_CHESTPLATE);

        getOrCreateTagBuilder(ItemTags.LEG_ARMOR_ENCHANTABLE)
                .add(ModItems.COPPER_LEGGINGS)
                .add(ModItems.AMETHYST_LEGGINGS)
                .add(ModItems.EMERALD_LEGGINGS)
                .add(ModItems.QUARTZ_LEGGINGS)
                .add(ModItems.RUBY_LEGGINGS)
                .add(ModItems.SAPPHIRE_LEGGINGS);

        getOrCreateTagBuilder(ItemTags.FOOT_ARMOR_ENCHANTABLE)
                .add(ModItems.COPPER_BOOTS)
                .add(ModItems.AMETHYST_BOOTS)
                .add(ModItems.EMERALD_BOOTS)
                .add(ModItems.QUARTZ_BOOTS)
                .add(ModItems.RUBY_BOOTS)
                .add(ModItems.SAPPHIRE_BOOTS);

        getOrCreateTagBuilder(ItemTags.HEAD_ARMOR_ENCHANTABLE)
                .add(ModItems.COPPER_HELMET)
                .add(ModItems.AMETHYST_HELMET)
                .add(ModItems.EMERALD_HELMET)
                .add(ModItems.QUARTZ_HELMET)
                .add(ModItems.RUBY_HELMET)
                .add(ModItems.SAPPHIRE_HELMET);

    }
}
