package net.tslat.aoa3.dimension.barathos;

import net.minecraft.client.audio.MusicTicker;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.DimensionType;
import net.minecraft.world.WorldProvider;
import net.minecraft.world.WorldServer;
import net.minecraft.world.chunk.Chunk;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.tslat.aoa3.common.registration.DimensionRegister;
import net.tslat.aoa3.dimension.AoATeleporter;
import net.tslat.aoa3.dimension.AoAWorldProvider;
import net.tslat.aoa3.library.Enums;

import javax.annotation.Nullable;

public class WorldProviderBarathos extends WorldProvider implements AoAWorldProvider {
	@Override
	public DimensionType getDimensionType() {
		return DimensionRegister.DIM_BARATHOS;
	}

	@Override
	protected void init() {
		this.hasSkyLight = true;
		this.biomeProvider = DimensionRegister.WORLD_BARATHOS.getBiomeProvider(world);
	}

	@Override
	public AoATeleporter getTeleporter(WorldServer fromWorld) {
		return new BarathosTeleporter(fromWorld);
	}

	@Override
	public IChunkGenerator createChunkGenerator() {
		return DimensionRegister.WORLD_BARATHOS.getChunkGenerator(world, null);
	}

	@Override
	public boolean canDoRainSnowIce(Chunk chunk) {
		return false;
	}

	@Override
	public boolean canSnowAt(BlockPos pos, boolean checkLight) {
		return false;
	}

	@Nullable
	@Override
	public String getSaveFolder() {
		return "AoA_Barathos";
	}

	@Override
	public boolean canDoLightning(Chunk chunk) {
		return false;
	}

	@Override
	public boolean doesXZShowFog(int x, int z) {
		return true;
	}

	@Nullable
	@Override
	public MusicTicker.MusicType getMusicType() {
		return Enums.NULL_MUSIC;
	}

	@Override
	public boolean canRespawnHere() {
		return false;
	}

	@Override
	public float getCloudHeight() {
		return 128f;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public Vec3d getFogColor(float x, float z) {
		float f2 = MathHelper.clamp(MathHelper.cos(x * (float)Math.PI * 2.0F) * 2.0F + 0.5F, 1.5f, 5f);
		float f3 = 0.5F * f2;
		float f4 = 0.3F * f2;
		float f5 = 0.2F * f2;
		return new Vec3d(f3, f4, f5);
	}

	@Override
	public boolean isSurfaceWorld() {
		return false;
	}

	@Override
	public float calculateCelestialAngle(long worldTime, float partialTicks) {
		return 0.0F;
	}
}
