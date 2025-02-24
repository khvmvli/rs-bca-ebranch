package okhttp3;

import java.net.URL;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.Nullable;
import okhttp3.Headers;
import okhttp3.internal.Util;
import okhttp3.internal.http.HttpMethod;
/* loaded from: classes2-dex2jar.jar:okhttp3/Request$Builder.class */
public class Request$Builder {
    @Nullable
    RequestBody body;
    Headers.Builder headers;
    String method;
    Map<Class<?>, Object> tags;
    @Nullable
    HttpUrl url;

    public Request$Builder() {
        this.tags = Collections.emptyMap();
        this.method = "GET";
        this.headers = new Headers.Builder();
    }

    Request$Builder(Request request) {
        this.tags = Collections.emptyMap();
        this.url = request.url;
        this.method = request.method;
        this.body = request.body;
        this.tags = request.tags.isEmpty() ? Collections.emptyMap() : new LinkedHashMap<>(request.tags);
        this.headers = request.headers.newBuilder();
    }

    public Request$Builder addHeader(String str, String str2) {
        this.headers.add(str, str2);
        return this;
    }

    public Request build() {
        if (this.url != null) {
            return new Request(this);
        }
        throw new IllegalStateException("url == null");
    }

    public Request$Builder cacheControl(CacheControl cacheControl) {
        String obj = cacheControl.toString();
        return obj.isEmpty() ? removeHeader("Cache-Control") : header("Cache-Control", obj);
    }

    public Request$Builder delete() {
        return delete(Util.EMPTY_REQUEST);
    }

    public Request$Builder delete(@Nullable RequestBody requestBody) {
        return method("DELETE", requestBody);
    }

    public Request$Builder get() {
        return method("GET", null);
    }

    public Request$Builder head() {
        return method("HEAD", null);
    }

    public Request$Builder header(String str, String str2) {
        this.headers.set(str, str2);
        return this;
    }

    public Request$Builder headers(Headers headers) {
        this.headers = headers.newBuilder();
        return this;
    }

    public Request$Builder method(String str, @Nullable RequestBody requestBody) {
        if (str == null) {
            throw new NullPointerException("method == null");
        } else if (str.length() == 0) {
            throw new IllegalArgumentException("method.length() == 0");
        } else if (requestBody != null && !HttpMethod.permitsRequestBody(str)) {
            StringBuilder sb = new StringBuilder("method ");
            sb.append(str);
            sb.append(" must not have a request body.");
            throw new IllegalArgumentException(sb.toString());
        } else if (requestBody != null || !HttpMethod.requiresRequestBody(str)) {
            this.method = str;
            this.body = requestBody;
            return this;
        } else {
            StringBuilder sb2 = new StringBuilder("method ");
            sb2.append(str);
            sb2.append(" must have a request body.");
            throw new IllegalArgumentException(sb2.toString());
        }
    }

    public Request$Builder patch(RequestBody requestBody) {
        return method("PATCH", requestBody);
    }

    public Request$Builder post(RequestBody requestBody) {
        return method("POST", requestBody);
    }

    public Request$Builder put(RequestBody requestBody) {
        return method("PUT", requestBody);
    }

    public Request$Builder removeHeader(String str) {
        this.headers.removeAll(str);
        return this;
    }

    public <T> Request$Builder tag(Class<? super T> cls, @Nullable T t) {
        if (cls != null) {
            if (t == null) {
                this.tags.remove(cls);
            } else {
                if (this.tags.isEmpty()) {
                    this.tags = new LinkedHashMap();
                }
                this.tags.put(cls, cls.cast(t));
            }
            return this;
        }
        throw new NullPointerException("type == null");
    }

    public Request$Builder tag(@Nullable Object obj) {
        return tag(Object.class, obj);
    }

    public Request$Builder url(String str) {
        String str2;
        if (str != null) {
            if (str.regionMatches(true, 0, "ws:", 0, 3)) {
                StringBuilder sb = new StringBuilder("http:");
                sb.append(str.substring(3));
                str2 = sb.toString();
            } else {
                str2 = str;
                if (str.regionMatches(true, 0, "wss:", 0, 4)) {
                    StringBuilder sb2 = new StringBuilder("https:");
                    sb2.append(str.substring(4));
                    str2 = sb2.toString();
                }
            }
            return url(HttpUrl.get(str2));
        }
        throw new NullPointerException("url == null");
    }

    public Request$Builder url(URL url) {
        if (url != null) {
            return url(HttpUrl.get(url.toString()));
        }
        throw new NullPointerException("url == null");
    }

    public Request$Builder url(HttpUrl httpUrl) {
        if (httpUrl != null) {
            this.url = httpUrl;
            return this;
        }
        throw new NullPointerException("url == null");
    }
}
