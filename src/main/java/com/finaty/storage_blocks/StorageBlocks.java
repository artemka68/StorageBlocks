package com.finaty.storage_blocks;

import com.finaty.storage_blocks.block.SBBlocks;
import com.finaty.storage_blocks.item.SBItemGroups;
import net.fabricmc.api.ModInitializer;

import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class StorageBlocks implements ModInitializer {
	public static final String MOD_ID = "storageblocks";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		SBItemGroups.registerItemGroups();
		SBBlocks.registerModBlocks();
	}
	public static Identifier id(String path) {
		return Identifier.of(MOD_ID, path);
	}
}