package o;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
/* loaded from: classes-dex2jar.jar:o/setFlagWeekendBankingSunday.class */
final class setFlagWeekendBankingSunday implements setProvince, ComponentCallbacks2 {
    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        onTrimMemory(20);
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
    }
}
