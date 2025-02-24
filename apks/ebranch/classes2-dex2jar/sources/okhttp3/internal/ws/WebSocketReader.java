package okhttp3.internal.ws;

import io.realm.RealmFieldTypeConstants;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import o.setResponseContentType;
import o.setResponseContentType$MediaBrowserCompat$CustomActionResultReceiver;
import o.setResponseMessage;
import o.setTookMs;
/* loaded from: classes2-dex2jar.jar:okhttp3/internal/ws/WebSocketReader.class */
final class WebSocketReader {
    boolean closed;
    final FrameCallback frameCallback;
    long frameLength;
    final boolean isClient;
    boolean isControlFrame;
    boolean isFinalFrame;
    private final setResponseContentType$MediaBrowserCompat$CustomActionResultReceiver maskCursor;
    private final byte[] maskKey;
    int opcode;
    final setTookMs source;
    private final setResponseContentType controlFrameBuffer = new setResponseContentType();
    private final setResponseContentType messageFrameBuffer = new setResponseContentType();

    /* loaded from: classes2-dex2jar.jar:okhttp3/internal/ws/WebSocketReader$FrameCallback.class */
    public interface FrameCallback {
        void onReadClose(int i, String str);

        void onReadMessage(String str) throws IOException;

        void onReadMessage(setResponseMessage setresponsemessage) throws IOException;

        void onReadPing(setResponseMessage setresponsemessage);

        void onReadPong(setResponseMessage setresponsemessage);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public WebSocketReader(boolean z, setTookMs settookms, FrameCallback frameCallback) {
        if (settookms == null) {
            throw new NullPointerException("source == null");
        } else if (frameCallback != null) {
            this.isClient = z;
            this.source = settookms;
            this.frameCallback = frameCallback;
            setResponseContentType$MediaBrowserCompat$CustomActionResultReceiver setresponsecontenttype_mediabrowsercompat_customactionresultreceiver = null;
            this.maskKey = z ? null : new byte[4];
            if (!z) {
                setresponsecontenttype_mediabrowsercompat_customactionresultreceiver = new setResponseContentType$MediaBrowserCompat$CustomActionResultReceiver();
            }
            this.maskCursor = setresponsecontenttype_mediabrowsercompat_customactionresultreceiver;
        } else {
            throw new NullPointerException("frameCallback == null");
        }
    }

    private void readControlFrame() throws IOException {
        short s;
        String str;
        long j = this.frameLength;
        if (j > 0) {
            this.source.d(this.controlFrameBuffer, j);
            if (!this.isClient) {
                setResponseContentType setresponsecontenttype = this.controlFrameBuffer;
                setResponseContentType$MediaBrowserCompat$CustomActionResultReceiver setresponsecontenttype_mediabrowsercompat_customactionresultreceiver = this.maskCursor;
                if (setresponsecontenttype_mediabrowsercompat_customactionresultreceiver.d == null) {
                    setresponsecontenttype_mediabrowsercompat_customactionresultreceiver.d = setresponsecontenttype;
                    setresponsecontenttype_mediabrowsercompat_customactionresultreceiver.a = true;
                    this.maskCursor.a(0);
                    WebSocketProtocol.toggleMask(this.maskCursor, this.maskKey);
                    this.maskCursor.close();
                } else {
                    throw new IllegalStateException("already attached to a buffer");
                }
            }
        }
        switch (this.opcode) {
            case 8:
                long j2 = this.controlFrameBuffer.b;
                if (j2 != 1) {
                    if (j2 != 0) {
                        s = this.controlFrameBuffer.s();
                        str = this.controlFrameBuffer.t();
                        String closeCodeExceptionMessage = WebSocketProtocol.closeCodeExceptionMessage(s);
                        if (closeCodeExceptionMessage != null) {
                            throw new ProtocolException(closeCodeExceptionMessage);
                        }
                    } else {
                        s = 1005;
                        str = "";
                    }
                    this.frameCallback.onReadClose(s, str);
                    this.closed = true;
                    return;
                }
                throw new ProtocolException("Malformed close payload length of 1.");
            case 9:
                this.frameCallback.onReadPing(new setResponseMessage(this.controlFrameBuffer.l()));
                return;
            case 10:
                this.frameCallback.onReadPong(new setResponseMessage(this.controlFrameBuffer.l()));
                return;
            default:
                StringBuilder sb = new StringBuilder("Unknown control opcode: ");
                sb.append(Integer.toHexString(this.opcode));
                throw new ProtocolException(sb.toString());
        }
    }

