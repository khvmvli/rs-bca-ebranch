package o;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;
/* loaded from: classes-dex2jar.jar:o/setBcaDebitCardNumber.class */
final class setBcaDebitCardNumber {
    private final ConcurrentHashMap<realmSet$totalSupplementCard, List<Throwable>> c = new ConcurrentHashMap<>(16, 0.75f, 10);
    private final ReferenceQueue<Throwable> b = new ReferenceQueue<>();

    public final List<Throwable> d(Throwable th, boolean z) {
        ReferenceQueue<Throwable> referenceQueue = this.b;
        while (true) {
            Reference<? extends Throwable> poll = referenceQueue.poll();
            if (poll == null) {
                break;
            }
            this.c.remove(poll);
            referenceQueue = this.b;
        }
        List<Throwable> list = this.c.get(new realmSet$totalSupplementCard(th, null));
        if (list != null) {
            return list;
        }
        Vector vector = new Vector(2);
        List<Throwable> putIfAbsent = this.c.putIfAbsent(new realmSet$totalSupplementCard(th, this.b), vector);
        return putIfAbsent == null ? vector : putIfAbsent;
    }
}
