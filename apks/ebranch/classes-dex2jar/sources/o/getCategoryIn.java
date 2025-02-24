package o;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
/* loaded from: classes-dex2jar.jar:o/getCategoryIn.class */
final class getCategoryIn implements Closeable {
    private final InputStream a;
    int b;
    private byte[] c;
    private int d;
    final Charset e;

    private getCategoryIn(InputStream inputStream, int i, Charset charset) {
        if (inputStream == null || charset == null) {
            throw null;
        } else if (charset.equals(getNextCategoryCd.b)) {
            this.a = inputStream;
            this.e = charset;
            this.c = new byte[8192];
        } else {
            throw new IllegalArgumentException("Unsupported encoding");
        }
    }

    public getCategoryIn(InputStream inputStream, Charset charset) {
        this(inputStream, 8192, charset);
    }

    private void d() throws IOException {
        InputStream inputStream = this.a;
        byte[] bArr = this.c;
        int read = inputStream.read(bArr, 0, bArr.length);
        if (read != -1) {
            this.d = 0;
            this.b = read;
            return;
        }
        throw new EOFException();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        synchronized (this.a) {
            if (this.c != null) {
                this.c = null;
                this.a.close();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x004e, code lost:
        if (r0[r11] == 13) goto L_0x0057;
     */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final java.lang.String e() throws java.io.IOException {
        /*
        // Method dump skipped, instructions count: 282
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getCategoryIn.e():java.lang.String");
    }
}
