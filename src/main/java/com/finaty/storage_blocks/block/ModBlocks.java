package com.finaty.storage_blocks.block;

import com.finaty.storage_blocks.StorageBlocks;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {


    public static final Block SUGAR_CANE_BLOCK = registerBlock("sugar_cane_block",
            new Block(AbstractBlock.Settings.create().requiresTool().sounds(BlockSoundGroup.BAMBOO_WOOD).strength(5f)));

    public static final Block PAPER_BLOCK = registerBlock("paper_block",
            new Block(AbstractBlock.Settings.create().requiresTool().sounds(BlockSoundGroup.BAMBOO_WOOD).strength(5f)));


//AbstractBlock.Settings.copy(Blocks.DIAMOND_BLOCK).sounds(BlockSoundGroup.STONE)));




    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(StorageBlocks.MOD_ID, name), block);
    }
    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, Identifier.of(StorageBlocks.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }
    public static void registerModBlocks() {
        StorageBlocks.LOGGER.info("Registering ModBlocks for " + StorageBlocks.MOD_ID);
    }
}
