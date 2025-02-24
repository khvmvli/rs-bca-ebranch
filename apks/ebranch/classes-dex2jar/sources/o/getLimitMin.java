package o;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes-dex2jar.jar:o/getLimitMin.class */
public final class getLimitMin {
    private static final AtomicReference<byte[]> e = new AtomicReference<>();

    /* loaded from: classes-dex2jar.jar:o/getLimitMin$RemoteActionCompatParcelizer.class */
    static final class RemoteActionCompatParcelizer {
        final int b;
        final byte[] d;
        final int e;

        RemoteActionCompatParcelizer(byte[] bArr, int i, int i2) {
            this.d = bArr;
            this.e = i;
            this.b = i2;
        }
    }

    /* loaded from: classes-dex2jar.jar:o/getLimitMin$read.class */
    static final class read extends InputStream {
        private final ByteBuffer d;
        private int e = -1;

        read(ByteBuffer byteBuffer) {
            this.d = byteBuffer;
        }

        @Override // java.io.InputStream
        public final int available() {
            return this.d.remaining();
        }

        @Override // java.io.InputStream
        public final void mark(int i) {
            synchronized (this) {
                this.e = this.d.position();
            }
        }

        @Override // java.io.InputStream
        public final boolean markSupported() {
            return true;
        }

        @Override // java.io.InputStream
        public final int read() {
            if (!this.d.hasRemaining()) {
                return -1;
            }
            return this.d.get() & 255;
        }

        @Override // java.io.InputStream
        public final int read(byte[] bArr, int i, int i2) throws IOException {
            if (!this.d.hasRemaining()) {
                return -1;
            }
            int min = Math.min(i2, available());
            this.d.get(bArr, i, min);
            return min;
        }

        @Override // java.io.InputStream
        public final void reset() throws IOException {
            synchronized (this) {
                int i = this.e;
                if (i != -1) {
                    this.d.position(i);
                } else {
                    throw new IOException("Cannot reset to unset mark position");
                }
            }
        }

        @Override // java.io.InputStream
        public final long skip(long j) throws IOException {
            if (!this.d.hasRemaining()) {
                return -1;
            }
            long min = Math.min(j, (long) available());
            ByteBuffer byteBuffer = this.d;
            byteBuffer.position((int) (((long) byteBuffer.position()) + min));
            return min;
        }
    }

    public static InputStream b(ByteBuffer byteBuffer) {
        return new read(byteBuffer);
    }

    public static ByteBuffer b(File file) throws IOException {
        RandomAccessFile randomAccessFile;
        Throwable th;
        FileChannel fileChannel = null;
        try {
            long length = file.length();
            if (length > 2147483647L) {
                throw new IOException("File too large to map into memory");
            } else if (length != 0) {
                RandomAccessFile randomAccessFile2 = new RandomAccessFile(file, "r");
                try {
                    fileChannel = randomAccessFile2.getChannel();
                    try {
                        MappedByteBuffer load = fileChannel.map(FileChannel.MapMode.READ_ONLY, 0, length).load();
                        if (fileChannel != null) {
                            try {
                                fileChannel.close();
                            } catch (IOException e2) {
                            }
                        }
                        try {
                            randomAccessFile2.close();
                        } catch (IOException e3) {
                        }
                        return load;
                    } catch (Throwable th2) {
                        th = th2;
                        randomAccessFile = randomAccessFile2;
                        if (fileChannel != null) {
                            try {
                                fileChannel.close();
                            } catch (IOException e4) {
                            }
                        }
                        if (randomAccessFile != null) {
                            try {
                                randomAccessFile.close();
                            } catch (IOException e5) {
                            }
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    fileChannel = null;
                }
            } else {
                throw new IOException("File unsuitable for memory mapping");
            }
        } catch (Throwable th4) {
            th = th4;
            randomAccessFile = null;
        }
    }

    public static ByteBuffer c(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        byte[] andSet = e.getAndSet(null);
        byte[] bArr = andSet;
        if (andSet == null) {
            bArr = new byte[16384];
        }
        while (true) {
            int read2 = inputStream.read(bArr);
            if (read2 >= 0) {
                byteArrayOutputStream.write(bArr, 0, read2);
            } else {
                e.set(bArr);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                return (ByteBuffer) ByteBuffer.allocateDirect(byteArray.length).put(byteArray).position(0);
            }
        }
    }

    public static byte[] c(ByteBuffer byteBuffer) {
        byte[] bArr;
        RemoteActionCompatParcelizer remoteActionCompatParcelizer = (byteBuffer.isReadOnly() || !byteBuffer.hasArray()) ? null : new RemoteActionCompatParcelizer(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.limit());
        if (remoteActionCompatParcelizer != null && remoteActionCompatParcelizer.e == 0 && remoteActionCompatParcelizer.b == remoteActionCompatParcelizer.d.length) {
            bArr = byteBuffer.array();
        } else {
            ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
            bArr = new byte[asReadOnlyBuffer.limit()];
            asReadOnlyBuffer.position(0);
            asReadOnlyBuffer.get(bArr);
        }
        return bArr;
    }

    public static void d(ByteBuffer byteBuffer, File file) throws IOException {
        RandomAccessFile randomAccessFile;
        Throwable th;
        RandomAccessFile randomAccessFile2;
        FileChannel channel;
        byteBuffer.position(0);
        FileChannel fileChannel = null;
        try {
            randomAccessFile2 = new RandomAccessFile(file, "rw");
            try {
                channel = randomAccessFile2.getChannel();
            } catch (Throwable th2) {
                th = th2;
                randomAccessFile = randomAccessFile2;
            }
        } catch (Throwable th3) {
            th = th3;
            randomAccessFile = null;
        }
        try {
            channel.write(byteBuffer);
            channel.force(false);
            channel.close();
            randomAccessFile2.close();
            if (channel != null) {
                try {
                    channel.close();
                } catch (IOException e2) {
                }
            }
            try {
                randomAccessFile2.close();
            } catch (IOException e3) {
            }
        } catch (Throwable th4) {
            th = th4;
            fileChannel = channel;
            randomAccessFile = randomAccessFile2;
            if (fileChannel != null) {
                try {
                    fileChannel.close();
                } catch (IOException e4) {
                }
            }
            if (randomAccessFile != null) {
                try {
                    randomAccessFile.close();
                } catch (IOException e5) {
                }
            }
            throw th;
        }
    }
}
