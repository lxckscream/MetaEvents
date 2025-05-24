package ru.don1x.metaevents;

import lombok.Getter;
import org.bukkit.plugin.java.JavaPlugin;
import ru.don1x.metaevents.addon.AddonsManager;
import ru.don1x.metaevents.addon.Status;

public final class MetaEvents extends JavaPlugin {
    @Getter
    private final AddonsManager addonsManager = new AddonsManager();

    @Override
    public void onLoad() {
        getAddonsManager().handle(Status.INITIALIZE);
    }

    @Override
    public void onEnable() {
        getAddonsManager().handle(Status.START);
    }

    @Override
    public void onDisable() {
        getAddonsManager().handle(Status.SHUTDOWN);
    }
}
