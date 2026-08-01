package dev.hero;

import net.fabricmc.api.ClientModInitializer;

public class HeroVisuals implements ClientModInitializer {

    public static final String NAME = "HeroVisuals";

    @Override
    public void onInitializeClient() {
        System.out.println(NAME + " loaded!");
    }
}
