package io.github.hummel009.minecraft.trop.init;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ItemGroups {
	public static final CreativeModeTab TAB_RINGS = new CreativeModeTab("trop.rings") {
		@Override
		public ItemStack makeIcon() {
			return new ItemStack(Items.RING_NARYA.get());
		}
	};

	private ItemGroups() {
	}
}