package o;
/* loaded from: classes-dex2jar.jar:o/setMonthlyOtherIncome.class */
public enum setMonthlyOtherIncome {
    VOID(Void.class, Void.class, null),
    INT(Integer.TYPE, Integer.class, 0),
    LONG(Long.TYPE, Long.class, 0L),
    FLOAT(Float.TYPE, Float.class, Float.valueOf(0.0f)),
    DOUBLE(Double.TYPE, Double.class, Double.valueOf(0.0d)),
    BOOLEAN(Boolean.TYPE, Boolean.class, false),
    STRING(String.class, String.class, ""),
    BYTE_STRING(setCurrOfficePostCode.class, setCurrOfficePostCode.class, setCurrOfficePostCode.a),
    ENUM(Integer.TYPE, Integer.class, null),
    MESSAGE(Object.class, Object.class, null);
    
    private final Object m;
    private final Class<?> n;

    /* renamed from: o  reason: collision with root package name */
    private final Class<?> f246o;

    setMonthlyOtherIncome(Class cls, Class cls2, Object obj) {
        this.f246o = cls;
        this.n = cls2;
        this.m = obj;
    }

    public final Class<?> e() {
        return this.n;
    }
}
