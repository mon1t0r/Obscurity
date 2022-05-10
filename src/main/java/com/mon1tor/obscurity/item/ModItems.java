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

    public static final RegistryObject<Item> BRONZE_INGOT = ITEMS.register("bronze_ingot", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.OBSCURITY_MATERIALS)));   //METALS
    public static final RegistryObject<Item> TIN_INGOT = ITEMS.register("tin_ingot", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.OBSCURITY_MATERIALS)));
    public static final RegistryObject<Item> SILVER_INGOT = ITEMS.register("silver_ingot", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.OBSCURITY_MATERIALS)));
    public static final RegistryObject<Item> PLATINUM_INGOT = ITEMS.register("platinum_ingot", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.OBSCURITY_MATERIALS)));
    public static final RegistryObject<Item> LEAD_INGOT = ITEMS.register("lead_ingot", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.OBSCURITY_MATERIALS)));
    public static final RegistryObject<Item> ZINC_INGOT = ITEMS.register("zinc_ingot", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.OBSCURITY_MATERIALS)));
    public static final RegistryObject<Item> BRONZE_NUGGET = ITEMS.register("bronze_nugget", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.OBSCURITY_MATERIALS)));
    public static final RegistryObject<Item> TIN_NUGGET = ITEMS.register("tin_nugget", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.OBSCURITY_MATERIALS)));
    public static final RegistryObject<Item> SILVER_NUGGET = ITEMS.register("silver_nugget", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.OBSCURITY_MATERIALS)));
    public static final RegistryObject<Item> PLATINUM_NUGGET = ITEMS.register("platinum_nugget", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.OBSCURITY_MATERIALS)));
    public static final RegistryObject<Item> LEAD_NUGGET = ITEMS.register("lead_nugget", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.OBSCURITY_MATERIALS)));
    public static final RegistryObject<Item> ZINC_NUGGET = ITEMS.register("zinc_nugget", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.OBSCURITY_MATERIALS)));
    public static final RegistryObject<Item> RAW_TIN = ITEMS.register("raw_tin", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.OBSCURITY_MATERIALS)));
    public static final RegistryObject<Item> RAW_SILVER = ITEMS.register("raw_silver", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.OBSCURITY_MATERIALS)));
    public static final RegistryObject<Item> RAW_PLATINUM = ITEMS.register("raw_platinum", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.OBSCURITY_MATERIALS)));
    public static final RegistryObject<Item> RAW_LEAD = ITEMS.register("raw_lead", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.OBSCURITY_MATERIALS)));
    public static final RegistryObject<Item> RAW_ZINC = ITEMS.register("raw_zinc", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.OBSCURITY_MATERIALS)));
    public static final RegistryObject<Item> AGATE = ITEMS.register("agate", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.OBSCURITY_MATERIALS)));            //GEMS
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
    public static final RegistryObject<Item> WINE_STONE = ITEMS.register("wine_stone", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.OBSCURITY_MATERIALS)));    //OTHER
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

    public static final RegistryObject<Item> COPPER_NUGGET = ITEMS.register("copper_nugget", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
