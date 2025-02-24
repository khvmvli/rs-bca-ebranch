package okhttp3.internal.ws;

import io.realm.RealmFieldTypeConstants;
import java.io.IOException;
import java.util.Random;
import o.initialize;
import o.newInitializerBuilder;
import o.setResponseContentType;
import o.setResponseContentType$MediaBrowserCompat$CustomActionResultReceiver;
import o.setResponseMessage;
import o.setScheme;
/* loaded from: classes2-dex2jar.jar:okhttp3/internal/ws/WebSocketWriter.class */
final class WebSocketWriter {
    boolean activeWriter;
    final setResponseContentType buffer = new setResponseContentType();
    final FrameSink frameSink = new FrameSink();
    final boolean isClient;
    private final setResponseContentType$MediaBrowserCompat$CustomActionResultReceiver maskCursor;
    private final byte[] maskKey;
    final Random random;
    final setScheme.com_github_ChuckerTeam_Chucker_library sink;
    final setResponseContentType sinkBuffer;
    boolean writerClosed;

    /* loaded from: classes2-dex2jar.jar:okhttp3/internal/ws/WebSocketWriter$FrameSink.class */
    final class FrameSink implements initialize {
        boolean closed;
        long contentLength;
        int formatOpcode;
        boolean isFirstFrame;

        FrameSink() {
        }

        public final void close() throws IOException {
            if (!this.closed) {
                WebSocketWriter webSocketWriter = WebSocketWriter.this;
                webSocketWriter.writeMessageFrame(this.formatOpcode, webSocketWriter.buffer.b, this.isFirstFrame, true);
                this.closed = true;
                WebSocketWriter.this.activeWriter = false;
                return;
            }
            throw new IOException("closed");
        }

        public final void flush() throws IOException {
            if (!this.closed) {
                WebSocketWriter webSocketWriter = WebSocketWriter.this;
                webSocketWriter.writeMessageFrame(this.formatOpcode, webSocketWriter.buffer.b, this.isFirstFrame, false);
                this.isFirstFrame = false;
                return;
            }
            throw new IOException("closed");
        }

        public final newInitializerBuilder timeout() {
            return WebSocketWriter.this.sink.timeout();
        }

