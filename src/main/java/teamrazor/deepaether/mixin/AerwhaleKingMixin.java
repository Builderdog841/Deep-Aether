package teamrazor.deepaether.mixin;

import com.aetherteam.aether.entity.AetherBossMob;
import com.aetherteam.aether.entity.monster.dungeon.boss.SunSpirit;
import com.legacy.lost_aether.entity.AerwhaleKingEntity;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.server.level.ServerBossEvent;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.FlyingMob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.PathfinderMob;
import net.minecraft.world.entity.monster.Enemy;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraftforge.entity.IEntityAdditionalSpawnData;
import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import teamrazor.deepaether.DeepAetherConfig;
import teamrazor.deepaether.entity.IPlayerBossFight;
import teamrazor.deepaether.init.DAItems;

import javax.annotation.Nullable;

@Pseudo
@Mixin(value = AerwhaleKingEntity.class)
public abstract class AerwhaleKingMixin implements AetherBossMob<AerwhaleKingEntity> {

    @Inject(at = @At("TAIL"), method = "onDungeonPlayerAdded", remap = false)
    private void onDungeonPlayerAdded(Player player, CallbackInfo ci) {
        if (player instanceof ServerPlayer serverPlayer) {
            ((IPlayerBossFight) serverPlayer).deep_Aether$setHasBeenHurt(false);
        }
    }
}
