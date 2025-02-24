package o;

import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
/* loaded from: classes-dex2jar.jar:o/setThumbResource.class */
public class setThumbResource<K, V> {
    private int a;
    private int b;
    private int c;
    private int d;
    private final LinkedHashMap<K, V> e;
    private int h;
    private int i;
    private int j;

    public setThumbResource(int i) {
        if (i > 0) {
            this.c = i;
            this.e = new LinkedHashMap<>(0, 0.75f, true);
            return;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    private int b(K k, V v) {
        int a = a(k, v);
        if (a >= 0) {
            return a;
        }
        throw new IllegalStateException("Negative size: " + k + "=" + v);
    }

    protected int a(K k, V v) {
        return 1;
    }

    protected V a(K k) {
        return null;
    }

    public final V b(K k) {
        V remove;
        if (k != null) {
            synchronized (this) {
                remove = this.e.remove(k);
                if (remove != null) {
                    this.i -= b(k, remove);
                }
            }
            if (remove != null) {
                b(false, k, remove, null);
            }
            return remove;
        }
        throw new NullPointerException("key == null");
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00ac, code lost:
        throw new java.lang.IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");
     */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public void b(int r7) {
        /*
            r6 = this;
        L_0x0000:
            r0 = r6
            monitor-enter(r0)
            r0 = r6
            int r0 = r0.i     // Catch: all -> 0x00ad
            if (r0 < 0) goto L_0x0084
            r0 = r6
            java.util.LinkedHashMap<K, V> r0 = r0.e     // Catch: all -> 0x00ad
            boolean r0 = r0.isEmpty()     // Catch: all -> 0x00ad
            if (r0 == 0) goto L_0x001a
            r0 = r6
            int r0 = r0.i     // Catch: all -> 0x00ad
            if (r0 != 0) goto L_0x0084
        L_0x001a:
            r0 = r6
            int r0 = r0.i     // Catch: all -> 0x00ad
            r1 = r7
            if (r0 <= r1) goto L_0x0081
            r0 = r6
            java.util.LinkedHashMap<K, V> r0 = r0.e     // Catch: all -> 0x00ad
            boolean r0 = r0.isEmpty()     // Catch: all -> 0x00ad
            if (r0 == 0) goto L_0x002f
            goto L_0x0081
        L_0x002f:
            r0 = r6
            java.util.LinkedHashMap<K, V> r0 = r0.e     // Catch: all -> 0x00ad
            java.util.Set r0 = r0.entrySet()     // Catch: all -> 0x00ad
            java.util.Iterator r0 = r0.iterator()     // Catch: all -> 0x00ad
            java.lang.Object r0 = r0.next()     // Catch: all -> 0x00ad
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch: all -> 0x00ad
            r8 = r0
            r0 = r8
            java.lang.Object r0 = r0.getKey()     // Catch: all -> 0x00ad
            r9 = r0
            r0 = r8
            java.lang.Object r0 = r0.getValue()     // Catch: all -> 0x00ad
            r8 = r0
            r0 = r6
            java.util.LinkedHashMap<K, V> r0 = r0.e     // Catch: all -> 0x00ad
            r1 = r9
            java.lang.Object r0 = r0.remove(r1)     // Catch: all -> 0x00ad
            r0 = r6
            r1 = r6
            int r1 = r1.i     // Catch: all -> 0x00ad
            r2 = r6
            r3 = r9
            r4 = r8
            int r2 = r2.b(r3, r4)     // Catch: all -> 0x00ad
            int r1 = r1 - r2
            r0.i = r1     // Catch: all -> 0x00ad
            r0 = r6
            r1 = r6
            int r1 = r1.a     // Catch: all -> 0x00ad
            r2 = 1
            int r1 = r1 + r2
            r0.a = r1     // Catch: all -> 0x00ad
            r0 = r6
            monitor-exit(r0)     // Catch: all -> 0x00ad
            r0 = r6
            r1 = 1
            r2 = r9
            r3 = r8
            r4 = 0
            r0.b(r1, r2, r3, r4)
            goto L_0x0000
        L_0x0081:
            r0 = r6
            monitor-exit(r0)     // Catch: all -> 0x00ad
            return
        L_0x0084:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: all -> 0x00ad
            r8 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: all -> 0x00ad
            r9 = r0
            r0 = r9
            r0.<init>()     // Catch: all -> 0x00ad
            r0 = r9
            r1 = r6
            java.lang.Class r1 = r1.getClass()     // Catch: all -> 0x00ad
            java.lang.String r1 = r1.getName()     // Catch: all -> 0x00ad
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: all -> 0x00ad
            r0 = r9
            java.lang.String r1 = ".sizeOf() is reporting inconsistent results!"
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: all -> 0x00ad
            r0 = r8
            r1 = r9
            java.lang.String r1 = r1.toString()     // Catch: all -> 0x00ad
            r0.<init>(r1)     // Catch: all -> 0x00ad
            r0 = r8
            throw r0     // Catch: all -> 0x00ad
        L_0x00ad:
            r9 = move-exception
            r0 = r6
            monitor-exit(r0)     // Catch: all -> 0x00ad
            r0 = r9
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setThumbResource.b(int):void");
    }

    protected void b(boolean z, K k, V v, V v2) {
    }

    public final V c(K k, V v) {
        V put;
        if (k == null || v == null) {
            throw new NullPointerException("key == null || value == null");
        }
        synchronized (this) {
            this.h++;
            this.i += b(k, v);
            put = this.e.put(k, v);
            if (put != null) {
                this.i -= b(k, put);
            }
        }
        if (put != null) {
            b(false, k, put, v);
        }
        b(this.c);
        return put;
    }

    public final Map<K, V> d() {
        LinkedHashMap linkedHashMap;
        synchronized (this) {
            linkedHashMap = new LinkedHashMap(this.e);
        }
        return linkedHashMap;
    }

    public final V e(K k) {
        V put;
        if (k != null) {
            synchronized (this) {
                V v = this.e.get(k);
                if (v != null) {
                    this.d++;
                    return v;
                }
                this.j++;
                V a = a(k);
                if (a == null) {
                    return null;
                }
                synchronized (this) {
                    this.b++;
                    put = this.e.put(k, a);
                    if (put != null) {
                        this.e.put(k, put);
                    } else {
                        this.i += b(k, a);
                    }
                }
                if (put != null) {
                    b(false, k, a, put);
                    return put;
                }
                b(this.c);
                return a;
            }
        }
        throw new NullPointerException("key == null");
    }

    public final String toString() {
        String format;
        synchronized (this) {
            int i = this.d;
            int i2 = this.j + i;
            format = String.format(Locale.US, "LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", Integer.valueOf(this.c), Integer.valueOf(this.d), Integer.valueOf(this.j), Integer.valueOf(i2 != 0 ? (i * 100) / i2 : 0));
        }
        return format;
    }
}
