package net.ybibibaz.precious_chickens.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.ybibibaz.precious_chickens.PreciousChickens;

public class PreciousChickensItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(
        ForgeRegistries.ITEMS, PreciousChickens.MODID);

    public static final RegistryObject<Item> GOLDEN_EGG = ITEMS.register(
        "golden_egg", () -> new Item(new Item.Properties().setId(ITEMS.key("golden_egg"))));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
