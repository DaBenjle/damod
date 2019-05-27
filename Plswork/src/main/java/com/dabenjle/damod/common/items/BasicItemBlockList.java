package com.dabenjle.damod.common.items;

import java.util.ArrayList;

import com.dabenjle.damod.common.blocks.BasicBlock;
import com.dabenjle.damod.common.blocks.BasicBlockList;

public class BasicItemBlockList
{
	public static final ArrayList<BasicItemBlock> basicItemBlocks = new ArrayList<BasicItemBlock>();

	public static void constructItemsFromBasicBlocks()
	{
		for(BasicBlock block : BasicBlockList.basicBlocks)
		{
			new BasicItemBlock(block.block, block.itemProperties, block.registryName);
		}
	}
}
