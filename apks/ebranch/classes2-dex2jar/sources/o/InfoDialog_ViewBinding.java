package o;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Build;
import android.util.Log;
import android.util.StateSet;
/* loaded from: classes2-dex2jar.jar:o/InfoDialog_ViewBinding.class */
public final class InfoDialog_ViewBinding {
    public static final boolean c = true;
    private static final int[] g = {16842919};
    private static final int[] b = {16843623, 16842908};
    private static final int[] a = {16842908};
    private static final int[] f = {16843623};

    /* renamed from: o  reason: collision with root package name */
    private static final int[] f33o = {16842913, 16842919};
    private static final int[] j = {16842913, 16843623, 16842908};
    private static final int[] i = {16842913, 16842908};
    private static final int[] h = {16842913, 16843623};
    private static final int[] m = {16842913};
    private static final int[] d = {16842910, 16842919};
    static final String e = "RippleUtils";

    public static ColorStateList d(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return ColorStateList.valueOf(0);
        }
        if (Build.VERSION.SDK_INT >= 22 && Build.VERSION.SDK_INT <= 27 && Color.alpha(colorStateList.getDefaultColor()) == 0 && Color.alpha(colorStateList.getColorForState(d, 0)) != 0) {
            Log.w(e, "Use a non-transparent color for the default color as it will be used to finish ripple animations.");
        }
        return colorStateList;
    }

    public static boolean d(int[] iArr) {
        boolean z = false;
        boolean z2 = false;
        for (int i2 : iArr) {
            if (i2 == 16842910) {
                z = true;
            } else if (i2 == 16842908 || i2 == 16842919 || i2 == 16843623) {
                z2 = true;
            }
        }
        boolean z3 = false;
        if (z) {
            z3 = false;
            if (z2) {
                z3 = true;
            }
        }
        return z3;
    }

    private static int e(ColorStateList colorStateList, int[] iArr) {
        int colorForState = colorStateList != null ? colorStateList.getColorForState(iArr, colorStateList.getDefaultColor()) : 0;
        int i2 = colorForState;
        if (c) {
            i2 = isRound.b(colorForState, Math.min(Color.alpha(colorForState) << 1, 255));
        }
        return i2;
    }

    public static ColorStateList e(ColorStateList colorStateList) {
        if (c) {
            int[] iArr = m;
            int e2 = e(colorStateList, f33o);
            return new ColorStateList(new int[][]{iArr, StateSet.NOTHING}, new int[]{e2, e(colorStateList, g)});
        }
        int[] iArr2 = f33o;
        int e3 = e(colorStateList, iArr2);
        int[] iArr3 = j;
        int e4 = e(colorStateList, iArr3);
        int[] iArr4 = i;
        int e5 = e(colorStateList, iArr4);
        int[] iArr5 = h;
        int e6 = e(colorStateList, iArr5);
        int[] iArr6 = m;
        int[] iArr7 = g;
        int e7 = e(colorStateList, iArr7);
        int[] iArr8 = b;
        int e8 = e(colorStateList, iArr8);
        int[] iArr9 = a;
        int e9 = e(colorStateList, iArr9);
        int[] iArr10 = f;
        return new ColorStateList(new int[][]{iArr2, iArr3, iArr4, iArr5, iArr6, iArr7, iArr8, iArr9, iArr10, StateSet.NOTHING}, new int[]{e3, e4, e5, e6, 0, e7, e8, e9, e(colorStateList, iArr10), 0});
    }
}
