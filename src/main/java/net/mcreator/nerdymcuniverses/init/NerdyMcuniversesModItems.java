
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.nerdymcuniverses.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.nerdymcuniverses.NerdyMcuniversesMod;

public class NerdyMcuniversesModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, NerdyMcuniversesMod.MODID);
	public static final RegistryObject<Item> HI = block(NerdyMcuniversesModBlocks.HI);

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
