package ru.don1x.metaevents.addon;

import lombok.Getter;
import ru.don1x.metaevents.MetaEvents;
import ru.don1x.metaevents.exceptions.NotAssignableFromAddonClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class AddonsManager {
    @Getter
    private final List<Addon> addonList = new ArrayList<>();

    public <T> void register(T tClass) {
        if (tClass instanceof Addon) {
            Addon addon  = (Addon) tClass;
            addonList.add(addon);
            System.out.println("[MetaEvents] Addon " + addon.getName() + " has been loaded!");
        } else {
            throw new NotAssignableFromAddonClass((Class<?>) tClass);
        }
    }

    public void register(Addon addon) {
        this.addonList.add(addon);
        System.out.println("[MetaEvents] Addon " + addon.getName() + " has been loaded!");
    }

    public void handle(Status status) {
        switch (status)
        {
            case START:
                this.getAddonList().forEach(Addon::start);
                break;
            case SHUTDOWN:
                this.getAddonList().forEach(Addon::shutdown);
                break;
            case INITIALIZE:
                this.getAddonList().forEach(Addon::initialize);
                break;
            default:
                System.out.println("[MetaEvents] Unknown status!");
                break;
        }
    }
}
