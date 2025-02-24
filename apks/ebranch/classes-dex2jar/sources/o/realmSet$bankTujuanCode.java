package o;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;
/* loaded from: classes-dex2jar.jar:o/realmSet$bankTujuanCode.class */
final class realmSet$bankTujuanCode {
    private final ConcurrentHashMap<realmSet$bankTujuanOfficeCode, List<Throwable>> b = new ConcurrentHashMap<>(16, 0.75f, 10);
    private final ReferenceQueue<Throwable> a = new ReferenceQueue<>();

    public final List<Throwable> c(Throwable th, boolean z) {
        ReferenceQueue<Throwable> referenceQueue = this.a;
        while (true) {
            Reference<? extends Throwable> poll = referenceQueue.poll();
            if (poll == null) {
                break;
            }
            this.b.remove(poll);
            referenceQueue = this.a;
        }
        List<Throwable> list = this.b.get(new realmSet$bankTujuanOfficeCode(th, null));
        if (list != null) {
            return list;
        }
        Vector vector = new Vector(2);
        List<Throwable> putIfAbsent = this.b.putIfAbsent(new realmSet$bankTujuanOfficeCode(th, this.a), vector);
        return putIfAbsent == null ? vector : putIfAbsent;
    }
}
