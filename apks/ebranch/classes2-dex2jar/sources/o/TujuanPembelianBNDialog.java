package o;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import com.google.firebase.messaging.Constants;
import com.google.firebase.messaging.MessagingAnalytics;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
/* loaded from: classes2-dex2jar.jar:o/TujuanPembelianBNDialog.class */
public final class TujuanPembelianBNDialog implements Application.ActivityLifecycleCallbacks {
    private final Set<Intent> a = Collections.newSetFromMap(new WeakHashMap());

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        Bundle extras;
        Intent intent = activity.getIntent();
        if (intent != null && this.a.add(intent) && (extras = intent.getExtras()) != null) {
            Bundle bundle2 = extras.getBundle(Constants.MessageNotificationKeys.ANALYTICS_DATA);
            if (MessagingAnalytics.shouldUploadScionMetrics(bundle2)) {
                MessagingAnalytics.logNotificationOpen(bundle2);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        if (activity.isFinishing()) {
            this.a.remove(activity.getIntent());
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
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
}
