package o;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Process;
import android.os.WorkSource;
import android.util.Log;
import java.lang.reflect.Method;
/* loaded from: classes-dex2jar.jar:o/getTotalNominal.class */
public class getTotalNominal {
    private static final Method a;
    private static final Method b;
    private static final int c = Process.myUid();
    private static final Method d;
    private static final Method e;
    private static final Method f;
    private static final Method g;
    private static Boolean h;
    private static final Method i;
    private static final Method j;

    /* JADX WARN: Removed duplicated region for block: B:34:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0116 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    static {
        /*
        // Method dump skipped, instructions count: 317
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getTotalNominal.m670clinit():void");
    }

    private getTotalNominal() {
    }

    public static String b(WorkSource workSource, int i2) {
        Method method = f;
        if (method == null) {
            return null;
        }
        try {
            return (String) method.invoke(workSource, Integer.valueOf(i2));
        } catch (Exception e2) {
            Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e2);
            return null;
        }
    }

    public static int d(WorkSource workSource) {
        Method method = a;
        if (method == null) {
            return 0;
        }
        try {
            Object invoke = method.invoke(workSource, new Object[0]);
            if (invoke != null) {
                return ((Integer) invoke).intValue();
            }
            throw new NullPointerException("null reference");
        } catch (Exception e2) {
            Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e2);
            return 0;
        }
    }

    public static WorkSource d(Context context, String str) {
        if (context == null || context.getPackageManager() == null || str == null) {
            return null;
        }
        try {
            ApplicationInfo c2 = realmGet$jenisWarkatTransaksi.a.e(context).c(str, 0);
            if (c2 == null) {
                Log.e("WorkSourceUtil", "Could not get applicationInfo from package: ".concat(str));
                return null;
            }
            int i2 = c2.uid;
            WorkSource workSource = new WorkSource();
            Method method = e;
            if (method != null) {
                String str2 = str;
                if (str == null) {
                    str2 = "";
                }
                try {
                    method.invoke(workSource, Integer.valueOf(i2), str2);
                } catch (Exception e2) {
                    Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e2);
                }
            } else {
                Method method2 = b;
                if (method2 != null) {
                    try {
                        method2.invoke(workSource, Integer.valueOf(i2));
                    } catch (Exception e3) {
                        Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e3);
                    }
                }
            }
            return workSource;
        } catch (PackageManager.NameNotFoundException e4) {
            Log.e("WorkSourceUtil", "Could not find package: ".concat(str));
            return null;
        }
    }

    public static boolean d(Context context) {
        synchronized (getTotalNominal.class) {
            try {
                Boolean bool = h;
                if (bool != null) {
                    return bool.booleanValue();
                }
                boolean z = false;
                if (context == null) {
                    return false;
                }
                if (copyWindowDataInto.b(context, "android.permission.UPDATE_DEVICE_STATS") == 0) {
                    z = true;
                }
                Boolean valueOf = Boolean.valueOf(z);
                h = valueOf;
                return valueOf.booleanValue();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
