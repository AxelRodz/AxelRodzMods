package com.Axel.ExtraStuff.Ingots;

import com.Axel.ExtraStuff.CreativeTab.CreativeTabExtrastuff;

import net.minecraft.item.Item;

public class itemCopperIngot extends Item {

	public itemCopperIngot(int i) {
		this.setCreativeTab(CreativeTabExtrastuff.Tab);
		this.setUnlocalizedName("ingotCopper");
		this.setTextureName("extrastuff:ingotCopper");
	}

}
