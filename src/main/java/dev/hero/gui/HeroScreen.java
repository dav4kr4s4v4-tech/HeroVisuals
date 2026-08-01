package dev.hero.gui;

import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.text.Text;

public class HeroScreen extends Screen {

    public HeroScreen() {
        super(Text.of("HeroVisuals"));
    }

    @Override
    public void render(DrawContext context, int mouseX, int mouseY, float delta) {

        this.renderBackground(context, mouseX, mouseY, delta);

        context.drawText(
                this.textRenderer,
                "HeroVisuals",
                20,
                20,
                0xFFFFFF,
                true
        );

        context.drawText(
                this.textRenderer,
                "Visual   Themes   HUD   Binds   Utils",
                20,
                45,
                0xAAAAAA,
                false
        );

        super.render(context, mouseX, mouseY, delta);
    }
}
