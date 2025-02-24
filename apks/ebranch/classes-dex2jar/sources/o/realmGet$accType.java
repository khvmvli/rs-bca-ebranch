package o;

import android.content.Context;
import android.os.Build;
/* loaded from: classes-dex2jar.jar:o/realmGet$accType.class */
public class realmGet$accType {
    private static Boolean a;
    private static Context c;

    public static boolean c(Context context) {
        Boolean bool;
        synchronized (realmGet$accType.class) {
            try {
                Context applicationContext = context.getApplicationContext();
                Context context2 = c;
                if (context2 != null && (bool = a) != null && context2 == applicationContext) {
                    return bool.booleanValue();
                }
                a = null;
                if (Build.VERSION.SDK_INT >= 26) {
                    a = Boolean.valueOf(applicationContext.getPackageManager().isInstantApp());
                } else {
                    try {
                        context.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
                        a = Boolean.TRUE;
                    } catch (ClassNotFoundException e) {
                        a = Boolean.FALSE;
                    }
                }
                c = applicationContext;
                return a.booleanValue();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
