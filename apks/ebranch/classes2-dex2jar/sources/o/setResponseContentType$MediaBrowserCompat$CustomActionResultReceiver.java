package o;

import java.io.Closeable;
/* loaded from: classes2-dex2jar.jar:o/setResponseContentType$MediaBrowserCompat$CustomActionResultReceiver.class */
public final class setResponseContentType$MediaBrowserCompat$CustomActionResultReceiver implements Closeable {
    public boolean a;
    public byte[] b;
    public setResponseContentType d;
    private Stetho h;
    public long e = -1;
    public int j = -1;
    public int c = -1;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [long] */
    /* JADX WARN: Type inference failed for: r18v2, types: [long] */
    /* JADX WARN: Type inference failed for: r18v6 */
    /* JADX WARN: Type inference failed for: r24v4, types: [long] */
    /* JADX WARN: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final int a(long r10) {
        /*
        // Method dump skipped, instructions count: 483
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setResponseContentType$MediaBrowserCompat$CustomActionResultReceiver.a(long):int");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.d != null) {
            this.d = null;
            this.h = null;
            this.e = -1;
            this.b = null;
            this.j = -1;
            this.c = -1;
            return;
        }
        throw new IllegalStateException("not attached to a buffer");
    }
}
