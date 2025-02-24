package o;

import java.util.ArrayList;
import java.util.List;
/* loaded from: classes-dex2jar.jar:o/onActivityPreStopped.class */
final class onActivityPreStopped implements setPreserveFocusAfterLayout {
    List<Object> d = new ArrayList();

    private void a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 >= this.d.size()) {
            for (int size = this.d.size(); size <= i2; size++) {
                this.d.add(null);
            }
        }
        this.d.set(i2, obj);
    }

    @Override // o.setPreserveFocusAfterLayout
    public final void a(int i, String str) {
        a(i, (Object) str);
    }

    @Override // o.setPreserveFocusAfterLayout
    public final void b(int i) {
        a(i, (Object) null);
    }

    @Override // o.setPreserveFocusAfterLayout
    public final void b(int i, double d) {
        a(i, Double.valueOf(d));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // o.setPreserveFocusAfterLayout
    public final void d(int i, long j) {
        a(i, Long.valueOf(j));
    }

    @Override // o.setPreserveFocusAfterLayout
    public final void d(int i, byte[] bArr) {
        a(i, bArr);
    }
}
