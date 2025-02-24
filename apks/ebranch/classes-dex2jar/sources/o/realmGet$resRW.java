package o;

import android.os.Looper;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
/* loaded from: classes-dex2jar.jar:o/realmGet$resRW.class */
public final class realmGet$resRW {
    private final Set e = Collections.newSetFromMap(new WeakHashMap());

    public static <L> realmGet$resRT<L> c(L l, Looper looper, String str) {
        if (l == null) {
            throw new NullPointerException("Listener must not be null");
        } else if (looper == null) {
            throw new NullPointerException("Looper must not be null");
        } else if (str != null) {
            return new realmGet$resRT<>(looper, l, str);
        } else {
            throw new NullPointerException("Listener type must not be null");
        }
    }

    public final void c() {
        for (realmGet$resRT realmget_resrt : this.e) {
            realmget_resrt.e = null;
            realmget_resrt.a = null;
        }
        this.e.clear();
    }
}
