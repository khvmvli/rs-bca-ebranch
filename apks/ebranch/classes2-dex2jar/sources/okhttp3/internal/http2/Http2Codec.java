package okhttp3.internal.http2;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import o.ChuckerDatabase;
import o.defaultInspectorModulesProvider;
import o.initialize;
import o.setResponseContentType;
import o.setResponseMessage;
import o.setResponsePayloadSize;
import okhttp3.Headers;
import okhttp3.Interceptor$Chain;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.Response$Builder;
import okhttp3.ResponseBody;
import okhttp3.internal.Internal;
import okhttp3.internal.Util;
import okhttp3.internal.connection.StreamAllocation;
import okhttp3.internal.http.HttpCodec;
import okhttp3.internal.http.HttpHeaders;
import okhttp3.internal.http.RealResponseBody;
import okhttp3.internal.http.RequestLine;
import okhttp3.internal.http.StatusLine;
/* loaded from: classes2-dex2jar.jar:okhttp3/internal/http2/Http2Codec.class */
public final class Http2Codec implements HttpCodec {
    private final Interceptor$Chain chain;
    private final Http2Connection connection;
    private final Protocol protocol;
    private Http2Stream stream;
    final StreamAllocation streamAllocation;
    private static final String CONNECTION = "connection";
    private static final String HOST = "host";
    private static final String KEEP_ALIVE = "keep-alive";
    private static final String PROXY_CONNECTION = "proxy-connection";
    private static final String TE = "te";
    private static final String TRANSFER_ENCODING = "transfer-encoding";
    private static final String ENCODING = "encoding";
    private static final String UPGRADE = "upgrade";
    private static final List<String> HTTP_2_SKIPPED_REQUEST_HEADERS = Util.immutableList(new String[]{CONNECTION, HOST, KEEP_ALIVE, PROXY_CONNECTION, TE, TRANSFER_ENCODING, ENCODING, UPGRADE, ":method", ":path", ":scheme", ":authority"});
    private static final List<String> HTTP_2_SKIPPED_RESPONSE_HEADERS = Util.immutableList(new String[]{CONNECTION, HOST, KEEP_ALIVE, PROXY_CONNECTION, TE, TRANSFER_ENCODING, ENCODING, UPGRADE});

    /* loaded from: classes2-dex2jar.jar:okhttp3/internal/http2/Http2Codec$StreamFinishingSource.class */
    class StreamFinishingSource extends setResponsePayloadSize {
        boolean completed = false;
        long bytesRead = 0;

        StreamFinishingSource(defaultInspectorModulesProvider defaultinspectormodulesprovider) {
            super(defaultinspectormodulesprovider);
        }

        private void endOfInput(IOException iOException) {
            if (!this.completed) {
                this.completed = true;
                Http2Codec.this.streamAllocation.streamFinished(false, Http2Codec.this, this.bytesRead, iOException);
            }
        }

        @Override // o.setResponsePayloadSize
        public void close() throws IOException {
            close();
            endOfInput(null);
        }

        @Override // o.setResponsePayloadSize
        public long read(setResponseContentType setresponsecontenttype, long j) throws IOException {
            try {
                long read = delegate().read(setresponsecontenttype, j);
                if (read > 0) {
                    this.bytesRead += read;
                }
                return read;
            } catch (IOException e) {
                endOfInput(e);
                throw e;
            }
        }
    }

    public Http2Codec(OkHttpClient okHttpClient, Interceptor$Chain interceptor$Chain, StreamAllocation streamAllocation, Http2Connection http2Connection) {
        this.chain = interceptor$Chain;
        this.streamAllocation = streamAllocation;
        this.connection = http2Connection;
        this.protocol = okHttpClient.protocols().contains(Protocol.H2_PRIOR_KNOWLEDGE) ? Protocol.H2_PRIOR_KNOWLEDGE : Protocol.HTTP_2;
    }