        public final void write(setResponseContentType setresponsecontenttype, long j) throws IOException {
            if (!this.closed) {
                WebSocketWriter.this.buffer.write(setresponsecontenttype, j);
                boolean z = this.isFirstFrame && this.contentLength != -1 && WebSocketWriter.this.buffer.b > this.contentLength - 8192;
                long b = WebSocketWriter.this.buffer.b();
                if (b > 0 && !z) {
                    WebSocketWriter.this.writeMessageFrame(this.formatOpcode, b, this.isFirstFrame, false);
                    this.isFirstFrame = false;
                    return;
                }
                return;
            }
            throw new IOException("closed");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public WebSocketWriter(boolean z, setScheme.com_github_ChuckerTeam_Chucker_library com_github_chuckerteam_chucker_library, Random random) {
        if (com_github_chuckerteam_chucker_library == null) {
            throw new NullPointerException("sink == null");
        } else if (random != null) {
            this.isClient = z;
            this.sink = com_github_chuckerteam_chucker_library;
            this.sinkBuffer = com_github_chuckerteam_chucker_library.c();
            this.random = random;
            setResponseContentType$MediaBrowserCompat$CustomActionResultReceiver setresponsecontenttype_mediabrowsercompat_customactionresultreceiver = null;
            this.maskKey = z ? new byte[4] : null;
            this.maskCursor = z ? new setResponseContentType$MediaBrowserCompat$CustomActionResultReceiver() : setresponsecontenttype_mediabrowsercompat_customactionresultreceiver;
        } else {
            throw new NullPointerException("random == null");
        }
    }

    private void writeControlFrame(int i, setResponseMessage setresponsemessage) throws IOException {
        if (!this.writerClosed) {
            int g = setresponsemessage.g();
            if (((long) g) <= 125) {
                this.sinkBuffer.b(i | RealmFieldTypeConstants.LIST_OFFSET);
                if (this.isClient) {
                    this.sinkBuffer.b(g | RealmFieldTypeConstants.LIST_OFFSET);
                    this.random.nextBytes(this.maskKey);
                    setResponseContentType setresponsecontenttype = this.sinkBuffer;
                    byte[] bArr = this.maskKey;
                    if (bArr != null) {
                        setresponsecontenttype.e(bArr, 0, bArr.length);
                        if (g > 0) {
                            long j = this.sinkBuffer.b;
                            setResponseContentType setresponsecontenttype2 = this.sinkBuffer;
                            if (setresponsemessage != null) {
                                setresponsemessage.c(setresponsecontenttype2);
                                setResponseContentType setresponsecontenttype3 = this.sinkBuffer;
                                setResponseContentType$MediaBrowserCompat$CustomActionResultReceiver setresponsecontenttype_mediabrowsercompat_customactionresultreceiver = this.maskCursor;
                                if (setresponsecontenttype_mediabrowsercompat_customactionresultreceiver.d == null) {
                                    setresponsecontenttype_mediabrowsercompat_customactionresultreceiver.d = setresponsecontenttype3;
                                    setresponsecontenttype_mediabrowsercompat_customactionresultreceiver.a = true;
                                    this.maskCursor.a(j);
                                    WebSocketProtocol.toggleMask(this.maskCursor, this.maskKey);
                                    this.maskCursor.close();
                                } else {
                                    throw new IllegalStateException("already attached to a buffer");
                                }
                            } else {
                                throw new IllegalArgumentException("byteString == null");
                            }
                        }
                    } else {
                        throw new IllegalArgumentException("source == null");
                    }
                } else {
                    this.sinkBuffer.b(g);
                    setResponseContentType setresponsecontenttype4 = this.sinkBuffer;
                    if (setresponsemessage != null) {
                        setresponsemessage.c(setresponsecontenttype4);
                    } else {
                        throw new IllegalArgumentException("byteString == null");
                    }
                }
                this.sink.flush();
                return;
            }
            throw new IllegalArgumentException("Payload size must be less than or equal to 125");
        }
        throw new IOException("closed");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final initialize newMessageSink(int i, long j) {
        if (!this.activeWriter) {
            this.activeWriter = true;
            this.frameSink.formatOpcode = i;
            this.frameSink.contentLength = j;
            this.frameSink.isFirstFrame = true;
            this.frameSink.closed = false;
            return this.frameSink;
        }
        throw new IllegalStateException("Another message writer is active. Did you call close()?");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void writeClose(int i, setResponseMessage setresponsemessage) throws IOException {
        setResponseMessage setresponsemessage2 = setResponseMessage.c;
        if (!(i == 0 && setresponsemessage == null)) {
            if (i != 0) {
                WebSocketProtocol.validateCloseCode(i);
            }
            setResponseContentType setresponsecontenttype = new setResponseContentType();
            setresponsecontenttype.i(i);
            if (setresponsemessage != null) {
                if (setresponsemessage != null) {
                    setresponsemessage.c(setresponsecontenttype);
                } else {
                    throw new IllegalArgumentException("byteString == null");
                }
            }
            setresponsemessage2 = new setResponseMessage(setresponsecontenttype.l());
        }
        try {
            writeControlFrame(8, setresponsemessage2);
        } finally {
            this.writerClosed = true;
        }
    }

    final void writeMessageFrame(int i, long j, boolean z, boolean z2) throws IOException {
        if (!this.writerClosed) {
            if (!z) {
                i = 0;
            }
            int i2 = i;
            if (z2) {
                i2 = i | RealmFieldTypeConstants.LIST_OFFSET;
            }
            this.sinkBuffer.b(i2);
            int i3 = this.isClient ? RealmFieldTypeConstants.LIST_OFFSET : 0;
            if (j <= 125) {
                this.sinkBuffer.b(i3 | ((int) j));
            } else if (j <= 65535) {
                this.sinkBuffer.b(i3 | 126);
                this.sinkBuffer.i((int) j);
            } else {
                this.sinkBuffer.b(i3 | 127);
                this.sinkBuffer.n(j);
            }
            if (this.isClient) {
                this.random.nextBytes(this.maskKey);
                setResponseContentType setresponsecontenttype = this.sinkBuffer;
                byte[] bArr = this.maskKey;
                if (bArr != null) {
                    setresponsecontenttype.e(bArr, 0, bArr.length);
                    if (j > 0) {
                        long j2 = this.sinkBuffer.b;
                        this.sinkBuffer.write(this.buffer, j);
                        setResponseContentType setresponsecontenttype2 = this.sinkBuffer;
                        setResponseContentType$MediaBrowserCompat$CustomActionResultReceiver setresponsecontenttype_mediabrowsercompat_customactionresultreceiver = this.maskCursor;
                        if (setresponsecontenttype_mediabrowsercompat_customactionresultreceiver.d == null) {
                            setresponsecontenttype_mediabrowsercompat_customactionresultreceiver.d = setresponsecontenttype2;
                            setresponsecontenttype_mediabrowsercompat_customactionresultreceiver.a = true;
                            this.maskCursor.a(j2);
                            WebSocketProtocol.toggleMask(this.maskCursor, this.maskKey);
                            this.maskCursor.close();
                        } else {
                            throw new IllegalStateException("already attached to a buffer");
                        }
                    }
                } else {
                    throw new IllegalArgumentException("source == null");
                }
            } else {
                this.sinkBuffer.write(this.buffer, j);
            }
            this.sink.e();
            return;
        }
        throw new IOException("closed");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void writePing(setResponseMessage setresponsemessage) throws IOException {
        writeControlFrame(9, setresponsemessage);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void writePong(setResponseMessage setresponsemessage) throws IOException {
        writeControlFrame(10, setresponsemessage);
    }
}
