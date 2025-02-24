package o;

import java.io.IOException;
import java.io.OutputStream;
/* loaded from: classes-dex2jar.jar:o/getReservationTime.class */
public final class getReservationTime extends OutputStream {
    private DetailTransactionResponse a;
    private byte[] b;
    private final OutputStream c;
    private int d;

    public getReservationTime(OutputStream outputStream, DetailTransactionResponse detailTransactionResponse) {
        this(outputStream, detailTransactionResponse, 65536);
    }

    private getReservationTime(OutputStream outputStream, DetailTransactionResponse detailTransactionResponse, int i) {
        this.c = outputStream;
        this.a = detailTransactionResponse;
        this.b = (byte[]) detailTransactionResponse.b(65536, byte[].class);
    }

    private void a() throws IOException {
        int i = this.d;
        byte[] bArr = this.b;
        if (i == bArr.length && i > 0) {
            this.c.write(bArr, 0, i);
            this.d = 0;
        }
    }

    /* JADX WARN: Finally extract failed */
    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        try {
            flush();
            this.c.close();
            byte[] bArr = this.b;
            if (bArr != null) {
                this.a.e(bArr);
                this.b = null;
            }
        } catch (Throwable th) {
            this.c.close();
            throw th;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        int i = this.d;
        if (i > 0) {
            this.c.write(this.b, 0, i);
            this.d = 0;
        }
        this.c.flush();
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        byte[] bArr = this.b;
        int i2 = this.d;
        this.d = i2 + 1;
        bArr[i2] = (byte) ((byte) i);
        a();
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        int i4 = 0;
        do {
            int i5 = i2 - i4;
            int i6 = i + i4;
            int i7 = this.d;
            if (i7 != 0 || i5 < this.b.length) {
                int min = Math.min(i5, this.b.length - i7);
                System.arraycopy(bArr, i6, this.b, this.d, min);
                this.d += min;
                i3 = i4 + min;
                a();
                i4 = i3;
            } else {
                this.c.write(bArr, i6, i5);
                return;
            }
        } while (i3 < i2);
    }
}
