package com.mon1tor.obscurity.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab OBSCURITY_TAB = new CreativeModeTab("obscurityTab") {
        @Override
        public ItemStack makeIcon() {
            return null;
        }
    };
}
