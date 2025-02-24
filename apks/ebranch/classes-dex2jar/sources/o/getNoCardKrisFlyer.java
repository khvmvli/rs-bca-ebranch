package o;

import android.os.Bundle;
import android.util.Log;
import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes-dex2jar.jar:o/getNoCardKrisFlyer.class */
public final class getNoCardKrisFlyer extends getReferalCode {
    private boolean a;
    private final AtomicReference<Bundle> c = new AtomicReference<>();

    public static final <T> T d(Bundle bundle, Class<T> cls) {
        T t;
        Object obj;
        if (bundle == null || (obj = bundle.get("r")) == null) {
            t = null;
        } else {
            try {
                t = cls.cast(obj);
            } catch (ClassCastException e) {
                Log.w("AM", String.format("Unexpected object type. Expected, Received: %s, %s", cls.getCanonicalName(), obj.getClass().getCanonicalName()), e);
                throw e;
            }
        }
        return t;
    }

    public final String c(long j) {
        return (String) d(d(j), String.class);
    }

    @Override // o.getTotalSupplementCard
    public final void c(Bundle bundle) {
        synchronized (this.c) {
            this.c.set(bundle);
            this.a = true;
            this.c.notify();
        }
    }

    public final Bundle d(long j) {
        Bundle bundle;
        synchronized (this.c) {
            if (!this.a) {
                try {
                    this.c.wait(j);
                } catch (InterruptedException e) {
                    return null;
                }
            }
            bundle = this.c.get();
        }
        return bundle;
    }
}
