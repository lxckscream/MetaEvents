package ru.don1x.metaevents.addon;

import lombok.Getter;
import org.bukkit.plugin.java.JavaPlugin;

@Getter
public abstract class Addon {
    private final JavaPlugin plugin;
    private final String name;

    public Addon(JavaPlugin plugin, String name) {
        this.name= name;
        this.plugin = plugin;
    }

    public abstract void initialize();
    public abstract void start();
    public abstract void shutdown();
}
