package okhttp3.internal.http;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.HttpRetryException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocketFactory;
import okhttp3.Address;
import okhttp3.Call;
import okhttp3.CertificatePinner;
import okhttp3.EventListener;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.Interceptor$Chain;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Request$Builder;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.Route;
import okhttp3.internal.Util;
import okhttp3.internal.connection.RouteException;
import okhttp3.internal.connection.StreamAllocation;
import okhttp3.internal.http2.ConnectionShutdownException;
/* loaded from: classes2-dex2jar.jar:okhttp3/internal/http/RetryAndFollowUpInterceptor.class */
public final class RetryAndFollowUpInterceptor implements Interceptor {
    private static final int MAX_FOLLOW_UPS = 20;
    private Object callStackTrace;
    private volatile boolean canceled;
    private final OkHttpClient client;
    private final boolean forWebSocket;
    private volatile StreamAllocation streamAllocation;

    public RetryAndFollowUpInterceptor(OkHttpClient okHttpClient, boolean z) {
        this.client = okHttpClient;
        this.forWebSocket = z;
    }

    private Address createAddress(HttpUrl httpUrl) {
        CertificatePinner certificatePinner;
        HostnameVerifier hostnameVerifier;
        SSLSocketFactory sSLSocketFactory;
        if (httpUrl.isHttps()) {
            sSLSocketFactory = this.client.sslSocketFactory();
            hostnameVerifier = this.client.hostnameVerifier();
            certificatePinner = this.client.certificatePinner();
        } else {
            sSLSocketFactory = null;
            hostnameVerifier = null;
            certificatePinner = null;
        }
        return new Address(httpUrl.host(), httpUrl.port(), this.client.dns(), this.client.socketFactory(), sSLSocketFactory, hostnameVerifier, certificatePinner, this.client.proxyAuthenticator(), this.client.proxy(), this.client.protocols(), this.client.connectionSpecs(), this.client.proxySelector());
    }

    private Request followUpRequest(Response response, Route route) throws IOException {
        String header;
        HttpUrl resolve;
        if (response != null) {
            int code = response.code();
            String method = response.request().method();
            RequestBody requestBody = null;
            if (code == 307 || code == 308) {
                if (!method.equals("GET") && !method.equals("HEAD")) {
                    return null;
                }
            } else if (code == 401) {
                return this.client.authenticator().authenticate(route, response);
            } else {
                if (code != 503) {
                    if (code != 407) {
                        if (code != 408) {
                            switch (code) {
                                case 300:
                                case 301:
                                case 302:
                                case 303:
                                    break;
                                default:
                                    return null;
                            }
                        } else if (!this.client.retryOnConnectionFailure() || (response.request().body() instanceof UnrepeatableRequestBody)) {
                            return null;
                        } else {
                            if ((response.priorResponse() == null || response.priorResponse().code() != 408) && retryAfter(response, 0) <= 0) {
                                return response.request();
                            }
                            return null;
                        }
                    } else if (route.proxy().type() == Proxy.Type.HTTP) {
                        return this.client.proxyAuthenticator().authenticate(route, response);
                    } else {
                        throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                    }
                } else if ((response.priorResponse() == null || response.priorResponse().code() != 503) && retryAfter(response, Integer.MAX_VALUE) == 0) {
                    return response.request();
                } else {
                    return null;
                }
            }
            if (!this.client.followRedirects() || (header = response.header("Location")) == null || (resolve = response.request().url().resolve(header)) == null) {
                return null;
            }
            if (!resolve.scheme().equals(response.request().url().scheme()) && !this.client.followSslRedirects()) {
                return null;
            }
            Request$Builder newBuilder = response.request().newBuilder();
            if (HttpMethod.permitsRequestBody(method)) {
                boolean redirectsWithBody = HttpMethod.redirectsWithBody(method);
                if (HttpMethod.redirectsToGet(method)) {
                    newBuilder.method("GET", null);
                } else {
                    if (redirectsWithBody) {
                        requestBody = response.request().body();
                    }
                    newBuilder.method(method, requestBody);
                }
                if (!redirectsWithBody) {
                    newBuilder.removeHeader("Transfer-Encoding");
                    newBuilder.removeHeader("Content-Length");
                    newBuilder.removeHeader("Content-Type");
                }
            }
            if (!sameConnection(response, resolve)) {
                newBuilder.removeHeader("Authorization");
            }
            return newBuilder.url(resolve).build();
        }
        throw new IllegalStateException();
    }

