package okhttp3.internal.connection;

import java.io.IOException;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.net.Socket;
import java.util.List;
import okhttp3.Address;
import okhttp3.Call;
import okhttp3.ConnectionPool;
import okhttp3.EventListener;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Route;
import okhttp3.internal.Internal;
import okhttp3.internal.Util;
import okhttp3.internal.connection.RouteSelector;
import okhttp3.internal.http.HttpCodec;
import okhttp3.internal.http2.ConnectionShutdownException;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.StreamResetException;
/* loaded from: classes-dex2jar.jar:okhttp3/internal/connection/StreamAllocation.class */
public final class StreamAllocation {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public final Address address;
    public final Call call;
    private final Object callStackTrace;
    private boolean canceled;
    private HttpCodec codec;
    private RealConnection connection;
    private final ConnectionPool connectionPool;
    public final EventListener eventListener;
    private int refusedStreamCount;
    private boolean released;
    private boolean reportedAcquired;
    private Route route;
    private RouteSelector.Selection routeSelection;
    private final RouteSelector routeSelector;

    /* loaded from: classes-dex2jar.jar:okhttp3/internal/connection/StreamAllocation$StreamAllocationReference.class */
    public static final class StreamAllocationReference extends WeakReference<StreamAllocation> {
        public final Object callStackTrace;

        StreamAllocationReference(StreamAllocation streamAllocation, Object obj) {
            super(streamAllocation);
            this.callStackTrace = obj;
        }
    }

