package o;

import android.util.Log;
import java.io.File;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* loaded from: classes-dex2jar.jar:o/setResponseBody.class */
public final class setResponseBody {
    private static Map<Class<?>, Map<String, Integer>> b = new ConcurrentHashMap();

    public static int c(Class<?> cls, String str) {
        Map<String, Integer> map;
        if (!b.containsKey(cls)) {
            map = new ConcurrentHashMap<>();
            b.put(cls, map);
        } else {
            map = b.get(cls);
        }
        if (map.containsKey(str)) {
            return map.get(str).intValue();
        }
        try {
            int i = cls.getField(str).getInt(null);
            if (i != 0) {
                map.put(str, Integer.valueOf(i));
            }
            return i;
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder("Failed to retrieve identifier: type=");
            sb.append(cls);
            sb.append(" name=");
            sb.append(str);
            Log.e("JodaTimeAndroid", sb.toString(), e);
            return 0;
        }
    }

    private static String c(String str) {
        File parentFile;
        File file = new File(str);
        ArrayList arrayList = new ArrayList();
        do {
            arrayList.add(file.getName());
            parentFile = file.getParentFile();
            file = parentFile;
        } while (parentFile != null);
        StringBuffer stringBuffer = new StringBuffer();
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (stringBuffer.length() > 0) {
                stringBuffer.append("_");
            }
            stringBuffer.append((String) arrayList.get(size));
        }
        return stringBuffer.toString().replace('-', '_').replace("+", "plus").toLowerCase(Locale.US);
    }

    public static String d(String str) {
        StringBuilder sb = new StringBuilder("joda_");
        sb.append(c(str));
        return sb.toString();
    }
}
