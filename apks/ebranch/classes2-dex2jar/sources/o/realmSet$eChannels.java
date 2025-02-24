package o;

import android.os.Handler;
import android.os.Looper;
import o.realmSet;
/* loaded from: classes2-dex2jar.jar:o/realmSet$eChannels.class */
public final class realmSet$eChannels extends realmGet$FlagTxnBerkala {
    private Handler b;
    protected final realmGet$tarikans d = new realmGet$tarikans(this);
    protected final realmGet$verified c = new realmGet$verified(this);
    protected final realmGet$setorans e = new realmGet$setorans(this);

    public realmSet$eChannels(realmGet$TxnPurpose realmget_txnpurpose) {
        super(realmget_txnpurpose);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a() {
        r_();
        if (this.b == null) {
            this.b = new getPreferredMailingAddress(Looper.getMainLooper());
        }
    }

    public static /* synthetic */ void c(realmSet$eChannels realmset_echannels) {
        realmset_echannels.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [o.realmSet$RepresentativeName, o.realmSet$eChannels] */
    /* JADX WARN: Type inference failed for: r0v20, types: [o.realmSet$RepresentativeName, o.realmSet$eChannels] */
    public static /* synthetic */ void d(realmSet$eChannels realmset_echannels, long j) {
        realmset_echannels.r_();
        realmset_echannels.a();
        realmset_echannels.q.s_().i().e("Activity paused, time", Long.valueOf(j));
        realmset_echannels.e.d(j);
        if (realmset_echannels.q.t().g()) {
            realmset_echannels.c.a(j);
        }
        realmGet$tarikans realmget_tarikans = realmset_echannels.d;
        if (!realmget_tarikans.c.q.t().c((String) null, realmSet.hasDone.Z)) {
            realmget_tarikans.c.q.q().l.d(true);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [o.realmSet$RepresentativeName, o.realmSet$eChannels] */
    /* JADX WARN: Type inference failed for: r0v19, types: [o.realmSet$RepresentativeName, o.realmSet$eChannels] */
    /* JADX WARN: Type inference failed for: r0v25, types: [o.realmSet$RepresentativeName, o.realmSet$eChannels] */
    /* JADX WARN: Type inference failed for: r1v4, types: [o.realmSet$RepresentativeName, o.realmSet$eChannels] */
    public static /* synthetic */ void e(realmSet$eChannels realmset_echannels, long j) {
        realmset_echannels.r_();
        realmset_echannels.a();
        realmset_echannels.q.s_().i().e("Activity resumed, time", Long.valueOf(j));
        if (realmset_echannels.q.t().c((String) null, realmSet.hasDone.Z)) {
            if (realmset_echannels.q.t().g() || realmset_echannels.q.q().l.d()) {
                realmset_echannels.c.e(j);
            }
            realmset_echannels.e.a();
        } else {
            realmset_echannels.e.a();
            if (realmset_echannels.q.t().g()) {
                realmset_echannels.c.e(j);
            }
        }
        realmGet$tarikans realmget_tarikans = realmset_echannels.d;
        realmget_tarikans.c.r_();
        if (realmget_tarikans.c.q.a()) {
            if (!realmget_tarikans.c.q.t().c((String) null, realmSet.hasDone.Z)) {
                realmget_tarikans.c.q.q().l.d(false);
            }
            realmget_tarikans.a(realmget_tarikans.c.q.q_().e(), false);
        }
    }

    @Override // o.realmGet$FlagTxnBerkala
    protected final boolean b() {
        return false;
    }
}
