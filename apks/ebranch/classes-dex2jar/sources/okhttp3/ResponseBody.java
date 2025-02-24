package okhttp3;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.nio.charset.Charset;
import javax.annotation.Nullable;
import o.setResponseContentType;
import o.setResponseMessage;
import o.setTookMs;
import okhttp3.internal.Util;
/* loaded from: classes-dex2jar.jar:okhttp3/ResponseBody.class */
public abstract class ResponseBody implements Closeable {
    @Nullable
    private Reader reader;

    private Charset charset() {
        MediaType contentType = contentType();
        return contentType != null ? contentType.charset(Util.UTF_8) : Util.UTF_8;
    }

    public static ResponseBody create(@Nullable final MediaType mediaType, final long j, final setTookMs settookms) {
        if (settookms != null) {
            return new ResponseBody() { // from class: okhttp3.ResponseBody.1
                @Override // okhttp3.ResponseBody
                public long contentLength() {
                    return j;
                }

                @Override // okhttp3.ResponseBody
                @Nullable
                public MediaType contentType() {
                    return mediaType;
                }

                @Override // okhttp3.ResponseBody
                public setTookMs source() {
                    return settookms;
                }
            };
        }
        throw new NullPointerException("source == null");
    }

    public static ResponseBody create(@Nullable MediaType mediaType, String str) {
        Charset charset = Util.UTF_8;
        MediaType mediaType2 = mediaType;
        if (mediaType != null) {
            Charset charset2 = mediaType.charset();
            charset = charset2;
            mediaType2 = mediaType;
            if (charset2 == null) {
                charset = Util.UTF_8;
                StringBuilder sb = new StringBuilder();
                sb.append(mediaType);
                sb.append("; charset=utf-8");
                mediaType2 = MediaType.parse(sb.toString());
            }
        }
        setResponseContentType a = new setResponseContentType().a(str, 0, str.length(), charset);
        return create(mediaType2, a.b, a);
    }

    public static ResponseBody create(@Nullable MediaType mediaType, setResponseMessage setresponsemessage) {
        setResponseContentType setresponsecontenttype = new setResponseContentType();
        if (setresponsemessage != null) {
            setresponsemessage.c(setresponsecontenttype);
            return create(mediaType, (long) setresponsemessage.g(), setresponsecontenttype);
        }
        throw new IllegalArgumentException("byteString == null");
    }

    public static ResponseBody create(@Nullable MediaType mediaType, byte[] bArr) {
        setResponseContentType setresponsecontenttype = new setResponseContentType();
        if (bArr != null) {
            return create(mediaType, (long) bArr.length, setresponsecontenttype.a(bArr, 0, bArr.length));
        }
        throw new IllegalArgumentException("source == null");
    }

    public final InputStream byteStream() {
        return source().h();
    }

    /* JADX WARN: Finally extract failed */
    public final byte[] bytes() throws IOException {
        long contentLength = contentLength();
        if (contentLength <= 2147483647L) {
            setTookMs source = source();
            try {
                byte[] l = source.l();
                Util.closeQuietly(source);
                if (contentLength == -1 || contentLength == ((long) l.length)) {
                    return l;
                }
                StringBuilder sb = new StringBuilder("Content-Length (");
                sb.append(contentLength);
                sb.append(") and stream length (");
                sb.append(l.length);
                sb.append(") disagree");
                throw new IOException(sb.toString());
            } catch (Throwable th) {
                Util.closeQuietly(source);
                throw th;
            }
        } else {
            StringBuilder sb2 = new StringBuilder("Cannot buffer entire body for content length: ");
            sb2.append(contentLength);
            throw new IOException(sb2.toString());
        }
    }

    public final Reader charStream() {
        BomAwareReader bomAwareReader = this.reader;
        BomAwareReader bomAwareReader2 = bomAwareReader;
        if (bomAwareReader == null) {
            bomAwareReader2 = new BomAwareReader(source(), charset());
            this.reader = bomAwareReader2;
        }
        return bomAwareReader2;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        Util.closeQuietly(source());
    }

    public abstract long contentLength();

    @Nullable
    public abstract MediaType contentType();

    public abstract setTookMs source();

    public final String string() throws IOException {
        setTookMs source = source();
        try {
            return source.a(Util.bomAwareCharset(source, charset()));
        } finally {
            Util.closeQuietly(source);
        }
    }
}
