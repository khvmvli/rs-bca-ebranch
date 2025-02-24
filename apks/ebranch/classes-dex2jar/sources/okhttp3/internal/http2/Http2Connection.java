package okhttp3.internal.http2;

import java.io.Closeable;
import java.io.IOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import o.setResponseContentType;
import o.setTookMs;
import okhttp3.Protocol;
import okhttp3.internal.NamedRunnable;
import okhttp3.internal.Util;
/* loaded from: classes-dex2jar.jar:okhttp3/internal/http2/Http2Connection.class */
public final class Http2Connection implements Closeable {
    static final /* synthetic */ boolean $assertionsDisabled;
    static final int AWAIT_PING;
    static final int DEGRADED_PING;
    static final long DEGRADED_PONG_TIMEOUT_NS;
    static final int INTERVAL_PING;
    static final int OKHTTP_CLIENT_WINDOW_SIZE;
    private static final ExecutorService listenerExecutor = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), Util.threadFactory("OkHttp Http2Connection", true));
    long bytesLeftInWriteWindow;
    final boolean client;
    final String hostname;
    int lastGoodStreamId;
    final Listener listener;
    int nextStreamId;
    final Settings peerSettings;
    private final ExecutorService pushExecutor;
    final PushObserver pushObserver;
    final ReaderRunnable readerRunnable;
    private boolean shutdown;
    final Socket socket;
    final Http2Writer writer;
    private final ScheduledExecutorService writerExecutor;
    final Map<Integer, Http2Stream> streams = new LinkedHashMap();
    private long intervalPingsSent = 0;
    private long intervalPongsReceived = 0;
    private long degradedPingsSent = 0;
    private long degradedPongsReceived = 0;
    private long awaitPingsSent = 0;
    private long awaitPongsReceived = 0;
    private long degradedPongDeadlineNs = 0;
    long unacknowledgedBytesRead = 0;
    Settings okHttpSettings = new Settings();
    final Set<Integer> currentPushRequests = new LinkedHashSet();

    /* loaded from: classes-dex2jar.jar:okhttp3/internal/http2/Http2Connection$Listener.class */
    public static abstract class Listener {
        public static final Listener REFUSE_INCOMING_STREAMS = new Listener() { // from class: okhttp3.internal.http2.Http2Connection.Listener.1
            @Override // okhttp3.internal.http2.Http2Connection.Listener
            public void onStream(Http2Stream http2Stream) throws IOException {
                http2Stream.close(ErrorCode.REFUSED_STREAM);
            }
        };

        public void onSettings(Http2Connection http2Connection) {
        }

        public abstract void onStream(Http2Stream http2Stream) throws IOException;
    }

    Http2Connection(Builder builder) {
        Settings settings = new Settings();
        this.peerSettings = settings;
        this.pushObserver = builder.pushObserver;
        boolean z = builder.client;
        this.client = z;
        this.listener = builder.listener;
        this.nextStreamId = builder.client ? 1 : 2;
        if (builder.client) {
            this.nextStreamId += 2;
        }
        if (builder.client) {
            this.okHttpSettings.set(7, OKHTTP_CLIENT_WINDOW_SIZE);
        }
        String str = builder.hostname;
        this.hostname = str;
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, Util.threadFactory(Util.format("OkHttp %s Writer", str), false));
        this.writerExecutor = scheduledThreadPoolExecutor;
        if (builder.pingIntervalMillis != 0) {
            scheduledThreadPoolExecutor.scheduleAtFixedRate(new IntervalPingRunnable(this), (long) builder.pingIntervalMillis, (long) builder.pingIntervalMillis, TimeUnit.MILLISECONDS);
        }
        this.pushExecutor = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), Util.threadFactory(Util.format("OkHttp %s Push Observer", str), true));
        settings.set(7, 65535);
        settings.set(5, 16384);
        this.bytesLeftInWriteWindow = (long) settings.getInitialWindowSize();
        this.socket = builder.socket;
        this.writer = new Http2Writer(builder.sink, z);
        this.readerRunnable = new ReaderRunnable(this, new Http2Reader(builder.source, z));
    }

    static /* synthetic */ long access$108(Http2Connection http2Connection) {
        long j = http2Connection.intervalPongsReceived;
        http2Connection.intervalPongsReceived = 1 + j;
        return j;
    }

    static /* synthetic */ long access$208(Http2Connection http2Connection) {
        long j = http2Connection.intervalPingsSent;
        http2Connection.intervalPingsSent = 1 + j;
        return j;
    }

    static /* synthetic */ long access$608(Http2Connection http2Connection) {
        long j = http2Connection.degradedPongsReceived;
        http2Connection.degradedPongsReceived = 1 + j;
        return j;
    }

    static /* synthetic */ long access$708(Http2Connection http2Connection) {
        long j = http2Connection.awaitPongsReceived;
        http2Connection.awaitPongsReceived = 1 + j;
        return j;
    }

    public void failConnection() {
        try {
            ErrorCode errorCode = ErrorCode.PROTOCOL_ERROR;
            close(errorCode, errorCode);
        } catch (IOException e) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0072 A[Catch: all -> 0x00d4, TryCatch #1 {, blocks: (B:5:0x000f, B:29:0x0089, B:30:0x0099, B:32:0x00a0, B:40:0x00bd, B:41:0x00c9, B:42:0x00ca, B:7:0x0011, B:9:0x001a, B:11:0x0022, B:13:0x0028, B:15:0x004b, B:17:0x0054, B:22:0x006a, B:24:0x0072, B:43:0x00cd, B:44:0x00d3), top: B:49:0x000f }] */
    /* Code decompiled incorrectly, please refer to instructions dump */
    private okhttp3.internal.http2.Http2Stream newStream(int r8, java.util.List<okhttp3.internal.http2.Header> r9, boolean r10) throws java.io.IOException {
        /*
        // Method dump skipped, instructions count: 223
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.Http2Connection.newStream(int, java.util.List, boolean):okhttp3.internal.http2.Http2Stream");
    }

    private void pushExecutorExecute(NamedRunnable namedRunnable) {
        synchronized (this) {
            if (!this.shutdown) {
                this.pushExecutor.execute(namedRunnable);
            }
        }
    }

    final void awaitPong() throws InterruptedException {
        synchronized (this) {
            while (this.awaitPongsReceived < this.awaitPingsSent) {
                wait();
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        close(ErrorCode.NO_ERROR, ErrorCode.CANCEL);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:2|(3:51|3|4)|6|e|13|(8:15|(2:16|(6:18|49|19|20|54|25)(0))|26|27|45|32|34|(1:36)(2:37|38))(0)|47|26|27|45|32|34|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0091, code lost:
        r4 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0092, code lost:
        r4 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0097, code lost:
        if (r7 == null) goto L_0x009a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a6, code lost:
        r4 = e;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00bd A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00be  */
    /* Code decompiled incorrectly, please refer to instructions dump */
    final void close(okhttp3.internal.http2.ErrorCode r4, okhttp3.internal.http2.ErrorCode r5) throws java.io.IOException {
        /*
            r3 = this;
            r0 = 0
            r6 = r0
            r0 = r3
            r1 = r4
            r0.shutdown(r1)     // Catch: IOException -> 0x000c
            r0 = 0
            r4 = r0
            goto L_0x000d
        L_0x000c:
            r4 = move-exception
        L_0x000d:
            r0 = r3
            monitor-enter(r0)
            r0 = r3
            java.util.Map<java.lang.Integer, okhttp3.internal.http2.Http2Stream> r0 = r0.streams     // Catch: all -> 0x00c0
            boolean r0 = r0.isEmpty()     // Catch: all -> 0x00c0
            if (r0 != 0) goto L_0x0042
            r0 = r3
            java.util.Map<java.lang.Integer, okhttp3.internal.http2.Http2Stream> r0 = r0.streams     // Catch: all -> 0x00c0
            java.util.Collection r0 = r0.values()     // Catch: all -> 0x00c0
            r1 = r3
            java.util.Map<java.lang.Integer, okhttp3.internal.http2.Http2Stream> r1 = r1.streams     // Catch: all -> 0x00c0
            int r1 = r1.size()     // Catch: all -> 0x00c0
            okhttp3.internal.http2.Http2Stream[] r1 = new okhttp3.internal.http2.Http2Stream[r1]     // Catch: all -> 0x00c0
            java.lang.Object[] r0 = r0.toArray(r1)     // Catch: all -> 0x00c0
            okhttp3.internal.http2.Http2Stream[] r0 = (okhttp3.internal.http2.Http2Stream[]) r0     // Catch: all -> 0x00c0
            r6 = r0
            r0 = r3
            java.util.Map<java.lang.Integer, okhttp3.internal.http2.Http2Stream> r0 = r0.streams     // Catch: all -> 0x00c0
            r0.clear()     // Catch: all -> 0x00c0
        L_0x0042:
            r0 = r3
            monitor-exit(r0)
            r0 = r4
            r7 = r0
            r0 = r6
            if (r0 == 0) goto L_0x0084
            r0 = r6
            int r0 = r0.length
            r8 = r0
            r0 = 0
            r9 = r0
        L_0x0052:
            r0 = r4
            r7 = r0
            r0 = r9
            r1 = r8
            if (r0 >= r1) goto L_0x0084
            r0 = r6
            r1 = r9
            r0 = r0[r1]
            r7 = r0
            r0 = r7
            r1 = r5
            r0.close(r1)     // Catch: IOException -> 0x006e
            r0 = r4
            r7 = r0
            goto L_0x007b
        L_0x006e:
            r10 = move-exception
            r0 = r4
            r7 = r0
            r0 = r4
            if (r0 == 0) goto L_0x007b
            r0 = r10
            r7 = r0
        L_0x007b:
            int r9 = r9 + 1
            r0 = r7
            r4 = r0
            goto L_0x0052
        L_0x0084:
            r0 = r3
            okhttp3.internal.http2.Http2Writer r0 = r0.writer     // Catch: IOException -> 0x0091
            r0.close()     // Catch: IOException -> 0x0091
            r0 = r7
            r4 = r0
            goto L_0x009c
        L_0x0091:
            r5 = move-exception
            r0 = r7
            r4 = r0
            r0 = r7
            if (r0 != 0) goto L_0x009c
            r0 = r5
            r4 = r0
        L_0x009c:
            r0 = r3
            java.net.Socket r0 = r0.socket     // Catch: IOException -> 0x00a6
            r0.close()     // Catch: IOException -> 0x00a6
            goto L_0x00a7
        L_0x00a6:
            r4 = move-exception
        L_0x00a7:
            r0 = r3
            java.util.concurrent.ScheduledExecutorService r0 = r0.writerExecutor
            r0.shutdown()
            r0 = r3
            java.util.concurrent.ExecutorService r0 = r0.pushExecutor
            r0.shutdown()
            r0 = r4
            if (r0 != 0) goto L_0x00be
            return
        L_0x00be:
            r0 = r4
            throw r0
        L_0x00c0:
            r4 = move-exception
            r0 = r3
            monitor-exit(r0)
            r0 = r4
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.Http2Connection.close(okhttp3.internal.http2.ErrorCode, okhttp3.internal.http2.ErrorCode):void");
    }

    public final void flush() throws IOException {
        this.writer.flush();
    }

    public final Protocol getProtocol() {
        return Protocol.HTTP_2;
    }

    final Http2Stream getStream(int i) {
        Http2Stream http2Stream;
        synchronized (this) {
            http2Stream = this.streams.get(Integer.valueOf(i));
        }
        return http2Stream;
    }

    public final boolean isHealthy(long j) {
        synchronized (this) {
            if (this.shutdown) {
                return false;
            }
            if (this.degradedPongsReceived < this.degradedPingsSent) {
                if (j >= this.degradedPongDeadlineNs) {
                    return false;
                }
            }
            return true;
        }
    }

    public final int maxConcurrentStreams() {
        int maxConcurrentStreams;
        synchronized (this) {
            maxConcurrentStreams = this.peerSettings.getMaxConcurrentStreams(Integer.MAX_VALUE);
        }
        return maxConcurrentStreams;
    }

    public final Http2Stream newStream(List<Header> list, boolean z) throws IOException {
        return newStream(0, list, z);
    }

    public final int openStreamCount() {
        int size;
        synchronized (this) {
            size = this.streams.size();
        }
        return size;
    }

    final void pushDataLater(int i, setTookMs settookms, int i2, boolean z) throws IOException {
        setResponseContentType setresponsecontenttype = new setResponseContentType();
        long j = (long) i2;
        settookms.i(j);
        settookms.read(setresponsecontenttype, j);
        if (setresponsecontenttype.b == j) {
            pushExecutorExecute(new 6(this, "OkHttp %s Push Data[%s]", new Object[]{this.hostname, Integer.valueOf(i)}, i, setresponsecontenttype, i2, z));
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(setresponsecontenttype.b);
        sb.append(" != ");
        sb.append(i2);
        throw new IOException(sb.toString());
    }

    final void pushHeadersLater(int i, List<Header> list, boolean z) {
        try {
            pushExecutorExecute(new 5(this, "OkHttp %s Push Headers[%s]", new Object[]{this.hostname, Integer.valueOf(i)}, i, list, z));
        } catch (RejectedExecutionException e) {
        }
    }

    final void pushRequestLater(int i, List<Header> list) {
        synchronized (this) {
            if (this.currentPushRequests.contains(Integer.valueOf(i))) {
                writeSynResetLater(i, ErrorCode.PROTOCOL_ERROR);
                return;
            }
            this.currentPushRequests.add(Integer.valueOf(i));
            try {
                pushExecutorExecute(new 4(this, "OkHttp %s Push Request[%s]", new Object[]{this.hostname, Integer.valueOf(i)}, i, list));
            } catch (RejectedExecutionException e) {
            }
        }
    }

    final void pushResetLater(int i, ErrorCode errorCode) {
        pushExecutorExecute(new 7(this, "OkHttp %s Push Reset[%s]", new Object[]{this.hostname, Integer.valueOf(i)}, i, errorCode));
    }

    public final Http2Stream pushStream(int i, List<Header> list, boolean z) throws IOException {
        if (!this.client) {
            return newStream(i, list, z);
        }
        throw new IllegalStateException("Client cannot push requests.");
    }

    final boolean pushedStream(int i) {
        boolean z = true;
        if (i == 0 || (i & 1) != 0) {
            z = false;
        }
        return z;
    }

    public final Http2Stream removeStream(int i) {
        Http2Stream remove;
        synchronized (this) {
            remove = this.streams.remove(Integer.valueOf(i));
            notifyAll();
        }
        return remove;
    }

    public final void sendDegradedPingLater() {
        synchronized (this) {
            long j = this.degradedPongsReceived;
            long j2 = this.degradedPingsSent;
            if (j >= j2) {
                this.degradedPingsSent = j2 + 1;
                this.degradedPongDeadlineNs = System.nanoTime() + DEGRADED_PONG_TIMEOUT_NS;
                try {
                    this.writerExecutor.execute(new NamedRunnable("OkHttp %s ping", this.hostname) { // from class: okhttp3.internal.http2.Http2Connection.3
                        @Override // okhttp3.internal.NamedRunnable
                        public void execute() {
                            Http2Connection.this.writePing(false, 2, 0);
                        }
                    });
                } catch (RejectedExecutionException e) {
                }
            }
        }
    }

    public final void setSettings(Settings settings) throws IOException {
        synchronized (this.writer) {
            synchronized (this) {
                if (!this.shutdown) {
                    this.okHttpSettings.merge(settings);
                } else {
                    throw new ConnectionShutdownException();
                }
            }
            this.writer.settings(settings);
        }
    }

    public final void shutdown(ErrorCode errorCode) throws IOException {
        synchronized (this.writer) {
            synchronized (this) {
                if (!this.shutdown) {
                    this.shutdown = true;
                    this.writer.goAway(this.lastGoodStreamId, errorCode, Util.EMPTY_BYTE_ARRAY);
                }
            }
        }
    }

    public final void start() throws IOException {
        start(true);
    }

    final void start(boolean z) throws IOException {
        if (z) {
            this.writer.connectionPreface();
            this.writer.settings(this.okHttpSettings);
            int initialWindowSize = this.okHttpSettings.getInitialWindowSize();
            if (initialWindowSize != 65535) {
                this.writer.windowUpdate(0, (long) (initialWindowSize - 65535));
            }
        }
        new Thread((Runnable) this.readerRunnable).start();
    }

    public final void updateConnectionFlowControl(long j) {
        synchronized (this) {
            long j2 = this.unacknowledgedBytesRead + j;
            this.unacknowledgedBytesRead = j2;
            if (j2 >= ((long) (this.okHttpSettings.getInitialWindowSize() / 2))) {
                writeWindowUpdateLater(0, this.unacknowledgedBytesRead);
                this.unacknowledgedBytesRead = 0;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0050, code lost:
        throw new java.io.IOException("stream closed");
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0053, code lost:
        r0 = java.lang.Math.min((int) java.lang.Math.min((long) r12, r0), r6.writer.maxDataLength());
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x006d, code lost:
        r0 = (long) r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0070, code lost:
        r6.bytesLeftInWriteWindow -= r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [long] */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1, types: [long] */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final void writeData(int r7, boolean r8, o.setResponseContentType r9, long r10) throws java.io.IOException {
        /*
        // Method dump skipped, instructions count: 196
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.Http2Connection.writeData(int, boolean, o.setResponseContentType, long):void");
    }

    final void writePing() {
        synchronized (this) {
            this.awaitPingsSent++;
        }
        writePing(false, 3, 1330343787);
    }

    final void writePing(boolean z, int i, int i2) {
        try {
            this.writer.ping(z, i, i2);
        } catch (IOException e) {
            failConnection();
        }
    }

    final void writePingAndAwaitPong() throws InterruptedException {
        writePing();
        awaitPong();
    }

    public final void writeSynReply(int i, boolean z, List<Header> list) throws IOException {
        this.writer.synReply(z, i, list);
    }

    public final void writeSynReset(int i, ErrorCode errorCode) throws IOException {
        this.writer.rstStream(i, errorCode);
    }

    public final void writeSynResetLater(final int i, final ErrorCode errorCode) {
        try {
            this.writerExecutor.execute(new NamedRunnable("OkHttp %s stream %d", new Object[]{this.hostname, Integer.valueOf(i)}) { // from class: okhttp3.internal.http2.Http2Connection.1
                @Override // okhttp3.internal.NamedRunnable
                public void execute() {
                    try {
                        Http2Connection.this.writeSynReset(i, errorCode);
                    } catch (IOException e) {
                        Http2Connection.this.failConnection();
                    }
                }
            });
        } catch (RejectedExecutionException e) {
        }
    }

    public final void writeWindowUpdateLater(final int i, final long j) {
        try {
            this.writerExecutor.execute(new NamedRunnable("OkHttp Window Update %s stream %d", new Object[]{this.hostname, Integer.valueOf(i)}) { // from class: okhttp3.internal.http2.Http2Connection.2
                @Override // okhttp3.internal.NamedRunnable
                public void execute() {
                    try {
                        Http2Connection.this.writer.windowUpdate(i, j);
                    } catch (IOException e) {
                        Http2Connection.this.failConnection();
                    }
                }
            });
        } catch (RejectedExecutionException e) {
        }
    }
}
