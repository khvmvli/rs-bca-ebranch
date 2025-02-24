package o;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.Iterator;
import o.realmGet;
/* loaded from: classes-dex2jar.jar:o/realmGet$sumberDana.class */
public final class realmGet$sumberDana {
    final long a;
    final String b;
    final long c;
    final String d;
    final String e;
    final realmGet$nomorRekening j;

    realmGet$sumberDana(realmGet.TxnPurpose txnPurpose, String str, String str2, String str3, long j, long j2, Bundle bundle) {
        realmGet$nomorRekening realmget_nomorrekening;
        setFotoKtp.c(str2);
        setFotoKtp.c(str3);
        this.b = str2;
        this.e = str3;
        this.d = true == TextUtils.isEmpty(str) ? null : str;
        this.c = j;
        this.a = j2;
        if (j2 != 0 && j2 > j) {
            txnPurpose.s_().c().e("Event created with reverse previous/current timestamps. appId", setIsInputAtmPemrek.d(str2));
        }
        if (bundle == null || bundle.isEmpty()) {
            realmget_nomorrekening = new realmGet$nomorRekening(new Bundle());
        } else {
            Bundle bundle2 = new Bundle(bundle);
            Iterator<String> it = bundle2.keySet().iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (next == null) {
                    txnPurpose.s_().b().b("Param name can't be null");
                    it.remove();
                } else {
                    Object a = txnPurpose.u().a(next, bundle2.get(next));
                    if (a == null) {
                        txnPurpose.s_().c().e("Param value can't be null", txnPurpose.w().c(next));
                        it.remove();
                    } else {
                        txnPurpose.u().e(bundle2, next, a);
                    }
                }
            }
            realmget_nomorrekening = new realmGet$nomorRekening(bundle2);
        }
        this.j = realmget_nomorrekening;
    }

    private realmGet$sumberDana(realmGet.TxnPurpose txnPurpose, String str, String str2, String str3, long j, long j2, realmGet$nomorRekening realmget_nomorrekening) {
        setFotoKtp.c(str2);
        setFotoKtp.c(str3);
        setFotoKtp.b(realmget_nomorrekening);
        this.b = str2;
        this.e = str3;
        this.d = true == TextUtils.isEmpty(str) ? null : str;
        this.c = j;
        this.a = j2;
        if (j2 != 0 && j2 > j) {
            txnPurpose.s_().c().a("Event created with reverse previous/current timestamps. appId, name", setIsInputAtmPemrek.d(str2), setIsInputAtmPemrek.d(str3));
        }
        this.j = realmget_nomorrekening;
    }

    final realmGet$sumberDana e(realmGet.TxnPurpose txnPurpose, long j) {
        return new realmGet$sumberDana(txnPurpose, this.d, this.b, this.e, this.c, j, this.j);
    }

    public final String toString() {
        String str = this.b;
        String str2 = this.e;
        String valueOf = String.valueOf(this.j);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 33 + String.valueOf(str2).length() + String.valueOf(valueOf).length());
        sb.append("Event{appId='");
        sb.append(str);
        sb.append("', name='");
        sb.append(str2);
        sb.append("', params=");
        sb.append(valueOf);
        sb.append('}');
        return sb.toString();
    }
}
