package o;

import android.util.SparseArray;
/* loaded from: classes-dex2jar.jar:o/getTxbType.class */
public enum getTxbType {
    DEFAULT(0),
    UNMETERED_ONLY(1),
    UNMETERED_OR_DAILY(2),
    FAST_IF_RADIO_AWAKE(3),
    NEVER(4),
    UNRECOGNIZED(-1);
    
    private static final SparseArray<getTxbType> g;
    private final int f;

    static {
        getTxbType gettxbtype = DEFAULT;
        getTxbType gettxbtype2 = UNMETERED_ONLY;
        getTxbType gettxbtype3 = UNMETERED_OR_DAILY;
        getTxbType gettxbtype4 = FAST_IF_RADIO_AWAKE;
        getTxbType gettxbtype5 = NEVER;
        getTxbType gettxbtype6 = UNRECOGNIZED;
        SparseArray<getTxbType> sparseArray = new SparseArray<>();
        g = sparseArray;
        sparseArray.put(0, gettxbtype);
        sparseArray.put(1, gettxbtype2);
        sparseArray.put(2, gettxbtype3);
        sparseArray.put(3, gettxbtype4);
        sparseArray.put(4, gettxbtype5);
        sparseArray.put(-1, gettxbtype6);
    }

    getTxbType(int i2) {
        this.f = i2;
    }
}
