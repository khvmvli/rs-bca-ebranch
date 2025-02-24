package o;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import o.realmSet;
/* loaded from: classes2-dex2jar.jar:o/profile.class */
public class profile {
    private setJatuhTempo<Void> b;
    final Executor d;
    private final Object e = new Object();
    public final ThreadLocal<Boolean> a = new ThreadLocal<>();

    public profile(Executor executor) {
        BahasaLayananDialog bahasaLayananDialog = new BahasaLayananDialog();
        bahasaLayananDialog.e((Object) null);
        this.b = bahasaLayananDialog;
        this.d = executor;
        executor.execute(new Runnable() { // from class: o.profile.4
            @Override // java.lang.Runnable
            public final void run() {
                profile.this.a.set(Boolean.TRUE);
            }
        });
    }

    public final <T> setJatuhTempo<T> b(final Callable<setJatuhTempo<T>> callable) {
        setJatuhTempo<T> d;
        synchronized (this.e) {
            d = this.b.d(this.d, new realmSet.kodeBank<Void, T>() { // from class: o.profile.3
                /* JADX WARN: Type inference failed for: r0v2, types: [T, java.lang.Object] */
                public final T then(setJatuhTempo<Void> setjatuhtempo) throws Exception {
                    return r6.call();
                }
            });
            this.b = d.b(this.d, new realmSet.kodeBank<T, Void>() { // from class: o.profile.1
                public final /* bridge */ /* synthetic */ Object then(setJatuhTempo setjatuhtempo) throws Exception {
                    return null;
                }
            });
        }
        return d;
    }

    public final <T> setJatuhTempo<T> e(final Callable<T> callable) {
        setJatuhTempo<T> b;
        synchronized (this.e) {
            b = this.b.b(this.d, new realmSet.kodeBank<Void, T>() { // from class: o.profile.3
                /* JADX WARN: Type inference failed for: r0v2, types: [T, java.lang.Object] */
                public final T then(setJatuhTempo<Void> setjatuhtempo) throws Exception {
                    return callable.call();
                }
            });
            this.b = b.b(this.d, new realmSet.kodeBank<T, Void>() { // from class: o.profile.1
                public final /* bridge */ /* synthetic */ Object then(setJatuhTempo setjatuhtempo) throws Exception {
                    return null;
                }
            });
        }
        return b;
    }
}
