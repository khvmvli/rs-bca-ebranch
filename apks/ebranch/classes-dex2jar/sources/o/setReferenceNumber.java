package o;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
/* loaded from: classes-dex2jar.jar:o/setReferenceNumber.class */
public final class setReferenceNumber extends FilterInputStream {
    private final byte a;
    private int e;
    private static final byte[] b = {-1, -31, 0, 28, 69, 120, 105, 102, 0, 0, 77, 77, 0, 0, 0, 0, 0, 8, 0, 1, 1, 18, 0, 2, 0, 0, 0, 1, 0};
    private static final int d = 29;
    private static final int c = 31;

    public setReferenceNumber(InputStream inputStream, int i) {
        super(inputStream);
        if (i < -1 || i > 8) {
            StringBuilder sb = new StringBuilder("Cannot add invalid orientation: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
        this.a = (byte) ((byte) i);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final void mark(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        int i;
        int i2 = this.e;
        int read = (i2 < 2 || i2 > (i = c)) ? read() : i2 == i ? this.a : b[i2 - 2] & 255;
        if (read != -1) {
            this.e++;
        }
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        int i4 = this.e;
        int i5 = c;
        if (i4 > i5) {
            i3 = read(bArr, i, i2);
        } else if (i4 == i5) {
            bArr[i] = (byte) this.a;
            i3 = 1;
        } else if (i4 < 2) {
            i3 = read(bArr, i, 2 - i4);
        } else {
            int min = Math.min(i5 - i4, i2);
            System.arraycopy(b, this.e - 2, bArr, i, min);
            i3 = min;
        }
        if (i3 > 0) {
            this.e += i3;
        }
        return i3;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final void reset() throws IOException {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) throws IOException {
        long skip = skip(j);
        if (skip > 0) {
            this.e = (int) (((long) this.e) + skip);
        }
        return skip;
    }
}
