package o;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
/* loaded from: classes-dex2jar.jar:o/getTxnSourceValue.class */
public class getTxnSourceValue<T, Y> {
    private final Map<T, RemoteActionCompatParcelizer<Y>> a = new LinkedHashMap(100, 0.75f, true);
    private long b;
    private final long d;
    private long e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes-dex2jar.jar:o/getTxnSourceValue$RemoteActionCompatParcelizer.class */
    public static final class RemoteActionCompatParcelizer<Y> {
        final int a;
        final Y d;

        RemoteActionCompatParcelizer(Y y, int i) {
            this.d = y;
            this.a = i;
        }
    }

    public getTxnSourceValue(long j) {
        this.d = j;
        this.e = j;
    }

    public final void a() {
        b(0);
    }

    public final Y b(T t) {
        Y y;
        synchronized (this) {
            RemoteActionCompatParcelizer<Y> remoteActionCompatParcelizer = this.a.get(t);
            y = remoteActionCompatParcelizer != null ? remoteActionCompatParcelizer.d : null;
        }
        return y;
    }

    protected final void b(long j) {
        synchronized (this) {
            while (this.b > j) {
                Iterator<Map.Entry<T, RemoteActionCompatParcelizer<Y>>> it = this.a.entrySet().iterator();
                Map.Entry<T, RemoteActionCompatParcelizer<Y>> next = it.next();
                RemoteActionCompatParcelizer<Y> value = next.getValue();
                this.b -= (long) value.a;
                T key = next.getKey();
                it.remove();
                d(key, value.d);
            }
        }
    }

    public final long c() {
        long j;
        synchronized (this) {
            j = this.e;
        }
        return j;
    }

    public int d(Y y) {
        return 1;
    }

    protected void d(T t, Y y) {
    }

    public final Y e(T t) {
        synchronized (this) {
            RemoteActionCompatParcelizer<Y> remove = this.a.remove(t);
            if (remove == null) {
                return null;
            }
            this.b -= (long) remove.a;
            return remove.d;
        }
    }

    public final Y e(T t, Y y) {
        synchronized (this) {
            int d = d(y);
            long j = (long) d;
            Y y2 = null;
            if (j >= this.e) {
                d(t, y);
                return null;
            }
            if (y != null) {
                this.b += j;
            }
            RemoteActionCompatParcelizer<Y> put = this.a.put(t, y == null ? null : new RemoteActionCompatParcelizer<>(y, d));
            if (put != null) {
                this.b -= (long) put.a;
                if (!put.d.equals(y)) {
                    d(t, put.d);
                }
            }
            b(this.e);
            if (put != null) {
                y2 = put.d;
            }
            return y2;
        }
    }
}
