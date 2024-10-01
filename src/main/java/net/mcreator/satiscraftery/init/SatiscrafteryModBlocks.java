
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.satiscraftery.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.level.block.Block;

import net.mcreator.satiscraftery.block.TheHUBBlock;
import net.mcreator.satiscraftery.block.PureLimestoneOreBlock;
import net.mcreator.satiscraftery.block.PureIronOreBlock;
import net.mcreator.satiscraftery.block.PureGoldOreBlock;
import net.mcreator.satiscraftery.block.PureCopperOreBlock;
import net.mcreator.satiscraftery.block.PureCoalOreBlock;
import net.mcreator.satiscraftery.block.PortableMinerBlock;
import net.mcreator.satiscraftery.block.LimestoneOreBlock;
import net.mcreator.satiscraftery.block.ConstructorBlock;
import net.mcreator.satiscraftery.SatiscrafteryMod;

public class SatiscrafteryModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(SatiscrafteryMod.MODID);
	public static final DeferredHolder<Block, Block> LIMESTONE_ORE = REGISTRY.register("limestone_ore", LimestoneOreBlock::new);
	public static final DeferredHolder<Block, Block> CONSTRUCTOR = REGISTRY.register("constructor", ConstructorBlock::new);
	public static final DeferredHolder<Block, Block> THE_HUB = REGISTRY.register("the_hub", TheHUBBlock::new);
	public static final DeferredHolder<Block, Block> PORTABLE_MINER = REGISTRY.register("portable_miner", PortableMinerBlock::new);
	public static final DeferredHolder<Block, Block> PURE_LIMESTONE_ORE = REGISTRY.register("pure_limestone_ore", PureLimestoneOreBlock::new);
	public static final DeferredHolder<Block, Block> PURE_COPPER_ORE = REGISTRY.register("pure_copper_ore", PureCopperOreBlock::new);
	public static final DeferredHolder<Block, Block> PURE_IRON_ORE = REGISTRY.register("pure_iron_ore", PureIronOreBlock::new);
	public static final DeferredHolder<Block, Block> PURE_GOLD_ORE = REGISTRY.register("pure_gold_ore", PureGoldOreBlock::new);
	public static final DeferredHolder<Block, Block> PURE_COAL_ORE = REGISTRY.register("pure_coal_ore", PureCoalOreBlock::new);
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
