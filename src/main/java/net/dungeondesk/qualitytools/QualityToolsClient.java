package net.dungeondesk.qualitytools;

import net.dungeondesk.qualitytools.screen.ModScreenHandlers;
import net.dungeondesk.qualitytools.screen.custom.BackpackScreen;
import net.fabricmc.api.ClientModInitializer;
import net.minecraft.client.gui.screen.ingame.HandledScreens;

public class QualityToolsClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        HandledScreens.register(ModScreenHandlers.BACKPACK_SCREEN_HANDLER, BackpackScreen::new);

    }
}
