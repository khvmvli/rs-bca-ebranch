package o;

import android.os.Bundle;
import o.realmSet;
/* loaded from: classes2-dex2jar.jar:o/realmSet$accounts.class */
public final class realmSet$accounts implements Runnable {
    final long a;
    final /* synthetic */ realmGet$setorans b;
    final long d;

    public realmSet$accounts(realmGet$setorans realmget_setorans, long j, long j2) {
        this.b = realmget_setorans;
        this.d = j;
        this.a = j2;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [o.realmSet$RepresentativeName, o.realmSet$eChannels] */
    @Override // java.lang.Runnable
    public final void run() {
        this.b.e.q.o_().b(new Runnable(this) { // from class: o.realmGet$klirings
            private final realmSet$accounts c;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.c = r4;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [o.realmSet$RepresentativeName, o.realmSet$eChannels] */
            /* JADX WARN: Type inference failed for: r0v16, types: [o.realmSet$RepresentativeName, o.realmSet$eChannels] */
            /* JADX WARN: Type inference failed for: r0v24, types: [o.realmSet$RepresentativeName, o.realmSet$eChannels] */
            /* JADX WARN: Type inference failed for: r0v36, types: [o.realmSet$RepresentativeName, o.realmSet$eChannels] */
            /* JADX WARN: Type inference failed for: r0v58, types: [o.realmSet$RepresentativeName, o.realmSet$eChannels] */
            /* JADX WARN: Type inference failed for: r0v9, types: [o.realmSet$RepresentativeName, o.realmSet$eChannels] */
            @Override // java.lang.Runnable
            public final void run() {
                realmSet$accounts realmset_accounts = this.c;
                realmGet$setorans realmget_setorans = realmset_accounts.b;
                long j = realmset_accounts.d;
                long j2 = realmset_accounts.a;
                realmget_setorans.e.r_();
                realmget_setorans.e.q.s_().h().b("Application going to the background");
                boolean z = true;
                if (realmget_setorans.e.q.t().c((String) null, realmSet.hasDone.Z)) {
                    realmget_setorans.e.q.q().l.d(true);
                }
                Bundle bundle = new Bundle();
                if (!realmget_setorans.e.q.t().g()) {
                    realmget_setorans.e.c.a(j2);
                    if (realmget_setorans.e.q.t().c((String) null, realmSet.hasDone.P)) {
                        realmGet$verified realmget_verified = realmget_setorans.e.c;
                        long j3 = realmget_verified.e;
                        realmget_verified.e = j2;
                        bundle.putLong("_et", j2 - j3);
                        getIdType.b(((realmSet.descTransaksi) realmget_setorans.e).q.I().d(true), bundle, true);
                    } else {
                        z = false;
                    }
                    realmget_setorans.e.c.b(false, z, j2);
                }
                ((realmSet.descTransaksi) realmget_setorans.e).q.x().e("auto", "_ab", j, bundle);
            }
        });
    }
}
