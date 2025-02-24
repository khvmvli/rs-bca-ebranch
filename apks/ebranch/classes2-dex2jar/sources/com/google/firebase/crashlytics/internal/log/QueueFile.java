package com.google.firebase.crashlytics.internal.log;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.util.NoSuchElementException;
import java.util.logging.Level;
import java.util.logging.Logger;
/* loaded from: classes2-dex2jar.jar:com/google/firebase/crashlytics/internal/log/QueueFile.class */
public class QueueFile implements Closeable {
    private static final Logger e = Logger.getLogger(QueueFile.class.getName());
    private int a;
    private final byte[] b = new byte[16];
    int c;
    private QueueFile$MediaBrowserCompat$CustomActionResultReceiver d;
    private final RandomAccessFile f;
    private QueueFile$MediaBrowserCompat$CustomActionResultReceiver h;

    /* loaded from: classes2-dex2jar.jar:com/google/firebase/crashlytics/internal/log/QueueFile$ElementReader.class */
    public interface ElementReader {
        void read(InputStream inputStream, int i) throws IOException;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2-dex2jar.jar:com/google/firebase/crashlytics/internal/log/QueueFile$RemoteActionCompatParcelizer.class */
    public final class RemoteActionCompatParcelizer extends InputStream {
        private int b;
        private int e;

        private RemoteActionCompatParcelizer(QueueFile$MediaBrowserCompat$CustomActionResultReceiver queueFile$MediaBrowserCompat$CustomActionResultReceiver) {
            this.b = QueueFile.d(QueueFile.this, queueFile$MediaBrowserCompat$CustomActionResultReceiver.a + 4);
            this.e = queueFile$MediaBrowserCompat$CustomActionResultReceiver.c;
        }

        /* synthetic */ RemoteActionCompatParcelizer(QueueFile queueFile, QueueFile$MediaBrowserCompat$CustomActionResultReceiver queueFile$MediaBrowserCompat$CustomActionResultReceiver, byte b) {
            this(queueFile$MediaBrowserCompat$CustomActionResultReceiver);
        }

        @Override // java.io.InputStream
        public final int read() throws IOException {
            if (this.e == 0) {
                return -1;
            }
            QueueFile.this.f.seek((long) this.b);
            int read = QueueFile.this.f.read();
            this.b = QueueFile.d(QueueFile.this, this.b + 1);
            this.e--;
            return read;
        }

        @Override // java.io.InputStream
        public final int read(byte[] bArr, int i, int i2) throws IOException {
            QueueFile.a(bArr, "buffer");
            if ((i | i2) < 0 || i2 > bArr.length - i) {
                throw new ArrayIndexOutOfBoundsException();
            }
            int i3 = this.e;
            if (i3 <= 0) {
                return -1;
            }
            int i4 = i2;
            if (i2 > i3) {
                i4 = i3;
            }
            QueueFile.this.a(this.b, bArr, i, i4);
            this.b = QueueFile.d(QueueFile.this, this.b + i4);
            this.e -= i4;
            return i4;
        }
    }

    /* JADX WARN: Finally extract failed */
    public QueueFile(File file) throws IOException {
        if (!file.exists()) {
            StringBuilder sb = new StringBuilder();
            sb.append(file.getPath());
            sb.append(".tmp");
            File file2 = new File(sb.toString());
            RandomAccessFile randomAccessFile = new RandomAccessFile(file2, "rwd");
            try {
                randomAccessFile.setLength(4096);
                randomAccessFile.seek(0);
                byte[] bArr = new byte[16];
                c(bArr, 4096, 0, 0, 0);
                randomAccessFile.write(bArr);
                randomAccessFile.close();
                if (!file2.renameTo(file)) {
                    throw new IOException("Rename failed!");
                }
            } catch (Throwable th) {
                randomAccessFile.close();
                throw th;
            }
        }
        RandomAccessFile randomAccessFile2 = new RandomAccessFile(file, "rwd");
        this.f = randomAccessFile2;
        randomAccessFile2.seek(0);
        this.f.readFully(this.b);
        int e2 = e(this.b, 0);
        this.c = e2;
        if (((long) e2) <= this.f.length()) {
            this.a = e(this.b, 4);
            int e3 = e(this.b, 8);
            int e4 = e(this.b, 12);
            this.d = b(e3);
            this.h = b(e4);
            return;
        }
        StringBuilder sb2 = new StringBuilder("File is truncated. Expected length: ");
        sb2.append(this.c);
        sb2.append(", Actual length: ");
        sb2.append(this.f.length());
        throw new IOException(sb2.toString());
    }

