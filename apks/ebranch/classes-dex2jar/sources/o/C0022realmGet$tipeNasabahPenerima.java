package o;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayDeque;
import java.util.Queue;
/* renamed from: o.realmGet$tipeNasabahPenerima  reason: case insensitive filesystem */
/* loaded from: classes-dex2jar.jar:o/realmGet$tipeNasabahPenerima.class */
public final class C0022realmGet$tipeNasabahPenerima {
    private static final OutputStream c = new OutputStream() { // from class: o.realmGet$statusPendudukPenerima
        @Override // java.lang.Object
        public final String toString() {
            return "ByteStreams.nullOutputStream()";
        }

        @Override // java.io.OutputStream
        public final void write(int i) {
        }

        @Override // java.io.OutputStream
        public final void write(byte[] bArr) {
            bArr.getClass();
        }

        @Override // java.io.OutputStream
        public final void write(byte[] bArr, int i, int i2) {
            bArr.getClass();
        }
    };

    public static InputStream a(InputStream inputStream, long j) {
        return new FilterInputStream(inputStream, 1048577) { // from class: o.realmGet$statusKewarganegaraanPenerima
            private long d = -1;
            private long e = 1048577;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                r5.getClass();
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public final int available() throws IOException {
                return (int) Math.min((long) this.in.available(), this.e);
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public final void mark(int i) {
                synchronized (this) {
                    this.in.mark(i);
                    this.d = this.e;
                }
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public final int read() throws IOException {
                if (this.e == 0) {
                    return -1;
                }
                int read = this.in.read();
                if (read != -1) {
                    this.e--;
                }
                return read;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public final int read(byte[] bArr, int i, int i2) throws IOException {
                long j2 = this.e;
                if (j2 == 0) {
                    return -1;
                }
                int read = this.in.read(bArr, i, (int) Math.min((long) i2, j2));
                if (read != -1) {
                    this.e -= (long) read;
                }
                return read;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public final void reset() throws IOException {
                synchronized (this) {
                    if (!this.in.markSupported()) {
                        throw new IOException("Mark not supported");
                    } else if (this.d != -1) {
                        this.in.reset();
                        this.e = this.d;
                    } else {
                        throw new IOException("Mark not set");
                    }
                }
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public final long skip(long j2) throws IOException {
                long skip = this.in.skip(Math.min(j2, this.e));
                this.e -= skip;
                return skip;
            }
        };
    }

    public static byte[] b(InputStream inputStream) throws IOException {
        byte[] e;
        ArrayDeque arrayDeque = new ArrayDeque(20);
        int i = 8192;
        int i2 = 0;
        loop0: while (true) {
            if (i2 < 2147483639) {
                int min = Math.min(i, 2147483639 - i2);
                byte[] bArr = new byte[min];
                arrayDeque.add(bArr);
                int i3 = 0;
                while (i3 < min) {
                    int read = inputStream.read(bArr, i3, min - i3);
                    if (read == -1) {
                        e = e(arrayDeque, i2);
                        break loop0;
                    }
                    i3 += read;
                    i2 += read;
                }
                long j = (long) i;
                long j2 = j + j;
                i = j2 > 2147483647L ? Integer.MAX_VALUE : j2 < -2147483648L ? Integer.MIN_VALUE : (int) j2;
            } else if (inputStream.read() == -1) {
                e = e(arrayDeque, 2147483639);
            } else {
                throw new OutOfMemoryError("input is too large to fit in a byte array");
            }
        }
        return e;
    }

    private static byte[] e(Queue<byte[]> queue, int i) {
        byte[] bArr = new byte[i];
        int i2 = i;
        while (i2 > 0) {
            byte[] remove = queue.remove();
            int min = Math.min(i2, remove.length);
            System.arraycopy(remove, 0, bArr, i - i2, min);
            i2 -= min;
        }
        return bArr;
    }
}
