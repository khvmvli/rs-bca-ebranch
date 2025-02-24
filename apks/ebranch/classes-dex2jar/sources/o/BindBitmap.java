package o;

import java.util.Arrays;
/* loaded from: classes-dex2jar.jar:o/BindBitmap.class */
public final class BindBitmap<V> {
    public final V b;
    final Throwable c;

    public BindBitmap(V v) {
        this.b = v;
        this.c = null;
    }

    public BindBitmap(Throwable th) {
        this.c = th;
        this.b = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BindBitmap)) {
            return false;
        }
        BindBitmap bindBitmap = (BindBitmap) obj;
        V v = this.b;
        if (v != null && v.equals(bindBitmap.b)) {
            return true;
        }
        Throwable th = this.c;
        if (th == null || bindBitmap.c == null) {
            return false;
        }
        return th.toString().equals(this.c.toString());
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.c});
    }
}
