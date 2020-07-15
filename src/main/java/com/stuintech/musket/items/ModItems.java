package com.stuintech.musket.items;

import com.stuintech.musket.MusketMod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.registry.Registry;

public class ModItems {
    public static final Item.Settings WEAPONSETTINGS = new Item.Settings().maxCount(1).group(ItemGroup.COMBAT);
    public static final Item.Settings AMMOSETTINGS = new Item.Settings().group(ItemGroup.COMBAT);

    //Base Items
    public static final Item rifle = new MusketItem(WEAPONSETTINGS);
    public static final Item bullet = new BulletItem(AMMOSETTINGS);

    //Register items rendering
    public static void register() {
        registerItem("rifle", rifle);
        registerItem("bullet", bullet);
    }

    private static void registerItem(String name, Item item) {
        Registry.register(Registry.ITEM, MusketMod.MODID + ":" + name, item);
    }
}
