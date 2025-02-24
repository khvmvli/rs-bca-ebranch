package o;
/* loaded from: classes-dex2jar.jar:o/EChannel.class */
public enum EChannel {
    DOUBLE(setSupplementCardLimit.DOUBLE, 1),
    FLOAT(setSupplementCardLimit.FLOAT, 5),
    INT64(setSupplementCardLimit.LONG, 0),
    UINT64(setSupplementCardLimit.LONG, 0),
    INT32(setSupplementCardLimit.INT, 0),
    FIXED64(setSupplementCardLimit.LONG, 1),
    FIXED32(setSupplementCardLimit.INT, 5),
    BOOL(setSupplementCardLimit.BOOLEAN, 0),
    STRING(setSupplementCardLimit.STRING, 2),
    GROUP(setSupplementCardLimit.MESSAGE, 3),
    MESSAGE(setSupplementCardLimit.MESSAGE, 2),
    BYTES(setSupplementCardLimit.BYTE_STRING, 2),
    UINT32(setSupplementCardLimit.INT, 0),
    ENUM(setSupplementCardLimit.ENUM, 0),
    SFIXED32(setSupplementCardLimit.INT, 5),
    SFIXED64(setSupplementCardLimit.LONG, 1),
    SINT32(setSupplementCardLimit.INT, 0),
    SINT64(setSupplementCardLimit.LONG, 0);
    
    private final setSupplementCardLimit r;

    EChannel(setSupplementCardLimit setsupplementcardlimit, int i) {
        this.r = setsupplementcardlimit;
    }

    public final setSupplementCardLimit e() {
        return this.r;
    }
}
