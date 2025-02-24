package okhttp3.internal.ws;

import java.io.Closeable;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;
import o.setResponseMessage;
import o.setScheme;
import o.setTookMs;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.EventListener;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.WebSocket;
import okhttp3.WebSocketListener;
import okhttp3.internal.Internal;
import okhttp3.internal.Util;
import okhttp3.internal.connection.StreamAllocation;
import okhttp3.internal.ws.WebSocketReader;
/* loaded from: classes2-dex2jar.jar:okhttp3/internal/ws/RealWebSocket.class */
public final class RealWebSocket implements WebSocket, WebSocketReader.FrameCallback {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final long CANCEL_AFTER_CLOSE_MILLIS = 60000;
    private static final long MAX_QUEUE_SIZE = 16777216;
    private static final List<Protocol> ONLY_HTTP1 = Collections.singletonList(Protocol.HTTP_1_1);
    private boolean awaitingPong;
    private Call call;
    private ScheduledFuture<?> cancelFuture;
    private boolean enqueuedClose;
    private ScheduledExecutorService executor;
    private boolean failed;
    private final String key;
    final WebSocketListener listener;
    private final Request originalRequest;
    private final long pingIntervalMillis;
    private long queueSize;
    private final Random random;
    private WebSocketReader reader;
    private String receivedCloseReason;
    private int receivedPingCount;
    private int receivedPongCount;
    private int sentPingCount;
    private Streams streams;
    private WebSocketWriter writer;
    private final Runnable writerRunnable;
    private final ArrayDeque<setResponseMessage> pongQueue = new ArrayDeque<>();
    private final ArrayDeque<Object> messageAndCloseQueue = new ArrayDeque<>();
    private int receivedCloseCode = -1;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2-dex2jar.jar:okhttp3/internal/ws/RealWebSocket$CancelRunnable.class */
    public final class CancelRunnable implements Runnable {
        CancelRunnable() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            RealWebSocket.this.cancel();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2-dex2jar.jar:okhttp3/internal/ws/RealWebSocket$Close.class */
    public static final class Close {
        final long cancelAfterCloseMillis;
        final int code;
        final setResponseMessage reason;

