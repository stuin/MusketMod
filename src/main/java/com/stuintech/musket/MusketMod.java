package com.stuintech.musket;

import com.stuintech.musket.items.ModItems;
import net.fabricmc.api.ModInitializer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MusketMod implements ModInitializer {
    public static final String MODID = "musket";
    public static final Logger LOGGER = LogManager.getLogger(MODID);

    @Override
    public void onInitialize() {
        ModItems.register();
    }
}
