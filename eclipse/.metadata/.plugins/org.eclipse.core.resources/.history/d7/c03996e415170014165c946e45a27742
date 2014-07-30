package com.Axel.ExtraStuff.WorldGen;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;

import com.Axel.ExtraStuff.ExtraStuff;

import cpw.mods.fml.common.IWorldGenerator;

public class ExtraStuffWorldGen implements IWorldGenerator {

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		switch(world.provider.dimensionId) {
		
		//I can copy and paste the case 0: but i have to change the 0 for the dim Id Ex. OverWorld = 0 End = 1 Nether = -1
		case 0:
			//Generate our surface World 
			generateSurface(world, random, chunkX*16, chunkZ*16);
			
		case -1:
			//Generate our surface World 
			generateNether(world, random, chunkX*16, chunkZ*16);
			
		case 1:
			//Generate our surface World 
			generateEnd(world, random, chunkX*16, chunkZ*16);
		}
	}

	private void generateEnd(World world, Random random, int i, int j) {
		
	}

	private void generateNether(World world, Random random, int x, int z) {
	}

	private void generateSurface(World world, Random random, int x, int z) {
		//this.addOreSpawn(ExtraStuff.ore(Name), world, random, i, j, 16, 16,4+random.nextInt(6), ChancesToSpawn , minY, maxY));
		this.addOreSpawn(ExtraStuff.oreAmethyst, world, random, x, z, 16, 16,4+random.nextInt(6), 15, 1, 16);
		this.addOreSpawn(ExtraStuff.oreCopperOre, world, random, x, z, 16, 16,4+random.nextInt(6), 29, 20, 64);
		
	}

	private void addOreSpawn(Block Block, World world, Random random, int blockXPos, int blockZPos, int maxX, int maxZ, int maxVeinSize, int chancesToSpawn, int minY, int maxY) {
		for(int i = 0; i < chancesToSpawn; i++ ){	
		int posX = blockXPos + random.nextInt(maxX);
		int posY = minY + random.nextInt(maxY - minY);
		int posZ = blockZPos + random.nextInt(maxZ);
		(new WorldGenMinable(Block, maxVeinSize)).generate(world, random, posX, posY, posZ);
					
		}
	}

}
