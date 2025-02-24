package o;

import android.graphics.Rect;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
/* loaded from: classes-dex2jar.jar:o/getRetainInstance.class */
final class getRetainInstance {

    /* loaded from: classes-dex2jar.jar:o/getRetainInstance$RemoteActionCompatParcelizer.class */
    public interface RemoteActionCompatParcelizer<T, V> {
        int a(T t);

        V a(T t, int i);
    }

    /* loaded from: classes-dex2jar.jar:o/getRetainInstance$read.class */
    static final class read<T> implements Comparator<T> {
        private final write<T> a;
        private final boolean b;
        private final Rect c = new Rect();
        private final Rect d = new Rect();

        read(boolean z, write<T> write) {
            this.b = z;
            this.a = write;
        }

        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            Rect rect = this.c;
            Rect rect2 = this.d;
            this.a.b(t, rect);
            this.a.b(t2, rect2);
            int i = -1;
            if (rect.top < rect2.top) {
                return -1;
            }
            if (rect.top > rect2.top) {
                return 1;
            }
            if (rect.left < rect2.left) {
                if (this.b) {
                    i = 1;
                }
                return i;
            } else if (rect.left > rect2.left) {
                if (!this.b) {
                    i = 1;
                }
                return i;
            } else if (rect.bottom < rect2.bottom) {
                return -1;
            } else {
                if (rect.bottom > rect2.bottom) {
                    return 1;
                }
                if (rect.right < rect2.right) {
                    if (this.b) {
                        i = 1;
                    }
                    return i;
                } else if (rect.right <= rect2.right) {
                    return 0;
                } else {
                    if (!this.b) {
                        i = 1;
                    }
                    return i;
                }
            }
        }
    }

    /* loaded from: classes-dex2jar.jar:o/getRetainInstance$write.class */
    public interface write<T> {
        void b(T t, Rect rect);
    }

    private static boolean a(int i, Rect rect, Rect rect2) {
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            boolean z = false;
            if (rect2.right >= rect.left) {
                z = rect2.left <= rect.right;
            }
            return z;
        }
        boolean z2 = false;
        if (rect2.bottom >= rect.top) {
            z2 = false;
            if (rect2.top <= rect.bottom) {
                z2 = true;
            }
        }
        return z2;
    }

    private static int b(int i, Rect rect, Rect rect2) {
        return Math.max(0, d(i, rect, rect2));
    }

    public static <L, T> T b(L l, RemoteActionCompatParcelizer<L, T> remoteActionCompatParcelizer, write<T> write2, T t, int i, boolean z, boolean z2) {
        int a = remoteActionCompatParcelizer.a(l);
        ArrayList arrayList = new ArrayList(a);
        for (int i2 = 0; i2 < a; i2++) {
            arrayList.add(remoteActionCompatParcelizer.a(l, i2));
        }
        Collections.sort(arrayList, new read(z, write2));
        T t2 = null;
        T t3 = null;
        int i3 = -1;
        if (i == 1) {
            int size = arrayList.size();
            if (t != null) {
                size = arrayList.indexOf(t);
            }
            int i4 = size - 1;
            if (i4 >= 0) {
                t2 = (T) arrayList.get(i4);
            }
            return t2;
        } else if (i == 2) {
            int size2 = arrayList.size();
            if (t != null) {
                i3 = arrayList.lastIndexOf(t);
            }
            int i5 = i3 + 1;
            if (i5 < size2) {
                t3 = (T) arrayList.get(i5);
            }
            return t3;
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD}.");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x013d, code lost:
        if ((((r0 * 13) * r0) + (r0 * r0)) < (((r0 * 13) * r0) + (r0 * r0))) goto L_0x00cd;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0157 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public static <L, T> T b(L r5, o.getRetainInstance.RemoteActionCompatParcelizer<L, T> r6, o.getRetainInstance.write<T> r7, T r8, android.graphics.Rect r9, int r10) {
        /*
        // Method dump skipped, instructions count: 356
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getRetainInstance.b(java.lang.Object, o.getRetainInstance$RemoteActionCompatParcelizer, o.getRetainInstance$write, java.lang.Object, android.graphics.Rect, int):java.lang.Object");
    }

    private static int c(int i, Rect rect, Rect rect2) {
        int i2;
        int i3;
        if (i == 17) {
            i3 = rect.left;
            i2 = rect2.left;
        } else if (i == 33) {
            i3 = rect.top;
            i2 = rect2.top;
        } else if (i == 66) {
            i3 = rect2.right;
            i2 = rect.right;
        } else if (i == 130) {
            i3 = rect2.bottom;
            i2 = rect.bottom;
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        return i3 - i2;
    }

    private static int d(int i, Rect rect, Rect rect2) {
        int i2;
        int i3;
        if (i == 17) {
            i3 = rect.left;
            i2 = rect2.right;
        } else if (i == 33) {
            i3 = rect.top;
            i2 = rect2.bottom;
        } else if (i == 66) {
            i3 = rect2.left;
            i2 = rect.right;
        } else if (i == 130) {
            i3 = rect2.top;
            i2 = rect.bottom;
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        return i3 - i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003b, code lost:
        if (r4.bottom <= r5.top) goto L_0x003e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0076, code lost:
        if (r4.right <= r5.left) goto L_0x0079;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a4, code lost:
        if (r4.top >= r5.bottom) goto L_0x00a7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00d3, code lost:
        if (r4.left >= r5.right) goto L_0x00d6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump */
    private static boolean d(android.graphics.Rect r4, android.graphics.Rect r5, int r6) {
        /*
        // Method dump skipped, instructions count: 235
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getRetainInstance.d(android.graphics.Rect, android.graphics.Rect, int):boolean");
    }

    private static int e(int i, Rect rect, Rect rect2) {
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return Math.abs((rect.left + (rect.width() / 2)) - (rect2.left + (rect2.width() / 2)));
        }
        return Math.abs((rect.top + (rect.height() / 2)) - (rect2.top + (rect2.height() / 2)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003e, code lost:
        if (r7.bottom > r9.top) goto L_0x0041;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0041, code lost:
        r13 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0047, code lost:
        r13 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005f, code lost:
        if (r7.right <= r9.left) goto L_0x0047;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006d, code lost:
        if (r7.top >= r9.bottom) goto L_0x0047;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x007b, code lost:
        if (r7.left >= r9.right) goto L_0x0047;
     */
    /* Code decompiled incorrectly, please refer to instructions dump */
    private static boolean e(int r6, android.graphics.Rect r7, android.graphics.Rect r8, android.graphics.Rect r9) {
        /*
            r0 = r6
            r1 = r7
            r2 = r8
            boolean r0 = a(r0, r1, r2)
            r10 = r0
            r0 = r6
            r1 = r7
            r2 = r9
            boolean r0 = a(r0, r1, r2)
            r11 = r0
            r0 = 0
            r12 = r0
            r0 = r11
            if (r0 != 0) goto L_0x00af
            r0 = r10
            if (r0 == 0) goto L_0x00af
            r0 = r6
            r1 = 17
            if (r0 == r1) goto L_0x0073
            r0 = r6
            r1 = 33
            if (r0 == r1) goto L_0x0065
            r0 = r6
            r1 = 66
            if (r0 == r1) goto L_0x0057
            r0 = r6
            r1 = 130(0x82, float:1.82E-43)
            if (r0 != r1) goto L_0x004d
            r0 = r7
            int r0 = r0.bottom
            r1 = r9
            int r1 = r1.top
            if (r0 <= r1) goto L_0x0047
        L_0x0041:
            r0 = 0
            r13 = r0
            goto L_0x0081
        L_0x0047:
            r0 = 1
            r13 = r0
            goto L_0x0081
        L_0x004d:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            java.lang.String r2 = "direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}."
            r1.<init>(r2)
            throw r0
        L_0x0057:
            r0 = r7
            int r0 = r0.right
            r1 = r9
            int r1 = r1.left
            if (r0 > r1) goto L_0x0041
            goto L_0x0047
        L_0x0065:
            r0 = r7
            int r0 = r0.top
            r1 = r9
            int r1 = r1.bottom
            if (r0 < r1) goto L_0x0041
            goto L_0x0047
        L_0x0073:
            r0 = r7
            int r0 = r0.left
            r1 = r9
            int r1 = r1.right
            if (r0 < r1) goto L_0x0041
            goto L_0x0047
        L_0x0081:
            r0 = r13
            if (r0 != 0) goto L_0x0088
            r0 = 1
            return r0
        L_0x0088:
            r0 = r6
            r1 = 17
            if (r0 == r1) goto L_0x00ad
            r0 = r6
            r1 = 66
            if (r0 == r1) goto L_0x00ad
            r0 = r6
            r1 = r7
            r2 = r8
            int r0 = b(r0, r1, r2)
            r1 = 1
            r2 = r6
            r3 = r7
            r4 = r9
            int r2 = c(r2, r3, r4)
            int r1 = java.lang.Math.max(r1, r2)
            if (r0 >= r1) goto L_0x00aa
            r0 = 1
            r12 = r0
        L_0x00aa:
            r0 = r12
            return r0
        L_0x00ad:
            r0 = 1
            return r0
        L_0x00af:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getRetainInstance.e(int, android.graphics.Rect, android.graphics.Rect, android.graphics.Rect):boolean");
    }
}
