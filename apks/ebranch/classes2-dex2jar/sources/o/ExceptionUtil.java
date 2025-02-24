package o;

import android.util.Log;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
/* loaded from: classes2-dex2jar.jar:o/ExceptionUtil.class */
public final class ExceptionUtil {
    public final Map<Class<? extends Throwable>, Integer> e = new HashMap();

    public final Integer d(Throwable th) {
        Throwable cause;
        int i = 20;
        Throwable th2 = th;
        do {
            Class<?> cls = th2.getClass();
            Integer num = this.e.get(cls);
            Integer num2 = num;
            if (num == null) {
                Iterator<Map.Entry<Class<? extends Throwable>, Integer>> it = this.e.entrySet().iterator();
                Class<? extends Throwable> cls2 = null;
                while (true) {
                    num2 = num;
                    if (!it.hasNext()) {
                        break;
                    }
                    Map.Entry<Class<? extends Throwable>, Integer> next = it.next();
                    Class<? extends Throwable> key = next.getKey();
                    if (key.isAssignableFrom(cls) && (cls2 == null || cls2.isAssignableFrom(key))) {
                        num = next.getValue();
                        cls2 = key;
                    }
                }
            }
            if (num2 != null) {
                return num2;
            }
            cause = th2.getCause();
            i--;
            if (i <= 0 || cause == th) {
                break;
            }
            th2 = cause;
        } while (cause != null);
        StringBuilder sb = new StringBuilder("No specific message resource ID found for ");
        sb.append(th);
        Log.d("EventBus", sb.toString());
        return null;
    }
}
