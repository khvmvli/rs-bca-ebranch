package retrofit2;

import o.setTookMs;
import okhttp3.MediaType;
import okhttp3.ResponseBody;
/* loaded from: classes2-dex2jar.jar:retrofit2/OkHttpCall$NoContentResponseBody.class */
final class OkHttpCall$NoContentResponseBody extends ResponseBody {
    private final long contentLength;
    private final MediaType contentType;

    OkHttpCall$NoContentResponseBody(MediaType mediaType, long j) {
        this.contentType = mediaType;
        this.contentLength = j;
    }

    public final long contentLength() {
        return this.contentLength;
    }

    public final MediaType contentType() {
        return this.contentType;
    }

    public final setTookMs source() {
        throw new IllegalStateException("Cannot read raw response body of a converted body.");
    }
}
