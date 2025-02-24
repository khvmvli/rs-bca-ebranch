package okhttp3;

import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;
import okhttp3.internal.Util;
/* loaded from: classes-dex2jar.jar:okhttp3/Request.class */
public final class Request {
    @Nullable
    final RequestBody body;
    @Nullable
    private volatile CacheControl cacheControl;
    final Headers headers;
    final String method;
    final Map<Class<?>, Object> tags;
    final HttpUrl url;

    Request(Builder builder) {
        this.url = builder.url;
        this.method = builder.method;
        this.headers = builder.headers.build();
        this.body = builder.body;
        this.tags = Util.immutableMap(builder.tags);
    }

    @Nullable
    public final RequestBody body() {
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
    public final String header(String str) {
        return this.headers.get(str);
    }

    public final List<String> headers(String str) {
        return this.headers.values(str);
    }

    public final Headers headers() {
        return this.headers;
    }

    public final boolean isHttps() {
        return this.url.isHttps();
    }

    public final String method() {
        return this.method;
    }

    public final Builder newBuilder() {
        return new Builder(this);
    }

    @Nullable
    public final Object tag() {
        return tag(Object.class);
    }

    @Nullable
    public final <T> T tag(Class<? extends T> cls) {
        return (T) cls.cast(this.tags.get(cls));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Request{method=");
        sb.append(this.method);
        sb.append(", url=");
        sb.append(this.url);
        sb.append(", tags=");
        sb.append(this.tags);
        sb.append('}');
        return sb.toString();
    }

    public final HttpUrl url() {
        return this.url;
    }
}
