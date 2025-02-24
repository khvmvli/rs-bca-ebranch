package o;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import io.realm.internal.Property;
/* loaded from: classes-dex2jar.jar:o/setOfficePostCode.class */
public final class setOfficePostCode {
    private static String a;
    private static boolean b;
    private static int c;
    private static final Object e = new Object();

    private static void b(Context context) {
        Bundle bundle;
        synchronized (e) {
            if (!b) {
                b = true;
                try {
                    bundle = realmGet$jenisWarkatTransaksi.b(context).c(context.getPackageName(), Property.TYPE_ARRAY).metaData;
                } catch (PackageManager.NameNotFoundException e2) {
                    Log.wtf("MetadataValueReader", "This should never happen.", e2);
                }
                if (bundle != null) {
                    a = bundle.getString("com.google.app.id");
                    c = realmGet$lastEducation.a;
                }
            }
        }
    }

    public static int c(Context context) {
        b(context);
        return c;
    }
}
