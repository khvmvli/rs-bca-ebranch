package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import o.setThreshold;
/* loaded from: classes-dex2jar.jar:o/setSplitTrack.class */
public class setSplitTrack extends FrameLayout {
    public static final setTextOn c;
    private static final int[] j = {16842801};
    final Rect a;
    public final setTextOff b;
    public boolean d;
    public boolean e;
    int f;
    int g;
    final Rect i;

    static {
        setThumbDrawable setthumbdrawable = new setThumbDrawable();
        c = setthumbdrawable;
        setthumbdrawable.a();
    }

    public setSplitTrack(Context context) {
        this(context, null);
    }

    public setSplitTrack(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, setThreshold.RemoteActionCompatParcelizer.d);
    }

    public setSplitTrack(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ColorStateList colorStateList;
        Rect rect = new Rect();
        this.a = rect;
        this.i = new Rect();
        AnonymousClass4 r0 = new setTextOff() { // from class: o.setSplitTrack.4
            private Drawable c;

            @Override // o.setTextOff
            public final View a() {
                return setSplitTrack.this;
            }

            @Override // o.setTextOff
            public final void a(int i2, int i3, int i4, int i5) {
                setSplitTrack.this.i.set(i2, i3, i4, i5);
                setSplitTrack setsplittrack = setSplitTrack.this;
                setsplittrack.setPadding(i2 + setsplittrack.a.left, i3 + setSplitTrack.this.a.top, i4 + setSplitTrack.this.a.right, i5 + setSplitTrack.this.a.bottom);
            }

            @Override // o.setTextOff
            public final Drawable b() {
                return this.c;
            }

            @Override // o.setTextOff
            public final void b(Drawable drawable) {
                this.c = drawable;
                setSplitTrack.this.setBackgroundDrawable(drawable);
            }

            @Override // o.setTextOff
            public final boolean c() {
                return setSplitTrack.this.e;
            }

            @Override // o.setTextOff
            public final boolean e() {
                return setSplitTrack.this.d;
            }
        };
        this.b = r0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, setThreshold.IconCompatParcelizer.c, i, setThreshold.read.c);
        if (obtainStyledAttributes.hasValue(setThreshold.IconCompatParcelizer.e)) {
            colorStateList = obtainStyledAttributes.getColorStateList(setThreshold.IconCompatParcelizer.e);
        } else {
            TypedArray obtainStyledAttributes2 = getContext().obtainStyledAttributes(j);
            int color = obtainStyledAttributes2.getColor(0, 0);
            obtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color, fArr);
            colorStateList = ColorStateList.valueOf(fArr[2] > 0.5f ? getResources().getColor(setThreshold$MediaBrowserCompat$CustomActionResultReceiver.a) : getResources().getColor(setThreshold$MediaBrowserCompat$CustomActionResultReceiver.c));
        }
        float dimension = obtainStyledAttributes.getDimension(setThreshold.IconCompatParcelizer.b, 0.0f);
        float dimension2 = obtainStyledAttributes.getDimension(setThreshold.IconCompatParcelizer.g, 0.0f);
        float dimension3 = obtainStyledAttributes.getDimension(setThreshold.IconCompatParcelizer.f, 0.0f);
        this.d = obtainStyledAttributes.getBoolean(setThreshold.IconCompatParcelizer.i, false);
        this.e = obtainStyledAttributes.getBoolean(setThreshold.IconCompatParcelizer.j, true);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(setThreshold.IconCompatParcelizer.h, 0);
        rect.left = obtainStyledAttributes.getDimensionPixelSize(setThreshold.IconCompatParcelizer.l, dimensionPixelSize);
        rect.top = obtainStyledAttributes.getDimensionPixelSize(setThreshold.IconCompatParcelizer.f280o, dimensionPixelSize);
        rect.right = obtainStyledAttributes.getDimensionPixelSize(setThreshold.IconCompatParcelizer.n, dimensionPixelSize);
        rect.bottom = obtainStyledAttributes.getDimensionPixelSize(setThreshold.IconCompatParcelizer.k, dimensionPixelSize);
        dimension3 = dimension2 > dimension3 ? dimension2 : dimension3;
        this.g = obtainStyledAttributes.getDimensionPixelSize(setThreshold.IconCompatParcelizer.d, 0);
        this.f = obtainStyledAttributes.getDimensionPixelSize(setThreshold.IconCompatParcelizer.a, 0);
        obtainStyledAttributes.recycle();
        c.a(r0, context, colorStateList, dimension, dimension2, dimension3);
    }

    public final float A_() {
        return c.b(this.b);
    }

    public final boolean f() {
        return this.e;
    }

    public final boolean g() {
        return this.d;
    }

    public final float h() {
        return c.a(this.b);
    }

    public float i() {
        return c.f(this.b);
    }

    public int j() {
        return this.a.top;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0052, code lost:
        if (r0 == 1073741824) goto L_0x0055;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001f, code lost:
        if (r0 == 1073741824) goto L_0x0022;
     */
    @Override // android.widget.FrameLayout, android.view.View
    /* Code decompiled incorrectly, please refer to instructions dump */
    public void onMeasure(int r5, int r6) {
        /*
            r4 = this;
            o.setTextOn r0 = o.setSplitTrack.c
            r7 = r0
            r0 = r7
            boolean r0 = r0 instanceof o.setThumbDrawable
            if (r0 != 0) goto L_0x0079
            r0 = r5
            int r0 = android.view.View.MeasureSpec.getMode(r0)
            r8 = r0
            r0 = r8
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 == r1) goto L_0x0022
            r0 = r5
            r9 = r0
            r0 = r8
            r1 = 1073741824(0x40000000, float:2.0)
            if (r0 != r1) goto L_0x003f
        L_0x0022:
            r0 = r7
            r1 = r4
            o.setTextOff r1 = r1.b
            float r0 = r0.e(r1)
            double r0 = (double) r0
            double r0 = java.lang.Math.ceil(r0)
            int r0 = (int) r0
            r1 = r5
            int r1 = android.view.View.MeasureSpec.getSize(r1)
            int r0 = java.lang.Math.max(r0, r1)
            r1 = r8
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r1)
            r9 = r0
        L_0x003f:
            r0 = r6
            int r0 = android.view.View.MeasureSpec.getMode(r0)
            r8 = r0
            r0 = r8
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 == r1) goto L_0x0055
            r0 = r6
            r5 = r0
            r0 = r8
            r1 = 1073741824(0x40000000, float:2.0)
            if (r0 != r1) goto L_0x0071
        L_0x0055:
            r0 = r7
            r1 = r4
            o.setTextOff r1 = r1.b
            float r0 = r0.d(r1)
            double r0 = (double) r0
            double r0 = java.lang.Math.ceil(r0)
            int r0 = (int) r0
            r1 = r6
            int r1 = android.view.View.MeasureSpec.getSize(r1)
            int r0 = java.lang.Math.max(r0, r1)
            r1 = r8
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r1)
            r5 = r0
        L_0x0071:
            r0 = r4
            r1 = r9
            r2 = r5
            r0.onMeasure(r1, r2)
            return
        L_0x0079:
            r0 = r4
            r1 = r5
            r2 = r6
            r0.onMeasure(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setSplitTrack.onMeasure(int, int):void");
    }

    public void setCardBackgroundColor(int i) {
        c.e(this.b, ColorStateList.valueOf(i));
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        c.e(this.b, colorStateList);
    }

    public void setCardElevation(float f) {
        c.e(this.b, f);
    }

    public void setContentPadding(int i, int i2, int i3, int i4) {
        this.a.set(i, i2, i3, i4);
        c.i(this.b);
    }

    public void setMaxCardElevation(float f) {
        c.b(this.b, f);
    }

    @Override // android.view.View
    public void setMinimumHeight(int i) {
        this.f = i;
        setMinimumHeight(i);
    }

    @Override // android.view.View
    public void setMinimumWidth(int i) {
        this.g = i;
        setMinimumWidth(i);
    }

    @Override // android.view.View
    public void setPadding(int i, int i2, int i3, int i4) {
    }

    @Override // android.view.View
    public void setPaddingRelative(int i, int i2, int i3, int i4) {
    }

    public void setPreventCornerOverlap(boolean z) {
        if (z != this.e) {
            this.e = z;
            c.j(this.b);
        }
    }

    public void setRadius(float f) {
        c.a(this.b, f);
    }

    public void setUseCompatPadding(boolean z) {
        if (this.d != z) {
            this.d = z;
            c.h(this.b);
        }
    }

    public ColorStateList w_() {
        return c.c(this.b);
    }

    public int x_() {
        return this.a.bottom;
    }

    public int y_() {
        return this.a.left;
    }

    public int z_() {
        return this.a.right;
    }
}
