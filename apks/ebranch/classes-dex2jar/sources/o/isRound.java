package o;

import android.graphics.Color;
/* loaded from: classes-dex2jar.jar:o/isRound.class */
public final class isRound {
    private static final ThreadLocal<double[]> c = new ThreadLocal<>();

    public static int a(int i, int i2) {
        int alpha = Color.alpha(i2);
        int alpha2 = Color.alpha(i);
        int i3 = 255 - alpha2;
        int i4 = 255 - (((255 - alpha) * i3) / 255);
        int red = Color.red(i);
        int i5 = 0;
        int red2 = i4 == 0 ? 0 : (((red * 255) * alpha2) + ((Color.red(i2) * alpha) * i3)) / (i4 * 255);
        int green = i4 == 0 ? 0 : (((Color.green(i) * 255) * alpha2) + ((Color.green(i2) * alpha) * i3)) / (i4 * 255);
        int blue = Color.blue(i);
        int blue2 = Color.blue(i2);
        if (i4 != 0) {
            i5 = (((blue * 255) * alpha2) + ((blue2 * alpha) * i3)) / (i4 * 255);
        }
        return Color.argb(i4, red2, green, i5);
    }

    public static void a(int i, float[] fArr) {
        b(Color.red(i), Color.green(i), Color.blue(i), fArr);
    }

    public static int b(int i, int i2) {
        if (i2 >= 0 && i2 <= 255) {
            return (i & 16777215) | (i2 << 24);
        }
        throw new IllegalArgumentException("alpha must be between 0 and 255.");
    }

    public static void b(int i, int i2, int i3, float[] fArr) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5 = ((float) i) / 255.0f;
        float f6 = ((float) i2) / 255.0f;
        float f7 = ((float) i3) / 255.0f;
        float max = Math.max(f5, Math.max(f6, f7));
        float min = Math.min(f5, Math.min(f6, f7));
        float f8 = max - min;
        float f9 = (max + min) / 2.0f;
        if (max == min) {
            f = 0.0f;
            f2 = 0.0f;
        } else {
            f = max == f5 ? ((f6 - f7) / f8) % 6.0f : max == f6 ? ((f7 - f5) / f8) + 2.0f : ((f5 - f6) / f8) + 4.0f;
            f2 = f8 / (1.0f - Math.abs((2.0f * f9) - 1.0f));
        }
        r14 = 360.0f;
        float f10 = (f * 60.0f) % 360.0f;
        float f11 = f10;
        if (f10 < 0.0f) {
            f11 = f10 + 360.0f;
        }
        if (f11 < 0.0f) {
            f11 = 0.0f;
        } else if (f11 > 360.0f) {
        }
        fArr[0] = f11;
        if (f2 >= 0.0f) {
            f3 = f2;
            if (f2 > 1.0f) {
                f3 = 1.0f;
            }
        } else {
            f3 = 0.0f;
        }
        fArr[1] = f3;
        if (f9 >= 0.0f) {
            f4 = f9;
            if (f9 > 1.0f) {
                f4 = 1.0f;
            }
        } else {
            f4 = 0.0f;
        }
        fArr[2] = f4;
    }

    private static double d(int i, int i2) {
        if (Color.alpha(i2) == 255) {
            int i3 = i;
            if (Color.alpha(i) < 255) {
                i3 = a(i, i2);
            }
            ThreadLocal<double[]> threadLocal = c;
            double[] dArr = threadLocal.get();
            double[] dArr2 = dArr;
            if (dArr == null) {
                dArr2 = new double[3];
                threadLocal.set(dArr2);
            }
            e(Color.red(i3), Color.green(i3), Color.blue(i3), dArr2);
            double d = (dArr2[1] / 100.0d) + 0.05d;
            ThreadLocal<double[]> threadLocal2 = c;
            double[] dArr3 = threadLocal2.get();
            double[] dArr4 = dArr3;
            if (dArr3 == null) {
                dArr4 = new double[3];
                threadLocal2.set(dArr4);
            }
            e(Color.red(i2), Color.green(i2), Color.blue(i2), dArr4);
            double d2 = (dArr4[1] / 100.0d) + 0.05d;
            return Math.max(d, d2) / Math.min(d, d2);
        }
        StringBuilder sb = new StringBuilder("background can not be translucent: #");
        sb.append(Integer.toHexString(i2));
        throw new IllegalArgumentException(sb.toString());
    }

    public static int d(int i, int i2, float f) {
        if (Color.alpha(i2) == 255) {
            int i3 = i & 16777215;
            double d = d(-16777216 | i3, i2);
            double d2 = (double) f;
            if (d < d2) {
                return -1;
            }
            int i4 = 0;
            int i5 = 255;
            for (int i6 = 0; i6 <= 10 && i5 - i4 > 1; i6++) {
                int i7 = (i4 + i5) / 2;
                if (i7 < 0 || i7 > 255) {
                    throw new IllegalArgumentException("alpha must be between 0 and 255.");
                }
                if (d((i7 << 24) | i3, i2) < d2) {
                    i4 = i7;
                } else {
                    i5 = i7;
                }
            }
            return i5;
        }
        StringBuilder sb = new StringBuilder("background can not be translucent: #");
        sb.append(Integer.toHexString(i2));
        throw new IllegalArgumentException(sb.toString());
    }

    public static double e(int i) {
        ThreadLocal<double[]> threadLocal = c;
        double[] dArr = threadLocal.get();
        double[] dArr2 = dArr;
        if (dArr == null) {
            dArr2 = new double[3];
            threadLocal.set(dArr2);
        }
        e(Color.red(i), Color.green(i), Color.blue(i), dArr2);
        return dArr2[1] / 100.0d;
    }

    private static void e(int i, int i2, int i3, double[] dArr) {
        if (dArr.length == 3) {
            double d = ((double) i) / 255.0d;
            double pow = d < 0.04045d ? d / 12.92d : Math.pow((d + 0.055d) / 1.055d, 2.4d);
            double d2 = ((double) i2) / 255.0d;
            double pow2 = d2 < 0.04045d ? d2 / 12.92d : Math.pow((d2 + 0.055d) / 1.055d, 2.4d);
            double d3 = ((double) i3) / 255.0d;
            double pow3 = d3 < 0.04045d ? d3 / 12.92d : Math.pow((d3 + 0.055d) / 1.055d, 2.4d);
            dArr[0] = ((0.4124d * pow) + (0.3576d * pow2) + (0.1805d * pow3)) * 100.0d;
            dArr[1] = ((0.2126d * pow) + (0.7152d * pow2) + (0.0722d * pow3)) * 100.0d;
            dArr[2] = ((pow * 0.0193d) + (pow2 * 0.1192d) + (pow3 * 0.9505d)) * 100.0d;
            return;
        }
        throw new IllegalArgumentException("outXyz must have a length of 3.");
    }
}
