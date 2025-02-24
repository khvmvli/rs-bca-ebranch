package o;

import java.util.Iterator;
/* loaded from: classes2-dex2jar.jar:o/clickMataUang.class */
public final class clickMataUang<T> implements Iterator<onClickedSetiapHari<? extends T>>, subscriberLoadDraftPemrekEvent {
    private final Iterator<T> c;
    private int d;

    /* JADX WARN: Multi-variable type inference failed */
    public clickMataUang(Iterator<? extends T> it) {
        subscribeReservationRescheduleEvent.e(it, "");
        this.c = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.c.hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        int i = this.d;
        this.d = i + 1;
        if (i >= 0) {
            return new onClickedSetiapHari(i, this.c.next());
        }
        throw new ArithmeticException("Index overflow has happened.");
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
