package okhttp3.internal.http2;

import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import o.setResponseContentType;
import o.setScheme$com_github_ChuckerTeam_Chucker_library;
import okhttp3.internal.Util;
import okhttp3.internal.http2.Hpack;
/* loaded from: classes-dex2jar.jar:okhttp3/internal/http2/Http2Writer.class */
final class Http2Writer implements Closeable {
    private static final Logger logger = Logger.getLogger(Http2.class.getName());
    private final boolean client;
    private boolean closed;
    private final setResponseContentType hpackBuffer;
    final Hpack.Writer hpackWriter;
    private int maxFrameSize = 16384;
    private final setScheme$com_github_ChuckerTeam_Chucker_library sink;

    /* JADX INFO: Access modifiers changed from: package-private */
    public Http2Writer(setScheme$com_github_ChuckerTeam_Chucker_library setscheme_com_github_chuckerteam_chucker_library, boolean z) {
        this.sink = setscheme_com_github_chuckerteam_chucker_library;
        this.client = z;
        setResponseContentType setresponsecontenttype = new setResponseContentType();
        this.hpackBuffer = setresponsecontenttype;
        this.hpackWriter = new Hpack.Writer(setresponsecontenttype);
    }

    private void writeContinuationFrames(int i, long j) throws IOException {
        while (j > 0) {
            int min = (int) Math.min((long) this.maxFrameSize, j);
            long j2 = (long) min;
            j -= j2;
            frameHeader(i, min, (byte) 9, j == 0 ? (byte) 4 : 0);
            this.sink.write(this.hpackBuffer, j2);
        }
    }

    private static void writeMedium(setScheme$com_github_ChuckerTeam_Chucker_library setscheme_com_github_chuckerteam_chucker_library, int i) throws IOException {
        setscheme_com_github_chuckerteam_chucker_library.e((i >>> 16) & 255);
        setscheme_com_github_chuckerteam_chucker_library.e((i >>> 8) & 255);
        setscheme_com_github_chuckerteam_chucker_library.e(i & 255);
    }

