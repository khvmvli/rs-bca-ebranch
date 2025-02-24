package o;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.Log;
import java.util.Locale;
import o.realmGet$currentPage;
import o.realmGet$kitasKitapExpDate;
/* loaded from: classes-dex2jar.jar:o/setHmRW.class */
public final class setHmRW {
    private static final setCollapseIcon d = new setCollapseIcon();
    private static Locale e;

    public static String a(Context context) {
        String packageName = context.getPackageName();
        try {
            return realmGet$jenisWarkatTransaksi.b(context).b(packageName).toString();
        } catch (PackageManager.NameNotFoundException | NullPointerException e2) {
            String str = context.getApplicationInfo().name;
            return TextUtils.isEmpty(str) ? packageName : str;
        }
    }

    public static String a(Context context, int i) {
        Resources resources = context.getResources();
        return i != 1 ? i != 2 ? i != 3 ? resources.getString(17039370) : resources.getString(realmGet$currentPage.write.a) : resources.getString(realmGet$currentPage.write.i) : resources.getString(realmGet$currentPage.write.b);
    }

    private static String a(Context context, String str, String str2) {
        Resources resources = context.getResources();
        String c = c(context, str);
        String str3 = c;
        if (c == null) {
            str3 = resources.getString(realmGet$kitasKitapExpDate.RemoteActionCompatParcelizer.d);
        }
        return String.format(resources.getConfiguration().locale, str3, str2);
    }

    public static String b(Context context, int i) {
        Resources resources = context.getResources();
        String a = a(context);
        if (i == 1) {
            return resources.getString(realmGet$currentPage.write.d, a);
        }
        if (i == 2) {
            return getSumberDanaTransaksi.d(context) ? resources.getString(realmGet$currentPage.write.k) : resources.getString(realmGet$currentPage.write.n, a);
        }
        if (i == 3) {
            return resources.getString(realmGet$currentPage.write.e, a);
        }
        if (i == 5) {
            return a(context, "common_google_play_services_invalid_account_text", a);
        }
        if (i == 7) {
            return a(context, "common_google_play_services_network_error_text", a);
        }
        if (i == 9) {
            return resources.getString(realmGet$currentPage.write.j, a);
        }
        if (i == 20) {
            return a(context, "common_google_play_services_restricted_profile_text", a);
        }
        switch (i) {
            case 16:
                return a(context, "common_google_play_services_api_unavailable_text", a);
            case 17:
                return a(context, "common_google_play_services_sign_in_failed_text", a);
            case 18:
                return resources.getString(realmGet$currentPage.write.m, a);
            default:
                return resources.getString(realmGet$kitasKitapExpDate.RemoteActionCompatParcelizer.d, a);
        }
    }

    public static String c(Context context, int i) {
        String c = i == 6 ? c(context, "common_google_play_services_resolution_required_title") : e(context, i);
        return c == null ? context.getResources().getString(realmGet$currentPage.write.g) : c;
    }

    private static String c(Context context, String str) {
        setCollapseIcon setcollapseicon = d;
        synchronized (setcollapseicon) {
            Locale d2 = setOnScrollChangeListener.b(context.getResources().getConfiguration()).d(0);
            if (!d2.equals(e)) {
                setcollapseicon.clear();
                e = d2;
            }
            String str2 = (String) setcollapseicon.get(str);
            if (str2 != null) {
                return str2;
            }
            Resources remoteResource = realmGet$language.getRemoteResource(context);
            if (remoteResource == null) {
                return null;
            }
            int identifier = remoteResource.getIdentifier(str, "string", "com.google.android.gms");
            if (identifier == 0) {
                Log.w("GoogleApiAvailability", "Missing resource: " + str);
                return null;
            }
            String string = remoteResource.getString(identifier);
            if (TextUtils.isEmpty(string)) {
                Log.w("GoogleApiAvailability", "Got empty resource: " + str);
                return null;
            }
            setcollapseicon.put(str, string);
            return string;
        }
    }

    public static String d(Context context, int i) {
        return (i == 6 || i == 19) ? a(context, "common_google_play_services_resolution_required_text", a(context)) : b(context, i);
    }

    public static String e(Context context, int i) {
        Resources resources = context.getResources();
        switch (i) {
            case 1:
                return resources.getString(realmGet$currentPage.write.h);
            case 2:
                return resources.getString(realmGet$currentPage.write.l);
            case 3:
                return resources.getString(realmGet$currentPage.write.c);
            case 4:
            case 6:
            case 18:
                return null;
            case 5:
                Log.e("GoogleApiAvailability", "An invalid account was specified when connecting. Please provide a valid account.");
                return c(context, "common_google_play_services_invalid_account_title");
            case 7:
                Log.e("GoogleApiAvailability", "Network error occurred. Please retry request later.");
                return c(context, "common_google_play_services_network_error_title");
            case 8:
                Log.e("GoogleApiAvailability", "Internal error occurred. Please see logs for detailed information");
                return null;
            case 9:
                Log.e("GoogleApiAvailability", "Google Play services is invalid. Cannot recover.");
                return null;
            case 10:
                Log.e("GoogleApiAvailability", "Developer error occurred. Please see logs for detailed information");
                return null;
            case 11:
                Log.e("GoogleApiAvailability", "The application is not licensed to the user.");
                return null;
            case 12:
            case 13:
            case 14:
            case 15:
            case 19:
            default:
                Log.e("GoogleApiAvailability", "Unexpected error code " + i);
                return null;
            case 16:
                Log.e("GoogleApiAvailability", "One of the API components you attempted to connect to is not available.");
                return null;
            case 17:
                Log.e("GoogleApiAvailability", "The specified account could not be signed in.");
                return c(context, "common_google_play_services_sign_in_failed_title");
            case 20:
                Log.e("GoogleApiAvailability", "The current user profile is restricted and could not use authenticated features.");
                return c(context, "common_google_play_services_restricted_profile_title");
        }
    }
}
