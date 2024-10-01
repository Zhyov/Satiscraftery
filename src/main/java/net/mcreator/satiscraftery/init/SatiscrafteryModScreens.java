
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.satiscraftery.init;

import net.neoforged.neoforge.client.event.RegisterMenuScreensEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.mcreator.satiscraftery.client.gui.PortableMinerGUIScreen;
import net.mcreator.satiscraftery.client.gui.HUBGUIScreen;
import net.mcreator.satiscraftery.client.gui.ConstructorGUIScreen;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class SatiscrafteryModScreens {
	@SubscribeEvent
	public static void clientLoad(RegisterMenuScreensEvent event) {
		event.register(SatiscrafteryModMenus.CONSTRUCTOR_GUI.get(), ConstructorGUIScreen::new);
		event.register(SatiscrafteryModMenus.HUBGUI.get(), HUBGUIScreen::new);
		event.register(SatiscrafteryModMenus.PORTABLE_MINER_GUI.get(), PortableMinerGUIScreen::new);
	}
}
