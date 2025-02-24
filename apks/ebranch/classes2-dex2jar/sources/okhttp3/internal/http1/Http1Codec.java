package okhttp3.internal.http1;

import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import o.ChuckerDatabase;
import o.defaultInspectorModulesProvider;
import o.initialize;
import o.newInitializerBuilder;
import o.setResponseContentType;
import o.setScheme;
import o.setTookMs;
import o.toHttpHeaderList$com_github_ChuckerTeam_Chucker_library;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.Response$Builder;
import okhttp3.ResponseBody;
import okhttp3.internal.Internal;
import okhttp3.internal.Util;
import okhttp3.internal.connection.RealConnection;
import okhttp3.internal.connection.StreamAllocation;
import okhttp3.internal.http.HttpCodec;
import okhttp3.internal.http.HttpHeaders;
import okhttp3.internal.http.RealResponseBody;
import okhttp3.internal.http.RequestLine;
import okhttp3.internal.http.StatusLine;
/* loaded from: classes2-dex2jar.jar:okhttp3/internal/http1/Http1Codec.class */
public final class Http1Codec implements HttpCodec {
    private static final int HEADER_LIMIT = 262144;
    private static final int STATE_CLOSED = 6;
    private static final int STATE_IDLE = 0;
    private static final int STATE_OPEN_REQUEST_BODY = 1;
    private static final int STATE_OPEN_RESPONSE_BODY = 4;
    private static final int STATE_READING_RESPONSE_BODY = 5;
    private static final int STATE_READ_RESPONSE_HEADERS = 3;
    private static final int STATE_WRITING_REQUEST_BODY = 2;
    final OkHttpClient client;
    final setScheme.com_github_ChuckerTeam_Chucker_library sink;
    final setTookMs source;
    final StreamAllocation streamAllocation;
    int state = 0;
    private long headerLimit = 262144;

    /* loaded from: classes2-dex2jar.jar:okhttp3/internal/http1/Http1Codec$AbstractSource.class */
    abstract class AbstractSource implements defaultInspectorModulesProvider {
        protected long bytesRead;
        protected boolean closed;
        protected final toHttpHeaderList$com_github_ChuckerTeam_Chucker_library timeout;

        private AbstractSource() {
            this.timeout = new toHttpHeaderList$com_github_ChuckerTeam_Chucker_library(Http1Codec.this.source.timeout());
            this.bytesRead = 0;
        }

        protected final void endOfInput(boolean z, IOException iOException) throws IOException {
            if (Http1Codec.this.state != 6) {
                if (Http1Codec.this.state == 5) {
                    Http1Codec.this.detachTimeout(this.timeout);
                    Http1Codec.this.state = 6;
                    if (Http1Codec.this.streamAllocation != null) {
                        Http1Codec.this.streamAllocation.streamFinished(!z, Http1Codec.this, this.bytesRead, iOException);
                        return;
                    }
                    return;
                }
                StringBuilder sb = new StringBuilder("state: ");
                sb.append(Http1Codec.this.state);
                throw new IllegalStateException(sb.toString());
            }
        }

        public long read(setResponseContentType setresponsecontenttype, long j) throws IOException {
            try {
                long read = Http1Codec.this.source.read(setresponsecontenttype, j);
                if (read > 0) {
                    this.bytesRead += read;
                }
                return read;
            } catch (IOException e) {
                endOfInput(false, e);
                throw e;
            }
        }

