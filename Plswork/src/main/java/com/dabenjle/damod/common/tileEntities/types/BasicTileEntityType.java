package com.dabenjle.damod.common.tileEntities.types;

import net.minecraft.tileentity.TileEntityType;

public class BasicTileEntityType
{
	public TileEntityType<?> tileEntityType;
	
	public BasicTileEntityType(TileEntityType<?> tileEntityType, String name)
	{
		this.tileEntityType = tileEntityType;
		tileEntityType.setRegistryName("damod" + name);
		BasicTileEntityTypeList.basicTileEntityTypes.add(this);
	}
}
