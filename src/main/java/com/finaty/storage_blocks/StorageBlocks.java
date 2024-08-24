package com.finaty.storage_blocks;

import com.finaty.storage_blocks.block.ModBlocks;
import com.finaty.storage_blocks.item.ModItemGroups;
import net.fabricmc.api.ModInitializer;

import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class StorageBlocks implements ModInitializer {
	public static final String MOD_ID = "storageblocks";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModBlocks.registerModBlocks();
	}
	public static Identifier id(String path) {
		return Identifier.of(MOD_ID, path);
	}
}