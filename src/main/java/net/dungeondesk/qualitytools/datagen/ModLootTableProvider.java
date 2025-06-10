package net.dungeondesk.qualitytools.datagen;

import net.dungeondesk.qualitytools.block.ModBlocks;
import net.dungeondesk.qualitytools.block.custom.BackpackBlock;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.function.CopyComponentsLootFunction;
import net.minecraft.loot.function.CopyNbtLootFunction;
import net.minecraft.loot.provider.nbt.LootNbtProvider;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.BACKPACK, this::backpackDrops);
    }

    private LootTable.Builder backpackDrops(Block drop) {
        return LootTable.builder().pool(addSurvivesExplosionCondition(drop, LootPool.builder().rolls(ConstantLootNumberProvider.create(1.0f))
                .with(ItemEntry.builder(drop)
                        .apply(CopyComponentsLootFunction.builder(CopyComponentsLootFunction.Source.BLOCK_ENTITY)))));
    }
}

