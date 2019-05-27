package com.dabenjle.damod.common.blocks;

import java.util.ArrayList;

import com.dabenjle.damod.common.items.BasicItemBlockList;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.common.ToolType;

public class BasicBlockList
{
	public static final ArrayList<BasicBlock> basicBlocks = new ArrayList<BasicBlock>();
	
	static
	{
		new BasicBlock(new Block(Block.Properties.create(Material.GLASS).slipperiness(.99999f).lightValue(15))
		{
			@Override
			public boolean onBlockActivated(IBlockState state, World worldIn, BlockPos pos, EntityPlayer player, EnumHand hand, EnumFacing side, float hitX, float hitY,
					float hitZ)
			{
				player.giveExperiencePoints(100);
				return true;
			}
		}, "slick_ice", new Item.Properties().rarity(EnumRarity.UNCOMMON).addToolType(ToolType.SHOVEL, 1).group(ItemGroup.BUILDING_BLOCKS));
		new BasicBlock(Block.Properties.create(Material.ROCK).hardnessAndResistance(.9f), "thicc_dirt",
						new Item.Properties().rarity(EnumRarity.RARE).group(ItemGroup.BUILDING_BLOCKS));
		
		// calls creation for itemblocks after all blocks are created
		BasicItemBlockList.constructItemsFromBasicBlocks();
	}
}
