package o;

import android.animation.Animator;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
/* loaded from: classes-dex2jar.jar:o/getLocalMatrix.class */
public abstract class getLocalMatrix extends setSlingshotDistance {
    private static final String[] i = {"android:visibility:visibility", "android:visibility:parent"};
    private int m;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes-dex2jar.jar:o/getLocalMatrix$read.class */
    public static final class read {
        ViewGroup a;
        ViewGroup b;
        int c;
        boolean d;
        int e;
        boolean f;

        read() {
        }
    }

    public getLocalMatrix() {
        this.m = 3;
    }

    public getLocalMatrix(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.m = 3;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, setProgressViewOffset.k);
        int d = isVisible.d(obtainStyledAttributes, (XmlResourceParser) attributeSet, "transitionVisibilityMode", 0, 0);
        obtainStyledAttributes.recycle();
        if (d == 0) {
            return;
        }
        if ((d & -4) == 0) {
            this.m = d;
            return;
        }
        throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
    }

    private static read b(getStrokeColor getstrokecolor, getStrokeColor getstrokecolor2) {
        read read2 = new read();
        read2.f = false;
        read2.d = false;
        if (getstrokecolor == null || !getstrokecolor.c.containsKey("android:visibility:visibility")) {
            read2.e = -1;
            read2.a = null;
        } else {
            read2.e = ((Integer) getstrokecolor.c.get("android:visibility:visibility")).intValue();
            read2.a = (ViewGroup) getstrokecolor.c.get("android:visibility:parent");
        }
        if (getstrokecolor2 == null || !getstrokecolor2.c.containsKey("android:visibility:visibility")) {
            read2.c = -1;
            read2.b = null;
        } else {
            read2.c = ((Integer) getstrokecolor2.c.get("android:visibility:visibility")).intValue();
            read2.b = (ViewGroup) getstrokecolor2.c.get("android:visibility:parent");
        }
        if (getstrokecolor == null || getstrokecolor2 == null) {
            if (getstrokecolor == null && read2.c == 0) {
                read2.d = true;
                read2.f = true;
            } else if (getstrokecolor2 == null && read2.e == 0) {
                read2.d = false;
                read2.f = true;
            }
        } else if (read2.e == read2.c && read2.a == read2.b) {
            return read2;
        } else {
            if (read2.e != read2.c) {
                if (read2.e == 0) {
                    read2.d = false;
                    read2.f = true;
                } else if (read2.c == 0) {
                    read2.d = true;
                    read2.f = true;
                }
            } else if (read2.b == null) {
                read2.d = false;
                read2.f = true;
            } else if (read2.a == null) {
                read2.d = true;
                read2.f = true;
            }
        }
        return read2;
    }

    private static void e(getStrokeColor getstrokecolor) {
        getstrokecolor.c.put("android:visibility:visibility", Integer.valueOf(getstrokecolor.a.getVisibility()));
        getstrokecolor.c.put("android:visibility:parent", getstrokecolor.a.getParent());
        int[] iArr = new int[2];
        getstrokecolor.a.getLocationOnScreen(iArr);
        getstrokecolor.c.put("android:visibility:screenLocation", iArr);
    }

    public Animator a(View view, getStrokeColor getstrokecolor) {
        return null;
    }

    public final void a(int i2) {
        if ((i2 & -4) == 0) {
            this.m = i2;
            return;
        }
        throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
    }

    @Override // o.setSlingshotDistance
    public void a(getStrokeColor getstrokecolor) {
        e(getstrokecolor);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004d, code lost:
        if (r0.c == 0) goto L_0x0050;
     */
    @Override // o.setSlingshotDistance
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final boolean a(o.getStrokeColor r5, o.getStrokeColor r6) {
        /*
            r4 = this;
            r0 = 0
            r7 = r0
            r0 = r5
            if (r0 != 0) goto L_0x000c
            r0 = r6
            if (r0 != 0) goto L_0x000c
            r0 = 0
            return r0
        L_0x000c:
            r0 = r5
            if (r0 == 0) goto L_0x002f
            r0 = r6
            if (r0 == 0) goto L_0x002f
            r0 = r6
            java.util.Map<java.lang.String, java.lang.Object> r0 = r0.c
            java.lang.String r1 = "android:visibility:visibility"
            boolean r0 = r0.containsKey(r1)
            r1 = r5
            java.util.Map<java.lang.String, java.lang.Object> r1 = r1.c
            java.lang.String r2 = "android:visibility:visibility"
            boolean r1 = r1.containsKey(r2)
            if (r0 == r1) goto L_0x002f
            r0 = 0
            return r0
        L_0x002f:
            r0 = r5
            r1 = r6
            o.getLocalMatrix$read r0 = b(r0, r1)
            r5 = r0
            r0 = r7
            r8 = r0
            r0 = r5
            boolean r0 = r0.f
            if (r0 == 0) goto L_0x0053
            r0 = r5
            int r0 = r0.e
            if (r0 == 0) goto L_0x0050
            r0 = r7
            r8 = r0
            r0 = r5
            int r0 = r0.c
            if (r0 != 0) goto L_0x0053
        L_0x0050:
            r0 = 1
            r8 = r0
        L_0x0053:
            r0 = r8
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getLocalMatrix.a(o.getStrokeColor, o.getStrokeColor):boolean");
    }

    @Override // o.setSlingshotDistance
    public final String[] a() {
        return i;
    }

    public Animator b(View view, getStrokeColor getstrokecolor) {
        return null;
    }

    @Override // o.setSlingshotDistance
    public final void d(getStrokeColor getstrokecolor) {
        e(getstrokecolor);
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x0169, code lost:
        if (r8.c != false) goto L_0x016c;
     */
    @Override // o.setSlingshotDistance
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final android.animation.Animator e(final android.view.ViewGroup r9, o.getStrokeColor r10, o.getStrokeColor r11) {
        /*
        // Method dump skipped, instructions count: 613
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getLocalMatrix.e(android.view.ViewGroup, o.getStrokeColor, o.getStrokeColor):android.animation.Animator");
    }

    public final int l() {
        return this.m;
    }
}
