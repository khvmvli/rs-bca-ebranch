package o;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
/* loaded from: classes-dex2jar.jar:o/setWeightSum.class */
public class setWeightSum extends ViewGroup {
    private boolean a;
    private int b;
    private Drawable c;
    private int d;
    private int e;
    private int[] f;
    private int[] g;
    private int h;
    private int i;
    private int j;
    private int k;
    private boolean l;
    private float m;
    private int n;

    /* renamed from: o */
    private int f293o;

    /* loaded from: classes-dex2jar.jar:o/setWeightSum$IconCompatParcelizer.class */
    public static class IconCompatParcelizer extends LinearLayout.LayoutParams {
        public IconCompatParcelizer(int i, int i2) {
            super(i, i2);
        }

        public IconCompatParcelizer(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public IconCompatParcelizer(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public setWeightSum(Context context) {
        this(context, null);
    }

    public setWeightSum(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public setWeightSum(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = true;
        this.d = -1;
        this.b = 0;
        this.h = 8388659;
        setIconifiedByDefault seticonifiedbydefault = new setIconifiedByDefault(context, context.obtainStyledAttributes(attributeSet, setHasDecor$MediaBrowserCompat$MediaItem.bl, i, 0));
        findFragmentByWho.e(this, context, setHasDecor$MediaBrowserCompat$MediaItem.bl, attributeSet, seticonifiedbydefault.d, i, 0);
        int i2 = seticonifiedbydefault.d.getInt(setHasDecor$MediaBrowserCompat$MediaItem.bt, -1);
        if (i2 >= 0) {
            setOrientation(i2);
        }
        int i3 = seticonifiedbydefault.d.getInt(setHasDecor$MediaBrowserCompat$MediaItem.bs, -1);
        if (i3 >= 0) {
            setGravity(i3);
        }
        boolean z = seticonifiedbydefault.d.getBoolean(setHasDecor$MediaBrowserCompat$MediaItem.bp, true);
        if (!z) {
            setBaselineAligned(z);
        }
        this.m = seticonifiedbydefault.d.getFloat(setHasDecor$MediaBrowserCompat$MediaItem.br, -1.0f);
        this.d = seticonifiedbydefault.d.getInt(setHasDecor$MediaBrowserCompat$MediaItem.bu, -1);
        this.l = seticonifiedbydefault.d.getBoolean(setHasDecor$MediaBrowserCompat$MediaItem.bv, false);
        setDividerDrawable(seticonifiedbydefault.d(setHasDecor$MediaBrowserCompat$MediaItem.bq));
        this.f293o = seticonifiedbydefault.d.getInt(setHasDecor$MediaBrowserCompat$MediaItem.bx, 0);
        this.j = seticonifiedbydefault.d.getDimensionPixelSize(setHasDecor$MediaBrowserCompat$MediaItem.by, 0);
        seticonifiedbydefault.d.recycle();
    }

    private void b(int i, int i2) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
        for (int i3 = 0; i3 < i; i3++) {
            View c = c(i3);
            if (c.getVisibility() != 8) {
                IconCompatParcelizer iconCompatParcelizer = (IconCompatParcelizer) c.getLayoutParams();
                if (iconCompatParcelizer.height == -1) {
                    int i4 = iconCompatParcelizer.width;
                    iconCompatParcelizer.width = c.getMeasuredWidth();
                    measureChildWithMargins(c, i2, 0, makeMeasureSpec, 0);
                    iconCompatParcelizer.width = i4;
                }
            }
        }
    }

    private void b(View view, int i, int i2, int i3, int i4) {
        view.layout(i, i2, i3 + i, i4 + i2);
    }

    private void e(int i, int i2) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        for (int i3 = 0; i3 < i; i3++) {
            View c = c(i3);
            if (c.getVisibility() != 8) {
                IconCompatParcelizer iconCompatParcelizer = (IconCompatParcelizer) c.getLayoutParams();
                if (iconCompatParcelizer.width == -1) {
                    int i4 = iconCompatParcelizer.height;
                    iconCompatParcelizer.height = c.getMeasuredHeight();
                    measureChildWithMargins(c, makeMeasureSpec, 0, i2, 0);
                    iconCompatParcelizer.height = i4;
                }
            }
        }
    }

    void a(int i, int i2) {
        int i3;
        boolean z;
        int i4;
        int i5;
        boolean z2;
        int i6;
        this.n = 0;
        int g = g();
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int i7 = this.d;
        boolean z3 = this.l;
        float f = 0.0f;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        boolean z4 = false;
        boolean z5 = true;
        boolean z6 = false;
        while (i13 < g) {
            View c = c(i13);
            if (c == null) {
                this.n += e(i13);
            } else if (c.getVisibility() == 8) {
                i13 += d(c, i13);
            } else {
                if (a(i13)) {
                    this.n += this.e;
                }
                IconCompatParcelizer iconCompatParcelizer = (IconCompatParcelizer) c.getLayoutParams();
                f += iconCompatParcelizer.weight;
                if (mode2 == 1073741824 && iconCompatParcelizer.height == 0 && iconCompatParcelizer.weight > 0.0f) {
                    int i14 = this.n;
                    this.n = Math.max(i14, iconCompatParcelizer.topMargin + i14 + iconCompatParcelizer.bottomMargin);
                    z4 = true;
                } else {
                    if (iconCompatParcelizer.height != 0 || iconCompatParcelizer.weight <= 0.0f) {
                        i6 = Integer.MIN_VALUE;
                    } else {
                        iconCompatParcelizer.height = -2;
                        i6 = 0;
                    }
                    e(c, i13, i, 0, i2, f == 0.0f ? this.n : 0);
                    if (i6 != Integer.MIN_VALUE) {
                        iconCompatParcelizer.height = i6;
                    }
                    int measuredHeight = c.getMeasuredHeight();
                    int i15 = this.n;
                    this.n = Math.max(i15, i15 + measuredHeight + iconCompatParcelizer.topMargin + iconCompatParcelizer.bottomMargin + b(c));
                    if (z3) {
                        i9 = Math.max(measuredHeight, i9);
                    }
                }
                if (i7 >= 0 && i7 == i13 + 1) {
                    this.b = this.n;
                }
                if (i13 >= i7 || iconCompatParcelizer.weight <= 0.0f) {
                    if (mode == 1073741824 || iconCompatParcelizer.width != -1) {
                        z2 = false;
                    } else {
                        z2 = true;
                        z6 = true;
                    }
                    int i16 = iconCompatParcelizer.leftMargin + iconCompatParcelizer.rightMargin;
                    int measuredWidth = c.getMeasuredWidth() + i16;
                    i8 = Math.max(i8, measuredWidth);
                    i10 = View.combineMeasuredStates(i10, c.getMeasuredState());
                    z5 = z5 && iconCompatParcelizer.width == -1;
                    if (iconCompatParcelizer.weight > 0.0f) {
                        if (!z2) {
                            i16 = measuredWidth;
                        }
                        i12 = Math.max(i12, i16);
                        i11 = i11;
                    } else {
                        if (!z2) {
                            i16 = measuredWidth;
                        }
                        i11 = Math.max(i11, i16);
                        i12 = i12;
                    }
                    i13 = d(c, i13) + i13;
                } else {
                    throw new RuntimeException("A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex.");
                }
            }
            i13++;
        }
        int i17 = i11;
        if (this.n > 0 && a(g)) {
            this.n += this.e;
        }
        int i18 = g;
        if (z3 && (mode2 == Integer.MIN_VALUE || mode2 == 0)) {
            this.n = 0;
            int i19 = 0;
            while (i19 < i18) {
                View c2 = c(i19);
                if (c2 == null) {
                    this.n += e(i19);
                } else if (c2.getVisibility() == 8) {
                    i19 += d(c2, i19);
                } else {
                    IconCompatParcelizer iconCompatParcelizer2 = (IconCompatParcelizer) c2.getLayoutParams();
                    int i20 = this.n;
                    this.n = Math.max(i20, i20 + i9 + iconCompatParcelizer2.topMargin + iconCompatParcelizer2.bottomMargin + b(c2));
                }
                i19++;
            }
        }
        int paddingTop = this.n + getPaddingTop() + getPaddingBottom();
        this.n = paddingTop;
        int i21 = i10;
        int resolveSizeAndState = View.resolveSizeAndState(Math.max(paddingTop, getSuggestedMinimumHeight()), i2, 0);
        int i22 = (16777215 & resolveSizeAndState) - this.n;
        if (z4 || (i22 != 0 && f > 0.0f)) {
            float f2 = this.m;
            if (f2 > 0.0f) {
                f = f2;
            }
            this.n = 0;
            boolean z7 = z5;
            int i23 = i8;
            i3 = resolveSizeAndState;
            for (int i24 = 0; i24 < i18; i24++) {
                View c3 = c(i24);
                if (c3.getVisibility() != 8) {
                    IconCompatParcelizer iconCompatParcelizer3 = (IconCompatParcelizer) c3.getLayoutParams();
                    float f3 = iconCompatParcelizer3.weight;
                    if (f3 > 0.0f) {
                        int i25 = (int) ((((float) i22) * f3) / f);
                        i22 -= i25;
                        int childMeasureSpec = getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + iconCompatParcelizer3.leftMargin + iconCompatParcelizer3.rightMargin, iconCompatParcelizer3.width);
                        if (iconCompatParcelizer3.height == 0 && mode2 == 1073741824) {
                            c3.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(i25 > 0 ? i25 : 0, 1073741824));
                        } else {
                            int measuredHeight2 = c3.getMeasuredHeight() + i25;
                            int i26 = measuredHeight2;
                            if (measuredHeight2 < 0) {
                                i26 = 0;
                            }
                            c3.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(i26, 1073741824));
                        }
                        i21 = View.combineMeasuredStates(i21, c3.getMeasuredState() & -256);
                        f -= f3;
                    }
                    int i27 = iconCompatParcelizer3.leftMargin + iconCompatParcelizer3.rightMargin;
                    int measuredWidth2 = c3.getMeasuredWidth() + i27;
                    i23 = Math.max(i23, measuredWidth2);
                    i17 = Math.max(i17, mode != 1073741824 && iconCompatParcelizer3.width == -1 ? i27 : measuredWidth2);
                    z7 = z7 && iconCompatParcelizer3.width == -1;
                    int i28 = this.n;
                    this.n = Math.max(i28, c3.getMeasuredHeight() + i28 + iconCompatParcelizer3.topMargin + iconCompatParcelizer3.bottomMargin + b(c3));
                }
            }
            this.n += getPaddingTop() + getPaddingBottom();
            i18 = i18;
            z = z7;
            i5 = i21;
            i4 = i23;
            i4 = i17;
        } else {
            i4 = Math.max(i17, i12);
            if (z3 && mode2 != 1073741824) {
                for (int i29 = 0; i29 < i18; i29++) {
                    View c4 = c(i29);
                    if (!(c4 == null || c4.getVisibility() == 8 || ((IconCompatParcelizer) c4.getLayoutParams()).weight <= 0.0f)) {
                        c4.measure(View.MeasureSpec.makeMeasureSpec(c4.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(i9, 1073741824));
                    }
                }
            }
            i5 = i21;
            i4 = i8;
            z = z5;
            i3 = resolveSizeAndState;
        }
        if (z || mode == 1073741824) {
        }
        setMeasuredDimension(View.resolveSizeAndState(Math.max(i4 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i, i5), i3);
        if (z6) {
            e(i18, i2);
        }
    }

    void a(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        boolean d = setSubmitButtonEnabled.d(this);
        int paddingTop = getPaddingTop();
        int i8 = i4 - i2;
        int paddingBottom = getPaddingBottom();
        int paddingBottom2 = getPaddingBottom();
        int g = g();
        int i9 = this.h;
        int i10 = i9 & 112;
        boolean z = this.a;
        int[] iArr = this.g;
        int[] iArr2 = this.f;
        int c = onGetLayoutInflater.c(i9 & 8388615, findFragmentByWho.k(this));
        int paddingLeft = c != 1 ? c != 5 ? getPaddingLeft() : ((getPaddingLeft() + i3) - i) - this.n : getPaddingLeft() + (((i3 - i) - this.n) / 2);
        if (d) {
            i6 = g - 1;
            i5 = -1;
        } else {
            i6 = 0;
            i5 = 1;
        }
        int i11 = 0;
        while (i11 < g) {
            int i12 = i6 + (i5 * i11);
            View c2 = c(i12);
            if (c2 == null) {
                paddingLeft += e(i12);
            } else if (c2.getVisibility() != 8) {
                int measuredWidth = c2.getMeasuredWidth();
                int measuredHeight = c2.getMeasuredHeight();
                IconCompatParcelizer iconCompatParcelizer = (IconCompatParcelizer) c2.getLayoutParams();
                int baseline = (!z || iconCompatParcelizer.height == -1) ? -1 : c2.getBaseline();
                int i13 = iconCompatParcelizer.gravity;
                i10 = i13;
                if (i13 < 0) {
                }
                int i14 = i10 & 112;
                if (i14 == 16) {
                    i7 = ((((((i8 - paddingTop) - paddingBottom2) - measuredHeight) / 2) + paddingTop) + iconCompatParcelizer.topMargin) - iconCompatParcelizer.bottomMargin;
                } else if (i14 == 48) {
                    int i15 = iconCompatParcelizer.topMargin + paddingTop;
                    i7 = i15;
                    if (baseline != -1) {
                        i7 = i15 + (iArr[1] - baseline);
                    }
                } else if (i14 != 80) {
                    i7 = paddingTop;
                } else {
                    int i16 = ((i8 - paddingBottom) - measuredHeight) - iconCompatParcelizer.bottomMargin;
                    i7 = i16;
                    if (baseline != -1) {
                        i7 = i16 - (iArr2[2] - (c2.getMeasuredHeight() - baseline));
                    }
                }
                int i17 = paddingLeft;
                if (a(i12)) {
                    i17 = paddingLeft + this.i;
                }
                int i18 = iconCompatParcelizer.leftMargin + i17;
                b(c2, i18 + e(c2), i7, measuredWidth, measuredHeight);
                int i19 = iconCompatParcelizer.rightMargin;
                int b = b(c2);
                i11 += d(c2, i12);
                paddingLeft = i18 + measuredWidth + i19 + b;
            }
            i11++;
        }
    }

    protected boolean a(int i) {
        int i2;
        boolean z = true;
        boolean z2 = true;
        boolean z3 = true;
        if (i == 0) {
            if ((this.f293o & 1) == 0) {
                z3 = false;
            }
            return z3;
        } else if (i == getChildCount()) {
            if ((this.f293o & 4) == 0) {
                z = false;
            }
            return z;
        } else {
            if ((this.f293o & 2) != 0) {
                do {
                    i2 = i - 1;
                    if (i2 >= 0) {
                        i = i2;
                    }
                } while (getChildAt(i2).getVisibility() == 8);
                return z2;
            }
            z2 = false;
            return z2;
        }
    }

    int b(View view) {
        return 0;
    }

    View c(int i) {
        return getChildAt(i);
    }

    /* renamed from: c */
    public IconCompatParcelizer generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new IconCompatParcelizer(layoutParams);
    }

