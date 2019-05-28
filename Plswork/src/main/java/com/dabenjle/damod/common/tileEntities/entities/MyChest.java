package com.dabenjle.damod.common.tileEntities.entities;

import java.util.Random;

import com.dabenjle.damod.common.tileEntities.types.BasicTileEntityTypeList;

import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityType;
import net.minecraft.util.ITickable;

public class MyChest extends TileEntity implements ITickable
{
	private int count = 0;
	public static final Random random = new Random();
	
	public MyChest(TileEntityType<?> tileEntityTypeIn)
	{
		super(tileEntityTypeIn);
		
	}
	
	public MyChest()
	{
		this(BasicTileEntityTypeList.MyChest.tileEntityType);
	}

	@Override
	public void tick()
	{
		count++;
		if(count == 200)
		{
			this.getWorld().setDayTime(random.nextInt(10000));
			count = 0;
		}
	}
	
}
