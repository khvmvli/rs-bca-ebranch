package o;

import java.util.Collection;
import java.util.Iterator;
/* loaded from: classes-dex2jar.jar:o/onFocusChangeRekening.class */
public class onFocusChangeRekening extends onUbahFieldDataAlamatRes {
    public static final <T> boolean c(Collection<? super T> collection, Iterable<? extends T> iterable) {
        subscribeReservationRescheduleEvent.e(collection, "");
        subscribeReservationRescheduleEvent.e(iterable, "");
        if (iterable instanceof Collection) {
            return collection.addAll((Collection) iterable);
        }
        Iterator<? extends T> it = iterable.iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (collection.add((Object) it.next())) {
                z = true;
            }
        }
        return z;
    }
}
