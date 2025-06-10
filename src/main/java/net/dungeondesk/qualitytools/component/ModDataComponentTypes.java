package net.dungeondesk.qualitytools.component;

import net.dungeondesk.qualitytools.QualityTools;
import net.minecraft.component.ComponentType;
import net.minecraft.component.type.NbtComponent;
import net.minecraft.inventory.Inventory;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;

import java.util.function.UnaryOperator;

public class ModDataComponentTypes {

    public static final ComponentType<NbtComponent> INVENTORY =
            register("inventory", builder -> builder.codec(NbtComponent.CODEC));

    private static <T>ComponentType<T> register(String name, UnaryOperator<ComponentType.Builder<T>> builderOperator) {
        return Registry.register(Registries.DATA_COMPONENT_TYPE, Identifier.of(QualityTools.MOD_ID, name),
                builderOperator.apply(ComponentType.builder()).build());
    }

    public static void registerDataComponentTypes() {
        QualityTools.LOGGER.info("Registering Data Component Types for " + QualityTools.MOD_ID);
    }
}

