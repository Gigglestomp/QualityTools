package net.dungeondesk.qualitytools.item;

import net.dungeondesk.qualitytools.QualityTools;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {

    public static final ItemGroup QUALITY_TOOLS_ITEM_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(QualityTools.MOD_ID, "quality_tools_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.IRON_HAMMER))
                    .displayName(Text.translatable("itemgroup.qualitytools.quality_tools_items"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.WOOD_HAMMER);
                        entries.add(ModItems.GOLD_HAMMER);
                        entries.add(ModItems.COPPER_HAMMER);
                        entries.add(ModItems.IRON_HAMMER);
                        entries.add(ModItems.QUARTZ_HAMMER);
                        entries.add(ModItems.EMERALD_HAMMER);
                        entries.add(ModItems.AMETHYST_HAMMER);
                        entries.add(ModItems.DIAMOND_HAMMER);
                        entries.add(ModItems.NETHERITE_HAMMER);
                        entries.add(ModItems.WOOD_EXCAVATOR);
                        entries.add(ModItems.GOLD_EXCAVATOR);
                        entries.add(ModItems.COPPER_EXCAVATOR);
                        entries.add(ModItems.IRON_EXCAVATOR);
                        entries.add(ModItems.QUARTZ_EXCAVATOR);
                        entries.add(ModItems.EMERALD_EXCAVATOR);
                        entries.add(ModItems.AMETHYST_EXCAVATOR);
                        entries.add(ModItems.DIAMOND_EXCAVATOR);
                        entries.add(ModItems.NETHERITE_EXCAVATOR);
                    }).build());

    public static final ItemGroup QUALITY_TOOLS_BLOCKS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(QualityTools.MOD_ID, "quality_tools_blocks"),
            FabricItemGroup.builder().icon(() -> new ItemStack(Items.IRON_BLOCK))
                    .displayName(Text.translatable("itemgroup.qualitytools.quality_tools_blocks"))
                    .entries((displayContext, entries) -> {
                    }).build());


    public static void registerItemGroups() {
        QualityTools.LOGGER.info("Registering Item Groups for " + QualityTools.MOD_ID);
    }
}
