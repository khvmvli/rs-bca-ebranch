package o;

import java.util.ArrayList;
import java.util.HashSet;
import o.onFindViewById;
/* loaded from: classes-dex2jar.jar:o/setGuidelineEnd.class */
public final class setGuidelineEnd<T> {
    public final onFindViewById.write<ArrayList<T>> b = new onFindViewById.RemoteActionCompatParcelizer(10);
    public final setCollapseIcon<T, ArrayList<T>> e = new setCollapseIcon<>();
    private final ArrayList<T> a = new ArrayList<>();
    private final HashSet<T> c = new HashSet<>();

    private void a(T t, ArrayList<T> arrayList, HashSet<T> hashSet) {
        if (!arrayList.contains(t)) {
            if (!hashSet.contains(t)) {
                hashSet.add(t);
                ArrayList<T> arrayList2 = this.e.get(t);
                if (arrayList2 != null) {
                    int size = arrayList2.size();
                    for (int i = 0; i < size; i++) {
                        a(arrayList2.get(i), arrayList, hashSet);
                    }
                }
                hashSet.remove(t);
                arrayList.add(t);
                return;
            }
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ArrayList<T> a() {
        this.a.clear();
        this.c.clear();
        int size = this.e.size();
        for (int i = 0; i < size; i++) {
            a(this.e.h[i << 1], this.a, this.c);
        }
        return this.a;
    }
}
