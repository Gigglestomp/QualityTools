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


                createShaped(RecipeCategory.MISC, ModItems.RUBY)
                        .pattern("RRR")
                        .pattern("RER")
                        .pattern("RRR")
                        .input('R', Items.REDSTONE)
                        .input('E', Items.EMERALD)
                        .criterion(hasItem(Items.REDSTONE), conditionsFromItem(Items.REDSTONE))
                        .criterion(hasItem(Items.EMERALD), conditionsFromItem(Items.EMERALD))
                        .offerTo(exporter);

                createShaped(RecipeCategory.MISC, ModItems.SAPPHIRE)
                        .pattern("LLL")
                        .pattern("LEL")
                        .pattern("LLL")
                        .input('L', Items.LAPIS_LAZULI)
                        .input('E', Items.EMERALD)
                        .criterion(hasItem(Items.LAPIS_LAZULI), conditionsFromItem(Items.LAPIS_LAZULI))
                        .criterion(hasItem(Items.EMERALD), conditionsFromItem(Items.EMERALD))
                        .offerTo(exporter);


                createShaped(RecipeCategory.TOOLS, ModItems.WOOD_HAMMER)
                        .pattern("XXX")
                        .pattern("XSX")
                        .pattern(" S ")
                        .input('S', Items.STICK)
                        .input('X', ItemTags.WOODEN_TOOL_MATERIALS)
                        .criterion("has_planks", this.conditionsFromTag(ItemTags.WOODEN_TOOL_MATERIALS))
                        .offerTo(exporter);

                createShaped(RecipeCategory.TOOLS, ModItems.STONE_HAMMER)
                        .pattern("XXX")
                        .pattern("XSX")
                        .pattern(" S ")
                        .input('S', Items.STICK)
                        .input('X', ItemTags.STONE_TOOL_MATERIALS)
                        .criterion("has_stone", this.conditionsFromTag(ItemTags.STONE_TOOL_MATERIALS))
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

                createShaped(RecipeCategory.TOOLS, ModItems.RUBY_HAMMER)
                        .pattern("XXX")
                        .pattern("XSX")
                        .pattern(" S ")
                        .input('S', Items.STICK)
                        .input('X', ModItems.RUBY)
                        .criterion(hasItem(ModItems.RUBY), conditionsFromItem(ModItems.RUBY))
                        .offerTo(exporter);

                createShaped(RecipeCategory.TOOLS, ModItems.SAPPHIRE_HAMMER)
                        .pattern("XXX")
                        .pattern("XSX")
                        .pattern(" S ")
                        .input('S', Items.STICK)
                        .input('X', ModItems.SAPPHIRE)
                        .criterion(hasItem(ModItems.SAPPHIRE), conditionsFromItem(ModItems.SAPPHIRE))
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
                        .input('X', ItemTags.WOODEN_TOOL_MATERIALS)
                        .criterion("has_planks", this.conditionsFromTag(ItemTags.WOODEN_TOOL_MATERIALS))
                        .offerTo(exporter);

                createShaped(RecipeCategory.TOOLS, ModItems.STONE_EXCAVATOR)
                        .pattern(" XX")
                        .pattern(" SX")
                        .pattern("S  ")
                        .input('S', Items.STICK)
                        .input('X', ItemTags.STONE_TOOL_MATERIALS)
                        .criterion("has_stone", this.conditionsFromTag(ItemTags.STONE_TOOL_MATERIALS))
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

                createShaped(RecipeCategory.TOOLS, ModItems.RUBY_EXCAVATOR)
                        .pattern(" XX")
                        .pattern(" SX")
                        .pattern("S  ")
                        .input('S', Items.STICK)
                        .input('X', ModItems.RUBY)
                        .criterion(hasItem(ModItems.RUBY), conditionsFromItem(ModItems.RUBY))
                        .offerTo(exporter);

                createShaped(RecipeCategory.TOOLS, ModItems.SAPPHIRE_EXCAVATOR)
                        .pattern(" XX")
                        .pattern(" SX")
                        .pattern("S  ")
                        .input('S', Items.STICK)
                        .input('X', ModItems.SAPPHIRE)
                        .criterion(hasItem(ModItems.SAPPHIRE), conditionsFromItem(ModItems.SAPPHIRE))
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


                createShaped(RecipeCategory.TOOLS, ModItems.COPPER_SWORD)
                        .pattern("X")
                        .pattern("X")
                        .pattern("S")
                        .input('S', Items.STICK)
                        .input('X', Items.COPPER_INGOT)
                        .criterion(hasItem(Items.COPPER_INGOT), conditionsFromItem(Items.COPPER_INGOT))
                        .offerTo(exporter);

                createShaped(RecipeCategory.TOOLS, ModItems.COPPER_PICKAXE)
                        .pattern("XXX")
                        .pattern(" S ")
                        .pattern(" S ")
                        .input('S', Items.STICK)
                        .input('X', Items.COPPER_INGOT)
                        .criterion(hasItem(Items.COPPER_INGOT), conditionsFromItem(Items.COPPER_INGOT))
                        .offerTo(exporter);

                createShaped(RecipeCategory.TOOLS, ModItems.COPPER_SHOVEL)
                        .pattern("X")
                        .pattern("S")
                        .pattern("S")
                        .input('S', Items.STICK)
                        .input('X', Items.COPPER_INGOT)
                        .criterion(hasItem(Items.COPPER_INGOT), conditionsFromItem(Items.COPPER_INGOT))
                        .offerTo(exporter);

                createShaped(RecipeCategory.TOOLS, ModItems.COPPER_AXE)
                        .pattern("XX")
                        .pattern("XS")
                        .pattern(" S")
                        .input('S', Items.STICK)
                        .input('X', Items.COPPER_INGOT)
                        .criterion(hasItem(Items.COPPER_INGOT), conditionsFromItem(Items.COPPER_INGOT))
                        .offerTo(exporter);

                createShaped(RecipeCategory.TOOLS, ModItems.COPPER_HOE)
                        .pattern("XX")
                        .pattern(" S")
                        .pattern(" S")
                        .input('S', Items.STICK)
                        .input('X', Items.COPPER_INGOT)
                        .criterion(hasItem(Items.COPPER_INGOT), conditionsFromItem(Items.COPPER_INGOT))
                        .offerTo(exporter);


                createShaped(RecipeCategory.TOOLS, ModItems.AMETHYST_SWORD)
                        .pattern("X")
                        .pattern("X")
                        .pattern("S")
                        .input('S', Items.STICK)
                        .input('X', Items.AMETHYST_SHARD)
                        .criterion(hasItem(Items.AMETHYST_SHARD), conditionsFromItem(Items.AMETHYST_SHARD))
                        .offerTo(exporter);

                createShaped(RecipeCategory.TOOLS, ModItems.AMETHYST_PICKAXE)
                        .pattern("XXX")
                        .pattern(" S ")
                        .pattern(" S ")
                        .input('S', Items.STICK)
                        .input('X', Items.AMETHYST_SHARD)
                        .criterion(hasItem(Items.AMETHYST_SHARD), conditionsFromItem(Items.AMETHYST_SHARD))
                        .offerTo(exporter);

                createShaped(RecipeCategory.TOOLS, ModItems.AMETHYST_SHOVEL)
                        .pattern("X")
                        .pattern("S")
                        .pattern("S")
                        .input('S', Items.STICK)
                        .input('X', Items.AMETHYST_SHARD)
                        .criterion(hasItem(Items.AMETHYST_SHARD), conditionsFromItem(Items.AMETHYST_SHARD))
                        .offerTo(exporter);

                createShaped(RecipeCategory.TOOLS, ModItems.AMETHYST_AXE)
                        .pattern("XX")
                        .pattern("XS")
                        .pattern(" S")
                        .input('S', Items.STICK)
                        .input('X', Items.AMETHYST_SHARD)
                        .criterion(hasItem(Items.AMETHYST_SHARD), conditionsFromItem(Items.AMETHYST_SHARD))
                        .offerTo(exporter);

                createShaped(RecipeCategory.TOOLS, ModItems.AMETHYST_HOE)
                        .pattern("XX")
                        .pattern(" S")
                        .pattern(" S")
                        .input('S', Items.STICK)
                        .input('X', Items.AMETHYST_SHARD)
                        .criterion(hasItem(Items.AMETHYST_SHARD), conditionsFromItem(Items.AMETHYST_SHARD))
                        .offerTo(exporter);


                createShaped(RecipeCategory.TOOLS, ModItems.EMERALD_SWORD)
                        .pattern("X")
                        .pattern("X")
                        .pattern("S")
                        .input('S', Items.STICK)
                        .input('X', Items.EMERALD)
                        .criterion(hasItem(Items.EMERALD), conditionsFromItem(Items.EMERALD))
                        .offerTo(exporter);

                createShaped(RecipeCategory.TOOLS, ModItems.EMERALD_PICKAXE)
                        .pattern("XXX")
                        .pattern(" S ")
                        .pattern(" S ")
                        .input('S', Items.STICK)
                        .input('X', Items.EMERALD)
                        .criterion(hasItem(Items.EMERALD), conditionsFromItem(Items.EMERALD))
                        .offerTo(exporter);

                createShaped(RecipeCategory.TOOLS, ModItems.EMERALD_SHOVEL)
                        .pattern("X")
                        .pattern("S")
                        .pattern("S")
                        .input('S', Items.STICK)
                        .input('X', Items.EMERALD)
                        .criterion(hasItem(Items.EMERALD), conditionsFromItem(Items.EMERALD))
                        .offerTo(exporter);

                createShaped(RecipeCategory.TOOLS, ModItems.EMERALD_AXE)
                        .pattern("XX")
                        .pattern("XS")
                        .pattern(" S")
                        .input('S', Items.STICK)
                        .input('X', Items.EMERALD)
                        .criterion(hasItem(Items.EMERALD), conditionsFromItem(Items.EMERALD))
                        .offerTo(exporter);

                createShaped(RecipeCategory.TOOLS, ModItems.EMERALD_HOE)
                        .pattern("XX")
                        .pattern(" S")
                        .pattern(" S")
                        .input('S', Items.STICK)
                        .input('X', Items.EMERALD)
                        .criterion(hasItem(Items.EMERALD), conditionsFromItem(Items.EMERALD))
                        .offerTo(exporter);

                createShaped(RecipeCategory.TOOLS, ModItems.QUARTZ_SWORD)
                        .pattern("X")
                        .pattern("X")
                        .pattern("S")
                        .input('S', Items.STICK)
                        .input('X', Items.QUARTZ)
                        .criterion(hasItem(Items.QUARTZ), conditionsFromItem(Items.QUARTZ))
                        .offerTo(exporter);

                createShaped(RecipeCategory.TOOLS, ModItems.QUARTZ_PICKAXE)
                        .pattern("XXX")
                        .pattern(" S ")
                        .pattern(" S ")
                        .input('S', Items.STICK)
                        .input('X', Items.QUARTZ)
                        .criterion(hasItem(Items.QUARTZ), conditionsFromItem(Items.QUARTZ))
                        .offerTo(exporter);

                createShaped(RecipeCategory.TOOLS, ModItems.QUARTZ_SHOVEL)
                        .pattern("X")
                        .pattern("S")
                        .pattern("S")
                        .input('S', Items.STICK)
                        .input('X', Items.QUARTZ)
                        .criterion(hasItem(Items.QUARTZ), conditionsFromItem(Items.QUARTZ))
                        .offerTo(exporter);

                createShaped(RecipeCategory.TOOLS, ModItems.QUARTZ_AXE)
                        .pattern("XX")
                        .pattern("XS")
                        .pattern(" S")
                        .input('S', Items.STICK)
                        .input('X', Items.QUARTZ)
                        .criterion(hasItem(Items.QUARTZ), conditionsFromItem(Items.QUARTZ))
                        .offerTo(exporter);

                createShaped(RecipeCategory.TOOLS, ModItems.QUARTZ_HOE)
                        .pattern("XX")
                        .pattern(" S")
                        .pattern(" S")
                        .input('S', Items.STICK)
                        .input('X', Items.QUARTZ)
                        .criterion(hasItem(Items.QUARTZ), conditionsFromItem(Items.QUARTZ))
                        .offerTo(exporter);

                createShaped(RecipeCategory.TOOLS, ModItems.RUBY_SWORD)
                        .pattern("X")
                        .pattern("X")
                        .pattern("S")
                        .input('S', Items.STICK)
                        .input('X', ModItems.RUBY)
                        .criterion(hasItem(ModItems.RUBY), conditionsFromItem(ModItems.RUBY))
                        .offerTo(exporter);

                createShaped(RecipeCategory.TOOLS, ModItems.RUBY_PICKAXE)
                        .pattern("XXX")
                        .pattern(" S ")
                        .pattern(" S ")
                        .input('S', Items.STICK)
                        .input('X', ModItems.RUBY)
                        .criterion(hasItem(ModItems.RUBY), conditionsFromItem(ModItems.RUBY))
                        .offerTo(exporter);

                createShaped(RecipeCategory.TOOLS, ModItems.RUBY_SHOVEL)
                        .pattern("X")
                        .pattern("S")
                        .pattern("S")
                        .input('S', Items.STICK)
                        .input('X', ModItems.RUBY)
                        .criterion(hasItem(ModItems.RUBY), conditionsFromItem(ModItems.RUBY))
                        .offerTo(exporter);

                createShaped(RecipeCategory.TOOLS, ModItems.RUBY_AXE)
                        .pattern("XX")
                        .pattern("XS")
                        .pattern(" S")
                        .input('S', Items.STICK)
                        .input('X', ModItems.RUBY)
                        .criterion(hasItem(ModItems.RUBY), conditionsFromItem(ModItems.RUBY))
                        .offerTo(exporter);

                createShaped(RecipeCategory.TOOLS, ModItems.RUBY_HOE)
                        .pattern("XX")
                        .pattern(" S")
                        .pattern(" S")
                        .input('S', Items.STICK)
                        .input('X', ModItems.RUBY)
                        .criterion(hasItem(ModItems.RUBY), conditionsFromItem(ModItems.RUBY))
                        .offerTo(exporter);

                createShaped(RecipeCategory.TOOLS, ModItems.SAPPHIRE_SWORD)
                        .pattern("X")
                        .pattern("X")
                        .pattern("S")
                        .input('S', Items.STICK)
                        .input('X', ModItems.SAPPHIRE)
                        .criterion(hasItem(ModItems.SAPPHIRE), conditionsFromItem(ModItems.SAPPHIRE))
                        .offerTo(exporter);

                createShaped(RecipeCategory.TOOLS, ModItems.SAPPHIRE_PICKAXE)
                        .pattern("XXX")
                        .pattern(" S ")
                        .pattern(" S ")
                        .input('S', Items.STICK)
                        .input('X', ModItems.SAPPHIRE)
                        .criterion(hasItem(ModItems.SAPPHIRE), conditionsFromItem(ModItems.SAPPHIRE))
                        .offerTo(exporter);

                createShaped(RecipeCategory.TOOLS, ModItems.SAPPHIRE_SHOVEL)
                        .pattern("X")
                        .pattern("S")
                        .pattern("S")
                        .input('S', Items.STICK)
                        .input('X', ModItems.SAPPHIRE)
                        .criterion(hasItem(ModItems.SAPPHIRE), conditionsFromItem(ModItems.SAPPHIRE))
                        .offerTo(exporter);

                createShaped(RecipeCategory.TOOLS, ModItems.SAPPHIRE_AXE)
                        .pattern("XX")
                        .pattern("XS")
                        .pattern(" S")
                        .input('S', Items.STICK)
                        .input('X', ModItems.SAPPHIRE)
                        .criterion(hasItem(ModItems.SAPPHIRE), conditionsFromItem(ModItems.SAPPHIRE))
                        .offerTo(exporter);

                createShaped(RecipeCategory.TOOLS, ModItems.SAPPHIRE_HOE)
                        .pattern("XX")
                        .pattern(" S")
                        .pattern(" S")
                        .input('S', Items.STICK)
                        .input('X', ModItems.SAPPHIRE)
                        .criterion(hasItem(ModItems.SAPPHIRE), conditionsFromItem(ModItems.SAPPHIRE))
                        .offerTo(exporter);

                createShaped(RecipeCategory.COMBAT, ModItems.COPPER_HELMET)
                        .pattern("   ")
                        .pattern("XXX")
                        .pattern("X X")
                        .input('X', Items.COPPER_INGOT)
                        .criterion(hasItem(Items.COPPER_INGOT), conditionsFromItem(Items.COPPER_INGOT))
                        .offerTo(exporter);

                createShaped(RecipeCategory.COMBAT, ModItems.COPPER_CHESTPLATE)
                        .pattern("X X")
                        .pattern("XXX")
                        .pattern("XXX")
                        .input('X', Items.COPPER_INGOT)
                        .criterion(hasItem(Items.COPPER_INGOT), conditionsFromItem(Items.COPPER_INGOT))
                        .offerTo(exporter);

                createShaped(RecipeCategory.COMBAT, ModItems.COPPER_LEGGINGS)
                        .pattern("XXX")
                        .pattern("X X")
                        .pattern("X X")
                        .input('X', Items.COPPER_INGOT)
                        .criterion(hasItem(Items.COPPER_INGOT), conditionsFromItem(Items.COPPER_INGOT))
                        .offerTo(exporter);

                createShaped(RecipeCategory.COMBAT, ModItems.COPPER_BOOTS)
                        .pattern("   ")
                        .pattern("X X")
                        .pattern("X X")
                        .input('X', Items.COPPER_INGOT)
                        .criterion(hasItem(Items.COPPER_INGOT), conditionsFromItem(Items.COPPER_INGOT))
                        .offerTo(exporter);

                createShaped(RecipeCategory.COMBAT, ModItems.AMETHYST_HELMET)
                        .pattern("   ")
                        .pattern("XXX")
                        .pattern("X X")
                        .input('X', Items.AMETHYST_SHARD)
                        .criterion(hasItem(Items.AMETHYST_SHARD), conditionsFromItem(Items.AMETHYST_SHARD))
                        .offerTo(exporter);

                createShaped(RecipeCategory.COMBAT, ModItems.AMETHYST_CHESTPLATE)
                        .pattern("X X")
                        .pattern("XXX")
                        .pattern("XXX")
                        .input('X', Items.AMETHYST_SHARD)
                        .criterion(hasItem(Items.AMETHYST_SHARD), conditionsFromItem(Items.AMETHYST_SHARD))
                        .offerTo(exporter);

                createShaped(RecipeCategory.COMBAT, ModItems.AMETHYST_LEGGINGS)
                        .pattern("XXX")
                        .pattern("X X")
                        .pattern("X X")
                        .input('X', Items.AMETHYST_SHARD)
                        .criterion(hasItem(Items.AMETHYST_SHARD), conditionsFromItem(Items.AMETHYST_SHARD))
                        .offerTo(exporter);

                createShaped(RecipeCategory.COMBAT, ModItems.AMETHYST_BOOTS)
                        .pattern("   ")
                        .pattern("X X")
                        .pattern("X X")
                        .input('X', Items.AMETHYST_SHARD)
                        .criterion(hasItem(Items.AMETHYST_SHARD), conditionsFromItem(Items.AMETHYST_SHARD))
                        .offerTo(exporter);

                createShaped(RecipeCategory.COMBAT, ModItems.EMERALD_HELMET)
                        .pattern("   ")
                        .pattern("XXX")
                        .pattern("X X")
                        .input('X', Items.EMERALD)
                        .criterion(hasItem(Items.EMERALD), conditionsFromItem(Items.EMERALD))
                        .offerTo(exporter);

                createShaped(RecipeCategory.COMBAT, ModItems.EMERALD_CHESTPLATE)
                        .pattern("X X")
                        .pattern("XXX")
                        .pattern("XXX")
                        .input('X', Items.EMERALD)
                        .criterion(hasItem(Items.EMERALD), conditionsFromItem(Items.EMERALD))
                        .offerTo(exporter);

                createShaped(RecipeCategory.COMBAT, ModItems.EMERALD_LEGGINGS)
                        .pattern("XXX")
                        .pattern("X X")
                        .pattern("X X")
                        .input('X', Items.EMERALD)
                        .criterion(hasItem(Items.EMERALD), conditionsFromItem(Items.EMERALD))
                        .offerTo(exporter);

                createShaped(RecipeCategory.COMBAT, ModItems.EMERALD_BOOTS)
                        .pattern("   ")
                        .pattern("X X")
                        .pattern("X X")
                        .input('X', Items.EMERALD)
                        .criterion(hasItem(Items.EMERALD), conditionsFromItem(Items.EMERALD))
                        .offerTo(exporter);

                createShaped(RecipeCategory.COMBAT, ModItems.QUARTZ_HELMET)
                        .pattern("   ")
                        .pattern("XXX")
                        .pattern("X X")
                        .input('X', Items.QUARTZ)
                        .criterion(hasItem(Items.QUARTZ), conditionsFromItem(Items.QUARTZ))
                        .offerTo(exporter);

                createShaped(RecipeCategory.COMBAT, ModItems.QUARTZ_CHESTPLATE)
                        .pattern("X X")
                        .pattern("XXX")
                        .pattern("XXX")
                        .input('X', Items.QUARTZ)
                        .criterion(hasItem(Items.QUARTZ), conditionsFromItem(Items.QUARTZ))
                        .offerTo(exporter);

                createShaped(RecipeCategory.COMBAT, ModItems.QUARTZ_LEGGINGS)
                        .pattern("XXX")
                        .pattern("X X")
                        .pattern("X X")
                        .input('X', Items.QUARTZ)
                        .criterion(hasItem(Items.QUARTZ), conditionsFromItem(Items.QUARTZ))
                        .offerTo(exporter);

                createShaped(RecipeCategory.COMBAT, ModItems.QUARTZ_BOOTS)
                        .pattern("   ")
                        .pattern("X X")
                        .pattern("X X")
                        .input('X', Items.QUARTZ)
                        .criterion(hasItem(Items.QUARTZ), conditionsFromItem(Items.QUARTZ))
                        .offerTo(exporter);

                createShaped(RecipeCategory.COMBAT, ModItems.RUBY_HELMET)
                        .pattern("   ")
                        .pattern("XXX")
                        .pattern("X X")
                        .input('X', ModItems.RUBY)
                        .criterion(hasItem(ModItems.RUBY), conditionsFromItem(ModItems.RUBY))
                        .offerTo(exporter);

                createShaped(RecipeCategory.COMBAT, ModItems.RUBY_CHESTPLATE)
                        .pattern("X X")
                        .pattern("XXX")
                        .pattern("XXX")
                        .input('X', ModItems.RUBY)
                        .criterion(hasItem(ModItems.RUBY), conditionsFromItem(ModItems.RUBY))
                        .offerTo(exporter);

                createShaped(RecipeCategory.COMBAT, ModItems.RUBY_LEGGINGS)
                        .pattern("XXX")
                        .pattern("X X")
                        .pattern("X X")
                        .input('X', ModItems.RUBY)
                        .criterion(hasItem(ModItems.RUBY), conditionsFromItem(ModItems.RUBY))
                        .offerTo(exporter);

                createShaped(RecipeCategory.COMBAT, ModItems.RUBY_BOOTS)
                        .pattern("   ")
                        .pattern("X X")
                        .pattern("X X")
                        .input('X', ModItems.RUBY)
                        .criterion(hasItem(ModItems.RUBY), conditionsFromItem(ModItems.RUBY))
                        .offerTo(exporter);

                createShaped(RecipeCategory.COMBAT, ModItems.SAPPHIRE_HELMET)
                        .pattern("   ")
                        .pattern("XXX")
                        .pattern("X X")
                        .input('X', ModItems.SAPPHIRE)
                        .criterion(hasItem(ModItems.SAPPHIRE), conditionsFromItem(ModItems.SAPPHIRE))
                        .offerTo(exporter);

                createShaped(RecipeCategory.COMBAT, ModItems.SAPPHIRE_CHESTPLATE)
                        .pattern("X X")
                        .pattern("XXX")
                        .pattern("XXX")
                        .input('X', ModItems.SAPPHIRE)
                        .criterion(hasItem(ModItems.SAPPHIRE), conditionsFromItem(ModItems.SAPPHIRE))
                        .offerTo(exporter);

                createShaped(RecipeCategory.COMBAT, ModItems.SAPPHIRE_LEGGINGS)
                        .pattern("XXX")
                        .pattern("X X")
                        .pattern("X X")
                        .input('X', ModItems.SAPPHIRE)
                        .criterion(hasItem(ModItems.SAPPHIRE), conditionsFromItem(ModItems.SAPPHIRE))
                        .offerTo(exporter);

                createShaped(RecipeCategory.COMBAT, ModItems.SAPPHIRE_BOOTS)
                        .pattern("   ")
                        .pattern("X X")
                        .pattern("X X")
                        .input('X', ModItems.SAPPHIRE)
                        .criterion(hasItem(ModItems.SAPPHIRE), conditionsFromItem(ModItems.SAPPHIRE))
                        .offerTo(exporter);
                
                
            }
        };
    }

    @Override
    public String getName() {
        return "";
    }
}
