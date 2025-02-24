package retrofit2;

import java.io.IOException;
import javax.annotation.Nullable;
import o.setResponseContentType;
import o.setScheme;
import okhttp3.FormBody;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.MultipartBody$Builder;
import okhttp3.Request;
import okhttp3.Request$Builder;
import okhttp3.RequestBody;
/* loaded from: classes2-dex2jar.jar:retrofit2/RequestBuilder.class */
final class RequestBuilder {
    private static final char[] HEX_DIGITS = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    private static final String PATH_SEGMENT_ALWAYS_ENCODE_SET = " \"<>^`{}|\\?#";
    private final HttpUrl baseUrl;
    @Nullable
    private RequestBody body;
    @Nullable
    private MediaType contentType;
    @Nullable
    private FormBody.Builder formBuilder;
    private final boolean hasBody;
    private final String method;
    @Nullable
    private MultipartBody$Builder multipartBuilder;
    @Nullable
    private String relativeUrl;
    private final Request$Builder requestBuilder;
    @Nullable
    private HttpUrl.Builder urlBuilder;

    /* loaded from: classes2-dex2jar.jar:retrofit2/RequestBuilder$ContentTypeOverridingRequestBody.class */
    static class ContentTypeOverridingRequestBody extends RequestBody {
        private final MediaType contentType;
        private final RequestBody delegate;

        ContentTypeOverridingRequestBody(RequestBody requestBody, MediaType mediaType) {
            this.delegate = requestBody;
            this.contentType = mediaType;
        }

        public long contentLength() throws IOException {
            return this.delegate.contentLength();
        }

        public MediaType contentType() {
            return this.contentType;
        }

        public void writeTo(setScheme.com_github_ChuckerTeam_Chucker_library com_github_chuckerteam_chucker_library) throws IOException {
            this.delegate.writeTo(com_github_chuckerteam_chucker_library);
        }
    }

    RequestBuilder(String str, HttpUrl httpUrl, @Nullable String str2, @Nullable Headers headers, @Nullable MediaType mediaType, boolean z, boolean z2, boolean z3) {
        this.method = str;
        this.baseUrl = httpUrl;
        this.relativeUrl = str2;
        Request$Builder request$Builder = new Request$Builder();
        this.requestBuilder = request$Builder;
        this.contentType = mediaType;
        this.hasBody = z;
        if (headers != null) {
            request$Builder.headers(headers);
        }
        if (z2) {
            this.formBuilder = new FormBody.Builder();
        } else if (z3) {
            MultipartBody$Builder multipartBody$Builder = new MultipartBody$Builder();
            this.multipartBuilder = multipartBody$Builder;
            multipartBody$Builder.setType(MultipartBody.FORM);
        }
    }

    private static String canonicalizeForPath(String str, boolean z) {
        String str2;
        int length = str.length();
        int i = 0;
        while (true) {
            str2 = str;
            if (i >= length) {
                break;
            }
            int codePointAt = str.codePointAt(i);
            if (codePointAt < 32 || codePointAt >= 127 || PATH_SEGMENT_ALWAYS_ENCODE_SET.indexOf(codePointAt) != -1 || (!z && (codePointAt == 47 || codePointAt == 37))) {
                break;
            }
            i += Character.charCount(codePointAt);
        }
        setResponseContentType setresponsecontenttype = new setResponseContentType();
        setresponsecontenttype.d(str, 0, i);
        canonicalizeForPath(setresponsecontenttype, str, i, length, z);
        str2 = setresponsecontenttype.t();
        return str2;
    }

    private static void canonicalizeForPath(setResponseContentType setresponsecontenttype, String str, int i, int i2, boolean z) {
        setResponseContentType setresponsecontenttype2 = null;
        while (i < i2) {
            int codePointAt = str.codePointAt(i);
            if (z) {
                setresponsecontenttype2 = setresponsecontenttype2;
                if (codePointAt != 9) {
                    setresponsecontenttype2 = setresponsecontenttype2;
                    if (codePointAt != 10) {
                        setresponsecontenttype2 = setresponsecontenttype2;
                        if (codePointAt != 12) {
                            if (codePointAt == 13) {
                                setresponsecontenttype2 = setresponsecontenttype2;
                            }
                        }
                    }
                }
                i += Character.charCount(codePointAt);
            }
            if (codePointAt < 32 || codePointAt >= 127 || PATH_SEGMENT_ALWAYS_ENCODE_SET.indexOf(codePointAt) != -1 || (!z && (codePointAt == 47 || codePointAt == 37))) {
                setResponseContentType setresponsecontenttype3 = setresponsecontenttype2;
                if (setresponsecontenttype2 == null) {
                    setresponsecontenttype3 = new setResponseContentType();
                }
                setresponsecontenttype3.j(codePointAt);
                while (true) {
                    setresponsecontenttype2 = setresponsecontenttype3;
                    if (!(setresponsecontenttype3.b == 0)) {
                        int i3 = setresponsecontenttype3.i() & 255;
                        setresponsecontenttype.b(37);
                        char[] cArr = HEX_DIGITS;
                        setresponsecontenttype.b(cArr[(i3 >> 4) & 15]);
                        setresponsecontenttype.b(cArr[i3 & 15]);
                    }
                }
            } else {
                setresponsecontenttype.j(codePointAt);
                setresponsecontenttype2 = setresponsecontenttype2;
            }
            i += Character.charCount(codePointAt);
        }
    }

