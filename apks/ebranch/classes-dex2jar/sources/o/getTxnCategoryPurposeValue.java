package o;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
/* loaded from: classes-dex2jar.jar:o/getTxnCategoryPurposeValue.class */
public final class getTxnCategoryPurposeValue extends FilterInputStream {
    private final long b;
    private int d;

    public getTxnCategoryPurposeValue(InputStream inputStream, long j) {
        super(inputStream);
        this.b = j;
    }

    private int b(int i) throws IOException {
        if (i >= 0) {
            this.d += i;
        } else if (this.b - ((long) this.d) > 0) {
            StringBuilder sb = new StringBuilder("Failed to read all expected data, expected: ");
            sb.append(this.b);
            sb.append(", but read: ");
            sb.append(this.d);
            throw new IOException(sb.toString());
        }
        return i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() throws IOException {
        int max;
        synchronized (this) {
            max = (int) Math.max(this.b - ((long) this.d), (long) this.in.available());
        }
        return max;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        int read;
        synchronized (this) {
            read = read();
            b(read >= 0 ? 1 : -1);
        }
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int b;
        synchronized (this) {
            b = b(read(bArr, i, i2));
        }
        return b;
    }
}
