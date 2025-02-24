package o;

import android.os.Bundle;
import com.google.firebase.analytics.connector.internal.zzc;
import com.google.firebase.analytics.connector.internal.zzg;
/* loaded from: classes2-dex2jar.jar:o/PilihJenisIdentitasPemilikSumberDanaDialog_ViewBinding.class */
public final class PilihJenisIdentitasPemilikSumberDanaDialog_ViewBinding implements Kliring {
    final /* synthetic */ zzg c;

    public PilihJenisIdentitasPemilikSumberDanaDialog_ViewBinding(zzg zzg) {
        this.c = zzg;
    }

    public final void d(String str, String str2, Bundle bundle, long j) {
        if (str != null && !str.equals("crash") && zzc.zzc(str2)) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("name", str2);
            bundle2.putLong("timestampInMillis", j);
            bundle2.putBundle("params", bundle);
            this.c.zza.onMessageTriggered(3, bundle2);
        }
    }
}
