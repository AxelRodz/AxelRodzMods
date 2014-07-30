package com.Axel.ExtraStuff.Tools;

import com.Axel.ExtraStuff.CreativeTab.CreativeTabExtrastuff;

import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemSword;

public class AmethystSword extends ItemSword {

	public AmethystSword(ToolMaterial p_i45356_1_) {
		super(p_i45356_1_);
		this.setCreativeTab(CreativeTabExtrastuff.TabTools);
		this.setTextureName("extrastuff:AmethystSword");
		this.setUnlocalizedName("AmethystSword");
	}
}
