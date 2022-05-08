package com.mon1tor.obscurity.world.gen;

import com.mon1tor.obscurity.world.feature.ModAquaticPlacements;
import net.minecraft.core.Holder;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraftforge.event.world.BiomeLoadingEvent;

import java.util.List;

public class ModAquaticGeneration {
    public static void generateAquatic(final BiomeLoadingEvent event) {
        List<Holder<PlacedFeature>> base = event.getGeneration().getFeatures(GenerationStep.Decoration.VEGETAL_DECORATION);

        base.add(ModAquaticPlacements.SHELL);
    }
}
