package com.mon1tor.obscurity;

import com.mojang.logging.LogUtils;
import com.mon1tor.obscurity.block.ModBlocks;
import com.mon1tor.obscurity.item.ModItems;
import com.mon1tor.obscurity.world.feature.ModFeatures;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod(Obscurity.MOD_ID)
public class Obscurity {
    public static final String MOD_ID = "obscurity";
    public static final Logger LOGGER = LogUtils.getLogger();

    public Obscurity() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        modEventBus.addListener(this::setup);
        modEventBus.addListener(this::clientSetup);

        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);
        ModFeatures.register(modEventBus);

        MinecraftForge.EVENT_BUS.register(this);
        //chanceTest();
    }

    private void setup(final FMLCommonSetupEvent event) {
    }

    private void clientSetup(final FMLClientSetupEvent event) {
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.SHELL.get(), RenderType.cutout());
    }

    /*private static final Random rand = new Random();

    public static void chanceTest() {
        long[] stats = new long[] { 0, 0, 0, 0, 0 };
        final long total = 10000000;
        for(long i = 0; i < total; ++i) {
            ++stats[getLoot()];
        }
        System.out.print("TEST RESULTS:\n");
        for(int i = 1; i < stats.length; ++i) {
            System.out.print("THING_" + i + ": " + (stats[i] / (double) total) + "\n");
        }
        System.out.print("NOTHING: " + (stats[0] / (double) total) + "\n");
    }

    public static int getLoot() {
        if(rand.nextFloat() <= 0.04f)
            return 1; //THING_1
        else if(rand.nextFloat() <= 0.0833f)
            return 2; //THING_2
        else if(rand.nextFloat() <= 0.1365f)
            return 3; //THING_3
        else if(rand.nextFloat() <= 0.3424f)
            return 4; //THING_4
        return 0; //NOTHING
    }*/
}
