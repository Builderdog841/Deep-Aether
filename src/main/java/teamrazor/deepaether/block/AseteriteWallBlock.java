
package teamrazor.deepaether.block;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.WallBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.ItemStack;
import net.minecraft.core.BlockPos;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import teamrazor.deepaether.init.DeepAetherModBlocks;


import java.util.List;
import java.util.Collections;

public class AseteriteWallBlock extends WallBlock {
	public AseteriteWallBlock() {
		super(BlockBehaviour.Properties.of(Material.STONE)
				.strength(5f).requiresCorrectToolForDrops());
	}
}
