package o;

import android.app.ActivityManager;
import android.os.Bundle;
import android.text.TextUtils;
import o.realmSet;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2-dex2jar.jar:o/realmGet$tarikans.class */
public final class realmGet$tarikans {
    final /* synthetic */ realmSet$eChannels c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public realmGet$tarikans(realmSet$eChannels realmset_echannels) {
        this.c = realmset_echannels;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Type inference failed for: r0v1, types: [o.realmSet$RepresentativeName, o.realmSet$eChannels] */
    /* JADX WARN: Type inference failed for: r0v10, types: [o.realmSet$RepresentativeName, o.realmSet$eChannels] */
    /* JADX WARN: Type inference failed for: r0v15, types: [o.realmSet$RepresentativeName, o.realmSet$eChannels] */
    /* JADX WARN: Type inference failed for: r0v22, types: [o.realmSet$RepresentativeName, o.realmSet$eChannels] */
    /* JADX WARN: Type inference failed for: r0v5, types: [o.realmSet$RepresentativeName, o.realmSet$eChannels] */
    public final void a(long j, boolean z) {
        this.c.r_();
        realmSet$eChannels.c(this.c);
        if (this.c.q.q().e(j)) {
            this.c.q.q().i.d(true);
        }
        this.c.q.q().j.b(j);
        if (this.c.q.q().i.d()) {
            d(j, z);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Type inference failed for: r0v1, types: [o.realmSet$RepresentativeName, o.realmSet$eChannels] */
    /* JADX WARN: Type inference failed for: r0v17, types: [o.realmSet$RepresentativeName, o.realmSet$eChannels] */
    /* JADX WARN: Type inference failed for: r0v3, types: [o.realmSet$RepresentativeName, o.realmSet$eChannels] */
    /* JADX WARN: Type inference failed for: r0v8, types: [o.realmSet$RepresentativeName, o.realmSet$eChannels] */
    /* JADX WARN: Type inference failed for: r1v1, types: [o.realmSet$RepresentativeName, o.realmSet$eChannels] */
    /* JADX WARN: Type inference failed for: r1v10, types: [o.realmSet$RepresentativeName, o.realmSet$eChannels] */
    public final void b() {
        this.c.r_();
        if (this.c.q.q().e(this.c.q.q_().e())) {
            this.c.q.q().i.d(true);
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (runningAppProcessInfo.importance == 100) {
                this.c.q.s_().i().b("Detected application was in foreground");
                d(this.c.q.q_().e(), false);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [o.realmSet$RepresentativeName, o.realmSet$eChannels] */
    /* JADX WARN: Type inference failed for: r0v12, types: [o.realmSet$RepresentativeName, o.realmSet$eChannels] */
    /* JADX WARN: Type inference failed for: r0v17, types: [o.realmSet$RepresentativeName, o.realmSet$eChannels] */
    /* JADX WARN: Type inference failed for: r0v29, types: [o.realmSet$RepresentativeName, o.realmSet$eChannels] */
    /* JADX WARN: Type inference failed for: r0v36, types: [o.realmSet$RepresentativeName, o.realmSet$eChannels] */
    /* JADX WARN: Type inference failed for: r0v46, types: [o.realmSet$RepresentativeName, o.realmSet$eChannels] */
    /* JADX WARN: Type inference failed for: r0v51, types: [o.realmSet$RepresentativeName, o.realmSet$eChannels] */
    /* JADX WARN: Type inference failed for: r0v7, types: [o.realmSet$RepresentativeName, o.realmSet$eChannels] */
    final void d(long j, boolean z) {
        this.c.r_();
        if (this.c.q.a()) {
            this.c.q.q().j.b(j);
            this.c.q.s_().i().e("Session started, time", Long.valueOf(this.c.q.q_().b()));
            Long valueOf = Long.valueOf(j / 1000);
            ((realmSet.descTransaksi) this.c).q.x().e("auto", "_sid", valueOf, j);
            this.c.q.q().i.d(false);
            Bundle bundle = new Bundle();
            bundle.putLong("_sid", valueOf.longValue());
            if (this.c.q.t().c((String) null, realmSet.hasDone.O) && z) {
                bundle.putLong("_aib", 1);
            }
            ((realmSet.descTransaksi) this.c).q.x().e("auto", "_s", j, bundle);
            getKeteranganAlamatBankPenerima.d();
            if (this.c.q.t().c((String) null, realmSet.hasDone.U)) {
                String b = this.c.q.q().m.b();
                if (!TextUtils.isEmpty(b)) {
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("_ffr", b);
                    ((realmSet.descTransaksi) this.c).q.x().e("auto", "_ssr", j, bundle2);
                }
            }
        }
    }
}
