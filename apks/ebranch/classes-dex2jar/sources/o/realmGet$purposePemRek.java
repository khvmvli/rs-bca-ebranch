package o;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes-dex2jar.jar:o/realmGet$purposePemRek.class */
public final class realmGet$purposePemRek implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {
    public static final realmGet$purposePemRek c = new realmGet$purposePemRek();
    public final AtomicBoolean a = new AtomicBoolean();
    final AtomicBoolean d = new AtomicBoolean();
    public final ArrayList e = new ArrayList();
    private boolean b = false;

    /* loaded from: classes-dex2jar.jar:o/realmGet$purposePemRek$IconCompatParcelizer.class */
    public interface IconCompatParcelizer {
        void c(boolean z);
    }

    private realmGet$purposePemRek() {
    }

    private final void b(boolean z) {
        synchronized (c) {
            Iterator it = this.e.iterator();
            while (it.hasNext()) {
                ((IconCompatParcelizer) it.next()).c(z);
            }
        }
    }

    public static void c(Application application) {
        realmGet$purposePemRek realmget_purposepemrek = c;
        synchronized (realmget_purposepemrek) {
            if (!realmget_purposepemrek.b) {
                application.registerActivityLifecycleCallbacks(realmget_purposepemrek);
                application.registerComponentCallbacks(realmget_purposepemrek);
                realmget_purposepemrek.b = true;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        AtomicBoolean atomicBoolean = this.d;
        boolean compareAndSet = this.a.compareAndSet(true, false);
        atomicBoolean.set(true);
        if (compareAndSet) {
            b(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        AtomicBoolean atomicBoolean = this.d;
        boolean compareAndSet = this.a.compareAndSet(true, false);
        atomicBoolean.set(true);
        if (compareAndSet) {
            b(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        if (i == 20 && this.a.compareAndSet(false, true)) {
            this.d.set(true);
            b(true);
        }
    }
}
