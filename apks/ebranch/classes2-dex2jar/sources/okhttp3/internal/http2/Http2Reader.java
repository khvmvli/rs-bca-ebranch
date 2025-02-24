package okhttp3.internal.http2;

import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import o.defaultInspectorModulesProvider;
import o.newInitializerBuilder;
import o.setResponseContentType;
import o.setResponseMessage;
import o.setTookMs;
import okhttp3.internal.Util;
import okhttp3.internal.http2.Hpack;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2-dex2jar.jar:okhttp3/internal/http2/Http2Reader.class */
public final class Http2Reader implements Closeable {
    static final Logger logger = Logger.getLogger(Http2.class.getName());
    private final boolean client;
    private final ContinuationSource continuation;
    final Hpack.Reader hpackReader;
    private final setTookMs source;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2-dex2jar.jar:okhttp3/internal/http2/Http2Reader$ContinuationSource.class */
    public static final class ContinuationSource implements defaultInspectorModulesProvider {
        byte flags;
        int left;
        int length;
        short padding;
        private final setTookMs source;
        int streamId;

        ContinuationSource(setTookMs settookms) {
            this.source = settookms;
        }

        private void readContinuationHeader() throws IOException {
            int i = this.streamId;
            int readMedium = Http2Reader.readMedium(this.source);
            this.left = readMedium;
            this.length = readMedium;
            byte i2 = this.source.i();
            this.flags = (byte) this.source.i();
            if (Http2Reader.logger.isLoggable(Level.FINE)) {
                Http2Reader.logger.fine(Http2.frameLog(true, this.streamId, this.length, i2, this.flags));
            }
            int n = this.source.n() & Integer.MAX_VALUE;
            this.streamId = n;
            if (i2 != 9) {
                throw Http2.ioException("%s != TYPE_CONTINUATION", new Object[]{Byte.valueOf(i2)});
            } else if (n != i) {
                throw Http2.ioException("TYPE_CONTINUATION streamId changed", new Object[0]);
            }
        }

        public final void close() throws IOException {
        }

        public final long read(setResponseContentType setresponsecontenttype, long j) throws IOException {
            while (true) {
                int i = this.left;
                if (i == 0) {
                    this.source.f((long) this.padding);
                    this.padding = (short) 0;
                    if ((this.flags & 4) != 0) {
                        return -1;
                    }
                    readContinuationHeader();
                } else {
                    long read = this.source.read(setresponsecontenttype, Math.min(j, (long) i));
                    if (read == -1) {
                        return -1;
                    }
                    this.left = (int) (((long) this.left) - read);
                    return read;
                }
            }
        }

