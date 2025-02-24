package o;

import android.os.Bundle;
import com.google.firebase.analytics.connector.internal.zzc;
import com.google.firebase.analytics.connector.internal.zze;
/* loaded from: classes2-dex2jar.jar:o/PilihJenisIdentitasDialog.class */
public final class PilihJenisIdentitasDialog implements Kliring {
    final /* synthetic */ zze d;

    public PilihJenisIdentitasDialog(zze zze) {
        this.d = zze;
    }

    public final void d(String str, String str2, Bundle bundle, long j) {
        if (this.d.zza.contains(str2)) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("events", zzc.zzk(str2));
            this.d.zzb.onMessageTriggered(2, bundle2);
        }
    }
}
