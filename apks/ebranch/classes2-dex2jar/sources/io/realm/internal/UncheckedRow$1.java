package io.realm.internal;

import io.realm.RealmFieldType;
/* loaded from: classes2-dex2jar.jar:io/realm/internal/UncheckedRow$1.class */
/* synthetic */ class UncheckedRow$1 {
    static final /* synthetic */ int[] $SwitchMap$io$realm$RealmFieldType;

    static {
        int[] iArr = new int[RealmFieldType.values().length];
        $SwitchMap$io$realm$RealmFieldType = iArr;
        try {
            iArr[RealmFieldType.OBJECT.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
        }
        try {
            $SwitchMap$io$realm$RealmFieldType[RealmFieldType.LIST.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
        }
    }
}
