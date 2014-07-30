package com.Axel.ExtraStuff.Ingots;

import com.Axel.ExtraStuff.CreativeTab.CreativeTabExtrastuff;

import net.minecraft.item.Item;

public class ingotSteel extends Item {

	public ingotSteel(int i) {
		this.setCreativeTab(CreativeTabExtrastuff.Tab);
		this.setTextureName("extrastuff:ingotSteel");
		this.setUnlocalizedName("ingotSteel");
	}

}
