package okhttp3;

import javax.annotation.Nullable;
import okhttp3.Headers;
/* loaded from: classes2-dex2jar.jar:okhttp3/Response$Builder.class */
public class Response$Builder {
    @Nullable
    ResponseBody body;
    @Nullable
    Response cacheResponse;
    int code;
    @Nullable
    Handshake handshake;
    Headers.Builder headers;
    String message;
    @Nullable
    Response networkResponse;
    @Nullable
    Response priorResponse;
    @Nullable
    Protocol protocol;
    long receivedResponseAtMillis;
    @Nullable
    Request request;
    long sentRequestAtMillis;

    public Response$Builder() {
        this.code = -1;
        this.headers = new Headers.Builder();
    }

    Response$Builder(Response response) {
        this.code = -1;
        this.request = response.request;
        this.protocol = response.protocol;
        this.code = response.code;
        this.message = response.message;
        this.handshake = response.handshake;
        this.headers = response.headers.newBuilder();
        this.body = response.body;
        this.networkResponse = response.networkResponse;
        this.cacheResponse = response.cacheResponse;
        this.priorResponse = response.priorResponse;
        this.sentRequestAtMillis = response.sentRequestAtMillis;
        this.receivedResponseAtMillis = response.receivedResponseAtMillis;
    }

    private void checkPriorResponse(Response response) {
        if (response.body != null) {
            throw new IllegalArgumentException("priorResponse.body != null");
        }
    }

    private void checkSupportResponse(String str, Response response) {
        if (response.body != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(".body != null");
            throw new IllegalArgumentException(sb.toString());
        } else if (response.networkResponse != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append(".networkResponse != null");
            throw new IllegalArgumentException(sb2.toString());
        } else if (response.cacheResponse != null) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(str);
            sb3.append(".cacheResponse != null");
            throw new IllegalArgumentException(sb3.toString());
        } else if (response.priorResponse != null) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(str);
            sb4.append(".priorResponse != null");
            throw new IllegalArgumentException(sb4.toString());
        }
    }

    public Response$Builder addHeader(String str, String str2) {
        this.headers.add(str, str2);
        return this;
    }

    public Response$Builder body(@Nullable ResponseBody responseBody) {
        this.body = responseBody;
        return this;
    }

    public Response build() {
        if (this.request == null) {
            throw new IllegalStateException("request == null");
        } else if (this.protocol == null) {
            throw new IllegalStateException("protocol == null");
        } else if (this.code < 0) {
            StringBuilder sb = new StringBuilder("code < 0: ");
            sb.append(this.code);
            throw new IllegalStateException(sb.toString());
        } else if (this.message != null) {
            return new Response(this);
        } else {
            throw new IllegalStateException("message == null");
        }
    }

    public Response$Builder cacheResponse(@Nullable Response response) {
        if (response != null) {
            checkSupportResponse("cacheResponse", response);
        }
        this.cacheResponse = response;
        return this;
    }

    public Response$Builder code(int i) {
        this.code = i;
        return this;
    }

    public Response$Builder handshake(@Nullable Handshake handshake) {
        this.handshake = handshake;
        return this;
    }

    public Response$Builder header(String str, String str2) {
        this.headers.set(str, str2);
        return this;
    }

    public Response$Builder headers(Headers headers) {
        this.headers = headers.newBuilder();
        return this;
    }

    public Response$Builder message(String str) {
        this.message = str;
        return this;
    }

    public Response$Builder networkResponse(@Nullable Response response) {
        if (response != null) {
            checkSupportResponse("networkResponse", response);
        }
        this.networkResponse = response;
        return this;
    }

    public Response$Builder priorResponse(@Nullable Response response) {
        if (response != null) {
            checkPriorResponse(response);
        }
        this.priorResponse = response;
        return this;
    }

    public Response$Builder protocol(Protocol protocol) {
        this.protocol = protocol;
        return this;
    }

    public Response$Builder receivedResponseAtMillis(long j) {
        this.receivedResponseAtMillis = j;
        return this;
    }

    public Response$Builder removeHeader(String str) {
        this.headers.removeAll(str);
        return this;
    }

    public Response$Builder request(Request request) {
        this.request = request;
        return this;
    }

    public Response$Builder sentRequestAtMillis(long j) {
        this.sentRequestAtMillis = j;
        return this;
    }
}
