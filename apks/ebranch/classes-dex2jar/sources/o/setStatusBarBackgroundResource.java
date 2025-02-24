package o;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
/* loaded from: classes-dex2jar.jar:o/setStatusBarBackgroundResource.class */
public final class setStatusBarBackgroundResource {
    public static Intent b(Activity activity) {
        Intent parentActivityIntent = activity.getParentActivityIntent();
        if (parentActivityIntent != null) {
            return parentActivityIntent;
        }
        String c = c(activity);
        if (c == null) {
            return null;
        }
        ComponentName componentName = new ComponentName(activity, c);
        try {
            return b(activity, componentName) == null ? Intent.makeMainActivity(componentName) : new Intent().setComponent(componentName);
        } catch (PackageManager.NameNotFoundException e) {
            StringBuilder sb = new StringBuilder("getParentActivityIntent: bad parentActivityName '");
            sb.append(c);
            sb.append("' in manifest");
            Log.e("NavUtils", sb.toString());
            return null;
        }
    }

    private static String b(Context context, ComponentName componentName) throws PackageManager.NameNotFoundException {
        ActivityInfo activityInfo = context.getPackageManager().getActivityInfo(componentName, Build.VERSION.SDK_INT >= 29 ? 269222528 : Build.VERSION.SDK_INT >= 24 ? 787072 : 640);
        String str = activityInfo.parentActivityName;
        if (str != null) {
            return str;
        }
        if (activityInfo.metaData == null) {
            return null;
        }
        Bundle bundle = activityInfo.metaData;
        String str2 = ".activity.TransactionActivity";
        if (".activity.TransactionActivity".charAt(0) == '.') {
            StringBuilder sb = new StringBuilder();
            sb.append(context.getPackageName());
            sb.append(".activity.TransactionActivity");
            str2 = sb.toString();
        }
        return str2;
    }

    public static String c(Activity activity) {
        try {
            return b(activity, activity.getComponentName());
        } catch (PackageManager.NameNotFoundException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static Intent e(Context context, ComponentName componentName) throws PackageManager.NameNotFoundException {
        String b = b(context, componentName);
        if (b == null) {
            return null;
        }
        ComponentName componentName2 = new ComponentName(componentName.getPackageName(), b);
        return b(context, componentName2) == null ? Intent.makeMainActivity(componentName2) : new Intent().setComponent(componentName2);
    }
}