        public newInitializerBuilder timeout() {
            return this.timeout;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2-dex2jar.jar:okhttp3/internal/http1/Http1Codec$ChunkedSink.class */
    public final class ChunkedSink implements initialize {
        private boolean closed;
        private final toHttpHeaderList$com_github_ChuckerTeam_Chucker_library timeout;

        ChunkedSink() {
            this.timeout = new toHttpHeaderList$com_github_ChuckerTeam_Chucker_library(Http1Codec.this.sink.timeout());
        }

        public final void close() throws IOException {
            synchronized (this) {
                if (!this.closed) {
                    this.closed = true;
                    Http1Codec.this.sink.e("0\r\n\r\n");
                    Http1Codec.this.detachTimeout(this.timeout);
                    Http1Codec.this.state = 3;
                }
            }
        }

        public final void flush() throws IOException {
            synchronized (this) {
                if (!this.closed) {
                    Http1Codec.this.sink.flush();
                }
            }
        }

        public final newInitializerBuilder timeout() {
            return this.timeout;
        }

        public final void write(setResponseContentType setresponsecontenttype, long j) throws IOException {
            if (this.closed) {
                throw new IllegalStateException("closed");
            } else if (j != 0) {
                Http1Codec.this.sink.m(j);
                Http1Codec.this.sink.e("\r\n");
                Http1Codec.this.sink.write(setresponsecontenttype, j);
                Http1Codec.this.sink.e("\r\n");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2-dex2jar.jar:okhttp3/internal/http1/Http1Codec$ChunkedSource.class */
    public class ChunkedSource extends AbstractSource {
        private static final long NO_CHUNK_YET = -1;
        private long bytesRemainingInChunk = NO_CHUNK_YET;
        private boolean hasMoreChunks = true;
        private final HttpUrl url;

        ChunkedSource(HttpUrl httpUrl) {
            super();
            this.url = httpUrl;
        }

        private void readChunkSize() throws IOException {
            if (this.bytesRemainingInChunk != NO_CHUNK_YET) {
                Http1Codec.this.source.r();
            }
            try {
                this.bytesRemainingInChunk = Http1Codec.this.source.m();
                String trim = Http1Codec.this.source.r().trim();
                if (this.bytesRemainingInChunk < 0 || (!trim.isEmpty() && !trim.startsWith(";"))) {
                    StringBuilder sb = new StringBuilder("expected chunk size and optional extensions but was \"");
                    sb.append(this.bytesRemainingInChunk);
                    sb.append(trim);
                    sb.append("\"");
                    throw new ProtocolException(sb.toString());
                } else if (this.bytesRemainingInChunk == 0) {
                    this.hasMoreChunks = false;
                    HttpHeaders.receiveHeaders(Http1Codec.this.client.cookieJar(), this.url, Http1Codec.this.readHeaders());
                    endOfInput(true, null);
                }
            } catch (NumberFormatException e) {
                throw new ProtocolException(e.getMessage());
            }
        }

        public void close() throws IOException {
            if (!this.closed) {
                if (this.hasMoreChunks && !Util.discard(this, 100, TimeUnit.MILLISECONDS)) {
                    endOfInput(false, null);
                }
                this.closed = true;
            }
        }

        @Override // okhttp3.internal.http1.Http1Codec.AbstractSource
        public long read(setResponseContentType setresponsecontenttype, long j) throws IOException {
            if (j < 0) {
                StringBuilder sb = new StringBuilder("byteCount < 0: ");
                sb.append(j);
                throw new IllegalArgumentException(sb.toString());
            } else if (this.closed) {
                throw new IllegalStateException("closed");
            } else if (!this.hasMoreChunks) {
                return NO_CHUNK_YET;
            } else {
                long j2 = this.bytesRemainingInChunk;
                if (j2 == 0 || j2 == NO_CHUNK_YET) {
                    readChunkSize();
                    if (!this.hasMoreChunks) {
                        return NO_CHUNK_YET;
                    }
                }
                long read = read(setresponsecontenttype, Math.min(j, this.bytesRemainingInChunk));
                if (read != NO_CHUNK_YET) {
                    this.bytesRemainingInChunk -= read;
                    return read;
                }
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                endOfInput(false, protocolException);
                throw protocolException;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2-dex2jar.jar:okhttp3/internal/http1/Http1Codec$FixedLengthSink.class */
    public final class FixedLengthSink implements initialize {
        private long bytesRemaining;
        private boolean closed;
        private final toHttpHeaderList$com_github_ChuckerTeam_Chucker_library timeout;

        FixedLengthSink(long j) {
            this.timeout = new toHttpHeaderList$com_github_ChuckerTeam_Chucker_library(Http1Codec.this.sink.timeout());
            this.bytesRemaining = j;
        }

        public final void close() throws IOException {
            if (!this.closed) {
                this.closed = true;
                if (this.bytesRemaining <= 0) {
                    Http1Codec.this.detachTimeout(this.timeout);
                    Http1Codec.this.state = 3;
                    return;
                }
                throw new ProtocolException("unexpected end of stream");
            }
        }

        public final void flush() throws IOException {
            if (!this.closed) {
                Http1Codec.this.sink.flush();
            }
        }

        public final newInitializerBuilder timeout() {
            return this.timeout;
        }

        public final void write(setResponseContentType setresponsecontenttype, long j) throws IOException {
            if (!this.closed) {
                Util.checkOffsetAndCount(setresponsecontenttype.b, 0, j);
                if (j <= this.bytesRemaining) {
                    Http1Codec.this.sink.write(setresponsecontenttype, j);
                    this.bytesRemaining -= j;
                    return;
                }
                StringBuilder sb = new StringBuilder("expected ");
                sb.append(this.bytesRemaining);
                sb.append(" bytes but received ");
                sb.append(j);
                throw new ProtocolException(sb.toString());
            }
            throw new IllegalStateException("closed");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2-dex2jar.jar:okhttp3/internal/http1/Http1Codec$FixedLengthSource.class */
    public class FixedLengthSource extends AbstractSource {
        private long bytesRemaining;

        FixedLengthSource(long j) throws IOException {
            super();
            this.bytesRemaining = j;
            if (j == 0) {
                endOfInput(true, null);
            }
        }

        public void close() throws IOException {
            if (!this.closed) {
                if (this.bytesRemaining != 0 && !Util.discard(this, 100, TimeUnit.MILLISECONDS)) {
                    endOfInput(false, null);
                }
                this.closed = true;
            }
        }

        @Override // okhttp3.internal.http1.Http1Codec.AbstractSource
        public long read(setResponseContentType setresponsecontenttype, long j) throws IOException {
            if (j < 0) {
                StringBuilder sb = new StringBuilder("byteCount < 0: ");
                sb.append(j);
                throw new IllegalArgumentException(sb.toString());
            } else if (!this.closed) {
                long j2 = this.bytesRemaining;
                if (j2 == 0) {
                    return -1;
                }
                long read = read(setresponsecontenttype, Math.min(j2, j));
                if (read != -1) {
                    long j3 = this.bytesRemaining - read;
                    this.bytesRemaining = j3;
                    if (j3 == 0) {
                        endOfInput(true, null);
                    }
                    return read;
                }
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                endOfInput(false, protocolException);
                throw protocolException;
            } else {
                throw new IllegalStateException("closed");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2-dex2jar.jar:okhttp3/internal/http1/Http1Codec$UnknownLengthSource.class */
    public class UnknownLengthSource extends AbstractSource {
        private boolean inputExhausted;

        UnknownLengthSource() {
            super();
        }

        public void close() throws IOException {
            if (!this.closed) {
                if (!this.inputExhausted) {
                    endOfInput(false, null);
                }
                this.closed = true;
            }
        }

        @Override // okhttp3.internal.http1.Http1Codec.AbstractSource
        public long read(setResponseContentType setresponsecontenttype, long j) throws IOException {
            if (j < 0) {
                StringBuilder sb = new StringBuilder("byteCount < 0: ");
                sb.append(j);
                throw new IllegalArgumentException(sb.toString());
            } else if (this.closed) {
                throw new IllegalStateException("closed");
            } else if (this.inputExhausted) {
                return -1;
            } else {
                long read = read(setresponsecontenttype, j);
                if (read != -1) {
                    return read;
                }
                this.inputExhausted = true;
                endOfInput(true, null);
                return -1;
            }
        }
    }

    public Http1Codec(OkHttpClient okHttpClient, StreamAllocation streamAllocation, setTookMs settookms, setScheme.com_github_ChuckerTeam_Chucker_library com_github_chuckerteam_chucker_library) {
        this.client = okHttpClient;
        this.streamAllocation = streamAllocation;
        this.source = settookms;
        this.sink = com_github_chuckerteam_chucker_library;
    }

    private String readHeaderLine() throws IOException {
        String d = this.source.d(this.headerLimit);
        this.headerLimit -= (long) d.length();
        return d;
    }

    @Override // okhttp3.internal.http.HttpCodec
    public final void cancel() {
        RealConnection connection = this.streamAllocation.connection();
        if (connection != null) {
            connection.cancel();
        }
    }

    @Override // okhttp3.internal.http.HttpCodec
    public final initialize createRequestBody(Request request, long j) {
        if ("chunked".equalsIgnoreCase(request.header("Transfer-Encoding"))) {
            return newChunkedSink();
        }
        if (j != -1) {
            return newFixedLengthSink(j);
        }
        throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
    }

    final void detachTimeout(toHttpHeaderList$com_github_ChuckerTeam_Chucker_library tohttpheaderlist_com_github_chuckerteam_chucker_library) {
        newInitializerBuilder newinitializerbuilder = tohttpheaderlist_com_github_chuckerteam_chucker_library.d;
        newInitializerBuilder newinitializerbuilder2 = newInitializerBuilder.NONE;
        if (newinitializerbuilder2 != null) {
            tohttpheaderlist_com_github_chuckerteam_chucker_library.d = newinitializerbuilder2;
            newinitializerbuilder.clearDeadline();
            newinitializerbuilder.clearTimeout();
            return;
        }
        throw new IllegalArgumentException("delegate == null");
    }

    @Override // okhttp3.internal.http.HttpCodec
    public final void finishRequest() throws IOException {
        this.sink.flush();
    }

    @Override // okhttp3.internal.http.HttpCodec
    public final void flushRequest() throws IOException {
        this.sink.flush();
    }

    public final boolean isClosed() {
        return this.state == 6;
    }

    public final initialize newChunkedSink() {
        if (this.state == 1) {
            this.state = 2;
            return new ChunkedSink();
        }
        StringBuilder sb = new StringBuilder("state: ");
        sb.append(this.state);
        throw new IllegalStateException(sb.toString());
    }

    public final defaultInspectorModulesProvider newChunkedSource(HttpUrl httpUrl) throws IOException {
        if (this.state == 4) {
            this.state = 5;
            return new ChunkedSource(httpUrl);
        }
        StringBuilder sb = new StringBuilder("state: ");
        sb.append(this.state);
        throw new IllegalStateException(sb.toString());
    }

    public final initialize newFixedLengthSink(long j) {
        if (this.state == 1) {
            this.state = 2;
            return new FixedLengthSink(j);
        }
        StringBuilder sb = new StringBuilder("state: ");
        sb.append(this.state);
        throw new IllegalStateException(sb.toString());
    }

    public final defaultInspectorModulesProvider newFixedLengthSource(long j) throws IOException {
        if (this.state == 4) {
            this.state = 5;
            return new FixedLengthSource(j);
        }
        StringBuilder sb = new StringBuilder("state: ");
        sb.append(this.state);
        throw new IllegalStateException(sb.toString());
    }

    public final defaultInspectorModulesProvider newUnknownLengthSource() throws IOException {
        if (this.state == 4) {
            StreamAllocation streamAllocation = this.streamAllocation;
            if (streamAllocation != null) {
                this.state = 5;
                streamAllocation.noNewStreams();
                return new UnknownLengthSource();
            }
            throw new IllegalStateException("streamAllocation == null");
        }
        StringBuilder sb = new StringBuilder("state: ");
        sb.append(this.state);
        throw new IllegalStateException(sb.toString());
    }

    @Override // okhttp3.internal.http.HttpCodec
    public final ResponseBody openResponseBody(Response response) throws IOException {
        this.streamAllocation.eventListener.responseBodyStart(this.streamAllocation.call);
        String header = response.header("Content-Type");
        if (!HttpHeaders.hasBody(response)) {
            return new RealResponseBody(header, 0, ChuckerDatabase.b(newFixedLengthSource(0)));
        }
        if ("chunked".equalsIgnoreCase(response.header("Transfer-Encoding"))) {
            return new RealResponseBody(header, -1, ChuckerDatabase.b(newChunkedSource(response.request().url())));
        }
        long contentLength = HttpHeaders.contentLength(response);
        return contentLength != -1 ? new RealResponseBody(header, contentLength, ChuckerDatabase.b(newFixedLengthSource(contentLength))) : new RealResponseBody(header, -1, ChuckerDatabase.b(newUnknownLengthSource()));
    }

    public final Headers readHeaders() throws IOException {
        Headers.Builder builder = new Headers.Builder();
        while (true) {
            String readHeaderLine = readHeaderLine();
            if (readHeaderLine.length() == 0) {
                return builder.build();
            }
            Internal.instance.addLenient(builder, readHeaderLine);
        }
    }

    @Override // okhttp3.internal.http.HttpCodec
    public final Response$Builder readResponseHeaders(boolean z) throws IOException {
        int i = this.state;
        if (i == 1 || i == 3) {
            try {
                StatusLine parse = StatusLine.parse(readHeaderLine());
                Response$Builder headers = new Response$Builder().protocol(parse.protocol).code(parse.code).message(parse.message).headers(readHeaders());
                if (z && parse.code == 100) {
                    return null;
                }
                if (parse.code == 100) {
                    this.state = 3;
                    return headers;
                }
                this.state = 4;
                return headers;
            } catch (EOFException e) {
                StringBuilder sb = new StringBuilder("unexpected end of stream on ");
                sb.append(this.streamAllocation);
                IOException iOException = new IOException(sb.toString());
                iOException.initCause(e);
                throw iOException;
            }
        } else {
            StringBuilder sb2 = new StringBuilder("state: ");
            sb2.append(this.state);
            throw new IllegalStateException(sb2.toString());
        }
    }

    public final void writeRequest(Headers headers, String str) throws IOException {
        if (this.state == 0) {
            this.sink.e(str).e("\r\n");
            int size = headers.size();
            for (int i = 0; i < size; i++) {
                this.sink.e(headers.name(i)).e(": ").e(headers.value(i)).e("\r\n");
            }
            this.sink.e("\r\n");
            this.state = 1;
            return;
        }
        StringBuilder sb = new StringBuilder("state: ");
        sb.append(this.state);
        throw new IllegalStateException(sb.toString());
    }

    @Override // okhttp3.internal.http.HttpCodec
    public final void writeRequestHeaders(Request request) throws IOException {
        writeRequest(request.headers(), RequestLine.get(request, this.streamAllocation.connection().route().proxy().type()));
    }
}
