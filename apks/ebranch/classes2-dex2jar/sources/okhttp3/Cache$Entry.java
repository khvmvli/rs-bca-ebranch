package okhttp3;

import java.io.IOException;
import java.io.InputStream;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import o.ChuckerDatabase;
import o.defaultInspectorModulesProvider;
import o.setResponseContentType;
import o.setResponseMessage;
import o.setScheme;
import o.setTookMs;
import okhttp3.Headers;
import okhttp3.internal.cache.DiskLruCache;
import okhttp3.internal.cache.DiskLruCache$Snapshot;
import okhttp3.internal.http.HttpHeaders;
import okhttp3.internal.http.StatusLine;
import okhttp3.internal.platform.Platform;
/* loaded from: classes2-dex2jar.jar:okhttp3/Cache$Entry.class */
final class Cache$Entry {
    private static final String RECEIVED_MILLIS;
    private static final String SENT_MILLIS;
    private final int code;
    @Nullable
    private final Handshake handshake;
    private final String message;
    private final Protocol protocol;
    private final long receivedResponseMillis;
    private final String requestMethod;
    private final Headers responseHeaders;
    private final long sentRequestMillis;
    private final String url;
    private final Headers varyHeaders;

    static {
        StringBuilder sb = new StringBuilder();
        sb.append(Platform.get().getPrefix());
        sb.append("-Sent-Millis");
        SENT_MILLIS = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(Platform.get().getPrefix());
        sb2.append("-Received-Millis");
        RECEIVED_MILLIS = sb2.toString();
    }

    Cache$Entry(defaultInspectorModulesProvider defaultinspectormodulesprovider) throws IOException {
        try {
            setTookMs b = ChuckerDatabase.b(defaultinspectormodulesprovider);
            this.url = b.r();
            this.requestMethod = b.r();
            Headers.Builder builder = new Headers.Builder();
            int readInt = Cache.readInt(b);
            for (int i = 0; i < readInt; i++) {
                builder.addLenient(b.r());
            }
            this.varyHeaders = builder.build();
            StatusLine parse = StatusLine.parse(b.r());
            this.protocol = parse.protocol;
            this.code = parse.code;
            this.message = parse.message;
            Headers.Builder builder2 = new Headers.Builder();
            int readInt2 = Cache.readInt(b);
            for (int i2 = 0; i2 < readInt2; i2++) {
                builder2.addLenient(b.r());
            }
            String str = SENT_MILLIS;
            String str2 = builder2.get(str);
            String str3 = RECEIVED_MILLIS;
            String str4 = builder2.get(str3);
            builder2.removeAll(str);
            builder2.removeAll(str3);
            long j = 0;
            this.sentRequestMillis = str2 != null ? Long.parseLong(str2) : 0;
            this.receivedResponseMillis = str4 != null ? Long.parseLong(str4) : j;
            this.responseHeaders = builder2.build();
            if (isHttps()) {
                String r = b.r();
                if (r.length() <= 0) {
                    this.handshake = Handshake.get(!b.f() ? TlsVersion.forJavaName(b.r()) : TlsVersion.SSL_3_0, CipherSuite.forJavaName(b.r()), readCertificateList(b), readCertificateList(b));
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("expected \"\" but was \"");
                    sb.append(r);
                    sb.append("\"");
                    throw new IOException(sb.toString());
                }
            } else {
                this.handshake = null;
            }
        } finally {
            defaultinspectormodulesprovider.close();
        }
    }

    Cache$Entry(Response response) {
        this.url = response.request().url().toString();
        this.varyHeaders = HttpHeaders.varyHeaders(response);
        this.requestMethod = response.request().method();
        this.protocol = response.protocol();
        this.code = response.code();
        this.message = response.message();
        this.responseHeaders = response.headers();
        this.handshake = response.handshake();
        this.sentRequestMillis = response.sentRequestAtMillis();
        this.receivedResponseMillis = response.receivedResponseAtMillis();
    }

    private boolean isHttps() {
        return this.url.startsWith("https://");
    }

