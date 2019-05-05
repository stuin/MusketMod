package com.stuintech.musket.items;

import net.minecraft.item.CrossbowItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tag.ItemTags;
import net.minecraft.tag.Tag;
import net.minecraft.util.Identifier;

import java.util.function.Predicate;

public class MusketItem extends CrossbowItem {
    //Load item tag for bullets
    public static final Tag<Item> BULLETS = new ItemTags.class_3490(new Identifier("bullet"));

    public MusketItem(Settings settings) {
        super(settings);
    }

    //Set up predicate for choosing bullets
    public static final Predicate<ItemStack> IS_GUN_PROJECTILE = (itemStack_1) -> {
        return itemStack_1.getItem() == ModItems.bullet;
        //return itemStack_1.getItem().matches(BULLETS);
    };

    //Link predicate to musket item
    public Predicate<ItemStack> getHeldProjectilePredicate() {
        return IS_GUN_PROJECTILE;
    }
    public Predicate<ItemStack> getInventoryProjectilePredicate() {
        return IS_GUN_PROJECTILE;
    }
}
