package teamrazor.deepaether.deepaether.procedures;
/*
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.levelgen.PositionalRandomFactory;
import teamrazor.deepaether.init.DeepAetherModBlocks;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.core.BlockPos;

import java.util.Random;
import java.util.Map;

public class AerglowGrassBlockOnBlockRightClickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() instanceof ShovelItem
				&& DeepAetherModBlocks.AERGLOW_GRASS_BLOCK.get() == (world.getBlockState(new BlockPos(x, y, z))).getBlock()) {
			{
				ItemStack _ist = (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY);
				if (_ist.hurt(1, new RandomSource() {
					@Override
					public RandomSource fork() {
						return null;
					}

					@Override
					public PositionalRandomFactory forkPositional() {
						return null;
					}

					@Override
					public void setSeed(long p_216342_) {

					}

					@Override
					public int nextInt() {
						return 0;
					}

					@Override
					public int nextInt(int p_216331_) {
						return 0;
					}

					@Override
					public long nextLong() {
						return 0;
					}

					@Override
					public boolean nextBoolean() {
						return false;
					}

					@Override
					public float nextFloat() {
						return 0;
					}

					@Override
					public double nextDouble() {
						return 0;
					}

					@Override
					public double nextGaussian() {
						return 0;
					}
				}, null)) {
					_ist.shrink(1);
					_ist.setDamageValue(0);
				}
			}
			{
				BlockPos _bp = new BlockPos(x, y, z);
				BlockState _bs = DeepAetherModBlocks.AERGLOW_GRASS_PATH.get().defaultBlockState();
				BlockState _bso = world.getBlockState(_bp);
				for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
					Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
					if (_property != null && _bs.getValue(_property) != null)
						try {
							_bs = _bs.setValue(_property, (Comparable) entry.getValue());
						} catch (Exception e) {
						}
				}
				BlockEntity _be = world.getBlockEntity(_bp);
				CompoundTag _bnbt = null;
				if (_be != null) {
					_bnbt = _be.saveWithFullMetadata();
					_be.setRemoved();
				}
				world.setBlock(_bp, _bs, 3);
				if (_bnbt != null) {
					_be = world.getBlockEntity(_bp);
					if (_be != null) {
						try {
							_be.load(_bnbt);
						} catch (Exception ignored) {
						}
					}
				}
			}
		}
	}
}
*/