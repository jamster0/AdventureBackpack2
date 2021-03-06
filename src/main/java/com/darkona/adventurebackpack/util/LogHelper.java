package com.darkona.adventurebackpack.util;

import org.apache.logging.log4j.Level;

import com.darkona.adventurebackpack.reference.ModInfo;

import cpw.mods.fml.common.FMLLog;
import net.minecraft.util.ChunkCoordinates;

/**
 * Created by Darkona on 12/10/2014.
 */
public class LogHelper
{

    public static void log(Level logLevel, Object object)
    {
        FMLLog.log(ModInfo.MOD_NAME, logLevel, String.valueOf(object));
    }

    public static String print3DCoords(int x, int y, int z)
    {
        return "Coords: X= " + x + ", Y= " + y + ", Z=" + z;
    }

    public static String print3DCoords(ChunkCoordinates coords)
    {
        return print3DCoords(coords.posX, coords.posY, coords.posZ);
    }

    public static void all(Object object)
    {
        log(Level.ALL, object);
    }

    public static void debug(Object object)
    {
        log(Level.DEBUG, object);
    }

    public static void error(Object object)
    {
        log(Level.ERROR, object);
    }

    public static void fatal(Object object)
    {
        log(Level.FATAL, object);
    }

    public static void info(Object object)
    {
        log(Level.INFO, object);
    }

    public static void off(Object object)
    {
        log(Level.OFF, object);
    }

    public static void trace(Object object)
    {
        log(Level.TRACE, object);
    }

    public static void warn(Object object)
    {
        log(Level.WARN, object);
    }
}
