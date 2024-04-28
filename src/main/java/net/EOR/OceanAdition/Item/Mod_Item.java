package net.EOR.OceanAdition.Item;

import net.EOR.OceanAdition.OceanAdition;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class Mod_Item {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, OceanAdition.MOD_ID);

    public static final RegistryObject<Item> PRISMARINE_STICK = ITEMS.register("prismarine_stick",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> POLISHED_PRISMARINE_SHARD =ITEMS.register("polished_prismarine_shard",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> POLISHED_AMETHYST_SHARD =ITEMS.register("polished_amethyst_shard",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);


    }
}
