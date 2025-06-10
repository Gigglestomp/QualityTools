package net.dungeondesk.qualitytools.item;

import net.dungeondesk.qualitytools.QualityTools;
import net.dungeondesk.qualitytools.block.ModBlocks;
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
                        entries.add(ModItems.RUBY);
                        entries.add(ModItems.SAPPHIRE);
                        entries.add(ModItems.WOOD_HAMMER);
                        entries.add(ModItems.STONE_HAMMER);
                        entries.add(ModItems.GOLD_HAMMER);
                        entries.add(ModItems.COPPER_HAMMER);
                        entries.add(ModItems.IRON_HAMMER);
                        entries.add(ModItems.QUARTZ_HAMMER);
                        entries.add(ModItems.EMERALD_HAMMER);
                        entries.add(ModItems.AMETHYST_HAMMER);
                        entries.add(ModItems.RUBY_HAMMER);
                        entries.add(ModItems.SAPPHIRE_HAMMER);
                        entries.add(ModItems.DIAMOND_HAMMER);
                        entries.add(ModItems.NETHERITE_HAMMER);
                        entries.add(ModItems.WOOD_EXCAVATOR);
                        entries.add(ModItems.STONE_EXCAVATOR);
                        entries.add(ModItems.GOLD_EXCAVATOR);
                        entries.add(ModItems.COPPER_EXCAVATOR);
                        entries.add(ModItems.IRON_EXCAVATOR);
                        entries.add(ModItems.QUARTZ_EXCAVATOR);
                        entries.add(ModItems.EMERALD_EXCAVATOR);
                        entries.add(ModItems.AMETHYST_EXCAVATOR);
                        entries.add(ModItems.RUBY_EXCAVATOR);
                        entries.add(ModItems.SAPPHIRE_EXCAVATOR);
                        entries.add(ModItems.DIAMOND_EXCAVATOR);
                        entries.add(ModItems.NETHERITE_EXCAVATOR);

                        entries.add(ModItems.COPPER_PICKAXE);
                        entries.add(ModItems.COPPER_SHOVEL);
                        entries.add(ModItems.COPPER_HOE);
                        entries.add(ModItems.COPPER_AXE);
                        entries.add(ModItems.COPPER_SWORD);

                        entries.add(ModItems.AMETHYST_PICKAXE);
                        entries.add(ModItems.AMETHYST_SHOVEL);
                        entries.add(ModItems.AMETHYST_HOE);
                        entries.add(ModItems.AMETHYST_AXE);
                        entries.add(ModItems.AMETHYST_SWORD);

                        entries.add(ModItems.EMERALD_PICKAXE);
                        entries.add(ModItems.EMERALD_SHOVEL);
                        entries.add(ModItems.EMERALD_HOE);
                        entries.add(ModItems.EMERALD_AXE);
                        entries.add(ModItems.EMERALD_SWORD);

                        entries.add(ModItems.QUARTZ_PICKAXE);
                        entries.add(ModItems.QUARTZ_SHOVEL);
                        entries.add(ModItems.QUARTZ_HOE);
                        entries.add(ModItems.QUARTZ_AXE);
                        entries.add(ModItems.QUARTZ_SWORD);

                        entries.add(ModItems.RUBY_PICKAXE);
                        entries.add(ModItems.RUBY_SHOVEL);
                        entries.add(ModItems.RUBY_HOE);
                        entries.add(ModItems.RUBY_AXE);
                        entries.add(ModItems.RUBY_SWORD);

                        entries.add(ModItems.SAPPHIRE_PICKAXE);
                        entries.add(ModItems.SAPPHIRE_SHOVEL);
                        entries.add(ModItems.SAPPHIRE_HOE);
                        entries.add(ModItems.SAPPHIRE_AXE);
                        entries.add(ModItems.SAPPHIRE_SWORD);

                        entries.add(ModItems.COPPER_HELMET);
                        entries.add(ModItems.COPPER_CHESTPLATE);
                        entries.add(ModItems.COPPER_LEGGINGS);
                        entries.add(ModItems.COPPER_BOOTS);

                        entries.add(ModItems.AMETHYST_HELMET);
                        entries.add(ModItems.AMETHYST_CHESTPLATE);
                        entries.add(ModItems.AMETHYST_LEGGINGS);
                        entries.add(ModItems.AMETHYST_BOOTS);

                        entries.add(ModItems.EMERALD_HELMET);
                        entries.add(ModItems.EMERALD_CHESTPLATE);
                        entries.add(ModItems.EMERALD_LEGGINGS);
                        entries.add(ModItems.EMERALD_BOOTS);

                        entries.add(ModItems.QUARTZ_HELMET);
                        entries.add(ModItems.QUARTZ_CHESTPLATE);
                        entries.add(ModItems.QUARTZ_LEGGINGS);
                        entries.add(ModItems.QUARTZ_BOOTS);

                        entries.add(ModItems.RUBY_HELMET);
                        entries.add(ModItems.RUBY_CHESTPLATE);
                        entries.add(ModItems.RUBY_LEGGINGS);
                        entries.add(ModItems.RUBY_BOOTS);

                        entries.add(ModItems.SAPPHIRE_HELMET);
                        entries.add(ModItems.SAPPHIRE_CHESTPLATE);
                        entries.add(ModItems.SAPPHIRE_LEGGINGS);
                        entries.add(ModItems.SAPPHIRE_BOOTS);

                        entries.add(ModItems.COPPER_HORSE_ARMOR);
                        entries.add(ModItems.AMETHYST_HORSE_ARMOR);
                        entries.add(ModItems.EMERALD_HORSE_ARMOR);
                        entries.add(ModItems.QUARTZ_HORSE_ARMOR);
                        entries.add(ModItems.RUBY_HORSE_ARMOR);
                        entries.add(ModItems.SAPPHIRE_HORSE_ARMOR);
                        //entries.add(ModItems.BACKPACK);

                    }).build());

    public static final ItemGroup QUALITY_TOOLS_BLOCKS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(QualityTools.MOD_ID, "quality_tools_blocks"),
            FabricItemGroup.builder().icon(() -> new ItemStack(Items.IRON_BLOCK))
                    .displayName(Text.translatable("itemgroup.qualitytools.quality_tools_blocks"))
                    .entries((displayContext, entries) -> {

                        entries.add(ModBlocks.BACKPACK);

                    }).build());


    public static void registerItemGroups() {
        QualityTools.LOGGER.info("Registering Item Groups for " + QualityTools.MOD_ID);
    }
}
