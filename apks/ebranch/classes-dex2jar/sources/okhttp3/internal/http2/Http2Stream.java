package okhttp3.internal.http2;

import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import javax.annotation.Nullable;
import o.defaultInspectorModulesProvider;
import o.initialize;
import o.newInitializerBuilder;
import o.setResponseContentType;
import o.setResponseDate;
import o.setTookMs;
import okhttp3.Headers;
import okhttp3.internal.Util;
import okhttp3.internal.http2.Header;
/* loaded from: classes-dex2jar.jar:okhttp3/internal/http2/Http2Stream.class */
public final class Http2Stream {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    long bytesLeftInWriteWindow;
    final Http2Connection connection;
    private boolean hasResponseHeaders;
    private Header.Listener headersListener;
    private final Deque<Headers> headersQueue;
    final int id;
    final FramingSink sink;
    private final FramingSource source;
    long unacknowledgedBytesRead = 0;
    final StreamTimeout readTimeout = new StreamTimeout();
    final StreamTimeout writeTimeout = new StreamTimeout();
    ErrorCode errorCode = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes-dex2jar.jar:okhttp3/internal/http2/Http2Stream$FramingSink.class */
    public final class FramingSink implements initialize {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private static final long EMIT_BUFFER_SIZE = 16384;
        boolean closed;
        boolean finished;
        private final setResponseContentType sendBuffer = new setResponseContentType();

        FramingSink() {
        }

        private void emitFrame(boolean z) throws IOException {
            long min;
            synchronized (Http2Stream.this) {
                Http2Stream.this.writeTimeout.enter();
                while (Http2Stream.this.bytesLeftInWriteWindow <= 0 && !this.finished && !this.closed && Http2Stream.this.errorCode == null) {
                    Http2Stream.this.waitForIo();
                }
                Http2Stream.this.writeTimeout.exitAndThrowIfTimedOut();
                Http2Stream.this.checkOutNotClosed();
                min = Math.min(Http2Stream.this.bytesLeftInWriteWindow, this.sendBuffer.b);
                Http2Stream.this.bytesLeftInWriteWindow -= min;
            }
            Http2Stream.this.writeTimeout.enter();
            try {
                Http2Stream.this.connection.writeData(Http2Stream.this.id, z && min == this.sendBuffer.b, this.sendBuffer, min);
            } finally {
                Http2Stream.this.writeTimeout.exitAndThrowIfTimedOut();
            }
        }

