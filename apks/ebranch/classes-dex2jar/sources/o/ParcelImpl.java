package o;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.List;
import o.VersionedParcel$ParcelException;
/* loaded from: classes-dex2jar.jar:o/ParcelImpl.class */
final class ParcelImpl extends VersionedParcel$ParcelException.write {
    final List<VersionedParcel$ParcelException.write> e = new ArrayList(3);

    /* JADX INFO: Access modifiers changed from: package-private */
    public ParcelImpl(int i) {
    }

    @Override // o.VersionedParcel$ParcelException.write
    public final void a(int i) {
        try {
            for (VersionedParcel$ParcelException.write write : this.e) {
                write.a(i);
            }
        } catch (ConcurrentModificationException e) {
            throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", e);
        }
    }

    @Override // o.VersionedParcel$ParcelException.write
    public final void b(int i, float f, int i2) {
        try {
            for (VersionedParcel$ParcelException.write write : this.e) {
                write.b(i, f, i2);
            }
        } catch (ConcurrentModificationException e) {
            throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", e);
        }
    }

    @Override // o.VersionedParcel$ParcelException.write
    public final void e(int i) {
        try {
            for (VersionedParcel$ParcelException.write write : this.e) {
                write.e(i);
            }
        } catch (ConcurrentModificationException e) {
            throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", e);
        }
    }
}
