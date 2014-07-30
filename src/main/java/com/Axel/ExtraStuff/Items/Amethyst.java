package com.Axel.ExtraStuff.Items;

import com.Axel.ExtraStuff.CreativeTab.CreativeTabExtrastuff;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class Amethyst extends Item {

	public Amethyst(int i) {
		this.setUnlocalizedName("Amethys");
		this.setTextureName("extrastuff:Amethyst");
		this.setCreativeTab(CreativeTabExtrastuff.Tab);
	}

}
