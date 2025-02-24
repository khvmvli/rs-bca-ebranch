package o;

import android.os.Trace;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
/* loaded from: classes-dex2jar.jar:o/setBackgroundColor.class */
public final class setBackgroundColor {
    private static Method b;
    private static long c;

    public static boolean a() {
        try {
            if (b == null) {
                return Trace.isEnabled();
            }
        } catch (NoClassDefFoundError | NoSuchMethodError e) {
        }
        return b();
    }

    private static boolean b() {
        try {
            if (b == null) {
                c = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                b = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) b.invoke(null, Long.valueOf(c))).booleanValue();
        } catch (Exception e) {
            if (e instanceof InvocationTargetException) {
                Throwable cause = e.getCause();
                if (cause instanceof RuntimeException) {
                    throw ((RuntimeException) cause);
                }
                throw new RuntimeException(cause);
            }
            StringBuilder sb = new StringBuilder("Unable to call ");
            sb.append("isTagEnabled");
            sb.append(" via reflection");
            Log.v("Trace", sb.toString(), e);
            return false;
        }
    }
}
