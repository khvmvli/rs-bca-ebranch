package o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes-dex2jar.jar:o/checkSimpanNama.class */
public class checkSimpanNama extends onUbahFieldDataAlamatHome {
    public static final <T, A extends Appendable> A a(Iterable<? extends T> iterable, A a, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, T1TransaksiTarikanUbahFragment_ViewBinding<? super T, ? extends CharSequence> t1TransaksiTarikanUbahFragment_ViewBinding) {
        int i2;
        subscribeReservationRescheduleEvent.e(iterable, "");
        subscribeReservationRescheduleEvent.e(a, "");
        subscribeReservationRescheduleEvent.e(charSequence, "");
        subscribeReservationRescheduleEvent.e(charSequence2, "");
        subscribeReservationRescheduleEvent.e(charSequence3, "");
        subscribeReservationRescheduleEvent.e(charSequence4, "");
        a.append(charSequence2);
        Iterator<? extends T> it = iterable.iterator();
        int i3 = 0;
        while (true) {
            i2 = i3;
            if (!it.hasNext()) {
                break;
            }
            Object obj = (Object) it.next();
            i3++;
            boolean z = true;
            if (i3 > 1) {
                a.append(charSequence);
            }
            if (i >= 0) {
                i2 = i3;
                if (i3 > i) {
                    break;
                }
            }
            subscribeReservationRescheduleEvent.e(a, "");
            if (t1TransaksiTarikanUbahFragment_ViewBinding != null) {
                a.append((CharSequence) t1TransaksiTarikanUbahFragment_ViewBinding.a(obj));
            } else {
                if (obj != 0) {
                    z = obj instanceof CharSequence;
                }
                if (z) {
                    a.append((CharSequence) obj);
                } else if (obj instanceof Character) {
                    a.append(((Character) obj).charValue());
                } else {
                    a.append(String.valueOf(obj));
                }
            }
        }
        if (i >= 0 && i2 > i) {
            a.append(charSequence4);
        }
        a.append(charSequence3);
        return a;
    }

    public static final <T> List<T> a(Iterable<? extends T> iterable) {
        subscribeReservationRescheduleEvent.e(iterable, "");
        if (!(iterable instanceof Collection)) {
            return (List) onClickUbahDataAlamatIdentitas.d(iterable, new ArrayList());
        }
        Collection collection = (Collection) iterable;
        subscribeReservationRescheduleEvent.e(collection, "");
        return new ArrayList(collection);
    }

    public static final <T> List<T> b(Iterable<? extends T> iterable) {
        PenerimaFragment penerimaFragment;
        subscribeReservationRescheduleEvent.e(iterable, "");
        if (!(iterable instanceof Collection)) {
            return onClickUbahDataAlamatIdentitas.b(onClickUbahDataAlamatIdentitas.a(iterable));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            penerimaFragment = PenerimaFragment.b;
        } else if (size != 1) {
            subscribeReservationRescheduleEvent.e(collection, "");
            penerimaFragment = new ArrayList(collection);
        } else {
            penerimaFragment = Collections.singletonList(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
            subscribeReservationRescheduleEvent.d(penerimaFragment, "");
        }
        return penerimaFragment;
    }

    public static final <T> String c(Iterable<? extends T> iterable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, T1TransaksiTarikanUbahFragment_ViewBinding<? super T, ? extends CharSequence> t1TransaksiTarikanUbahFragment_ViewBinding) {
        subscribeReservationRescheduleEvent.e(iterable, "");
        subscribeReservationRescheduleEvent.e(charSequence, "");
        subscribeReservationRescheduleEvent.e(charSequence2, "");
        subscribeReservationRescheduleEvent.e(charSequence3, "");
        subscribeReservationRescheduleEvent.e(charSequence4, "");
        String obj = ((StringBuilder) onClickUbahDataAlamatIdentitas.a(iterable, new StringBuilder(), charSequence, charSequence2, charSequence3, i, charSequence4, t1TransaksiTarikanUbahFragment_ViewBinding)).toString();
        subscribeReservationRescheduleEvent.d(obj, "");
        return obj;
    }

    public static /* synthetic */ String c(Iterable iterable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, T1TransaksiTarikanUbahFragment_ViewBinding t1TransaksiTarikanUbahFragment_ViewBinding, int i2) {
        if ((i2 & 1) != 0) {
        }
        if ((i2 & 2) != 0) {
        }
        if ((i2 & 4) != 0) {
        }
        if ((i2 & 8) != 0) {
            i = -1;
        }
        if ((i2 & 16) != 0) {
        }
        if ((i2 & 32) != 0) {
            t1TransaksiTarikanUbahFragment_ViewBinding = null;
        }
        return onClickUbahDataAlamatIdentitas.c(iterable, charSequence, charSequence2, charSequence3, i, charSequence4, t1TransaksiTarikanUbahFragment_ViewBinding);
    }

    public static final <T, C extends Collection<? super T>> C d(Iterable<? extends T> iterable, C c) {
        subscribeReservationRescheduleEvent.e(iterable, "");
        subscribeReservationRescheduleEvent.e(c, "");
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            c.add(it.next());
        }
        return c;
    }
}
