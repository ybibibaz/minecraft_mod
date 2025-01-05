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
    public static final RegistryObject<Item> GLASS_EGG = ITEMS.register(
        "glass_egg", () -> new Item(new Item.Properties().setId(ITEMS.key("glass_egg"))));
    public static final RegistryObject<Item> COPPER_EGG = ITEMS.register(
        "copper_egg", () -> new Item(new Item.Properties().setId(ITEMS.key("copper_egg"))));
    public static final RegistryObject<Item> IRON_EGG = ITEMS.register(
        "iron_egg", () -> new Item(new Item.Properties().setId(ITEMS.key("iron_egg"))));
    public static final RegistryObject<Item> EMERALD_EGG = ITEMS.register(
        "emerald_egg", () -> new Item(new Item.Properties().setId(ITEMS.key("emerald_egg"))));
    public static final RegistryObject<Item> DIAMOND_EGG = ITEMS.register(
        "diamond_egg", () -> new Item(new Item.Properties().setId(ITEMS.key("diamond_egg"))));
    public static final RegistryObject<Item> LAPIS_LAZULI_EGG = ITEMS.register(
        "lapis_lazuli_egg", () -> new Item(new Item.Properties().setId(ITEMS.key("lapis_lazuli_egg"))));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
