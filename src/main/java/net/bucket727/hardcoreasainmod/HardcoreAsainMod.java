package net.bucket727.hardcoreasainmod;

import net.bucket727.hardcoreasainmod.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HardcoreAsainMod implements ModInitializer {
	public static final String MOD_ID = "hardcoreasainmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
	}
}