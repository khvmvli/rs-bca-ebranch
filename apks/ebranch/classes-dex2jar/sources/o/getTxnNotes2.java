package o;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.view.KeyEvent;
import io.realm.internal.Property;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;
/* loaded from: classes-dex2jar.jar:o/getTxnNotes2.class */
public final class getTxnNotes2 {
    private static int a;
    private static volatile Handler b;
    private static long c;
    private static final char[] d = new char[64];
    private static final char[] e;
    private static int i;

    /* renamed from: o.getTxnNotes2$5 */
    /* loaded from: classes-dex2jar.jar:o/getTxnNotes2$5.class */
    public static final /* synthetic */ class AnonymousClass5 {
        static final /* synthetic */ int[] d;

        static {
            int[] iArr = new int[Bitmap.Config.values().length];
            d = iArr;
            try {
                iArr[Bitmap.Config.ALPHA_8.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                d[Bitmap.Config.RGB_565.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                d[Bitmap.Config.ARGB_4444.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            try {
                d[Bitmap.Config.RGBA_F16.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
            }
            try {
                d[Bitmap.Config.ARGB_8888.ordinal()] = 5;
            } catch (NoSuchFieldError e5) {
            }
        }
    }

    static {
        d();
        Object[] objArr = new Object[1];
        c(new char[]{23045, 23093, 20489, 42915, 28757, 25118, 59211, 874, 56197, 61981, 25883, 32978, 22869, 29669, 58240, 1747, 57210, 62948, 25136, 33819}, 1 - KeyEvent.getDeadChar(0, 0), objArr);
        e = ((String) objArr[0]).intern().toCharArray();
        int i2 = i + 83;
        a = i2 % Property.TYPE_ARRAY;
        if ((i2 % 2 != 0 ? 'V' : 27) == 'V') {
            throw new ArithmeticException("divide by zero");
        }
    }

    private getTxnNotes2() {
    }

    public static int a(float f) {
        a = (i + 83) % Property.TYPE_ARRAY;
        int d2 = d(f, 17);
        i = (a + 87) % Property.TYPE_ARRAY;
        return d2;
    }

    private static int a(Bitmap.Config config) {
        int i2;
        int i3 = a + 31;
        i = i3 % Property.TYPE_ARRAY;
        boolean z = false;
        if (i3 % 2 == 0) {
            throw new ArithmeticException("divide by zero");
        }
        Bitmap.Config config2 = config;
        if (config == null) {
            config2 = Bitmap.Config.ARGB_8888;
        }
        int i4 = AnonymousClass5.d[config2.ordinal()];
        if ((i4 != 1 ? '8' : 31) != 31) {
            i2 = 2;
            if (i4 != 2) {
                if (i4 != 3) {
                    z = true;
                }
                i2 = 2;
                if (z) {
                    try {
                        i = (a + 81) % Property.TYPE_ARRAY;
                        if (i4 == 4) {
                            int i5 = a + 35;
                            i = i5 % Property.TYPE_ARRAY;
                            i2 = i5 % 2 == 0 ? 60 : 8;
                        } else {
                            i2 = 4;
                        }
                    } catch (Exception e2) {
                        throw e2;
                    }
                }
            }
        } else {
            i2 = 1;
        }
        return i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0045, code lost:
        if ((!r0 ? 'b' : 'M') == 'b') goto L_0x0048;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0048, code lost:
        r0 = o.getTxnNotes2.i + 3;
        o.getTxnNotes2.a = r0 % io.realm.internal.Property.TYPE_ARRAY;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0059, code lost:
        if ((r0 % 2) == 0) goto L_0x0061;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0061, code lost:
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0065, code lost:
        if (r5 == true) goto L_0x0078;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0068, code lost:
        r0 = r4.getAllocationByteCount();
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0074, code lost:
        throw new java.lang.NullPointerException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x007e, code lost:
        return r4.getAllocationByteCount();
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x008a, code lost:
        return r4.getHeight() * r4.getRowBytes();
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x008b, code lost:
        r0 = new java.lang.StringBuilder("Cannot obtain size for recycled Bitmap: ");
        r0.append(r4);
        r0.append("[");
        r0.append(r4.getWidth());
        r0.append("x");
        r0.append(r4.getHeight());
        r0.append("] ");
        r0.append(r4.getConfig());
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00df, code lost:
        throw new java.lang.IllegalStateException(r0.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0027, code lost:
        if (r4.isRecycled() == false) goto L_0x0048;
     */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public static int a(android.graphics.Bitmap r4) {
        /*
        // Method dump skipped, instructions count: 230
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getTxnNotes2.a(android.graphics.Bitmap):int");
    }

    public static int a(Object obj, int i2) {
        int i3;
        try {
            i = (a + 49) % Property.TYPE_ARRAY;
            if ((obj == null ? 'M' : 'Y') != 'Y') {
                i3 = 0;
            } else {
                i3 = obj.hashCode();
                a = (i + setHasDecor$MediaBrowserCompat$MediaItem.aI) % Property.TYPE_ARRAY;
            }
            return b(i3, i2);
        } catch (Exception e2) {
            throw e2;
        }
    }

    public static String a(byte[] bArr) {
        String e2;
        char[] cArr = d;
        synchronized (cArr) {
            e2 = e(bArr, cArr);
        }
        return e2;
    }

    public static void a(Runnable runnable) {
        try {
            i = (a + 69) % Property.TYPE_ARRAY;
            e().removeCallbacks(runnable);
            a = (i + 101) % Property.TYPE_ARRAY;
        } catch (Exception e2) {
            throw e2;
        }
    }

    public static boolean a() {
        int i2 = a + 17;
        i = i2 % Property.TYPE_ARRAY;
        boolean z = true;
        try {
            if ((i2 % 2 == 0 ? '\\' : 'I') != 'I') {
                try {
                    Looper.myLooper();
                    Looper.getMainLooper();
                    throw new ArithmeticException("divide by zero");
                } catch (Exception e2) {
                    throw e2;
                }
            } else {
                if ((Looper.myLooper() == Looper.getMainLooper() ? 6 : 'R') != 6) {
                    a = (i + setHasDecor$MediaBrowserCompat$MediaItem.aJ) % Property.TYPE_ARRAY;
                    z = false;
                }
                return z;
            }
        } catch (Exception e3) {
            throw e3;
        }
    }

    private static boolean a(int i2) {
        i = (a + 69) % Property.TYPE_ARRAY;
        boolean z = false;
        if ((i2 <= 0 ? ':' : 'C') == ':') {
            if (!(i2 == Integer.MIN_VALUE)) {
                a = (i + 29) % Property.TYPE_ARRAY;
                return z;
            }
        }
        z = true;
        return z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0037, code lost:
        if (r4 == null) goto L_0x0053;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0050, code lost:
        if ((r4 == null ? 25 : 'K') != 'K') goto L_0x0053;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0053, code lost:
        o.getTxnNotes2.i = (o.getTxnNotes2.a + 89) % io.realm.internal.Property.TYPE_ARRAY;
        r6 = true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public static boolean a(java.lang.Object r3, java.lang.Object r4) {
        /*
            r0 = r3
            if (r0 != 0) goto L_0x000a
            r0 = 47
            r5 = r0
            goto L_0x000d
        L_0x000a:
            r0 = 79
            r5 = r0
        L_0x000d:
            r0 = 0
            r6 = r0
            r0 = r5
            r1 = 79
            if (r0 == r1) goto L_0x006e
            int r0 = o.getTxnNotes2.a     // Catch: Exception -> 0x006a
            r1 = 13
            int r0 = r0 + r1
            r5 = r0
            r0 = r5
            r1 = 128(0x80, float:1.8E-43)
            int r0 = r0 % r1
            o.getTxnNotes2.i = r0     // Catch: Exception -> 0x006a
            r0 = r5
            r1 = 2
            int r0 = r0 % r1
            if (r0 != 0) goto L_0x002f
            r0 = 1
            r5 = r0
            goto L_0x0031
        L_0x002f:
            r0 = 0
            r5 = r0
        L_0x0031:
            r0 = r5
            r1 = 1
            if (r0 == r1) goto L_0x003d
            r0 = r4
            if (r0 != 0) goto L_0x0074
            goto L_0x0053
        L_0x003d:
            r0 = 0
            int r0 = r0.length     // Catch: all -> 0x0067
            r5 = r0
            r0 = r4
            if (r0 != 0) goto L_0x004a
            r0 = 25
            r5 = r0
            goto L_0x004d
        L_0x004a:
            r0 = 75
            r5 = r0
        L_0x004d:
            r0 = r5
            r1 = 75
            if (r0 == r1) goto L_0x0074
        L_0x0053:
            int r0 = o.getTxnNotes2.a
            r1 = 89
            int r0 = r0 + r1
            r5 = r0
            r0 = r5
            r1 = 128(0x80, float:1.8E-43)
            int r0 = r0 % r1
            o.getTxnNotes2.i = r0
            r0 = 1
            r6 = r0
            goto L_0x0074
        L_0x0067:
            r3 = move-exception
            r0 = r3
            throw r0
        L_0x006a:
            r3 = move-exception
            goto L_0x0076
        L_0x006e:
            r0 = r3
            r1 = r4
            boolean r0 = r0.equals(r1)     // Catch: Exception -> 0x006a
            r6 = r0
        L_0x0074:
            r0 = r6
            return r0
        L_0x0076:
            r0 = r3
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getTxnNotes2.a(java.lang.Object, java.lang.Object):boolean");
    }

    public static int b(int i2, int i3) {
        i = (a + 45) % Property.TYPE_ARRAY;
        int i4 = a + 83;
        i = i4 % Property.TYPE_ARRAY;
        if (i4 % 2 != 0) {
            return (i3 * 31) + i2;
        }
        throw new ArithmeticException("divide by zero");
    }

    public static int b(int i2, int i3, Bitmap.Config config) {
        int i4 = a + 61;
        i = i4 % Property.TYPE_ARRAY;
        int a2 = !(i4 % 2 == 0) ? i2 * i3 * a(config) : (i2 >>> i3) - a(config);
        int i5 = i + setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.cz;
        a = i5 % Property.TYPE_ARRAY;
        if ((i5 % 2 != 0 ? (char) 27 : 23) == 23) {
            return a2;
        }
        Object[] objArr = null;
        int length = objArr.length;
        return a2;
    }

    public static void b() {
        int i2 = i + 3;
        a = i2 % Property.TYPE_ARRAY;
        if (i2 % 2 != 0) {
            a();
            throw new ArithmeticException("divide by zero");
        } else if (a()) {
            try {
                int i3 = a + 39;
                i = i3 % Property.TYPE_ARRAY;
                if ((i3 % 2 == 0 ? ']' : 'T') != 'T') {
                    throw new ArithmeticException("divide by zero");
                }
            } catch (Exception e2) {
                throw e2;
            }
        } else {
            throw new IllegalArgumentException("You must call this method on the main thread");
        }
    }

    public static boolean b(Object obj, Object obj2) {
        boolean z = false;
        boolean z2 = false;
        if (!(obj == null)) {
            if ((obj instanceof FirebaseResponse$ValueTxnDataDetail$$Parcelable ? 4 : 'F') != 'F') {
                try {
                    int i2 = i + 73;
                    a = i2 % Property.TYPE_ARRAY;
                    if (i2 % 2 == 0) {
                        z2 = true;
                    }
                    if (z2) {
                        return ((FirebaseResponse$ValueTxnDataDetail$$Parcelable) obj).a();
                    }
                    try {
                        ((FirebaseResponse$ValueTxnDataDetail$$Parcelable) obj).a();
                        throw new NullPointerException();
                    } catch (Exception e2) {
                        throw e2;
                    }
                } catch (Exception e3) {
                    throw e3;
                }
            } else {
                boolean equals = obj.equals(obj2);
                a = (i + 23) % Property.TYPE_ARRAY;
                return equals;
            }
        } else {
            if (obj2 == null) {
                i = (a + 65) % Property.TYPE_ARRAY;
                z = true;
            }
            return z;
        }
    }

    public static <T> List<T> c(Collection<T> collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator<T> it = collection.iterator();
        a = (i + setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.cB) % Property.TYPE_ARRAY;
        while (true) {
            boolean z = false;
            if (!(it.hasNext())) {
                return arrayList;
            }
            try {
                int i2 = a + setHasDecor$MediaBrowserCompat$MediaItem.aI;
                i = i2 % Property.TYPE_ARRAY;
                if (!(i2 % 2 != 0)) {
                    it.next();
                    throw new ArithmeticException("divide by zero");
                }
                T next = it.next();
                if (next == null) {
                    z = true;
                }
                if (!z) {
                    a = (i + 15) % Property.TYPE_ARRAY;
                    try {
                        arrayList.add(next);
                    } catch (Exception e2) {
                        throw e2;
                    }
                }
            } catch (Exception e3) {
                throw e3;
            }
        }
    }

    public static void c(Runnable runnable) {
        try {
            i = (a + 51) % Property.TYPE_ARRAY;
            e().post(runnable);
            try {
                a = (i + 41) % Property.TYPE_ARRAY;
            } catch (Exception e2) {
                throw e2;
            }
        } catch (Exception e3) {
            throw e3;
        }
    }

    private static void c(char[] cArr, int i2, Object[] objArr) {
        String str;
        synchronized (CC23CFormKartuKreditFragment.b) {
            char[] b2 = CC23CFormKartuKreditFragment.b(c, cArr, i2);
            CC23CFormKartuKreditFragment.a = 4;
            while (CC23CFormKartuKreditFragment.a < b2.length) {
                CC23CFormKartuKreditFragment.d = CC23CFormKartuKreditFragment.a - 4;
                b2[CC23CFormKartuKreditFragment.a] = (char) ((char) ((int) (((long) (b2[CC23CFormKartuKreditFragment.a] ^ b2[CC23CFormKartuKreditFragment.a % 4])) ^ (((long) CC23CFormKartuKreditFragment.d) * c))));
                CC23CFormKartuKreditFragment.a++;
            }
            str = new String(b2, 4, b2.length - 4);
        }
        objArr[0] = str;
    }

    public static boolean c() {
        try {
            a = (i + 113) % Property.TYPE_ARRAY;
            boolean a2 = a();
            i = (a + 91) % Property.TYPE_ARRAY;
            return !a2;
        } catch (Exception e2) {
            throw e2;
        }
    }

    private static int d(float f, int i2) {
        int i3;
        int i4;
        int i5 = i + 45;
        a = i5 % Property.TYPE_ARRAY;
        if ((i5 % 2 != 0 ? 23 : '^') != 23) {
            i3 = Float.floatToIntBits(f);
            i4 = 17;
        } else {
            i3 = Float.floatToIntBits(f);
            i4 = 67;
        }
        return b(i3, i4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static int d(boolean z, int i2) {
        int b2;
        int i3 = i + 95;
        a = i3 % Property.TYPE_ARRAY;
        if ((i3 % 2 != 0 ? '@' : 6) != 6) {
            try {
                b2 = b(z ? 1 : 0, i2);
                Object[] objArr = null;
                int length = objArr.length;
            } catch (Exception e2) {
                throw e2;
            }
        } else {
            b2 = b((int) z, i2);
        }
        i = (a + 19) % Property.TYPE_ARRAY;
        return b2;
    }

    public static <T> Queue<T> d(int i2) {
        ArrayDeque arrayDeque = new ArrayDeque(i2);
        try {
            int i3 = i + 7;
            a = i3 % Property.TYPE_ARRAY;
            if ((i3 % 2 != 0 ? '(' : '_') == '_') {
                return arrayDeque;
            }
            throw new NullPointerException();
        } catch (Exception e2) {
            throw e2;
        }
    }

    static void d() {
        c = 8109906483620225133L;
    }

    public static boolean d(int i2, int i3) {
        a = (i + 57) % Property.TYPE_ARRAY;
        try {
            boolean z = false;
            if ((a(i2) ? '#' : '7') == '#') {
                try {
                    int i4 = a + 79;
                    i = i4 % Property.TYPE_ARRAY;
                    if (i4 % 2 == 0) {
                        a(i3);
                        throw new NullPointerException();
                    }
                    if ((a(i3) ? 'b' : '\f') != '\f') {
                        z = true;
                    }
                } catch (Exception e2) {
                    throw e2;
                }
            }
            return z;
        } catch (Exception e3) {
            throw e3;
        }
    }

    private static Handler e() {
        if (b == null) {
            synchronized (getTxnNotes2.class) {
                try {
                    if (b == null) {
                        b = new Handler(Looper.getMainLooper());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return b;
    }

    private static String e(byte[] bArr, char[] cArr) {
        a = (i + 43) % Property.TYPE_ARRAY;
        try {
            try {
                a = (i + 89) % Property.TYPE_ARRAY;
                int i2 = 0;
                while (i2 < bArr.length) {
                    int i3 = a + 85;
                    i = i3 % Property.TYPE_ARRAY;
                    if ((i3 % 2 == 0 ? '&' : 22) != 22) {
                        int i4 = bArr[i2] ^ 2890;
                        int i5 = i2 - 1;
                        char[] cArr2 = e;
                        cArr[i5] = (char) cArr2[i4 - 3];
                        cArr[i5 << 0] = (char) cArr2[i4 ^ 69];
                        i2 += 34;
                    } else {
                        int i6 = bArr[i2] & 255;
                        int i7 = i2 << 1;
                        char[] cArr3 = e;
                        cArr[i7] = (char) cArr3[i6 >>> 4];
                        cArr[i7 + 1] = (char) cArr3[i6 & 15];
                        i2++;
                    }
                }
                return new String(cArr);
            } catch (Exception e2) {
                throw e2;
            }
        } catch (Exception e3) {
            throw e3;
        }
    }
}
