package io.realm.internal;
/* loaded from: classes2-dex2jar.jar:io/realm/internal/OsResults$Aggregate.class */
public enum OsResults$Aggregate {
    MINIMUM((byte) 1),
    MAXIMUM((byte) 2),
    AVERAGE((byte) 3),
    SUM((byte) 4);
    
    private final byte value;

    OsResults$Aggregate(byte b) {
        this.value = (byte) b;
    }

    public final byte getValue() {
        return this.value;
    }
}