    final void addFormField(String str, String str2, boolean z) {
        if (z) {
            this.formBuilder.addEncoded(str, str2);
        } else {
            this.formBuilder.add(str, str2);
        }
    }

    final void addHeader(String str, String str2) {
        if ("Content-Type".equalsIgnoreCase(str)) {
            MediaType parse = MediaType.parse(str2);
            if (parse != null) {
                this.contentType = parse;
                return;
            }
            StringBuilder sb = new StringBuilder("Malformed content type: ");
            sb.append(str2);
            throw new IllegalArgumentException(sb.toString());
        }
        this.requestBuilder.addHeader(str, str2);
    }

    final void addPart(Headers headers, RequestBody requestBody) {
        this.multipartBuilder.addPart(headers, requestBody);
    }

    final void addPart(MultipartBody.Part part) {
        this.multipartBuilder.addPart(part);
    }

    final void addPathParam(String str, String str2, boolean z) {
        String str3 = this.relativeUrl;
        if (str3 != null) {
            StringBuilder sb = new StringBuilder("{");
            sb.append(str);
            sb.append("}");
            this.relativeUrl = str3.replace(sb.toString(), canonicalizeForPath(str2, z));
            return;
        }
        throw new AssertionError();
    }

    final void addQueryParam(String str, @Nullable String str2, boolean z) {
        String str3 = this.relativeUrl;
        if (str3 != null) {
            HttpUrl.Builder newBuilder = this.baseUrl.newBuilder(str3);
            this.urlBuilder = newBuilder;
            if (newBuilder != null) {
                this.relativeUrl = null;
            } else {
                StringBuilder sb = new StringBuilder("Malformed URL. Base: ");
                sb.append(this.baseUrl);
                sb.append(", Relative: ");
                sb.append(this.relativeUrl);
                throw new IllegalArgumentException(sb.toString());
            }
        }
        if (z) {
            this.urlBuilder.addEncodedQueryParameter(str, str2);
        } else {
            this.urlBuilder.addQueryParameter(str, str2);
        }
    }

    final Request build() {
        HttpUrl httpUrl;
        HttpUrl.Builder builder = this.urlBuilder;
        if (builder != null) {
            httpUrl = builder.build();
        } else {
            httpUrl = this.baseUrl.resolve(this.relativeUrl);
            if (httpUrl == null) {
                StringBuilder sb = new StringBuilder("Malformed URL. Base: ");
                sb.append(this.baseUrl);
                sb.append(", Relative: ");
                sb.append(this.relativeUrl);
                throw new IllegalArgumentException(sb.toString());
            }
        }
        MultipartBody multipartBody = this.body;
        MultipartBody multipartBody2 = multipartBody;
        if (multipartBody == null) {
            FormBody.Builder builder2 = this.formBuilder;
            if (builder2 != null) {
                multipartBody2 = builder2.build();
            } else {
                MultipartBody$Builder multipartBody$Builder = this.multipartBuilder;
                if (multipartBody$Builder != null) {
                    multipartBody2 = multipartBody$Builder.build();
                } else {
                    multipartBody2 = multipartBody;
                    if (this.hasBody) {
                        multipartBody2 = RequestBody.create((MediaType) null, new byte[0]);
                    }
                }
            }
        }
        MediaType mediaType = this.contentType;
        MultipartBody multipartBody3 = multipartBody2;
        if (mediaType != null) {
            if (multipartBody2 != null) {
                multipartBody3 = new ContentTypeOverridingRequestBody(multipartBody2, mediaType);
            } else {
                this.requestBuilder.addHeader("Content-Type", mediaType.toString());
                multipartBody3 = multipartBody2;
            }
        }
        return this.requestBuilder.url(httpUrl).method(this.method, multipartBody3).build();
    }

    final void setBody(RequestBody requestBody) {
        this.body = requestBody;
    }

    final void setRelativeUrl(Object obj) {
        this.relativeUrl = obj.toString();
    }
}
