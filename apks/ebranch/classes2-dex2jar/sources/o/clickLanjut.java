package o;

import java.util.Iterator;
/* loaded from: classes2-dex2jar.jar:o/clickLanjut.class */
public final class clickLanjut<T> implements Iterable<onClickedSetiapHari<? extends T>>, subscriberLoadDraftPemrekEvent {
    private final pilihNoRek<Iterator<T>> e;

    /* JADX WARN: Multi-variable type inference failed */
    public clickLanjut(pilihNoRek<? extends Iterator<? extends T>> pilihnorek) {
        subscribeReservationRescheduleEvent.e(pilihnorek, "");
        this.e = pilihnorek;
    }

    @Override // java.lang.Iterable
    public final Iterator<onClickedSetiapHari<T>> iterator() {
        return new clickMataUang((Iterator) this.e.invoke());
    }
}
