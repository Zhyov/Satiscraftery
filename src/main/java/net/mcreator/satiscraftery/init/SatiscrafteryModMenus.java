
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.satiscraftery.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.common.extensions.IMenuTypeExtension;

import net.minecraft.world.inventory.MenuType;
import net.minecraft.core.registries.Registries;

import net.mcreator.satiscraftery.world.inventory.PortableMinerGUIMenu;
import net.mcreator.satiscraftery.world.inventory.HUBGUIMenu;
import net.mcreator.satiscraftery.world.inventory.ConstructorGUIMenu;
import net.mcreator.satiscraftery.SatiscrafteryMod;

public class SatiscrafteryModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(Registries.MENU, SatiscrafteryMod.MODID);
	public static final DeferredHolder<MenuType<?>, MenuType<ConstructorGUIMenu>> CONSTRUCTOR_GUI = REGISTRY.register("constructor_gui", () -> IMenuTypeExtension.create(ConstructorGUIMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<HUBGUIMenu>> HUBGUI = REGISTRY.register("hubgui", () -> IMenuTypeExtension.create(HUBGUIMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<PortableMinerGUIMenu>> PORTABLE_MINER_GUI = REGISTRY.register("portable_miner_gui", () -> IMenuTypeExtension.create(PortableMinerGUIMenu::new));
}
