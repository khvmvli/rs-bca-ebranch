package o;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
/* loaded from: classes2-dex2jar.jar:o/UpdatePINPresenter.class */
final class UpdatePINPresenter extends UpdateTxnTellerSetunDetailPresenter {
    private static final /* synthetic */ AtomicIntegerFieldUpdater c = AtomicIntegerFieldUpdater.newUpdater(UpdatePINPresenter.class, "_invoked");
    private volatile /* synthetic */ int _invoked = 0;
    private final T1TransaksiTarikanUbahFragment_ViewBinding<Throwable, onCLickStatusNpwp> a;

    /* JADX WARN: Multi-variable type inference failed */
    public UpdatePINPresenter(T1TransaksiTarikanUbahFragment_ViewBinding<? super Throwable, onCLickStatusNpwp> t1TransaksiTarikanUbahFragment_ViewBinding) {
        this.a = t1TransaksiTarikanUbahFragment_ViewBinding;
    }

    public final /* synthetic */ Object a(Object obj) {
        Throwable th = (Throwable) obj;
        if (c.compareAndSet(this, 0, 1)) {
            this.a.a(th);
        }
        return onCLickStatusNpwp.e;
    }

    @Override // o.GetIdentityPresenter
    public final void e(Throwable th) {
        if (c.compareAndSet(this, 0, 1)) {
            this.a.a(th);
        }
    }
}
