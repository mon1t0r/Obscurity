package com.mon1tor.obscurity.item;

import com.mon1tor.obscurity.Obscurity;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Obscurity.MOD_ID);



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