    private boolean isRecoverable(IOException iOException, boolean z) {
        if (iOException instanceof ProtocolException) {
            return false;
        }
        if (!(iOException instanceof InterruptedIOException)) {
            return (!(iOException instanceof SSLHandshakeException) || !(iOException.getCause() instanceof CertificateException)) && !(iOException instanceof SSLPeerUnverifiedException);
        }
        boolean z2 = false;
        if (iOException instanceof SocketTimeoutException) {
            z2 = false;
            if (!z) {
                z2 = true;
            }
        }
        return z2;
    }

    private boolean recover(IOException iOException, StreamAllocation streamAllocation, boolean z, Request request) {
        streamAllocation.streamFailed(iOException);
        if (!this.client.retryOnConnectionFailure()) {
            return false;
        }
        return (!z || !requestIsUnrepeatable(iOException, request)) && isRecoverable(iOException, z) && streamAllocation.hasMoreRoutes();
    }

    private boolean requestIsUnrepeatable(IOException iOException, Request request) {
        return (request.body() instanceof UnrepeatableRequestBody) || (iOException instanceof FileNotFoundException);
    }

    private int retryAfter(Response response, int i) {
        String header = response.header("Retry-After");
        if (header == null) {
            return i;
        }
        if (header.matches("\\d+")) {
            return Integer.valueOf(header).intValue();
        }
        return Integer.MAX_VALUE;
    }

    private boolean sameConnection(Response response, HttpUrl httpUrl) {
        HttpUrl url = response.request().url();
        return url.host().equals(httpUrl.host()) && url.port() == httpUrl.port() && url.scheme().equals(httpUrl.scheme());
    }

    public final void cancel() {
        this.canceled = true;
        StreamAllocation streamAllocation = this.streamAllocation;
        if (streamAllocation != null) {
            streamAllocation.cancel();
        }
    }

    public final Response intercept(Interceptor$Chain interceptor$Chain) throws IOException {
        Response response;
        Request request = interceptor$Chain.request();
        RealInterceptorChain realInterceptorChain = (RealInterceptorChain) interceptor$Chain;
        Call call = realInterceptorChain.call();
        EventListener eventListener = realInterceptorChain.eventListener();
        StreamAllocation streamAllocation = new StreamAllocation(this.client.connectionPool(), createAddress(request.url()), call, eventListener, this.callStackTrace);
        this.streamAllocation = streamAllocation;
        Response response2 = null;
        int i = 0;
        Request request2 = request;
        while (!this.canceled) {
            try {
                try {
                    try {
                        Response proceed = realInterceptorChain.proceed(request2, streamAllocation, null, null);
                        response = proceed;
                        if (response2 != null) {
                            response = proceed.newBuilder().priorResponse(response2.newBuilder().body(null).build()).build();
                        }
                    } catch (RouteException e) {
                        if (!recover(e.getLastConnectException(), streamAllocation, false, request2)) {
                            throw e.getFirstConnectException();
                        }
                    }
                } catch (IOException e2) {
                    if (!recover(e2, streamAllocation, !(e2 instanceof ConnectionShutdownException), request2)) {
                        throw e2;
                    }
                }
                try {
                    Request followUpRequest = followUpRequest(response, streamAllocation.route());
                    if (followUpRequest == null) {
                        streamAllocation.release();
                        return response;
                    }
                    Util.closeQuietly(response.body());
                    i++;
                    if (i > 20) {
                        streamAllocation.release();
                        StringBuilder sb = new StringBuilder("Too many follow-up requests: ");
                        sb.append(i);
                        throw new ProtocolException(sb.toString());
                    } else if (!(followUpRequest.body() instanceof UnrepeatableRequestBody)) {
                        if (!sameConnection(response, followUpRequest.url())) {
                            streamAllocation.release();
                            streamAllocation = new StreamAllocation(this.client.connectionPool(), createAddress(followUpRequest.url()), call, eventListener, this.callStackTrace);
                            this.streamAllocation = streamAllocation;
                        } else if (streamAllocation.codec() != null) {
                            StringBuilder sb2 = new StringBuilder("Closing the body of ");
                            sb2.append(response);
                            sb2.append(" didn't close its backing stream. Bad interceptor?");
                            throw new IllegalStateException(sb2.toString());
                        }
                        response2 = response;
                        request2 = followUpRequest;
                    } else {
                        streamAllocation.release();
                        throw new HttpRetryException("Cannot retry streamed HTTP body", response.code());
                    }
                } catch (IOException e3) {
                    streamAllocation.release();
                    throw e3;
                }
            } catch (Throwable th) {
                streamAllocation.streamFailed((IOException) null);
                streamAllocation.release();
                throw th;
            }
        }
        streamAllocation.release();
        throw new IOException("Canceled");
    }

    public final boolean isCanceled() {
        return this.canceled;
    }

    public final void setCallStackTrace(Object obj) {
        this.callStackTrace = obj;
    }

    public final StreamAllocation streamAllocation() {
        return this.streamAllocation;
    }
}
