package net.sb3369369.mccourse;

import net.fabricmc.api.ModInitializer;
import net.sb3369369.mccourse.block.ModBlocks;
import net.sb3369369.mccourse.item.ModItems;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MCCourseMod implements ModInitializer {
	public static final String MOD_ID = "mccourse";
	public static final Logger LOGGER = LogManager.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();


	}
}
