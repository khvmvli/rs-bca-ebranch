package o;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Build;
import android.util.Property;
import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes-dex2jar.jar:o/setStrokeColor.class */
public final class setStrokeColor {
    private static final setTrimPathEnd a;
    static final Property<View, Float> c;
    static final Property<View, Rect> d;

    static {
        if (Build.VERSION.SDK_INT >= 29) {
            a = new getGroupName();
        } else if (Build.VERSION.SDK_INT >= 23) {
            a = new setTrimPathStart();
        } else if (Build.VERSION.SDK_INT >= 22) {
            a = new setStrokeWidth();
        } else {
            a = new setTrimPathOffset();
        }
        c = new Property<View, Float>(Float.class, "translationAlpha") { // from class: o.setStrokeColor.3
            @Override // android.util.Property
            public final /* synthetic */ Float get(View view) {
                return Float.valueOf(setStrokeColor.b(view));
            }

            @Override // android.util.Property
            public final /* synthetic */ void set(View view, Float f) {
                setStrokeColor.d(view, f.floatValue());
            }
        };
        d = new Property<View, Rect>(Rect.class, "clipBounds") { // from class: o.setStrokeColor.1
            @Override // android.util.Property
            public final /* synthetic */ Rect get(View view) {
                return findFragmentByWho.g(view);
            }

            @Override // android.util.Property
            public final /* synthetic */ void set(View view, Rect rect) {
                findFragmentByWho.c(view, rect);
            }
        };
    }

    public static getScaleX a(View view) {
        return new getPivotX(view);
    }

    public static float b(View view) {
        return a.b(view);
    }

    public static void b(View view, int i) {
        a.d(view, i);
    }

    public static void c(View view) {
        a.a(view);
    }

    public static void c(View view, Matrix matrix) {
        a.a(view, matrix);
    }

    public static setFillColor d(View view) {
        return new setStrokeAlpha(view);
    }

    public static void d(View view, float f) {
        a.e(view, f);
    }

    public static void d(View view, Matrix matrix) {
        a.e(view, matrix);
    }

    public static void e(View view) {
        a.e(view);
    }

    public static void e(View view, int i, int i2, int i3, int i4) {
        a.d(view, i, i2, i3, i4);
    }
}
