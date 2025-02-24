package o;

import java.io.Serializable;
/* loaded from: classes-dex2jar.jar:o/Page6KLFragment_ViewBinding.class */
public final class Page6KLFragment_ViewBinding<T> implements onChooseValueSumberPenghasilan<T>, Serializable {
    private pilihNoRek<? extends T> a;
    private volatile Object b;
    private final Object c;

    private Page6KLFragment_ViewBinding(pilihNoRek<? extends T> pilihnorek, Object obj) {
        subscribeReservationRescheduleEvent.e(pilihnorek, "");
        this.a = pilihnorek;
        this.b = Page6LLFragment.a;
        this.c = obj == null ? this : obj;
    }

    public /* synthetic */ Page6KLFragment_ViewBinding(pilihNoRek pilihnorek, Object obj, int i) {
        this(pilihnorek, null);
    }

    private final Object writeReplace() {
        return new onChooseValuePenghasilanPerTahun(d());
    }

    @Override // o.onChooseValueSumberPenghasilan
    public final T d() {
        T t;
        T t2 = (T) this.b;
        if (t2 != Page6LLFragment.a) {
            return t2;
        }
        synchronized (this.c) {
            t = (T) this.b;
            if (t == Page6LLFragment.a) {
                pilihNoRek<? extends T> pilihnorek = this.a;
                subscribeReservationRescheduleEvent.c(pilihnorek);
                t = (T) pilihnorek.invoke();
                this.b = t;
                this.a = null;
            }
        }
        return t;
    }

    @Override // java.lang.Object
    public final String toString() {
        return this.b != Page6LLFragment.a ? String.valueOf(d()) : "Lazy value not initialized yet.";
    }
}
