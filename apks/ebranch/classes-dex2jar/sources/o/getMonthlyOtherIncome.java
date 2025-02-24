package o;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
/* loaded from: classes-dex2jar.jar:o/getMonthlyOtherIncome.class */
public final class getMonthlyOtherIncome {
    public static final int e;

    static {
        int i = 0;
        if (Build.VERSION.SDK_INT >= 30) {
            i = 0;
            if (Build.VERSION.CODENAME.length() == 1) {
                i = 0;
                if (Build.VERSION.CODENAME.charAt(0) >= 'S') {
                    i = 0;
                    if (Build.VERSION.CODENAME.charAt(0) <= 'Z') {
                        i = 33554432;
                    }
                }
            }
        }
        e = i;
    }

    public static PendingIntent b(Context context, int i, Intent intent, int i2) {
        return PendingIntent.getBroadcast(context, 0, intent, i2);
    }
}
