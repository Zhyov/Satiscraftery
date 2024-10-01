
package net.mcreator.satiscraftery.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class ReinforcedIronPlateItem extends Item {
	public ReinforcedIronPlateItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
