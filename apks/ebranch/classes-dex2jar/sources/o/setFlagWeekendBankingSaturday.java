package o;

import android.content.Context;
import android.util.Log;
import o.setFlagReservationTellerPrioritas;
/* loaded from: classes-dex2jar.jar:o/setFlagWeekendBankingSaturday.class */
public final class setFlagWeekendBankingSaturday implements setFlagReservationCsoSolitaire {
    @Override // o.setFlagReservationCsoSolitaire
    public final setFlagReservationTellerPrioritas d(Context context, setFlagReservationTellerPrioritas.IconCompatParcelizer iconCompatParcelizer) {
        boolean z = copyWindowDataInto.b(context, "android.permission.ACCESS_NETWORK_STATE") == 0;
        if (Log.isLoggable("ConnectivityMonitor", 3)) {
            Log.d("ConnectivityMonitor", z ? "ACCESS_NETWORK_STATE permission granted, registering connectivity monitor" : "ACCESS_NETWORK_STATE permission missing, cannot register connectivity monitor");
        }
        return z ? new setLocationType(context, iconCompatParcelizer) : new setRegionCode();
    }
}