    /* JADX WARN: Finally extract failed */
    private void readHeader() throws IOException {
        if (!this.closed) {
            long timeoutNanos = this.source.timeout().timeoutNanos();
            this.source.timeout().clearTimeout();
            try {
                int i = this.source.i() & 255;
                this.source.timeout().timeout(timeoutNanos, TimeUnit.NANOSECONDS);
                this.opcode = i & 15;
                boolean z = true;
                boolean z2 = (i & RealmFieldTypeConstants.LIST_OFFSET) != 0;
                this.isFinalFrame = z2;
                boolean z3 = (i & 8) != 0;
                this.isControlFrame = z3;
                if (!z3 || z2) {
                    boolean z4 = (i & 64) != 0;
                    boolean z5 = (i & 32) != 0;
                    boolean z6 = (i & 16) != 0;
                    if (z4 || z5 || z6) {
                        throw new ProtocolException("Reserved flags are unsupported.");
                    }
                    int i2 = this.source.i() & 255;
                    if ((i2 & RealmFieldTypeConstants.LIST_OFFSET) == 0) {
                        z = false;
                    }
                    boolean z7 = this.isClient;
                    if (z == z7) {
                        throw new ProtocolException(z7 ? "Server-sent frames must not be masked." : "Client-sent frames must be masked.");
                    }
                    long j = (long) (i2 & 127);
                    this.frameLength = j;
                    if (j == 126) {
                        this.frameLength = ((long) this.source.s()) & 65535;
                    } else if (j == 127) {
                        long q = this.source.q();
                        this.frameLength = q;
                        if (q < 0) {
                            StringBuilder sb = new StringBuilder("Frame length 0x");
                            sb.append(Long.toHexString(this.frameLength));
                            sb.append(" > 0x7FFFFFFFFFFFFFFF");
                            throw new ProtocolException(sb.toString());
                        }
                    }
                    if (this.isControlFrame && this.frameLength > 125) {
                        throw new ProtocolException("Control frame must be less than 125B.");
                    } else if (z) {
                        this.source.a(this.maskKey);
                    }
                } else {
                    throw new ProtocolException("Control frames must be final.");
                }
            } catch (Throwable th) {
                this.source.timeout().timeout(timeoutNanos, TimeUnit.NANOSECONDS);
                throw th;
            }
        } else {
            throw new IOException("closed");
        }
    }

    private void readMessage() throws IOException {
        while (!this.closed) {
            long j = this.frameLength;
            if (j > 0) {
                this.source.d(this.messageFrameBuffer, j);
                if (!this.isClient) {
                    setResponseContentType setresponsecontenttype = this.messageFrameBuffer;
                    setResponseContentType$MediaBrowserCompat$CustomActionResultReceiver setresponsecontenttype_mediabrowsercompat_customactionresultreceiver = this.maskCursor;
                    if (setresponsecontenttype_mediabrowsercompat_customactionresultreceiver.d == null) {
                        setresponsecontenttype_mediabrowsercompat_customactionresultreceiver.d = setresponsecontenttype;
                        setresponsecontenttype_mediabrowsercompat_customactionresultreceiver.a = true;
                        this.maskCursor.a(this.messageFrameBuffer.b - this.frameLength);
                        WebSocketProtocol.toggleMask(this.maskCursor, this.maskKey);
                        this.maskCursor.close();
                    } else {
                        throw new IllegalStateException("already attached to a buffer");
                    }
                }
            }
            if (!this.isFinalFrame) {
                readUntilNonControlFrame();
                if (this.opcode != 0) {
                    StringBuilder sb = new StringBuilder("Expected continuation opcode. Got: ");
                    sb.append(Integer.toHexString(this.opcode));
                    throw new ProtocolException(sb.toString());
                }
            } else {
                return;
            }
        }
        throw new IOException("closed");
    }

    private void readMessageFrame() throws IOException {
        int i = this.opcode;
        if (i == 1 || i == 2) {
            readMessage();
            if (i == 1) {
                this.frameCallback.onReadMessage(this.messageFrameBuffer.t());
            } else {
                this.frameCallback.onReadMessage(new setResponseMessage(this.messageFrameBuffer.l()));
            }
        } else {
            StringBuilder sb = new StringBuilder("Unknown opcode: ");
            sb.append(Integer.toHexString(i));
            throw new ProtocolException(sb.toString());
        }
    }

    private void readUntilNonControlFrame() throws IOException {
        while (!this.closed) {
            readHeader();
            if (this.isControlFrame) {
                readControlFrame();
            } else {
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void processNextFrame() throws IOException {
        readHeader();
        if (this.isControlFrame) {
            readControlFrame();
        } else {
            readMessageFrame();
        }
    }
}
