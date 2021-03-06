package net.tslat.aoa3.worldgen.trees;

import net.minecraft.block.state.IBlockState;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.tslat.aoa3.block.functional.saplings.SaplingBlock;
import net.tslat.aoa3.common.registration.BlockRegister;

import javax.annotation.Nullable;
import java.util.Random;

public class WorldGenIrodustTree extends WorldGenTree {
	public WorldGenIrodustTree(@Nullable SaplingBlock sapling) {
		super(sapling);
	}

	@Override
	public boolean generate(World world, Random rand, BlockPos pos) {
		if (rand.nextBoolean()) {
			return generateTree1(world, rand, pos);
		}
		else {
			return generateTree2(world, rand, pos);
		}
	}

	private boolean generateTree1(World world, Random rand, BlockPos pos) {
		int trunkHeight = 8 + rand.nextInt(6);

		if (!checkSafeHeight(world, pos, trunkHeight + 1, 1))
			return false;

		if (!checkAndPrepSoil(world, pos, 1))
			return false;

		BlockPos.MutableBlockPos movablePos = new BlockPos.MutableBlockPos(pos.down());
		IBlockState log = BlockRegister.IRO_LOG.getDefaultState();
		IBlockState leaves = BlockRegister.IRODUST_LEAVES.getDefaultState();

		for (int i = 0; i < trunkHeight; i++) {
			placeBlock(world, movablePos.move(EnumFacing.UP), log);
		}

		int treeWidth = 1 + rand.nextInt(2);

		for (int x = -treeWidth - 1; x <= treeWidth + 1; x++) {
			for (int z = -treeWidth - 1; z <= treeWidth + 1; z++) {
				if (Math.abs(x) != treeWidth + 1 && Math.abs(z) != treeWidth + 1) {
					placeBlock(world, movablePos.add(x, 1, z), leaves);
				}
				else {
					placeBlock(world, movablePos.add(x, 0, z), leaves);
				}
			}
		}

		buildLeafRing(world, movablePos.add(0, -1, 0), treeWidth + 1, true);

		return true;
	}

	private boolean generateTree2(World world, Random rand, BlockPos pos) {
		int trunkHeight = 8 + rand.nextInt(6);

		if (!checkSafeHeight(world, pos, trunkHeight + 2, 1))
			return false;

		if (!checkAndPrepSoil(world, pos, 1))
			return false;

		BlockPos.MutableBlockPos movablePos = new BlockPos.MutableBlockPos(pos.down());
		IBlockState log = BlockRegister.IRO_LOG.getDefaultState();
		IBlockState leaves = BlockRegister.IRODUST_LEAVES.getDefaultState();

		for (int i = 0; i < trunkHeight; i++) {
			placeBlock(world, movablePos.move(EnumFacing.UP), log);
		}

		buildLeafRing(world, movablePos.add(0, -(trunkHeight / 1.75), 0), 3, false);
		buildLeafRing(world, movablePos.add(0, -(trunkHeight / 4), 0), 2, true);

		for (int x = -1; x <= 1; x++) {
			for (int y = 0; y <= 1; y++) {
				for (int z = -1; z <= 1; z++) {
					placeBlock(world, movablePos.add(x, y, z), leaves);
				}
			}
		}

		return true;
	}

	private void buildLeafRing(World world, BlockPos pos, int radius, boolean fullRing) {
		IBlockState log = BlockRegister.IRO_LOG.getDefaultState();
		IBlockState leaves = BlockRegister.IRODUST_LEAVES.getDefaultState();

		for (int x = -radius; x <= radius; x++) {
			for (int z = -radius; z <= radius; z++) {
				if (Math.abs(x) == radius || Math.abs(z) == radius) {
					if (fullRing || !(Math.abs(x) == radius && Math.abs(z) == radius))
						placeBlock(world, pos.add(x, 0, z), leaves);
				}
				else if (x == 0 ^ z == 0) {
					placeBlock(world, pos.add(x, 0, z), log);
				}
			}
		}
	}
}
