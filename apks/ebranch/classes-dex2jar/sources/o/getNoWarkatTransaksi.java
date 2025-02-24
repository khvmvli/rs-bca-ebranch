package o;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import io.realm.internal.Property;
/* loaded from: classes-dex2jar.jar:o/getNoWarkatTransaksi.class */
public final class getNoWarkatTransaksi {
    public static PackageInfo c(Context context, String str) {
        try {
            return realmGet$jenisWarkatTransaksi.a.e(context).d(str, Property.TYPE_ARRAY);
        } catch (PackageManager.NameNotFoundException e) {
            return null;
        }
    }

    public static boolean c() {
        return false;
    }
}
