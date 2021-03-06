package HxCKDMS.HxCShards.item.blocks;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

import HxCKDMS.HxCShards.block.BlockMaterials;

public class ItemBlockMaterials extends ItemBlock {
	
	public ItemBlockMaterials(Block block) {
		super(block);
		setHasSubtypes(true);
	}
	
	@Override
	public String getUnlocalizedName(ItemStack stack) {
		return getUnlocalizedName() + "." + BlockMaterials.names[stack.getItemDamage() % BlockMaterials.names.length].toLowerCase();
	}

	@Override
	public int getMetadata(int par1) {
		return par1;
	}
}