        Close(int i, setResponseMessage setresponsemessage, long j) {
            this.code = i;
            this.reason = setresponsemessage;
            this.cancelAfterCloseMillis = j;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2-dex2jar.jar:okhttp3/internal/ws/RealWebSocket$Message.class */
    public static final class Message {
        final setResponseMessage data;
        final int formatOpcode;

        Message(int i, setResponseMessage setresponsemessage) {
            this.formatOpcode = i;
            this.data = setresponsemessage;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2-dex2jar.jar:okhttp3/internal/ws/RealWebSocket$PingRunnable.class */
    public final class PingRunnable implements Runnable {
        PingRunnable() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            RealWebSocket.this.writePingFrame();
        }
    }

    /* loaded from: classes2-dex2jar.jar:okhttp3/internal/ws/RealWebSocket$Streams.class */
    public static abstract class Streams implements Closeable {
        public final boolean client;
        public final setScheme.com_github_ChuckerTeam_Chucker_library sink;
        public final setTookMs source;

        public Streams(boolean z, setTookMs settookms, setScheme.com_github_ChuckerTeam_Chucker_library com_github_chuckerteam_chucker_library) {
            this.client = z;
            this.source = settookms;
            this.sink = com_github_chuckerteam_chucker_library;
        }
    }

    public RealWebSocket(Request request, WebSocketListener webSocketListener, Random random, long j) {
        if ("GET".equals(request.method())) {
            this.originalRequest = request;
            this.listener = webSocketListener;
            this.random = random;
            this.pingIntervalMillis = j;
            byte[] bArr = new byte[16];
            random.nextBytes(bArr);
            this.key = setResponseMessage.d(bArr).c();
            this.writerRunnable = new Runnable() { // from class: okhttp3.internal.ws.RealWebSocket.1
                @Override // java.lang.Runnable
                public void run() {
                    do {
                        try {
                        } catch (IOException e) {
                            RealWebSocket.this.failWebSocket(e, null);
                            return;
                        }
                    } while (RealWebSocket.this.writeOneFrame());
                }
            };
            return;
        }
        StringBuilder sb = new StringBuilder("Request must be GET: ");
        sb.append(request.method());
        throw new IllegalArgumentException(sb.toString());
    }

    private void runWriter() {
        ScheduledExecutorService scheduledExecutorService = this.executor;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.execute(this.writerRunnable);
        }
    }

    private boolean send(setResponseMessage setresponsemessage, int i) {
        synchronized (this) {
            if (!this.failed && !this.enqueuedClose) {
                if (this.queueSize + ((long) setresponsemessage.g()) > MAX_QUEUE_SIZE) {
                    close(1001, null);
                    return false;
                }
                this.queueSize += (long) setresponsemessage.g();
                this.messageAndCloseQueue.add(new Message(i, setresponsemessage));
                runWriter();
                return true;
            }
            return false;
        }
    }

    final void awaitTermination(int i, TimeUnit timeUnit) throws InterruptedException {
        this.executor.awaitTermination((long) i, timeUnit);
    }

    @Override // okhttp3.WebSocket
    public final void cancel() {
        this.call.cancel();
    }

    final void checkResponse(Response response) throws ProtocolException {
        if (response.code() == 101) {
            String header = response.header("Connection");
            if ("Upgrade".equalsIgnoreCase(header)) {
                String header2 = response.header("Upgrade");
                if ("websocket".equalsIgnoreCase(header2)) {
                    String header3 = response.header("Sec-WebSocket-Accept");
                    StringBuilder sb = new StringBuilder();
                    sb.append(this.key);
                    sb.append("258EAFA5-E914-47DA-95CA-C5AB0DC85B11");
                    String c = setResponseMessage.a(sb.toString()).b().c();
                    if (!c.equals(header3)) {
                        StringBuilder sb2 = new StringBuilder("Expected 'Sec-WebSocket-Accept' header value '");
                        sb2.append(c);
                        sb2.append("' but was '");
                        sb2.append(header3);
                        sb2.append("'");
                        throw new ProtocolException(sb2.toString());
                    }
                    return;
                }
                StringBuilder sb3 = new StringBuilder("Expected 'Upgrade' header value 'websocket' but was '");
                sb3.append(header2);
                sb3.append("'");
                throw new ProtocolException(sb3.toString());
            }
            StringBuilder sb4 = new StringBuilder("Expected 'Connection' header value 'Upgrade' but was '");
            sb4.append(header);
            sb4.append("'");
            throw new ProtocolException(sb4.toString());
        }
        StringBuilder sb5 = new StringBuilder("Expected HTTP 101 response but was '");
        sb5.append(response.code());
        sb5.append(" ");
        sb5.append(response.message());
        sb5.append("'");
        throw new ProtocolException(sb5.toString());
    }

    @Override // okhttp3.WebSocket
    public final boolean close(int i, String str) {
        return close(i, str, CANCEL_AFTER_CLOSE_MILLIS);
    }

    final boolean close(int i, String str, long j) {
        setResponseMessage setresponsemessage;
        synchronized (this) {
            WebSocketProtocol.validateCloseCode(i);
            if (str != null) {
                setResponseMessage a = setResponseMessage.a(str);
                if (((long) a.g()) <= 123) {
                    setresponsemessage = a;
                } else {
                    StringBuilder sb = new StringBuilder("reason.size() > 123: ");
                    sb.append(str);
                    throw new IllegalArgumentException(sb.toString());
                }
            } else {
                setresponsemessage = null;
            }
            if (!this.failed && !this.enqueuedClose) {
                this.enqueuedClose = true;
                this.messageAndCloseQueue.add(new Close(i, setresponsemessage, j));
                runWriter();
                return true;
            }
            return false;
        }
    }

    public final void connect(OkHttpClient okHttpClient) {
        OkHttpClient build = okHttpClient.newBuilder().eventListener(EventListener.NONE).protocols(ONLY_HTTP1).build();
        final Request build2 = this.originalRequest.newBuilder().header("Upgrade", "websocket").header("Connection", "Upgrade").header("Sec-WebSocket-Key", this.key).header("Sec-WebSocket-Version", "13").build();
        Call newWebSocketCall = Internal.instance.newWebSocketCall(build, build2);
        this.call = newWebSocketCall;
        newWebSocketCall.timeout().clearTimeout();
        this.call.enqueue(new Callback() { // from class: okhttp3.internal.ws.RealWebSocket.2
            @Override // okhttp3.Callback
            public void onFailure(Call call, IOException iOException) {
                RealWebSocket.this.failWebSocket(iOException, null);
            }

            @Override // okhttp3.Callback
            public void onResponse(Call call, Response response) {
                try {
                    RealWebSocket.this.checkResponse(response);
                    StreamAllocation streamAllocation = Internal.instance.streamAllocation(call);
                    streamAllocation.noNewStreams();
                    Streams newWebSocketStreams = streamAllocation.connection().newWebSocketStreams(streamAllocation);
                    try {
                        RealWebSocket.this.listener.onOpen(RealWebSocket.this, response);
                        StringBuilder sb = new StringBuilder("OkHttp WebSocket ");
                        sb.append(build2.url().redact());
                        RealWebSocket.this.initReaderAndWriter(sb.toString(), newWebSocketStreams);
                        streamAllocation.connection().socket().setSoTimeout(0);
                        RealWebSocket.this.loopReader();
                    } catch (Exception e) {
                        RealWebSocket.this.failWebSocket(e, null);
                    }
                } catch (ProtocolException e2) {
                    RealWebSocket.this.failWebSocket(e2, response);
                    Util.closeQuietly(response);
                }
            }
        });
    }

    public final void failWebSocket(Exception exc, @Nullable Response response) {
        synchronized (this) {
            if (!this.failed) {
                this.failed = true;
                Streams streams = this.streams;
                this.streams = null;
                ScheduledFuture<?> scheduledFuture = this.cancelFuture;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                }
                ScheduledExecutorService scheduledExecutorService = this.executor;
                if (scheduledExecutorService != null) {
                    scheduledExecutorService.shutdown();
                }
                try {
                    this.listener.onFailure(this, exc, response);
                } finally {
                    Util.closeQuietly(streams);
                }
            }
        }
    }

