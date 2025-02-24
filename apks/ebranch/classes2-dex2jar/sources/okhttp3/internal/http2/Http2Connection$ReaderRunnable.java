package okhttp3.internal.http2;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.RejectedExecutionException;
import o.setResponseMessage;
import o.setTookMs;
import okhttp3.internal.NamedRunnable;
import okhttp3.internal.Util;
import okhttp3.internal.http2.Http2Reader;
import okhttp3.internal.platform.Platform;
/* loaded from: classes2-dex2jar.jar:okhttp3/internal/http2/Http2Connection$ReaderRunnable.class */
class Http2Connection$ReaderRunnable extends NamedRunnable implements Http2Reader.Handler {
    final Http2Reader reader;
    final /* synthetic */ Http2Connection this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Http2Connection$ReaderRunnable(Http2Connection http2Connection, Http2Reader http2Reader) {
        super("OkHttp %s", new Object[]{http2Connection.hostname});
        this.this$0 = http2Connection;
        this.reader = http2Reader;
    }

    @Override // okhttp3.internal.http2.Http2Reader.Handler
    public void ackSettings() {
    }

    @Override // okhttp3.internal.http2.Http2Reader.Handler
    public void alternateService(int i, String str, setResponseMessage setresponsemessage, String str2, int i2, long j) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v47, types: [long] */
    /* JADX WARN: Type inference failed for: r19v0 */
    /* JADX WARN: Type inference failed for: r19v1 */
    /* JADX WARN: Type inference failed for: r19v2 */
    /* JADX WARN: Type inference failed for: r19v3 */
    /* JADX WARN: Type inference failed for: r1v2, types: [okhttp3.internal.http2.Http2Connection$ReaderRunnable$3, java.lang.Runnable] */
    /* JADX WARN: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump */
    void applyAndAckSettings(boolean r11, okhttp3.internal.http2.Settings r12) {
        /*
        // Method dump skipped, instructions count: 278
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.Http2Connection$ReaderRunnable.applyAndAckSettings(boolean, okhttp3.internal.http2.Settings):void");
    }

    @Override // okhttp3.internal.http2.Http2Reader.Handler
    public void data(boolean z, int i, setTookMs settookms, int i2) throws IOException {
        if (this.this$0.pushedStream(i)) {
            this.this$0.pushDataLater(i, settookms, i2, z);
            return;
        }
        Http2Stream stream = this.this$0.getStream(i);
        if (stream == null) {
            this.this$0.writeSynResetLater(i, ErrorCode.PROTOCOL_ERROR);
            long j = (long) i2;
            this.this$0.updateConnectionFlowControl(j);
            settookms.f(j);
            return;
        }
        stream.receiveData(settookms, i2);
        if (z) {
            stream.receiveFin();
        }
    }

    public void execute() {
        ErrorCode errorCode;
        ErrorCode errorCode2;
        ErrorCode errorCode3;
        try {
            ErrorCode errorCode4 = ErrorCode.INTERNAL_ERROR;
            errorCode2 = ErrorCode.INTERNAL_ERROR;
            errorCode = errorCode4;
            ErrorCode errorCode5 = errorCode4;
            try {
                this.reader.readConnectionPreface(this);
                while (this.reader.nextFrame(false, this)) {
                }
                ErrorCode errorCode6 = ErrorCode.NO_ERROR;
                errorCode = errorCode6;
                errorCode5 = errorCode6;
                errorCode = ErrorCode.CANCEL;
                errorCode3 = errorCode6;
            } catch (IOException e) {
                errorCode3 = ErrorCode.PROTOCOL_ERROR;
                errorCode = ErrorCode.PROTOCOL_ERROR;
            }
            try {
                this.this$0.close(errorCode3, errorCode);
            } catch (IOException e2) {
            }
            Util.closeQuietly(this.reader);
        } catch (Throwable th) {
            try {
                this.this$0.close(errorCode, errorCode2);
            } catch (IOException e3) {
            }
            Util.closeQuietly(this.reader);
            throw th;
        }
    }

    @Override // okhttp3.internal.http2.Http2Reader.Handler
    public void goAway(int i, ErrorCode errorCode, setResponseMessage setresponsemessage) {
        Http2Stream[] http2StreamArr;
        setresponsemessage.g();
        synchronized (this.this$0) {
            http2StreamArr = (Http2Stream[]) this.this$0.streams.values().toArray(new Http2Stream[this.this$0.streams.size()]);
            Http2Connection.access$302(this.this$0, true);
        }
        for (Http2Stream http2Stream : http2StreamArr) {
            if (http2Stream.getId() > i && http2Stream.isLocallyInitiated()) {
                http2Stream.receiveRstStream(ErrorCode.REFUSED_STREAM);
                this.this$0.removeStream(http2Stream.getId());
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v33, types: [okhttp3.internal.http2.Http2Connection$ReaderRunnable$1, java.lang.Runnable] */
    @Override // okhttp3.internal.http2.Http2Reader.Handler
    public void headers(boolean z, int i, int i2, List<Header> list) {
        if (this.this$0.pushedStream(i)) {
            this.this$0.pushHeadersLater(i, list, z);
            return;
        }
        synchronized (this.this$0) {
            Http2Stream stream = this.this$0.getStream(i);
            if (stream != null) {
                stream.receiveHeaders(list);
                if (z) {
                    stream.receiveFin();
                }
            } else if (!Http2Connection.access$300(this.this$0)) {
                if (i > this.this$0.lastGoodStreamId) {
                    if (i % 2 != this.this$0.nextStreamId % 2) {
                        final Http2Stream http2Stream = new Http2Stream(i, this.this$0, false, z, Util.toHeaders(list));
                        this.this$0.lastGoodStreamId = i;
                        this.this$0.streams.put(Integer.valueOf(i), http2Stream);
                        Http2Connection.access$400().execute(new NamedRunnable("OkHttp %s stream %d", new Object[]{this.this$0.hostname, Integer.valueOf(i)}) { // from class: okhttp3.internal.http2.Http2Connection$ReaderRunnable.1
                            public void execute() {
                                try {
                                    Http2Connection$ReaderRunnable.this.this$0.listener.onStream(http2Stream);
                                } catch (IOException e) {
                                    Platform platform = Platform.get();
                                    StringBuilder sb = new StringBuilder("Http2Connection.Listener failure for ");
                                    sb.append(Http2Connection$ReaderRunnable.this.this$0.hostname);
                                    platform.log(4, sb.toString(), e);
                                    try {
                                        http2Stream.close(ErrorCode.PROTOCOL_ERROR);
                                    } catch (IOException e2) {
                                    }
                                }
                            }
                        });
                    }
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Runnable, okhttp3.internal.http2.Http2Connection$PingRunnable] */
    @Override // okhttp3.internal.http2.Http2Reader.Handler
    public void ping(boolean z, int i, int i2) {
        if (z) {
            synchronized (this.this$0) {
                if (i == 1) {
                    Http2Connection.access$108(this.this$0);
                } else if (i == 2) {
                    Http2Connection.access$608(this.this$0);
                } else if (i == 3) {
                    Http2Connection.access$708(this.this$0);
                    this.this$0.notifyAll();
                }
            }
            return;
        }
        try {
            Http2Connection.access$500(this.this$0).execute(new NamedRunnable(this.this$0, true, i, i2) { // from class: okhttp3.internal.http2.Http2Connection$PingRunnable
                final int payload1;
                final int payload2;
                final boolean reply;
                final /* synthetic */ Http2Connection this$0;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.this$0 = r8;
                    this.reply = r9;
                    this.payload1 = r10;
                    this.payload2 = r11;
                }

                public final void execute() {
                    this.this$0.writePing(this.reply, this.payload1, this.payload2);
                }
            });
        } catch (RejectedExecutionException e) {
        }
    }

    @Override // okhttp3.internal.http2.Http2Reader.Handler
    public void priority(int i, int i2, int i3, boolean z) {
    }

    @Override // okhttp3.internal.http2.Http2Reader.Handler
    public void pushPromise(int i, int i2, List<Header> list) {
        this.this$0.pushRequestLater(i2, list);
    }

    @Override // okhttp3.internal.http2.Http2Reader.Handler
    public void rstStream(int i, ErrorCode errorCode) {
        if (this.this$0.pushedStream(i)) {
            this.this$0.pushResetLater(i, errorCode);
            return;
        }
        Http2Stream removeStream = this.this$0.removeStream(i);
        if (removeStream != null) {
            removeStream.receiveRstStream(errorCode);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [okhttp3.internal.http2.Http2Connection$ReaderRunnable$2, java.lang.Runnable] */
    @Override // okhttp3.internal.http2.Http2Reader.Handler
    public void settings(final boolean z, final Settings settings) {
        try {
            Http2Connection.access$500(this.this$0).execute(new NamedRunnable("OkHttp %s ACK Settings", new Object[]{this.this$0.hostname}) { // from class: okhttp3.internal.http2.Http2Connection$ReaderRunnable.2
                public void execute() {
                    Http2Connection$ReaderRunnable.this.applyAndAckSettings(z, settings);
                }
            });
        } catch (RejectedExecutionException e) {
        }
    }

    @Override // okhttp3.internal.http2.Http2Reader.Handler
    public void windowUpdate(int i, long j) {
        if (i == 0) {
            synchronized (this.this$0) {
                this.this$0.bytesLeftInWriteWindow += j;
                this.this$0.notifyAll();
            }
            return;
        }
        Http2Stream stream = this.this$0.getStream(i);
        if (stream != null) {
            synchronized (stream) {
                stream.addBytesToWriteWindow(j);
            }
        }
    }
}
