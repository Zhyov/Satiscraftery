
package net.mcreator.satiscraftery.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class LimestoneItem extends Item {
	public LimestoneItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
