package o;
/* loaded from: classes-dex2jar.jar:o/AvailableBookingTimeV2Activity_ViewBinding.class */
public final class AvailableBookingTimeV2Activity_ViewBinding {
    public static int b(float f, int i, int i2) {
        if (i == i2) {
            return i;
        }
        float f2 = ((float) (i >>> 24)) / 255.0f;
        float f3 = ((float) (i2 >>> 24)) / 255.0f;
        float e = e(((float) ((i >> 16) & 255)) / 255.0f);
        float e2 = e(((float) ((i >> 8) & 255)) / 255.0f);
        float e3 = e(((float) (i & 255)) / 255.0f);
        float e4 = e(((float) ((i2 >> 16) & 255)) / 255.0f);
        float e5 = e(((float) ((i2 >> 8) & 255)) / 255.0f);
        float e6 = e(((float) (i2 & 255)) / 255.0f);
        return (Math.round((f2 + ((f3 - f2) * f)) * 255.0f) << 24) | (Math.round(d(e + ((e4 - e) * f)) * 255.0f) << 16) | (Math.round(d(e2 + ((e5 - e2) * f)) * 255.0f) << 8) | Math.round(d(e3 + ((e6 - e3) * f)) * 255.0f);
    }

    private static float d(float f) {
        return f <= 0.0031308f ? f * 12.92f : (float) ((Math.pow((double) f, 0.4166666567325592d) * 1.0549999475479126d) - 0.054999999701976776d);
    }

    private static float e(float f) {
        return f <= 0.04045f ? f / 12.92f : (float) Math.pow((double) ((f + 0.055f) / 1.055f), 2.4000000953674316d);
    }
}
