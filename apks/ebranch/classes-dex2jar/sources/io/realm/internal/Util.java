package io.realm.internal;

import android.os.Build;
import io.realm.RealmModel;
import io.realm.RealmObject;
import io.realm.internal.android.AndroidCapabilities;
import io.realm.log.RealmLog;
import java.io.File;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;
/* loaded from: classes-dex2jar.jar:io/realm/internal/Util.class */
public class Util {
    private static Boolean coroutinesAvailable;
    private static Boolean rxJavaAvailable;

    public static void checkContainsKey(String str, Map<String, ?> map, String str2) {
        if (!map.containsKey(str)) {
            StringBuilder sb = new StringBuilder("Key '");
            sb.append(str);
            sb.append("' required in '");
            sb.append(str2);
            sb.append("'.");
            throw new IllegalArgumentException(sb.toString());
        }
    }

    public static void checkEmpty(String str, String str2) {
        if (isEmptyString(str)) {
            StringBuilder sb = new StringBuilder("Non-empty '");
            sb.append(str2);
            sb.append("' required.");
            throw new IllegalArgumentException(sb.toString());
        }
    }

    public static void checkLooperThread(String str) {
        new AndroidCapabilities().checkCanDeliverNotification(str);
    }

    public static void checkNotOnMainThread(String str) {
        if (new AndroidCapabilities().isMainThread()) {
            throw new IllegalStateException(str);
        }
    }

    public static void checkNull(@Nullable Object obj, String str) {
        if (obj == null) {
            StringBuilder sb = new StringBuilder("Nonnull '");
            sb.append(str);
            sb.append("' required.");
            throw new IllegalArgumentException(sb.toString());
        }
    }

    public static boolean deleteRealm(String str, File file, String str2) {
        boolean z;
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        sb.append(".management");
        File file2 = new File(file, sb.toString());
        File file3 = new File(str);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(".note");
        File file4 = new File(sb2.toString());
        File[] listFiles = file2.listFiles();
        if (listFiles != null) {
            for (File file5 : listFiles) {
                if (!file5.delete()) {
                    RealmLog.warn(String.format(Locale.ENGLISH, "Realm temporary file at %s cannot be deleted", file5.getAbsolutePath()), new Object[0]);
                }
            }
        }
        if (file2.exists() && !file2.delete()) {
            RealmLog.warn(String.format(Locale.ENGLISH, "Realm temporary folder at %s cannot be deleted", file2.getAbsolutePath()), new Object[0]);
        }
        if (file3.exists()) {
            boolean delete = file3.delete();
            z = delete;
            if (!delete) {
                RealmLog.warn(String.format(Locale.ENGLISH, "Realm file at %s cannot be deleted", file3.getAbsolutePath()), new Object[0]);
                z = delete;
            }
        } else {
            z = true;
        }
        if (file4.exists() && !file4.delete()) {
            RealmLog.warn(String.format(Locale.ENGLISH, ".note file at %s cannot be deleted", file4.getAbsolutePath()), new Object[0]);
        }
        return z;
    }

    public static Class<?> getClassForName(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            StringBuilder sb = new StringBuilder("Class '");
            sb.append(str);
            sb.append("' does not exist.");
            throw new IllegalArgumentException(sb.toString());
        }
    }

    public static Class<? extends RealmModel> getOriginalModelClass(Class<? extends RealmModel> cls) {
        if (cls.equals(RealmModel.class) || cls.equals(RealmObject.class)) {
            throw new IllegalArgumentException("RealmModel or RealmObject was passed as an argument. Only subclasses of these can be used as arguments to methods that accept a Realm model class.");
        }
        Class<? super Object> superclass = cls.getSuperclass();
        Class<? extends RealmModel> cls2 = cls;
        if (!superclass.equals(Object.class)) {
            cls2 = cls;
            if (!superclass.equals(RealmObject.class)) {
                cls2 = superclass;
            }
        }
        return cls2;
    }

    public static String getStackTrace(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter((Writer) stringWriter, true));
        return stringWriter.getBuffer().toString();
    }

    public static String getTablePrefix() {
        return nativeGetTablePrefix();
    }

    public static boolean isCoroutinesAvailable() {
        boolean booleanValue;
        synchronized (Util.class) {
            try {
                if (coroutinesAvailable == null) {
                    try {
                        Class.forName("o.getMethod");
                        coroutinesAvailable = Boolean.TRUE;
                    } catch (ClassNotFoundException e) {
                        coroutinesAvailable = Boolean.FALSE;
                    }
                }
                booleanValue = coroutinesAvailable.booleanValue();
            } catch (Throwable th) {
                throw th;
            }
        }
        return booleanValue;
    }

    public static boolean isEmptyString(@Nullable String str) {
        return str == null || str.length() == 0;
    }

    public static boolean isEmulator() {
        return Build.FINGERPRINT.startsWith("generic") || Build.FINGERPRINT.startsWith("unknown") || Build.MODEL.contains("google_sdk") || Build.MODEL.contains("Emulator") || Build.MODEL.contains("Android SDK built for x86") || Build.MANUFACTURER.contains("Genymotion") || (Build.BRAND.startsWith("generic") && Build.DEVICE.startsWith("generic")) || "google_sdk".equals(Build.PRODUCT);
    }

    public static boolean isRxJavaAvailable() {
        boolean booleanValue;
        synchronized (Util.class) {
            try {
                if (rxJavaAvailable == null) {
                    try {
                        Class.forName("o.Page6DTahapanXpresiSFragment_ViewBinding");
                        rxJavaAvailable = Boolean.TRUE;
                    } catch (ClassNotFoundException e) {
                        rxJavaAvailable = Boolean.FALSE;
                    }
                }
                booleanValue = rxJavaAvailable.booleanValue();
            } catch (Throwable th) {
                throw th;
            }
        }
        return booleanValue;
    }

    static native String nativeGetTablePrefix();

    public static <T> Set<T> toSet(T... tArr) {
        if (tArr == null) {
            return Collections.emptySet();
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (T t : tArr) {
            if (t != null) {
                linkedHashSet.add(t);
            }
        }
        return linkedHashSet;
    }
}
