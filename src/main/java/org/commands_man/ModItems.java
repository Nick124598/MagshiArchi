package org.commands_man;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item TESTITEM = registerItem("testitem", new Item(new Item.Settings()));

    public static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(MagshimArchi.MOD_ID, name), item);
    }


    public static void regsiterItems() {
        MagshimArchi.LOGGER.info("Registering items.");
    }
}
