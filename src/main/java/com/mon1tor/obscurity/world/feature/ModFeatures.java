package com.mon1tor.obscurity.world.feature;

import com.mon1tor.obscurity.Obscurity;
import com.mon1tor.obscurity.world.feature.custom.ShellFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.CountConfiguration;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModFeatures {
    public static final DeferredRegister<Feature<?>> FEATURES = DeferredRegister.create(ForgeRegistries.FEATURES, Obscurity.MOD_ID);

    public static final RegistryObject<Feature<CountConfiguration>> SHELL = FEATURES.register("shell", () -> new ShellFeature(CountConfiguration.CODEC));

    public static void register(IEventBus eventBus) {
        FEATURES.register(eventBus);
    }
}
