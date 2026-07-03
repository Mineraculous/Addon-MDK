package com.example.exampleaddon;

import dev.thomasglasser.tommylib.api.platform.TommyLibServices;
import net.minecraft.resources.ResourceLocation;
import net.neoforged.fml.common.Mod;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Mod(ExampleAddon.MOD_ID)
public class ExampleAddon {
    public static final String MOD_ID = "exampleaddon";
    public static final String MOD_NAME = "Example Addon";
    private static final Logger LOGGER = LoggerFactory.getLogger(MOD_NAME);

    public ExampleAddon() {
        LOGGER.info("Initializing {} for {} in a {} environment...", MOD_NAME, TommyLibServices.PLATFORM.getPlatformName(), TommyLibServices.PLATFORM.getEnvironmentName());
    }

    public static ResourceLocation modLoc(String path) {
        return ResourceLocation.fromNamespaceAndPath(MOD_ID, path);
    }
}