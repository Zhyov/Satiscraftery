
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.satiscraftery.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.satiscraftery.SatiscrafteryMod;

public class SatiscrafteryModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, SatiscrafteryMod.MODID);
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> SATISCRAFTERY = REGISTRY.register("satiscraftery",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.satiscraftery.satiscraftery")).icon(() -> new ItemStack(SatiscrafteryModBlocks.CONSTRUCTOR.get())).displayItems((parameters, tabData) -> {
				tabData.accept(SatiscrafteryModItems.LIMESTONE.get());
				tabData.accept(SatiscrafteryModBlocks.LIMESTONE_ORE.get().asItem());
				tabData.accept(SatiscrafteryModItems.WIRE.get());
				tabData.accept(SatiscrafteryModBlocks.CONSTRUCTOR.get().asItem());
				tabData.accept(SatiscrafteryModItems.ENCASED_CONCRETE.get());
				tabData.accept(SatiscrafteryModItems.CABLE.get());
				tabData.accept(SatiscrafteryModItems.IRON_ROD.get());
				tabData.accept(SatiscrafteryModItems.SCREW.get());
				tabData.accept(SatiscrafteryModItems.IRON_PLATE.get());
				tabData.accept(SatiscrafteryModItems.REINFORCED_IRON_PLATE.get());
				tabData.accept(SatiscrafteryModBlocks.THE_HUB.get().asItem());
				tabData.accept(SatiscrafteryModBlocks.PORTABLE_MINER.get().asItem());
				tabData.accept(SatiscrafteryModItems.BIOMASS.get());
				tabData.accept(SatiscrafteryModBlocks.PURE_LIMESTONE_ORE.get().asItem());
				tabData.accept(SatiscrafteryModBlocks.PURE_COPPER_ORE.get().asItem());
				tabData.accept(SatiscrafteryModBlocks.PURE_IRON_ORE.get().asItem());
				tabData.accept(SatiscrafteryModBlocks.PURE_GOLD_ORE.get().asItem());
				tabData.accept(SatiscrafteryModBlocks.PURE_COAL_ORE.get().asItem());
			}).withSearchBar().build());
}
