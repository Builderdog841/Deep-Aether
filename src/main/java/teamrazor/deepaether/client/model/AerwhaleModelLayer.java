package teamrazor.deepaether.client.model;

import com.aetherteam.aether.client.renderer.entity.model.AerwhaleModel;
import com.aetherteam.aether.entity.passive.Aerwhale;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.RenderLayerParent;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.resources.ResourceLocation;
import teamrazor.deepaether.DeepAetherMod;
import teamrazor.deepaether.entity.AerwhaleSaddleable;

public class AerwhaleModelLayer extends RenderLayer<Aerwhale, AerwhaleModel> {
    private static final RenderType SADDLED_AERWHALE = RenderType.armorCutoutNoCull(new ResourceLocation(DeepAetherMod.MODID, "textures/entity/aerwhale_saddled.png"));
    public AerwhaleModelLayer(RenderLayerParent<Aerwhale, AerwhaleModel> parent) {
        super(parent);
    }

    @Override
    public void render(PoseStack poseStack, MultiBufferSource buffer, int packedLight, Aerwhale aerwhale, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
        if (((AerwhaleSaddleable) aerwhale).isSaddled() && !aerwhale.isInvisible()) {
            VertexConsumer consumer = buffer.getBuffer(SADDLED_AERWHALE);
            this.getParentModel().renderToBuffer(poseStack, consumer, packedLight, OverlayTexture.NO_OVERLAY, 1.0F, 1.0F, 1.0F, 1.0F);
        }
    }
}