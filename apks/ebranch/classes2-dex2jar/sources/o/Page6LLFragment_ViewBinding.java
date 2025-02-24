package o;

import java.io.Serializable;
/* loaded from: classes2-dex2jar.jar:o/Page6LLFragment_ViewBinding.class */
public final class Page6LLFragment_ViewBinding<T> implements onChooseValueSumberPenghasilan<T>, Serializable {
    private pilihNoRek<? extends T> b;
    private Object e = Page6LLFragment.a;

    public Page6LLFragment_ViewBinding(pilihNoRek<? extends T> pilihnorek) {
        subscribeReservationRescheduleEvent.e(pilihnorek, "");
        this.b = pilihnorek;
    }

    private final Object writeReplace() {
        return new onChooseValuePenghasilanPerTahun(d());
    }

    public final T d() {
        if (this.e == Page6LLFragment.a) {
            pilihNoRek<? extends T> pilihnorek = this.b;
            subscribeReservationRescheduleEvent.c(pilihnorek);
            this.e = pilihnorek.invoke();
            this.b = null;
        }
        return (T) this.e;
    }

    @Override // java.lang.Object
    public final String toString() {
        return this.e != Page6LLFragment.a ? String.valueOf(d()) : "Lazy value not initialized yet.";
    }
}
