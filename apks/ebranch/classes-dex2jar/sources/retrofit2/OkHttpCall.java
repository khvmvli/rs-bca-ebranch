package retrofit2;

import java.io.IOException;
import javax.annotation.Nullable;
import okhttp3.Call;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
/* loaded from: classes-dex2jar.jar:retrofit2/OkHttpCall.class */
final class OkHttpCall<T> implements Call<T> {
    @Nullable
    private final Object[] args;
    private volatile boolean canceled;
    @Nullable
    private Throwable creationFailure;
    private boolean executed;
    @Nullable
    private Call rawCall;
    private final ServiceMethod<T, ?> serviceMethod;

    /* JADX INFO: Access modifiers changed from: package-private */
    public OkHttpCall(ServiceMethod<T, ?> serviceMethod, @Nullable Object[] objArr) {
        this.serviceMethod = serviceMethod;
        this.args = objArr;
    }

    private Call createRawCall() throws IOException {
        Call call = this.serviceMethod.toCall(this.args);
        if (call != null) {
            return call;
        }
        throw new NullPointerException("Call.Factory returned null.");
    }

    @Override // retrofit2.Call
    public final void cancel() {
        Call call;
        this.canceled = true;
        synchronized (this) {
            call = this.rawCall;
        }
        if (call != null) {
            call.cancel();
        }
    }

    @Override // retrofit2.Call, java.lang.Object
    public final OkHttpCall<T> clone() {
        return new OkHttpCall<>(this.serviceMethod, this.args);
    }

    @Override // retrofit2.Call
    public final void enqueue(Callback<T> callback) {
        Call call;
        Throwable th;
        Utils.checkNotNull(callback, "callback == null");
        synchronized (this) {
            if (!this.executed) {
                this.executed = true;
                Call call2 = this.rawCall;
                Throwable th2 = this.creationFailure;
                call = call2;
                th = th2;
                if (call2 == null) {
                    call = call2;
                    th = th2;
                    if (th2 == null) {
                        call = createRawCall();
                        this.rawCall = call;
                        th = th2;
                    }
                }
            } else {
                throw new IllegalStateException("Already executed.");
            }
        }
        if (th != null) {
            callback.onFailure(this, th);
            return;
        }
        if (this.canceled) {
            call.cancel();
        }
        call.enqueue(new 1(this, callback));
    }

    @Override // retrofit2.Call
    public final Response<T> execute() throws IOException {
        Call call;
        synchronized (this) {
            if (!this.executed) {
                this.executed = true;
                Throwable th = this.creationFailure;
                if (th == null) {
                    Call call2 = this.rawCall;
                    call = call2;
                    if (call2 == null) {
                        try {
                            call = createRawCall();
                            this.rawCall = call;
                        } catch (IOException | Error | RuntimeException e) {
                            Utils.throwIfFatal(e);
                            this.creationFailure = e;
                            throw e;
                        }
                    }
                } else if (th instanceof IOException) {
                    throw ((IOException) th);
                } else if (th instanceof RuntimeException) {
                    throw ((RuntimeException) th);
                } else {
                    throw ((Error) th);
                }
            } else {
                throw new IllegalStateException("Already executed.");
            }
        }
        if (this.canceled) {
            call.cancel();
        }
        return parseResponse(call.execute());
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0020, code lost:
        if (r0.isCanceled() != false) goto L_0x0028;
     */
    @Override // retrofit2.Call
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final boolean isCanceled() {
        /*
            r2 = this;
            r0 = r2
            boolean r0 = r0.canceled
            r3 = r0
            r0 = 1
            r4 = r0
            r0 = r3
            if (r0 == 0) goto L_0x000d
            r0 = 1
            return r0
        L_0x000d:
            r0 = r2
            monitor-enter(r0)
            r0 = r2
            okhttp3.Call r0 = r0.rawCall     // Catch: all -> 0x002c
            r5 = r0
            r0 = r5
            if (r0 == 0) goto L_0x0026
            r0 = r5
            boolean r0 = r0.isCanceled()     // Catch: all -> 0x002c
            r3 = r0
            r0 = r3
            if (r0 == 0) goto L_0x0026
            goto L_0x0028
        L_0x0026:
            r0 = 0
            r4 = r0
        L_0x0028:
            r0 = r2
            monitor-exit(r0)
            r0 = r4
            return r0
        L_0x002c:
            r5 = move-exception
            r0 = r2
            monitor-exit(r0)
            r0 = r5
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: retrofit2.OkHttpCall.isCanceled():boolean");
    }

    @Override // retrofit2.Call
    public final boolean isExecuted() {
        boolean z;
        synchronized (this) {
            z = this.executed;
        }
        return z;
    }

    /* JADX WARN: Finally extract failed */
    final Response<T> parseResponse(Response response) throws IOException {
        ResponseBody body = response.body();
        Response build = response.newBuilder().body(new NoContentResponseBody(body.contentType(), body.contentLength())).build();
        int code = build.code();
        if (code < 200 || code >= 300) {
            try {
                Response<T> error = Response.error(Utils.buffer(body), build);
                body.close();
                return error;
            } catch (Throwable th) {
                body.close();
                throw th;
            }
        } else if (code == 204 || code == 205) {
            body.close();
            return Response.success((Object) null, build);
        } else {
            ExceptionCatchingRequestBody exceptionCatchingRequestBody = new ExceptionCatchingRequestBody(body);
            try {
                return Response.success(this.serviceMethod.toResponse(exceptionCatchingRequestBody), build);
            } catch (RuntimeException e) {
                exceptionCatchingRequestBody.throwIfCaught();
                throw e;
            }
        }
    }

    @Override // retrofit2.Call
    public final Request request() {
        Throwable e;
        synchronized (this) {
            Call call = this.rawCall;
            if (call != null) {
                return call.request();
            }
            Throwable th = this.creationFailure;
            if (th == null) {
                try {
                    Call createRawCall = createRawCall();
                    this.rawCall = createRawCall;
                    return createRawCall.request();
                } catch (IOException e2) {
                    this.creationFailure = e2;
                    throw new RuntimeException("Unable to create request.", e2);
                } catch (Error e3) {
                    e = e3;
                    Utils.throwIfFatal(e);
                    this.creationFailure = e;
                    throw e;
                } catch (RuntimeException e4) {
                    e = e4;
                    Utils.throwIfFatal(e);
                    this.creationFailure = e;
                    throw e;
                }
            } else if (th instanceof IOException) {
                throw new RuntimeException("Unable to create request.", this.creationFailure);
            } else if (th instanceof RuntimeException) {
                throw ((RuntimeException) th);
            } else {
                throw ((Error) th);
            }
        }
    }
}
