package io.realm.internal;

import io.realm.RealmFieldType;
/* loaded from: classes2-dex2jar.jar:io/realm/internal/Table$1.class */
/* synthetic */ class Table$1 {
    static final /* synthetic */ int[] $SwitchMap$io$realm$RealmFieldType;

    static {
        int[] iArr = new int[RealmFieldType.values().length];
        $SwitchMap$io$realm$RealmFieldType = iArr;
        try {
            iArr[RealmFieldType.INTEGER.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
        }
        try {
            $SwitchMap$io$realm$RealmFieldType[RealmFieldType.BOOLEAN.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
        }
        try {
            $SwitchMap$io$realm$RealmFieldType[RealmFieldType.STRING.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
        }
        try {
            $SwitchMap$io$realm$RealmFieldType[RealmFieldType.BINARY.ordinal()] = 4;
        } catch (NoSuchFieldError e4) {
        }
        try {
            $SwitchMap$io$realm$RealmFieldType[RealmFieldType.DATE.ordinal()] = 5;
        } catch (NoSuchFieldError e5) {
        }
        try {
            $SwitchMap$io$realm$RealmFieldType[RealmFieldType.FLOAT.ordinal()] = 6;
        } catch (NoSuchFieldError e6) {
        }
        try {
            $SwitchMap$io$realm$RealmFieldType[RealmFieldType.DOUBLE.ordinal()] = 7;
        } catch (NoSuchFieldError e7) {
        }
        try {
            $SwitchMap$io$realm$RealmFieldType[RealmFieldType.DECIMAL128.ordinal()] = 8;
        } catch (NoSuchFieldError e8) {
        }
        try {
            $SwitchMap$io$realm$RealmFieldType[RealmFieldType.OBJECT_ID.ordinal()] = 9;
        } catch (NoSuchFieldError e9) {
        }
        try {
            $SwitchMap$io$realm$RealmFieldType[RealmFieldType.MIXED.ordinal()] = 10;
        } catch (NoSuchFieldError e10) {
        }
        try {
            $SwitchMap$io$realm$RealmFieldType[RealmFieldType.UUID.ordinal()] = 11;
        } catch (NoSuchFieldError e11) {
        }
        try {
            $SwitchMap$io$realm$RealmFieldType[RealmFieldType.INTEGER_LIST.ordinal()] = 12;
        } catch (NoSuchFieldError e12) {
        }
        try {
            $SwitchMap$io$realm$RealmFieldType[RealmFieldType.BOOLEAN_LIST.ordinal()] = 13;
        } catch (NoSuchFieldError e13) {
        }
        try {
            $SwitchMap$io$realm$RealmFieldType[RealmFieldType.STRING_LIST.ordinal()] = 14;
        } catch (NoSuchFieldError e14) {
        }
        try {
            $SwitchMap$io$realm$RealmFieldType[RealmFieldType.BINARY_LIST.ordinal()] = 15;
        } catch (NoSuchFieldError e15) {
        }
        try {
            $SwitchMap$io$realm$RealmFieldType[RealmFieldType.DATE_LIST.ordinal()] = 16;
        } catch (NoSuchFieldError e16) {
        }
        try {
            $SwitchMap$io$realm$RealmFieldType[RealmFieldType.FLOAT_LIST.ordinal()] = 17;
        } catch (NoSuchFieldError e17) {
        }
        try {
            $SwitchMap$io$realm$RealmFieldType[RealmFieldType.DOUBLE_LIST.ordinal()] = 18;
        } catch (NoSuchFieldError e18) {
        }
        try {
            $SwitchMap$io$realm$RealmFieldType[RealmFieldType.DECIMAL128_LIST.ordinal()] = 19;
        } catch (NoSuchFieldError e19) {
        }
        try {
            $SwitchMap$io$realm$RealmFieldType[RealmFieldType.OBJECT_ID_LIST.ordinal()] = 20;
        } catch (NoSuchFieldError e20) {
        }
        try {
            $SwitchMap$io$realm$RealmFieldType[RealmFieldType.UUID_LIST.ordinal()] = 21;
        } catch (NoSuchFieldError e21) {
        }
        try {
            $SwitchMap$io$realm$RealmFieldType[RealmFieldType.MIXED_LIST.ordinal()] = 22;
        } catch (NoSuchFieldError e22) {
        }
        try {
            $SwitchMap$io$realm$RealmFieldType[RealmFieldType.STRING_TO_INTEGER_MAP.ordinal()] = 23;
        } catch (NoSuchFieldError e23) {
        }
        try {
            $SwitchMap$io$realm$RealmFieldType[RealmFieldType.STRING_TO_BOOLEAN_MAP.ordinal()] = 24;
        } catch (NoSuchFieldError e24) {
        }
        try {
            $SwitchMap$io$realm$RealmFieldType[RealmFieldType.STRING_TO_STRING_MAP.ordinal()] = 25;
        } catch (NoSuchFieldError e25) {
        }
        try {
            $SwitchMap$io$realm$RealmFieldType[RealmFieldType.STRING_TO_BINARY_MAP.ordinal()] = 26;
        } catch (NoSuchFieldError e26) {
        }
        try {
            $SwitchMap$io$realm$RealmFieldType[RealmFieldType.STRING_TO_DATE_MAP.ordinal()] = 27;
        } catch (NoSuchFieldError e27) {
        }
        try {
            $SwitchMap$io$realm$RealmFieldType[RealmFieldType.STRING_TO_FLOAT_MAP.ordinal()] = 28;
        } catch (NoSuchFieldError e28) {
        }
        try {
            $SwitchMap$io$realm$RealmFieldType[RealmFieldType.STRING_TO_DOUBLE_MAP.ordinal()] = 29;
        } catch (NoSuchFieldError e29) {
        }
        try {
            $SwitchMap$io$realm$RealmFieldType[RealmFieldType.STRING_TO_DECIMAL128_MAP.ordinal()] = 30;
        } catch (NoSuchFieldError e30) {
        }
        try {
            $SwitchMap$io$realm$RealmFieldType[RealmFieldType.STRING_TO_OBJECT_ID_MAP.ordinal()] = 31;
        } catch (NoSuchFieldError e31) {
        }
        try {
            $SwitchMap$io$realm$RealmFieldType[RealmFieldType.STRING_TO_UUID_MAP.ordinal()] = 32;
        } catch (NoSuchFieldError e32) {
        }
        try {
            $SwitchMap$io$realm$RealmFieldType[RealmFieldType.STRING_TO_MIXED_MAP.ordinal()] = 33;
        } catch (NoSuchFieldError e33) {
        }
        try {
            $SwitchMap$io$realm$RealmFieldType[RealmFieldType.INTEGER_SET.ordinal()] = 34;
        } catch (NoSuchFieldError e34) {
        }
        try {
            $SwitchMap$io$realm$RealmFieldType[RealmFieldType.BOOLEAN_SET.ordinal()] = 35;
        } catch (NoSuchFieldError e35) {
        }
        try {
            $SwitchMap$io$realm$RealmFieldType[RealmFieldType.STRING_SET.ordinal()] = 36;
        } catch (NoSuchFieldError e36) {
        }
        try {
            $SwitchMap$io$realm$RealmFieldType[RealmFieldType.BINARY_SET.ordinal()] = 37;
        } catch (NoSuchFieldError e37) {
        }
        try {
            $SwitchMap$io$realm$RealmFieldType[RealmFieldType.DATE_SET.ordinal()] = 38;
        } catch (NoSuchFieldError e38) {
        }
        try {
            $SwitchMap$io$realm$RealmFieldType[RealmFieldType.FLOAT_SET.ordinal()] = 39;
        } catch (NoSuchFieldError e39) {
        }
        try {
            $SwitchMap$io$realm$RealmFieldType[RealmFieldType.DOUBLE_SET.ordinal()] = 40;
        } catch (NoSuchFieldError e40) {
        }
        try {
            $SwitchMap$io$realm$RealmFieldType[RealmFieldType.DECIMAL128_SET.ordinal()] = 41;
        } catch (NoSuchFieldError e41) {
        }
        try {
            $SwitchMap$io$realm$RealmFieldType[RealmFieldType.OBJECT_ID_SET.ordinal()] = 42;
        } catch (NoSuchFieldError e42) {
        }
        try {
            $SwitchMap$io$realm$RealmFieldType[RealmFieldType.UUID_SET.ordinal()] = 43;
        } catch (NoSuchFieldError e43) {
        }
        try {
            $SwitchMap$io$realm$RealmFieldType[RealmFieldType.MIXED_SET.ordinal()] = 44;
        } catch (NoSuchFieldError e44) {
        }
    }
}
