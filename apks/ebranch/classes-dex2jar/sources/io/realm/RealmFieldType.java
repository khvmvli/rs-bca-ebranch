package io.realm;

import io.realm.internal.Property;
import java.nio.ByteBuffer;
import java.util.Date;
import java.util.UUID;
import org.bson.types.Decimal128;
import org.bson.types.ObjectId;
/* loaded from: classes-dex2jar.jar:io/realm/RealmFieldType.class */
public enum RealmFieldType {
    INTEGER(0),
    BOOLEAN(1),
    STRING(2),
    BINARY(4),
    DATE(8),
    FLOAT(9),
    DOUBLE(10),
    OBJECT(12),
    DECIMAL128(11),
    OBJECT_ID(15),
    UUID(17),
    MIXED(6),
    TYPED_LINK(16),
    LIST(13),
    LINKING_OBJECTS(14),
    INTEGER_LIST(Property.TYPE_ARRAY),
    BOOLEAN_LIST(129),
    STRING_LIST(130),
    BINARY_LIST(132),
    DATE_LIST(136),
    FLOAT_LIST(137),
    DOUBLE_LIST(138),
    DECIMAL128_LIST(139),
    OBJECT_ID_LIST(143),
    UUID_LIST(145),
    MIXED_LIST(134),
    STRING_TO_INTEGER_MAP(Property.TYPE_DICTIONARY),
    STRING_TO_BOOLEAN_MAP(513),
    STRING_TO_STRING_MAP(514),
    STRING_TO_BINARY_MAP(516),
    STRING_TO_DATE_MAP(520),
    STRING_TO_FLOAT_MAP(521),
    STRING_TO_DOUBLE_MAP(522),
    STRING_TO_DECIMAL128_MAP(523),
    STRING_TO_OBJECT_ID_MAP(527),
    STRING_TO_UUID_MAP(529),
    STRING_TO_MIXED_MAP(518),
    STRING_TO_LINK_MAP(524),
    INTEGER_SET(Property.TYPE_SET),
    BOOLEAN_SET(257),
    STRING_SET(258),
    BINARY_SET(260),
    DATE_SET(264),
    FLOAT_SET(265),
    DOUBLE_SET(266),
    DECIMAL128_SET(267),
    OBJECT_ID_SET(271),
    UUID_SET(273),
    LINK_SET(268),
    MIXED_SET(262);
    
    private static final RealmFieldType[] basicTypes = new RealmFieldType[18];
    private static final RealmFieldType[] listTypes = new RealmFieldType[18];
    private static final RealmFieldType[] mapTypes = new RealmFieldType[18];
    private static final RealmFieldType[] setTypes = new RealmFieldType[18];
    private final int nativeValue;

    static {
        RealmFieldType[] values = values();
        for (RealmFieldType realmFieldType : values) {
            int i = realmFieldType.nativeValue;
            if (i < 128) {
                basicTypes[i] = realmFieldType;
            } else if (i < 256) {
                listTypes[i - Property.TYPE_ARRAY] = realmFieldType;
            } else if (i < 512) {
                setTypes[i - Property.TYPE_SET] = realmFieldType;
            } else {
                mapTypes[i - Property.TYPE_DICTIONARY] = realmFieldType;
            }
        }
    }

    RealmFieldType(int i) {
        this.nativeValue = i;
    }

    public static RealmFieldType fromNativeValue(int i) {
        RealmFieldType realmFieldType;
        RealmFieldType realmFieldType2;
        RealmFieldType realmFieldType3;
        RealmFieldType realmFieldType4;
        if (i >= 0) {
            RealmFieldType[] realmFieldTypeArr = basicTypes;
            if (i < realmFieldTypeArr.length && (realmFieldType4 = realmFieldTypeArr[i]) != null) {
                return realmFieldType4;
            }
        }
        if (128 <= i && i < 256) {
            int i2 = i - Property.TYPE_ARRAY;
            RealmFieldType[] realmFieldTypeArr2 = listTypes;
            if (i2 < realmFieldTypeArr2.length && (realmFieldType3 = realmFieldTypeArr2[i2]) != null) {
                return realmFieldType3;
            }
        }
        if (256 <= i && i < 512) {
            int i3 = i - Property.TYPE_SET;
            RealmFieldType[] realmFieldTypeArr3 = setTypes;
            if (i3 < realmFieldTypeArr3.length && (realmFieldType2 = realmFieldTypeArr3[i3]) != null) {
                return realmFieldType2;
            }
        }
        if (512 <= i) {
            int i4 = i - Property.TYPE_DICTIONARY;
            RealmFieldType[] realmFieldTypeArr4 = mapTypes;
            if (i4 < realmFieldTypeArr4.length && (realmFieldType = realmFieldTypeArr4[i4]) != null) {
                return realmFieldType;
            }
        }
        StringBuilder sb = new StringBuilder("Invalid native Realm type: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    public final int getNativeValue() {
        return this.nativeValue;
    }

    public final boolean isValid(Object obj) {
        int i = this.nativeValue;
        boolean z = false;
        boolean z2 = false;
        if (i == 0) {
            if ((obj instanceof Long) || (obj instanceof Integer) || (obj instanceof Short) || (obj instanceof Byte)) {
                z = true;
            }
            return z;
        } else if (i == 1) {
            return obj instanceof Boolean;
        } else {
            if (i == 2) {
                return obj instanceof String;
            }
            if (i != 4) {
                if (i != 6) {
                    switch (i) {
                        case 6:
                            break;
                        case 17:
                            return obj instanceof UUID;
                        case 132:
                        case 134:
                        case 143:
                        case 145:
                        case 260:
                        case 262:
                        case 271:
                        case 273:
                        case 516:
                        case 518:
                        case 527:
                        case 529:
                            return false;
                        default:
                            switch (i) {
                                case 8:
                                    return obj instanceof Date;
                                case 9:
                                    return obj instanceof Float;
                                case 10:
                                    return obj instanceof Double;
                                case 11:
                                    return obj instanceof Decimal128;
                                case 12:
                                case 13:
                                case 14:
                                    return false;
                                case 15:
                                    return obj instanceof ObjectId;
                                default:
                                    switch (i) {
                                        case Property.TYPE_ARRAY:
                                        case 129:
                                        case 130:
                                            return false;
                                        default:
                                            switch (i) {
                                                case 136:
                                                case 137:
                                                case 138:
                                                case 139:
                                                    return false;
                                                default:
                                                    switch (i) {
                                                        case Property.TYPE_SET:
                                                        case 257:
                                                        case 258:
                                                            return false;
                                                        default:
                                                            switch (i) {
                                                                case 264:
                                                                case 265:
                                                                case 266:
                                                                case 267:
                                                                case 268:
                                                                    return false;
                                                                default:
                                                                    switch (i) {
                                                                        case Property.TYPE_DICTIONARY:
                                                                        case 513:
                                                                        case 514:
                                                                            return false;
                                                                        default:
                                                                            switch (i) {
                                                                                case 520:
                                                                                case 521:
                                                                                case 522:
                                                                                case 523:
                                                                                case 524:
                                                                                    return false;
                                                                                default:
                                                                                    StringBuilder sb = new StringBuilder("Unsupported Realm type:  ");
                                                                                    sb.append(this);
                                                                                    throw new RuntimeException(sb.toString());
                                                                            }
                                                                    }
                                                            }
                                                    }
                                            }
                                    }
                            }
                    }
                }
                return obj instanceof RealmAny;
            }
            if ((obj instanceof byte[]) || (obj instanceof ByteBuffer)) {
                z2 = true;
            }
            return z2;
        }
    }
}
