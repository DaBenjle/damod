package com.dabenjle.damod.common.items;

import net.minecraft.block.Block;
import net.minecraft.item.Item.Properties;
import net.minecraft.item.ItemBlock;

public class BasicItemBlock
{
	public ItemBlock itemBlock;
	
	public BasicItemBlock(Block blockIn, Properties builder, String name)
	{
		itemBlock = new ItemBlock(blockIn, builder);
		itemBlock.setRegistryName("damod", name);
		
		BasicItemBlockList.basicItemBlocks.add(this);
	}
	
}
