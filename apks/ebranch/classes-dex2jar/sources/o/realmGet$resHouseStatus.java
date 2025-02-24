package o;

import android.app.Activity;
/* loaded from: classes-dex2jar.jar:o/realmGet$resHouseStatus.class */
public final class realmGet$resHouseStatus {
    private final Object e;

    public realmGet$resHouseStatus(Activity activity) {
        if (activity != null) {
            this.e = activity;
            return;
        }
        throw new NullPointerException("Activity must not be null");
    }

    public final Activity a() {
        return (Activity) this.e;
    }

    public final boolean b() {
        return this.e instanceof Activity;
    }

    public final boolean c() {
        return this.e instanceof getView;
    }

    public final getView d() {
        return (getView) this.e;
    }
}