        @Override // o.initialize, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            synchronized (Http2Stream.this) {
                if (!this.closed) {
                    if (!Http2Stream.this.sink.finished) {
                        if (this.sendBuffer.b > 0) {
                            while (this.sendBuffer.b > 0) {
                                emitFrame(true);
                            }
                        } else {
                            Http2Stream.this.connection.writeData(Http2Stream.this.id, true, null, 0);
                        }
                    }
                    synchronized (Http2Stream.this) {
                        this.closed = true;
                    }
                    Http2Stream.this.connection.flush();
                    Http2Stream.this.cancelStreamIfNecessary();
                }
            }
        }

        @Override // o.initialize, java.io.Flushable
        public final void flush() throws IOException {
            synchronized (Http2Stream.this) {
                Http2Stream.this.checkOutNotClosed();
            }
            while (this.sendBuffer.b > 0) {
                emitFrame(false);
                Http2Stream.this.connection.flush();
            }
        }

        @Override // o.initialize
        public final newInitializerBuilder timeout() {
            return Http2Stream.this.writeTimeout;
        }

        @Override // o.initialize
        public final void write(setResponseContentType setresponsecontenttype, long j) throws IOException {
            this.sendBuffer.write(setresponsecontenttype, j);
            while (this.sendBuffer.b >= EMIT_BUFFER_SIZE) {
                emitFrame(false);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes-dex2jar.jar:okhttp3/internal/http2/Http2Stream$FramingSource.class */
    public final class FramingSource implements defaultInspectorModulesProvider {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        boolean closed;
        boolean finished;
        private final long maxByteCount;
        private final setResponseContentType receiveBuffer = new setResponseContentType();
        private final setResponseContentType readBuffer = new setResponseContentType();

        FramingSource(long j) {
            this.maxByteCount = j;
        }

        private void updateConnectionFlowControl(long j) {
            Http2Stream.this.connection.updateConnectionFlowControl(j);
        }

        @Override // o.defaultInspectorModulesProvider, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            long j;
            Header.Listener listener;
            ArrayList<Headers> arrayList;
            synchronized (Http2Stream.this) {
                this.closed = true;
                j = this.readBuffer.b;
                setResponseContentType setresponsecontenttype = this.readBuffer;
                try {
                    setresponsecontenttype.f(setresponsecontenttype.b);
                    listener = null;
                    if (Http2Stream.this.headersQueue.isEmpty() || Http2Stream.this.headersListener == null) {
                        arrayList = null;
                    } else {
                        arrayList = new ArrayList(Http2Stream.this.headersQueue);
                        Http2Stream.this.headersQueue.clear();
                        listener = Http2Stream.this.headersListener;
                    }
                    Http2Stream.this.notifyAll();
                } catch (EOFException e) {
                    throw new AssertionError(e);
                }
            }
            if (j > 0) {
                updateConnectionFlowControl(j);
            }
            Http2Stream.this.cancelStreamIfNecessary();
            if (listener != null) {
                for (Headers headers : arrayList) {
                    listener.onHeaders(headers);
                }
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:58:0x017a, code lost:
            throw new java.io.IOException("stream closed");
         */
        /* JADX WARN: Type inference failed for: r0v47, types: [long] */
        /* JADX WARN: Type inference failed for: r15v1 */
        /* JADX WARN: Type inference failed for: r15v2 */
        /* JADX WARN: Type inference failed for: r15v3 */
        /* JADX WARN: Type inference failed for: r15v4 */
        /* JADX WARN: Type inference failed for: r15v5 */
        /* JADX WARN: Unknown variable types count: 2 */
        @Override // o.defaultInspectorModulesProvider
        /* Code decompiled incorrectly, please refer to instructions dump */
        public final long read(o.setResponseContentType r8, long r9) throws java.io.IOException {
            /*
            // Method dump skipped, instructions count: 426
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.Http2Stream.FramingSource.read(o.setResponseContentType, long):long");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v31, types: [long] */
        /* JADX WARN: Type inference failed for: r6v0, types: [o.setTookMs] */
        /* JADX WARN: Type inference failed for: r7v2 */
        /* JADX WARN: Type inference failed for: r7v3 */
        /* JADX WARN: Type inference failed for: r7v4 */
        /* JADX WARN: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump */
        final void receive(o.setTookMs r6, long r7) throws java.io.IOException {
            /*
            // Method dump skipped, instructions count: 278
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.Http2Stream.FramingSource.receive(o.setTookMs, long):void");
        }

        @Override // o.defaultInspectorModulesProvider, o.initialize
        public final newInitializerBuilder timeout() {
            return Http2Stream.this.readTimeout;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes-dex2jar.jar:okhttp3/internal/http2/Http2Stream$StreamTimeout.class */
    public class StreamTimeout extends setResponseDate {
        StreamTimeout() {
        }

        public void exitAndThrowIfTimedOut() throws IOException {
            if (exit()) {
                throw newTimeoutException(null);
            }
        }

        @Override // o.setResponseDate
        public IOException newTimeoutException(IOException iOException) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
            if (iOException != null) {
                socketTimeoutException.initCause(iOException);
            }
            return socketTimeoutException;
        }

        @Override // o.setResponseDate
        public void timedOut() {
            Http2Stream.this.closeLater(ErrorCode.CANCEL);
            Http2Stream.this.connection.sendDegradedPingLater();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Http2Stream(int i, Http2Connection http2Connection, boolean z, boolean z2, @Nullable Headers headers) {
        ArrayDeque arrayDeque = new ArrayDeque();
        this.headersQueue = arrayDeque;
        if (http2Connection != null) {
            this.id = i;
            this.connection = http2Connection;
            this.bytesLeftInWriteWindow = (long) http2Connection.peerSettings.getInitialWindowSize();
            FramingSource framingSource = new FramingSource((long) http2Connection.okHttpSettings.getInitialWindowSize());
            this.source = framingSource;
            FramingSink framingSink = new FramingSink();
            this.sink = framingSink;
            framingSource.finished = z2;
            framingSink.finished = z;
            if (headers != null) {
                arrayDeque.add(headers);
            }
            if (isLocallyInitiated() && headers != null) {
                throw new IllegalStateException("locally-initiated streams shouldn't have headers yet");
            } else if (!isLocallyInitiated() && headers == null) {
                throw new IllegalStateException("remotely-initiated streams should have headers");
            }
        } else {
            throw new NullPointerException("connection == null");
        }
    }

    private boolean closeInternal(ErrorCode errorCode) {
        synchronized (this) {
            if (this.errorCode != null) {
                return false;
            }
            if (this.source.finished && this.sink.finished) {
                return false;
            }
            this.errorCode = errorCode;
            notifyAll();
            this.connection.removeStream(this.id);
            return true;
        }
    }

    final void addBytesToWriteWindow(long j) {
        this.bytesLeftInWriteWindow += j;
        if (j > 0) {
            notifyAll();
        }
    }

    final void cancelStreamIfNecessary() throws IOException {
        boolean z;
        boolean isOpen;
        synchronized (this) {
            z = !this.source.finished && this.source.closed && (this.sink.finished || this.sink.closed);
            isOpen = isOpen();
        }
        if (z) {
            close(ErrorCode.CANCEL);
        } else if (!isOpen) {
            this.connection.removeStream(this.id);
        }
    }

    final void checkOutNotClosed() throws IOException {
        if (this.sink.closed) {
            throw new IOException("stream closed");
        } else if (this.sink.finished) {
            throw new IOException("stream finished");
        } else if (this.errorCode != null) {
            throw new StreamResetException(this.errorCode);
        }
    }

    public final void close(ErrorCode errorCode) throws IOException {
        if (closeInternal(errorCode)) {
            this.connection.writeSynReset(this.id, errorCode);
        }
    }

    public final void closeLater(ErrorCode errorCode) {
        if (closeInternal(errorCode)) {
            this.connection.writeSynResetLater(this.id, errorCode);
        }
    }

    public final Http2Connection getConnection() {
        return this.connection;
    }

    public final ErrorCode getErrorCode() {
        ErrorCode errorCode;
        synchronized (this) {
            errorCode = this.errorCode;
        }
        return errorCode;
    }

    public final int getId() {
        return this.id;
    }

    public final initialize getSink() {
        synchronized (this) {
            if (!this.hasResponseHeaders && !isLocallyInitiated()) {
                throw new IllegalStateException("reply before requesting the sink");
            }
        }
        return this.sink;
    }

    public final defaultInspectorModulesProvider getSource() {
        return this.source;
    }

    public final boolean isLocallyInitiated() {
        boolean z = true;
        if (this.connection.client != ((this.id & 1) == 1)) {
            z = false;
        }
        return z;
    }

    public final boolean isOpen() {
        synchronized (this) {
            if (this.errorCode != null) {
                return false;
            }
            if ((this.source.finished || this.source.closed) && (this.sink.finished || this.sink.closed)) {
                if (this.hasResponseHeaders) {
                    return false;
                }
            }
            return true;
        }
    }

    public final newInitializerBuilder readTimeout() {
        return this.readTimeout;
    }

    final void receiveData(setTookMs settookms, int i) throws IOException {
        this.source.receive(settookms, (long) i);
    }

    final void receiveFin() {
        boolean isOpen;
        synchronized (this) {
            this.source.finished = true;
            isOpen = isOpen();
            notifyAll();
        }
        if (!isOpen) {
            this.connection.removeStream(this.id);
        }
    }

    final void receiveHeaders(List<Header> list) {
        boolean isOpen;
        synchronized (this) {
            this.hasResponseHeaders = true;
            this.headersQueue.add(Util.toHeaders(list));
            isOpen = isOpen();
            notifyAll();
        }
        if (!isOpen) {
            this.connection.removeStream(this.id);
        }
    }

    final void receiveRstStream(ErrorCode errorCode) {
        synchronized (this) {
            if (this.errorCode == null) {
                this.errorCode = errorCode;
                notifyAll();
            }
        }
    }

    public final void setHeadersListener(Header.Listener listener) {
        synchronized (this) {
            this.headersListener = listener;
            if (!this.headersQueue.isEmpty() && listener != null) {
                notifyAll();
            }
        }
    }

    public final Headers takeHeaders() throws IOException {
        Headers removeFirst;
        synchronized (this) {
            this.readTimeout.enter();
            while (this.headersQueue.isEmpty() && this.errorCode == null) {
                waitForIo();
            }
            this.readTimeout.exitAndThrowIfTimedOut();
            if (!this.headersQueue.isEmpty()) {
                removeFirst = this.headersQueue.removeFirst();
            } else {
                throw new StreamResetException(this.errorCode);
            }
        }
        return removeFirst;
    }

    final void waitForIo() throws InterruptedIOException {
        try {
            wait();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }

    public final void writeHeaders(List<Header> list, boolean z) throws IOException {
        boolean z2;
        boolean z3;
        boolean z4;
        if (list != null) {
            synchronized (this) {
                z4 = true;
                this.hasResponseHeaders = true;
                if (!z) {
                    this.sink.finished = true;
                    z2 = true;
                    z3 = true;
                } else {
                    z2 = false;
                    z3 = false;
                }
            }
            z4 = z2;
            if (!z2) {
                synchronized (this.connection) {
                    if (this.connection.bytesLeftInWriteWindow != 0) {
                        z4 = false;
                    }
                }
            }
            this.connection.writeSynReply(this.id, z3, list);
            if (z4) {
                this.connection.flush();
                return;
            }
            return;
        }
        throw new NullPointerException("headers == null");
    }

    public final newInitializerBuilder writeTimeout() {
        return this.writeTimeout;
    }
}
