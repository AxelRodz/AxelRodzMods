package com.Axel.ExtraStuff.CreativeTab;

import com.Axel.ExtraStuff.ExtraStuff;
import com.Axel.ExtraStuff.lib.References;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class CreativeTabExtrastuff 
{
	public static final CreativeTabs Tab = new CreativeTabs(References.MODID)
	
	{
		@Override 
		public Item getTabIconItem()
		{
		return ExtraStuff.WaterDiamond;	
		}
		
		@Override
		public String getTranslatedTabLabel()
		{
			return "Extra Stuff";
		}
	};
public static final CreativeTabs TabTools = new CreativeTabs(References.MODID)
	
	{
		@Override 
		public Item getTabIconItem()
		{
		return ExtraStuff.EmeraldPickaxe ;	
		}
		
		@Override
		public String getTranslatedTabLabel()
		{
			return "Extra Stuff Tools";
		}
	};
}