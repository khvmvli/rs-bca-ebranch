package o;

import android.os.Build;
import android.os.Trace;
import android.util.Log;
import java.lang.reflect.Method;
@Deprecated
/* loaded from: classes-dex2jar.jar:o/setDrawerShadow.class */
public final class setDrawerShadow {
    private static Method a;
    private static Method b;
    private static Method c;
    private static Method d;
    private static long e;

    static {
        if (Build.VERSION.SDK_INT < 29) {
            try {
                e = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                d = Trace.class.getMethod("isTagEnabled", Long.TYPE);
                a = Trace.class.getMethod("asyncTraceBegin", Long.TYPE, String.class, Integer.TYPE);
                b = Trace.class.getMethod("asyncTraceEnd", Long.TYPE, String.class, Integer.TYPE);
                c = Trace.class.getMethod("traceCounter", Long.TYPE, String.class, Integer.TYPE);
            } catch (Exception e2) {
                Log.i("TraceCompat", "Unable to initialize via reflection.", e2);
            }
        }
    }

    public static void b(String str) {
        Trace.beginSection(str);
    }

    public static void e() {
        Trace.endSection();
    }
}
