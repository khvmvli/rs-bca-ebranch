package o;

import android.util.Log;
/* loaded from: classes-dex2jar.jar:o/getFlagMB.class */
public final class getFlagMB {
    public static void b(String str, String str2, Object obj) {
        StringBuilder sb = new StringBuilder("TransportRuntime.");
        sb.append(str);
        Log.d(sb.toString(), String.format(str2, obj));
    }

    public static void d(String str, String str2, Object... objArr) {
        StringBuilder sb = new StringBuilder("TransportRuntime.");
        sb.append(str);
        Log.d(sb.toString(), String.format(str2, objArr));
    }
}
