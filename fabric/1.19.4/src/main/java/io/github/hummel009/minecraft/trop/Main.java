package io.github.hummel009.minecraft.trop;

import io.github.hummel009.minecraft.trop.init.ItemGroups;
import io.github.hummel009.minecraft.trop.init.Items;
import net.fabricmc.api.ModInitializer;

public class Main implements ModInitializer {
	@SuppressWarnings("unused")
	public static final String DISABLE_CURSEFORGE_DUPLICATE_NOTICE = "111229022024";

	@Override
	public void onInitialize() {
		Items.register();
		ItemGroups.forceClassLoad();
	}
}