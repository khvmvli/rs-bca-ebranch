package o;

import android.os.Bundle;
import o.realmGet;
import o.realmSet;
/* loaded from: classes2-dex2jar.jar:o/realmGet$verified.class */
public final class realmGet$verified {
    private final realmGet.listWarkat a;
    final /* synthetic */ realmSet$eChannels c;
    protected long d;
    protected long e;

    /* JADX WARN: Multi-variable type inference failed */
    public realmGet$verified(realmSet$eChannels realmset_echannels) {
        this.c = realmset_echannels;
        this.a = new realmGet.listWarkat(realmset_echannels.q) { // from class: o.realmGet$userPhoto
            /* JADX WARN: Type inference failed for: r0v3, types: [o.realmSet$RepresentativeName, o.realmSet$eChannels] */
            /* JADX WARN: Type inference failed for: r1v2, types: [o.realmSet$RepresentativeName, o.realmSet$eChannels] */
            /* JADX WARN: Type inference failed for: r3v1, types: [o.realmSet$RepresentativeName, o.realmSet$eChannels] */
            public final void c() {
                realmGet$verified realmget_verified = realmGet$verified.this;
                realmget_verified.c.r_();
                realmget_verified.b(false, false, realmget_verified.c.q.q_().b());
                ((realmSet.descTransaksi) realmget_verified.c).q.b().c(realmget_verified.c.q.q_().b());
            }
        };
        long b = realmset_echannels.q.q_().b();
        this.d = b;
        this.e = b;
    }

    public final void a(long j) {
        this.a.a();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [o.realmSet$RepresentativeName, o.realmSet$eChannels] */
    /* JADX WARN: Type inference failed for: r0v15, types: [o.realmSet$RepresentativeName, o.realmSet$eChannels] */
    /* JADX WARN: Type inference failed for: r0v22, types: [o.realmSet$RepresentativeName, o.realmSet$eChannels] */
    /* JADX WARN: Type inference failed for: r0v32, types: [o.realmSet$RepresentativeName, o.realmSet$eChannels] */
    /* JADX WARN: Type inference failed for: r0v37, types: [o.realmSet$RepresentativeName, o.realmSet$eChannels] */
    /* JADX WARN: Type inference failed for: r0v6, types: [o.realmSet$RepresentativeName, o.realmSet$eChannels] */
    /* JADX WARN: Type inference failed for: r0v60, types: [o.realmSet$RepresentativeName, o.realmSet$eChannels] */
    /* JADX WARN: Type inference failed for: r0v66, types: [o.realmSet$RepresentativeName, o.realmSet$eChannels] */
    /* JADX WARN: Type inference failed for: r0v75, types: [o.realmSet$RepresentativeName, o.realmSet$eChannels] */
    /* JADX WARN: Type inference failed for: r1v21, types: [o.realmSet$RepresentativeName, o.realmSet$eChannels] */
    /* JADX WARN: Type inference failed for: r1v26, types: [o.realmSet$RepresentativeName, o.realmSet$eChannels] */
    public final boolean b(boolean z, boolean z2, long j) {
        this.c.r_();
        this.c.n();
        getNegaraTujuanPenerima.e();
        if (!this.c.q.t().c((String) null, realmSet.hasDone.W)) {
            this.c.q.q().j.b(this.c.q.q_().e());
        } else if (this.c.q.a()) {
            this.c.q.q().j.b(this.c.q.q_().e());
        }
        long j2 = j - this.d;
        if (z || j2 >= 1000) {
            if (!z2) {
                j2 = j - this.e;
                this.e = j;
            }
            this.c.q.s_().i().e("Recording user engagement, ms", Long.valueOf(j2));
            Bundle bundle = new Bundle();
            bundle.putLong("_et", j2);
            getIdType.b(((realmSet.descTransaksi) this.c).q.I().d(!this.c.q.t().g()), bundle, true);
            if (!this.c.q.t().c((String) null, realmSet.hasDone.s) && z2) {
                bundle.putLong("_fr", 1);
            }
            if (!this.c.q.t().c((String) null, realmSet.hasDone.s) || !z2) {
                ((realmSet.descTransaksi) this.c).q.x().e("auto", "_e", bundle);
            }
            this.d = j;
            this.a.a();
            this.a.e(3600000);
            return true;
        }
        this.c.q.s_().i().e("Screen exposed for less than 1000 ms. Event not sent. time", Long.valueOf(j2));
        return false;
    }

    public final void e() {
        this.a.a();
        this.d = 0;
        this.e = 0;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [o.realmSet$RepresentativeName, o.realmSet$eChannels] */
    public final void e(long j) {
        this.c.r_();
        this.a.a();
        this.d = j;
        this.e = j;
    }
}
