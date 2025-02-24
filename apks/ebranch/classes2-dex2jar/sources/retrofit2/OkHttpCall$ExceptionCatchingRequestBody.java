package retrofit2;

import java.io.IOException;
import o.ChuckerDatabase;
import o.defaultInspectorModulesProvider;
import o.setResponseContentType;
import o.setResponsePayloadSize;
import o.setTookMs;
import okhttp3.MediaType;
import okhttp3.ResponseBody;
/* loaded from: classes2-dex2jar.jar:retrofit2/OkHttpCall$ExceptionCatchingRequestBody.class */
final class OkHttpCall$ExceptionCatchingRequestBody extends ResponseBody {
    private final ResponseBody delegate;
    IOException thrownException;

    OkHttpCall$ExceptionCatchingRequestBody(ResponseBody responseBody) {
        this.delegate = responseBody;
    }

    public final void close() {
        this.delegate.close();
    }

    public final long contentLength() {
        return this.delegate.contentLength();
    }

    public final MediaType contentType() {
        return this.delegate.contentType();
    }

    public final setTookMs source() {
        return ChuckerDatabase.b((defaultInspectorModulesProvider) new setResponsePayloadSize(this.delegate.source()) { // from class: retrofit2.OkHttpCall$ExceptionCatchingRequestBody.1
            @Override // o.setResponsePayloadSize
            public long read(setResponseContentType setresponsecontenttype, long j) throws IOException {
                try {
                    return read(setresponsecontenttype, j);
                } catch (IOException e) {
                    OkHttpCall$ExceptionCatchingRequestBody.this.thrownException = e;
                    throw e;
                }
            }
        });
    }

    final void throwIfCaught() throws IOException {
        IOException iOException = this.thrownException;
        if (iOException != null) {
            throw iOException;
        }
    }
}
