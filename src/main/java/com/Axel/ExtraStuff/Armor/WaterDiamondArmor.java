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

public class WaterDiamondArmor extends ItemArmor{

	public WaterDiamondArmor(ArmorMaterial p_i45325_1_, int p_i45325_2_,
			int p_i45325_3_) {
		super(p_i45325_1_, p_i45325_2_, p_i45325_3_);
		this.setCreativeTab(CreativeTabExtrastuff.Tab);
		
		
		
	}
	
	public String getArmorTexture(ItemStack stack, Entity entity, int slot,String type ){
		if(stack.getItem() == ExtraStuff.WaterDiamondHelmet || stack.getItem() == ExtraStuff.WaterDiamondChestplate || stack.getItem() == ExtraStuff.WaterDiamondBoots){
			return "extrastuff:textures/models/armor/WaterDiamondArmor_1.png";
		}
		if(stack.getItem() == ExtraStuff.WaterDiamondLeggings);
		    return "extrastuff:textures/models/armor/WaterDiamondArmor_2.png";
		}
		
	public void onArmorTick(World world, EntityPlayer player, ItemStack itemstack )
	{
		if(player.getCurrentArmor(0) != null ) {
			ItemStack boots = player.getCurrentArmor(0);
			if(boots.getItem() == ExtraStuff.WaterDiamondBoots)  {
				player.addPotionEffect(new PotionEffect(Potion.moveSpeed.getId(), 1, 1));
			}
			
		}

	}
	
}	
