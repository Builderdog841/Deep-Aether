package teamrazor.deepaether.deepaether.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;
import teamrazor.deepaether.client.renderer.QuailRenderer;
import teamrazor.deepaether.client.renderer.AetherFishRenderer;
import teamrazor.deepaether.init.DeepAetherModEntities;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class DeepAetherModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(DeepAetherModEntities.AETHER_FISH.get(), AetherFishRenderer::new);
		event.registerEntityRenderer(DeepAetherModEntities.QUAIL.get(), QuailRenderer::new);
	}
}