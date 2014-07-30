package com.Axel.ExtraStuff.Armor;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

import com.Axel.ExtraStuff.ExtraStuff;
import com.Axel.ExtraStuff.CreativeTab.CreativeTabExtrastuff;

public class CopperArmor extends ItemArmor{

	public CopperArmor(ArmorMaterial p_i45325_1_, int p_i45325_2_,
			int p_i45325_3_) {
		super(p_i45325_1_, p_i45325_2_, p_i45325_3_);
		this.setCreativeTab(CreativeTabExtrastuff.Tab);
		
		
		
	}
	
	public String getArmorTexture(ItemStack stack, Entity entity, int slot,String type ){
		if(stack.getItem() == ExtraStuff.CopperHelmet || stack.getItem() == ExtraStuff.CopperChestplate || stack.getItem() == ExtraStuff.CopperBoots){
			return "extrastuff:textures/models/armor/CopperArmor_1.png";
		}
		if(stack.getItem() == ExtraStuff.CopperLeggings);
		    return "extrastuff:textures/models/armor/CopperArmor_2.png";
		}
		}

	
