package net.dungeondesk.qualitytools.datagen;

import net.dungeondesk.qualitytools.item.ModItems;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.client.data.BlockStateModelGenerator;
import net.minecraft.client.data.ItemModelGenerator;
import net.minecraft.client.data.Models;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

        itemModelGenerator.register(ModItems.WOOD_HAMMER, Models.HANDHELD);
        itemModelGenerator.register(ModItems.GOLD_HAMMER, Models.HANDHELD);
        itemModelGenerator.register(ModItems.COPPER_HAMMER, Models.HANDHELD);
        itemModelGenerator.register(ModItems.IRON_HAMMER, Models.HANDHELD);
        itemModelGenerator.register(ModItems.DIAMOND_HAMMER, Models.HANDHELD);
        itemModelGenerator.register(ModItems.QUARTZ_HAMMER, Models.HANDHELD);
        itemModelGenerator.register(ModItems.EMERALD_HAMMER, Models.HANDHELD);
        itemModelGenerator.register(ModItems.AMETHYST_HAMMER, Models.HANDHELD);
        itemModelGenerator.register(ModItems.NETHERITE_HAMMER, Models.HANDHELD);

        itemModelGenerator.register(ModItems.WOOD_EXCAVATOR, Models.HANDHELD);
        itemModelGenerator.register(ModItems.GOLD_EXCAVATOR, Models.HANDHELD);
        itemModelGenerator.register(ModItems.COPPER_EXCAVATOR, Models.HANDHELD);
        itemModelGenerator.register(ModItems.IRON_EXCAVATOR, Models.HANDHELD);
        itemModelGenerator.register(ModItems.DIAMOND_EXCAVATOR, Models.HANDHELD);
        itemModelGenerator.register(ModItems.QUARTZ_EXCAVATOR, Models.HANDHELD);
        itemModelGenerator.register(ModItems.EMERALD_EXCAVATOR, Models.HANDHELD);
        itemModelGenerator.register(ModItems.AMETHYST_EXCAVATOR, Models.HANDHELD);
        itemModelGenerator.register(ModItems.NETHERITE_EXCAVATOR, Models.HANDHELD);
    }
}
