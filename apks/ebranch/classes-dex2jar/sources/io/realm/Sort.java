package io.realm;
/* loaded from: classes-dex2jar.jar:io/realm/Sort.class */
public enum Sort {
    ASCENDING(true),
    DESCENDING(false);
    
    private final boolean value;

    Sort(boolean z) {
        this.value = z;
    }

    public final boolean getValue() {
        return this.value;
    }
}
