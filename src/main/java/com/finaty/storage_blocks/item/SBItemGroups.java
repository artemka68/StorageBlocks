package com.finaty.storage_blocks.item;

import com.finaty.storage_blocks.StorageBlocks;
import com.finaty.storage_blocks.block.SBBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class SBItemGroups {
    public static final ItemGroup STORAGE_BLOCKS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(StorageBlocks.MOD_ID, "storageblocks_group"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.storageblocks_group"))
                    .icon(() -> new ItemStack(SBBlocks.SUGAR_CANE_CRATE)).entries((displayContext, entries) -> {




                        entries.add(SBBlocks.SUGAR_CANE_CRATE);
                        entries.add(SBBlocks.PAPER_CRATE);
                        entries.add(SBBlocks.LEATHER_CRATE);
                        entries.add(SBBlocks.FEATHER_CRATE);
                        entries.add(SBBlocks.GUNPOWDER_CRATE);
                        entries.add(SBBlocks.SUGAR_CRATE);
                        entries.add(SBBlocks.BLAZE_ROD_CRATE);
                        entries.add(SBBlocks.BLAZE_POWDER_CRATE);
                        entries.add(SBBlocks.BONE_CRATE);
                        entries.add(SBBlocks.STRING_CRATE);






                    }).build());

    public static void registerItemGroups() {
        StorageBlocks.LOGGER.info("Registering Item Groups for " + StorageBlocks.MOD_ID);
    }
}