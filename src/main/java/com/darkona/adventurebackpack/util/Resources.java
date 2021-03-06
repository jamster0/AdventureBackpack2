package com.darkona.adventurebackpack.util;

import com.darkona.adventurebackpack.common.IInventoryAdventureBackpack;
import com.darkona.adventurebackpack.reference.BackpackNames;
import com.darkona.adventurebackpack.reference.ModInfo;

import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;

/**
 * Created on 10/10/2014
 *
 * @author Darkona
 */
public class Resources
{

    public static final String TEXTURE_LOCATION = ModInfo.MOD_ID.toLowerCase();

    public static String modelTextureResourceString(String name)
    {
        return new ResourceLocation(TEXTURE_LOCATION, "textures/models/" + name).toString();
    }

    public static String backpackTexturesStringFromColor(ItemStack backpack)
    {
        return new ResourceLocation(TEXTURE_LOCATION, "textures/backpack/" + BackpackNames.getBackpackColorName(backpack) + ".png").toString();
    }

    public static ResourceLocation backpackTextureFromString(String color)
    {
        return new ResourceLocation(TEXTURE_LOCATION, "textures/backpack/" + color + ".png");
    }

    public static ResourceLocation backpackTextureFromColor(IInventoryAdventureBackpack adventureBackpack)
    {
        return new ResourceLocation(TEXTURE_LOCATION, "textures/backpack/" + adventureBackpack.getColorName() + ".png");
    }

    public static ResourceLocation guiTextures(String name)
    {
        return new ResourceLocation(TEXTURE_LOCATION, "textures/gui/" + name + ".png");
    }

    public static ResourceLocation itemTextures(String name)
    {
        return new ResourceLocation(TEXTURE_LOCATION, name);
    }

    public static ResourceLocation blockTextures(String name)
    {
        return new ResourceLocation(TEXTURE_LOCATION, name);
    }

    public static ResourceLocation fluidTextures(String name)
    {
        return new ResourceLocation(TEXTURE_LOCATION, "textures/blocks/fluid." + name + ".png");
    }

    public static ResourceLocation modelTextures(String name)
    {
        return new ResourceLocation(TEXTURE_LOCATION, "textures/models/" + name + ".png");
    }

    public static String getIconString(String name)
    {
        return TEXTURE_LOCATION + ":" + name;
    }

}
