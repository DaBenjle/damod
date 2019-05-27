package com.dabenjle.damod.common.items;

import net.minecraft.item.Item;
import net.minecraft.item.Item.Properties;

public class BasicItem
{
	public Item item;
	
	public BasicItem(Properties properties, String name)
	{
		this(new Item(properties), name);
	}
	
	public BasicItem(Item item, String name)
	{
		item.setRegistryName("damod", name);
		this.item = item;
		BasicItemList.basicItems.add(this);
	}
	
}
