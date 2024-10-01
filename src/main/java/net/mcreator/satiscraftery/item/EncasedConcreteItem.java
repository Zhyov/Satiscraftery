
package net.mcreator.satiscraftery.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class EncasedConcreteItem extends Item {
	public EncasedConcreteItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
