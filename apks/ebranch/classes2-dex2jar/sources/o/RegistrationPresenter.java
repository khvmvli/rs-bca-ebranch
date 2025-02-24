package o;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
/* loaded from: classes2-dex2jar.jar:o/RegistrationPresenter.class */
public final class RegistrationPresenter<T> extends getResponseImageData<T> {
    static final /* synthetic */ AtomicIntegerFieldUpdater d = AtomicIntegerFieldUpdater.newUpdater(RegistrationPresenter.class, "_decision");
    volatile /* synthetic */ int _decision = 0;

    public RegistrationPresenter(ProsesTarikanFragment_ViewBinding prosesTarikanFragment_ViewBinding, ProsesTarikanFragment<? super T> prosesTarikanFragment) {
        super(prosesTarikanFragment_ViewBinding, prosesTarikanFragment);
    }

    private final boolean k() {
        do {
            int i = this._decision;
            if (i != 0) {
                if (i == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed".toString());
            }
        } while (!d.compareAndSet(this, 0, 2));
        return true;
    }

    @Override // o.getResponseImageData, o.DetailTransactionPresenter
    public final void a(Object obj) {
        if (!k()) {
            getRequestDateString$com_github_ChuckerTeam_Chucker_library.c(ReviewSetoranReservasiUbahFragment_ViewBinding.e(this.e), GetRatePresenter.b(obj, this.e), null);
        }
    }

    @Override // o.getResponseImageData, o.GeneratedAppGlideModule
    public final void e(Object obj) {
        if (!k()) {
            getRequestDateString$com_github_ChuckerTeam_Chucker_library.c(ReviewSetoranReservasiUbahFragment_ViewBinding.e(this.e), GetRatePresenter.b(obj, this.e), null);
        }
    }
}
