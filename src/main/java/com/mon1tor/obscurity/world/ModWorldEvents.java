package com.mon1tor.obscurity.world;

import com.mon1tor.obscurity.Obscurity;
import com.mon1tor.obscurity.world.gen.ModAquaticGeneration;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Obscurity.MOD_ID)
public class ModWorldEvents {
    @SubscribeEvent
    public static void biomeLoadingEvent(final BiomeLoadingEvent event) {
        ModAquaticGeneration.generateAquatic(event);
    }
}
