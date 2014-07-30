package com.Axel.ExtraStuff.Ingots;

import com.Axel.ExtraStuff.CreativeTab.CreativeTabExtrastuff;

import net.minecraft.item.Item;

public class itemEmeraldIngot extends Item {
	public itemEmeraldIngot(int i) {
		this.setCreativeTab(CreativeTabExtrastuff.Tab);
		this.setUnlocalizedName("ingotEmerald");
		this.setTextureName("extrastuff:itemEmeraldIngot");

}
}