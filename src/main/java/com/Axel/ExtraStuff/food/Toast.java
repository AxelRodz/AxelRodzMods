package com.Axel.ExtraStuff.food;

import com.Axel.ExtraStuff.CreativeTab.CreativeTabExtrastuff;

import net.minecraft.item.ItemFood;

public class Toast extends ItemFood {

	public Toast(int f, float g, boolean b) {
		super(f , b);
		this.setCreativeTab(CreativeTabExtrastuff.Tab);
		this.setUnlocalizedName("Toast");
		this.setTextureName("extrastuff:Toast");
	}

}
