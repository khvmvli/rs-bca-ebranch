package o;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
/* loaded from: classes2-dex2jar.jar:o/subscribePilihBulanTahun.class */
final class subscribePilihBulanTahun extends InputStream {
    private long a;
    private long b;
    private long c;
    private long d;
    private final InputStream e;

    public subscribePilihBulanTahun(InputStream inputStream) {
        this(inputStream, 4096);
    }

    private subscribePilihBulanTahun(InputStream inputStream, int i) {
        this.b = -1;
        this.e = !inputStream.markSupported() ? new BufferedInputStream(inputStream, 4096) : inputStream;
    }

    private void b(long j) {
        try {
            long j2 = this.d;
            long j3 = this.c;
            if (j2 >= j3 || j3 > this.a) {
                this.d = j3;
                this.e.mark((int) (j - j3));
            } else {
                this.e.reset();
                this.e.mark((int) (j - this.d));
                b(this.d, this.c);
            }
            this.a = j;
        } catch (IOException e) {
            StringBuilder sb = new StringBuilder("Unable to mark: ");
            sb.append(e);
            throw new IllegalStateException(sb.toString());
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [long] */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump */
    private void b(long r7, long r9) throws java.io.IOException {
        /*
            r6 = this;
        L_0x0000:
            r0 = r7
            r1 = r9
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0030
            r0 = r6
            java.io.InputStream r0 = r0.e
            r1 = r9
            r2 = r7
            long r1 = r1 - r2
            long r0 = r0.skip(r1)
            r11 = r0
            r0 = r11
            r13 = r0
            r0 = r11
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0028
            r0 = r6
            int r0 = r0.read()
            r1 = -1
            if (r0 == r1) goto L_0x0030
            r0 = 1
            r13 = r0
        L_0x0028:
            r0 = r7
            r1 = r13
            long r0 = r0 + r1
            r7 = r0
            goto L_0x0000
        L_0x0030:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.subscribePilihBulanTahun.b(long, long):void");
    }

    @Override // java.io.InputStream
    public final int available() throws IOException {
        return this.e.available();
    }

    public final long c(int i) {
        long j = this.c + ((long) i);
        if (this.a < j) {
            b(j);
        }
        return this.c;
    }

    public final void c(long j) throws IOException {
        if (this.c > this.a || j < this.d) {
            throw new IOException("Cannot reset");
        }
        this.e.reset();
        b(this.d, j);
        this.c = j;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.e.close();
    }

    @Override // java.io.InputStream
    public final void mark(int i) {
        this.b = c(i);
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return this.e.markSupported();
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        int read = this.e.read();
        if (read != -1) {
            this.c++;
        }
        return read;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) throws IOException {
        int read = this.e.read(bArr);
        if (read != -1) {
            this.c += (long) read;
        }
        return read;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int read = this.e.read(bArr, i, i2);
        if (read != -1) {
            this.c += (long) read;
        }
        return read;
    }

    @Override // java.io.InputStream
    public final void reset() throws IOException {
        c(this.b);
    }

    @Override // java.io.InputStream
    public final long skip(long j) throws IOException {
        long skip = this.e.skip(j);
        this.c += skip;
        return skip;
    }
}
