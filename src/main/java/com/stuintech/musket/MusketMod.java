package com.stuintech.musket;

import com.stuintech.musket.items.ModItems;
import net.fabricmc.api.ModInitializer;

public class MusketMod implements ModInitializer {
    public static final String MODID = "musket";

    @Override
    public void onInitialize() {
        ModItems.register();
    }
}
