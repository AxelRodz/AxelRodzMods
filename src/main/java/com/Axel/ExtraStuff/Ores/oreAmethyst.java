package com.Axel.ExtraStuff.Ores;

import java.util.Random;

import com.Axel.ExtraStuff.ExtraStuff;
import com.Axel.ExtraStuff.CreativeTab.CreativeTabExtrastuff;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;

public class oreAmethyst extends Block {

	public  oreAmethyst(Material Material) {
		super(Material.rock);
		this.setHardness(2.0F);
		this.setResistance(5.0F);
		this.setStepSound(soundTypeStone);
		this.setBlockName("oreAmethyst");
		this.setBlockTextureName("extrastuff:oreAmethyst");
		this.setCreativeTab(CreativeTabExtrastuff.Tab);
	}
	private void setHarvestLevel(ToolMaterial iron, int level) {
		
	}
	public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_)
    {
        return this == ExtraStuff.oreAmethyst ? ExtraStuff.Amethyst : (this == Blocks.diamond_block ? ExtraStuff.Amethyst : (this == Blocks.lapis_ore ? Items.dye : (this == Blocks.emerald_ore ? Items.emerald : (this == Blocks.quartz_ore ? Items.quartz : Item.getItemFromBlock(this)))));
    }
	}