    public final void applyAndAckSettings(Settings settings) throws IOException {
        synchronized (this) {
            if (!this.closed) {
                this.maxFrameSize = settings.getMaxFrameSize(this.maxFrameSize);
                if (settings.getHeaderTableSize() != -1) {
                    this.hpackWriter.setHeaderTableSizeSetting(settings.getHeaderTableSize());
                }
                frameHeader(0, 0, (byte) 4, (byte) 1);
                this.sink.flush();
            } else {
                throw new IOException("closed");
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        synchronized (this) {
            this.closed = true;
            this.sink.close();
        }
    }

    public final void connectionPreface() throws IOException {
        synchronized (this) {
            if (this.closed) {
                throw new IOException("closed");
            } else if (this.client) {
                Logger logger2 = logger;
                if (logger2.isLoggable(Level.FINE)) {
                    logger2.fine(Util.format(">> CONNECTION %s", Http2.CONNECTION_PREFACE.e()));
                }
                this.sink.e(Http2.CONNECTION_PREFACE.f());
                this.sink.flush();
            }
        }
    }

    public final void data(boolean z, int i, setResponseContentType setresponsecontenttype, int i2) throws IOException {
        synchronized (this) {
            if (!this.closed) {
                dataFrame(i, z ? (byte) 1 : 0, setresponsecontenttype, i2);
            } else {
                throw new IOException("closed");
            }
        }
    }

    final void dataFrame(int i, byte b, setResponseContentType setresponsecontenttype, int i2) throws IOException {
        frameHeader(i, i2, (byte) 0, b);
        if (i2 > 0) {
            this.sink.write(setresponsecontenttype, (long) i2);
        }
    }

    public final void flush() throws IOException {
        synchronized (this) {
            if (!this.closed) {
                this.sink.flush();
            } else {
                throw new IOException("closed");
            }
        }
    }

    public final void frameHeader(int i, int i2, byte b, byte b2) throws IOException {
        Logger logger2 = logger;
        if (logger2.isLoggable(Level.FINE)) {
            logger2.fine(Http2.frameLog(false, i, i2, b, b2));
        }
        int i3 = this.maxFrameSize;
        if (i2 > i3) {
            throw Http2.illegalArgument("FRAME_SIZE_ERROR length > %d: %d", Integer.valueOf(i3), Integer.valueOf(i2));
        } else if ((Integer.MIN_VALUE & i) == 0) {
            writeMedium(this.sink, i2);
            this.sink.e(b & 255);
            this.sink.e(b2 & 255);
            this.sink.a(i & Integer.MAX_VALUE);
        } else {
            throw Http2.illegalArgument("reserved bit set: %s", Integer.valueOf(i));
        }
    }

    public final void goAway(int i, ErrorCode errorCode, byte[] bArr) throws IOException {
        synchronized (this) {
            if (this.closed) {
                throw new IOException("closed");
            } else if (errorCode.httpCode != -1) {
                frameHeader(0, bArr.length + 8, (byte) 7, (byte) 0);
                this.sink.a(i);
                this.sink.a(errorCode.httpCode);
                if (bArr.length > 0) {
                    this.sink.e(bArr);
                }
                this.sink.flush();
            } else {
                throw Http2.illegalArgument("errorCode.httpCode == -1", new Object[0]);
            }
        }
    }

    public final void headers(int i, List<Header> list) throws IOException {
        synchronized (this) {
            if (!this.closed) {
                headers(false, i, list);
            } else {
                throw new IOException("closed");
            }
        }
    }

    final void headers(boolean z, int i, List<Header> list) throws IOException {
        if (!this.closed) {
            this.hpackWriter.writeHeaders(list);
            long j = this.hpackBuffer.b;
            int min = (int) Math.min((long) this.maxFrameSize, j);
            long j2 = (long) min;
            int i2 = (j > j2 ? 1 : (j == j2 ? 0 : -1));
            byte b = i2 == 0 ? (byte) 4 : 0;
            byte b2 = b;
            if (z) {
                b2 = (byte) (b | 1);
            }
            frameHeader(i, min, (byte) 1, b2);
            this.sink.write(this.hpackBuffer, j2);
            if (i2 > 0) {
                writeContinuationFrames(i, j - j2);
                return;
            }
            return;
        }
        throw new IOException("closed");
    }

    public final int maxDataLength() {
        return this.maxFrameSize;
    }

    public final void ping(boolean z, int i, int i2) throws IOException {
        synchronized (this) {
            if (!this.closed) {
                frameHeader(0, 8, (byte) 6, z ? (byte) 1 : 0);
                this.sink.a(i);
                this.sink.a(i2);
                this.sink.flush();
            } else {
                throw new IOException("closed");
            }
        }
    }

    public final void pushPromise(int i, int i2, List<Header> list) throws IOException {
        synchronized (this) {
            if (!this.closed) {
                this.hpackWriter.writeHeaders(list);
                long j = this.hpackBuffer.b;
                int min = (int) Math.min((long) (this.maxFrameSize - 4), j);
                long j2 = (long) min;
                int i3 = (j > j2 ? 1 : (j == j2 ? 0 : -1));
                frameHeader(i, min + 4, (byte) 5, i3 == 0 ? (byte) 4 : 0);
                this.sink.a(i2 & Integer.MAX_VALUE);
                this.sink.write(this.hpackBuffer, j2);
                if (i3 > 0) {
                    writeContinuationFrames(i, j - j2);
                }
            } else {
                throw new IOException("closed");
            }
        }
    }

    public final void rstStream(int i, ErrorCode errorCode) throws IOException {
        synchronized (this) {
            if (this.closed) {
                throw new IOException("closed");
            } else if (errorCode.httpCode != -1) {
                frameHeader(i, 4, (byte) 3, (byte) 0);
                this.sink.a(errorCode.httpCode);
                this.sink.flush();
            } else {
                throw new IllegalArgumentException();
            }
        }
    }

    public final void settings(Settings settings) throws IOException {
        synchronized (this) {
            if (!this.closed) {
                int i = 0;
                frameHeader(0, settings.size() * 6, (byte) 4, (byte) 0);
                while (i < 10) {
                    if (settings.isSet(i)) {
                        this.sink.f(i == 4 ? 3 : i == 7 ? 4 : i);
                        this.sink.a(settings.get(i));
                    }
                    i++;
                }
                this.sink.flush();
            } else {
                throw new IOException("closed");
            }
        }
    }

    public final void synReply(boolean z, int i, List<Header> list) throws IOException {
        synchronized (this) {
            if (!this.closed) {
                headers(z, i, list);
            } else {
                throw new IOException("closed");
            }
        }
    }

    public final void synStream(boolean z, int i, int i2, List<Header> list) throws IOException {
        synchronized (this) {
            if (!this.closed) {
                headers(z, i, list);
            } else {
                throw new IOException("closed");
            }
        }
    }

    public final void windowUpdate(int i, long j) throws IOException {
        synchronized (this) {
            if (this.closed) {
                throw new IOException("closed");
            } else if (j == 0 || j > 2147483647L) {
                throw Http2.illegalArgument("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: %s", Long.valueOf(j));
            } else {
                frameHeader(i, 4, (byte) 8, (byte) 0);
                this.sink.a((int) j);
                this.sink.flush();
            }
        }
    }
}
