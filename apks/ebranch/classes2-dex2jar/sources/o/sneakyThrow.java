package o;

import android.app.Activity;
import android.os.Bundle;
/* loaded from: classes2-dex2jar.jar:o/sneakyThrow.class */
public final class sneakyThrow {
    public static int a;
    public static Class<?> d;

    public static void d(Activity activity, Bundle bundle) {
        Class<?> cls = d;
        if (cls != null) {
            try {
                Object newInstance = cls.newInstance();
                documentProvider documentprovider = propagateIfInstanceOf.a.a.a;
                documentProvider documentprovider2 = documentprovider;
                if (documentprovider == null) {
                    documentprovider2 = documentProvider.b();
                }
                documentprovider2.d(newInstance);
            } catch (Exception e) {
                throw new RuntimeException("Event cannot be constructed", e);
            }
        }
        if (bundle.getBoolean("de.greenrobot.eventbus.errordialog.finish_after_dialog", false) && activity != null) {
            activity.finish();
        }
    }
}
