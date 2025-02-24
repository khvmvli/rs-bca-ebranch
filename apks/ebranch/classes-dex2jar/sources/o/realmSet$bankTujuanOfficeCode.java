package o;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
/* loaded from: classes-dex2jar.jar:o/realmSet$bankTujuanOfficeCode.class */
final class realmSet$bankTujuanOfficeCode extends WeakReference<Throwable> {
    private final int d;

    public realmSet$bankTujuanOfficeCode(Throwable th, ReferenceQueue<Throwable> referenceQueue) {
        super(th, referenceQueue);
        this.d = System.identityHashCode(th);
    }

    @Override // java.lang.Object
    public final boolean equals(Object obj) {
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        realmSet$bankTujuanOfficeCode realmset_banktujuanofficecode = (realmSet$bankTujuanOfficeCode) obj;
        return this.d == realmset_banktujuanofficecode.d && get() == realmset_banktujuanofficecode.get();
    }

    @Override // java.lang.Object
    public final int hashCode() {
        return this.d;
    }
}
