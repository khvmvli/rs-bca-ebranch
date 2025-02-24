package o;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
/* loaded from: classes-dex2jar.jar:o/realmGet$incomeSourceValue.class */
public class realmGet$incomeSourceValue {
    public static final int b = realmGet$lastEducation.a;
    public static final realmGet$incomeSourceValue c = new realmGet$incomeSourceValue();

    public static realmGet$incomeSourceValue b() {
        return c;
    }

    public Intent a(Context context, int i, String str) {
        if (i == 1 || i == 2) {
            if (context == null || !getSumberDanaTransaksi.d(context)) {
                StringBuilder sb = new StringBuilder("gcore_");
                sb.append(b);
                sb.append("-");
                if (!TextUtils.isEmpty(str)) {
                    sb.append(str);
                }
                sb.append("-");
                if (context != null) {
                    sb.append(context.getPackageName());
                }
                sb.append("-");
                if (context != null) {
                    try {
                        sb.append(realmGet$jenisWarkatTransaksi.a.e(context).d(context.getPackageName(), 0).versionCode);
                    } catch (PackageManager.NameNotFoundException e) {
                    }
                }
                String obj = sb.toString();
                Intent intent = new Intent("android.intent.action.VIEW");
                Uri.Builder appendQueryParameter = Uri.parse("market://details").buildUpon().appendQueryParameter("id", "com.google.android.gms");
                if (!TextUtils.isEmpty(obj)) {
                    appendQueryParameter.appendQueryParameter("pcampaignid", obj);
                }
                intent.setData(appendQueryParameter.build());
                intent.setPackage("com.android.vending");
                intent.addFlags(524288);
                return intent;
            }
            Intent intent2 = new Intent("com.google.android.clockwork.home.UPDATE_ANDROID_WEAR_ACTION");
            intent2.setPackage("com.google.android.wearable.app");
            return intent2;
        } else if (i != 3) {
            return null;
        } else {
            Uri fromParts = Uri.fromParts("package", "com.google.android.gms", null);
            Intent intent3 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent3.setData(fromParts);
            return intent3;
        }
    }

    public boolean a(int i) {
        return realmGet$lastEducation.isUserRecoverableError(i);
    }

    public final boolean a(Context context, int i) {
        return realmGet$lastEducation.isPlayServicesPossiblyUpdating(context, i);
    }

    public final int b(Context context) {
        return realmGet$lastEducation.getApkVersion(context);
    }

    public final PendingIntent b(Context context, int i, int i2, String str) {
        Intent a = a(context, i, str);
        if (a == null) {
            return null;
        }
        return PendingIntent.getActivity(context, i2, a, getNorekPenerima.c | 134217728);
    }

    public String b(int i) {
        return realmGet$lastEducation.getErrorString(i);
    }

    public int c(Context context, int i) {
        int isGooglePlayServicesAvailable = realmGet$lastEducation.isGooglePlayServicesAvailable(context, i);
        if (realmGet$lastEducation.isPlayServicesPossiblyUpdating(context, isGooglePlayServicesAvailable)) {
            return 18;
        }
        return isGooglePlayServicesAvailable;
    }

    @Deprecated
    public final Intent c(int i) {
        return a(null, i, null);
    }

    @ResultIgnorabilityUnspecified
    public int d(Context context) {
        return c(context, b);
    }

    public PendingIntent e(Context context, int i, int i2) {
        return b(context, i, i2, null);
    }

    public final void e(Context context) {
        realmGet$lastEducation.cancelAvailabilityErrorNotifications(context);
    }
}
