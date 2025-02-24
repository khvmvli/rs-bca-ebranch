package o;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
/* loaded from: classes2-dex2jar.jar:o/onChooseValueStatusNPWP.class */
final class onChooseValueStatusNPWP<T> implements onChooseValueSumberPenghasilan<T>, Serializable {
    public static final onChooseValueStatusNPWP$MediaBrowserCompat$CustomActionResultReceiver a = new onChooseValueStatusNPWP$MediaBrowserCompat$CustomActionResultReceiver((byte) 0);
    private static final AtomicReferenceFieldUpdater<onChooseValueStatusNPWP<?>, Object> b = AtomicReferenceFieldUpdater.newUpdater(onChooseValueStatusNPWP.class, Object.class, "e");
    private volatile pilihNoRek<? extends T> d;
    private volatile Object e = Page6LLFragment.a;
    private final Object c = Page6LLFragment.a;

    public onChooseValueStatusNPWP(pilihNoRek<? extends T> pilihnorek) {
        subscribeReservationRescheduleEvent.e(pilihnorek, "");
        this.d = pilihnorek;
    }

    private final Object writeReplace() {
        return new onChooseValuePenghasilanPerTahun(d());
    }

    public final T d() {
        boolean z;
        T t = (T) this.e;
        if (t != Page6LLFragment.a) {
            return t;
        }
        pilihNoRek<? extends T> pilihnorek = this.d;
        if (pilihnorek != null) {
            T t2 = (T) pilihnorek.invoke();
            AtomicReferenceFieldUpdater<onChooseValueStatusNPWP<?>, Object> atomicReferenceFieldUpdater = b;
            Page6LLFragment page6LLFragment = Page6LLFragment.a;
            while (true) {
                if (!atomicReferenceFieldUpdater.compareAndSet(this, page6LLFragment, t2)) {
                    if (atomicReferenceFieldUpdater.get(this) != page6LLFragment) {
                        z = false;
                        break;
                    }
                } else {
                    z = true;
                    break;
                }
            }
            if (z) {
                this.d = null;
                return t2;
            }
        }
        return (T) this.e;
    }

    @Override // java.lang.Object
    public final String toString() {
        return this.e != Page6LLFragment.a ? String.valueOf(d()) : "Lazy value not initialized yet.";
    }
}
