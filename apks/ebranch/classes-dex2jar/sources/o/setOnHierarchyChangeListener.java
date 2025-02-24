package o;

import android.app.Activity;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import java.util.Arrays;
/* loaded from: classes-dex2jar.jar:o/setOnHierarchyChangeListener.class */
public class setOnHierarchyChangeListener extends copyWindowDataInto {
    private static setOnHierarchyChangeListener$MediaBrowserCompat$CustomActionResultReceiver a;

    /* loaded from: classes-dex2jar.jar:o/setOnHierarchyChangeListener$RemoteActionCompatParcelizer.class */
    public interface RemoteActionCompatParcelizer {
        @Override // o.setOnHierarchyChangeListener.RemoteActionCompatParcelizer
        void onRequestPermissionsResult(int i, String[] strArr, int[] iArr);
    }

    /* loaded from: classes-dex2jar.jar:o/setOnHierarchyChangeListener$write.class */
    public interface write {
        void a_(int i);
    }

    public static void a(Activity activity) {
        activity.finishAfterTransition();
    }

    public static void a(final Activity activity, final String[] strArr, final int i) {
        setOnHierarchyChangeListener$MediaBrowserCompat$CustomActionResultReceiver setonhierarchychangelistener_mediabrowsercompat_customactionresultreceiver = a;
        if (setonhierarchychangelistener_mediabrowsercompat_customactionresultreceiver == null || !setonhierarchychangelistener_mediabrowsercompat_customactionresultreceiver.c(activity, strArr, i)) {
            for (String str : strArr) {
                if (TextUtils.isEmpty(str)) {
                    StringBuilder sb = new StringBuilder("Permission request for permissions ");
                    sb.append(Arrays.toString(strArr));
                    sb.append(" must not contain null or empty values");
                    throw new IllegalArgumentException(sb.toString());
                }
            }
            if (Build.VERSION.SDK_INT >= 23) {
                if (activity instanceof write) {
                    ((write) activity).a_(i);
                }
                activity.requestPermissions(strArr, i);
            } else if (activity instanceof RemoteActionCompatParcelizer) {
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: o.setOnHierarchyChangeListener.5
                    @Override // java.lang.Runnable
                    public void run() {
                        int[] iArr = new int[strArr.length];
                        PackageManager packageManager = activity.getPackageManager();
                        String packageName = activity.getPackageName();
                        int length = strArr.length;
                        for (int i2 = 0; i2 < length; i2++) {
                            iArr[i2] = packageManager.checkPermission(strArr[i2], packageName);
                        }
                        ((RemoteActionCompatParcelizer) activity).onRequestPermissionsResult(i, strArr, iArr);
                    }
                });
            }
        }
    }

    public static void b(final Activity activity) {
        if (Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
        } else if (Build.VERSION.SDK_INT <= 23) {
            new Handler(activity.getMainLooper()).post(new Runnable() { // from class: o.setOnHierarchyChangeListener.4
                @Override // java.lang.Runnable
                public void run() {
                    if (!activity.isFinishing() && !setStatusBarBackground.c(activity)) {
                        activity.recreate();
                    }
                }
            });
        } else if (!setStatusBarBackground.c(activity)) {
            activity.recreate();
        }
    }

    public static void b(Activity activity, Intent intent, int i, Bundle bundle) {
        activity.startActivityForResult(intent, i, bundle);
    }

    public static void d(Activity activity) {
        activity.finishAffinity();
    }

    public static void d(Activity activity, IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws IntentSender.SendIntentException {
        activity.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }

    public static boolean d(Activity activity, String str) {
        if (Build.VERSION.SDK_INT >= 23) {
            return activity.shouldShowRequestPermissionRationale(str);
        }
        return false;
    }
}
