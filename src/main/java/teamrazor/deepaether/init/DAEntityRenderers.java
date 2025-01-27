package teamrazor.deepaether.init;

import net.minecraft.client.model.BoatModel;
import net.minecraft.client.model.ChestBoatModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.renderer.blockentity.HangingSignRenderer;
import net.minecraft.client.renderer.blockentity.SignRenderer;
import net.minecraft.client.renderer.entity.ThrownItemRenderer;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import teamrazor.deepaether.DeepAetherMod;
import teamrazor.deepaether.client.model.AerglowFishModel;
import teamrazor.deepaether.client.renderer.*;
import teamrazor.deepaether.entity.DABoatEntity;


@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class DAEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(DAEntities.AETHER_FISH.get(), AetherFishRenderer::new);
		event.registerEntityRenderer(DAEntities.QUAIL.get(), QuailRenderer::new);
		event.registerEntityRenderer(DAEntities.VENOMITE.get(), VenomiteRenderer::new);

		event.registerBlockEntityRenderer(DABlockEntityTypes.SIGN.get(), SignRenderer::new);
		event.registerBlockEntityRenderer(DABlockEntityTypes.HANGING_SIGN.get(), HangingSignRenderer::new);

		event.registerEntityRenderer(DAEntities.BOAT.get(), context -> new DABoatRenderer<>(context, false));
		event.registerEntityRenderer(DAEntities.CHEST_BOAT.get(), context -> new DABoatRenderer<>(context, true));
		event.registerEntityRenderer(DAEntities.QUAIL_EGG.get(), ThrownItemRenderer::new);

		event.registerEntityRenderer(DAEntities.FIRE_PROJECTILE.get(), FireProjectileRenderer::new);
	}
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(DeepAetherModelLayers.AERGLOW_FISH, AerglowFishModel::createBodyLayer);
		for (DABoatEntity.Type type : DABoatEntity.Type.values()) {
			event.registerLayerDefinition(new ModelLayerLocation(new ResourceLocation(DeepAetherMod.MODID, type.getModelLocation()), "main"), BoatModel::createBodyModel);
			event.registerLayerDefinition(new ModelLayerLocation(new ResourceLocation(DeepAetherMod.MODID, type.getChestModelLocation()), "main"), ChestBoatModel::createBodyModel);
		}

	}
}