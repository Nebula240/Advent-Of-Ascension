package net.tslat.aoa3.entity.npcs.skillmaster;

import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.tslat.aoa3.common.registration.ArmourRegister;
import net.tslat.aoa3.common.registration.ItemRegister;
import net.tslat.aoa3.common.registration.LootSystemRegister;
import net.tslat.aoa3.entity.base.AoATraderRecipe;

import javax.annotation.Nullable;

public class EntityRunationMaster extends EntitySkillMaster {
	public EntityRunationMaster(World world) {
		super(world);
	}

	@Nullable
	@Override
	protected ResourceLocation getLootTable() {
		return LootSystemRegister.entityRunationMaster;
	}

	@Override
	protected void getTradesList(final NonNullList<AoATraderRecipe> newTradesList) {
		newTradesList.add(new AoATraderRecipe(new ItemStack(ItemRegister.LUNAVER_COIN), new ItemStack(ArmourRegister.RUNATION_HELMET)));
		newTradesList.add(new AoATraderRecipe(new ItemStack(ItemRegister.LUNAVER_COIN), new ItemStack(ArmourRegister.RUNATION_CHESTPLATE)));
		newTradesList.add(new AoATraderRecipe(new ItemStack(ItemRegister.LUNAVER_COIN), new ItemStack(ArmourRegister.RUNATION_LEGS)));
		newTradesList.add(new AoATraderRecipe(new ItemStack(ItemRegister.LUNAVER_COIN), new ItemStack(ArmourRegister.RUNATION_BOOTS)));
	}
}
