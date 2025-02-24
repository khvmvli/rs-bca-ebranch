package o;

import android.os.Build;
import android.util.Log;
import java.io.File;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes-dex2jar.jar:o/GetBankSpecialRelationResponse$SpecialBank$$Parcelable.class */
public final class GetBankSpecialRelationResponse$SpecialBank$$Parcelable {
    private static volatile int a;
    public static final boolean b;
    private static final File c;
    public static final boolean d;
    private static volatile GetBankSpecialRelationResponse$SpecialBank$$Parcelable e;
    private int f;
    private final boolean g;
    private final int h;
    private boolean i = true;
    private final AtomicBoolean j = new AtomicBoolean(false);
    private final int k;

    static {
        boolean z = true;
        b = Build.VERSION.SDK_INT < 29;
        if (Build.VERSION.SDK_INT < 26) {
            z = false;
        }
        d = z;
        c = new File("/proc/self/fd");
        a = -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00d8  */
    /* Code decompiled incorrectly, please refer to instructions dump */
    GetBankSpecialRelationResponse$SpecialBank$$Parcelable() {
        /*
        // Method dump skipped, instructions count: 231
        */
        throw new UnsupportedOperationException("Method not decompiled: o.GetBankSpecialRelationResponse$SpecialBank$$Parcelable.<init>():void");
    }

    public static GetBankSpecialRelationResponse$SpecialBank$$Parcelable c() {
        if (e == null) {
            synchronized (GetBankSpecialRelationResponse$SpecialBank$$Parcelable.class) {
                try {
                    if (e == null) {
                        e = new GetBankSpecialRelationResponse$SpecialBank$$Parcelable();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return e;
    }

    private boolean d() {
        boolean z;
        synchronized (this) {
            boolean z2 = true;
            int i = this.f + 1;
            this.f = i;
            if (i >= 50) {
                this.f = 0;
                int length = c.list().length;
                long j = (long) (a != -1 ? a : this.k);
                if (((long) length) >= j) {
                    z2 = false;
                }
                this.i = z2;
                if (!z2 && Log.isLoggable("Downsampler", 5)) {
                    StringBuilder sb = new StringBuilder("Excluding HARDWARE bitmap config because we're over the file descriptor limit, file descriptors ");
                    sb.append(length);
                    sb.append(", limit ");
                    sb.append(j);
                    Log.w("Downsampler", sb.toString());
                }
            }
            z = this.i;
        }
        return z;
    }

    private static boolean e() {
        if (Build.VERSION.SDK_INT != 26) {
            return false;
        }
        for (String str : Arrays.asList("SC-04J", "SM-N935", "SM-J720", "SM-G570F", "SM-G570M", "SM-G960", "SM-G965", "SM-G935", "SM-G930", "SM-A520", "SM-A720F", "moto e5", "moto e5 play", "moto e5 plus", "moto e5 cruise", "moto g(6) forge", "moto g(6) play")) {
            if (Build.MODEL.startsWith(str)) {
                return true;
            }
        }
        return false;
    }

    public final boolean b(int i, int i2, boolean z, boolean z2) {
        if (!z) {
            if (!Log.isLoggable("HardwareConfig", 2)) {
                return false;
            }
            Log.v("HardwareConfig", "Hardware config disallowed by caller");
            return false;
        } else if (!this.g) {
            if (!Log.isLoggable("HardwareConfig", 2)) {
                return false;
            }
            Log.v("HardwareConfig", "Hardware config disallowed by device model");
            return false;
        } else if (d) {
            if (b && !this.j.get()) {
                if (!Log.isLoggable("HardwareConfig", 2)) {
                    return false;
                }
                Log.v("HardwareConfig", "Hardware config disallowed by app state");
                return false;
            } else if (!z2) {
                int i3 = this.h;
                if (i < i3) {
                    if (!Log.isLoggable("HardwareConfig", 2)) {
                        return false;
                    }
                    Log.v("HardwareConfig", "Hardware config disallowed because width is too small");
                    return false;
                } else if (i2 < i3) {
                    if (!Log.isLoggable("HardwareConfig", 2)) {
                        return false;
                    }
                    Log.v("HardwareConfig", "Hardware config disallowed because height is too small");
                    return false;
                } else if (d()) {
                    return true;
                } else {
                    if (!Log.isLoggable("HardwareConfig", 2)) {
                        return false;
                    }
                    Log.v("HardwareConfig", "Hardware config disallowed because there are insufficient FDs");
                    return false;
                }
            } else if (!Log.isLoggable("HardwareConfig", 2)) {
                return false;
            } else {
                Log.v("HardwareConfig", "Hardware config disallowed because exif orientation is required");
                return false;
            }
        } else if (!Log.isLoggable("HardwareConfig", 2)) {
            return false;
        } else {
            Log.v("HardwareConfig", "Hardware config disallowed by sdk");
            return false;
        }
    }
}
