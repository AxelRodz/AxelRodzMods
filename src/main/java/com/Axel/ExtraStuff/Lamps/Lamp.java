package com.Axel.ExtraStuff.Lamps;

import java.util.Random;

import com.Axel.ExtraStuff.ExtraStuff;
import com.Axel.ExtraStuff.lib.References;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;


public class Lamp extends Block {

private final boolean isOn;

public Lamp(boolean isOn) {
super(Material.redstoneLight);

this.isOn = isOn;

if (isOn) {
this.setLightLevel(1.0F);
}
}

public void registerBlockIcons(IIconRegister iconRegister) {
this.blockIcon = iconRegister.registerIcon(References.MODID + ":" + (this.isOn ? "LampOn" : "LampOff"));
}

public void onBlockAdded(World world, int x, int y, int z) {

if (!world.isRemote) {
if (this.isOn && !world.isBlockIndirectlyGettingPowered(x, y, z)) {
world.scheduleBlockUpdate(x, y, z, this, 4);
}
else if (!this.isOn && world.isBlockIndirectlyGettingPowered(x, y, z)) {
world.setBlock(x, y, z, ExtraStuff.blockLampOn, 0, 2);
}
}
}

public void onNeighborBlockChange(World world, int x, int y, int z, Block block) {

if (!world.isRemote) {
if (this.isOn && !world.isBlockIndirectlyGettingPowered(x, y, z)) {
world.scheduleBlockUpdate(x, y, z, this, 4);
}
else if (!this.isOn && world.isBlockIndirectlyGettingPowered(x, y, z)) {
world.setBlock(x, y, z, ExtraStuff.blockLampOn, 0, 2);
}
}
}

public void updateTick(World world, int x, int y, int z, Random random) {

if (!world.isRemote && this.isOn && !world.isBlockIndirectlyGettingPowered(x, y, z)) {
world.setBlock(x, y, z, ExtraStuff.blockLampOff, 0, 2);
}
}

public Item getItemDropped(int i, Random random, int j) {
return Item.getItemFromBlock(ExtraStuff.blockLampOff);
}

protected ItemStack createStackedBlock(int i) {
return new ItemStack(ExtraStuff.blockLampOff);
}


}