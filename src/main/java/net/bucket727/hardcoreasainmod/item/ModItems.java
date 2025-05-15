package net.bucket727.hardcoreasainmod.item;

import net.bucket727.hardcoreasainmod.HardcoreAsainMod;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
   // CHOP STICKS ITEM
    public static final Item CHOP_STICKS = registerItem("chop_sticks", new Item(new Item.Settings()));


    // register item helper method
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(HardcoreAsainMod.MOD_ID, name), item);
    }



    /**
     * The register method in order to connect the mod to items
     *
     */

    public static void registerItems() {
        HardcoreAsainMod.LOGGER.info("Registering Items for " + HardcoreAsainMod.MOD_ID);
    }

}
