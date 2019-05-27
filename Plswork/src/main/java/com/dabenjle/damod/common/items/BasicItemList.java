package com.dabenjle.damod.common.items;

import java.util.ArrayList;

import net.minecraft.block.Block;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemSword;
import net.minecraft.item.ItemTier;
import net.minecraft.item.ItemUseContext;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class BasicItemList
{
	//Includes just regular items, not ItemBlocks
	public static final ArrayList<BasicItem> basicItems = new ArrayList<BasicItem>();
	
	static
	{
		new BasicItem(new ItemSword(ItemTier.DIAMOND, 10, -2.4f, new Item.Properties().rarity(EnumRarity.EPIC).group(ItemGroup.COMBAT))
				{
					@Override
					public EnumActionResult onItemUse(ItemUseContext context)
					{
						EnumActionResult superResult = super.onItemUse(context);
						BlockPos fireLocation = context.getPos().up();
						if(context.getWorld().getBlockState(fireLocation).equals(GameRegistry.findRegistry(Block.class).getValue(new ResourceLocation("minecraft:air")).getDefaultState()))
						{
							context.getWorld().setBlockState(fireLocation, GameRegistry.findRegistry(Block.class).getValue(new ResourceLocation("minecraft:fire")).getDefaultState());
							this.setDamage(context.getItem(), this.getDamage(context.getItem()) + 1);
							return superResult;
						}
						
						return EnumActionResult.FAIL;
					}
				}, "fiery_sword");
		new BasicItem(new ItemSword(ItemTier.DIAMOND, 10, -2.4f, new Item.Properties().rarity(EnumRarity.EPIC).group(ItemGroup.COMBAT)), "ice_sword");
	}
}
