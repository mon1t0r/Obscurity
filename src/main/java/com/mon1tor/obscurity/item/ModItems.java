package com.mon1tor.obscurity.item;

import com.mon1tor.obscurity.Obscurity;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Obscurity.MOD_ID);

    public static final RegistryObject<Item> ALBEDO = ITEMS.register("albedo", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.OBSCURITY_CATALYSTS)));
    public static final RegistryObject<Item> NIGREDO = ITEMS.register("nigredo", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.OBSCURITY_CATALYSTS)));
    public static final RegistryObject<Item> RUBEDO = ITEMS.register("rubedo", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.OBSCURITY_CATALYSTS)));
    public static final RegistryObject<Item> AETHER = ITEMS.register("aether", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.OBSCURITY_CATALYSTS)));
    public static final RegistryObject<Item> VITRIOL = ITEMS.register("vitriol", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.OBSCURITY_CATALYSTS)));
    public static final RegistryObject<Item> QUEBRITH = ITEMS.register("quebrith", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.OBSCURITY_CATALYSTS)));
    public static final RegistryObject<Item> REBIS = ITEMS.register("rebis", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.OBSCURITY_CATALYSTS)));
    public static final RegistryObject<Item> HYDRAGENUM = ITEMS.register("hydragenum", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.OBSCURITY_CATALYSTS)));

    public static final RegistryObject<Item> AGATE = ITEMS.register("agate", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.OBSCURITY_MATERIALS)));
    public static final RegistryObject<Item> APATITE = ITEMS.register("apatite", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.OBSCURITY_MATERIALS)));
    public static final RegistryObject<Item> AQUAMARINE = ITEMS.register("aquamarine", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.OBSCURITY_MATERIALS)));
    public static final RegistryObject<Item> AVENTURINE = ITEMS.register("aventurine", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.OBSCURITY_MATERIALS)));
    public static final RegistryObject<Item> CHRYSOLITE = ITEMS.register("chrysolite", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.OBSCURITY_MATERIALS)));
    public static final RegistryObject<Item> HYACINTH = ITEMS.register("hyacinth", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.OBSCURITY_MATERIALS)));
    public static final RegistryObject<Item> JADE = ITEMS.register("jade", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.OBSCURITY_MATERIALS)));
    public static final RegistryObject<Item> JASPER = ITEMS.register("jasper", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.OBSCURITY_MATERIALS)));
    public static final RegistryObject<Item> TOURMALINE = ITEMS.register("tourmaline", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.OBSCURITY_MATERIALS)));
    public static final RegistryObject<Item> FLAWLESS_EMERALD = ITEMS.register("flawless_emerald", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.OBSCURITY_MATERIALS)));
    public static final RegistryObject<Item> TOPAZ = ITEMS.register("topaz", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.OBSCURITY_MATERIALS)));
    public static final RegistryObject<Item> TANZANITE = ITEMS.register("tanzanite", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.OBSCURITY_MATERIALS)));
    public static final RegistryObject<Item> WINE_STONE = ITEMS.register("wine_stone", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.OBSCURITY_MATERIALS)));
    public static final RegistryObject<Item> CINNABAR = ITEMS.register("cinnabar", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.OBSCURITY_MATERIALS)));
    public static final RegistryObject<Item> CINNABAR_DUST = ITEMS.register("cinnabar_dust", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.OBSCURITY_MATERIALS)));
    public static final RegistryObject<Item> PEARL_DUST = ITEMS.register("pearl_dust", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.OBSCURITY_MATERIALS)));
    public static final RegistryObject<Item> BLACK_PEARL_DUST = ITEMS.register("black_pearl_dust", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.OBSCURITY_MATERIALS)));
    public static final RegistryObject<Item> PHOSPHORUS = ITEMS.register("phosphorus", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.OBSCURITY_MATERIALS)));

    public static final RegistryObject<Item> TREATISE_1 = ITEMS.register("treatise_1", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.OBSCURITY_MISC)));
    public static final RegistryObject<Item> TREATISE_2 = ITEMS.register("treatise_2", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.OBSCURITY_MISC)));
    public static final RegistryObject<Item> TREATISE_3 = ITEMS.register("treatise_3", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.OBSCURITY_MISC)));
    public static final RegistryObject<Item> TREATISE_4 = ITEMS.register("treatise_4", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.OBSCURITY_MISC)));
    public static final RegistryObject<Item> TREATISE_5 = ITEMS.register("treatise_5", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.OBSCURITY_MISC)));
    public static final RegistryObject<Item> PEARL = ITEMS.register("pearl", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.OBSCURITY_MISC)));
    public static final RegistryObject<Item> BLACK_PEARL = ITEMS.register("black_pearl", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.OBSCURITY_MISC)));
    public static final RegistryObject<Item> BIG_PEARL = ITEMS.register("big_pearl", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.OBSCURITY_MISC)));
    public static final RegistryObject<Item> BIG_BLACK_PEARL = ITEMS.register("big_black_pearl", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.OBSCURITY_MISC)));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
