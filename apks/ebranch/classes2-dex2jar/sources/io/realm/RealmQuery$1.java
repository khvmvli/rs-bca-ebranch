package io.realm;
/* loaded from: classes2-dex2jar.jar:io/realm/RealmQuery$1.class */
/* synthetic */ class RealmQuery$1 {
    static final /* synthetic */ int[] $SwitchMap$io$realm$RealmFieldType;

    static {
        int[] iArr = new int[RealmFieldType.values().length];
        $SwitchMap$io$realm$RealmFieldType = iArr;
        try {
            iArr[RealmFieldType.INTEGER.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
        }
        try {
            $SwitchMap$io$realm$RealmFieldType[RealmFieldType.FLOAT.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
        }
        try {
            $SwitchMap$io$realm$RealmFieldType[RealmFieldType.DOUBLE.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
        }
        try {
            $SwitchMap$io$realm$RealmFieldType[RealmFieldType.DECIMAL128.ordinal()] = 4;
        } catch (NoSuchFieldError e4) {
        }
        try {
            $SwitchMap$io$realm$RealmFieldType[RealmFieldType.MIXED.ordinal()] = 5;
        } catch (NoSuchFieldError e5) {
        }
    }
}
