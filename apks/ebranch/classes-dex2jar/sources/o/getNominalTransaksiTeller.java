package o;

import android.os.Bundle;
import java.util.Map;
import o.realmGet;
import o.realmSet;
/* loaded from: classes-dex2jar.jar:o/getNominalTransaksiTeller.class */
public final class getNominalTransaksiTeller extends realmSet$descTransaksi {
    private long a;
    private final Map<String, Integer> e = new setThumbTextPadding();
    private final Map<String, Long> d = new setThumbTextPadding();

    public getNominalTransaksiTeller(realmGet.TxnPurpose txnPurpose) {
        new realmSet.RepresentativeName(txnPurpose) { // from class: o.realmSet$descTransaksi
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                setFotoKtp.b(r4);
            }

            public final void r_() {
                this.q.o_().r_();
            }
        };
    }

    private final void a(String str, long j, getAcctNo getacctno) {
        if (getacctno == null) {
            ((realmSet.RepresentativeName) this).q.s_().i().b("Not logging ad unit exposure. No active activity");
        } else if (j < 1000) {
            ((realmSet.RepresentativeName) this).q.s_().i().e("Not logging ad unit exposure. Less than 1000 ms. exposure", Long.valueOf(j));
        } else {
            Bundle bundle = new Bundle();
            bundle.putString("_ai", str);
            bundle.putLong("_xt", j);
            getIdType.b(getacctno, bundle, true);
            ((realmSet$descTransaksi) this).q.x().e("am", "_xu", bundle);
        }
    }

    private final void c(long j, getAcctNo getacctno) {
        if (getacctno == null) {
            ((realmSet.RepresentativeName) this).q.s_().i().b("Not logging ad exposure. No active activity");
        } else if (j < 1000) {
            ((realmSet.RepresentativeName) this).q.s_().i().e("Not logging ad exposure. Less than 1000 ms. exposure", Long.valueOf(j));
        } else {
            Bundle bundle = new Bundle();
            bundle.putLong("_xt", j);
            getIdType.b(getacctno, bundle, true);
            ((realmSet$descTransaksi) this).q.x().e("am", "_xa", bundle);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e(long j) {
        for (String str : this.d.keySet()) {
            this.d.put(str, Long.valueOf(j));
        }
        if (!this.d.isEmpty()) {
            this.a = j;
        }
    }

    public final void c(long j) {
        getAcctNo d = ((realmSet$descTransaksi) this).q.I().d(false);
        for (String str : this.d.keySet()) {
            a(str, j - this.d.get(str).longValue(), d);
        }
        if (!this.d.isEmpty()) {
            c(j - this.a, d);
        }
        e(j);
    }
}
