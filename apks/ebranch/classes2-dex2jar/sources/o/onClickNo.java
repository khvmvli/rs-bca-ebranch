package o;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.crashlytics.internal.Logger;
/* loaded from: classes2-dex2jar.jar:o/onClickNo.class */
public final class onClickNo {
    public final Float b;
    public final boolean d;

    private onClickNo(Float f, boolean z) {
        this.d = z;
        this.b = f;
    }

    public static onClickNo d(Context context) {
        Float f;
        boolean z = false;
        z = false;
        boolean z2 = false;
        try {
            Intent registerReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            f = null;
            if (registerReceiver != null) {
                int intExtra = registerReceiver.getIntExtra("status", -1);
                if (intExtra != -1 && (intExtra == 2 || intExtra == 5)) {
                    z2 = true;
                }
                int intExtra2 = registerReceiver.getIntExtra(FirebaseAnalytics.Param.LEVEL, -1);
                z = z2;
                int intExtra3 = registerReceiver.getIntExtra("scale", -1);
                f = null;
                z = z2;
                if (intExtra2 != -1) {
                    f = null;
                    z = z2;
                    if (intExtra3 != -1) {
                        f = Float.valueOf(((float) intExtra2) / ((float) intExtra3));
                        z = z2;
                    }
                }
            }
        } catch (IllegalStateException e) {
            Logger.getLogger().e("An error occurred getting battery state.", e);
            f = null;
        }
        return new onClickNo(f, z);
    }
}
