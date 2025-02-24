package io.realm.internal;

import com.facebook.stetho.dumpapp.Framer;
import io.realm.RealmFieldType;
import java.util.Locale;
import o.setMinWidth$MediaBrowserCompat$CustomActionResultReceiver;
/* loaded from: classes-dex2jar.jar:io/realm/internal/Property.class */
public class Property implements NativeObject {
    public static final boolean INDEXED = true;
    public static final boolean PRIMARY_KEY = true;
    public static final boolean REQUIRED = true;
    public static final int TYPE_ARRAY = 128;
    public static final int TYPE_BOOL = 1;
    public static final int TYPE_DATA = 3;
    public static final int TYPE_DATE = 4;
    public static final int TYPE_DECIMAL128 = 11;
    public static final int TYPE_DICTIONARY = 512;
    public static final int TYPE_DOUBLE = 6;
    public static final int TYPE_FLOAT = 5;
    public static final int TYPE_INT = 0;
    public static final int TYPE_LINKING_OBJECTS = 8;
    public static final int TYPE_MIXED = 9;
    public static final int TYPE_NULLABLE = 64;
    public static final int TYPE_OBJECT = 7;
    public static final int TYPE_OBJECT_ID = 10;
    public static final int TYPE_REQUIRED = 0;
    public static final int TYPE_SET = 256;
    public static final int TYPE_STRING = 2;
    public static final int TYPE_UUID = 12;
    private static final long nativeFinalizerPtr = nativeGetFinalizerPtr();
    private long nativePtr;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: io.realm.internal.Property$1  reason: invalid class name */
    /* loaded from: classes-dex2jar.jar:io/realm/internal/Property$1.class */
    public static /* synthetic */ class AnonymousClass1 {
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
            try {
                $SwitchMap$io$realm$RealmFieldType[RealmFieldType.LINKING_OBJECTS.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            try {
                $SwitchMap$io$realm$RealmFieldType[RealmFieldType.INTEGER.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
            }
            try {
                $SwitchMap$io$realm$RealmFieldType[RealmFieldType.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError e5) {
            }
            try {
                $SwitchMap$io$realm$RealmFieldType[RealmFieldType.STRING.ordinal()] = 6;
            } catch (NoSuchFieldError e6) {
            }
            try {
                $SwitchMap$io$realm$RealmFieldType[RealmFieldType.BINARY.ordinal()] = 7;
            } catch (NoSuchFieldError e7) {
            }
            try {
                $SwitchMap$io$realm$RealmFieldType[RealmFieldType.DATE.ordinal()] = 8;
            } catch (NoSuchFieldError e8) {
            }
            try {
                $SwitchMap$io$realm$RealmFieldType[RealmFieldType.FLOAT.ordinal()] = 9;
            } catch (NoSuchFieldError e9) {
            }
            try {
                $SwitchMap$io$realm$RealmFieldType[RealmFieldType.DECIMAL128.ordinal()] = 10;
            } catch (NoSuchFieldError e10) {
            }
            try {
                $SwitchMap$io$realm$RealmFieldType[RealmFieldType.OBJECT_ID.ordinal()] = 11;
            } catch (NoSuchFieldError e11) {
            }
            try {
                $SwitchMap$io$realm$RealmFieldType[RealmFieldType.UUID.ordinal()] = 12;
            } catch (NoSuchFieldError e12) {
            }
            try {
                $SwitchMap$io$realm$RealmFieldType[RealmFieldType.MIXED.ordinal()] = 13;
            } catch (NoSuchFieldError e13) {
            }
            try {
                $SwitchMap$io$realm$RealmFieldType[RealmFieldType.DOUBLE.ordinal()] = 14;
            } catch (NoSuchFieldError e14) {
            }
            try {
                $SwitchMap$io$realm$RealmFieldType[RealmFieldType.INTEGER_LIST.ordinal()] = 15;
            } catch (NoSuchFieldError e15) {
            }
            try {
                $SwitchMap$io$realm$RealmFieldType[RealmFieldType.BOOLEAN_LIST.ordinal()] = 16;
            } catch (NoSuchFieldError e16) {
            }
            try {
                $SwitchMap$io$realm$RealmFieldType[RealmFieldType.STRING_LIST.ordinal()] = 17;
            } catch (NoSuchFieldError e17) {
            }
            try {
                $SwitchMap$io$realm$RealmFieldType[RealmFieldType.BINARY_LIST.ordinal()] = 18;
            } catch (NoSuchFieldError e18) {
            }
            try {
                $SwitchMap$io$realm$RealmFieldType[RealmFieldType.DATE_LIST.ordinal()] = 19;
            } catch (NoSuchFieldError e19) {
            }
            try {
                $SwitchMap$io$realm$RealmFieldType[RealmFieldType.FLOAT_LIST.ordinal()] = 20;
            } catch (NoSuchFieldError e20) {
            }
            try {
                $SwitchMap$io$realm$RealmFieldType[RealmFieldType.DECIMAL128_LIST.ordinal()] = 21;
            } catch (NoSuchFieldError e21) {
            }
            try {
                $SwitchMap$io$realm$RealmFieldType[RealmFieldType.OBJECT_ID_LIST.ordinal()] = 22;
            } catch (NoSuchFieldError e22) {
            }
            try {
                $SwitchMap$io$realm$RealmFieldType[RealmFieldType.UUID_LIST.ordinal()] = 23;
            } catch (NoSuchFieldError e23) {
            }
            try {
                $SwitchMap$io$realm$RealmFieldType[RealmFieldType.DOUBLE_LIST.ordinal()] = 24;
            } catch (NoSuchFieldError e24) {
            }
            try {
                $SwitchMap$io$realm$RealmFieldType[RealmFieldType.MIXED_LIST.ordinal()] = 25;
            } catch (NoSuchFieldError e25) {
            }
            try {
                $SwitchMap$io$realm$RealmFieldType[RealmFieldType.STRING_TO_MIXED_MAP.ordinal()] = 26;
            } catch (NoSuchFieldError e26) {
            }
            try {
                $SwitchMap$io$realm$RealmFieldType[RealmFieldType.STRING_TO_BOOLEAN_MAP.ordinal()] = 27;
            } catch (NoSuchFieldError e27) {
            }
            try {
                $SwitchMap$io$realm$RealmFieldType[RealmFieldType.STRING_TO_STRING_MAP.ordinal()] = 28;
            } catch (NoSuchFieldError e28) {
            }
            try {
                $SwitchMap$io$realm$RealmFieldType[RealmFieldType.STRING_TO_INTEGER_MAP.ordinal()] = 29;
            } catch (NoSuchFieldError e29) {
            }
            try {
                $SwitchMap$io$realm$RealmFieldType[RealmFieldType.STRING_TO_FLOAT_MAP.ordinal()] = 30;
            } catch (NoSuchFieldError e30) {
            }
            try {
                $SwitchMap$io$realm$RealmFieldType[RealmFieldType.STRING_TO_DOUBLE_MAP.ordinal()] = 31;
            } catch (NoSuchFieldError e31) {
            }
            try {
                $SwitchMap$io$realm$RealmFieldType[RealmFieldType.STRING_TO_BINARY_MAP.ordinal()] = 32;
            } catch (NoSuchFieldError e32) {
            }
            try {
                $SwitchMap$io$realm$RealmFieldType[RealmFieldType.STRING_TO_DATE_MAP.ordinal()] = 33;
            } catch (NoSuchFieldError e33) {
            }
            try {
                $SwitchMap$io$realm$RealmFieldType[RealmFieldType.STRING_TO_DECIMAL128_MAP.ordinal()] = 34;
            } catch (NoSuchFieldError e34) {
            }
            try {
                $SwitchMap$io$realm$RealmFieldType[RealmFieldType.STRING_TO_OBJECT_ID_MAP.ordinal()] = 35;
            } catch (NoSuchFieldError e35) {
            }
            try {
                $SwitchMap$io$realm$RealmFieldType[RealmFieldType.STRING_TO_UUID_MAP.ordinal()] = 36;
            } catch (NoSuchFieldError e36) {
            }
            try {
                $SwitchMap$io$realm$RealmFieldType[RealmFieldType.STRING_TO_LINK_MAP.ordinal()] = 37;
            } catch (NoSuchFieldError e37) {
            }
            try {
                $SwitchMap$io$realm$RealmFieldType[RealmFieldType.BOOLEAN_SET.ordinal()] = 38;
            } catch (NoSuchFieldError e38) {
            }
            try {
                $SwitchMap$io$realm$RealmFieldType[RealmFieldType.STRING_SET.ordinal()] = 39;
            } catch (NoSuchFieldError e39) {
            }
            try {
                $SwitchMap$io$realm$RealmFieldType[RealmFieldType.INTEGER_SET.ordinal()] = 40;
            } catch (NoSuchFieldError e40) {
            }
            try {
                $SwitchMap$io$realm$RealmFieldType[RealmFieldType.FLOAT_SET.ordinal()] = 41;
            } catch (NoSuchFieldError e41) {
            }
            try {
                $SwitchMap$io$realm$RealmFieldType[RealmFieldType.DOUBLE_SET.ordinal()] = 42;
            } catch (NoSuchFieldError e42) {
            }
            try {
                $SwitchMap$io$realm$RealmFieldType[RealmFieldType.BINARY_SET.ordinal()] = 43;
            } catch (NoSuchFieldError e43) {
            }
            try {
                $SwitchMap$io$realm$RealmFieldType[RealmFieldType.DATE_SET.ordinal()] = 44;
            } catch (NoSuchFieldError e44) {
            }
            try {
                $SwitchMap$io$realm$RealmFieldType[RealmFieldType.DECIMAL128_SET.ordinal()] = 45;
            } catch (NoSuchFieldError e45) {
            }
            try {
                $SwitchMap$io$realm$RealmFieldType[RealmFieldType.OBJECT_ID_SET.ordinal()] = 46;
            } catch (NoSuchFieldError e46) {
            }
            try {
                $SwitchMap$io$realm$RealmFieldType[RealmFieldType.UUID_SET.ordinal()] = 47;
            } catch (NoSuchFieldError e47) {
            }
            try {
                $SwitchMap$io$realm$RealmFieldType[RealmFieldType.LINK_SET.ordinal()] = 48;
            } catch (NoSuchFieldError e48) {
            }
            try {
                $SwitchMap$io$realm$RealmFieldType[RealmFieldType.MIXED_SET.ordinal()] = 49;
            } catch (NoSuchFieldError e49) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Property(long j) {
        this.nativePtr = j;
        NativeContext.dummyContext.addReference(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int convertFromRealmFieldType(RealmFieldType realmFieldType, boolean z) {
        int i = 1;
        int i2 = 0;
        switch (AnonymousClass1.$SwitchMap$io$realm$RealmFieldType[realmFieldType.ordinal()]) {
            case 1:
                return 71;
            case 2:
                return 135;
            case 3:
                return 136;
            case 4:
                i = 0;
                break;
            case 5:
                break;
            case 6:
                i = 2;
                break;
            case 7:
                i = 3;
                break;
            case 8:
                i = 4;
                break;
            case 9:
                i = 5;
                break;
            case 10:
                i = 11;
                break;
            case 11:
                i = 10;
                break;
            case 12:
                i = 12;
                break;
            case 13:
                i = 9;
                break;
            case 14:
                i = 6;
                break;
            case 15:
                i = TYPE_ARRAY;
                break;
            case 16:
                i = 129;
                break;
            case 17:
                i = 130;
                break;
            case 18:
                i = 131;
                break;
            case 19:
                i = 132;
                break;
            case 20:
                i = 133;
                break;
            case 21:
                i = 139;
                break;
            case 22:
                i = 138;
                break;
            case 23:
                i = 140;
                break;
            case 24:
                i = 134;
                break;
            case 25:
                i = 137;
                break;
            case 26:
                i = 521;
                break;
            case 27:
                i = 513;
                break;
            case 28:
                i = 514;
                break;
            case 29:
                i = TYPE_DICTIONARY;
                break;
            case 30:
                i = 517;
                break;
            case setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.bv:
                i = 518;
                break;
            case 32:
                i = 515;
                break;
            case Framer.ENTER_FRAME_PREFIX /* 33 */:
                i = 516;
                break;
            case 34:
                i = 523;
                break;
            case setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.dD:
                i = 522;
                break;
            case setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.dB:
                i = 524;
                break;
            case setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.dF:
                i = 519;
                break;
            case setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.dC:
                i = 257;
                break;
            case 39:
                i = 258;
                break;
            case 40:
                i = TYPE_SET;
                break;
            case 41:
                i = 261;
                break;
            case 42:
                i = 262;
                break;
            case 43:
                i = 259;
                break;
            case 44:
                i = 260;
                break;
            case 45:
                i = 267;
                break;
            case 46:
                i = 266;
                break;
            case 47:
                i = 268;
                break;
            case 48:
                return 263;
            case 49:
                i = 265;
                break;
            default:
                throw new IllegalArgumentException(String.format(Locale.US, "Unsupported filed type: '%s'.", realmFieldType.name()));
        }
        if (!z) {
            i2 = 64;
        }
        return i | i2;
    }

    private static RealmFieldType convertToRealmFieldType(int i) {
        int i2 = i & -65;
        switch (i2) {
            case 0:
                return RealmFieldType.INTEGER;
            case 1:
                return RealmFieldType.BOOLEAN;
            case 2:
                return RealmFieldType.STRING;
            case 3:
                return RealmFieldType.BINARY;
            case 4:
                return RealmFieldType.DATE;
            case 5:
                return RealmFieldType.FLOAT;
            case 6:
                return RealmFieldType.DOUBLE;
            case 7:
                return RealmFieldType.OBJECT;
            default:
                switch (i2) {
                    case 9:
                        return RealmFieldType.MIXED;
                    case 10:
                        return RealmFieldType.OBJECT_ID;
                    case 11:
                        return RealmFieldType.DECIMAL128;
                    case 12:
                        return RealmFieldType.UUID;
                    default:
                        switch (i2) {
                            case TYPE_ARRAY /* 128 */:
                                return RealmFieldType.INTEGER_LIST;
                            case 129:
                                return RealmFieldType.BOOLEAN_LIST;
                            case 130:
                                return RealmFieldType.STRING_LIST;
                            case 131:
                                return RealmFieldType.BINARY_LIST;
                            case 132:
                                return RealmFieldType.DATE_LIST;
                            case 133:
                                return RealmFieldType.FLOAT_LIST;
                            case 134:
                                return RealmFieldType.DOUBLE_LIST;
                            case 135:
                                return RealmFieldType.LIST;
                            case 136:
                                return RealmFieldType.LINKING_OBJECTS;
                            case 137:
                                return RealmFieldType.MIXED_LIST;
                            case 138:
                                return RealmFieldType.OBJECT_ID_LIST;
                            case 139:
                                return RealmFieldType.DECIMAL128_LIST;
                            case 140:
                                return RealmFieldType.UUID_LIST;
                            default:
                                switch (i2) {
                                    case TYPE_SET /* 256 */:
                                        return RealmFieldType.INTEGER_SET;
                                    case 257:
                                        return RealmFieldType.BOOLEAN_SET;
                                    case 258:
                                        return RealmFieldType.STRING_SET;
                                    case 259:
                                        return RealmFieldType.BINARY_SET;
                                    case 260:
                                        return RealmFieldType.DATE_SET;
                                    case 261:
                                        return RealmFieldType.FLOAT_SET;
                                    case 262:
                                        return RealmFieldType.DOUBLE_SET;
                                    case 263:
                                        return RealmFieldType.LINK_SET;
                                    default:
                                        switch (i2) {
                                            case 265:
                                                return RealmFieldType.MIXED_SET;
                                            case 266:
                                                return RealmFieldType.OBJECT_ID_SET;
                                            case 267:
                                                return RealmFieldType.DECIMAL128_SET;
                                            case 268:
                                                return RealmFieldType.UUID_SET;
                                            default:
                                                switch (i2) {
                                                    case TYPE_DICTIONARY /* 512 */:
                                                        return RealmFieldType.STRING_TO_INTEGER_MAP;
                                                    case 513:
                                                        return RealmFieldType.STRING_TO_BOOLEAN_MAP;
                                                    case 514:
                                                        return RealmFieldType.STRING_TO_STRING_MAP;
                                                    case 515:
                                                        return RealmFieldType.STRING_TO_BINARY_MAP;
                                                    case 516:
                                                        return RealmFieldType.STRING_TO_DATE_MAP;
                                                    case 517:
                                                        return RealmFieldType.STRING_TO_FLOAT_MAP;
                                                    case 518:
                                                        return RealmFieldType.STRING_TO_DOUBLE_MAP;
                                                    case 519:
                                                        return RealmFieldType.STRING_TO_LINK_MAP;
                                                    default:
                                                        switch (i2) {
                                                            case 521:
                                                                return RealmFieldType.STRING_TO_MIXED_MAP;
                                                            case 522:
                                                                return RealmFieldType.STRING_TO_OBJECT_ID_MAP;
                                                            case 523:
                                                                return RealmFieldType.STRING_TO_DECIMAL128_MAP;
                                                            case 524:
                                                                return RealmFieldType.STRING_TO_UUID_MAP;
                                                            default:
                                                                throw new IllegalArgumentException(String.format(Locale.US, "Unsupported property type: '%d'", Integer.valueOf(i)));
                                                        }
                                                }
                                        }
                                }
                        }
                }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static native long nativeCreateComputedLinkProperty(String str, String str2, String str3);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static native long nativeCreatePersistedLinkProperty(String str, String str2, int i, String str3);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static native long nativeCreatePersistedProperty(String str, String str2, int i, boolean z, boolean z2);

    private static native long nativeGetColumnKey(long j);

    private static native long nativeGetFinalizerPtr();

    private static native String nativeGetLinkedObjectName(long j);

    private static native int nativeGetType(long j);

    public long getColumnKey() {
        return nativeGetColumnKey(this.nativePtr);
    }

    public String getLinkedObjectName() {
        return nativeGetLinkedObjectName(this.nativePtr);
    }

    @Override // io.realm.internal.NativeObject
    public long getNativeFinalizerPtr() {
        return nativeFinalizerPtr;
    }

    @Override // io.realm.internal.NativeObject
    public long getNativePtr() {
        return this.nativePtr;
    }

    public RealmFieldType getType() {
        return convertToRealmFieldType(nativeGetType(this.nativePtr));
    }
}
