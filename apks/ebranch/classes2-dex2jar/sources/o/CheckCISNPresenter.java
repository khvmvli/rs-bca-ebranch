package o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes2-dex2jar.jar:o/CheckCISNPresenter.class */
public class CheckCISNPresenter extends CheckDaftarTransferPresenter {

    /* loaded from: classes2-dex2jar.jar:o/CheckCISNPresenter$RemoteActionCompatParcelizer.class */
    public static final class RemoteActionCompatParcelizer implements Iterable<T>, subscriberLoadDraftPemrekEvent {
        final /* synthetic */ CancelTundaPresenter e;

        public RemoteActionCompatParcelizer(CancelTundaPresenter cancelTundaPresenter) {
            this.e = cancelTundaPresenter;
        }

        @Override // java.lang.Iterable
        public final Iterator<T> iterator() {
            return this.e.d();
        }
    }

    public static final <T, C extends Collection<? super T>> C b(CancelTundaPresenter<? extends T> cancelTundaPresenter, C c) {
        subscribeReservationRescheduleEvent.e(cancelTundaPresenter, "");
        subscribeReservationRescheduleEvent.e(c, "");
        Iterator<? extends T> d = cancelTundaPresenter.d();
        while (d.hasNext()) {
            c.add(d.next());
        }
        return c;
    }

    public static final <T> List<T> d(CancelTundaPresenter<? extends T> cancelTundaPresenter) {
        subscribeReservationRescheduleEvent.e(cancelTundaPresenter, "");
        subscribeReservationRescheduleEvent.e(cancelTundaPresenter, "");
        return onClickUbahDataAlamatIdentitas.b((List) CancelReservationPresenter.b(cancelTundaPresenter, new ArrayList()));
    }
}
