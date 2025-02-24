package o;

import java.util.Iterator;
/* loaded from: classes2-dex2jar.jar:o/CheckDaftarTransferORPresenter.class */
public final class CheckDaftarTransferORPresenter<T, R> implements CancelTundaPresenter<R> {
    final CancelTundaPresenter<T> b;
    final T1TransaksiTarikanUbahFragment_ViewBinding<T, R> c;

    /* JADX WARN: Multi-variable type inference failed */
    public CheckDaftarTransferORPresenter(CancelTundaPresenter<? extends T> cancelTundaPresenter, T1TransaksiTarikanUbahFragment_ViewBinding<? super T, ? extends R> t1TransaksiTarikanUbahFragment_ViewBinding) {
        subscribeReservationRescheduleEvent.e(cancelTundaPresenter, "");
        subscribeReservationRescheduleEvent.e(t1TransaksiTarikanUbahFragment_ViewBinding, "");
        this.b = cancelTundaPresenter;
        this.c = t1TransaksiTarikanUbahFragment_ViewBinding;
    }

    @Override // o.CancelTundaPresenter
    public final Iterator<R> d() {
        return new Object(this) { // from class: o.CheckDaftarTransferORPresenter$MediaBrowserCompat$CustomActionResultReceiver
            private final Iterator<T> a;
            final /* synthetic */ CheckDaftarTransferORPresenter<T, R> b;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.b = r4;
                this.a = r4.b.d();
            }

            @Override // java.util.Iterator
            public final boolean hasNext() {
                return this.a.hasNext();
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [R, java.lang.Object] */
            @Override // java.util.Iterator
            public final R next() {
                return this.b.c.a(this.a.next());
            }

            @Override // java.util.Iterator
            public final void remove() {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }
        };
    }
}
