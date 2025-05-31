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
                .add(ModItems.GOLD_HAMMER)
                .add(ModItems.COPPER_HAMMER)
                .add(ModItems.IRON_HAMMER)
                .add(ModItems.QUARTZ_HAMMER)
                .add(ModItems.EMERALD_HAMMER)
                .add(ModItems.AMETHYST_HAMMER)
                .add(ModItems.DIAMOND_HAMMER)
                .add(ModItems.NETHERITE_HAMMER);
                
        getOrCreateTagBuilder(ModTags.Items.EXCAVATORS)
                .add(ModItems.WOOD_EXCAVATOR)
                .add(ModItems.GOLD_EXCAVATOR)
                .add(ModItems.COPPER_EXCAVATOR)
                .add(ModItems.IRON_EXCAVATOR)
                .add(ModItems.QUARTZ_EXCAVATOR)
                .add(ModItems.EMERALD_EXCAVATOR)
                .add(ModItems.AMETHYST_EXCAVATOR)
                .add(ModItems.DIAMOND_EXCAVATOR)
                .add(ModItems.NETHERITE_EXCAVATOR);
    }
}
