package dev.hero;

import dev.hero.modules.ModuleManager;
import dev.hero.input.KeyHandler;
import net.fabricmc.api.ClientModInitializer;

public class HeroVisuals implements ClientModInitializer {

    public static final String NAME = "HeroVisuals";

    @Override
    public void onInitializeClient() {

        ModuleManager.init();
        KeyHandler.register();

        System.out.println(NAME + " loaded!");
        System.out.println("Modules loaded: " + ModuleManager.getModules().size());
    }
}
