package com.Axel.ExtraStuff.Tools;

import com.Axel.ExtraStuff.CreativeTab.CreativeTabExtrastuff;

import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemSpade;

public class AmethystSpade extends ItemSpade{

	public AmethystSpade(ToolMaterial p_i45353_1_) {
		super(p_i45353_1_);
		this.setUnlocalizedName("AmethystSpade");
		this.setCreativeTab(CreativeTabExtrastuff.TabTools);
		this.setTextureName("extrastuff:AmethystSpade");
	}

}
