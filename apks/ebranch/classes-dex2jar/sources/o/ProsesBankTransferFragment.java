package o;

import java.util.Iterator;
import java.util.Map;
/* loaded from: classes-dex2jar.jar:o/ProsesBankTransferFragment.class */
public class ProsesBankTransferFragment extends showInfo {
    public static final <K, V, M extends Map<? super K, ? super V>> M a(Iterable<? extends showSumberPenghasilanDialog<? extends K, ? extends V>> iterable, M m) {
        subscribeReservationRescheduleEvent.e(iterable, "");
        subscribeReservationRescheduleEvent.e(m, "");
        onChooseMataUangEvent.b(m, iterable);
        return m;
    }

    public static final <K, V> void b(Map<? super K, ? super V> map, Iterable<? extends showSumberPenghasilanDialog<? extends K, ? extends V>> iterable) {
        subscribeReservationRescheduleEvent.e(map, "");
        subscribeReservationRescheduleEvent.e(iterable, "");
        Iterator<? extends showSumberPenghasilanDialog<? extends K, ? extends V>> it = iterable.iterator();
        while (it.hasNext()) {
            showSumberPenghasilanDialog showsumberpenghasilandialog = (showSumberPenghasilanDialog) it.next();
            map.put((Object) showsumberpenghasilandialog.c, (Object) showsumberpenghasilandialog.a);
        }
    }
}
