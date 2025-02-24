package o;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.StrictMode;
import java.util.Iterator;
import java.util.Map;
/* loaded from: classes-dex2jar.jar:o/realmSet$officePosition.class */
public final class realmSet$officePosition implements realmSet$flagSubmitSupplement {
    private static final Map<String, realmSet$officePosition> e = new setThumbTextPadding();
    private final SharedPreferences.OnSharedPreferenceChangeListener a;
    private final SharedPreferences b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static realmSet$officePosition d(Context context, String str) {
        realmSet$officePosition realmset_officeposition;
        if (!realmSet$emergencyContactPhoneNumber.e()) {
            synchronized (realmSet$officePosition.class) {
                try {
                    realmset_officeposition = e.get(null);
                    if (realmset_officeposition == null) {
                        StrictMode.allowThreadDiskReads();
                        throw null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return realmset_officeposition;
        }
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void d() {
        synchronized (realmSet$officePosition.class) {
            try {
                Map<String, realmSet$officePosition> map = e;
                Iterator<realmSet$officePosition> it = map.values().iterator();
                if (!it.hasNext()) {
                    map.clear();
                } else {
                    realmSet$officePosition next = it.next();
                    SharedPreferences sharedPreferences = next.b;
                    SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener = next.a;
                    throw null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // o.realmSet$flagSubmitSupplement
    public final Object b(String str) {
        throw null;
    }
}
