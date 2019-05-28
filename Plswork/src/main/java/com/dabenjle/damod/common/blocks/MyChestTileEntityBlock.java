package com.dabenjle.damod.common.blocks;

import com.dabenjle.damod.common.tileEntities.entities.MyChest;
import com.dabenjle.damod.common.tileEntities.types.BasicTileEntityTypeList;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.world.IBlockReader;
import net.minecraftforge.common.extensions.IForgeBlock;

public class MyChestTileEntityBlock extends Block implements IForgeBlock
{

	public MyChestTileEntityBlock(Properties properties)
	{
		super(properties);
	}
	
	@Override
	public boolean hasTileEntity(IBlockState state)
	{
		return true;
	}
	
	@Override
	public MyChest createTileEntity(IBlockState state, IBlockReader worldIn)
	{
		return (MyChest) BasicTileEntityTypeList.MyChest.tileEntityType.create();
	}
	
}
