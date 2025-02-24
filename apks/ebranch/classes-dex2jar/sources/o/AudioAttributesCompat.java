package o;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
/* loaded from: classes-dex2jar.jar:o/AudioAttributesCompat.class */
public final class AudioAttributesCompat implements setRecycledViewPool, setPreserveFocusAfterLayout {
    static final TreeMap<Integer, AudioAttributesCompat> b = new TreeMap<>();
    public final int[] a;
    final int c;
    int d;
    final byte[][] e;
    private volatile String g;
    final double[] h;
    public final String[] i;
    public final long[] j;

    private AudioAttributesCompat(int i) {
        this.c = i;
        int i2 = i + 1;
        this.a = new int[i2];
        this.j = new long[i2];
        this.h = new double[i2];
        this.i = new String[i2];
        this.e = new byte[i2];
    }

    public static AudioAttributesCompat b(String str, int i) {
        TreeMap<Integer, AudioAttributesCompat> treeMap = b;
        synchronized (treeMap) {
            Map.Entry<Integer, AudioAttributesCompat> ceilingEntry = treeMap.ceilingEntry(Integer.valueOf(i));
            if (ceilingEntry != null) {
                treeMap.remove(ceilingEntry.getKey());
                AudioAttributesCompat value = ceilingEntry.getValue();
                value.g = str;
                value.d = i;
                return value;
            }
            AudioAttributesCompat audioAttributesCompat = new AudioAttributesCompat(i);
            audioAttributesCompat.g = str;
            audioAttributesCompat.d = i;
            return audioAttributesCompat;
        }
    }

    @Override // o.setPreserveFocusAfterLayout
    public final void a(int i, String str) {
        this.a[i] = 4;
        this.i[i] = str;
    }

    @Override // o.setRecycledViewPool
    public final void a(setPreserveFocusAfterLayout setpreservefocusafterlayout) {
        for (int i = 1; i <= this.d; i++) {
            int i2 = this.a[i];
            if (i2 == 1) {
                setpreservefocusafterlayout.b(i);
            } else if (i2 == 2) {
                setpreservefocusafterlayout.d(i, this.j[i]);
            } else if (i2 == 3) {
                setpreservefocusafterlayout.b(i, this.h[i]);
            } else if (i2 == 4) {
                setpreservefocusafterlayout.a(i, this.i[i]);
            } else if (i2 == 5) {
                setpreservefocusafterlayout.d(i, this.e[i]);
            }
        }
    }

    @Override // o.setRecycledViewPool
    public final String b() {
        return this.g;
    }

    @Override // o.setPreserveFocusAfterLayout
    public final void b(int i) {
        this.a[i] = 1;
    }

    @Override // o.setPreserveFocusAfterLayout
    public final void b(int i, double d) {
        this.a[i] = 3;
        this.h[i] = d;
    }

    public final void c() {
        TreeMap<Integer, AudioAttributesCompat> treeMap = b;
        synchronized (treeMap) {
            treeMap.put(Integer.valueOf(this.c), this);
            TreeMap<Integer, AudioAttributesCompat> treeMap2 = b;
            if (treeMap2.size() > 15) {
                Iterator<Integer> it = treeMap2.descendingKeySet().iterator();
                for (int size = treeMap2.size() - 10; size > 0; size--) {
                    it.next();
                    it.remove();
                }
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // o.setPreserveFocusAfterLayout
    public final void d(int i, long j) {
        this.a[i] = 2;
        this.j[i] = j;
    }

    @Override // o.setPreserveFocusAfterLayout
    public final void d(int i, byte[] bArr) {
        this.a[i] = 5;
        this.e[i] = bArr;
    }
}
