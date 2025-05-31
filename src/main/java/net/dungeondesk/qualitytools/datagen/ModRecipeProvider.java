package net.dungeondesk.qualitytools.datagen;

import net.dungeondesk.qualitytools.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.recipe.RecipeExporter;
import net.minecraft.data.recipe.RecipeGenerator;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected RecipeGenerator getRecipeGenerator(RegistryWrapper.WrapperLookup wrapperLookup, RecipeExporter recipeExporter) {
        return new RecipeGenerator(wrapperLookup, recipeExporter) {
            @Override
            public void generate() {
                createShaped(RecipeCategory.TOOLS, ModItems.WOOD_HAMMER)
                        .pattern("XXX")
                        .pattern("XSX")
                        .pattern(" S ")
                        .input('S', Items.STICK)
                        .input('X', ItemTags.PLANKS)
                        .criterion("has_planks", this.conditionsFromTag(ItemTags.PLANKS))
                        .offerTo(exporter);

                createShaped(RecipeCategory.TOOLS, ModItems.GOLD_HAMMER)
                        .pattern("XXX")
                        .pattern("XSX")
                        .pattern(" S ")
                        .input('S', Items.STICK)
                        .input('X', Items.GOLD_INGOT)
                        .criterion(hasItem(Items.GOLD_INGOT), conditionsFromItem(Items.GOLD_INGOT))
                        .offerTo(exporter);

                createShaped(RecipeCategory.TOOLS, ModItems.COPPER_HAMMER)
                        .pattern("XXX")
                        .pattern("XSX")
                        .pattern(" S ")
                        .input('S', Items.STICK)
                        .input('X', Items.COPPER_INGOT)
                        .criterion(hasItem(Items.COPPER_INGOT), conditionsFromItem(Items.COPPER_INGOT))
                        .offerTo(exporter);

                createShaped(RecipeCategory.TOOLS, ModItems.IRON_HAMMER)
                        .pattern("XXX")
                        .pattern("XSX")
                        .pattern(" S ")
                        .input('S', Items.STICK)
                        .input('X', Items.IRON_INGOT)
                        .criterion(hasItem(Items.IRON_INGOT), conditionsFromItem(Items.IRON_INGOT))
                        .offerTo(exporter);

                createShaped(RecipeCategory.TOOLS, ModItems.DIAMOND_HAMMER)
                        .pattern("XXX")
                        .pattern("XSX")
                        .pattern(" S ")
                        .input('S', Items.STICK)
                        .input('X', Items.DIAMOND)
                        .criterion(hasItem(Items.DIAMOND), conditionsFromItem(Items.DIAMOND))
                        .offerTo(exporter);

                createShaped(RecipeCategory.TOOLS, ModItems.QUARTZ_HAMMER)
                        .pattern("XXX")
                        .pattern("XSX")
                        .pattern(" S ")
                        .input('S', Items.STICK)
                        .input('X', Items.QUARTZ)
                        .criterion(hasItem(Items.QUARTZ), conditionsFromItem(Items.QUARTZ))
                        .offerTo(exporter);

                createShaped(RecipeCategory.TOOLS, ModItems.EMERALD_HAMMER)
                        .pattern("XXX")
                        .pattern("XSX")
                        .pattern(" S ")
                        .input('S', Items.STICK)
                        .input('X', Items.EMERALD)
                        .criterion(hasItem(Items.EMERALD), conditionsFromItem(Items.EMERALD))
                        .offerTo(exporter);

                createShaped(RecipeCategory.TOOLS, ModItems.AMETHYST_HAMMER)
                        .pattern("XXX")
                        .pattern("XSX")
                        .pattern(" S ")
                        .input('S', Items.STICK)
                        .input('X', Items.AMETHYST_SHARD)
                        .criterion(hasItem(Items.AMETHYST_SHARD), conditionsFromItem(Items.AMETHYST_SHARD))
                        .offerTo(exporter);

                createShaped(RecipeCategory.TOOLS, ModItems.NETHERITE_HAMMER)
                        .pattern("XXX")
                        .pattern("XSX")
                        .pattern(" S ")
                        .input('S', Items.STICK)
                        .input('X', Items.NETHERITE_INGOT)
                        .criterion(hasItem(Items.NETHERITE_INGOT), conditionsFromItem(Items.NETHERITE_INGOT))
                        .offerTo(exporter);

                createShaped(RecipeCategory.TOOLS, ModItems.WOOD_EXCAVATOR)
                        .pattern(" XX")
                        .pattern(" SX")
                        .pattern("S  ")
                        .input('S', Items.STICK)
                        .input('X', ItemTags.PLANKS)
                        .criterion("has_planks", this.conditionsFromTag(ItemTags.PLANKS))
                        .offerTo(exporter);

                createShaped(RecipeCategory.TOOLS, ModItems.GOLD_EXCAVATOR)
                        .pattern(" XX")
                        .pattern(" SX")
                        .pattern("S  ")
                        .input('S', Items.STICK)
                        .input('X', Items.GOLD_INGOT)
                        .criterion(hasItem(Items.GOLD_INGOT), conditionsFromItem(Items.GOLD_INGOT))
                        .offerTo(exporter);

                createShaped(RecipeCategory.TOOLS, ModItems.COPPER_EXCAVATOR)
                        .pattern(" XX")
                        .pattern(" SX")
                        .pattern("S  ")
                        .input('S', Items.STICK)
                        .input('X', Items.COPPER_INGOT)
                        .criterion(hasItem(Items.COPPER_INGOT), conditionsFromItem(Items.COPPER_INGOT))
                        .offerTo(exporter);

                createShaped(RecipeCategory.TOOLS, ModItems.IRON_EXCAVATOR)
                        .pattern(" XX")
                        .pattern(" SX")
                        .pattern("S  ")
                        .input('S', Items.STICK)
                        .input('X', Items.IRON_INGOT)
                        .criterion(hasItem(Items.IRON_INGOT), conditionsFromItem(Items.IRON_INGOT))
                        .offerTo(exporter);

                createShaped(RecipeCategory.TOOLS, ModItems.QUARTZ_EXCAVATOR)
                        .pattern(" XX")
                        .pattern(" SX")
                        .pattern("S  ")
                        .input('S', Items.STICK)
                        .input('X', Items.QUARTZ)
                        .criterion(hasItem(Items.QUARTZ), conditionsFromItem(Items.QUARTZ))
                        .offerTo(exporter);

                createShaped(RecipeCategory.TOOLS, ModItems.EMERALD_EXCAVATOR)
                        .pattern(" XX")
                        .pattern(" SX")
                        .pattern("S  ")
                        .input('S', Items.STICK)
                        .input('X', Items.EMERALD)
                        .criterion(hasItem(Items.EMERALD), conditionsFromItem(Items.EMERALD))
                        .offerTo(exporter);

                createShaped(RecipeCategory.TOOLS, ModItems.AMETHYST_EXCAVATOR)
                        .pattern(" XX")
                        .pattern(" SX")
                        .pattern("S  ")
                        .input('S', Items.STICK)
                        .input('X', Items.AMETHYST_SHARD)
                        .criterion(hasItem(Items.AMETHYST_SHARD), conditionsFromItem(Items.AMETHYST_SHARD))
                        .offerTo(exporter);

                createShaped(RecipeCategory.TOOLS, ModItems.DIAMOND_EXCAVATOR)
                        .pattern(" XX")
                        .pattern(" SX")
                        .pattern("S  ")
                        .input('S', Items.STICK)
                        .input('X', Items.DIAMOND)
                        .criterion(hasItem(Items.DIAMOND), conditionsFromItem(Items.DIAMOND))
                        .offerTo(exporter);

                createShaped(RecipeCategory.TOOLS, ModItems.NETHERITE_EXCAVATOR)
                        .pattern(" XX")
                        .pattern(" SX")
                        .pattern("S  ")
                        .input('S', Items.STICK)
                        .input('X', Items.NETHERITE_INGOT)
                        .criterion(hasItem(Items.NETHERITE_INGOT), conditionsFromItem(Items.NETHERITE_INGOT))
                        .offerTo(exporter);
            }
        };
    }

    @Override
    public String getName() {
        return "";
    }
}
