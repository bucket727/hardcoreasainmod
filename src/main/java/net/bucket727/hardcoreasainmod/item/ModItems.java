package net.bucket727.hardcoreasainmod.item;

import net.bucket727.hardcoreasainmod.HardcoreAsainMod;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

public class ModItems {

    // CHOP STICKS ITEM
    public static final Item CHOP_STICKS = registerItem("chop_sticks", new Item(new Item.Settings().registryKey
           (RegistryKey.of(RegistryKeys.ITEM, Identifier.of(HardcoreAsainMod.MOD_ID,"chop_sticks")))));

    // RICE BOWL ITEM
    public static final Item RICE_BOWL = registerItem("rice_bowl", new Item(new Item.Settings().registryKey
            (RegistryKey.of(RegistryKeys.ITEM, Identifier.of(HardcoreAsainMod.MOD_ID, "rice_bowl")))));


    // register item helper method
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(HardcoreAsainMod.MOD_ID, name), item);
    }



    /**
     * The register method in order to connect the mod to items
     *
     */

    public static void registerModItems() {
        HardcoreAsainMod.LOGGER.info("Registering Items for " + HardcoreAsainMod.MOD_ID);
        // So that its in the creative tab, this makes it appear in creative tab
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(CHOP_STICKS);
            entries.add(RICE_BOWL);
        });
    }

}
