package o;

import o.realmSet;
/* loaded from: classes2-dex2jar.jar:o/realmGet$setorans.class */
public final class realmGet$setorans {
    private realmSet$accounts d;
    final /* synthetic */ realmSet$eChannels e;

    public realmGet$setorans(realmSet$eChannels realmset_echannels) {
        this.e = realmset_echannels;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [o.realmSet$RepresentativeName, o.realmSet$eChannels] */
    /* JADX WARN: Type inference failed for: r0v10, types: [o.realmSet$RepresentativeName, o.realmSet$eChannels] */
    /* JADX WARN: Type inference failed for: r0v5, types: [o.realmSet$RepresentativeName, o.realmSet$eChannels] */
    public final void a() {
        this.e.r_();
        if (this.d != null) {
            this.e.b.removeCallbacks(this.d);
        }
        if (this.e.q.t().c((String) null, realmSet.hasDone.Z)) {
            this.e.q.q().l.d(false);
        }
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [o.realmSet$RepresentativeName, o.realmSet$eChannels] */
    public final void d(long j) {
        this.d = new realmSet$accounts(this, this.e.q.q_().e(), j);
        this.e.b.postDelayed(this.d, 2000);
    }
}
