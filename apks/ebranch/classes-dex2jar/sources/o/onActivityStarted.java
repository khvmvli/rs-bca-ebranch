package o;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import o.onActivityStopped;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes-dex2jar.jar:o/onActivityStarted.class */
public final class onActivityStarted implements Recreator {
    private final String a;
    private final onActivityStopped.RemoteActionCompatParcelizer b;
    private final List<Object> c = new ArrayList();
    private final Executor d;
    private final Recreator e;

    public onActivityStarted(Recreator recreator, onActivityStopped.RemoteActionCompatParcelizer remoteActionCompatParcelizer, String str, Executor executor) {
        this.e = recreator;
        this.b = remoteActionCompatParcelizer;
        this.a = str;
        this.d = executor;
    }

    private void a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 >= this.c.size()) {
            for (int size = this.c.size(); size <= i2; size++) {
                this.c.add(null);
            }
        }
        this.c.set(i2, obj);
    }

    @Override // o.setPreserveFocusAfterLayout
    public final void a(int i, String str) {
        a(i, (Object) str);
        this.e.a(i, str);
    }

    @Override // o.setPreserveFocusAfterLayout
    public final void b(int i) {
        a(i, this.c.toArray());
        this.e.b(i);
    }

    @Override // o.setPreserveFocusAfterLayout
    public final void b(int i, double d) {
        a(i, Double.valueOf(d));
        this.e.b(i, d);
    }

    @Override // o.Recreator
    public final int c() {
        this.d.execute(new Runnable() { // from class: o.onActivityResumed
            @Override // java.lang.Runnable
            public final void run() {
            }
        });
        return this.e.c();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.e.close();
    }

    @Override // o.setPreserveFocusAfterLayout
    public final void d(int i, long j) {
        a(i, Long.valueOf(j));
        this.e.d(i, j);
    }

    @Override // o.setPreserveFocusAfterLayout
    public final void d(int i, byte[] bArr) {
        a(i, bArr);
        this.e.d(i, bArr);
    }
}
