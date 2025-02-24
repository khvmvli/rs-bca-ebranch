package o;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import androidx.fragment.app.Fragment;
/* loaded from: classes2-dex2jar.jar:o/Predicate.class */
public final class Predicate {
    private static final setCollapseIcon<String, Integer> e;

    static {
        setCollapseIcon<String, Integer> setcollapseicon = new setCollapseIcon<>(13);
        e = setcollapseicon;
        setcollapseicon.put("com.android.voicemail.permission.ADD_VOICEMAIL", 14);
        setcollapseicon.put("android.permission.READ_CALL_LOG", 16);
        setcollapseicon.put("android.permission.READ_EXTERNAL_STORAGE", 16);
        setcollapseicon.put("android.permission.WRITE_CALL_LOG", 16);
        setcollapseicon.put("android.permission.BODY_SENSORS", 20);
        setcollapseicon.put("android.permission.SYSTEM_ALERT_WINDOW", 23);
        setcollapseicon.put("android.permission.WRITE_SETTINGS", 23);
        setcollapseicon.put("android.permission.READ_PHONE_NUMBERS", 26);
        setcollapseicon.put("android.permission.ANSWER_PHONE_CALLS", 26);
        setcollapseicon.put("android.permission.ACCEPT_HANDOVER", 28);
        setcollapseicon.put("android.permission.ACTIVITY_RECOGNITION", 29);
        setcollapseicon.put("android.permission.ACCESS_MEDIA_LOCATION", 29);
        setcollapseicon.put("android.permission.ACCESS_BACKGROUND_LOCATION", 29);
    }

    public static boolean b(Activity activity, String... strArr) {
        for (String str : strArr) {
            if (setOnHierarchyChangeListener.d(activity, str)) {
                return true;
            }
        }
        return false;
    }

    private static boolean b(Context context, String str) {
        boolean z;
        if (copyWindowDataInto.b(context, str) == 0) {
            z = true;
            return z;
        }
        z = false;
        return z;
    }

    public static boolean c(Context context, String... strArr) {
        for (String str : strArr) {
            Integer num = (Integer) e.get(str);
            boolean z = true;
            if (num != null) {
                z = true;
                if (Build.VERSION.SDK_INT < num.intValue()) {
                    z = false;
                }
            }
            if (z && !b(context, str)) {
                return false;
            }
        }
        return true;
    }

    public static boolean c(int... iArr) {
        if (iArr.length == 0) {
            return false;
        }
        for (int i : iArr) {
            if (i != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean e(Fragment fragment, String... strArr) {
        for (String str : strArr) {
            if (fragment.shouldShowRequestPermissionRationale(str)) {
                return true;
            }
        }
        return false;
    }
}
