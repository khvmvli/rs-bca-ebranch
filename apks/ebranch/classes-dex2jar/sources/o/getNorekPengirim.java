package o;

import android.os.PowerManager;
import android.os.Process;
import android.text.TextUtils;
@Deprecated
/* loaded from: classes-dex2jar.jar:o/getNorekPengirim.class */
public final class getNorekPengirim {
    public static String a(PowerManager.WakeLock wakeLock, String str) {
        long myPid = (long) Process.myPid();
        long identityHashCode = (long) System.identityHashCode(wakeLock);
        String str2 = str;
        if (true == TextUtils.isEmpty(str)) {
            str2 = "";
        }
        return String.valueOf(String.valueOf((myPid << 32) | identityHashCode)).concat(String.valueOf(str2));
    }
}
