package okhttp3;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import javax.annotation.Nullable;
import o.setTookMs;
import okhttp3.internal.Util;
/* loaded from: classes2-dex2jar.jar:okhttp3/ResponseBody$BomAwareReader.class */
final class ResponseBody$BomAwareReader extends Reader {
    private final Charset charset;
    private boolean closed;
    @Nullable
    private Reader delegate;
    private final setTookMs source;

    ResponseBody$BomAwareReader(setTookMs settookms, Charset charset) {
        this.source = settookms;
        this.charset = charset;
    }

    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.closed = true;
        Reader reader = this.delegate;
        if (reader != null) {
            reader.close();
        } else {
            this.source.close();
        }
    }

    @Override // java.io.Reader
    public final int read(char[] cArr, int i, int i2) throws IOException {
        if (!this.closed) {
            Reader reader = this.delegate;
            Reader reader2 = reader;
            if (reader == null) {
                reader2 = new InputStreamReader(this.source.h(), Util.bomAwareCharset(this.source, this.charset));
                this.delegate = reader2;
            }
            return reader2.read(cArr, i, i2);
        }
        throw new IOException("Stream closed");
    }
}
