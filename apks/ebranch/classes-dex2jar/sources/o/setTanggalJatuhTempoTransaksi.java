package o;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
/* loaded from: classes-dex2jar.jar:o/setTanggalJatuhTempoTransaksi.class */
public final class setTanggalJatuhTempoTransaksi extends copyWindowDataInto {
    @ResultIgnorabilityUnspecified
    @Deprecated
    public static Intent e(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        if (!setTipeNasabahPengirim.c()) {
            return context.registerReceiver(broadcastReceiver, intentFilter);
        }
        return context.registerReceiver(broadcastReceiver, intentFilter, true != setTipeNasabahPengirim.c() ? 0 : 2);
    }
}
