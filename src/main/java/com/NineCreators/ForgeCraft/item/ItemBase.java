package com.NineCreators.ForgeCraft.item;

import com.NineCreators.ForgeCraft.util.registryHandler;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ItemBase {

    public static final ItemGroup FORGECRAFT_GROUP = new ItemGroup("forgecraftTab")
    {
        @Override
        public ItemStack createIcon()
        {
            return new ItemStack(registryHandler.COPPER_INGOT.get());
        }
    };
}
