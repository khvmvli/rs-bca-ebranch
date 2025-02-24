package okhttp3.internal.http;

import javax.annotation.Nullable;
import o.setTookMs;
import okhttp3.MediaType;
import okhttp3.ResponseBody;
/* loaded from: classes2-dex2jar.jar:okhttp3/internal/http/RealResponseBody.class */
public final class RealResponseBody extends ResponseBody {
    private final long contentLength;
    @Nullable
    private final String contentTypeString;
    private final setTookMs source;

    public RealResponseBody(@Nullable String str, long j, setTookMs settookms) {
        this.contentTypeString = str;
        this.contentLength = j;
        this.source = settookms;
    }

    public final long contentLength() {
        return this.contentLength;
    }

    public final MediaType contentType() {
        String str = this.contentTypeString;
        return str != null ? MediaType.parse(str) : null;
    }

    public final setTookMs source() {
        return this.source;
    }
}
