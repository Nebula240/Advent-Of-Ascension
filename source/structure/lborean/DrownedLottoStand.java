package net.tslat.aoa3.structure.lborean;

import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.tslat.aoa3.common.registration.BlockRegister;
import net.tslat.aoa3.entity.npcs.lottoman.EntityBoreicLottoman;
import net.tslat.aoa3.structure.AoAStructure;

import java.util.Random;

public class DrownedLottoStand extends AoAStructure { //StructureSize: 12x11x12
	private static final IBlockState glass = Blocks.GLASS.getDefaultState();
	private static final IBlockState coralBricks = BlockRegister.CORAL_BRICKS.getDefaultState();
	private static final IBlockState water = Blocks.FLOWING_WATER.getDefaultState();

	public DrownedLottoStand() {
		super("DrownedLottoStand");
	}

	@Override
	protected boolean replacesBlocks() {
		return true;
	}

	@Override
	protected void build(World world, Random rand, BlockPos basePos) {
		addBlock(world, basePos, 0, 0, 2, coralBricks);
		addBlock(world, basePos, 0, 0, 9, coralBricks);
		addBlock(world, basePos, 1, 0, 2, coralBricks);
		addBlock(world, basePos, 1, 0, 9, coralBricks);
		addBlock(world, basePos, 2, 0, 0, coralBricks);
		addBlock(world, basePos, 2, 0, 1, coralBricks);
		addBlock(world, basePos, 2, 0, 2, coralBricks);
		addBlock(world, basePos, 2, 0, 3, coralBricks);
		addBlock(world, basePos, 2, 0, 4, coralBricks);
		addBlock(world, basePos, 2, 0, 7, coralBricks);
		addBlock(world, basePos, 2, 0, 8, coralBricks);
		addBlock(world, basePos, 2, 0, 9, coralBricks);
		addBlock(world, basePos, 2, 0, 10, coralBricks);
		addBlock(world, basePos, 2, 0, 11, coralBricks);
		addBlock(world, basePos, 3, 0, 2, coralBricks);
		addBlock(world, basePos, 3, 0, 9, coralBricks);
		addBlock(world, basePos, 4, 0, 2, coralBricks);
		addBlock(world, basePos, 4, 0, 4, coralBricks);
		addBlock(world, basePos, 4, 0, 5, glass);
		addBlock(world, basePos, 4, 0, 6, glass);
		addBlock(world, basePos, 4, 0, 7, coralBricks);
		addBlock(world, basePos, 4, 0, 9, coralBricks);
		addBlock(world, basePos, 5, 0, 4, glass);
		addBlock(world, basePos, 5, 0, 7, glass);
		addBlock(world, basePos, 6, 0, 4, glass);
		addBlock(world, basePos, 6, 0, 7, glass);
		addBlock(world, basePos, 7, 0, 2, coralBricks);
		addBlock(world, basePos, 7, 0, 4, coralBricks);
		addBlock(world, basePos, 7, 0, 5, glass);
		addBlock(world, basePos, 7, 0, 6, glass);
		addBlock(world, basePos, 7, 0, 7, coralBricks);
		addBlock(world, basePos, 7, 0, 9, coralBricks);
		addBlock(world, basePos, 8, 0, 2, coralBricks);
		addBlock(world, basePos, 8, 0, 9, coralBricks);
		addBlock(world, basePos, 9, 0, 0, coralBricks);
		addBlock(world, basePos, 9, 0, 1, coralBricks);
		addBlock(world, basePos, 9, 0, 2, coralBricks);
		addBlock(world, basePos, 9, 0, 3, coralBricks);
		addBlock(world, basePos, 9, 0, 4, coralBricks);
		addBlock(world, basePos, 9, 0, 7, coralBricks);
		addBlock(world, basePos, 9, 0, 8, coralBricks);
		addBlock(world, basePos, 9, 0, 9, coralBricks);
		addBlock(world, basePos, 9, 0, 10, coralBricks);
		addBlock(world, basePos, 9, 0, 11, coralBricks);
		addBlock(world, basePos, 10, 0, 2, coralBricks);
		addBlock(world, basePos, 10, 0, 9, coralBricks);
		addBlock(world, basePos, 11, 0, 2, coralBricks);
		addBlock(world, basePos, 11, 0, 9, coralBricks);
		addBlock(world, basePos, 1, 1, 2, coralBricks);
		addBlock(world, basePos, 1, 1, 9, coralBricks);
		addBlock(world, basePos, 2, 1, 1, coralBricks);
		addBlock(world, basePos, 2, 1, 2, coralBricks);
		addBlock(world, basePos, 2, 1, 3, coralBricks);
		addBlock(world, basePos, 2, 1, 8, coralBricks);
		addBlock(world, basePos, 2, 1, 9, coralBricks);
		addBlock(world, basePos, 2, 1, 10, coralBricks);
		addBlock(world, basePos, 3, 1, 2, coralBricks);
		addBlock(world, basePos, 3, 1, 9, coralBricks);
		addBlock(world, basePos, 8, 1, 2, coralBricks);
		addBlock(world, basePos, 8, 1, 9, coralBricks);
		addBlock(world, basePos, 9, 1, 1, coralBricks);
		addBlock(world, basePos, 9, 1, 2, coralBricks);
		addBlock(world, basePos, 9, 1, 3, coralBricks);
		addBlock(world, basePos, 9, 1, 8, coralBricks);
		addBlock(world, basePos, 9, 1, 9, coralBricks);
		addBlock(world, basePos, 9, 1, 10, coralBricks);
		addBlock(world, basePos, 10, 1, 2, coralBricks);
		addBlock(world, basePos, 10, 1, 9, coralBricks);
		addBlock(world, basePos, 2, 2, 2, glass);
		addBlock(world, basePos, 2, 2, 9, glass);
		addBlock(world, basePos, 9, 2, 2, glass);
		addBlock(world, basePos, 9, 2, 9, glass);
		addBlock(world, basePos, 2, 3, 2, glass);
		addBlock(world, basePos, 2, 3, 9, glass);
		addBlock(world, basePos, 9, 3, 2, glass);
		addBlock(world, basePos, 9, 3, 9, glass);
		addBlock(world, basePos, 2, 4, 2, glass);
		addBlock(world, basePos, 2, 4, 9, glass);
		addBlock(world, basePos, 9, 4, 2, glass);
		addBlock(world, basePos, 9, 4, 9, glass);
		addBlock(world, basePos, 2, 5, 2, glass);
		addBlock(world, basePos, 2, 5, 9, glass);
		addBlock(world, basePos, 9, 5, 2, glass);
		addBlock(world, basePos, 9, 5, 9, glass);
		addBlock(world, basePos, 2, 6, 2, glass);
		addBlock(world, basePos, 2, 6, 9, glass);
		addBlock(world, basePos, 9, 6, 2, glass);
		addBlock(world, basePos, 9, 6, 9, glass);
		addBlock(world, basePos, 2, 7, 2, glass);
		addBlock(world, basePos, 2, 7, 9, glass);
		addBlock(world, basePos, 9, 7, 2, glass);
		addBlock(world, basePos, 9, 7, 9, glass);
		addBlock(world, basePos, 1, 8, 2, coralBricks);
		addBlock(world, basePos, 1, 8, 9, coralBricks);
		addBlock(world, basePos, 2, 8, 1, coralBricks);
		addBlock(world, basePos, 2, 8, 2, coralBricks);
		addBlock(world, basePos, 2, 8, 3, coralBricks);
		addBlock(world, basePos, 2, 8, 8, coralBricks);
		addBlock(world, basePos, 2, 8, 9, coralBricks);
		addBlock(world, basePos, 2, 8, 10, coralBricks);
		addBlock(world, basePos, 3, 8, 2, coralBricks);
		addBlock(world, basePos, 3, 8, 9, coralBricks);
		addBlock(world, basePos, 8, 8, 2, coralBricks);
		addBlock(world, basePos, 8, 8, 9, coralBricks);
		addBlock(world, basePos, 9, 8, 1, coralBricks);
		addBlock(world, basePos, 9, 8, 2, coralBricks);
		addBlock(world, basePos, 9, 8, 3, coralBricks);
		addBlock(world, basePos, 9, 8, 8, coralBricks);
		addBlock(world, basePos, 9, 8, 9, coralBricks);
		addBlock(world, basePos, 9, 8, 10, coralBricks);
		addBlock(world, basePos, 10, 8, 2, coralBricks);
		addBlock(world, basePos, 10, 8, 9, coralBricks);
		addBlock(world, basePos, 2, 9, 2, coralBricks);
		addBlock(world, basePos, 2, 9, 3, coralBricks);
		addBlock(world, basePos, 2, 9, 4, coralBricks);
		addBlock(world, basePos, 2, 9, 5, coralBricks);
		addBlock(world, basePos, 2, 9, 6, coralBricks);
		addBlock(world, basePos, 2, 9, 7, coralBricks);
		addBlock(world, basePos, 2, 9, 8, coralBricks);
		addBlock(world, basePos, 2, 9, 9, coralBricks);
		addBlock(world, basePos, 3, 9, 2, coralBricks);
		addBlock(world, basePos, 3, 9, 3, glass);
		addBlock(world, basePos, 3, 9, 4, glass);
		addBlock(world, basePos, 3, 9, 5, glass);
		addBlock(world, basePos, 3, 9, 6, glass);
		addBlock(world, basePos, 3, 9, 7, glass);
		addBlock(world, basePos, 3, 9, 8, glass);
		addBlock(world, basePos, 3, 9, 9, coralBricks);
		addBlock(world, basePos, 4, 9, 2, coralBricks);
		addBlock(world, basePos, 4, 9, 3, glass);
		addBlock(world, basePos, 4, 9, 4, coralBricks);
		addBlock(world, basePos, 4, 9, 5, coralBricks);
		addBlock(world, basePos, 4, 9, 6, coralBricks);
		addBlock(world, basePos, 4, 9, 7, coralBricks);
		addBlock(world, basePos, 4, 9, 8, glass);
		addBlock(world, basePos, 4, 9, 9, coralBricks);
		addBlock(world, basePos, 5, 9, 2, coralBricks);
		addBlock(world, basePos, 5, 9, 3, glass);
		addBlock(world, basePos, 5, 9, 4, coralBricks);
		addBlock(world, basePos, 5, 9, 5, water);
		addBlock(world, basePos, 5, 9, 6, water);
		addBlock(world, basePos, 5, 9, 7, coralBricks);
		addBlock(world, basePos, 5, 9, 8, glass);
		addBlock(world, basePos, 5, 9, 9, coralBricks);
		addBlock(world, basePos, 6, 9, 2, coralBricks);
		addBlock(world, basePos, 6, 9, 3, glass);
		addBlock(world, basePos, 6, 9, 4, coralBricks);
		addBlock(world, basePos, 6, 9, 5, water);
		addBlock(world, basePos, 6, 9, 6, water);
		addBlock(world, basePos, 6, 9, 7, coralBricks);
		addBlock(world, basePos, 6, 9, 8, glass);
		addBlock(world, basePos, 6, 9, 9, coralBricks);
		addBlock(world, basePos, 7, 9, 2, coralBricks);
		addBlock(world, basePos, 7, 9, 3, glass);
		addBlock(world, basePos, 7, 9, 4, coralBricks);
		addBlock(world, basePos, 7, 9, 5, coralBricks);
		addBlock(world, basePos, 7, 9, 6, coralBricks);
		addBlock(world, basePos, 7, 9, 7, coralBricks);
		addBlock(world, basePos, 7, 9, 8, glass);
		addBlock(world, basePos, 7, 9, 9, coralBricks);
		addBlock(world, basePos, 8, 9, 2, coralBricks);
		addBlock(world, basePos, 8, 9, 3, glass);
		addBlock(world, basePos, 8, 9, 4, glass);
		addBlock(world, basePos, 8, 9, 5, glass);
		addBlock(world, basePos, 8, 9, 6, glass);
		addBlock(world, basePos, 8, 9, 7, glass);
		addBlock(world, basePos, 8, 9, 8, glass);
		addBlock(world, basePos, 8, 9, 9, coralBricks);
		addBlock(world, basePos, 9, 9, 2, coralBricks);
		addBlock(world, basePos, 9, 9, 3, coralBricks);
		addBlock(world, basePos, 9, 9, 4, coralBricks);
		addBlock(world, basePos, 9, 9, 5, coralBricks);
		addBlock(world, basePos, 9, 9, 6, coralBricks);
		addBlock(world, basePos, 9, 9, 7, coralBricks);
		addBlock(world, basePos, 9, 9, 8, coralBricks);
		addBlock(world, basePos, 9, 9, 9, coralBricks);
		addBlock(world, basePos, 2, 10, 2, coralBricks);
		addBlock(world, basePos, 2, 10, 3, glass);
		addBlock(world, basePos, 2, 10, 4, glass);
		addBlock(world, basePos, 2, 10, 5, glass);
		addBlock(world, basePos, 2, 10, 6, glass);
		addBlock(world, basePos, 2, 10, 7, glass);
		addBlock(world, basePos, 2, 10, 8, glass);
		addBlock(world, basePos, 2, 10, 9, coralBricks);
		addBlock(world, basePos, 3, 10, 2, glass);
		addBlock(world, basePos, 3, 10, 9, glass);
		addBlock(world, basePos, 4, 10, 2, glass);
		addBlock(world, basePos, 4, 10, 9, glass);
		addBlock(world, basePos, 5, 10, 2, glass);
		addBlock(world, basePos, 5, 10, 5, coralBricks);
		addBlock(world, basePos, 5, 10, 6, coralBricks);
		addBlock(world, basePos, 5, 10, 9, glass);
		addBlock(world, basePos, 6, 10, 2, glass);
		addBlock(world, basePos, 6, 10, 5, coralBricks);
		addBlock(world, basePos, 6, 10, 6, coralBricks);
		addBlock(world, basePos, 6, 10, 9, glass);
		addBlock(world, basePos, 7, 10, 2, glass);
		addBlock(world, basePos, 7, 10, 9, glass);
		addBlock(world, basePos, 8, 10, 2, glass);
		addBlock(world, basePos, 8, 10, 9, glass);
		addBlock(world, basePos, 9, 10, 2, coralBricks);
		addBlock(world, basePos, 9, 10, 3, glass);
		addBlock(world, basePos, 9, 10, 4, glass);
		addBlock(world, basePos, 9, 10, 5, glass);
		addBlock(world, basePos, 9, 10, 6, glass);
		addBlock(world, basePos, 9, 10, 7, glass);
		addBlock(world, basePos, 9, 10, 8, glass);
		addBlock(world, basePos, 9, 10, 9, coralBricks);
	}

	@Override
	protected void spawnEntities(World world, Random rand, BlockPos basePos) {
		EntityBoreicLottoman lottoman = new EntityBoreicLottoman(world);

		lottoman.setLocationAndAngles(basePos.getX() + 5, basePos.getY() + 11, basePos.getZ() + 5, rand.nextFloat() * 360, 0);
		world.spawnEntity(lottoman);
	}
}
