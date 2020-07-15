package com.stuintech.musket.items;

import net.minecraft.item.CrossbowItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;

import java.util.function.Predicate;

public class MusketItem extends CrossbowItem {

    public MusketItem(Settings settings) {
        super(settings);
    }

    //Set up predicate for choosing bullets
    public static final Predicate<ItemStack> IS_GUN_PROJECTILE = (itemStack_1) -> {
        return itemStack_1.getItem() == ModItems.bullet;
        //return itemStack_1.getItem().matches(BULLETS);
    };

    @Override
    public Predicate<ItemStack> getHeldProjectiles() {
        return IS_GUN_PROJECTILE;
    }

    @Override
    public Predicate<ItemStack> getProjectiles() {
        return IS_GUN_PROJECTILE;
    }

    @Override
    public boolean equals(Object o) {
        if(o == Items.CROSSBOW)
            return true;
        return super.equals(o);
    }
}
