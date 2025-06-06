package net.dungeondesk.qualitytools;

import net.dungeondesk.qualitytools.block.entity.ModBlockEntities;
import net.dungeondesk.qualitytools.block.entity.renderer.BackpackBlockEntityRenderer;
import net.dungeondesk.qualitytools.screen.ModScreenHandlers;
import net.dungeondesk.qualitytools.screen.custom.BackpackScreen;
import net.fabricmc.api.ClientModInitializer;
import net.minecraft.client.gui.screen.ingame.HandledScreens;
import net.minecraft.client.render.block.entity.BlockEntityRendererFactories;

public class QualityToolsClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {

        BlockEntityRendererFactories.register(ModBlockEntities.BACKPACK_BE, BackpackBlockEntityRenderer::new);
        HandledScreens.register(ModScreenHandlers.BACKPACK_SCREEN_HANDLER, BackpackScreen::new);

    }
}
