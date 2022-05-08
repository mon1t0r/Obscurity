package com.mon1tor.obscurity.world.feature;

import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.configurations.CountConfiguration;

public class ModConfiguredFeatures {
    public static final Holder<ConfiguredFeature<CountConfiguration, ?>> SHELL = FeatureUtils.register("shell",
            ModFeatures.SHELL.get(), new CountConfiguration(5));
}
