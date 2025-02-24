package o;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import android.util.Log;
import android.util.SparseArray;
@Deprecated
/* loaded from: classes-dex2jar.jar:o/onLowMemory.class */
public abstract class onLowMemory extends BroadcastReceiver {
    private static final SparseArray<PowerManager.WakeLock> d = new SparseArray<>();
    private static int b = 1;

    public static ComponentName a(Context context, Intent intent) {
        SparseArray<PowerManager.WakeLock> sparseArray = d;
        synchronized (sparseArray) {
            int i = b;
            int i2 = i + 1;
            b = i2;
            if (i2 <= 0) {
                b = 1;
            }
            intent.putExtra("androidx.contentpager.content.wakelockid", i);
            ComponentName startService = context.startService(intent);
            if (startService == null) {
                return null;
            }
            PowerManager powerManager = (PowerManager) context.getSystemService("power");
            StringBuilder sb = new StringBuilder("androidx.core:wake:");
            sb.append(startService.flattenToShortString());
            PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(1, sb.toString());
            newWakeLock.setReferenceCounted(false);
            newWakeLock.acquire(60000);
            sparseArray.put(i, newWakeLock);
            return startService;
        }
    }

    public static boolean e(Intent intent) {
        int intExtra = intent.getIntExtra("androidx.contentpager.content.wakelockid", 0);
        if (intExtra == 0) {
            return false;
        }
        SparseArray<PowerManager.WakeLock> sparseArray = d;
        synchronized (sparseArray) {
            PowerManager.WakeLock wakeLock = sparseArray.get(intExtra);
            if (wakeLock != null) {
                wakeLock.release();
                sparseArray.remove(intExtra);
                return true;
            }
            StringBuilder sb = new StringBuilder("No active wake lock id #");
            sb.append(intExtra);
            Log.w("WakefulBroadcastReceiv.", sb.toString());
            return true;
        }
    }
}
