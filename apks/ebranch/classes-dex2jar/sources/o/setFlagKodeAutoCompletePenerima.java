package o;

import android.os.Bundle;
import android.os.Parcelable;
/* loaded from: classes-dex2jar.jar:o/setFlagKodeAutoCompletePenerima.class */
public final class setFlagKodeAutoCompletePenerima {
    private setFlagKodeAutoCompletePenerima() {
    }

    public static Parcelable c(Bundle bundle, String str) {
        ClassLoader e = e();
        bundle.setClassLoader(e);
        Bundle bundle2 = bundle.getBundle("map_state");
        if (bundle2 == null) {
            return null;
        }
        bundle2.setClassLoader(e);
        return bundle2.getParcelable(str);
    }

    public static void c(Bundle bundle, Bundle bundle2) {
        if (bundle != null && bundle2 != null) {
            Parcelable c = c(bundle, "MapOptions");
            if (c != null) {
                c(bundle2, "MapOptions", c);
            }
            Parcelable c2 = c(bundle, "StreetViewPanoramaOptions");
            if (c2 != null) {
                c(bundle2, "StreetViewPanoramaOptions", c2);
            }
            Parcelable c3 = c(bundle, "camera");
            if (c3 != null) {
                c(bundle2, "camera", c3);
            }
            if (bundle.containsKey("position")) {
                bundle2.putString("position", bundle.getString("position"));
            }
            if (bundle.containsKey("com.google.android.wearable.compat.extra.LOWBIT_AMBIENT")) {
                bundle2.putBoolean("com.google.android.wearable.compat.extra.LOWBIT_AMBIENT", bundle.getBoolean("com.google.android.wearable.compat.extra.LOWBIT_AMBIENT", false));
            }
        }
    }

    public static void c(Bundle bundle, String str, Parcelable parcelable) {
        ClassLoader e = e();
        bundle.setClassLoader(e);
        Bundle bundle2 = bundle.getBundle("map_state");
        Bundle bundle3 = bundle2;
        if (bundle2 == null) {
            bundle3 = new Bundle();
        }
        bundle3.setClassLoader(e);
        bundle3.putParcelable(str, parcelable);
        bundle.putBundle("map_state", bundle3);
    }

    private static ClassLoader e() {
        return (ClassLoader) setFotoKtp.b(setFlagKodeAutoCompletePenerima.class.getClassLoader());
    }
}