        public final newInitializerBuilder timeout() {
            return this.source.timeout();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2-dex2jar.jar:okhttp3/internal/http2/Http2Reader$Handler.class */
    public interface Handler {
        void ackSettings();

        void alternateService(int i, String str, setResponseMessage setresponsemessage, String str2, int i2, long j);

        void data(boolean z, int i, setTookMs settookms, int i2) throws IOException;

        void goAway(int i, ErrorCode errorCode, setResponseMessage setresponsemessage);

        void headers(boolean z, int i, int i2, List<Header> list);

        void ping(boolean z, int i, int i2);

        void priority(int i, int i2, int i3, boolean z);

        void pushPromise(int i, int i2, List<Header> list) throws IOException;

        void rstStream(int i, ErrorCode errorCode);

        void settings(boolean z, Settings settings);

        void windowUpdate(int i, long j);
    }

    Http2Reader(setTookMs settookms, boolean z) {
        this.source = settookms;
        this.client = z;
        ContinuationSource continuationSource = new ContinuationSource(settookms);
        this.continuation = continuationSource;
        this.hpackReader = new Hpack.Reader(4096, continuationSource);
    }

    static int lengthWithoutPadding(int i, byte b, short s) throws IOException {
        int i2 = i;
        if ((b & 8) != 0) {
            i2 = i - 1;
        }
        if (s <= i2) {
            return (short) (i2 - s);
        }
        throw Http2.ioException("PROTOCOL_ERROR padding %s > remaining length %s", new Object[]{Short.valueOf(s), Integer.valueOf(i2)});
    }

    private void readData(Handler handler, int i, byte b, int i2) throws IOException {
        short s = 0;
        if (i2 != 0) {
            boolean z = true;
            boolean z2 = (b & 1) != 0;
            if ((b & 32) == 0) {
                z = false;
            }
            if (!z) {
                if ((b & 8) != 0) {
                    s = (short) (this.source.i() & 255);
                }
                handler.data(z2, i2, this.source, lengthWithoutPadding(i, b, s));
                this.source.f((long) s);
                return;
            }
            throw Http2.ioException("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA", new Object[0]);
        }
        throw Http2.ioException("PROTOCOL_ERROR: TYPE_DATA streamId == 0", new Object[0]);
    }

    private void readGoAway(Handler handler, int i, byte b, int i2) throws IOException {
        if (i < 8) {
            throw Http2.ioException("TYPE_GOAWAY length < 8: %s", new Object[]{Integer.valueOf(i)});
        } else if (i2 == 0) {
            int n = this.source.n();
            int n2 = this.source.n();
            int i3 = i - 8;
            ErrorCode fromHttp2 = ErrorCode.fromHttp2(n2);
            if (fromHttp2 != null) {
                setResponseMessage setresponsemessage = setResponseMessage.c;
                if (i3 > 0) {
                    setresponsemessage = this.source.c((long) i3);
                }
                handler.goAway(n, fromHttp2, setresponsemessage);
                return;
            }
            throw Http2.ioException("TYPE_GOAWAY unexpected error code: %d", new Object[]{Integer.valueOf(n2)});
        } else {
            throw Http2.ioException("TYPE_GOAWAY streamId != 0", new Object[0]);
        }
    }

    private List<Header> readHeaderBlock(int i, short s, byte b, int i2) throws IOException {
        ContinuationSource continuationSource = this.continuation;
        continuationSource.left = i;
        continuationSource.length = i;
        this.continuation.padding = (short) s;
        this.continuation.flags = (byte) b;
        this.continuation.streamId = i2;
        this.hpackReader.readHeaders();
        return this.hpackReader.getAndResetHeaderList();
    }

    private void readHeaders(Handler handler, int i, byte b, int i2) throws IOException {
        short s = 0;
        if (i2 != 0) {
            boolean z = (b & 1) != 0;
            if ((b & 8) != 0) {
                s = (short) (this.source.i() & 255);
            }
            int i3 = i;
            if ((b & 32) != 0) {
                readPriority(handler, i2);
                i3 = i - 5;
            }
            handler.headers(z, i2, -1, readHeaderBlock(lengthWithoutPadding(i3, b, s), s, b, i2));
            return;
        }
        throw Http2.ioException("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0", new Object[0]);
    }

    static int readMedium(setTookMs settookms) throws IOException {
        return (settookms.i() & 255) | ((settookms.i() & 255) << 16) | ((settookms.i() & 255) << 8);
    }

    private void readPing(Handler handler, int i, byte b, int i2) throws IOException {
        boolean z = true;
        if (i != 8) {
            throw Http2.ioException("TYPE_PING length != 8: %s", new Object[]{Integer.valueOf(i)});
        } else if (i2 == 0) {
            int n = this.source.n();
            int n2 = this.source.n();
            if ((b & 1) == 0) {
                z = false;
            }
            handler.ping(z, n, n2);
        } else {
            throw Http2.ioException("TYPE_PING streamId != 0", new Object[0]);
        }
    }

    private void readPriority(Handler handler, int i) throws IOException {
        int n = this.source.n();
        handler.priority(i, n & Integer.MAX_VALUE, (this.source.i() & 255) + 1, (Integer.MIN_VALUE & n) != 0);
    }

    private void readPriority(Handler handler, int i, byte b, int i2) throws IOException {
        if (i != 5) {
            throw Http2.ioException("TYPE_PRIORITY length: %d != 5", new Object[]{Integer.valueOf(i)});
        } else if (i2 != 0) {
            readPriority(handler, i2);
        } else {
            throw Http2.ioException("TYPE_PRIORITY streamId == 0", new Object[0]);
        }
    }

    private void readPushPromise(Handler handler, int i, byte b, int i2) throws IOException {
        short s = 0;
        if (i2 != 0) {
            if ((b & 8) != 0) {
                s = (short) (this.source.i() & 255);
            }
            handler.pushPromise(i2, Integer.MAX_VALUE & this.source.n(), readHeaderBlock(lengthWithoutPadding(i - 4, b, s), s, b, i2));
            return;
        }
        throw Http2.ioException("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0", new Object[0]);
    }

    private void readRstStream(Handler handler, int i, byte b, int i2) throws IOException {
        if (i != 4) {
            throw Http2.ioException("TYPE_RST_STREAM length: %d != 4", new Object[]{Integer.valueOf(i)});
        } else if (i2 != 0) {
            int n = this.source.n();
            ErrorCode fromHttp2 = ErrorCode.fromHttp2(n);
            if (fromHttp2 != null) {
                handler.rstStream(i2, fromHttp2);
                return;
            }
            throw Http2.ioException("TYPE_RST_STREAM unexpected error code: %d", new Object[]{Integer.valueOf(n)});
        } else {
            throw Http2.ioException("TYPE_RST_STREAM streamId == 0", new Object[0]);
        }
    }

    private void readSettings(Handler handler, int i, byte b, int i2) throws IOException {
        int i3;
        if (i2 != 0) {
            throw Http2.ioException("TYPE_SETTINGS streamId != 0", new Object[0]);
        } else if ((b & 1) != 0) {
            if (i == 0) {
                handler.ackSettings();
                return;
            }
            throw Http2.ioException("FRAME_SIZE_ERROR ack frame should be empty!", new Object[0]);
        } else if (i % 6 == 0) {
            Settings settings = new Settings();
            for (int i4 = 0; i4 < i; i4 += 6) {
                int s = this.source.s() & 65535;
                int n = this.source.n();
                if (s == 2) {
                    i3 = s;
                    if (n == 0) {
                        continue;
                    } else if (n == 1) {
                        i3 = s;
                    } else {
                        throw Http2.ioException("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1", new Object[0]);
                    }
                } else if (s == 3) {
                    i3 = 4;
                } else if (s != 4) {
                    if (s != 5) {
                        i3 = s;
                    } else if (n < 16384 || n > 16777215) {
                        throw Http2.ioException("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: %s", new Object[]{Integer.valueOf(n)});
                    } else {
                        i3 = s;
                    }
                } else if (n >= 0) {
                    i3 = 7;
                } else {
                    throw Http2.ioException("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1", new Object[0]);
                }
                settings.set(i3, n);
            }
            handler.settings(false, settings);
        } else {
            throw Http2.ioException("TYPE_SETTINGS length %% 6 != 0: %s", new Object[]{Integer.valueOf(i)});
        }
    }

    private void readWindowUpdate(Handler handler, int i, byte b, int i2) throws IOException {
        if (i == 4) {
            long n = ((long) this.source.n()) & 2147483647L;
            if (n != 0) {
                handler.windowUpdate(i2, n);
                return;
            }
            throw Http2.ioException("windowSizeIncrement was 0", new Object[]{Long.valueOf(n)});
        }
        throw Http2.ioException("TYPE_WINDOW_UPDATE length !=4: %s", new Object[]{Integer.valueOf(i)});
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.source.close();
    }

    public final boolean nextFrame(boolean z, Handler handler) throws IOException {
        try {
            this.source.i(9);
            int readMedium = readMedium(this.source);
            if (readMedium < 0 || readMedium > 16384) {
                throw Http2.ioException("FRAME_SIZE_ERROR: %s", new Object[]{Integer.valueOf(readMedium)});
            }
            byte i = this.source.i();
            if (!z || i == 4) {
                byte i2 = this.source.i();
                int n = this.source.n() & Integer.MAX_VALUE;
                Logger logger2 = logger;
                if (logger2.isLoggable(Level.FINE)) {
                    logger2.fine(Http2.frameLog(true, n, readMedium, i, i2));
                }
                switch (i) {
                    case 0:
                        readData(handler, readMedium, i2, n);
                        return true;
                    case 1:
                        readHeaders(handler, readMedium, i2, n);
                        return true;
                    case 2:
                        readPriority(handler, readMedium, i2, n);
                        return true;
                    case 3:
                        readRstStream(handler, readMedium, i2, n);
                        return true;
                    case 4:
                        readSettings(handler, readMedium, i2, n);
                        return true;
                    case 5:
                        readPushPromise(handler, readMedium, i2, n);
                        return true;
                    case 6:
                        readPing(handler, readMedium, i2, n);
                        return true;
                    case 7:
                        readGoAway(handler, readMedium, i2, n);
                        return true;
                    case 8:
                        readWindowUpdate(handler, readMedium, i2, n);
                        return true;
                    default:
                        this.source.f((long) readMedium);
                        return true;
                }
            } else {
                throw Http2.ioException("Expected a SETTINGS frame but was %s", new Object[]{Byte.valueOf(i)});
            }
        } catch (IOException e) {
            return false;
        }
    }

    public final void readConnectionPreface(Handler handler) throws IOException {
        if (!this.client) {
            setResponseMessage c = this.source.c((long) Http2.CONNECTION_PREFACE.g());
            Logger logger2 = logger;
            if (logger2.isLoggable(Level.FINE)) {
                logger2.fine(Util.format("<< CONNECTION %s", new Object[]{c.e()}));
            }
            if (!Http2.CONNECTION_PREFACE.equals(c)) {
                throw Http2.ioException("Expected a connection header but was %s", new Object[]{c.j()});
            }
        } else if (!nextFrame(true, handler)) {
            throw Http2.ioException("Required SETTINGS preface not received", new Object[0]);
        }
    }
}
