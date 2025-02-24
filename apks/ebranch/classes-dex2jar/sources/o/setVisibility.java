package o;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.util.Log;
/* loaded from: classes-dex2jar.jar:o/setVisibility.class */
final class setVisibility {
    static setVisibility e;
    final IconCompatParcelizer b = new IconCompatParcelizer();
    private final LocationManager c;
    final Context d;

    /* loaded from: classes-dex2jar.jar:o/setVisibility$IconCompatParcelizer.class */
    static final class IconCompatParcelizer {
        long a;
        boolean b;
        long c;
        long d;
        long e;
        long h;

        IconCompatParcelizer() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public setVisibility(Context context, LocationManager locationManager) {
        this.d = context;
        this.c = locationManager;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Location a(String str) {
        try {
            if (this.c.isProviderEnabled(str)) {
                return this.c.getLastKnownLocation(str);
            }
            return null;
        } catch (Exception e2) {
            Log.d("TwilightManager", "Failed to get last known location", e2);
            return null;
        }
    }
}
