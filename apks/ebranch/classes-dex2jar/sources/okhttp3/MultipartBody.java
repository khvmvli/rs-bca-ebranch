package okhttp3;

import com.facebook.stetho.server.http.HttpHeaders;
import java.io.IOException;
import java.util.List;
import javax.annotation.Nullable;
import o.setResponseMessage;
import o.setScheme$com_github_ChuckerTeam_Chucker_library;
import okhttp3.Headers;
import okhttp3.internal.Util;
/* loaded from: classes-dex2jar.jar:okhttp3/MultipartBody.class */
public final class MultipartBody extends RequestBody {
    private final setResponseMessage boundary;
    private long contentLength = -1;
    private final MediaType contentType;
    private final MediaType originalType;
    private final List<Part> parts;
    public static final MediaType MIXED = MediaType.get("multipart/mixed");
    public static final MediaType ALTERNATIVE = MediaType.get("multipart/alternative");
    public static final MediaType DIGEST = MediaType.get("multipart/digest");
    public static final MediaType PARALLEL = MediaType.get("multipart/parallel");
    public static final MediaType FORM = MediaType.get("multipart/form-data");
    private static final byte[] COLONSPACE = {58, 32};
    private static final byte[] CRLF = {13, 10};
    private static final byte[] DASHDASH = {45, 45};

    /* loaded from: classes-dex2jar.jar:okhttp3/MultipartBody$Part.class */
    public static final class Part {
        final RequestBody body;
        @Nullable
        final Headers headers;

        private Part(@Nullable Headers headers, RequestBody requestBody) {
            this.headers = headers;
            this.body = requestBody;
        }

        public static Part create(@Nullable Headers headers, RequestBody requestBody) {
            if (requestBody == null) {
                throw new NullPointerException("body == null");
            } else if (headers != null && headers.get(HttpHeaders.CONTENT_TYPE) != null) {
                throw new IllegalArgumentException("Unexpected header: Content-Type");
            } else if (headers == null || headers.get(HttpHeaders.CONTENT_LENGTH) == null) {
                return new Part(headers, requestBody);
            } else {
                throw new IllegalArgumentException("Unexpected header: Content-Length");
            }
        }

        public static Part create(RequestBody requestBody) {
            return create(null, requestBody);
        }

        public static Part createFormData(String str, String str2) {
            return createFormData(str, null, RequestBody.create((MediaType) null, str2));
        }

        public static Part createFormData(String str, @Nullable String str2, RequestBody requestBody) {
            if (str != null) {
                StringBuilder sb = new StringBuilder("form-data; name=");
                MultipartBody.appendQuotedString(sb, str);
                if (str2 != null) {
                    sb.append("; filename=");
                    MultipartBody.appendQuotedString(sb, str2);
                }
                return create(new Headers.Builder().addUnsafeNonAscii("Content-Disposition", sb.toString()).build(), requestBody);
            }
            throw new NullPointerException("name == null");
        }

        public final RequestBody body() {
            return this.body;
        }

        @Nullable
        public final Headers headers() {
            return this.headers;
        }
    }

    MultipartBody(setResponseMessage setresponsemessage, MediaType mediaType, List<Part> list) {
        this.boundary = setresponsemessage;
        this.originalType = mediaType;
        StringBuilder sb = new StringBuilder();
        sb.append(mediaType);
        sb.append("; boundary=");
        sb.append(setresponsemessage.j());
        this.contentType = MediaType.get(sb.toString());
        this.parts = Util.immutableList(list);
    }

    static StringBuilder appendQuotedString(StringBuilder sb, String str) {
        sb.append('\"');
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt == '\n') {
                sb.append("%0A");
            } else if (charAt == '\r') {
                sb.append("%0D");
            } else if (charAt != '\"') {
                sb.append(charAt);
            } else {
                sb.append("%22");
            }
        }
        sb.append('\"');
        return sb;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1, types: [long] */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3, types: [long] */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v4 */
    /* JADX WARN: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump */
    private long writeOrCountBytes(@javax.annotation.Nullable o.setScheme$com_github_ChuckerTeam_Chucker_library r6, boolean r7) throws java.io.IOException {
        /*
        // Method dump skipped, instructions count: 401
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.MultipartBody.writeOrCountBytes(o.setScheme$com_github_ChuckerTeam_Chucker_library, boolean):long");
    }

    public final String boundary() {
        return this.boundary.j();
    }

    @Override // okhttp3.RequestBody
    public final long contentLength() throws IOException {
        long j = this.contentLength;
        if (j != -1) {
            return j;
        }
        long writeOrCountBytes = writeOrCountBytes(null, true);
        this.contentLength = writeOrCountBytes;
        return writeOrCountBytes;
    }

    @Override // okhttp3.RequestBody
    public final MediaType contentType() {
        return this.contentType;
    }

    public final Part part(int i) {
        return this.parts.get(i);
    }

    public final List<Part> parts() {
        return this.parts;
    }

    public final int size() {
        return this.parts.size();
    }

    public final MediaType type() {
        return this.originalType;
    }

    @Override // okhttp3.RequestBody
    public final void writeTo(setScheme$com_github_ChuckerTeam_Chucker_library setscheme_com_github_chuckerteam_chucker_library) throws IOException {
        writeOrCountBytes(setscheme_com_github_chuckerteam_chucker_library, false);
    }
}
