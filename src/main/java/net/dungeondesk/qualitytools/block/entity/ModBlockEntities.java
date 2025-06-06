package net.dungeondesk.qualitytools.block.entity;

import net.dungeondesk.qualitytools.QualityTools;
import net.dungeondesk.qualitytools.block.ModBlocks;
import net.dungeondesk.qualitytools.block.entity.custom.BackpackBlockEntity;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlockEntities {
    public static final BlockEntityType<BackpackBlockEntity> BACKPACK_BE =
            Registry.register(Registries.BLOCK_ENTITY_TYPE, Identifier.of(QualityTools.MOD_ID, "backpack_be"),
                    FabricBlockEntityTypeBuilder.create(BackpackBlockEntity::new, ModBlocks.BACKPACK).build(null));


    public static void registerBlockEntities() {
        QualityTools.LOGGER.info("Registering Block Entities for " + QualityTools.MOD_ID);
    }
}