    public StreamAllocation(ConnectionPool connectionPool, Address address, Call call, EventListener eventListener, Object obj) {
        this.connectionPool = connectionPool;
        this.address = address;
        this.call = call;
        this.eventListener = eventListener;
        this.routeSelector = new RouteSelector(address, routeDatabase(), call, eventListener);
        this.callStackTrace = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x004b, code lost:
        if (r4.connection.noNewStreams != false) goto L_0x004e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump */
    private java.net.Socket deallocate(boolean r5, boolean r6, boolean r7) {
        /*
            r4 = this;
            r0 = 0
            r8 = r0
            r0 = r7
            if (r0 == 0) goto L_0x000c
            r0 = r4
            r1 = 0
            r0.codec = r1
        L_0x000c:
            r0 = r6
            if (r0 == 0) goto L_0x0015
            r0 = r4
            r1 = 1
            r0.released = r1
        L_0x0015:
            r0 = r4
            okhttp3.internal.connection.RealConnection r0 = r0.connection
            r9 = r0
            r0 = r8
            r10 = r0
            r0 = r9
            if (r0 == 0) goto L_0x0094
            r0 = r5
            if (r0 == 0) goto L_0x002e
            r0 = r9
            r1 = 1
            r0.noNewStreams = r1
        L_0x002e:
            r0 = r8
            r10 = r0
            r0 = r4
            okhttp3.internal.http.HttpCodec r0 = r0.codec
            if (r0 != 0) goto L_0x0094
            r0 = r4
            boolean r0 = r0.released
            if (r0 != 0) goto L_0x004e
            r0 = r8
            r10 = r0
            r0 = r4
            okhttp3.internal.connection.RealConnection r0 = r0.connection
            boolean r0 = r0.noNewStreams
            if (r0 == 0) goto L_0x0094
        L_0x004e:
            r0 = r4
            r1 = r4
            okhttp3.internal.connection.RealConnection r1 = r1.connection
            r0.release(r1)
            r0 = r4
            okhttp3.internal.connection.RealConnection r0 = r0.connection
            java.util.List<java.lang.ref.Reference<okhttp3.internal.connection.StreamAllocation>> r0 = r0.allocations
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x008c
            r0 = r4
            okhttp3.internal.connection.RealConnection r0 = r0.connection
            long r1 = java.lang.System.nanoTime()
            r0.idleAtNanos = r1
            okhttp3.internal.Internal r0 = okhttp3.internal.Internal.instance
            r1 = r4
            okhttp3.ConnectionPool r1 = r1.connectionPool
            r2 = r4
            okhttp3.internal.connection.RealConnection r2 = r2.connection
            boolean r0 = r0.connectionBecameIdle(r1, r2)
            if (r0 == 0) goto L_0x008c
            r0 = r4
            okhttp3.internal.connection.RealConnection r0 = r0.connection
            java.net.Socket r0 = r0.socket()
            r10 = r0
            goto L_0x008f
        L_0x008c:
            r0 = 0
            r10 = r0
        L_0x008f:
            r0 = r4
            r1 = 0
            r0.connection = r1
        L_0x0094:
            r0 = r10
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.connection.StreamAllocation.deallocate(boolean, boolean, boolean):java.net.Socket");
    }

    private RealConnection findConnection(int i, int i2, int i3, int i4, boolean z) throws IOException {
        RealConnection realConnection;
        Socket releaseIfNoNewStreams;
        RealConnection realConnection2;
        boolean z2;
        Route route;
        boolean z3;
        RealConnection realConnection3;
        boolean z4;
        RealConnection realConnection4;
        Socket socket;
        RouteSelector.Selection selection;
        synchronized (this.connectionPool) {
            if (this.released) {
                throw new IllegalStateException("released");
            } else if (this.codec != null) {
                throw new IllegalStateException("codec != null");
            } else if (!this.canceled) {
                realConnection = this.connection;
                releaseIfNoNewStreams = releaseIfNoNewStreams();
                realConnection2 = this.connection;
                socket = null;
                if (realConnection2 != null) {
                    realConnection = null;
                } else {
                    realConnection2 = null;
                }
                if (!this.reportedAcquired) {
                    realConnection = null;
                }
                if (realConnection2 == null) {
                    Internal.instance.get(this.connectionPool, this.address, this, null);
                    RealConnection realConnection5 = this.connection;
                    if (realConnection5 != null) {
                        realConnection2 = realConnection5;
                        z2 = true;
                        route = null;
                    } else {
                        route = this.route;
                    }
                } else {
                    route = null;
                }
                z2 = false;
            } else {
                throw new IOException("Canceled");
            }
        }
        Util.closeQuietly(releaseIfNoNewStreams);
        if (realConnection != null) {
            this.eventListener.connectionReleased(this.call, realConnection);
        }
        if (z2) {
            this.eventListener.connectionAcquired(this.call, realConnection2);
        }
        if (realConnection2 != null) {
            this.route = this.connection.route();
            return realConnection2;
        }
        if (route != null || ((selection = this.routeSelection) != null && selection.hasNext())) {
            z3 = false;
        } else {
            this.routeSelection = this.routeSelector.next();
            z3 = true;
        }
        synchronized (this.connectionPool) {
            if (!this.canceled) {
                realConnection3 = realConnection2;
                z4 = z2;
                if (z3) {
                    List all = this.routeSelection.getAll();
                    int size = all.size();
                    int i5 = 0;
                    while (true) {
                        realConnection3 = realConnection2;
                        z4 = z2;
                        if (i5 >= size) {
                            break;
                        }
                        Route route2 = (Route) all.get(i5);
                        Internal.instance.get(this.connectionPool, this.address, this, route2);
                        realConnection3 = this.connection;
                        if (realConnection3 != null) {
                            this.route = route2;
                            z4 = true;
                            break;
                        }
                        i5++;
                    }
                }
                if (!z4) {
                    Route route3 = route;
                    if (route == null) {
                        route3 = this.routeSelection.next();
                    }
                    this.route = route3;
                    this.refusedStreamCount = 0;
                    RealConnection realConnection6 = new RealConnection(this.connectionPool, route3);
                    acquire(realConnection6, false);
                    realConnection3 = realConnection6;
                }
            } else {
                throw new IOException("Canceled");
            }
        }
        if (z4) {
            this.eventListener.connectionAcquired(this.call, realConnection3);
            return realConnection3;
        }
        realConnection3.connect(i, i2, i3, i4, z, this.call, this.eventListener);
        routeDatabase().connected(realConnection3.route());
        synchronized (this.connectionPool) {
            this.reportedAcquired = true;
            Internal.instance.put(this.connectionPool, realConnection3);
            realConnection4 = realConnection3;
            if (realConnection3.isMultiplexed()) {
                socket = Internal.instance.deduplicate(this.connectionPool, this.address, this);
                realConnection4 = this.connection;
            }
        }
        Util.closeQuietly(socket);
        this.eventListener.connectionAcquired(this.call, realConnection4);
        return realConnection4;
    }

    private RealConnection findHealthyConnection(int i, int i2, int i3, int i4, boolean z, boolean z2) throws IOException {
        while (true) {
            RealConnection findConnection = findConnection(i, i2, i3, i4, z);
            synchronized (this.connectionPool) {
                if (findConnection.successCount == 0 && !findConnection.isMultiplexed()) {
                    return findConnection;
                }
                if (findConnection.isHealthy(z2)) {
                    return findConnection;
                }
                noNewStreams();
            }
        }
    }

    private void release(RealConnection realConnection) {
        int size = realConnection.allocations.size();
        for (int i = 0; i < size; i++) {
            if (realConnection.allocations.get(i).get() == this) {
                realConnection.allocations.remove(i);
                return;
            }
        }
        throw new IllegalStateException();
    }

    private Socket releaseIfNoNewStreams() {
        RealConnection realConnection = this.connection;
        if (realConnection == null || !realConnection.noNewStreams) {
            return null;
        }
        return deallocate(false, false, true);
    }

    private RouteDatabase routeDatabase() {
        return Internal.instance.routeDatabase(this.connectionPool);
    }

    public final void acquire(RealConnection realConnection, boolean z) {
        if (this.connection == null) {
            this.connection = realConnection;
            this.reportedAcquired = z;
            realConnection.allocations.add(new StreamAllocationReference(this, this.callStackTrace));
            return;
        }
        throw new IllegalStateException();
    }

    public final void cancel() {
        HttpCodec httpCodec;
        RealConnection realConnection;
        synchronized (this.connectionPool) {
            this.canceled = true;
            httpCodec = this.codec;
            realConnection = this.connection;
        }
        if (httpCodec != null) {
            httpCodec.cancel();
        } else if (realConnection != null) {
            realConnection.cancel();
        }
    }

    public final HttpCodec codec() {
        HttpCodec httpCodec;
        synchronized (this.connectionPool) {
            httpCodec = this.codec;
        }
        return httpCodec;
    }

    public final RealConnection connection() {
        RealConnection realConnection;
        synchronized (this) {
            realConnection = this.connection;
        }
        return realConnection;
    }

    public final boolean hasMoreRoutes() {
        RouteSelector.Selection selection;
        return this.route != null || ((selection = this.routeSelection) != null && selection.hasNext()) || this.routeSelector.hasNext();
    }

    public final HttpCodec newStream(OkHttpClient okHttpClient, Interceptor.Chain chain, boolean z) {
        try {
            HttpCodec newCodec = findHealthyConnection(chain.connectTimeoutMillis(), chain.readTimeoutMillis(), chain.writeTimeoutMillis(), okHttpClient.pingIntervalMillis(), okHttpClient.retryOnConnectionFailure(), z).newCodec(okHttpClient, chain, this);
            synchronized (this.connectionPool) {
                this.codec = newCodec;
            }
            return newCodec;
        } catch (IOException e) {
            throw new RouteException(e);
        }
    }

    public final void noNewStreams() {
        RealConnection realConnection;
        Socket deallocate;
        synchronized (this.connectionPool) {
            realConnection = this.connection;
            deallocate = deallocate(true, false, false);
            if (this.connection != null) {
                realConnection = null;
            }
        }
        Util.closeQuietly(deallocate);
        if (realConnection != null) {
            this.eventListener.connectionReleased(this.call, realConnection);
        }
    }

    public final void release() {
        RealConnection realConnection;
        Socket deallocate;
        synchronized (this.connectionPool) {
            realConnection = this.connection;
            deallocate = deallocate(false, true, false);
            if (this.connection != null) {
                realConnection = null;
            }
        }
        Util.closeQuietly(deallocate);
        if (realConnection != null) {
            Internal.instance.timeoutExit(this.call, null);
            this.eventListener.connectionReleased(this.call, realConnection);
            this.eventListener.callEnd(this.call);
        }
    }

    public final Socket releaseAndAcquire(RealConnection realConnection) {
        if (this.codec == null && this.connection.allocations.size() == 1) {
            Reference<StreamAllocation> reference = this.connection.allocations.get(0);
            Socket deallocate = deallocate(true, false, false);
            this.connection = realConnection;
            realConnection.allocations.add(reference);
            return deallocate;
        }
        throw new IllegalStateException();
    }

    public final Route route() {
        return this.route;
    }

    public final void streamFailed(IOException iOException) {
        boolean z;
        Socket deallocate;
        RealConnection realConnection;
        synchronized (this.connectionPool) {
            if (iOException instanceof StreamResetException) {
                ErrorCode errorCode = ((StreamResetException) iOException).errorCode;
                if (errorCode == ErrorCode.REFUSED_STREAM) {
                    int i = this.refusedStreamCount + 1;
                    this.refusedStreamCount = i;
                    if (i > 1) {
                        this.route = null;
                        z = true;
                    }
                    z = false;
                } else {
                    if (errorCode != ErrorCode.CANCEL) {
                        this.route = null;
                        z = true;
                    }
                    z = false;
                }
            } else {
                RealConnection realConnection2 = this.connection;
                if (realConnection2 != null && (!realConnection2.isMultiplexed() || (iOException instanceof ConnectionShutdownException))) {
                    if (this.connection.successCount == 0) {
                        Route route = this.route;
                        if (!(route == null || iOException == null)) {
                            this.routeSelector.connectFailed(route, iOException);
                        }
                        this.route = null;
                    }
                    z = true;
                }
                z = false;
            }
            realConnection = this.connection;
            deallocate = deallocate(z, false, true);
            realConnection = null;
            if (this.connection == null) {
                if (!this.reportedAcquired) {
                    realConnection = null;
                }
            }
        }
        Util.closeQuietly(deallocate);
        if (realConnection != null) {
            this.eventListener.connectionReleased(this.call, realConnection);
        }
    }

    public final void streamFinished(boolean z, HttpCodec httpCodec, long j, IOException iOException) {
        RealConnection realConnection;
        Socket deallocate;
        boolean z2;
        this.eventListener.responseBodyEnd(this.call, j);
        synchronized (this.connectionPool) {
            if (httpCodec != null) {
                if (httpCodec == this.codec) {
                    if (!z) {
                        this.connection.successCount++;
                    }
                    realConnection = this.connection;
                    deallocate = deallocate(z, false, true);
                    if (this.connection != null) {
                        realConnection = null;
                    }
                    z2 = this.released;
                }
            }
            StringBuilder sb = new StringBuilder("expected ");
            sb.append(this.codec);
            sb.append(" but was ");
            sb.append(httpCodec);
            throw new IllegalStateException(sb.toString());
        }
        Util.closeQuietly(deallocate);
        if (realConnection != null) {
            this.eventListener.connectionReleased(this.call, realConnection);
        }
        if (iOException != null) {
            this.eventListener.callFailed(this.call, Internal.instance.timeoutExit(this.call, iOException));
        } else if (z2) {
            Internal.instance.timeoutExit(this.call, null);
            this.eventListener.callEnd(this.call);
        }
    }

    public final String toString() {
        Object connection = connection();
        if (connection == null) {
            connection = this.address;
        }
        return connection.toString();
    }
}
