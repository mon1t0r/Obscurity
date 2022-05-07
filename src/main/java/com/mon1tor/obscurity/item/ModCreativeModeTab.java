package com.mon1tor.obscurity.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.client.event.ColorHandlerEvent;

public class ModCreativeModeTab {
    public static final CreativeModeTab OBSCURITY_MATERIALS = new CreativeModeTab("obscurityMaterials") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.TOPAZ.get());
        }
    };
    public static final CreativeModeTab OBSCURITY_MISC = new CreativeModeTab("obscurityMisc") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.PEARL.get());
        }
    };
    public static final CreativeModeTab OBSCURITY_CATALYSTS = new CreativeModeTab("obscurityCatalysts") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.AETHER.get());
        }
    };
    public static final CreativeModeTab OBSCURITY_BLOCKS = new CreativeModeTab("obscurityBlocks") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(Items.AXOLOTL_BUCKET);
        }
    };
    public static final CreativeModeTab OBSCURITY_APPARATUS = new CreativeModeTab("obscurityApparatus") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(Items.AXOLOTL_BUCKET);
        }
    };
    public static final CreativeModeTab OBSCURITY_DECORATIONS = new CreativeModeTab("obscurityDecorations") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(Items.AXOLOTL_BUCKET);
        }
    };
    public static final CreativeModeTab OBSCURITY_EQUIPMENT = new CreativeModeTab("obscurityEquipment") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(Items.AXOLOTL_BUCKET);
        }
    };
}