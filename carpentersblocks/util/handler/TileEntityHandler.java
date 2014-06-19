package carpentersblocks.util.handler;

import carpentersblocks.tileentity.TEBase;
import carpentersblocks.tileentity.TECarpentersDaylightSensor;
import carpentersblocks.tileentity.TECarpentersFlowerPot;
import carpentersblocks.tileentity.TECarpentersSafe;
import carpentersblocks.tileentity.TECarpentersTorch;
import cpw.mods.fml.common.registry.GameRegistry;

public class TileEntityHandler {

    /**
     * Registers tile entities.
     */
    public static void registerTileEntities()
    {
        GameRegistry.registerTileEntity(                    TEBase.class,          "TileEntityCarpentersBlock");
        GameRegistry.registerTileEntity(TECarpentersDaylightSensor.class, "TileEntityCarpentersDaylightSensor");
        GameRegistry.registerTileEntity(         TECarpentersTorch.class,          "TileEntityCarpentersTorch");
        GameRegistry.registerTileEntity(          TECarpentersSafe.class,           "TileEntityCarpentersSafe");
        GameRegistry.registerTileEntity(     TECarpentersFlowerPot.class,      "TileEntityCarpentersFlowerPot");
    }

}
