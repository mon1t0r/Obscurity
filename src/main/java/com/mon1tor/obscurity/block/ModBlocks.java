package com.mon1tor.obscurity.block;

import com.mon1tor.obscurity.Obscurity;
import com.mon1tor.obscurity.item.ModCreativeModeTab;
import com.mon1tor.obscurity.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS,  Obscurity.MOD_ID);



    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab itemTab) {
        RegistryObject<T> result = BLOCKS.register(name, block);
        registerBlockItem(name, result, itemTab);
        return result;
    }

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, Item.Properties properties) {
        RegistryObject<T> result = BLOCKS.register(name, block);
        registerBlockItem(name, result, properties);
        return result;
    }

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> result = BLOCKS.register(name, block);
        registerBlockItem(name, result, ModCreativeModeTab.OBSCURITY_TAB);
        return result;
    }

    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block, CreativeModeTab itemTab) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(itemTab)));
    }

    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block, Item.Properties properties) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), properties));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
