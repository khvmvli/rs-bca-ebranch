package o;

import java.util.Collection;
import java.util.NoSuchElementException;
/* loaded from: classes-dex2jar.jar:o/Page6NLFragment_ViewBinding.class */
public class Page6NLFragment_ViewBinding extends Page6NLFragment {
    public static final char b(char[] cArr) {
        subscribeReservationRescheduleEvent.e(cArr, "");
        int length = cArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        } else if (length == 1) {
            return cArr[0];
        } else {
            throw new IllegalArgumentException("Array has more than one element.");
        }
    }

    public static final <T, C extends Collection<? super T>> C d(T[] tArr, C c) {
        subscribeReservationRescheduleEvent.e(tArr, "");
        subscribeReservationRescheduleEvent.e(c, "");
        for (T t : tArr) {
            c.add(t);
        }
        return c;
    }
}
