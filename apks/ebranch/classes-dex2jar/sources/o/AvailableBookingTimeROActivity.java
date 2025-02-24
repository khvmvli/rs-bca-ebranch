package o;

import android.util.Log;
import java.util.HashSet;
import java.util.Set;
/* loaded from: classes-dex2jar.jar:o/AvailableBookingTimeROActivity.class */
public final class AvailableBookingTimeROActivity implements BindArray {
    private static final Set<String> d = new HashSet();

    @Override // o.BindArray
    public final void b(String str, Throwable th) {
        Set<String> set = d;
        if (!set.contains(str)) {
            Log.w("LOTTIE", str, th);
            set.add(str);
        }
    }

    @Override // o.BindArray
    public final void c(String str) {
        Set<String> set = d;
        if (!set.contains(str)) {
            Log.w("LOTTIE", str, null);
            set.add(str);
        }
    }

    @Override // o.BindArray
    public final void d(String str) {
        if (apply.c) {
            Log.d("LOTTIE", str, null);
        }
    }

    @Override // o.BindArray
    public final void d(String str, Throwable th) {
        if (apply.c) {
            Log.d("LOTTIE", str, th);
        }
    }
}
