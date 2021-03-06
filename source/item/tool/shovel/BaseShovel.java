package net.tslat.aoa3.item.tool.shovel;

import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import net.tslat.aoa3.common.registration.CreativeTabsRegister;
import net.tslat.aoa3.common.registration.ItemRegister;

public class BaseShovel extends ItemSpade {
	public BaseShovel(String name, String registryName, ToolMaterial material) {
		super(material);

		setTranslationKey(name);
		setRegistryName("aoa3:" + registryName);
		setCreativeTab(CreativeTabsRegister.TOOLS);
	}

	@Override
	public boolean getIsRepairable(ItemStack stack, ItemStack repairMaterial) {
		return OreDictionary.itemMatches(repairMaterial, new ItemStack(ItemRegister.MAGIC_REPAIR_DUST), false) || super.getIsRepairable(stack, repairMaterial);
	}
}
