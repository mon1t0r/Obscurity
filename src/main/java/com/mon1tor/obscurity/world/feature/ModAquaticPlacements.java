package com.mon1tor.obscurity.world.feature;

import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.world.level.levelgen.placement.BiomeFilter;
import net.minecraft.world.level.levelgen.placement.InSquarePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.placement.RarityFilter;

public class ModAquaticPlacements {
    public static final Holder<PlacedFeature> SHELL = PlacementUtils.register("shell", ModConfiguredFeatures.SHELL, RarityFilter.onAverageOnceEvery(22), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_TOP_SOLID, BiomeFilter.biome());
}
