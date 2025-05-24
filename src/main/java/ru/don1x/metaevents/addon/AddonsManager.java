package ru.don1x.metaevents.addon;

import ru.don1x.metaevents.exceptions.NotAssignableFromAddonClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class AddonsManager {
    public List<Addon> addonList = new ArrayList<>();

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
}
