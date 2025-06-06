package net.dungeondesk.qualitytools.screen;

import net.dungeondesk.qualitytools.QualityTools;
import net.dungeondesk.qualitytools.screen.custom.BackpackScreenHandler;
import net.fabricmc.fabric.api.screenhandler.v1.ExtendedScreenHandlerType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;

public class ModScreenHandlers {
    public static final ScreenHandlerType<BackpackScreenHandler> BACKPACK_SCREEN_HANDLER =
            Registry.register(Registries.SCREEN_HANDLER, Identifier.of(QualityTools.MOD_ID, "backpack_screen_handler"),
                    new ExtendedScreenHandlerType<>(BackpackScreenHandler::new, BlockPos.PACKET_CODEC));

    public static void registerScreenHandlers() {
        QualityTools.LOGGER.info("Registering Screen Handlers for " + QualityTools.MOD_ID);
    }
}