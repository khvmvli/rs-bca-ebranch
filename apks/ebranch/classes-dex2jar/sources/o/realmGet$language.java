package o;

import android.app.Activity;
import android.app.Dialog;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import androidx.fragment.app.Fragment;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
/* loaded from: classes-dex2jar.jar:o/realmGet$language.class */
public final class realmGet$language extends realmGet$lastEducation {
    @Deprecated
    public static final int b = realmGet$lastEducation.a;

    private realmGet$language() {
    }

    @Deprecated
    public static Dialog getErrorDialog(int i, Activity activity, int i2) {
        return getErrorDialog(i, activity, i2, null);
    }

    @Deprecated
    public static Dialog getErrorDialog(int i, Activity activity, int i2, DialogInterface.OnCancelListener onCancelListener) {
        int i3 = i;
        if (true == realmGet$lastEducation.isPlayServicesPossiblyUpdating(activity, i)) {
            i3 = 18;
        }
        return realmGet$jobOthers.c(activity, i3, setHphoneMB.a(activity, realmGet$jobOthers.a.a(activity, i3, "d"), i2), onCancelListener, null);
    }

    @Deprecated
    public static PendingIntent getErrorPendingIntent(int i, Context context, int i2) {
        return realmGet$incomeSourceValue.c.e(context, i, i2);
    }

    @Deprecated
    public static String getErrorString(int i) {
        return realmGet$lastEducation.getErrorString(i);
    }

    public static Context getRemoteContext(Context context) {
        return realmGet$lastEducation.getRemoteContext(context);
    }

    public static Resources getRemoteResource(Context context) {
        return realmGet$lastEducation.getRemoteResource(context);
    }

    @ResultIgnorabilityUnspecified
    @Deprecated
    public static int isGooglePlayServicesAvailable(Context context) {
        return realmGet$lastEducation.isGooglePlayServicesAvailable(context);
    }

    @Deprecated
    public static int isGooglePlayServicesAvailable(Context context, int i) {
        return realmGet$lastEducation.isGooglePlayServicesAvailable(context, i);
    }

    @Deprecated
    public static boolean isUserRecoverableError(int i) {
        return realmGet$lastEducation.isUserRecoverableError(i);
    }

    @ResultIgnorabilityUnspecified
    @Deprecated
    public static boolean showErrorDialogFragment(int i, Activity activity, int i2) {
        return showErrorDialogFragment(i, activity, i2, null);
    }

    @ResultIgnorabilityUnspecified
    @Deprecated
    public static boolean showErrorDialogFragment(int i, Activity activity, int i2, DialogInterface.OnCancelListener onCancelListener) {
        return showErrorDialogFragment(i, activity, null, i2, onCancelListener);
    }

    @ResultIgnorabilityUnspecified
    public static boolean showErrorDialogFragment(int i, Activity activity, Fragment fragment, int i2, DialogInterface.OnCancelListener onCancelListener) {
        int i3 = i;
        if (true == realmGet$lastEducation.isPlayServicesPossiblyUpdating(activity, i)) {
            i3 = 18;
        }
        realmGet$jobOthers realmget_jobothers = realmGet$jobOthers.a;
        if (fragment == null) {
            return realmget_jobothers.b(activity, i3, i2, onCancelListener);
        }
        Dialog c = realmGet$jobOthers.c(activity, i3, setHphoneMB.c(fragment, realmGet$jobOthers.a.a(activity, i3, "d"), i2), onCancelListener, null);
        if (c == null) {
            return false;
        }
        realmGet$jobOthers.c(activity, c, "GooglePlayServicesErrorDialog", onCancelListener);
        return true;
    }

    @Deprecated
    public static void showErrorNotification(int i, Context context) {
        realmGet$jobOthers realmget_jobothers = realmGet$jobOthers.a;
        if (realmGet$lastEducation.isPlayServicesPossiblyUpdating(context, i) || realmGet$lastEducation.isPlayStorePossiblyUpdating(context, i)) {
            new realmGet$noReff(realmget_jobothers, context).sendEmptyMessageDelayed(1, 120000);
        } else {
            realmget_jobothers.c(context, i, realmget_jobothers.b(context, i, 0, "n"));
        }
    }
}
