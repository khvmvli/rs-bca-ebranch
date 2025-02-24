package o;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.UserManager;
import android.util.Log;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes-dex2jar.jar:o/realmGet$lastEducation.class */
public class realmGet$lastEducation {
    @Deprecated
    public static final int a;
    static boolean c;
    private static boolean d;
    @Deprecated
    static final AtomicBoolean e = new AtomicBoolean();
    private static final AtomicBoolean b = new AtomicBoolean();

    public static boolean b(Context context, String str) {
        boolean equals = str.equals("com.google.android.gms");
        for (PackageInstaller.SessionInfo sessionInfo : context.getPackageManager().getPackageInstaller().getAllSessions()) {
            if (str.equals(sessionInfo.getAppPackageName())) {
                return true;
            }
        }
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(str, 8192);
            return equals ? applicationInfo.enabled : applicationInfo.enabled && !isRestrictedUserProfile(context);
        } catch (PackageManager.NameNotFoundException | Exception e2) {
            return false;
        }
    }

    @Deprecated
    public static void cancelAvailabilityErrorNotifications(Context context) {
        if (!e.getAndSet(true)) {
            try {
                NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
                if (notificationManager != null) {
                    notificationManager.cancel(10436);
                }
            } catch (SecurityException e2) {
                Log.d("GooglePlayServicesUtil", "Suppressing Security Exception %s in cancelAvailabilityErrorNotifications.", e2);
            }
        }
    }

    public static void enableUsingApkIndependentContext() {
        b.set(true);
    }

    @Deprecated
    public static void ensurePlayServicesAvailable(Context context, int i) throws GooglePlayServicesRepairableException, GooglePlayServicesNotAvailableException {
        int c2 = realmGet$incomeSourceValue.c.c(context, i);
        if (c2 != 0) {
            Intent a2 = realmGet$incomeSourceValue.c.a(context, c2, "e");
            StringBuilder sb = new StringBuilder("GooglePlayServices not available due to error ");
            sb.append(c2);
            Log.e("GooglePlayServicesUtil", sb.toString());
            if (a2 == null) {
                throw new GooglePlayServicesNotAvailableException(c2);
            }
            throw new GooglePlayServicesRepairableException(c2, "Google Play Services not available", a2);
        }
    }

    @Deprecated
    public static int getApkVersion(Context context) {
        try {
            return context.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
        } catch (PackageManager.NameNotFoundException e2) {
            Log.w("GooglePlayServicesUtil", "Google Play services is missing.");
            return 0;
        }
    }

    @Deprecated
    public static int getClientVersion(Context context) {
        Bundle bundle;
        PackageInfo c2 = getNoWarkatTransaksi.c(context, context.getPackageName());
        if (c2 == null || c2.applicationInfo == null || (bundle = c2.applicationInfo.metaData) == null) {
            return -1;
        }
        return bundle.getInt("com.google.android.gms.version", -1);
    }

    @Deprecated
    public static PendingIntent getErrorPendingIntent(int i, Context context, int i2) {
        return realmGet$incomeSourceValue.c.e(context, i, i2);
    }

    @Deprecated
    public static String getErrorString(int i) {
        return realmGet$jobValue.e(i);
    }

    @Deprecated
    public static Intent getGooglePlayServicesAvailabilityRecoveryIntent(int i) {
        return realmGet$incomeSourceValue.c.a(null, i, null);
    }

    public static Context getRemoteContext(Context context) {
        try {
            return context.createPackageContext("com.google.android.gms", 3);
        } catch (PackageManager.NameNotFoundException e2) {
            return null;
        }
    }

    public static Resources getRemoteResource(Context context) {
        try {
            return context.getPackageManager().getResourcesForApplication("com.google.android.gms");
        } catch (PackageManager.NameNotFoundException e2) {
            return null;
        }
    }

    public static boolean honorsDebugCertificates(Context context) {
        try {
            if (!c) {
                try {
                    PackageInfo d2 = realmGet$jenisWarkatTransaksi.a.e(context).d("com.google.android.gms", 64);
                    realmGet$kitasKitapFlag.e(context);
                    if (d2 == null || realmGet$kitasKitapFlag.c(d2, false) || !realmGet$kitasKitapFlag.c(d2, true)) {
                        d = false;
                    } else {
                        d = true;
                    }
                    c = true;
                } catch (PackageManager.NameNotFoundException e2) {
                    Log.w("GooglePlayServicesUtil", "Cannot find Google Play services package name.", e2);
                    c = true;
                }
            }
            return d || !"user".equals(Build.TYPE);
        } catch (Throwable th) {
            c = true;
            throw th;
        }
    }

    @ResultIgnorabilityUnspecified
    @Deprecated
    public static int isGooglePlayServicesAvailable(Context context) {
        return isGooglePlayServicesAvailable(context, a);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0221  */
    @java.lang.Deprecated
    /* Code decompiled incorrectly, please refer to instructions dump */
    public static int isGooglePlayServicesAvailable(android.content.Context r4, int r5) {
        /*
        // Method dump skipped, instructions count: 553
        */
        throw new UnsupportedOperationException("Method not decompiled: o.realmGet$lastEducation.isGooglePlayServicesAvailable(android.content.Context, int):int");
    }

    @Deprecated
    public static boolean isGooglePlayServicesUid(Context context, int i) {
        return getTipeNasabahPengirim.b(context, i);
    }

    @Deprecated
    public static boolean isPlayServicesPossiblyUpdating(Context context, int i) {
        if (i == 18) {
            return true;
        }
        if (i == 1) {
            return b(context, "com.google.android.gms");
        }
        return false;
    }

    @Deprecated
    public static boolean isPlayStorePossiblyUpdating(Context context, int i) {
        if (i == 9) {
            return b(context, "com.android.vending");
        }
        return false;
    }

    public static boolean isRestrictedUserProfile(Context context) {
        Object systemService = context.getSystemService("user");
        if (systemService != null) {
            Bundle applicationRestrictions = ((UserManager) systemService).getApplicationRestrictions(context.getPackageName());
            return applicationRestrictions != null && "true".equals(applicationRestrictions.getString("restricted_profile"));
        }
        throw new NullPointerException("null reference");
    }

    @Deprecated
    public static boolean isSidewinderDevice(Context context) {
        return getSumberDanaTransaksi.b(context);
    }

    @Deprecated
    public static boolean isUserRecoverableError(int i) {
        return i == 1 || i == 2 || i == 3 || i == 9;
    }

    @Deprecated
    public static boolean uidHasPackageName(Context context, int i, String str) {
        return realmGet$jenisWarkatTransaksi.a.e(context).b(i, str);
    }
}
