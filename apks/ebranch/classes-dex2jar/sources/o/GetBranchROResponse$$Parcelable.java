package o;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
/* loaded from: classes-dex2jar.jar:o/GetBranchROResponse$$Parcelable.class */
public final class GetBranchROResponse$$Parcelable extends FilterInputStream {
    public volatile byte[] a;
    public int b;
    private int c;
    private int d;
    private final DetailTransactionResponse e;
    private int g;

    /* loaded from: classes-dex2jar.jar:o/GetBranchROResponse$$Parcelable$write.class */
    static final class write extends IOException {
        write(String str) {
            super(str);
        }
    }

    public GetBranchROResponse$$Parcelable(InputStream inputStream, DetailTransactionResponse detailTransactionResponse) {
        this(inputStream, detailTransactionResponse, 65536);
    }

    private GetBranchROResponse$$Parcelable(InputStream inputStream, DetailTransactionResponse detailTransactionResponse, int i) {
        super(inputStream);
        this.d = -1;
        this.e = detailTransactionResponse;
        this.a = (byte[]) detailTransactionResponse.b(65536, byte[].class);
    }

    private int d(InputStream inputStream, byte[] bArr) throws IOException {
        byte[] bArr2;
        int i = this.d;
        if (i != -1) {
            int i2 = this.g;
            int i3 = this.b;
            if (i2 - i < i3) {
                if (i == 0 && i3 > bArr.length && this.c == bArr.length) {
                    int length = bArr.length << 1;
                    int i4 = i3;
                    if (length <= i3) {
                        i4 = length;
                    }
                    bArr2 = (byte[]) this.e.b(i4, byte[].class);
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    this.a = bArr2;
                    this.e.e(bArr);
                } else {
                    bArr2 = bArr;
                    if (i > 0) {
                        System.arraycopy(bArr, i, bArr, 0, bArr.length - i);
                        bArr2 = bArr;
                    }
                }
                int i5 = this.g - this.d;
                this.g = i5;
                this.d = 0;
                this.c = 0;
                int read = inputStream.read(bArr2, i5, bArr2.length - i5);
                int i6 = this.g;
                int i7 = i6;
                if (read > 0) {
                    i7 = i6 + read;
                }
                this.c = i7;
                return read;
            }
        }
        int read2 = inputStream.read(bArr);
        if (read2 > 0) {
            this.d = -1;
            this.g = 0;
            this.c = read2;
        }
        return read2;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() throws IOException {
        int i;
        int i2;
        int available;
        synchronized (this) {
            InputStream inputStream = this.in;
            if (this.a == null || inputStream == null) {
                throw new IOException("BufferedInputStream is closed");
            }
            i = this.c;
            i2 = this.g;
            available = inputStream.available();
        }
        return (i - i2) + available;
    }

    @Override // java.io.FilterInputStream, java.io.Closeable, java.lang.AutoCloseable, java.io.InputStream
    public final void close() throws IOException {
        if (this.a != null) {
            this.e.e(this.a);
            this.a = null;
        }
        InputStream inputStream = this.in;
        this.in = null;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    public final void d() {
        synchronized (this) {
            if (this.a != null) {
                this.e.e(this.a);
                this.a = null;
            }
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final void mark(int i) {
        synchronized (this) {
            this.b = Math.max(this.b, i);
            this.d = this.g;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return true;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        synchronized (this) {
            byte[] bArr = this.a;
            InputStream inputStream = this.in;
            if (bArr == null || inputStream == null) {
                throw new IOException("BufferedInputStream is closed");
            } else if (this.g >= this.c && d(inputStream, bArr) == -1) {
                return -1;
            } else {
                byte[] bArr2 = bArr;
                if (bArr != this.a) {
                    bArr2 = this.a;
                    if (bArr2 == null) {
                        throw new IOException("BufferedInputStream is closed");
                    }
                }
                int i = this.c;
                int i2 = this.g;
                if (i - i2 <= 0) {
                    return -1;
                }
                this.g = i2 + 1;
                return bArr2[i2] & 255;
            }
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        int i4;
        int i5;
        synchronized (this) {
            byte[] bArr2 = this.a;
            if (bArr2 == null) {
                throw new IOException("BufferedInputStream is closed");
            } else if (i2 == 0) {
                return 0;
            } else {
                InputStream inputStream = this.in;
                if (inputStream != null) {
                    int i6 = this.g;
                    int i7 = this.c;
                    if (i6 < i7) {
                        int i8 = i7 - i6;
                        int i9 = i8;
                        if (i8 >= i2) {
                            i9 = i2;
                        }
                        System.arraycopy(bArr2, i6, bArr, i, i9);
                        this.g += i9;
                        if (i9 == i2 || inputStream.available() == 0) {
                            return i9;
                        }
                        i3 = i + i9;
                        i4 = i2 - i9;
                    } else {
                        i3 = i;
                        i4 = i2;
                    }
                    while (true) {
                        int i10 = -1;
                        if (this.d == -1 && i4 >= bArr2.length) {
                            int read = inputStream.read(bArr, i3, i4);
                            i5 = read;
                            if (read == -1) {
                                if (i4 != i2) {
                                    i10 = i2 - i4;
                                }
                                return i10;
                            }
                        } else if (d(inputStream, bArr2) == -1) {
                            if (i4 != i2) {
                                i10 = i2 - i4;
                            }
                            return i10;
                        } else {
                            byte[] bArr3 = bArr2;
                            if (bArr2 != this.a) {
                                bArr3 = this.a;
                                if (bArr3 == null) {
                                    throw new IOException("BufferedInputStream is closed");
                                }
                            }
                            int i11 = this.c;
                            int i12 = this.g;
                            int i13 = i11 - i12;
                            i5 = i13;
                            if (i13 >= i4) {
                                i5 = i4;
                            }
                            System.arraycopy(bArr3, i12, bArr, i3, i5);
                            this.g += i5;
                            bArr2 = bArr3;
                        }
                        i4 -= i5;
                        if (i4 == 0) {
                            return i2;
                        }
                        if (inputStream.available() == 0) {
                            return i2 - i4;
                        }
                        i3 += i5;
                    }
                } else {
                    throw new IOException("BufferedInputStream is closed");
                }
            }
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final void reset() throws IOException {
        synchronized (this) {
            if (this.a != null) {
                int i = this.d;
                if (-1 != i) {
                    this.g = i;
                } else {
                    StringBuilder sb = new StringBuilder("Mark has been invalidated, pos: ");
                    sb.append(this.g);
                    sb.append(" markLimit: ");
                    sb.append(this.b);
                    throw new write(sb.toString());
                }
            } else {
                throw new IOException("Stream is closed");
            }
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) throws IOException {
        synchronized (this) {
            if (j < 1) {
                return 0;
            }
            byte[] bArr = this.a;
            if (bArr != null) {
                InputStream inputStream = this.in;
                if (inputStream != null) {
                    int i = this.c;
                    int i2 = this.g;
                    if (((long) (i - i2)) >= j) {
                        this.g = (int) (((long) i2) + j);
                        return j;
                    }
                    long j2 = ((long) i) - ((long) i2);
                    this.g = i;
                    if (this.d == -1 || j > ((long) this.b)) {
                        long skip = inputStream.skip(j - j2);
                        if (skip > 0) {
                            this.d = -1;
                        }
                        return j2 + skip;
                    } else if (d(inputStream, bArr) == -1) {
                        return j2;
                    } else {
                        int i3 = this.c;
                        int i4 = this.g;
                        if (((long) (i3 - i4)) >= j - j2) {
                            this.g = (int) ((((long) i4) + j) - j2);
                            return j;
                        }
                        long j3 = (long) i3;
                        long j4 = (long) i4;
                        this.g = i3;
                        return (j2 + j3) - j4;
                    }
                } else {
                    throw new IOException("BufferedInputStream is closed");
                }
            } else {
                throw new IOException("BufferedInputStream is closed");
            }
        }
    }
}
