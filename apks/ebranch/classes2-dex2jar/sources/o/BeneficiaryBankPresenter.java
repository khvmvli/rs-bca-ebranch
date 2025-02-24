package o;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes2-dex2jar.jar:o/BeneficiaryBankPresenter.class */
public final class BeneficiaryBankPresenter<T> implements CancelTundaPresenter<T> {
    private final AtomicReference<CancelTundaPresenter<T>> c;

    public BeneficiaryBankPresenter(CancelTundaPresenter<? extends T> cancelTundaPresenter) {
        subscribeReservationRescheduleEvent.e(cancelTundaPresenter, "");
        this.c = new AtomicReference<>(cancelTundaPresenter);
    }

    @Override // o.CancelTundaPresenter
    public final Iterator<T> d() {
        CancelTundaPresenter<T> andSet = this.c.getAndSet(null);
        if (andSet != null) {
            return andSet.d();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
