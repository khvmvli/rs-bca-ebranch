package o;

import android.content.Context;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.dynamite.DynamiteModule;
import java.lang.reflect.Method;
/* loaded from: classes-dex2jar.jar:o/setTarikans.class */
public final class setTarikans {
    private static final realmGet$incomeSourceValue a = realmGet$incomeSourceValue.c;
    private static final Object b = new Object();
    private static Method e = null;
    private static Method d = null;

    public static void d(Context context) throws GooglePlayServicesRepairableException, GooglePlayServicesNotAvailableException {
        Context context2;
        if (context != null) {
            realmGet$lastEducation.ensurePlayServicesAvailable(context, 11925000);
            synchronized (b) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                try {
                    context2 = DynamiteModule.a(context, DynamiteModule.d, "com.google.android.gms.providerinstaller.dynamite").j;
                } catch (DynamiteModule.LoadingException e2) {
                    Log.w("ProviderInstaller", "Failed to load providerinstaller module: ".concat(String.valueOf(e2.getMessage())));
                    context2 = null;
                }
                if (context2 != null) {
                    d(context2, "com.google.android.gms.providerinstaller.ProviderInstallerImpl");
                    return;
                }
                long elapsedRealtime2 = SystemClock.elapsedRealtime();
                Context remoteContext = realmGet$lastEducation.getRemoteContext(context);
                if (remoteContext != null) {
                    try {
                        if (d == null) {
                            d = remoteContext.getClassLoader().loadClass("com.google.android.gms.common.security.ProviderInstallerImpl").getMethod("reportRequestStats", Context.class, Long.TYPE, Long.TYPE);
                        }
                        d.invoke(null, context, Long.valueOf(elapsedRealtime), Long.valueOf(elapsedRealtime2));
                    } catch (Exception e3) {
                        Log.w("ProviderInstaller", "Failed to report request stats: ".concat(String.valueOf(e3.getMessage())));
                    }
                }
                if (remoteContext != null) {
                    d(remoteContext, "com.google.android.gms.common.security.ProviderInstallerImpl");
                } else {
                    Log.e("ProviderInstaller", "Failed to get remote context");
                    throw new GooglePlayServicesNotAvailableException(8);
                }
            }
        } else {
            throw new NullPointerException("Context must not be null");
        }
    }

    private static void d(Context context, String str) throws GooglePlayServicesNotAvailableException {
        try {
            if (e == null) {
                e = context.getClassLoader().loadClass(str).getMethod("insertProvider", Context.class);
            }
            e.invoke(null, context);
        } catch (Exception e2) {
            Throwable cause = e2.getCause();
            if (Log.isLoggable("ProviderInstaller", 6)) {
                Log.e("ProviderInstaller", "Failed to install provider: ".concat(String.valueOf(cause == null ? e2.getMessage() : cause.getMessage())));
            }
            throw new GooglePlayServicesNotAvailableException(8);
        }
    }
}
