package pt.filipejunqueiro.client.mixin;

import net.minecraft.client.Minecraft;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import pt.filipejunqueiro.shared.utility.Logging;


@Mixin(Minecraft.class)
public class InitMixin {
    @Inject(at = @At("HEAD"), method = "run")
    private void init(CallbackInfo ci) {
        Logging.info("Let's start cleaning up the landfill :)");
    }
}
