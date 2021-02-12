package wtf.boomy.mods.hurtanimationremover.mixin;

import net.minecraft.client.render.GameRenderer;
import net.minecraft.client.util.math.MatrixStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(GameRenderer.class)
public class MixinEntityRenderer {

    @Inject(method = "bobViewWhenHurt", at = @At("HEAD"))
    private void injectBobViewWhenHurt(MatrixStack matrixStack, float f, CallbackInfo ci) {
        ci.cancel();
    }
}
