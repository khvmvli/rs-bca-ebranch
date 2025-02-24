package o;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
/* loaded from: classes-dex2jar.jar:o/realmSet$totalSupplementCard.class */
final class realmSet$totalSupplementCard extends WeakReference<Throwable> {
    private final int c;

    public realmSet$totalSupplementCard(Throwable th, ReferenceQueue<Throwable> referenceQueue) {
        super(th, referenceQueue);
        this.c = System.identityHashCode(th);
    }

    @Override // java.lang.Object
    public final boolean equals(Object obj) {
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        realmSet$totalSupplementCard realmset_totalsupplementcard = (realmSet$totalSupplementCard) obj;
        return this.c == realmset_totalsupplementcard.c && get() == realmset_totalsupplementcard.get();
    }

    @Override // java.lang.Object
    public final int hashCode() {
        return this.c;
    }
}