    private List<Certificate> readCertificateList(setTookMs settookms) throws IOException {
        int readInt = Cache.readInt(settookms);
        if (readInt == -1) {
            return Collections.emptyList();
        }
        try {
            CertificateFactory instance = CertificateFactory.getInstance("X.509");
            ArrayList arrayList = new ArrayList(readInt);
            for (int i = 0; i < readInt; i++) {
                String r = settookms.r();
                setResponseContentType setresponsecontenttype = new setResponseContentType();
                setResponseMessage d = setResponseMessage.d(r);
                if (d != null) {
                    d.c(setresponsecontenttype);
                    arrayList.add(instance.generateCertificate(new InputStream(setresponsecontenttype) { // from class: o.setResponseContentType$1
                        final /* synthetic */ setResponseContentType d;

                        {
                            this.d = r4;
                        }

                        @Override // java.io.InputStream
                        public final int available() {
                            return (int) Math.min(this.d.b, 2147483647L);
                        }

                        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
                        public final void close() {
                        }

                        @Override // java.io.InputStream
                        public final int read() {
                            if (this.d.b > 0) {
                                return this.d.i() & 255;
                            }
                            return -1;
                        }

                        @Override // java.io.InputStream
                        public final int read(byte[] bArr, int i2, int i3) {
                            return this.d.c(bArr, i2, i3);
                        }

                        @Override // java.lang.Object
                        public final String toString() {
                            StringBuilder sb = new StringBuilder();
                            sb.append(this.d);
                            sb.append(".inputStream()");
                            return sb.toString();
                        }
                    }));
                } else {
                    throw new IllegalArgumentException("byteString == null");
                }
            }
            return arrayList;
        } catch (CertificateException e) {
            throw new IOException(e.getMessage());
        }
    }

    private void writeCertList(setScheme.com_github_ChuckerTeam_Chucker_library com_github_chuckerteam_chucker_library, List<Certificate> list) throws IOException {
        try {
            com_github_chuckerteam_chucker_library.j((long) list.size()).e(10);
            int size = list.size();
            for (int i = 0; i < size; i++) {
                com_github_chuckerteam_chucker_library.e(setResponseMessage.d(list.get(i).getEncoded()).c()).e(10);
            }
        } catch (CertificateEncodingException e) {
            throw new IOException(e.getMessage());
        }
    }

    public final boolean matches(Request request, Response response) {
        return this.url.equals(request.url().toString()) && this.requestMethod.equals(request.method()) && HttpHeaders.varyMatches(response, this.varyHeaders, request);
    }

    public final Response response(DiskLruCache$Snapshot diskLruCache$Snapshot) {
        String str = this.responseHeaders.get("Content-Type");
        String str2 = this.responseHeaders.get("Content-Length");
        return new Response$Builder().request(new Request$Builder().url(this.url).method(this.requestMethod, null).headers(this.varyHeaders).build()).protocol(this.protocol).code(this.code).message(this.message).headers(this.responseHeaders).body(new Cache$CacheResponseBody(diskLruCache$Snapshot, str, str2)).handshake(this.handshake).sentRequestAtMillis(this.sentRequestMillis).receivedResponseAtMillis(this.receivedResponseMillis).build();
    }

    public final void writeTo(DiskLruCache.Editor editor) throws IOException {
        setScheme.com_github_ChuckerTeam_Chucker_library d = ChuckerDatabase.d(editor.newSink(0));
        d.e(this.url).e(10);
        d.e(this.requestMethod).e(10);
        d.j((long) this.varyHeaders.size()).e(10);
        int size = this.varyHeaders.size();
        for (int i = 0; i < size; i++) {
            d.e(this.varyHeaders.name(i)).e(": ").e(this.varyHeaders.value(i)).e(10);
        }
        d.e(new StatusLine(this.protocol, this.code, this.message).toString()).e(10);
        d.j((long) (this.responseHeaders.size() + 2)).e(10);
        int size2 = this.responseHeaders.size();
        for (int i2 = 0; i2 < size2; i2++) {
            d.e(this.responseHeaders.name(i2)).e(": ").e(this.responseHeaders.value(i2)).e(10);
        }
        d.e(SENT_MILLIS).e(": ").j(this.sentRequestMillis).e(10);
        d.e(RECEIVED_MILLIS).e(": ").j(this.receivedResponseMillis).e(10);
        if (isHttps()) {
            d.e(10);
            d.e(this.handshake.cipherSuite().javaName()).e(10);
            writeCertList(d, this.handshake.peerCertificates());
            writeCertList(d, this.handshake.localCertificates());
            d.e(this.handshake.tlsVersion().javaName()).e(10);
        }
        d.close();
    }
}
