package com.finaty.storage_blocks.item;

import com.finaty.storage_blocks.StorageBlocks;
import com.finaty.storage_blocks.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup STORAGE_BLOCKS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(StorageBlocks.MOD_ID, "storageblocks_group"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.storageblocks_group"))
                    .icon(() -> new ItemStack(ModBlocks.SUGAR_CANE_BLOCK)).entries((displayContext, entries) -> {




                        entries.add(ModBlocks.SUGAR_CANE_BLOCK);
                        entries.add(ModBlocks.PAPER_BLOCK);






                    }).build());

    public static void registerItemGroups() {
        StorageBlocks.LOGGER.info("Registering Item Groups for " + StorageBlocks.MOD_ID);
    }
}