    static /* synthetic */ Object a(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i, byte[] bArr, int i2, int i3) throws IOException {
        int i4 = this.c;
        int i5 = i;
        if (i >= i4) {
            i5 = (i + 16) - i4;
        }
        int i6 = this.c;
        if (i5 + i3 <= i6) {
            this.f.seek((long) i5);
            this.f.readFully(bArr, i2, i3);
            return;
        }
        int i7 = i6 - i5;
        this.f.seek((long) i5);
        this.f.readFully(bArr, i2, i7);
        this.f.seek(16);
        this.f.readFully(bArr, i2 + i7, i3 - i7);
    }

    private static void a(byte[] bArr, int i, int i2) {
        bArr[i] = (byte) ((byte) (i2 >> 24));
        bArr[i + 1] = (byte) ((byte) (i2 >> 16));
        bArr[i + 2] = (byte) ((byte) (i2 >> 8));
        bArr[i + 3] = (byte) ((byte) i2);
    }

    private QueueFile$MediaBrowserCompat$CustomActionResultReceiver b(int i) throws IOException {
        if (i == 0) {
            return QueueFile$MediaBrowserCompat$CustomActionResultReceiver.b;
        }
        this.f.seek((long) i);
        return new QueueFile$MediaBrowserCompat$CustomActionResultReceiver(i, this.f.readInt());
    }

    private void b(int i, int i2, int i3, int i4) throws IOException {
        byte[] bArr = this.b;
        int i5 = 0;
        for (int i6 = 0; i6 < 4; i6++) {
            a(bArr, i5, new int[]{i, i2, i3, i4}[i6]);
            i5 += 4;
        }
        this.f.seek(0);
        this.f.write(this.b);
    }

    private static void c(byte[] bArr, int... iArr) {
        int i = 0;
        for (int i2 = 0; i2 < 4; i2++) {
            a(bArr, i, iArr[i2]);
            i += 4;
        }
    }

    static /* synthetic */ int d(QueueFile queueFile, int i) {
        int i2 = queueFile.c;
        int i3 = i;
        if (i >= i2) {
            i3 = (i + 16) - i2;
        }
        return i3;
    }

    private static int e(byte[] bArr, int i) {
        return ((bArr[i] & 255) << 24) + ((bArr[i + 1] & 255) << 16) + ((bArr[i + 2] & 255) << 8) + (bArr[i + 3] & 255);
    }

    private void e(int i, byte[] bArr, int i2, int i3) throws IOException {
        int i4 = this.c;
        int i5 = i;
        if (i >= i4) {
            i5 = (i + 16) - i4;
        }
        int i6 = this.c;
        if (i5 + i3 <= i6) {
            this.f.seek((long) i5);
            this.f.write(bArr, i2, i3);
            return;
        }
        int i7 = i6 - i5;
        this.f.seek((long) i5);
        this.f.write(bArr, i2, i7);
        this.f.seek(16);
        this.f.write(bArr, i2 + i7, i3 - i7);
    }

    public final int a() {
        if (this.a == 0) {
            return 16;
        }
        return this.h.a >= this.d.a ? (this.h.a - this.d.a) + 4 + this.h.c + 16 : (((this.h.a + 4) + this.h.c) + this.c) - this.d.a;
    }

    public final void c() throws IOException {
        synchronized (this) {
            if (d()) {
                throw new NoSuchElementException();
            } else if (this.a == 1) {
                synchronized (this) {
                    b(4096, 0, 0, 0);
                    this.a = 0;
                    this.d = QueueFile$MediaBrowserCompat$CustomActionResultReceiver.b;
                    this.h = QueueFile$MediaBrowserCompat$CustomActionResultReceiver.b;
                    if (this.c > 4096) {
                        this.f.setLength((long) 4096);
                        this.f.getChannel().force(true);
                    }
                    this.c = 4096;
                }
            } else {
                int i = this.d.a + 4 + this.d.c;
                int i2 = this.c;
                int i3 = i;
                if (i >= i2) {
                    i3 = (i + 16) - i2;
                }
                a(i3, this.b, 0, 4);
                int e2 = e(this.b, 0);
                b(this.c, this.a - 1, i3, this.h.a);
                this.a--;
                this.d = new QueueFile$MediaBrowserCompat$CustomActionResultReceiver(i3, e2);
            }
        }
    }

