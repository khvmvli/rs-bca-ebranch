package okhttp3;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;
import o.newInitializerBuilder;
import o.setResponseDate;
import okhttp3.internal.NamedRunnable;
import okhttp3.internal.Util;
import okhttp3.internal.cache.CacheInterceptor;
import okhttp3.internal.connection.ConnectInterceptor;
import okhttp3.internal.connection.StreamAllocation;
import okhttp3.internal.http.BridgeInterceptor;
import okhttp3.internal.http.CallServerInterceptor;
import okhttp3.internal.http.RealInterceptorChain;
import okhttp3.internal.http.RetryAndFollowUpInterceptor;
import okhttp3.internal.platform.Platform;
/* loaded from: classes2-dex2jar.jar:okhttp3/RealCall.class */
final class RealCall implements Call {
    final OkHttpClient client;
    @Nullable
    private EventListener eventListener;
    private boolean executed;
    final boolean forWebSocket;
    final Request originalRequest;
    final RetryAndFollowUpInterceptor retryAndFollowUpInterceptor;
    final setResponseDate timeout;

    /* loaded from: classes2-dex2jar.jar:okhttp3/RealCall$AsyncCall.class */
    final class AsyncCall extends NamedRunnable {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private final Callback responseCallback;

        AsyncCall(Callback callback) {
            super("OkHttp %s", new Object[]{RealCall.this.redactedUrl()});
            this.responseCallback = callback;
        }

