package net.ybibibaz.precious_chickens.item;

public enum Egg {
    COPPER_EGG ("copper_egg"),
    DIAMOND_EGG ("diamond_egg"),
    EMERALD_EGG ("emerald_egg"),
    GLASS_EGG ("glass_egg"),
    GOLDEN_EGG ("golden_egg"),
    IRON_EGG ("iron_egg"),
    LAPIS_LAZULI_EGG ("lapis_lazuli_egg");

    private String name;

    Egg(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
