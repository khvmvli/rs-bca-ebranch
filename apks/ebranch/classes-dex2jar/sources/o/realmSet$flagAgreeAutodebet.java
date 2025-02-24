package o;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.database.Cursor;
import android.net.Uri;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;
/* loaded from: classes-dex2jar.jar:o/realmSet$flagAgreeAutodebet.class */
public final class realmSet$flagAgreeAutodebet {
    static HashMap<String, String> c;
    private static boolean l;

    /* renamed from: o */
    private static Object f186o;
    public static final Uri d = Uri.parse("content://com.google.android.gsf.gservices");
    public static final Uri b = Uri.parse("content://com.google.android.gsf.gservices/prefix");
    public static final Pattern a = Pattern.compile("^(1|true|t|on|yes|y)$", 2);
    public static final Pattern e = Pattern.compile("^(0|false|f|off|no|n)$", 2);
    private static final AtomicBoolean m = new AtomicBoolean();
    static final HashMap<String, Boolean> f = new HashMap<>();
    static final HashMap<String, Integer> h = new HashMap<>();
    static final HashMap<String, Long> j = new HashMap<>();
    static final HashMap<String, Float> i = new HashMap<>();
    static final String[] g = new String[0];

    /* JADX WARN: Finally extract failed */
    public static String c(ContentResolver contentResolver, String str, String str2) {
        synchronized (realmSet$flagAgreeAutodebet.class) {
            try {
                String str3 = null;
                String str4 = null;
                if (c == null) {
                    m.set(false);
                    c = new HashMap<>();
                    f186o = new Object();
                    l = false;
                    contentResolver.registerContentObserver(d, true, new ContentObserver(null) { // from class: o.realmSet$emergencyContactName
                        @Override // android.database.ContentObserver
                        public final void onChange(boolean z) {
                            realmSet$flagAgreeAutodebet.m.set(true);
                        }
                    });
                } else if (m.getAndSet(false)) {
                    c.clear();
                    f.clear();
                    h.clear();
                    j.clear();
                    i.clear();
                    f186o = new Object();
                    l = false;
                }
                Object obj = f186o;
                if (c.containsKey(str)) {
                    str4 = c.get(str);
                    if (str4 == null) {
                    }
                    return str4;
                }
                int length = g.length;
                Cursor query = contentResolver.query(d, null, null, new String[]{str}, null);
                if (query == null) {
                    return null;
                }
                try {
                    if (!query.moveToFirst()) {
                        e(obj, str, null);
                        query.close();
                        return null;
                    }
                    String string = query.getString(1);
                    str3 = string;
                    if (string != null) {
                        str3 = string;
                        if (string.equals(null)) {
                            str3 = null;
                        }
                    }
                    e(obj, str, str3);
                    if (str3 == null) {
                    }
                    query.close();
                    return str3;
                } catch (Throwable th) {
                    query.close();
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private static void e(Object obj, String str, String str2) {
        synchronized (realmSet$flagAgreeAutodebet.class) {
            try {
                if (obj == f186o) {
                    c.put(str, str2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
