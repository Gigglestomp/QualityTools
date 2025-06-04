package net.dungeondesk.qualitytools;

import com.sun.jna.platform.win32.Netapi32Util;
import net.dungeondesk.qualitytools.item.ModItemGroups;
import net.dungeondesk.qualitytools.item.ModItems;
import net.dungeondesk.qualitytools.item.custom.HammerItem;
import net.dungeondesk.qualitytools.util.AxeUsageEvent;
import net.dungeondesk.qualitytools.util.ExcavatorUsageEvent;
import net.dungeondesk.qualitytools.util.HammerUsageEvent;
import net.dungeondesk.qualitytools.util.ModLootTableModifiers;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.client.item.v1.ItemTooltipCallback;
import net.fabricmc.fabric.api.event.player.PlayerBlockBreakEvents;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.item.AxeItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.Items;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.text.Text;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class QualityTools implements ModInitializer {
	public static final String MOD_ID = "qualitytools";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		ModLootTableModifiers.modifyLootTables();

//		ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(entries -> entries.addAfter(Items.STONE_HOE, ModItems.COPPER_SHOVEL));
//		ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(entries -> entries.addAfter(ModItems.COPPER_SHOVEL, ModItems.COPPER_PICKAXE));
//		ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(entries -> entries.addAfter(ModItems.COPPER_PICKAXE, ModItems.COPPER_AXE));
//		ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(entries -> entries.addAfter(ModItems.COPPER_AXE, ModItems.COPPER_HOE));
//		ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(entries -> entries.addAfter(Items.STONE_SWORD, ModItems.COPPER_SWORD));
//		ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(entries -> entries.addAfter(Items.STONE_AXE, ModItems.COPPER_AXE));
//
//		ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(entries -> entries.addAfter(Items.IRON_HOE, ModItems.QUARTZ_SHOVEL));
//		ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(entries -> entries.addAfter(ModItems.QUARTZ_SHOVEL, ModItems.QUARTZ_PICKAXE));
//		ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(entries -> entries.addAfter(ModItems.QUARTZ_PICKAXE, ModItems.QUARTZ_AXE));
//		ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(entries -> entries.addAfter(ModItems.QUARTZ_AXE, ModItems.QUARTZ_HOE));
//		ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(entries -> entries.addAfter(Items.IRON_SWORD, ModItems.QUARTZ_SWORD));
//		ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(entries -> entries.addAfter(Items.IRON_AXE, ModItems.QUARTZ_AXE));
//
//		ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(entries -> entries.addAfter(ModItems.QUARTZ_HOE, ModItems.AMETHYST_SHOVEL));
//		ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(entries -> entries.addAfter(ModItems.AMETHYST_SHOVEL, ModItems.AMETHYST_PICKAXE));
//		ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(entries -> entries.addAfter(ModItems.AMETHYST_PICKAXE, ModItems.AMETHYST_AXE));
//		ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(entries -> entries.addAfter(ModItems.AMETHYST_AXE, ModItems.AMETHYST_HOE));
//		ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(entries -> entries.addAfter(ModItems.QUARTZ_SWORD, ModItems.AMETHYST_SWORD));
//		ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(entries -> entries.addAfter(ModItems.QUARTZ_AXE, ModItems.AMETHYST_AXE));
//
//		ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(entries -> entries.addAfter(ModItems.AMETHYST_HOE, ModItems.EMERALD_SHOVEL));
//		ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(entries -> entries.addAfter(ModItems.EMERALD_SHOVEL, ModItems.EMERALD_PICKAXE));
//		ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(entries -> entries.addAfter(ModItems.EMERALD_PICKAXE, ModItems.EMERALD_AXE));
//		ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(entries -> entries.addAfter(ModItems.EMERALD_AXE, ModItems.EMERALD_HOE));
//		ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(entries -> entries.addAfter(ModItems.AMETHYST_SWORD, ModItems.EMERALD_SWORD));
//		ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(entries -> entries.addAfter(ModItems.AMETHYST_AXE, ModItems.EMERALD_AXE));
//
//		ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(entries -> entries.addAfter(ModItems.EMERALD_HOE, ModItems.RUBY_SHOVEL));
//		ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(entries -> entries.addAfter(ModItems.RUBY_SHOVEL, ModItems.RUBY_PICKAXE));
//		ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(entries -> entries.addAfter(ModItems.RUBY_PICKAXE, ModItems.RUBY_AXE));
//		ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(entries -> entries.addAfter(ModItems.RUBY_AXE, ModItems.RUBY_HOE));
//		ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(entries -> entries.addAfter(ModItems.EMERALD_SWORD, ModItems.RUBY_SWORD));
//		ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(entries -> entries.addAfter(ModItems.EMERALD_AXE, ModItems.RUBY_AXE));
//
//		ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(entries -> entries.addAfter(ModItems.RUBY_HOE, ModItems.SAPPHIRE_SHOVEL));
//		ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(entries -> entries.addAfter(ModItems.SAPPHIRE_SHOVEL, ModItems.SAPPHIRE_PICKAXE));
//		ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(entries -> entries.addAfter(ModItems.SAPPHIRE_PICKAXE, ModItems.SAPPHIRE_AXE));
//		ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(entries -> entries.addAfter(ModItems.SAPPHIRE_AXE, ModItems.SAPPHIRE_HOE));
//		ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(entries -> entries.addAfter(ModItems.RUBY_SWORD, ModItems.SAPPHIRE_SWORD));
//		ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(entries -> entries.addAfter(ModItems.RUBY_AXE, ModItems.SAPPHIRE_AXE));
//
//		ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(entries -> entries.addAfter(Items.WOODEN_HOE, ModItems.WOOD_HAMMER));
//		ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(entries -> entries.addAfter(Items.STONE_HOE ,ModItems.STONE_HAMMER));
//		ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(entries -> entries.addAfter(Items.GOLDEN_HOE ,ModItems.GOLD_HAMMER));
//		ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(entries -> entries.addAfter(ModItems.COPPER_HOE ,ModItems.COPPER_HAMMER));
//		ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(entries -> entries.addAfter(Items.IRON_HOE ,ModItems.IRON_HAMMER));
//		ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(entries -> entries.addAfter(ModItems.QUARTZ_HOE ,ModItems.QUARTZ_HAMMER));
//		ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(entries -> entries.addAfter(ModItems.EMERALD_HOE ,ModItems.EMERALD_HAMMER));
//		ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(entries -> entries.addAfter(ModItems.AMETHYST_HOE ,ModItems.AMETHYST_HAMMER));
//		ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(entries -> entries.addAfter(ModItems.RUBY_HOE ,ModItems.RUBY_HAMMER));
//		ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(entries -> entries.addAfter(ModItems.SAPPHIRE_HOE ,ModItems.SAPPHIRE_HAMMER));
//		ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(entries -> entries.addAfter(Items.DIAMOND_HOE ,ModItems.DIAMOND_HAMMER));
//		ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(entries -> entries.addAfter(Items.NETHERITE_HOE ,ModItems.NETHERITE_HAMMER));
//		ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(entries -> entries.addAfter(ModItems.WOOD_HAMMER, ModItems.WOOD_EXCAVATOR));
//		ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(entries -> entries.addAfter(ModItems.STONE_HAMMER ,ModItems.STONE_EXCAVATOR));
//		ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(entries -> entries.addAfter(ModItems.GOLD_HAMMER ,ModItems.GOLD_EXCAVATOR));
//		ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(entries -> entries.addAfter(ModItems.COPPER_HAMMER ,ModItems.COPPER_EXCAVATOR));
//		ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(entries -> entries.addAfter(ModItems.IRON_HAMMER ,ModItems.IRON_EXCAVATOR));
//		ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(entries -> entries.addAfter(ModItems.QUARTZ_HAMMER ,ModItems.QUARTZ_EXCAVATOR));
//		ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(entries -> entries.addAfter(ModItems.EMERALD_HAMMER ,ModItems.EMERALD_EXCAVATOR));
//		ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(entries -> entries.addAfter(ModItems.AMETHYST_HAMMER ,ModItems.AMETHYST_EXCAVATOR));
//		ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(entries -> entries.addAfter(ModItems.RUBY_HAMMER ,ModItems.RUBY_EXCAVATOR));
//		ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(entries -> entries.addAfter(ModItems.SAPPHIRE_HAMMER ,ModItems.SAPPHIRE_EXCAVATOR));
//		ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(entries -> entries.addAfter(ModItems.DIAMOND_HAMMER ,ModItems.DIAMOND_EXCAVATOR));
//		ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(entries -> entries.addAfter(ModItems.NETHERITE_HAMMER ,ModItems.NETHERITE_EXCAVATOR));

		PlayerBlockBreakEvents.BEFORE.register(new HammerUsageEvent());
		PlayerBlockBreakEvents.BEFORE.register(new ExcavatorUsageEvent());
		PlayerBlockBreakEvents.BEFORE.register(new AxeUsageEvent());

		ItemTooltipCallback.EVENT.register((itemStack, tooltipContext, tooltipType, list) -> {
			if (!itemStack.isIn(ItemTags.AXES)) {
				return;
			}
			if(Screen.hasShiftDown()) {
				list.add(Text.translatable("tooltip.qualitytools.treeaxe.shift_down"));
			} else {
				list.add(Text.translatable("tooltip.qualitytools.axe"));
			}
		});


	}
}