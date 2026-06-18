package pt.filipejunqueiro.shared.utility;

import net.fabricmc.api.EnvType;
import net.fabricmc.loader.api.FabricLoader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Logging {
    private static final String PREFIX;
    private static final Logger LOGGER;

    static {
        if (FabricLoader.getInstance().getEnvironmentType() == EnvType.SERVER)
            PREFIX = String.format("[%s:%s]", Globals.MOD_NAME, "Server");
        else
            PREFIX = String.format("[%s:%s]", Globals.MOD_NAME, "Client");

        LOGGER = LoggerFactory.getLogger(Globals.MOD_ID);
    }

    public static void info(String message) {
        LOGGER.info(String.join(": ", PREFIX, message));
    }

    public static void warn(String message) {
        LOGGER.warn(String.join(": ", PREFIX, message));
    }

    public static void error(String message) {
        LOGGER.error(String.join(": ", PREFIX, message));
    }
}