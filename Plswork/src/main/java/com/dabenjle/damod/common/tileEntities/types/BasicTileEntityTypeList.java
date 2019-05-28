package com.dabenjle.damod.common.tileEntities.types;

import java.util.ArrayList;

import net.minecraft.tileentity.TileEntityType;

public class BasicTileEntityTypeList
{

	public static ArrayList<BasicTileEntityType> basicTileEntityTypes = new ArrayList<BasicTileEntityType>();
	
	public static final BasicTileEntityType MyChest = new BasicTileEntityType(TileEntityType.Builder.create(com.dabenjle.damod.common.tileEntities.entities.MyChest::new).build(null), "my_chest");
	
}
