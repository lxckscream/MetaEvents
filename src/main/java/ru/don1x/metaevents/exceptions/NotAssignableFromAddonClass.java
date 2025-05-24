package ru.don1x.metaevents.exceptions;

import ru.don1x.metaevents.addon.Addon;

public final class NotAssignableFromAddonClass extends RuntimeException {
    public NotAssignableFromAddonClass(Class<?> clazz) {
        super("The class " + clazz.getPackage() + " not assignable from " + Addon.class.getPackage());
    }
}
