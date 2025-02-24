package com.facebook.stetho.dumpapp;

import com.facebook.stetho.common.LogUtil;
import com.facebook.stetho.common.Utf8Charset;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.nio.charset.Charset;
import javax.annotation.Nullable;
/* loaded from: classes-dex2jar.jar:com/facebook/stetho/dumpapp/Framer.class */
class Framer {
    public static final byte ENTER_FRAME_PREFIX = 33;
    public static final byte EXIT_FRAME_PREFIX = 120;
    public static final byte STDERR_FRAME_PREFIX = 50;
    public static final byte STDIN_FRAME_PREFIX = 45;
    public static final byte STDIN_REQUEST_FRAME_PREFIX = 95;
    public static final byte STDOUT_FRAME_PREFIX = 49;
    private static final String TAG = "FramingSocket";
    private final DataInputStream mInput;
    private final DataOutputStream mMultiplexedOutputStream;
    private final InputStream mStdin = new FramingInputStream();
    private final PrintStream mStdout = new PrintStream(new BufferedOutputStream(new FramingOutputStream((byte) 49)));
    private final PrintStream mStderr = new PrintStream(new FramingOutputStream((byte) 50));

    /* loaded from: classes-dex2jar.jar:com/facebook/stetho/dumpapp/Framer$ClosedHelper.class */
    static class ClosedHelper {
        private volatile boolean mClosed;

        private ClosedHelper() {
        }

        public void close() {
            this.mClosed = true;
        }

        public void throwIfClosed() throws IOException {
            if (this.mClosed) {
                throw new IOException("Stream is closed");
            }
        }
    }

    /* loaded from: classes-dex2jar.jar:com/facebook/stetho/dumpapp/Framer$FramingInputStream.class */
    class FramingInputStream extends InputStream {
        private final ClosedHelper mClosedHelper;

        private FramingInputStream() {
            this.mClosedHelper = new ClosedHelper();
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.mClosedHelper.close();
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            byte[] bArr = new byte[1];
            if (read(bArr) == 0) {
                return -1;
            }
            return bArr[0];
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr) throws IOException {
            return read(bArr, 0, bArr.length);
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i, int i2) throws IOException {
            int readInt;
            this.mClosedHelper.throwIfClosed();
            synchronized (Framer.this) {
                Framer.this.writeIntFrame((byte) 95, i2);
                byte readFrameType = Framer.this.readFrameType();
                if (readFrameType == 45) {
                    readInt = Framer.this.readInt();
                    if (readInt > 0) {
                        if (readInt <= i2) {
                            Framer.this.mInput.readFully(bArr, i, readInt);
                        } else {
                            StringBuilder sb = new StringBuilder("Expected at most ");
                            sb.append(i2);
                            sb.append(" bytes, got: ");
                            sb.append(readInt);
                            throw new DumpappFramingException(sb.toString());
                        }
                    }
                } else {
                    throw new UnexpectedFrameException((byte) 45, readFrameType);
                }
            }
            return readInt;
        }

        @Override // java.io.InputStream
        public long skip(long j) throws IOException {
            long j2;
            byte[] bArr = new byte[(int) Math.min(j, 2048L)];
            synchronized (Framer.this) {
                j2 = 0;
                while (j2 < j) {
                    int read = read(bArr);
                    if (read < 0) {
                        break;
                    }
                    j2 += (long) read;
                }
            }
            return j2;
        }
    }

    /* loaded from: classes-dex2jar.jar:com/facebook/stetho/dumpapp/Framer$FramingOutputStream.class */
    class FramingOutputStream extends OutputStream {
        private final ClosedHelper mClosedHelper = new ClosedHelper();
        private final byte mPrefix;

        public FramingOutputStream(byte b) {
            this.mPrefix = (byte) b;
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.mClosedHelper.close();
        }

        @Override // java.io.OutputStream
        public void write(int i) throws IOException {
            write(new byte[]{(byte) i}, 0, 1);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr) throws IOException {
            write(bArr, 0, bArr.length);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i, int i2) throws IOException {
            this.mClosedHelper.throwIfClosed();
            if (i2 > 0) {
                try {
                    synchronized (Framer.this) {
                        Framer.this.writeIntFrame(this.mPrefix, i2);
                        Framer.this.writeBlob(bArr, i, i2);
                        Framer.this.mMultiplexedOutputStream.flush();
                    }
                } catch (IOException e) {
                    throw new DumpappOutputBrokenException(e);
                }
            }
        }
    }

    public Framer(InputStream inputStream, OutputStream outputStream) throws IOException {
        this.mInput = new DataInputStream(inputStream);
        this.mMultiplexedOutputStream = new DataOutputStream(outputStream);
    }

    private static <T extends Throwable> T handleSuppression(@Nullable T t, T t2) {
        if (t == null) {
            return t2;
        }
        StringBuilder sb = new StringBuilder("Suppressed while handling ");
        sb.append(t);
        LogUtil.i(TAG, t2, sb.toString());
        return t;
    }

    public PrintStream getStderr() {
        return this.mStderr;
    }

    public InputStream getStdin() {
        return this.mStdin;
    }

    public PrintStream getStdout() {
        return this.mStdout;
    }

    public byte readFrameType() throws IOException {
        return this.mInput.readByte();
    }

    public int readInt() throws IOException {
        return this.mInput.readInt();
    }

    public String readString() throws IOException {
        byte[] bArr = new byte[this.mInput.readUnsignedShort()];
        this.mInput.readFully(bArr);
        return new String(bArr, Charset.forName(Utf8Charset.NAME));
    }

    public void writeBlob(byte[] bArr, int i, int i2) throws IOException {
        this.mMultiplexedOutputStream.write(bArr, i, i2);
    }

    public void writeExitCode(int i) throws IOException {
        this.mStdout.flush();
        this.mStderr.flush();
        writeIntFrame((byte) 120, i);
    }

    public void writeIntFrame(byte b, int i) throws IOException {
        this.mMultiplexedOutputStream.write(b);
        this.mMultiplexedOutputStream.writeInt(i);
    }
}
