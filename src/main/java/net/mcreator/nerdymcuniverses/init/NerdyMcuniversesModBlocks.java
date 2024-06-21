
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.nerdymcuniverses.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.nerdymcuniverses.block.HiBlock;
import net.mcreator.nerdymcuniverses.NerdyMcuniversesMod;

public class NerdyMcuniversesModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, NerdyMcuniversesMod.MODID);
	public static final RegistryObject<Block> HI = REGISTRY.register("hi", () -> new HiBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