    public static List<Header> http2HeadersList(Request request) {
        Headers headers = request.headers();
        ArrayList arrayList = new ArrayList(headers.size() + 4);
        arrayList.add(new Header(Header.TARGET_METHOD, request.method()));
        arrayList.add(new Header(Header.TARGET_PATH, RequestLine.requestPath(request.url())));
        String header = request.header("Host");
        if (header != null) {
            arrayList.add(new Header(Header.TARGET_AUTHORITY, header));
        }
        arrayList.add(new Header(Header.TARGET_SCHEME, request.url().scheme()));
        int size = headers.size();
        for (int i = 0; i < size; i++) {
            setResponseMessage a = setResponseMessage.a(headers.name(i).toLowerCase(Locale.US));
            if (!HTTP_2_SKIPPED_REQUEST_HEADERS.contains(a.j())) {
                arrayList.add(new Header(a, headers.value(i)));
            }
        }
        return arrayList;
    }

    public static Response$Builder readHttp2HeadersList(Headers headers, Protocol protocol) throws IOException {
        Headers.Builder builder = new Headers.Builder();
        int size = headers.size();
        StatusLine statusLine = null;
        for (int i = 0; i < size; i++) {
            String name = headers.name(i);
            String value = headers.value(i);
            if (name.equals(":status")) {
                StringBuilder sb = new StringBuilder("HTTP/1.1 ");
                sb.append(value);
                statusLine = StatusLine.parse(sb.toString());
            } else {
                statusLine = statusLine;
                if (!HTTP_2_SKIPPED_RESPONSE_HEADERS.contains(name)) {
                    Internal.instance.addLenient(builder, name, value);
                    statusLine = statusLine;
                }
            }
        }
        if (statusLine != null) {
            return new Response$Builder().protocol(protocol).code(statusLine.code).message(statusLine.message).headers(builder.build());
        }
        throw new ProtocolException("Expected ':status' header not present");
    }

    @Override // okhttp3.internal.http.HttpCodec
    public final void cancel() {
        Http2Stream http2Stream = this.stream;
        if (http2Stream != null) {
            http2Stream.closeLater(ErrorCode.CANCEL);
        }
    }

    @Override // okhttp3.internal.http.HttpCodec
    public final initialize createRequestBody(Request request, long j) {
        return this.stream.getSink();
    }

    @Override // okhttp3.internal.http.HttpCodec
    public final void finishRequest() throws IOException {
        this.stream.getSink().close();
    }

    @Override // okhttp3.internal.http.HttpCodec
    public final void flushRequest() throws IOException {
        this.connection.flush();
    }

    @Override // okhttp3.internal.http.HttpCodec
    public final ResponseBody openResponseBody(Response response) throws IOException {
        this.streamAllocation.eventListener.responseBodyStart(this.streamAllocation.call);
        return new RealResponseBody(response.header("Content-Type"), HttpHeaders.contentLength(response), ChuckerDatabase.b((defaultInspectorModulesProvider) new StreamFinishingSource(this.stream.getSource())));
    }

    @Override // okhttp3.internal.http.HttpCodec
    public final Response$Builder readResponseHeaders(boolean z) throws IOException {
        Response$Builder readHttp2HeadersList = readHttp2HeadersList(this.stream.takeHeaders(), this.protocol);
        if (!z || Internal.instance.code(readHttp2HeadersList) != 100) {
            return readHttp2HeadersList;
        }
        return null;
    }

    @Override // okhttp3.internal.http.HttpCodec
    public final void writeRequestHeaders(Request request) throws IOException {
        if (this.stream == null) {
            Http2Stream newStream = this.connection.newStream(http2HeadersList(request), request.body() != null);
            this.stream = newStream;
            newStream.readTimeout().timeout((long) this.chain.readTimeoutMillis(), TimeUnit.MILLISECONDS);
            this.stream.writeTimeout().timeout((long) this.chain.writeTimeoutMillis(), TimeUnit.MILLISECONDS);
        }
    }
}
