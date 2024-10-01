
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.satiscraftery.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.satiscraftery.item.WireItem;
import net.mcreator.satiscraftery.item.ScrewItem;
import net.mcreator.satiscraftery.item.RotorItem;
import net.mcreator.satiscraftery.item.ReinforcedIronPlateItem;
import net.mcreator.satiscraftery.item.LimestoneItem;
import net.mcreator.satiscraftery.item.IronRodItem;
import net.mcreator.satiscraftery.item.IronPlateItem;
import net.mcreator.satiscraftery.item.EncasedConcreteItem;
import net.mcreator.satiscraftery.item.CableItem;
import net.mcreator.satiscraftery.item.BiomassItem;
import net.mcreator.satiscraftery.SatiscrafteryMod;

public class SatiscrafteryModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(SatiscrafteryMod.MODID);
	public static final DeferredHolder<Item, Item> LIMESTONE = REGISTRY.register("limestone", LimestoneItem::new);
	public static final DeferredHolder<Item, Item> LIMESTONE_ORE = block(SatiscrafteryModBlocks.LIMESTONE_ORE);
	public static final DeferredHolder<Item, Item> WIRE = REGISTRY.register("wire", WireItem::new);
	public static final DeferredHolder<Item, Item> CONSTRUCTOR = block(SatiscrafteryModBlocks.CONSTRUCTOR);
	public static final DeferredHolder<Item, Item> ENCASED_CONCRETE = REGISTRY.register("encased_concrete", EncasedConcreteItem::new);
	public static final DeferredHolder<Item, Item> CABLE = REGISTRY.register("cable", CableItem::new);
	public static final DeferredHolder<Item, Item> IRON_ROD = REGISTRY.register("iron_rod", IronRodItem::new);
	public static final DeferredHolder<Item, Item> SCREW = REGISTRY.register("screw", ScrewItem::new);
	public static final DeferredHolder<Item, Item> IRON_PLATE = REGISTRY.register("iron_plate", IronPlateItem::new);
	public static final DeferredHolder<Item, Item> REINFORCED_IRON_PLATE = REGISTRY.register("reinforced_iron_plate", ReinforcedIronPlateItem::new);
	public static final DeferredHolder<Item, Item> THE_HUB = block(SatiscrafteryModBlocks.THE_HUB);
	public static final DeferredHolder<Item, Item> ROTOR = REGISTRY.register("rotor", RotorItem::new);
	public static final DeferredHolder<Item, Item> PORTABLE_MINER = block(SatiscrafteryModBlocks.PORTABLE_MINER);
	public static final DeferredHolder<Item, Item> BIOMASS = REGISTRY.register("biomass", BiomassItem::new);
	public static final DeferredHolder<Item, Item> PURE_LIMESTONE_ORE = block(SatiscrafteryModBlocks.PURE_LIMESTONE_ORE);
	public static final DeferredHolder<Item, Item> PURE_COPPER_ORE = block(SatiscrafteryModBlocks.PURE_COPPER_ORE);
	public static final DeferredHolder<Item, Item> PURE_IRON_ORE = block(SatiscrafteryModBlocks.PURE_IRON_ORE);
	public static final DeferredHolder<Item, Item> PURE_GOLD_ORE = block(SatiscrafteryModBlocks.PURE_GOLD_ORE);
	public static final DeferredHolder<Item, Item> PURE_COAL_ORE = block(SatiscrafteryModBlocks.PURE_COAL_ORE);

	// Start of user code block custom items
	// End of user code block custom items
	private static DeferredHolder<Item, Item> block(DeferredHolder<Block, Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
