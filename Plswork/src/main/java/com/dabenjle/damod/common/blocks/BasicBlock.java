package com.dabenjle.damod.common.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.Block.Properties;

public class BasicBlock
{
	public net.minecraft.item.Item.Properties itemProperties;
	public String registryName;
	public Block block;
	public BasicBlock(Properties properties, String registryName, net.minecraft.item.Item.Properties itemProperties)
	{
		this(new Block(properties), registryName, itemProperties);
	}
	
	public BasicBlock(Block block, String registryName, net.minecraft.item.Item.Properties itemProperties)
	{
		this.block = block;
		block.setRegistryName("damod", registryName);
		this.registryName = registryName;
		this.itemProperties = itemProperties;
		BasicBlockList.basicBlocks.add(this);
	}
	
}
