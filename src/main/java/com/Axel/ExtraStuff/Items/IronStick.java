package com.Axel.ExtraStuff.Items;

import com.Axel.ExtraStuff.CreativeTab.CreativeTabExtrastuff;

import net.minecraft.item.Item;

public class IronStick extends Item {

	public IronStick(int i) {
		this.setCreativeTab(CreativeTabExtrastuff.Tab);
		this.setTextureName("extrastuff:IronStick");
		this.setUnlocalizedName("IronStick");
	}

}
