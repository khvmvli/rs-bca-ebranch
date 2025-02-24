package okhttp3;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import o.setResponseContentType;
import o.setTookMs;
import okhttp3.internal.http.HttpHeaders;
/* loaded from: classes-dex2jar.jar:okhttp3/Response.class */
public final class Response implements Closeable {
    @Nullable
    final ResponseBody body;
    @Nullable
    private volatile CacheControl cacheControl;
    @Nullable
    final Response cacheResponse;
    final int code;
    @Nullable
    final Handshake handshake;
    final Headers headers;
    final String message;
    @Nullable
    final Response networkResponse;
    @Nullable
    final Response priorResponse;
    final Protocol protocol;
    final long receivedResponseAtMillis;
    final Request request;
    final long sentRequestAtMillis;

    Response(Builder builder) {
        this.request = builder.request;
        this.protocol = builder.protocol;
        this.code = builder.code;
        this.message = builder.message;
        this.handshake = builder.handshake;
        this.headers = builder.headers.build();
        this.body = builder.body;
        this.networkResponse = builder.networkResponse;
        this.cacheResponse = builder.cacheResponse;
        this.priorResponse = builder.priorResponse;
        this.sentRequestAtMillis = builder.sentRequestAtMillis;
        this.receivedResponseAtMillis = builder.receivedResponseAtMillis;
    }

    @Nullable
    public final ResponseBody body() {
        return this.body;
    }

    public final CacheControl cacheControl() {
        CacheControl cacheControl = this.cacheControl;
        CacheControl cacheControl2 = cacheControl;
        if (cacheControl == null) {
            cacheControl2 = CacheControl.parse(this.headers);
            this.cacheControl = cacheControl2;
        }
        return cacheControl2;
    }

    @Nullable
    public final Response cacheResponse() {
        return this.cacheResponse;
    }

    public final List<Challenge> challenges() {
        String str;
        int i = this.code;
        if (i == 401) {
            str = "WWW-Authenticate";
        } else if (i != 407) {
            return Collections.emptyList();
        } else {
            str = "Proxy-Authenticate";
        }
        return HttpHeaders.parseChallenges(headers(), str);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ResponseBody responseBody = this.body;
        if (responseBody != null) {
            responseBody.close();
            return;
        }
        throw new IllegalStateException("response is not eligible for a body and must not be closed");
    }

    public final int code() {
        return this.code;
    }

    @Nullable
    public final Handshake handshake() {
        return this.handshake;
    }

    @Nullable
    public final String header(String str) {
        return header(str, null);
    }

    @Nullable
    public final String header(String str, @Nullable String str2) {
        String str3 = this.headers.get(str);
        if (str3 != null) {
            str2 = str3;
        }
        return str2;
    }

    public final List<String> headers(String str) {
        return this.headers.values(str);
    }

    public final Headers headers() {
        return this.headers;
    }

    public final boolean isRedirect() {
        int i = this.code;
        if (i == 307 || i == 308) {
            return true;
        }
        switch (i) {
            case 300:
            case 301:
            case 302:
            case 303:
                return true;
            default:
                return false;
        }
    }

    public final boolean isSuccessful() {
        int i = this.code;
        return i >= 200 && i < 300;
    }

    public final String message() {
        return this.message;
    }

    @Nullable
    public final Response networkResponse() {
        return this.networkResponse;
    }

    public final Builder newBuilder() {
        return new Builder(this);
    }

    public final ResponseBody peekBody(long j) throws IOException {
        setTookMs source = this.body.source();
        source.h(j);
        setResponseContentType d = source.c().clone();
        setResponseContentType setresponsecontenttype = d;
        if (d.b > j) {
            setresponsecontenttype = new setResponseContentType();
            setresponsecontenttype.write(d, j);
            try {
                d.f(d.b);
            } catch (EOFException e) {
                throw new AssertionError(e);
            }
        }
        return ResponseBody.create(this.body.contentType(), setresponsecontenttype.b, setresponsecontenttype);
    }

    @Nullable
    public final Response priorResponse() {
        return this.priorResponse;
    }

    public final Protocol protocol() {
        return this.protocol;
    }

    public final long receivedResponseAtMillis() {
        return this.receivedResponseAtMillis;
    }

    public final Request request() {
        return this.request;
    }

    public final long sentRequestAtMillis() {
        return this.sentRequestAtMillis;
    }

    @Override // java.lang.Object
    public final String toString() {
        StringBuilder sb = new StringBuilder("Response{protocol=");
        sb.append(this.protocol);
        sb.append(", code=");
        sb.append(this.code);
        sb.append(", message=");
        sb.append(this.message);
        sb.append(", url=");
        sb.append(this.request.url());
        sb.append('}');
        return sb.toString();
    }
}
