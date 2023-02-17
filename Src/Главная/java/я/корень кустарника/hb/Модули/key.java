package me.bushroot.hb.Modules;

import me.bushroot.hb.gui;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.screen.ChatScreen;
import net.minecraftforge.client.event.InputEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class key {
    @SubscribeEvent
    public void key(InputEvent.KeyInputEvent e) {
        int p = e.getKey();

        if (!(Minecraft.getInstance().screen instanceof ChatScreen)) {
            if (p == 73 && e.getAction() == 1) {
                gui.show = !gui.show;
            } if (p == 75) {
                Hitbox.setSize(Hitbox.size + 0.05);
            } if (p == 74) {
                Hitbox.setSize(Hitbox.size - 0.05);
            }
        }
    }
}
