package o;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
/* loaded from: classes2-dex2jar.jar:o/setNominal.class */
final class setNominal<T> implements setKodeBank<T> {
    private final CountDownLatch b = new CountDownLatch(1);

    private setNominal() {
    }

    /* synthetic */ setNominal(setNamaBank setnamabank) {
    }

    @Override // o.realmSet$jenisWarkat
    public final void a(Exception exc) {
        this.b.countDown();
    }

    @Override // o.realmSet$nominal
    public final void a(T t) {
        this.b.countDown();
    }

    @Override // o.realmSet$kodeJenisWarkat
    public final void c() {
        this.b.countDown();
    }

    public final void d() throws InterruptedException {
        this.b.await();
    }

    public final boolean d(long j, TimeUnit timeUnit) throws InterruptedException {
        return this.b.await(j, timeUnit);
    }
}