    public final void initReaderAndWriter(String str, Streams streams) throws IOException {
        synchronized (this) {
            this.streams = streams;
            this.writer = new WebSocketWriter(streams.client, streams.sink, this.random);
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, Util.threadFactory(str, false));
            this.executor = scheduledThreadPoolExecutor;
            if (this.pingIntervalMillis != 0) {
                PingRunnable pingRunnable = new PingRunnable();
                long j = this.pingIntervalMillis;
                scheduledThreadPoolExecutor.scheduleAtFixedRate(pingRunnable, j, j, TimeUnit.MILLISECONDS);
            }
            if (!this.messageAndCloseQueue.isEmpty()) {
                runWriter();
            }
        }
        this.reader = new WebSocketReader(streams.client, streams.source, this);
    }

    public final void loopReader() throws IOException {
        while (this.receivedCloseCode == -1) {
            this.reader.processNextFrame();
        }
    }

    @Override // okhttp3.internal.ws.WebSocketReader.FrameCallback
    public final void onReadClose(int i, String str) {
        Streams streams;
        if (i != -1) {
            synchronized (this) {
                if (this.receivedCloseCode == -1) {
                    this.receivedCloseCode = i;
                    this.receivedCloseReason = str;
                    streams = null;
                    if (this.enqueuedClose) {
                        streams = null;
                        if (this.messageAndCloseQueue.isEmpty()) {
                            streams = this.streams;
                            this.streams = null;
                            ScheduledFuture<?> scheduledFuture = this.cancelFuture;
                            if (scheduledFuture != null) {
                                scheduledFuture.cancel(false);
                            }
                            this.executor.shutdown();
                        }
                    }
                } else {
                    throw new IllegalStateException("already closed");
                }
            }
            try {
                this.listener.onClosing(this, i, str);
                if (streams != null) {
                    this.listener.onClosed(this, i, str);
                }
            } finally {
                Util.closeQuietly(streams);
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @Override // okhttp3.internal.ws.WebSocketReader.FrameCallback
    public final void onReadMessage(String str) throws IOException {
        this.listener.onMessage(this, str);
    }

    @Override // okhttp3.internal.ws.WebSocketReader.FrameCallback
    public final void onReadMessage(setResponseMessage setresponsemessage) throws IOException {
        this.listener.onMessage(this, setresponsemessage);
    }

    @Override // okhttp3.internal.ws.WebSocketReader.FrameCallback
    public final void onReadPing(setResponseMessage setresponsemessage) {
        synchronized (this) {
            if (!this.failed && (!this.enqueuedClose || !this.messageAndCloseQueue.isEmpty())) {
                this.pongQueue.add(setresponsemessage);
                runWriter();
                this.receivedPingCount++;
            }
        }
    }

    @Override // okhttp3.internal.ws.WebSocketReader.FrameCallback
    public final void onReadPong(setResponseMessage setresponsemessage) {
        synchronized (this) {
            this.receivedPongCount++;
            this.awaitingPong = false;
        }
    }

    final boolean pong(setResponseMessage setresponsemessage) {
        synchronized (this) {
            if (!this.failed && (!this.enqueuedClose || !this.messageAndCloseQueue.isEmpty())) {
                this.pongQueue.add(setresponsemessage);
                runWriter();
                return true;
            }
            return false;
        }
    }

    final boolean processNextFrame() throws IOException {
        boolean z = false;
        try {
            this.reader.processNextFrame();
            if (this.receivedCloseCode == -1) {
                z = true;
            }
            return z;
        } catch (Exception e) {
            failWebSocket(e, null);
            return false;
        }
    }

    @Override // okhttp3.WebSocket
    public final long queueSize() {
        long j;
        synchronized (this) {
            j = this.queueSize;
        }
        return j;
    }

    final int receivedPingCount() {
        int i;
        synchronized (this) {
            i = this.receivedPingCount;
        }
        return i;
    }

    final int receivedPongCount() {
        int i;
        synchronized (this) {
            i = this.receivedPongCount;
        }
        return i;
    }

    @Override // okhttp3.WebSocket
    public final Request request() {
        return this.originalRequest;
    }

    @Override // okhttp3.WebSocket
    public final boolean send(String str) {
        if (str != null) {
            return send(setResponseMessage.a(str), 1);
        }
        throw new NullPointerException("text == null");
    }

    @Override // okhttp3.WebSocket
    public final boolean send(setResponseMessage setresponsemessage) {
        if (setresponsemessage != null) {
            return send(setresponsemessage, 2);
        }
        throw new NullPointerException("bytes == null");
    }

    final int sentPingCount() {
        int i;
        synchronized (this) {
            i = this.sentPingCount;
        }
        return i;
    }

    final void tearDown() throws InterruptedException {
        ScheduledFuture<?> scheduledFuture = this.cancelFuture;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.executor.shutdown();
        this.executor.awaitTermination(10, TimeUnit.SECONDS);
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b3 A[Catch: all -> 0x00bb, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x00bb, blocks: (B:32:0x00b3, B:36:0x00c8, B:37:0x00fb, B:44:0x011f, B:46:0x0139, B:50:0x014c, B:51:0x0158, B:39:0x00fd), top: B:60:0x00b0 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c0  */
    /* Code decompiled incorrectly, please refer to instructions dump */
    final boolean writeOneFrame() throws java.io.IOException {
        /*
        // Method dump skipped, instructions count: 360
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.ws.RealWebSocket.writeOneFrame():boolean");
    }

    final void writePingFrame() {
        synchronized (this) {
            if (!this.failed) {
                WebSocketWriter webSocketWriter = this.writer;
                int i = this.awaitingPong ? this.sentPingCount : -1;
                this.sentPingCount++;
                this.awaitingPong = true;
                if (i != -1) {
                    StringBuilder sb = new StringBuilder("sent ping but didn't receive pong within ");
                    sb.append(this.pingIntervalMillis);
                    sb.append("ms (after ");
                    sb.append(i - 1);
                    sb.append(" successful ping/pongs)");
                    failWebSocket(new SocketTimeoutException(sb.toString()), null);
                    return;
                }
                try {
                    webSocketWriter.writePing(setResponseMessage.c);
                } catch (IOException e) {
                    failWebSocket(e, null);
                }
            }
        }
    }
}
