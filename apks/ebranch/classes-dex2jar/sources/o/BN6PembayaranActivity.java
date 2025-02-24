package o;

import android.graphics.Path;
import android.graphics.PointF;
import java.util.List;
/* loaded from: classes-dex2jar.jar:o/BN6PembayaranActivity.class */
public final class BN6PembayaranActivity {
    private static PointF d = new PointF();

    public static int a(int i, int i2, int i3) {
        return Math.max(0, Math.min(255, i));
    }

    public static void a(getFloat getfloat, Path path) {
        path.reset();
        PointF pointF = getfloat.d;
        path.moveTo(pointF.x, pointF.y);
        d.set(pointF.x, pointF.y);
        for (int i = 0; i < getfloat.e.size(); i++) {
            Unbinder$$ExternalSyntheticLambda0 unbinder$$ExternalSyntheticLambda0 = getfloat.e.get(i);
            PointF pointF2 = unbinder$$ExternalSyntheticLambda0.e;
            PointF pointF3 = unbinder$$ExternalSyntheticLambda0.a;
            PointF pointF4 = unbinder$$ExternalSyntheticLambda0.c;
            if (!pointF2.equals(d) || !pointF3.equals(pointF4)) {
                path.cubicTo(pointF2.x, pointF2.y, pointF3.x, pointF3.y, pointF4.x, pointF4.y);
            } else {
                path.lineTo(pointF4.x, pointF4.y);
            }
            d.set(pointF4.x, pointF4.y);
        }
        if (getfloat.c) {
            path.close();
        }
    }

    public static float b(float f, float f2, float f3) {
        return f + (f3 * (f2 - f));
    }

    public static double c(double d2, double d3, double d4) {
        return d2 + (d4 * (d3 - d2));
    }

    public static int c(float f, float f2) {
        int i = (int) f;
        int i2 = (int) f2;
        int i3 = i / i2;
        int i4 = i3;
        if (!((i ^ i2) >= 0)) {
            i4 = i3;
            if (i % i2 != 0) {
                i4 = i3 - 1;
            }
        }
        return i - (i2 * i4);
    }

    public static int c(int i, int i2, float f) {
        return (int) (((float) i) + (f * ((float) (i2 - i))));
    }

    public static void c(unbind unbind, int i, List<unbind> list, unbind unbind2, OnFocusChange onFocusChange) {
        if (unbind.b(onFocusChange.e(), i)) {
            String e = onFocusChange.e();
            unbind unbind3 = new unbind(unbind2);
            unbind3.e.add(e);
            unbind unbind4 = new unbind(unbind3);
            unbind4.a = onFocusChange;
            list.add(unbind4);
        }
    }

    public static double d(double d2, double d3, double d4) {
        return Math.max(0.0d, Math.min(1.0d, d2));
    }

    public static float d(float f, float f2, float f3) {
        return Math.max(f2, Math.min(f3, f));
    }

    public static PointF e(PointF pointF, PointF pointF2) {
        return new PointF(pointF.x + pointF2.x, pointF.y + pointF2.y);
    }

    public static boolean e(float f, float f2, float f3) {
        return f >= f2 && f <= f3;
    }
}
