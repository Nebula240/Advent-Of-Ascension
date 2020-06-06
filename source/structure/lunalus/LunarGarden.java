package net.tslat.aoa3.structure.lunalus;

import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.tslat.aoa3.common.registration.BlockRegister;
import net.tslat.aoa3.structure.AoAStructure;

import java.util.Random;

public class LunarGarden extends AoAStructure { //StructureSize: 17x15x17
	private static final IBlockState lunarBricks = BlockRegister.LUNAR_BRICKS.getDefaultState();
	private static final IBlockState whitewashBricks = BlockRegister.WHITEWASH_BRICKS.getDefaultState();
	private static final IBlockState water = Blocks.FLOWING_WATER.getDefaultState();
	private static final IBlockState tilledDirt = Blocks.FARMLAND.getDefaultState();
	private static final IBlockState twinklestone = BlockRegister.TWINKLESTONE.getDefaultState();

	public LunarGarden() {
		super("LunarGarden");
	}

	@Override
	protected boolean replacesBlocks() {
		return true;
	}

	@Override
	protected void build(World world, Random rand, BlockPos basePos) {
		IBlockState crop;

		switch (rand.nextInt(3)) {
			case 0:
				crop = BlockRegister.LUNALON_CROP.getDefaultState();
				break;
			case 1:
				crop = BlockRegister.LUNACRIKE_CROP.getDefaultState();
				break;
			case 2:
			default:
				crop = BlockRegister.LUNA_GLOBE_CROP.getDefaultState();
				break;
		}

		addBlock(world, basePos, 8, 0, 8, lunarBricks);
		addBlock(world, basePos, 8, 1, 8, whitewashBricks);
		addBlock(world, basePos, 8, 2, 8, whitewashBricks);
		addBlock(world, basePos, 8, 3, 8, whitewashBricks);
		addBlock(world, basePos, 8, 4, 8, whitewashBricks);
		addBlock(world, basePos, 8, 5, 8, whitewashBricks);
		addBlock(world, basePos, 1, 6, 1, lunarBricks);
		addBlock(world, basePos, 1, 6, 2, lunarBricks);
		addBlock(world, basePos, 1, 6, 3, lunarBricks);
		addBlock(world, basePos, 1, 6, 4, lunarBricks);
		addBlock(world, basePos, 1, 6, 5, lunarBricks);
		addBlock(world, basePos, 1, 6, 6, lunarBricks);
		addBlock(world, basePos, 1, 6, 7, lunarBricks);
		addBlock(world, basePos, 1, 6, 8, lunarBricks);
		addBlock(world, basePos, 1, 6, 9, lunarBricks);
		addBlock(world, basePos, 1, 6, 10, lunarBricks);
		addBlock(world, basePos, 1, 6, 11, lunarBricks);
		addBlock(world, basePos, 1, 6, 12, lunarBricks);
		addBlock(world, basePos, 1, 6, 13, lunarBricks);
		addBlock(world, basePos, 1, 6, 14, lunarBricks);
		addBlock(world, basePos, 1, 6, 15, lunarBricks);
		addBlock(world, basePos, 2, 6, 1, lunarBricks);
		addBlock(world, basePos, 2, 6, 2, lunarBricks);
		addBlock(world, basePos, 2, 6, 3, lunarBricks);
		addBlock(world, basePos, 2, 6, 4, lunarBricks);
		addBlock(world, basePos, 2, 6, 5, lunarBricks);
		addBlock(world, basePos, 2, 6, 6, lunarBricks);
		addBlock(world, basePos, 2, 6, 7, lunarBricks);
		addBlock(world, basePos, 2, 6, 8, lunarBricks);
		addBlock(world, basePos, 2, 6, 9, lunarBricks);
		addBlock(world, basePos, 2, 6, 10, lunarBricks);
		addBlock(world, basePos, 2, 6, 11, lunarBricks);
		addBlock(world, basePos, 2, 6, 12, lunarBricks);
		addBlock(world, basePos, 2, 6, 13, lunarBricks);
		addBlock(world, basePos, 2, 6, 14, lunarBricks);
		addBlock(world, basePos, 2, 6, 15, lunarBricks);
		addBlock(world, basePos, 3, 6, 1, lunarBricks);
		addBlock(world, basePos, 3, 6, 2, lunarBricks);
		addBlock(world, basePos, 3, 6, 14, lunarBricks);
		addBlock(world, basePos, 3, 6, 15, lunarBricks);
		addBlock(world, basePos, 4, 6, 1, lunarBricks);
		addBlock(world, basePos, 4, 6, 2, lunarBricks);
		addBlock(world, basePos, 4, 6, 14, lunarBricks);
		addBlock(world, basePos, 4, 6, 15, lunarBricks);
		addBlock(world, basePos, 5, 6, 1, lunarBricks);
		addBlock(world, basePos, 5, 6, 2, lunarBricks);
		addBlock(world, basePos, 5, 6, 14, lunarBricks);
		addBlock(world, basePos, 5, 6, 15, lunarBricks);
		addBlock(world, basePos, 6, 6, 1, lunarBricks);
		addBlock(world, basePos, 6, 6, 2, lunarBricks);
		addBlock(world, basePos, 6, 6, 14, lunarBricks);
		addBlock(world, basePos, 6, 6, 15, lunarBricks);
		addBlock(world, basePos, 7, 6, 1, lunarBricks);
		addBlock(world, basePos, 7, 6, 2, lunarBricks);
		addBlock(world, basePos, 7, 6, 14, lunarBricks);
		addBlock(world, basePos, 7, 6, 15, lunarBricks);
		addBlock(world, basePos, 8, 6, 1, lunarBricks);
		addBlock(world, basePos, 8, 6, 2, lunarBricks);
		addBlock(world, basePos, 8, 6, 8, whitewashBricks);
		addBlock(world, basePos, 8, 6, 14, lunarBricks);
		addBlock(world, basePos, 8, 6, 15, lunarBricks);
		addBlock(world, basePos, 9, 6, 1, lunarBricks);
		addBlock(world, basePos, 9, 6, 2, lunarBricks);
		addBlock(world, basePos, 9, 6, 14, lunarBricks);
		addBlock(world, basePos, 9, 6, 15, lunarBricks);
		addBlock(world, basePos, 10, 6, 1, lunarBricks);
		addBlock(world, basePos, 10, 6, 2, lunarBricks);
		addBlock(world, basePos, 10, 6, 14, lunarBricks);
		addBlock(world, basePos, 10, 6, 15, lunarBricks);
		addBlock(world, basePos, 11, 6, 1, lunarBricks);
		addBlock(world, basePos, 11, 6, 2, lunarBricks);
		addBlock(world, basePos, 11, 6, 14, lunarBricks);
		addBlock(world, basePos, 11, 6, 15, lunarBricks);
		addBlock(world, basePos, 12, 6, 1, lunarBricks);
		addBlock(world, basePos, 12, 6, 2, lunarBricks);
		addBlock(world, basePos, 12, 6, 14, lunarBricks);
		addBlock(world, basePos, 12, 6, 15, lunarBricks);
		addBlock(world, basePos, 13, 6, 1, lunarBricks);
		addBlock(world, basePos, 13, 6, 2, lunarBricks);
		addBlock(world, basePos, 13, 6, 14, lunarBricks);
		addBlock(world, basePos, 13, 6, 15, lunarBricks);
		addBlock(world, basePos, 14, 6, 1, lunarBricks);
		addBlock(world, basePos, 14, 6, 2, lunarBricks);
		addBlock(world, basePos, 14, 6, 3, lunarBricks);
		addBlock(world, basePos, 14, 6, 4, lunarBricks);
		addBlock(world, basePos, 14, 6, 5, lunarBricks);
		addBlock(world, basePos, 14, 6, 6, lunarBricks);
		addBlock(world, basePos, 14, 6, 7, lunarBricks);
		addBlock(world, basePos, 14, 6, 8, lunarBricks);
		addBlock(world, basePos, 14, 6, 9, lunarBricks);
		addBlock(world, basePos, 14, 6, 10, lunarBricks);
		addBlock(world, basePos, 14, 6, 11, lunarBricks);
		addBlock(world, basePos, 14, 6, 12, lunarBricks);
		addBlock(world, basePos, 14, 6, 13, lunarBricks);
		addBlock(world, basePos, 14, 6, 14, lunarBricks);
		addBlock(world, basePos, 14, 6, 15, lunarBricks);
		addBlock(world, basePos, 15, 6, 1, lunarBricks);
		addBlock(world, basePos, 15, 6, 2, lunarBricks);
		addBlock(world, basePos, 15, 6, 3, lunarBricks);
		addBlock(world, basePos, 15, 6, 4, lunarBricks);
		addBlock(world, basePos, 15, 6, 5, lunarBricks);
		addBlock(world, basePos, 15, 6, 6, lunarBricks);
		addBlock(world, basePos, 15, 6, 7, lunarBricks);
		addBlock(world, basePos, 15, 6, 8, lunarBricks);
		addBlock(world, basePos, 15, 6, 9, lunarBricks);
		addBlock(world, basePos, 15, 6, 10, lunarBricks);
		addBlock(world, basePos, 15, 6, 11, lunarBricks);
		addBlock(world, basePos, 15, 6, 12, lunarBricks);
		addBlock(world, basePos, 15, 6, 13, lunarBricks);
		addBlock(world, basePos, 15, 6, 14, lunarBricks);
		addBlock(world, basePos, 15, 6, 15, lunarBricks);
		addBlock(world, basePos, 0, 7, 0, lunarBricks);
		addBlock(world, basePos, 0, 7, 1, lunarBricks);
		addBlock(world, basePos, 0, 7, 2, lunarBricks);
		addBlock(world, basePos, 0, 7, 3, lunarBricks);
		addBlock(world, basePos, 0, 7, 4, lunarBricks);
		addBlock(world, basePos, 0, 7, 5, lunarBricks);
		addBlock(world, basePos, 0, 7, 6, lunarBricks);
		addBlock(world, basePos, 0, 7, 7, lunarBricks);
		addBlock(world, basePos, 0, 7, 8, lunarBricks);
		addBlock(world, basePos, 0, 7, 9, lunarBricks);
		addBlock(world, basePos, 0, 7, 10, lunarBricks);
		addBlock(world, basePos, 0, 7, 11, lunarBricks);
		addBlock(world, basePos, 0, 7, 12, lunarBricks);
		addBlock(world, basePos, 0, 7, 13, lunarBricks);
		addBlock(world, basePos, 0, 7, 14, lunarBricks);
		addBlock(world, basePos, 0, 7, 15, lunarBricks);
		addBlock(world, basePos, 0, 7, 16, lunarBricks);
		addBlock(world, basePos, 1, 7, 0, lunarBricks);
		addBlock(world, basePos, 1, 7, 1, whitewashBricks);
		addBlock(world, basePos, 1, 7, 2, tilledDirt);
		addBlock(world, basePos, 1, 7, 3, tilledDirt);
		addBlock(world, basePos, 1, 7, 4, tilledDirt);
		addBlock(world, basePos, 1, 7, 5, tilledDirt);
		addBlock(world, basePos, 1, 7, 6, tilledDirt);
		addBlock(world, basePos, 1, 7, 7, tilledDirt);
		addBlock(world, basePos, 1, 7, 8, tilledDirt);
		addBlock(world, basePos, 1, 7, 9, tilledDirt);
		addBlock(world, basePos, 1, 7, 10, tilledDirt);
		addBlock(world, basePos, 1, 7, 11, tilledDirt);
		addBlock(world, basePos, 1, 7, 12, tilledDirt);
		addBlock(world, basePos, 1, 7, 13, tilledDirt);
		addBlock(world, basePos, 1, 7, 14, tilledDirt);
		addBlock(world, basePos, 1, 7, 15, whitewashBricks);
		addBlock(world, basePos, 1, 7, 16, lunarBricks);
		addBlock(world, basePos, 2, 7, 0, lunarBricks);
		addBlock(world, basePos, 2, 7, 1, tilledDirt);
		addBlock(world, basePos, 2, 7, 2, water);
		addBlock(world, basePos, 2, 7, 8, water);
		addBlock(world, basePos, 2, 7, 14, water);
		addBlock(world, basePos, 2, 7, 15, tilledDirt);
		addBlock(world, basePos, 2, 7, 16, lunarBricks);
		addBlock(world, basePos, 3, 7, 0, lunarBricks);
		addBlock(world, basePos, 3, 7, 1, tilledDirt);
		addBlock(world, basePos, 3, 7, 3, twinklestone);
		addBlock(world, basePos, 3, 7, 4, twinklestone);
		addBlock(world, basePos, 3, 7, 5, twinklestone);
		addBlock(world, basePos, 3, 7, 6, twinklestone);
		addBlock(world, basePos, 3, 7, 7, twinklestone);
		addBlock(world, basePos, 3, 7, 8, lunarBricks);
		addBlock(world, basePos, 3, 7, 9, twinklestone);
		addBlock(world, basePos, 3, 7, 10, twinklestone);
		addBlock(world, basePos, 3, 7, 11, twinklestone);
		addBlock(world, basePos, 3, 7, 12, twinklestone);
		addBlock(world, basePos, 3, 7, 13, twinklestone);
		addBlock(world, basePos, 3, 7, 15, tilledDirt);
		addBlock(world, basePos, 3, 7, 16, lunarBricks);
		addBlock(world, basePos, 4, 7, 0, lunarBricks);
		addBlock(world, basePos, 4, 7, 1, tilledDirt);
		addBlock(world, basePos, 4, 7, 3, twinklestone);
		addBlock(world, basePos, 4, 7, 8, lunarBricks);
		addBlock(world, basePos, 4, 7, 13, twinklestone);
		addBlock(world, basePos, 4, 7, 15, tilledDirt);
		addBlock(world, basePos, 4, 7, 16, lunarBricks);
		addBlock(world, basePos, 5, 7, 0, lunarBricks);
		addBlock(world, basePos, 5, 7, 1, tilledDirt);
		addBlock(world, basePos, 5, 7, 3, twinklestone);
		addBlock(world, basePos, 5, 7, 8, lunarBricks);
		addBlock(world, basePos, 5, 7, 13, twinklestone);
		addBlock(world, basePos, 5, 7, 15, tilledDirt);
		addBlock(world, basePos, 5, 7, 16, lunarBricks);
		addBlock(world, basePos, 6, 7, 0, lunarBricks);
		addBlock(world, basePos, 6, 7, 1, tilledDirt);
		addBlock(world, basePos, 6, 7, 3, twinklestone);
		addBlock(world, basePos, 6, 7, 8, lunarBricks);
		addBlock(world, basePos, 6, 7, 13, twinklestone);
		addBlock(world, basePos, 6, 7, 15, tilledDirt);
		addBlock(world, basePos, 6, 7, 16, lunarBricks);
		addBlock(world, basePos, 7, 7, 0, lunarBricks);
		addBlock(world, basePos, 7, 7, 1, tilledDirt);
		addBlock(world, basePos, 7, 7, 3, twinklestone);
		addBlock(world, basePos, 7, 7, 8, lunarBricks);
		addBlock(world, basePos, 7, 7, 13, twinklestone);
		addBlock(world, basePos, 7, 7, 15, tilledDirt);
		addBlock(world, basePos, 7, 7, 16, lunarBricks);
		addBlock(world, basePos, 8, 7, 0, lunarBricks);
		addBlock(world, basePos, 8, 7, 1, tilledDirt);
		addBlock(world, basePos, 8, 7, 2, water);
		addBlock(world, basePos, 8, 7, 3, lunarBricks);
		addBlock(world, basePos, 8, 7, 4, lunarBricks);
		addBlock(world, basePos, 8, 7, 5, lunarBricks);
		addBlock(world, basePos, 8, 7, 6, lunarBricks);
		addBlock(world, basePos, 8, 7, 7, lunarBricks);
		addBlock(world, basePos, 8, 7, 8, lunarBricks);
		addBlock(world, basePos, 8, 7, 9, lunarBricks);
		addBlock(world, basePos, 8, 7, 10, lunarBricks);
		addBlock(world, basePos, 8, 7, 11, lunarBricks);
		addBlock(world, basePos, 8, 7, 12, lunarBricks);
		addBlock(world, basePos, 8, 7, 13, lunarBricks);
		addBlock(world, basePos, 8, 7, 14, water);
		addBlock(world, basePos, 8, 7, 15, tilledDirt);
		addBlock(world, basePos, 8, 7, 16, lunarBricks);
		addBlock(world, basePos, 9, 7, 0, lunarBricks);
		addBlock(world, basePos, 9, 7, 1, tilledDirt);
		addBlock(world, basePos, 9, 7, 3, twinklestone);
		addBlock(world, basePos, 9, 7, 8, lunarBricks);
		addBlock(world, basePos, 9, 7, 13, twinklestone);
		addBlock(world, basePos, 9, 7, 15, tilledDirt);
		addBlock(world, basePos, 9, 7, 16, lunarBricks);
		addBlock(world, basePos, 10, 7, 0, lunarBricks);
		addBlock(world, basePos, 10, 7, 1, tilledDirt);
		addBlock(world, basePos, 10, 7, 3, twinklestone);
		addBlock(world, basePos, 10, 7, 8, lunarBricks);
		addBlock(world, basePos, 10, 7, 13, twinklestone);
		addBlock(world, basePos, 10, 7, 15, tilledDirt);
		addBlock(world, basePos, 10, 7, 16, lunarBricks);
		addBlock(world, basePos, 11, 7, 0, lunarBricks);
		addBlock(world, basePos, 11, 7, 1, tilledDirt);
		addBlock(world, basePos, 11, 7, 3, twinklestone);
		addBlock(world, basePos, 11, 7, 8, lunarBricks);
		addBlock(world, basePos, 11, 7, 13, twinklestone);
		addBlock(world, basePos, 11, 7, 15, tilledDirt);
		addBlock(world, basePos, 11, 7, 16, lunarBricks);
		addBlock(world, basePos, 12, 7, 0, lunarBricks);
		addBlock(world, basePos, 12, 7, 1, tilledDirt);
		addBlock(world, basePos, 12, 7, 3, twinklestone);
		addBlock(world, basePos, 12, 7, 8, lunarBricks);
		addBlock(world, basePos, 12, 7, 13, twinklestone);
		addBlock(world, basePos, 12, 7, 15, tilledDirt);
		addBlock(world, basePos, 12, 7, 16, lunarBricks);
		addBlock(world, basePos, 13, 7, 0, lunarBricks);
		addBlock(world, basePos, 13, 7, 1, tilledDirt);
		addBlock(world, basePos, 13, 7, 3, twinklestone);
		addBlock(world, basePos, 13, 7, 4, twinklestone);
		addBlock(world, basePos, 13, 7, 5, twinklestone);
		addBlock(world, basePos, 13, 7, 6, twinklestone);
		addBlock(world, basePos, 13, 7, 7, twinklestone);
		addBlock(world, basePos, 13, 7, 8, lunarBricks);
		addBlock(world, basePos, 13, 7, 9, twinklestone);
		addBlock(world, basePos, 13, 7, 10, twinklestone);
		addBlock(world, basePos, 13, 7, 11, twinklestone);
		addBlock(world, basePos, 13, 7, 12, twinklestone);
		addBlock(world, basePos, 13, 7, 13, twinklestone);
		addBlock(world, basePos, 13, 7, 15, tilledDirt);
		addBlock(world, basePos, 13, 7, 16, lunarBricks);
		addBlock(world, basePos, 14, 7, 0, lunarBricks);
		addBlock(world, basePos, 14, 7, 1, tilledDirt);
		addBlock(world, basePos, 14, 7, 2, water);
		addBlock(world, basePos, 14, 7, 8, water);
		addBlock(world, basePos, 14, 7, 14, water);
		addBlock(world, basePos, 14, 7, 15, tilledDirt);
		addBlock(world, basePos, 14, 7, 16, lunarBricks);
		addBlock(world, basePos, 15, 7, 0, lunarBricks);
		addBlock(world, basePos, 15, 7, 1, whitewashBricks);
		addBlock(world, basePos, 15, 7, 2, tilledDirt);
		addBlock(world, basePos, 15, 7, 3, tilledDirt);
		addBlock(world, basePos, 15, 7, 4, tilledDirt);
		addBlock(world, basePos, 15, 7, 5, tilledDirt);
		addBlock(world, basePos, 15, 7, 6, tilledDirt);
		addBlock(world, basePos, 15, 7, 7, tilledDirt);
		addBlock(world, basePos, 15, 7, 8, tilledDirt);
		addBlock(world, basePos, 15, 7, 9, tilledDirt);
		addBlock(world, basePos, 15, 7, 10, tilledDirt);
		addBlock(world, basePos, 15, 7, 11, tilledDirt);
		addBlock(world, basePos, 15, 7, 12, tilledDirt);
		addBlock(world, basePos, 15, 7, 13, tilledDirt);
		addBlock(world, basePos, 15, 7, 14, tilledDirt);
		addBlock(world, basePos, 15, 7, 15, whitewashBricks);
		addBlock(world, basePos, 15, 7, 16, lunarBricks);
		addBlock(world, basePos, 16, 7, 0, lunarBricks);
		addBlock(world, basePos, 16, 7, 1, lunarBricks);
		addBlock(world, basePos, 16, 7, 2, lunarBricks);
		addBlock(world, basePos, 16, 7, 3, lunarBricks);
		addBlock(world, basePos, 16, 7, 4, lunarBricks);
		addBlock(world, basePos, 16, 7, 5, lunarBricks);
		addBlock(world, basePos, 16, 7, 6, lunarBricks);
		addBlock(world, basePos, 16, 7, 7, lunarBricks);
		addBlock(world, basePos, 16, 7, 8, lunarBricks);
		addBlock(world, basePos, 16, 7, 9, lunarBricks);
		addBlock(world, basePos, 16, 7, 10, lunarBricks);
		addBlock(world, basePos, 16, 7, 11, lunarBricks);
		addBlock(world, basePos, 16, 7, 12, lunarBricks);
		addBlock(world, basePos, 16, 7, 13, lunarBricks);
		addBlock(world, basePos, 16, 7, 14, lunarBricks);
		addBlock(world, basePos, 16, 7, 15, lunarBricks);
		addBlock(world, basePos, 16, 7, 16, lunarBricks);
		addBlock(world, basePos, 1, 8, 2, crop);
		addBlock(world, basePos, 1, 8, 3, crop);
		addBlock(world, basePos, 1, 8, 4, crop);
		addBlock(world, basePos, 1, 8, 5, crop);
		addBlock(world, basePos, 1, 8, 6, crop);
		addBlock(world, basePos, 1, 8, 7, crop);
		addBlock(world, basePos, 1, 8, 8, crop);
		addBlock(world, basePos, 1, 8, 9, crop);
		addBlock(world, basePos, 1, 8, 10, crop);
		addBlock(world, basePos, 1, 8, 11, crop);
		addBlock(world, basePos, 1, 8, 12, crop);
		addBlock(world, basePos, 1, 8, 13, crop);
		addBlock(world, basePos, 1, 8, 14, crop);
		addBlock(world, basePos, 2, 8, 1, crop);
		addBlock(world, basePos, 2, 8, 15, crop);
		addBlock(world, basePos, 3, 8, 1, crop);
		addBlock(world, basePos, 3, 8, 15, crop);
		addBlock(world, basePos, 4, 8, 1, crop);
		addBlock(world, basePos, 4, 8, 15, crop);
		addBlock(world, basePos, 5, 8, 1, crop);
		addBlock(world, basePos, 5, 8, 15, crop);
		addBlock(world, basePos, 6, 8, 1, crop);
		addBlock(world, basePos, 6, 8, 15, crop);
		addBlock(world, basePos, 7, 8, 1, crop);
		addBlock(world, basePos, 7, 8, 15, crop);
		addBlock(world, basePos, 8, 8, 1, crop);
		addBlock(world, basePos, 8, 8, 8, whitewashBricks);
		addBlock(world, basePos, 8, 8, 15, crop);
		addBlock(world, basePos, 9, 8, 1, crop);
		addBlock(world, basePos, 9, 8, 15, crop);
		addBlock(world, basePos, 10, 8, 1, crop);
		addBlock(world, basePos, 10, 8, 15, crop);
		addBlock(world, basePos, 11, 8, 1, crop);
		addBlock(world, basePos, 11, 8, 15, crop);
		addBlock(world, basePos, 12, 8, 1, crop);
		addBlock(world, basePos, 12, 8, 15, crop);
		addBlock(world, basePos, 13, 8, 1, crop);
		addBlock(world, basePos, 13, 8, 15, crop);
		addBlock(world, basePos, 14, 8, 1, crop);
		addBlock(world, basePos, 14, 8, 15, crop);
		addBlock(world, basePos, 15, 8, 2, crop);
		addBlock(world, basePos, 15, 8, 3, crop);
		addBlock(world, basePos, 15, 8, 4, crop);
		addBlock(world, basePos, 15, 8, 5, crop);
		addBlock(world, basePos, 15, 8, 6, crop);
		addBlock(world, basePos, 15, 8, 7, crop);
		addBlock(world, basePos, 15, 8, 8, crop);
		addBlock(world, basePos, 15, 8, 9, crop);
		addBlock(world, basePos, 15, 8, 10, crop);
		addBlock(world, basePos, 15, 8, 11, crop);
		addBlock(world, basePos, 15, 8, 12, crop);
		addBlock(world, basePos, 15, 8, 13, crop);
		addBlock(world, basePos, 15, 8, 14, crop);
		addBlock(world, basePos, 8, 9, 8, whitewashBricks);
		addBlock(world, basePos, 8, 10, 8, whitewashBricks);
		addBlock(world, basePos, 8, 11, 8, whitewashBricks);
		addBlock(world, basePos, 8, 12, 8, whitewashBricks);
		addBlock(world, basePos, 8, 13, 8, whitewashBricks);
		addBlock(world, basePos, 8, 14, 8, lunarBricks);
	}
}
