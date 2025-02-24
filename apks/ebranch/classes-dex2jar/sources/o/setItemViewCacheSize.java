package o;
/* loaded from: classes-dex2jar.jar:o/setItemViewCacheSize.class */
public final class setItemViewCacheSize implements setRecycledViewPool {
    private final Object[] b;
    private final String c;

    public setItemViewCacheSize(String str) {
        this(str, null);
    }

    private setItemViewCacheSize(String str, Object[] objArr) {
        this.c = str;
        this.b = objArr;
    }

    @Override // o.setRecycledViewPool
    public final void a(setPreserveFocusAfterLayout setpreservefocusafterlayout) {
        Object[] objArr = this.b;
        if (objArr != null) {
            int length = objArr.length;
            int i = 0;
            while (i < length) {
                Object obj = objArr[i];
                i++;
                if (obj == null) {
                    setpreservefocusafterlayout.b(i);
                } else if (obj instanceof byte[]) {
                    setpreservefocusafterlayout.d(i, (byte[]) obj);
                } else if (obj instanceof Float) {
                    setpreservefocusafterlayout.b(i, (double) ((Float) obj).floatValue());
                } else if (obj instanceof Double) {
                    setpreservefocusafterlayout.b(i, ((Double) obj).doubleValue());
                } else if (obj instanceof Long) {
                    setpreservefocusafterlayout.d(i, ((Long) obj).longValue());
                } else if (obj instanceof Integer) {
                    setpreservefocusafterlayout.d(i, (long) ((Integer) obj).intValue());
                } else if (obj instanceof Short) {
                    setpreservefocusafterlayout.d(i, (long) ((Short) obj).shortValue());
                } else if (obj instanceof Byte) {
                    setpreservefocusafterlayout.d(i, (long) ((Byte) obj).byteValue());
                } else if (obj instanceof String) {
                    setpreservefocusafterlayout.a(i, (String) obj);
                } else if (obj instanceof Boolean) {
                    setpreservefocusafterlayout.d(i, ((Boolean) obj).booleanValue() ? 1 : 0);
                } else {
                    StringBuilder sb = new StringBuilder("Cannot bind ");
                    sb.append(obj);
                    sb.append(" at index ");
                    sb.append(i);
                    sb.append(" Supported types: null, byte[], float, double, long, int, short, byte, string");
                    throw new IllegalArgumentException(sb.toString());
                }
            }
        }
    }

    @Override // o.setRecycledViewPool
    public final String b() {
        return this.c;
    }
}
