package o;
/* loaded from: classes-dex2jar.jar:o/setFlagPromotionCode.class */
public enum setFlagPromotionCode {
    DOUBLE(0, 1, setMonthlyOtherIncome.DOUBLE),
    FLOAT(1, 1, setMonthlyOtherIncome.FLOAT),
    INT64(2, 1, setMonthlyOtherIncome.LONG),
    UINT64(3, 1, setMonthlyOtherIncome.LONG),
    INT32(4, 1, setMonthlyOtherIncome.INT),
    FIXED64(5, 1, setMonthlyOtherIncome.LONG),
    FIXED32(6, 1, setMonthlyOtherIncome.INT),
    BOOL(7, 1, setMonthlyOtherIncome.BOOLEAN),
    STRING(8, 1, setMonthlyOtherIncome.STRING),
    MESSAGE(9, 1, setMonthlyOtherIncome.MESSAGE),
    BYTES(10, 1, setMonthlyOtherIncome.BYTE_STRING),
    UINT32(11, 1, setMonthlyOtherIncome.INT),
    ENUM(12, 1, setMonthlyOtherIncome.ENUM),
    SFIXED32(13, 1, setMonthlyOtherIncome.INT),
    SFIXED64(14, 1, setMonthlyOtherIncome.LONG),
    SINT32(15, 1, setMonthlyOtherIncome.INT),
    SINT64(16, 1, setMonthlyOtherIncome.LONG),
    GROUP(17, 1, setMonthlyOtherIncome.MESSAGE),
    DOUBLE_LIST(18, 2, setMonthlyOtherIncome.DOUBLE),
    FLOAT_LIST(19, 2, setMonthlyOtherIncome.FLOAT),
    INT64_LIST(20, 2, setMonthlyOtherIncome.LONG),
    UINT64_LIST(21, 2, setMonthlyOtherIncome.LONG),
    INT32_LIST(22, 2, setMonthlyOtherIncome.INT),
    FIXED64_LIST(23, 2, setMonthlyOtherIncome.LONG),
    FIXED32_LIST(24, 2, setMonthlyOtherIncome.INT),
    BOOL_LIST(25, 2, setMonthlyOtherIncome.BOOLEAN),
    STRING_LIST(26, 2, setMonthlyOtherIncome.STRING),
    MESSAGE_LIST(27, 2, setMonthlyOtherIncome.MESSAGE),
    BYTES_LIST(28, 2, setMonthlyOtherIncome.BYTE_STRING),
    UINT32_LIST(29, 2, setMonthlyOtherIncome.INT),
    ENUM_LIST(30, 2, setMonthlyOtherIncome.ENUM),
    SFIXED32_LIST(31, 2, setMonthlyOtherIncome.INT),
    SFIXED64_LIST(32, 2, setMonthlyOtherIncome.LONG),
    SINT32_LIST(33, 2, setMonthlyOtherIncome.INT),
    SINT64_LIST(34, 2, setMonthlyOtherIncome.LONG),
    DOUBLE_LIST_PACKED(35, 3, setMonthlyOtherIncome.DOUBLE),
    FLOAT_LIST_PACKED(36, 3, setMonthlyOtherIncome.FLOAT),
    INT64_LIST_PACKED(37, 3, setMonthlyOtherIncome.LONG),
    UINT64_LIST_PACKED(38, 3, setMonthlyOtherIncome.LONG),
    INT32_LIST_PACKED(39, 3, setMonthlyOtherIncome.INT),
    FIXED64_LIST_PACKED(40, 3, setMonthlyOtherIncome.LONG),
    FIXED32_LIST_PACKED(41, 3, setMonthlyOtherIncome.INT),
    BOOL_LIST_PACKED(42, 3, setMonthlyOtherIncome.BOOLEAN),
    UINT32_LIST_PACKED(43, 3, setMonthlyOtherIncome.INT),
    ENUM_LIST_PACKED(44, 3, setMonthlyOtherIncome.ENUM),
    SFIXED32_LIST_PACKED(45, 3, setMonthlyOtherIncome.INT),
    SFIXED64_LIST_PACKED(46, 3, setMonthlyOtherIncome.LONG),
    SINT32_LIST_PACKED(47, 3, setMonthlyOtherIncome.INT),
    SINT64_LIST_PACKED(48, 3, setMonthlyOtherIncome.LONG),
    GROUP_LIST(49, 2, setMonthlyOtherIncome.MESSAGE),
    MAP(50, 4, setMonthlyOtherIncome.VOID);
    
    private static final setFlagPromotionCode[] Y;
    private final setMonthlyOtherIncome ab;
    private final int ac;
    private final Class<?> ag;

    static {
        setFlagPromotionCode[] values = values();
        int length = values.length;
        Y = new setFlagPromotionCode[length];
        for (setFlagPromotionCode setflagpromotioncode : values) {
            Y[setflagpromotioncode.ac] = setflagpromotioncode;
        }
    }

    setFlagPromotionCode(int i, int i2, setMonthlyOtherIncome setmonthlyotherincome) {
        this.ac = i;
        this.ab = setmonthlyotherincome;
        setMonthlyOtherIncome setmonthlyotherincome2 = setMonthlyOtherIncome.VOID;
        int i3 = i2 - 1;
        if (i3 == 1) {
            this.ag = setmonthlyotherincome.e();
        } else if (i3 != 3) {
            this.ag = null;
        } else {
            this.ag = setmonthlyotherincome.e();
        }
        if (i2 == 1) {
            setmonthlyotherincome.ordinal();
        }
    }

    public final int a() {
        return this.ac;
    }
}
