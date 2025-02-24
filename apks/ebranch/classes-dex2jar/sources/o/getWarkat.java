package o;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
/* loaded from: classes-dex2jar.jar:o/getWarkat.class */
public final class getWarkat extends FilterInputStream {
    private int a = Integer.MIN_VALUE;

    public getWarkat(InputStream inputStream) {
        super(inputStream);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [long] */
    /* JADX WARN: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump */
    private long e(long r6) {
        /*
            r5 = this;
            r0 = r5
            int r0 = r0.a
            r8 = r0
            r0 = r8
            if (r0 != 0) goto L_0x000d
            r0 = -1
            return r0
        L_0x000d:
            r0 = r6
            r9 = r0
            r0 = r8
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 == r1) goto L_0x0028
            r0 = r8
            long r0 = (long) r0
            r11 = r0
            r0 = r6
            r9 = r0
            r0 = r6
            r1 = r11
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0028
            r0 = r11
            r9 = r0
        L_0x0028:
            r0 = r9
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getWarkat.e(long):long");
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() throws IOException {
        int i = this.a;
        return i == Integer.MIN_VALUE ? available() : Math.min(i, available());
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final void mark(int i) {
        synchronized (this) {
            mark(i);
            this.a = i;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        if (e(1) == -1) {
            return -1;
        }
        int read = read();
        int i = this.a;
        if (i != Integer.MIN_VALUE) {
            this.a = (int) (((long) i) - 1);
        }
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int e = (int) e((long) i2);
        if (e == -1) {
            return -1;
        }
        int read = read(bArr, i, e);
        long j = (long) read;
        int i3 = this.a;
        if (!(i3 == Integer.MIN_VALUE || j == -1)) {
            this.a = (int) (((long) i3) - j);
        }
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final void reset() throws IOException {
        synchronized (this) {
            reset();
            this.a = Integer.MIN_VALUE;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) throws IOException {
        long e = e(j);
        if (e == -1) {
            return 0;
        }
        long skip = skip(e);
        int i = this.a;
        if (!(i == Integer.MIN_VALUE || skip == -1)) {
            this.a = (int) (((long) i) - skip);
        }
        return skip;
    }
}
