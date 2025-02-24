package o;

import android.os.SystemClock;
/* loaded from: classes-dex2jar.jar:o/getTotalAmountWarkat.class */
public final class getTotalAmountWarkat {
    private static final double b = 1.0d / Math.pow(10.0d, 6.0d);

    public static long b() {
        return SystemClock.elapsedRealtimeNanos();
    }

    public static double e(long j) {
        return ((double) (SystemClock.elapsedRealtimeNanos() - j)) * b;
    }
}
