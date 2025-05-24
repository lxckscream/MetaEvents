package ru.don1x.metaevents.exceptions;

import ru.don1x.metaevents.addon.Status;

public final class UnknownHandleStatus extends RuntimeException {
    public UnknownHandleStatus(Status status) {
        super("This version of MetaEvents not supporting this handle status (" + status +  ")");
    }
}