    void c(int i, int i2) {
        boolean z;
        int i3;
        int i4;
        int baseline;
        boolean z2;
        int baseline2;
        int i5;
        this.n = 0;
        int g = g();
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        if (this.g == null || this.f == null) {
            this.g = new int[4];
            this.f = new int[4];
        }
        int[] iArr = this.g;
        int[] iArr2 = this.f;
        iArr[3] = -1;
        iArr[2] = -1;
        iArr[1] = -1;
        iArr[0] = -1;
        iArr2[3] = -1;
        iArr2[2] = -1;
        iArr2[1] = -1;
        iArr2[0] = -1;
        boolean z3 = this.a;
        boolean z4 = this.l;
        int i6 = 1073741824;
        boolean z5 = mode == 1073741824;
        float f = 0.0f;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        boolean z6 = true;
        int i10 = 0;
        int i11 = 0;
        boolean z7 = false;
        int i12 = 0;
        boolean z8 = false;
        while (i7 < g) {
            View c = c(i7);
            if (c == null) {
                this.n += e(i7);
            } else if (c.getVisibility() == 8) {
                i7 += d(c, i7);
            } else {
                if (a(i7)) {
                    this.n += this.i;
                }
                IconCompatParcelizer iconCompatParcelizer = (IconCompatParcelizer) c.getLayoutParams();
                f += iconCompatParcelizer.weight;
                if (mode == i6 && iconCompatParcelizer.width == 0 && iconCompatParcelizer.weight > 0.0f) {
                    if (z5) {
                        this.n += iconCompatParcelizer.leftMargin + iconCompatParcelizer.rightMargin;
                    } else {
                        int i13 = this.n;
                        this.n = Math.max(i13, iconCompatParcelizer.leftMargin + i13 + iconCompatParcelizer.rightMargin);
                    }
                    if (z3) {
                        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                        c.measure(makeMeasureSpec, makeMeasureSpec);
                    } else {
                        z7 = true;
                    }
                } else {
                    if (iconCompatParcelizer.width != 0 || iconCompatParcelizer.weight <= 0.0f) {
                        i5 = Integer.MIN_VALUE;
                    } else {
                        iconCompatParcelizer.width = -2;
                        i5 = 0;
                    }
                    e(c, i7, i, f == 0.0f ? this.n : 0, i2, 0);
                    if (i5 != Integer.MIN_VALUE) {
                        iconCompatParcelizer.width = i5;
                    }
                    int measuredWidth = c.getMeasuredWidth();
                    if (z5) {
                        this.n += iconCompatParcelizer.leftMargin + measuredWidth + iconCompatParcelizer.rightMargin + b(c);
                    } else {
                        int i14 = this.n;
                        this.n = Math.max(i14, i14 + measuredWidth + iconCompatParcelizer.leftMargin + iconCompatParcelizer.rightMargin + b(c));
                    }
                    if (z4) {
                        i12 = Math.max(measuredWidth, i12);
                    }
                }
                i6 = 1073741824;
                if (mode2 == 1073741824 || iconCompatParcelizer.height != -1) {
                    z2 = false;
                } else {
                    z2 = true;
                    z8 = true;
                }
                int i15 = iconCompatParcelizer.topMargin + iconCompatParcelizer.bottomMargin;
                int measuredHeight = c.getMeasuredHeight() + i15;
                i8 = View.combineMeasuredStates(i8, c.getMeasuredState());
                if (z3 && (baseline2 = c.getBaseline()) != -1) {
                    int i16 = ((((iconCompatParcelizer.gravity < 0 ? this.h : iconCompatParcelizer.gravity) & 112) >> 4) & -2) >> 1;
                    iArr[i16] = Math.max(iArr[i16], baseline2);
                    iArr2[i16] = Math.max(iArr2[i16], measuredHeight - baseline2);
                }
                i9 = Math.max(i9, measuredHeight);
                z6 = z6 && iconCompatParcelizer.height == -1;
                if (iconCompatParcelizer.weight > 0.0f) {
                    if (!z2) {
                        i15 = measuredHeight;
                    }
                    i11 = Math.max(i11, i15);
                } else {
                    if (!z2) {
                        i15 = measuredHeight;
                    }
                    i10 = Math.max(i10, i15);
                    i11 = i11;
                }
                i7 = d(c, i7) + i7;
            }
            i7++;
        }
        if (this.n > 0 && a(g)) {
            this.n += this.i;
        }
        int i17 = iArr[1];
        int max = (i17 == -1 && iArr[0] == -1 && iArr[2] == -1 && iArr[3] == -1) ? i9 : Math.max(i9, Math.max(iArr[3], Math.max(iArr[0], Math.max(i17, iArr[2]))) + Math.max(iArr2[3], Math.max(iArr2[0], Math.max(iArr2[1], iArr2[2]))));
        if (z4 && (mode == Integer.MIN_VALUE || mode == 0)) {
            this.n = 0;
            int i18 = 0;
            while (i18 < g) {
                View c2 = c(i18);
                if (c2 == null) {
                    this.n += e(i18);
                } else if (c2.getVisibility() == 8) {
                    i18 += d(c2, i18);
                } else {
                    IconCompatParcelizer iconCompatParcelizer2 = (IconCompatParcelizer) c2.getLayoutParams();
                    if (z5) {
                        this.n += iconCompatParcelizer2.leftMargin + i12 + iconCompatParcelizer2.rightMargin + b(c2);
                    } else {
                        int i19 = this.n;
                        this.n = Math.max(i19, i19 + i12 + iconCompatParcelizer2.leftMargin + iconCompatParcelizer2.rightMargin + b(c2));
                    }
                }
                i18++;
            }
        }
        int paddingLeft = this.n + getPaddingLeft() + getPaddingRight();
        this.n = paddingLeft;
        int resolveSizeAndState = View.resolveSizeAndState(Math.max(paddingLeft, getSuggestedMinimumWidth()), i, 0);
        int i20 = (16777215 & resolveSizeAndState) - this.n;
        if (z7 || (i20 != 0 && f > 0.0f)) {
            float f2 = this.m;
            if (f2 > 0.0f) {
                f = f2;
            }
            iArr[3] = -1;
            iArr[2] = -1;
            iArr[1] = -1;
            iArr[0] = -1;
            iArr2[3] = -1;
            iArr2[2] = -1;
            iArr2[1] = -1;
            iArr2[0] = -1;
            this.n = 0;
            int i21 = -1;
            boolean z9 = z6;
            int i22 = i8;
            int i23 = i20;
            int i24 = i10;
            for (int i25 = 0; i25 < g; i25++) {
                View c3 = c(i25);
                if (!(c3 == null || c3.getVisibility() == 8)) {
                    IconCompatParcelizer iconCompatParcelizer3 = (IconCompatParcelizer) c3.getLayoutParams();
                    float f3 = iconCompatParcelizer3.weight;
                    if (f3 > 0.0f) {
                        int i26 = (int) ((((float) i23) * f3) / f);
                        int childMeasureSpec = getChildMeasureSpec(i2, getPaddingTop() + getPaddingBottom() + iconCompatParcelizer3.topMargin + iconCompatParcelizer3.bottomMargin, iconCompatParcelizer3.height);
                        if (iconCompatParcelizer3.width == 0 && mode == 1073741824) {
                            c3.measure(View.MeasureSpec.makeMeasureSpec(i26 > 0 ? i26 : 0, 1073741824), childMeasureSpec);
                        } else {
                            int measuredWidth2 = c3.getMeasuredWidth() + i26;
                            int i27 = measuredWidth2;
                            if (measuredWidth2 < 0) {
                                i27 = 0;
                            }
                            c3.measure(View.MeasureSpec.makeMeasureSpec(i27, 1073741824), childMeasureSpec);
                        }
                        i22 = View.combineMeasuredStates(i22, c3.getMeasuredState() & -16777216);
                        f -= f3;
                        i23 -= i26;
                    }
                    if (z5) {
                        this.n += c3.getMeasuredWidth() + iconCompatParcelizer3.leftMargin + iconCompatParcelizer3.rightMargin + b(c3);
                    } else {
                        int i28 = this.n;
                        this.n = Math.max(i28, c3.getMeasuredWidth() + i28 + iconCompatParcelizer3.leftMargin + iconCompatParcelizer3.rightMargin + b(c3));
                    }
                    boolean z10 = mode2 != 1073741824 && iconCompatParcelizer3.height == -1;
                    int i29 = iconCompatParcelizer3.topMargin + iconCompatParcelizer3.bottomMargin;
                    int measuredHeight2 = c3.getMeasuredHeight() + i29;
                    i21 = Math.max(i21, measuredHeight2);
                    i24 = Math.max(i24, z10 ? i29 : measuredHeight2);
                    z9 = z9 && iconCompatParcelizer3.height == -1;
                    if (z3 && (baseline = c3.getBaseline()) != -1) {
                        int i30 = ((((iconCompatParcelizer3.gravity < 0 ? this.h : iconCompatParcelizer3.gravity) & 112) >> 4) & -2) >> 1;
                        iArr[i30] = Math.max(iArr[i30], baseline);
                        iArr2[i30] = Math.max(iArr2[i30], measuredHeight2 - baseline);
                    }
                }
            }
            this.n += getPaddingLeft() + getPaddingRight();
            int i31 = iArr[1];
            max = (i31 == -1 && iArr[0] == -1 && iArr[2] == -1 && iArr[3] == -1) ? i21 : Math.max(i21, Math.max(iArr[3], Math.max(iArr[0], Math.max(i31, iArr[2]))) + Math.max(iArr2[3], Math.max(iArr2[0], Math.max(iArr2[1], iArr2[2]))));
            resolveSizeAndState = resolveSizeAndState;
            i3 = g;
            z = z9;
            i4 = i22;
            max = i24;
        } else {
            max = Math.max(i10, i11);
            if (z4 && mode != 1073741824) {
                for (int i32 = 0; i32 < g; i32++) {
                    View c4 = c(i32);
                    if (!(c4 == null || c4.getVisibility() == 8 || ((IconCompatParcelizer) c4.getLayoutParams()).weight <= 0.0f)) {
                        c4.measure(View.MeasureSpec.makeMeasureSpec(i12, 1073741824), View.MeasureSpec.makeMeasureSpec(c4.getMeasuredHeight(), 1073741824));
                    }
                }
            }
            i3 = g;
            i4 = i8;
            z = z6;
        }
        if (z || mode2 == 1073741824) {
        }
        setMeasuredDimension(resolveSizeAndState | (-16777216 & i4), View.resolveSizeAndState(Math.max(max + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i2, i4 << 16));
        if (z8) {
            b(i3, i);
        }
    }

    void c(Canvas canvas) {
        int i;
        int i2;
        int i3;
        int g = g();
        boolean d = setSubmitButtonEnabled.d(this);
        for (int i4 = 0; i4 < g; i4++) {
            View c = c(i4);
            if (!(c == null || c.getVisibility() == 8 || !a(i4))) {
                IconCompatParcelizer iconCompatParcelizer = (IconCompatParcelizer) c.getLayoutParams();
                d(canvas, d ? c.getRight() + iconCompatParcelizer.rightMargin : (c.getLeft() - iconCompatParcelizer.leftMargin) - this.i);
            }
        }
        if (a(g)) {
            View c2 = c(g - 1);
            if (c2 != null) {
                IconCompatParcelizer iconCompatParcelizer2 = (IconCompatParcelizer) c2.getLayoutParams();
                if (d) {
                    i3 = c2.getLeft() - iconCompatParcelizer2.leftMargin;
                    i2 = this.i;
                    i = i3 - i2;
                    d(canvas, i);
                }
                i = c2.getRight() + iconCompatParcelizer2.rightMargin;
                d(canvas, i);
            } else if (d) {
                i = getPaddingLeft();
                d(canvas, i);
            } else {
                i3 = getWidth() - getPaddingRight();
                i2 = this.i;
                i = i3 - i2;
                d(canvas, i);
            }
        }
    }

    void c(Canvas canvas, int i) {
        this.c.setBounds(getPaddingLeft() + this.j, i, (getWidth() - getPaddingRight()) - this.j, this.e + i);
        this.c.draw(canvas);
    }

    /* renamed from: c_ */
    public IconCompatParcelizer generateDefaultLayoutParams() {
        int i = this.k;
        if (i == 0) {
            return new IconCompatParcelizer(-2, -2);
        }
        if (i == 1) {
            return new IconCompatParcelizer(-1, -2);
        }
        return null;
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof IconCompatParcelizer;
    }

    int d(View view, int i) {
        return 0;
    }

    /* renamed from: d */
    public IconCompatParcelizer generateLayoutParams(AttributeSet attributeSet) {
        return new IconCompatParcelizer(getContext(), attributeSet);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0122  */
    /* Code decompiled incorrectly, please refer to instructions dump */
    void d(int r8, int r9, int r10, int r11) {
        /*
        // Method dump skipped, instructions count: 372
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setWeightSum.d(int, int, int, int):void");
    }

    void d(Canvas canvas) {
        int g = g();
        for (int i = 0; i < g; i++) {
            View c = c(i);
            if (!(c == null || c.getVisibility() == 8 || !a(i))) {
                c(canvas, (c.getTop() - ((IconCompatParcelizer) c.getLayoutParams()).topMargin) - this.e);
            }
        }
        if (a(g)) {
            View c2 = c(g - 1);
            c(canvas, c2 == null ? (getHeight() - getPaddingBottom()) - this.e : c2.getBottom() + ((IconCompatParcelizer) c2.getLayoutParams()).bottomMargin);
        }
    }

    void d(Canvas canvas, int i) {
        this.c.setBounds(i, getPaddingTop() + this.j, this.i + i, (getHeight() - getPaddingBottom()) - this.j);
        this.c.draw(canvas);
    }

    int e(int i) {
        return 0;
    }

    int e(View view) {
        return 0;
    }

    void e(View view, int i, int i2, int i3, int i4, int i5) {
        measureChildWithMargins(view, i2, i3, i4, i5);
    }

    public int f() {
        return this.h;
    }

    int g() {
        return getChildCount();
    }

    @Override // android.view.View
    public int getBaseline() {
        if (this.d < 0) {
            return getBaseline();
        }
        int childCount = getChildCount();
        int i = this.d;
        if (childCount > i) {
            View childAt = getChildAt(i);
            int baseline = childAt.getBaseline();
            if (baseline != -1) {
                int i2 = this.b;
                int i3 = i2;
                if (this.k == 1) {
                    int i4 = this.h & 112;
                    i3 = i2;
                    if (i4 != 48) {
                        i3 = i4 != 16 ? i4 != 80 ? i2 : ((getBottom() - getTop()) - getPaddingBottom()) - this.n : i2 + (((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.n) / 2);
                    }
                }
                return i3 + ((IconCompatParcelizer) childAt.getLayoutParams()).topMargin + baseline;
            } else if (this.d == 0) {
                return -1;
            } else {
                throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
            }
        } else {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
    }

    public int h() {
        return this.i;
    }

    public Drawable j() {
        return this.c;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        if (this.c != null) {
            if (this.k == 1) {
                d(canvas);
            } else {
                c(canvas);
            }
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.k == 1) {
            d(i, i2, i3, i4);
        } else {
            a(i, i2, i3, i4);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        if (this.k == 1) {
            a(i, i2);
        } else {
            c(i, i2);
        }
    }

    public void setBaselineAligned(boolean z) {
        this.a = z;
    }

    public void setBaselineAlignedChildIndex(int i) {
        if (i < 0 || i >= getChildCount()) {
            StringBuilder sb = new StringBuilder("base aligned child index out of range (0, ");
            sb.append(getChildCount());
            sb.append(")");
            throw new IllegalArgumentException(sb.toString());
        }
        this.d = i;
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable != this.c) {
            this.c = drawable;
            boolean z = false;
            if (drawable != null) {
                this.i = drawable.getIntrinsicWidth();
                this.e = drawable.getIntrinsicHeight();
            } else {
                this.i = 0;
                this.e = 0;
            }
            if (drawable == null) {
                z = true;
            }
            setWillNotDraw(z);
            requestLayout();
        }
    }

    public void setDividerPadding(int i) {
        this.j = i;
    }

    public void setGravity(int i) {
        if (this.h != i) {
            int i2 = i;
            if ((8388615 & i) == 0) {
                i2 = i | 8388611;
            }
            int i3 = i2;
            if ((i2 & 112) == 0) {
                i3 = i2 | 48;
            }
            this.h = i3;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i) {
        int i2 = i & 8388615;
        int i3 = this.h;
        if ((8388615 & i3) != i2) {
            this.h = i2 | (-8388616 & i3);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z) {
        this.l = z;
    }

    public void setOrientation(int i) {
        if (this.k != i) {
            this.k = i;
            requestLayout();
        }
    }

    public void setShowDividers(int i) {
        if (i != this.f293o) {
            requestLayout();
        }
        this.f293o = i;
    }

    public void setVerticalGravity(int i) {
        int i2 = i & 112;
        int i3 = this.h;
        if ((i3 & 112) != i2) {
            this.h = i2 | (i3 & -113);
            requestLayout();
        }
    }

    public void setWeightSum(float f) {
        this.m = Math.max(0.0f, f);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }
}
