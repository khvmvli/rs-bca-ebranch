package o;

import android.util.SparseArray;
import java.util.HashMap;
/* loaded from: classes-dex2jar.jar:o/realmGet$businessFieldValue.class */
public final class realmGet$businessFieldValue {
    private static HashMap<getTxbDate, Integer> a;
    private static SparseArray<getTxbDate> d = new SparseArray<>();

    static {
        HashMap<getTxbDate, Integer> hashMap = new HashMap<>();
        a = hashMap;
        hashMap.put(getTxbDate.DEFAULT, 0);
        a.put(getTxbDate.VERY_LOW, 1);
        a.put(getTxbDate.HIGHEST, 2);
        for (getTxbDate gettxbdate : a.keySet()) {
            d.append(a.get(gettxbdate).intValue(), gettxbdate);
        }
    }

    public static int c(getTxbDate gettxbdate) {
        Integer num = a.get(gettxbdate);
        if (num != null) {
            return num.intValue();
        }
        StringBuilder sb = new StringBuilder("PriorityMapping is missing known Priority value ");
        sb.append(gettxbdate);
        throw new IllegalStateException(sb.toString());
    }

    public static getTxbDate c(int i) {
        getTxbDate gettxbdate = d.get(i);
        if (gettxbdate != null) {
            return gettxbdate;
        }
        StringBuilder sb = new StringBuilder("Unknown Priority for value ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }
}