        public final void execute() {
            IOException e;
            Throwable th;
            try {
                RealCall.this.timeout.enter();
                boolean z = true;
                boolean z2 = true;
                try {
                } catch (IOException e2) {
                    e = e2;
                    z = false;
                } catch (Throwable th2) {
                    th = th2;
                    z2 = false;
                }
                try {
                    this.responseCallback.onResponse(RealCall.this, RealCall.this.getResponseWithInterceptorChain());
                } catch (IOException e3) {
                    e = e3;
                    IOException timeoutExit = RealCall.this.timeoutExit(e);
                    if (z) {
                        Platform platform = Platform.get();
                        StringBuilder sb = new StringBuilder("Callback failure for ");
                        sb.append(RealCall.this.toLoggableString());
                        platform.log(4, sb.toString(), timeoutExit);
                    } else {
                        RealCall.this.eventListener.callFailed(RealCall.this, timeoutExit);
                        this.responseCallback.onFailure(RealCall.this, timeoutExit);
                    }
                } catch (Throwable th3) {
                    th = th3;
                    RealCall.this.cancel();
                    if (!z2) {
                        StringBuilder sb2 = new StringBuilder("canceled due to ");
                        sb2.append(th);
                        this.responseCallback.onFailure(RealCall.this, new IOException(sb2.toString()));
                    }
                    throw th;
                }
            } finally {
                RealCall.this.client.dispatcher().finished(this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        final void executeOn(ExecutorService executorService) {
            try {
                try {
                    executorService.execute(this);
                } catch (RejectedExecutionException e) {
                    InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                    interruptedIOException.initCause(e);
                    RealCall.this.eventListener.callFailed(RealCall.this, interruptedIOException);
                    this.responseCallback.onFailure(RealCall.this, interruptedIOException);
                    RealCall.this.client.dispatcher().finished(this);
                }
            } catch (Throwable th) {
                RealCall.this.client.dispatcher().finished(this);
                throw th;
            }
        }

        final RealCall get() {
            return RealCall.this;
        }

        final String host() {
            return RealCall.this.originalRequest.url().host();
        }

        final Request request() {
            return RealCall.this.originalRequest;
        }
    }

    private RealCall(OkHttpClient okHttpClient, Request request, boolean z) {
        this.client = okHttpClient;
        this.originalRequest = request;
        this.forWebSocket = z;
        this.retryAndFollowUpInterceptor = new RetryAndFollowUpInterceptor(okHttpClient, z);
        AnonymousClass1 r0 = new setResponseDate() { // from class: okhttp3.RealCall.1
            public void timedOut() {
                RealCall.this.cancel();
            }
        };
        this.timeout = r0;
        r0.timeout((long) okHttpClient.callTimeoutMillis(), TimeUnit.MILLISECONDS);
    }

    private void captureCallStackTrace() {
        this.retryAndFollowUpInterceptor.setCallStackTrace(Platform.get().getStackTraceForCloseable("response.body().close()"));
    }

    static RealCall newRealCall(OkHttpClient okHttpClient, Request request, boolean z) {
        RealCall realCall = new RealCall(okHttpClient, request, z);
        realCall.eventListener = okHttpClient.eventListenerFactory().create(realCall);
        return realCall;
    }

    public final void cancel() {
        this.retryAndFollowUpInterceptor.cancel();
    }

    public final RealCall clone() {
        return newRealCall(this.client, this.originalRequest, this.forWebSocket);
    }

    public final void enqueue(Callback callback) {
        synchronized (this) {
            if (!this.executed) {
                this.executed = true;
            } else {
                throw new IllegalStateException("Already Executed");
            }
        }
        captureCallStackTrace();
        this.eventListener.callStart(this);
        this.client.dispatcher().enqueue(new AsyncCall(callback));
    }

    public final Response execute() throws IOException {
        synchronized (this) {
            if (!this.executed) {
                this.executed = true;
            } else {
                throw new IllegalStateException("Already Executed");
            }
        }
        try {
            captureCallStackTrace();
            this.timeout.enter();
            this.eventListener.callStart(this);
            try {
                this.client.dispatcher().executed(this);
                Response responseWithInterceptorChain = getResponseWithInterceptorChain();
                if (responseWithInterceptorChain != null) {
                    this.client.dispatcher().finished(this);
                    return responseWithInterceptorChain;
                }
                throw new IOException("Canceled");
            } catch (IOException e) {
                IOException timeoutExit = timeoutExit(e);
                this.eventListener.callFailed(this, timeoutExit);
                throw timeoutExit;
            }
        } catch (Throwable th) {
            this.client.dispatcher().finished(this);
            throw th;
        }
    }

    final Response getResponseWithInterceptorChain() throws IOException {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.client.interceptors());
        arrayList.add(this.retryAndFollowUpInterceptor);
        arrayList.add(new BridgeInterceptor(this.client.cookieJar()));
        arrayList.add(new CacheInterceptor(this.client.internalCache()));
        arrayList.add(new ConnectInterceptor(this.client));
        if (!this.forWebSocket) {
            arrayList.addAll(this.client.networkInterceptors());
        }
        arrayList.add(new CallServerInterceptor(this.forWebSocket));
        Response proceed = new RealInterceptorChain(arrayList, null, null, null, 0, this.originalRequest, this, this.eventListener, this.client.connectTimeoutMillis(), this.client.readTimeoutMillis(), this.client.writeTimeoutMillis()).proceed(this.originalRequest);
        if (!this.retryAndFollowUpInterceptor.isCanceled()) {
            return proceed;
        }
        Util.closeQuietly(proceed);
        throw new IOException("Canceled");
    }

    public final boolean isCanceled() {
        return this.retryAndFollowUpInterceptor.isCanceled();
    }

    public final boolean isExecuted() {
        boolean z;
        synchronized (this) {
            z = this.executed;
        }
        return z;
    }

    final String redactedUrl() {
        return this.originalRequest.url().redact();
    }

    public final Request request() {
        return this.originalRequest;
    }

    final StreamAllocation streamAllocation() {
        return this.retryAndFollowUpInterceptor.streamAllocation();
    }

    public final newInitializerBuilder timeout() {
        return this.timeout;
    }

    @Nullable
    final IOException timeoutExit(@Nullable IOException iOException) {
        if (!this.timeout.exit()) {
            return iOException;
        }
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    final String toLoggableString() {
        StringBuilder sb = new StringBuilder();
        sb.append(isCanceled() ? "canceled " : "");
        sb.append(this.forWebSocket ? "web socket" : "call");
        sb.append(" to ");
        sb.append(redactedUrl());
        return sb.toString();
    }
}
