package o;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
/* loaded from: classes-dex2jar.jar:o/Page6PLFragment.class */
public class Page6PLFragment extends onFocusChangeAlamat {
    public static final <T> List<T> b(List<? extends T> list) {
        PenerimaFragment penerimaFragment;
        subscribeReservationRescheduleEvent.e(list, "");
        int size = list.size();
        if (size != 0) {
            penerimaFragment = (List<T>) list;
            if (size == 1) {
                penerimaFragment = Collections.singletonList(list.get(0));
                subscribeReservationRescheduleEvent.d(penerimaFragment, "");
            }
        } else {
            penerimaFragment = PenerimaFragment.b;
        }
        return penerimaFragment;
    }

    public static final <T> List<T> e(T... tArr) {
        PenerimaFragment penerimaFragment;
        subscribeReservationRescheduleEvent.e(tArr, "");
        if (tArr.length > 0) {
            subscribeReservationRescheduleEvent.e(tArr, "");
            penerimaFragment = Arrays.asList(tArr);
            subscribeReservationRescheduleEvent.d(penerimaFragment, "");
        } else {
            penerimaFragment = PenerimaFragment.b;
        }
        return penerimaFragment;
    }
}
