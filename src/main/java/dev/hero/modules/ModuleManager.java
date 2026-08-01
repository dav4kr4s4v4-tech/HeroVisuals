package dev.hero.modules;

import java.util.ArrayList;
import java.util.List;

public class ModuleManager {

    private static final List<Module> modules = new ArrayList<>();

    public static void init() {
        modules.add(new Module("Particles", Category.VISUAL));
        modules.add(new Module("WorldParticles", Category.VISUAL));
        modules.add(new Module("ChinaHat", Category.VISUAL));
        modules.add(new Module("JumpCircles", Category.VISUAL));

        modules.add(new Module("ElytraSwap", Category.UTILS));

        modules.add(new Module("Watermark", Category.HUD));
        modules.add(new Module("FPS", Category.HUD));
        modules.add(new Module("Binds", Category.BINDS));
    }

    public static List<Module> getModules() {
        return modules;
    }

    public static Module getModule(String name) {
        for (Module module : modules) {
            if (module.getName().equalsIgnoreCase(name)) {
                return module;
            }
        }
        return null;
    }
}
