
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.satiscraftery.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.capabilities.RegisterCapabilitiesEvent;
import net.neoforged.neoforge.capabilities.Capabilities;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;
import net.minecraft.core.registries.BuiltInRegistries;

import net.mcreator.satiscraftery.block.entity.TheHUBBlockEntity;
import net.mcreator.satiscraftery.block.entity.PortableMinerBlockEntity;
import net.mcreator.satiscraftery.block.entity.ConstructorBlockEntity;
import net.mcreator.satiscraftery.SatiscrafteryMod;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class SatiscrafteryModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(BuiltInRegistries.BLOCK_ENTITY_TYPE, SatiscrafteryMod.MODID);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> CONSTRUCTOR = register("constructor", SatiscrafteryModBlocks.CONSTRUCTOR, ConstructorBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> THE_HUB = register("the_hub", SatiscrafteryModBlocks.THE_HUB, TheHUBBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> PORTABLE_MINER = register("portable_miner", SatiscrafteryModBlocks.PORTABLE_MINER, PortableMinerBlockEntity::new);

	private static DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> register(String registryname, DeferredHolder<Block, Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}

	@SubscribeEvent
	public static void registerCapabilities(RegisterCapabilitiesEvent event) {
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, CONSTRUCTOR.get(), (blockEntity, side) -> ((ConstructorBlockEntity) blockEntity).getItemHandler());
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, THE_HUB.get(), (blockEntity, side) -> ((TheHUBBlockEntity) blockEntity).getItemHandler());
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, PORTABLE_MINER.get(), (blockEntity, side) -> ((PortableMinerBlockEntity) blockEntity).getItemHandler());
	}
}
