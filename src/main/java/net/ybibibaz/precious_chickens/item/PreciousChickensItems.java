package net.ybibibaz.precious_chickens.item;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import net.ybibibaz.precious_chickens.PreciousChickens;

public class PreciousChickensItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(
        ForgeRegistries.ITEMS, PreciousChickens.MODID);

    public static final ArrayList<RegistryObject<Item>> EGGS = new ArrayList<RegistryObject<Item>>(
        Arrays.stream(Egg.values())
            .map(
                egg -> ITEMS.register(
                    egg.getName(),
                    () -> new Item(
                        new Item.Properties().setId(ITEMS.key(egg.getName()))
                    )
                )
            )
            .collect(Collectors.toList())
    );

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
