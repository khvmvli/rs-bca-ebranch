package o;

import android.util.SparseArray;
import android.view.View;
/* loaded from: classes-dex2jar.jar:o/FragmentStateAdapter$5.class */
public final class FragmentStateAdapter$5 {
    int b;
    SparseArray<View> d;
    SparseArray<View>[] e;
    private View[] a = new View[0];
    private int[] c = new int[0];

    /* JADX INFO: Access modifiers changed from: package-private */
    public static View e(SparseArray<View> sparseArray, int i) {
        int size = sparseArray.size();
        if (size <= 0) {
            return null;
        }
        for (int i2 = 0; i2 < size; i2++) {
            int keyAt = sparseArray.keyAt(i2);
            View view = sparseArray.get(keyAt);
            if (keyAt == i) {
                sparseArray.remove(keyAt);
                return view;
            }
        }
        int i3 = size - 1;
        View valueAt = sparseArray.valueAt(i3);
        sparseArray.remove(sparseArray.keyAt(i3));
        return valueAt;
    }
}
