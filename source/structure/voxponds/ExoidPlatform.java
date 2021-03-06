package net.tslat.aoa3.structure.voxponds;

import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.tslat.aoa3.common.registration.BlockRegister;
import net.tslat.aoa3.structure.AoAStructure;

import java.util.Random;

public class ExoidPlatform extends AoAStructure { //StructureSize: 16x3x16
	private static final IBlockState degradedSteel = BlockRegister.DEGRADED_STEEL.getDefaultState();
	private static final IBlockState voxGlass = BlockRegister.VOX_GLASS.getDefaultState();
	private static final IBlockState toxicStone = BlockRegister.TOXIC_STONE.getDefaultState();
	private static final IBlockState steelLight = BlockRegister.STEEL_LIGHT.getDefaultState();
	private static final IBlockState exoidStation = BlockRegister.EXOID_STATION.getDefaultState();

	public ExoidPlatform() {
		super("ExoidPlatform");
	}

	@Override
	protected boolean replacesBlocks() {
		return true;
	}

	@Override
	protected void build(World world, Random rand, BlockPos basePos) {
		addBlock(world, basePos, 0, 0, 0, degradedSteel);
		addBlock(world, basePos, 0, 0, 1, degradedSteel);
		addBlock(world, basePos, 0, 0, 2, degradedSteel);
		addBlock(world, basePos, 0, 0, 3, degradedSteel);
		addBlock(world, basePos, 0, 0, 4, degradedSteel);
		addBlock(world, basePos, 0, 0, 5, degradedSteel);
		addBlock(world, basePos, 0, 0, 6, degradedSteel);
		addBlock(world, basePos, 0, 0, 7, degradedSteel);
		addBlock(world, basePos, 0, 0, 8, degradedSteel);
		addBlock(world, basePos, 0, 0, 9, degradedSteel);
		addBlock(world, basePos, 0, 0, 10, degradedSteel);
		addBlock(world, basePos, 0, 0, 11, degradedSteel);
		addBlock(world, basePos, 0, 0, 12, degradedSteel);
		addBlock(world, basePos, 0, 0, 13, degradedSteel);
		addBlock(world, basePos, 0, 0, 14, degradedSteel);
		addBlock(world, basePos, 0, 0, 15, degradedSteel);
		addBlock(world, basePos, 1, 0, 0, degradedSteel);
		addBlock(world, basePos, 1, 0, 1, toxicStone);
		addBlock(world, basePos, 1, 0, 2, toxicStone);
		addBlock(world, basePos, 1, 0, 3, toxicStone);
		addBlock(world, basePos, 1, 0, 4, toxicStone);
		addBlock(world, basePos, 1, 0, 5, toxicStone);
		addBlock(world, basePos, 1, 0, 6, toxicStone);
		addBlock(world, basePos, 1, 0, 7, toxicStone);
		addBlock(world, basePos, 1, 0, 8, toxicStone);
		addBlock(world, basePos, 1, 0, 9, toxicStone);
		addBlock(world, basePos, 1, 0, 10, toxicStone);
		addBlock(world, basePos, 1, 0, 11, toxicStone);
		addBlock(world, basePos, 1, 0, 12, toxicStone);
		addBlock(world, basePos, 1, 0, 13, toxicStone);
		addBlock(world, basePos, 1, 0, 14, toxicStone);
		addBlock(world, basePos, 1, 0, 15, degradedSteel);
		addBlock(world, basePos, 2, 0, 0, degradedSteel);
		addBlock(world, basePos, 2, 0, 1, toxicStone);
		addBlock(world, basePos, 2, 0, 2, degradedSteel);
		addBlock(world, basePos, 2, 0, 3, degradedSteel);
		addBlock(world, basePos, 2, 0, 4, degradedSteel);
		addBlock(world, basePos, 2, 0, 5, degradedSteel);
		addBlock(world, basePos, 2, 0, 6, degradedSteel);
		addBlock(world, basePos, 2, 0, 7, degradedSteel);
		addBlock(world, basePos, 2, 0, 8, degradedSteel);
		addBlock(world, basePos, 2, 0, 9, degradedSteel);
		addBlock(world, basePos, 2, 0, 10, degradedSteel);
		addBlock(world, basePos, 2, 0, 11, degradedSteel);
		addBlock(world, basePos, 2, 0, 12, degradedSteel);
		addBlock(world, basePos, 2, 0, 13, degradedSteel);
		addBlock(world, basePos, 2, 0, 14, toxicStone);
		addBlock(world, basePos, 2, 0, 15, degradedSteel);
		addBlock(world, basePos, 3, 0, 0, degradedSteel);
		addBlock(world, basePos, 3, 0, 1, toxicStone);
		addBlock(world, basePos, 3, 0, 2, degradedSteel);
		addBlock(world, basePos, 3, 0, 3, steelLight);
		addBlock(world, basePos, 3, 0, 4, degradedSteel);
		addBlock(world, basePos, 3, 0, 5, voxGlass);
		addBlock(world, basePos, 3, 0, 6, toxicStone);
		addBlock(world, basePos, 3, 0, 7, degradedSteel);
		addBlock(world, basePos, 3, 0, 8, degradedSteel);
		addBlock(world, basePos, 3, 0, 9, toxicStone);
		addBlock(world, basePos, 3, 0, 10, voxGlass);
		addBlock(world, basePos, 3, 0, 11, degradedSteel);
		addBlock(world, basePos, 3, 0, 12, steelLight);
		addBlock(world, basePos, 3, 0, 13, degradedSteel);
		addBlock(world, basePos, 3, 0, 14, toxicStone);
		addBlock(world, basePos, 3, 0, 15, degradedSteel);
		addBlock(world, basePos, 4, 0, 0, degradedSteel);
		addBlock(world, basePos, 4, 0, 1, toxicStone);
		addBlock(world, basePos, 4, 0, 2, degradedSteel);
		addBlock(world, basePos, 4, 0, 3, degradedSteel);
		addBlock(world, basePos, 4, 0, 4, degradedSteel);
		addBlock(world, basePos, 4, 0, 5, voxGlass);
		addBlock(world, basePos, 4, 0, 6, toxicStone);
		addBlock(world, basePos, 4, 0, 7, degradedSteel);
		addBlock(world, basePos, 4, 0, 8, degradedSteel);
		addBlock(world, basePos, 4, 0, 9, toxicStone);
		addBlock(world, basePos, 4, 0, 10, voxGlass);
		addBlock(world, basePos, 4, 0, 11, degradedSteel);
		addBlock(world, basePos, 4, 0, 12, degradedSteel);
		addBlock(world, basePos, 4, 0, 13, degradedSteel);
		addBlock(world, basePos, 4, 0, 14, toxicStone);
		addBlock(world, basePos, 4, 0, 15, degradedSteel);
		addBlock(world, basePos, 5, 0, 0, degradedSteel);
		addBlock(world, basePos, 5, 0, 1, toxicStone);
		addBlock(world, basePos, 5, 0, 2, degradedSteel);
		addBlock(world, basePos, 5, 0, 3, voxGlass);
		addBlock(world, basePos, 5, 0, 4, voxGlass);
		addBlock(world, basePos, 5, 0, 5, voxGlass);
		addBlock(world, basePos, 5, 0, 6, toxicStone);
		addBlock(world, basePos, 5, 0, 7, degradedSteel);
		addBlock(world, basePos, 5, 0, 8, degradedSteel);
		addBlock(world, basePos, 5, 0, 9, toxicStone);
		addBlock(world, basePos, 5, 0, 10, voxGlass);
		addBlock(world, basePos, 5, 0, 11, voxGlass);
		addBlock(world, basePos, 5, 0, 12, voxGlass);
		addBlock(world, basePos, 5, 0, 13, degradedSteel);
		addBlock(world, basePos, 5, 0, 14, toxicStone);
		addBlock(world, basePos, 5, 0, 15, degradedSteel);
		addBlock(world, basePos, 6, 0, 0, degradedSteel);
		addBlock(world, basePos, 6, 0, 1, toxicStone);
		addBlock(world, basePos, 6, 0, 2, degradedSteel);
		addBlock(world, basePos, 6, 0, 3, toxicStone);
		addBlock(world, basePos, 6, 0, 4, toxicStone);
		addBlock(world, basePos, 6, 0, 5, toxicStone);
		addBlock(world, basePos, 6, 0, 6, toxicStone);
		addBlock(world, basePos, 6, 0, 7, degradedSteel);
		addBlock(world, basePos, 6, 0, 8, degradedSteel);
		addBlock(world, basePos, 6, 0, 9, toxicStone);
		addBlock(world, basePos, 6, 0, 10, toxicStone);
		addBlock(world, basePos, 6, 0, 11, toxicStone);
		addBlock(world, basePos, 6, 0, 12, toxicStone);
		addBlock(world, basePos, 6, 0, 13, degradedSteel);
		addBlock(world, basePos, 6, 0, 14, toxicStone);
		addBlock(world, basePos, 6, 0, 15, degradedSteel);
		addBlock(world, basePos, 7, 0, 0, degradedSteel);
		addBlock(world, basePos, 7, 0, 1, toxicStone);
		addBlock(world, basePos, 7, 0, 2, degradedSteel);
		addBlock(world, basePos, 7, 0, 3, degradedSteel);
		addBlock(world, basePos, 7, 0, 4, degradedSteel);
		addBlock(world, basePos, 7, 0, 5, degradedSteel);
		addBlock(world, basePos, 7, 0, 6, degradedSteel);
		addBlock(world, basePos, 7, 0, 7, degradedSteel);
		addBlock(world, basePos, 7, 0, 8, degradedSteel);
		addBlock(world, basePos, 7, 0, 9, degradedSteel);
		addBlock(world, basePos, 7, 0, 10, degradedSteel);
		addBlock(world, basePos, 7, 0, 11, degradedSteel);
		addBlock(world, basePos, 7, 0, 12, degradedSteel);
		addBlock(world, basePos, 7, 0, 13, degradedSteel);
		addBlock(world, basePos, 7, 0, 14, toxicStone);
		addBlock(world, basePos, 7, 0, 15, degradedSteel);
		addBlock(world, basePos, 8, 0, 0, degradedSteel);
		addBlock(world, basePos, 8, 0, 1, toxicStone);
		addBlock(world, basePos, 8, 0, 2, degradedSteel);
		addBlock(world, basePos, 8, 0, 3, degradedSteel);
		addBlock(world, basePos, 8, 0, 4, degradedSteel);
		addBlock(world, basePos, 8, 0, 5, degradedSteel);
		addBlock(world, basePos, 8, 0, 6, degradedSteel);
		addBlock(world, basePos, 8, 0, 7, degradedSteel);
		addBlock(world, basePos, 8, 0, 8, degradedSteel);
		addBlock(world, basePos, 8, 0, 9, degradedSteel);
		addBlock(world, basePos, 8, 0, 10, degradedSteel);
		addBlock(world, basePos, 8, 0, 11, degradedSteel);
		addBlock(world, basePos, 8, 0, 12, degradedSteel);
		addBlock(world, basePos, 8, 0, 13, degradedSteel);
		addBlock(world, basePos, 8, 0, 14, toxicStone);
		addBlock(world, basePos, 8, 0, 15, degradedSteel);
		addBlock(world, basePos, 9, 0, 0, degradedSteel);
		addBlock(world, basePos, 9, 0, 1, toxicStone);
		addBlock(world, basePos, 9, 0, 2, degradedSteel);
		addBlock(world, basePos, 9, 0, 3, toxicStone);
		addBlock(world, basePos, 9, 0, 4, toxicStone);
		addBlock(world, basePos, 9, 0, 5, toxicStone);
		addBlock(world, basePos, 9, 0, 6, toxicStone);
		addBlock(world, basePos, 9, 0, 7, degradedSteel);
		addBlock(world, basePos, 9, 0, 8, degradedSteel);
		addBlock(world, basePos, 9, 0, 9, toxicStone);
		addBlock(world, basePos, 9, 0, 10, toxicStone);
		addBlock(world, basePos, 9, 0, 11, toxicStone);
		addBlock(world, basePos, 9, 0, 12, toxicStone);
		addBlock(world, basePos, 9, 0, 13, degradedSteel);
		addBlock(world, basePos, 9, 0, 14, toxicStone);
		addBlock(world, basePos, 9, 0, 15, degradedSteel);
		addBlock(world, basePos, 10, 0, 0, degradedSteel);
		addBlock(world, basePos, 10, 0, 1, toxicStone);
		addBlock(world, basePos, 10, 0, 2, degradedSteel);
		addBlock(world, basePos, 10, 0, 3, voxGlass);
		addBlock(world, basePos, 10, 0, 4, voxGlass);
		addBlock(world, basePos, 10, 0, 5, voxGlass);
		addBlock(world, basePos, 10, 0, 6, toxicStone);
		addBlock(world, basePos, 10, 0, 7, degradedSteel);
		addBlock(world, basePos, 10, 0, 8, degradedSteel);
		addBlock(world, basePos, 10, 0, 9, toxicStone);
		addBlock(world, basePos, 10, 0, 10, voxGlass);
		addBlock(world, basePos, 10, 0, 11, voxGlass);
		addBlock(world, basePos, 10, 0, 12, voxGlass);
		addBlock(world, basePos, 10, 0, 13, degradedSteel);
		addBlock(world, basePos, 10, 0, 14, toxicStone);
		addBlock(world, basePos, 10, 0, 15, degradedSteel);
		addBlock(world, basePos, 11, 0, 0, degradedSteel);
		addBlock(world, basePos, 11, 0, 1, toxicStone);
		addBlock(world, basePos, 11, 0, 2, degradedSteel);
		addBlock(world, basePos, 11, 0, 3, degradedSteel);
		addBlock(world, basePos, 11, 0, 4, degradedSteel);
		addBlock(world, basePos, 11, 0, 5, voxGlass);
		addBlock(world, basePos, 11, 0, 6, toxicStone);
		addBlock(world, basePos, 11, 0, 7, degradedSteel);
		addBlock(world, basePos, 11, 0, 8, degradedSteel);
		addBlock(world, basePos, 11, 0, 9, toxicStone);
		addBlock(world, basePos, 11, 0, 10, voxGlass);
		addBlock(world, basePos, 11, 0, 11, degradedSteel);
		addBlock(world, basePos, 11, 0, 12, degradedSteel);
		addBlock(world, basePos, 11, 0, 13, degradedSteel);
		addBlock(world, basePos, 11, 0, 14, toxicStone);
		addBlock(world, basePos, 11, 0, 15, degradedSteel);
		addBlock(world, basePos, 12, 0, 0, degradedSteel);
		addBlock(world, basePos, 12, 0, 1, toxicStone);
		addBlock(world, basePos, 12, 0, 2, degradedSteel);
		addBlock(world, basePos, 12, 0, 3, steelLight);
		addBlock(world, basePos, 12, 0, 4, degradedSteel);
		addBlock(world, basePos, 12, 0, 5, voxGlass);
		addBlock(world, basePos, 12, 0, 6, toxicStone);
		addBlock(world, basePos, 12, 0, 7, degradedSteel);
		addBlock(world, basePos, 12, 0, 8, degradedSteel);
		addBlock(world, basePos, 12, 0, 9, toxicStone);
		addBlock(world, basePos, 12, 0, 10, voxGlass);
		addBlock(world, basePos, 12, 0, 11, degradedSteel);
		addBlock(world, basePos, 12, 0, 12, steelLight);
		addBlock(world, basePos, 12, 0, 13, degradedSteel);
		addBlock(world, basePos, 12, 0, 14, toxicStone);
		addBlock(world, basePos, 12, 0, 15, degradedSteel);
		addBlock(world, basePos, 13, 0, 0, degradedSteel);
		addBlock(world, basePos, 13, 0, 1, toxicStone);
		addBlock(world, basePos, 13, 0, 2, degradedSteel);
		addBlock(world, basePos, 13, 0, 3, degradedSteel);
		addBlock(world, basePos, 13, 0, 4, degradedSteel);
		addBlock(world, basePos, 13, 0, 5, degradedSteel);
		addBlock(world, basePos, 13, 0, 6, degradedSteel);
		addBlock(world, basePos, 13, 0, 7, degradedSteel);
		addBlock(world, basePos, 13, 0, 8, degradedSteel);
		addBlock(world, basePos, 13, 0, 9, degradedSteel);
		addBlock(world, basePos, 13, 0, 10, degradedSteel);
		addBlock(world, basePos, 13, 0, 11, degradedSteel);
		addBlock(world, basePos, 13, 0, 12, degradedSteel);
		addBlock(world, basePos, 13, 0, 13, degradedSteel);
		addBlock(world, basePos, 13, 0, 14, toxicStone);
		addBlock(world, basePos, 13, 0, 15, degradedSteel);
		addBlock(world, basePos, 14, 0, 0, degradedSteel);
		addBlock(world, basePos, 14, 0, 1, toxicStone);
		addBlock(world, basePos, 14, 0, 2, toxicStone);
		addBlock(world, basePos, 14, 0, 3, toxicStone);
		addBlock(world, basePos, 14, 0, 4, toxicStone);
		addBlock(world, basePos, 14, 0, 5, toxicStone);
		addBlock(world, basePos, 14, 0, 6, toxicStone);
		addBlock(world, basePos, 14, 0, 7, toxicStone);
		addBlock(world, basePos, 14, 0, 8, toxicStone);
		addBlock(world, basePos, 14, 0, 9, toxicStone);
		addBlock(world, basePos, 14, 0, 10, toxicStone);
		addBlock(world, basePos, 14, 0, 11, toxicStone);
		addBlock(world, basePos, 14, 0, 12, toxicStone);
		addBlock(world, basePos, 14, 0, 13, toxicStone);
		addBlock(world, basePos, 14, 0, 14, toxicStone);
		addBlock(world, basePos, 14, 0, 15, degradedSteel);
		addBlock(world, basePos, 15, 0, 0, degradedSteel);
		addBlock(world, basePos, 15, 0, 1, degradedSteel);
		addBlock(world, basePos, 15, 0, 2, degradedSteel);
		addBlock(world, basePos, 15, 0, 3, degradedSteel);
		addBlock(world, basePos, 15, 0, 4, degradedSteel);
		addBlock(world, basePos, 15, 0, 5, degradedSteel);
		addBlock(world, basePos, 15, 0, 6, degradedSteel);
		addBlock(world, basePos, 15, 0, 7, degradedSteel);
		addBlock(world, basePos, 15, 0, 8, degradedSteel);
		addBlock(world, basePos, 15, 0, 9, degradedSteel);
		addBlock(world, basePos, 15, 0, 10, degradedSteel);
		addBlock(world, basePos, 15, 0, 11, degradedSteel);
		addBlock(world, basePos, 15, 0, 12, degradedSteel);
		addBlock(world, basePos, 15, 0, 13, degradedSteel);
		addBlock(world, basePos, 15, 0, 14, degradedSteel);
		addBlock(world, basePos, 15, 0, 15, degradedSteel);
		addBlock(world, basePos, 0, 1, 0, degradedSteel);
		addBlock(world, basePos, 0, 1, 1, degradedSteel);
		addBlock(world, basePos, 0, 1, 2, degradedSteel);
		addBlock(world, basePos, 0, 1, 3, voxGlass);
		addBlock(world, basePos, 0, 1, 4, voxGlass);
		addBlock(world, basePos, 0, 1, 5, voxGlass);
		addBlock(world, basePos, 0, 1, 6, degradedSteel);
		addBlock(world, basePos, 0, 1, 9, degradedSteel);
		addBlock(world, basePos, 0, 1, 10, voxGlass);
		addBlock(world, basePos, 0, 1, 11, voxGlass);
		addBlock(world, basePos, 0, 1, 12, voxGlass);
		addBlock(world, basePos, 0, 1, 13, degradedSteel);
		addBlock(world, basePos, 0, 1, 14, degradedSteel);
		addBlock(world, basePos, 0, 1, 15, degradedSteel);
		addBlock(world, basePos, 1, 1, 0, degradedSteel);
		addBlock(world, basePos, 1, 1, 15, degradedSteel);
		addBlock(world, basePos, 2, 1, 0, degradedSteel);
		addBlock(world, basePos, 2, 1, 15, degradedSteel);
		addBlock(world, basePos, 3, 1, 0, voxGlass);
		addBlock(world, basePos, 3, 1, 15, voxGlass);
		addBlock(world, basePos, 4, 1, 0, voxGlass);
		addBlock(world, basePos, 4, 1, 15, voxGlass);
		addBlock(world, basePos, 5, 1, 0, voxGlass);
		addBlock(world, basePos, 5, 1, 15, voxGlass);
		addBlock(world, basePos, 6, 1, 0, degradedSteel);
		addBlock(world, basePos, 6, 1, 15, degradedSteel);
		addBlock(world, basePos, 7, 1, 7, exoidStation);
		addBlock(world, basePos, 7, 1, 8, exoidStation);
		addBlock(world, basePos, 8, 1, 7, exoidStation);
		addBlock(world, basePos, 8, 1, 8, exoidStation);
		addBlock(world, basePos, 9, 1, 0, degradedSteel);
		addBlock(world, basePos, 9, 1, 15, degradedSteel);
		addBlock(world, basePos, 10, 1, 0, voxGlass);
		addBlock(world, basePos, 10, 1, 15, voxGlass);
		addBlock(world, basePos, 11, 1, 0, voxGlass);
		addBlock(world, basePos, 11, 1, 15, voxGlass);
		addBlock(world, basePos, 12, 1, 0, voxGlass);
		addBlock(world, basePos, 12, 1, 15, voxGlass);
		addBlock(world, basePos, 13, 1, 0, degradedSteel);
		addBlock(world, basePos, 13, 1, 15, degradedSteel);
		addBlock(world, basePos, 14, 1, 0, degradedSteel);
		addBlock(world, basePos, 14, 1, 15, degradedSteel);
		addBlock(world, basePos, 15, 1, 0, degradedSteel);
		addBlock(world, basePos, 15, 1, 1, degradedSteel);
		addBlock(world, basePos, 15, 1, 2, degradedSteel);
		addBlock(world, basePos, 15, 1, 3, voxGlass);
		addBlock(world, basePos, 15, 1, 4, voxGlass);
		addBlock(world, basePos, 15, 1, 5, voxGlass);
		addBlock(world, basePos, 15, 1, 6, degradedSteel);
		addBlock(world, basePos, 15, 1, 9, degradedSteel);
		addBlock(world, basePos, 15, 1, 10, voxGlass);
		addBlock(world, basePos, 15, 1, 11, voxGlass);
		addBlock(world, basePos, 15, 1, 12, voxGlass);
		addBlock(world, basePos, 15, 1, 13, degradedSteel);
		addBlock(world, basePos, 15, 1, 14, degradedSteel);
		addBlock(world, basePos, 15, 1, 15, degradedSteel);
		addBlock(world, basePos, 0, 2, 0, degradedSteel);
		addBlock(world, basePos, 0, 2, 2, degradedSteel);
		addBlock(world, basePos, 0, 2, 13, degradedSteel);
		addBlock(world, basePos, 0, 2, 15, degradedSteel);
		addBlock(world, basePos, 2, 2, 0, degradedSteel);
		addBlock(world, basePos, 2, 2, 15, degradedSteel);
		addBlock(world, basePos, 13, 2, 0, degradedSteel);
		addBlock(world, basePos, 13, 2, 15, degradedSteel);
		addBlock(world, basePos, 15, 2, 0, degradedSteel);
		addBlock(world, basePos, 15, 2, 2, degradedSteel);
		addBlock(world, basePos, 15, 2, 13, degradedSteel);
		addBlock(world, basePos, 15, 2, 15, degradedSteel);
	}
}
