package io.github.hummel009.minecraft.trop;

import io.github.hummel009.minecraft.trop.handler.ForgeEventHandler;
import io.github.hummel009.minecraft.trop.init.ItemGroups;
import io.github.hummel009.minecraft.trop.init.Items;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("trop")
@SuppressWarnings("UtilityClassWithPublicConstructor")
public class Main {
	@SuppressWarnings("unused")
	public static final String DISABLE_CURSEFORGE_DUPLICATE_NOTICE = "111229022024";

	public Main() {
		var modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

		var forgeEventBus = MinecraftForge.EVENT_BUS;
		var forgeEventHandler = new ForgeEventHandler();
		forgeEventBus.register(forgeEventHandler);

		Items.register(modEventBus);
		ItemGroups.register(modEventBus);
	}
}