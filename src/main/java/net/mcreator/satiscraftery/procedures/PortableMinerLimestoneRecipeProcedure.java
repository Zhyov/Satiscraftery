package net.mcreator.satiscraftery.procedures;

import net.neoforged.neoforge.items.IItemHandlerModifiable;
import net.neoforged.neoforge.items.IItemHandler;
import net.neoforged.neoforge.common.extensions.ILevelExtension;
import net.neoforged.neoforge.capabilities.Capabilities;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.core.BlockPos;

import net.mcreator.satiscraftery.init.SatiscrafteryModItems;
import net.mcreator.satiscraftery.init.SatiscrafteryModBlocks;

public class PortableMinerLimestoneRecipeProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == SatiscrafteryModBlocks.PORTABLE_MINER.get() && (new Object() {
			public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
				if (world instanceof ILevelExtension _ext) {
					IItemHandler _itemHandler = _ext.getCapability(Capabilities.ItemHandler.BLOCK, pos, null);
					if (_itemHandler != null)
						return _itemHandler.getStackInSlot(slotid).getCount();
				}
				return 0;
			}
		}.getAmount(world, BlockPos.containing(x, y, z), 1) == 0 || (new Object() {
			public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
				if (world instanceof ILevelExtension _ext) {
					IItemHandler _itemHandler = _ext.getCapability(Capabilities.ItemHandler.BLOCK, pos, null);
					if (_itemHandler != null)
						return _itemHandler.getStackInSlot(slotid).copy();
				}
				return ItemStack.EMPTY;
			}
		}.getItemStack(world, BlockPos.containing(x, y, z), 1)).getItem() == SatiscrafteryModItems.LIMESTONE.get() && new Object() {
			public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
				if (world instanceof ILevelExtension _ext) {
					IItemHandler _itemHandler = _ext.getCapability(Capabilities.ItemHandler.BLOCK, pos, null);
					if (_itemHandler != null)
						return _itemHandler.getStackInSlot(slotid).getCount();
				}
				return 0;
			}
		}.getAmount(world, BlockPos.containing(x, y, z), 1) < 64)) {
			if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
				ItemStack _setstack = new ItemStack(SatiscrafteryModItems.LIMESTONE.get()).copy();
				_setstack.setCount((int) (new Object() {
					public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
						if (world instanceof ILevelExtension _ext) {
							IItemHandler _itemHandler = _ext.getCapability(Capabilities.ItemHandler.BLOCK, pos, null);
							if (_itemHandler != null)
								return _itemHandler.getStackInSlot(slotid).getCount();
						}
						return 0;
					}
				}.getAmount(world, BlockPos.containing(x, y, z), 1) + 1));
				_itemHandlerModifiable.setStackInSlot(1, _setstack);
			}
		}
	}
}
