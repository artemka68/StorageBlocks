package com.finaty.storage_blocks.block;

import com.finaty.storage_blocks.StorageBlocks;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class SBBlocks {


    public static final Block SUGAR_CANE_CRATE = registerBlock("sugar_cane_crate",
            new Block(AbstractBlock.Settings.create().sounds(BlockSoundGroup.BAMBOO_WOOD).strength(2f)));

    public static final Block PAPER_CRATE = registerBlock("paper_crate",
            new Block(AbstractBlock.Settings.create().sounds(BlockSoundGroup.BAMBOO_WOOD).strength(2f)));

    public static final Block LEATHER_CRATE = registerBlock("leather_crate",
            new Block(AbstractBlock.Settings.create().sounds(BlockSoundGroup.BAMBOO_WOOD).strength(2f)));

    public static final Block FEATHER_CRATE = registerBlock("feather_crate",
            new Block(AbstractBlock.Settings.create().sounds(BlockSoundGroup.BAMBOO_WOOD).strength(2f)));

    public static final Block GUNPOWDER_CRATE = registerBlock("gunpowder_crate",
            new Block(AbstractBlock.Settings.create().sounds(BlockSoundGroup.BAMBOO_WOOD).strength(2f)));

    public static final Block SUGAR_CRATE = registerBlock("sugar_crate",
            new Block(AbstractBlock.Settings.create().sounds(BlockSoundGroup.BAMBOO_WOOD).strength(2f)));

    public static final Block BLAZE_ROD_CRATE = registerBlock("blaze_rod_crate",
            new Block(AbstractBlock.Settings.create().sounds(BlockSoundGroup.BAMBOO_WOOD).strength(2f)));

    public static final Block BLAZE_POWDER_CRATE = registerBlock("blaze_powder_crate",
            new Block(AbstractBlock.Settings.create().sounds(BlockSoundGroup.BAMBOO_WOOD).strength(2f)));

    public static final Block BONE_CRATE = registerBlock("bone_crate",
            new Block(AbstractBlock.Settings.create().sounds(BlockSoundGroup.BAMBOO_WOOD).strength(2f)));

    public static final Block STRING_CRATE = registerBlock("string_crate",
            new Block(AbstractBlock.Settings.create().sounds(BlockSoundGroup.BAMBOO_WOOD).strength(2f)));



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