    public final void c(ElementReader elementReader) throws IOException {
        synchronized (this) {
            int i = this.d.a;
            for (int i2 = 0; i2 < this.a; i2++) {
                QueueFile$MediaBrowserCompat$CustomActionResultReceiver b = b(i);
                elementReader.read(new RemoteActionCompatParcelizer(this, b, (byte) 0), b.c);
                int i3 = b.a + 4 + b.c;
                int i4 = this.c;
                i = i3;
                if (i3 >= i4) {
                    i = (i3 + 16) - i4;
                }
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        synchronized (this) {
            this.f.close();
        }
    }

    public final void d(byte[] bArr) throws IOException {
        int i;
        int i2;
        int length = bArr.length;
        synchronized (this) {
            if (bArr == null) {
                throw new NullPointerException("buffer");
            } else if ((length | 0) < 0 || length > bArr.length) {
                throw new IndexOutOfBoundsException();
            } else {
                int i3 = length + 4;
                int a = this.c - a();
                int i4 = 16;
                if (a < i3) {
                    int i5 = this.c;
                    do {
                        i = a + i5;
                        i2 = i5 << 1;
                        a = i;
                        i5 = i2;
                    } while (i < i3);
                    this.f.setLength((long) i2);
                    this.f.getChannel().force(true);
                    int i6 = this.h.a + 4 + this.h.c;
                    int i7 = this.c;
                    int i8 = i6;
                    if (i6 >= i7) {
                        i8 = (i6 + 16) - i7;
                    }
                    if (i8 < this.d.a) {
                        FileChannel channel = this.f.getChannel();
                        channel.position((long) this.c);
                        long j = (long) (i8 - 4);
                        if (channel.transferTo(16, j, channel) != j) {
                            throw new AssertionError("Copied insufficient number of bytes!");
                        }
                    }
                    if (this.h.a < this.d.a) {
                        int i9 = (this.c + this.h.a) - 16;
                        b(i2, this.a, this.d.a, i9);
                        this.h = new QueueFile$MediaBrowserCompat$CustomActionResultReceiver(i9, this.h.c);
                    } else {
                        b(i2, this.a, this.d.a, this.h.a);
                    }
                    this.c = i2;
                }
                boolean d = d();
                if (!d) {
                    int i10 = this.h.a + 4 + this.h.c;
                    int i11 = this.c;
                    i4 = i10;
                    if (i10 >= i11) {
                        i4 = (i10 + 16) - i11;
                    }
                }
                QueueFile$MediaBrowserCompat$CustomActionResultReceiver queueFile$MediaBrowserCompat$CustomActionResultReceiver = new QueueFile$MediaBrowserCompat$CustomActionResultReceiver(i4, length);
                a(this.b, 0, length);
                e(queueFile$MediaBrowserCompat$CustomActionResultReceiver.a, this.b, 0, 4);
                e(queueFile$MediaBrowserCompat$CustomActionResultReceiver.a + 4, bArr, 0, length);
                b(this.c, this.a + 1, d ? queueFile$MediaBrowserCompat$CustomActionResultReceiver.a : this.d.a, queueFile$MediaBrowserCompat$CustomActionResultReceiver.a);
                this.h = queueFile$MediaBrowserCompat$CustomActionResultReceiver;
                this.a++;
                if (d) {
                    this.d = queueFile$MediaBrowserCompat$CustomActionResultReceiver;
                }
            }
        }
    }

    public final boolean d() {
        boolean z;
        synchronized (this) {
            z = this.a == 0;
        }
        return z;
    }

    @Override // java.lang.Object
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("[fileLength=");
        sb.append(this.c);
        sb.append(", size=");
        sb.append(this.a);
        sb.append(", first=");
        sb.append(this.d);
        sb.append(", last=");
        sb.append(this.h);
        sb.append(", element lengths=[");
        try {
            c(new ElementReader() { // from class: com.google.firebase.crashlytics.internal.log.QueueFile.1
                boolean e = true;

                @Override // com.google.firebase.crashlytics.internal.log.QueueFile.ElementReader
                public final void read(InputStream inputStream, int i) throws IOException {
                    if (this.e) {
                        this.e = false;
                    } else {
                        sb.append(", ");
                    }
                    sb.append(i);
                }
            });
        } catch (IOException e2) {
            e.log(Level.WARNING, "read error", (Throwable) e2);
        }
        sb.append("]]");
        return sb.toString();
    }
}
