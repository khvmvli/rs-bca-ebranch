package o;

import java.util.concurrent.atomic.AtomicReference;
import o.Setoran$$Parcelable;
import o.realmSet;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2-dex2jar.jar:o/realmSet$currency.class */
public final class realmSet$currency implements Runnable {
    final /* synthetic */ AtomicReference a;
    final /* synthetic */ Setoran$$Parcelable.AnonymousClass1 d;

    /* JADX WARN: Type inference failed for: r1v1, types: [o.Setoran$$Parcelable$1, o.realmSet$RepresentativeName] */
    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.a) {
            this.a.set(Boolean.valueOf(this.d.q.t().c(((realmSet.descTransaksi) this.d).q.e().c(), realmSet.hasDone.f)));
            this.a.notify();
        }
    }
}
