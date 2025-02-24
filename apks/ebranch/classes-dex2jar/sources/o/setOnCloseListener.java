package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
/* loaded from: classes-dex2jar.jar:o/setOnCloseListener.class */
public final class setOnCloseListener {
    private static final ThreadLocal<TypedValue> f = new ThreadLocal<>();
    static final int[] b = {-16842910};
    static final int[] a = {16842908};
    static final int[] d = {16843518};
    static final int[] j = {16842919};
    static final int[] c = {16842912};
    static final int[] i = {16842913};
    static final int[] g = {-16842919, -16842908};
    static final int[] e = new int[0];
    private static final int[] h = new int[1];

    public static int a(Context context, int i2) {
        int[] iArr = h;
        iArr[0] = i2;
        setIconifiedByDefault seticonifiedbydefault = new setIconifiedByDefault(context, context.obtainStyledAttributes((AttributeSet) null, iArr));
        try {
            return seticonifiedbydefault.d.getColor(0, 0);
        } finally {
            seticonifiedbydefault.d.recycle();
        }
    }

    public static int c(Context context, int i2) {
        ColorStateList e2 = e(context, i2);
        if (e2 != null && e2.isStateful()) {
            return e2.getColorForState(b, e2.getDefaultColor());
        }
        ThreadLocal<TypedValue> threadLocal = f;
        TypedValue typedValue = threadLocal.get();
        TypedValue typedValue2 = typedValue;
        if (typedValue == null) {
            typedValue2 = new TypedValue();
            threadLocal.set(typedValue2);
        }
        context.getTheme().resolveAttribute(16842803, typedValue2, true);
        float f2 = typedValue2.getFloat();
        int a2 = a(context, i2);
        return isRound.b(a2, Math.round(((float) Color.alpha(a2)) * f2));
    }

    public static ColorStateList e(Context context, int i2) {
        int[] iArr = h;
        iArr[0] = i2;
        setIconifiedByDefault seticonifiedbydefault = new setIconifiedByDefault(context, context.obtainStyledAttributes((AttributeSet) null, iArr));
        try {
            return seticonifiedbydefault.e(0);
        } finally {
            seticonifiedbydefault.d.recycle();
        }
    }

    public static void e(View view, Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(setHasDecor$MediaBrowserCompat$MediaItem.az);
        try {
            if (!obtainStyledAttributes.hasValue(setHasDecor$MediaBrowserCompat$MediaItem.aD)) {
                StringBuilder sb = new StringBuilder("View ");
                sb.append(view.getClass());
                sb.append(" is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant).");
                Log.e("ThemeUtils", sb.toString());
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }
}
