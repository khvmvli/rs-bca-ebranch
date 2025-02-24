package okhttp3.internal.http;

import java.io.IOException;
import java.net.ProtocolException;
import o.ChuckerDatabase;
import o.initialize;
import o.setResponseContentType;
import o.setResponseTlsVersion;
import o.setScheme;
import okhttp3.Interceptor;
import okhttp3.Interceptor$Chain;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.Response$Builder;
import okhttp3.internal.Util;
import okhttp3.internal.connection.RealConnection;
import okhttp3.internal.connection.StreamAllocation;
/* loaded from: classes2-dex2jar.jar:okhttp3/internal/http/CallServerInterceptor.class */
public final class CallServerInterceptor implements Interceptor {
    private final boolean forWebSocket;

    /* loaded from: classes2-dex2jar.jar:okhttp3/internal/http/CallServerInterceptor$CountingSink.class */
    static final class CountingSink extends setResponseTlsVersion {
        long successfulCount;

        CountingSink(initialize initialize) {
            super(initialize);
        }

        @Override // o.setResponseTlsVersion
        public final void write(setResponseContentType setresponsecontenttype, long j) throws IOException {
            write(setresponsecontenttype, j);
            this.successfulCount += j;
        }
    }

    public CallServerInterceptor(boolean z) {
        this.forWebSocket = z;
    }

    public final Response intercept(Interceptor$Chain interceptor$Chain) throws IOException {
        RealInterceptorChain realInterceptorChain = (RealInterceptorChain) interceptor$Chain;
        HttpCodec httpStream = realInterceptorChain.httpStream();
        StreamAllocation streamAllocation = realInterceptorChain.streamAllocation();
        RealConnection connection = realInterceptorChain.connection();
        Request request = realInterceptorChain.request();
        long currentTimeMillis = System.currentTimeMillis();
        realInterceptorChain.eventListener().requestHeadersStart(realInterceptorChain.call());
        httpStream.writeRequestHeaders(request);
        realInterceptorChain.eventListener().requestHeadersEnd(realInterceptorChain.call(), request);
        Response$Builder response$Builder = null;
        Response$Builder response$Builder2 = null;
        if (HttpMethod.permitsRequestBody(request.method())) {
            response$Builder2 = null;
            if (request.body() != null) {
                if ("100-continue".equalsIgnoreCase(request.header("Expect"))) {
                    httpStream.flushRequest();
                    realInterceptorChain.eventListener().responseHeadersStart(realInterceptorChain.call());
                    response$Builder = httpStream.readResponseHeaders(true);
                }
                if (response$Builder == null) {
                    realInterceptorChain.eventListener().requestBodyStart(realInterceptorChain.call());
                    CountingSink countingSink = new CountingSink(httpStream.createRequestBody(request, request.body().contentLength()));
                    setScheme.com_github_ChuckerTeam_Chucker_library d = ChuckerDatabase.d((initialize) countingSink);
                    request.body().writeTo(d);
                    d.close();
                    realInterceptorChain.eventListener().requestBodyEnd(realInterceptorChain.call(), countingSink.successfulCount);
                    response$Builder2 = response$Builder;
                } else {
                    response$Builder2 = response$Builder;
                    if (!connection.isMultiplexed()) {
                        streamAllocation.noNewStreams();
                        response$Builder2 = response$Builder;
                    }
                }
            }
        }
        httpStream.finishRequest();
        Response$Builder response$Builder3 = response$Builder2;
        if (response$Builder2 == null) {
            realInterceptorChain.eventListener().responseHeadersStart(realInterceptorChain.call());
            response$Builder3 = httpStream.readResponseHeaders(false);
        }
        Response build = response$Builder3.request(request).handshake(streamAllocation.connection().handshake()).sentRequestAtMillis(currentTimeMillis).receivedResponseAtMillis(System.currentTimeMillis()).build();
        int code = build.code();
        int i = code;
        if (code == 100) {
            build = httpStream.readResponseHeaders(false).request(request).handshake(streamAllocation.connection().handshake()).sentRequestAtMillis(currentTimeMillis).receivedResponseAtMillis(System.currentTimeMillis()).build();
            i = build.code();
        }
        realInterceptorChain.eventListener().responseHeadersEnd(realInterceptorChain.call(), build);
        Response build2 = (!this.forWebSocket || i != 101) ? build.newBuilder().body(httpStream.openResponseBody(build)).build() : build.newBuilder().body(Util.EMPTY_RESPONSE).build();
        if ("close".equalsIgnoreCase(build2.request().header("Connection")) || "close".equalsIgnoreCase(build2.header("Connection"))) {
            streamAllocation.noNewStreams();
        }
        if ((i != 204 && i != 205) || build2.body().contentLength() <= 0) {
            return build2;
        }
        StringBuilder sb = new StringBuilder("HTTP ");
        sb.append(i);
        sb.append(" had non-zero Content-Length: ");
        sb.append(build2.body().contentLength());
        throw new ProtocolException(sb.toString());
    }
}
