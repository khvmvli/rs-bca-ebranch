package io.realm;
/* loaded from: classes-dex2jar.jar:io/realm/Case.class */
public enum Case {
    SENSITIVE(true),
    INSENSITIVE(false);
    
    private final boolean value;

    Case(boolean z) {
        this.value = z;
    }

    public final boolean getValue() {
        return this.value;
    }
}
