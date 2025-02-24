package okhttp3;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import javax.annotation.Nullable;
import o.setResponseMessage;
import okhttp3.MultipartBody;
/* loaded from: classes2-dex2jar.jar:okhttp3/MultipartBody$Builder.class */
public final class MultipartBody$Builder {
    private final setResponseMessage boundary;
    private final List<MultipartBody.Part> parts;
    private MediaType type;

    public MultipartBody$Builder() {
        this(UUID.randomUUID().toString());
    }

    public MultipartBody$Builder(String str) {
        this.type = MultipartBody.MIXED;
        this.parts = new ArrayList();
        this.boundary = setResponseMessage.a(str);
    }

    public final MultipartBody$Builder addFormDataPart(String str, String str2) {
        return addPart(MultipartBody.Part.createFormData(str, str2));
    }

    public final MultipartBody$Builder addFormDataPart(String str, @Nullable String str2, RequestBody requestBody) {
        return addPart(MultipartBody.Part.createFormData(str, str2, requestBody));
    }

    public final MultipartBody$Builder addPart(@Nullable Headers headers, RequestBody requestBody) {
        return addPart(MultipartBody.Part.create(headers, requestBody));
    }

    public final MultipartBody$Builder addPart(MultipartBody.Part part) {
        if (part != null) {
            this.parts.add(part);
            return this;
        }
        throw new NullPointerException("part == null");
    }

    public final MultipartBody$Builder addPart(RequestBody requestBody) {
        return addPart(MultipartBody.Part.create(requestBody));
    }

    public final MultipartBody build() {
        if (!this.parts.isEmpty()) {
            return new MultipartBody(this.boundary, this.type, this.parts);
        }
        throw new IllegalStateException("Multipart body must have at least one part.");
    }

    public final MultipartBody$Builder setType(MediaType mediaType) {
        if (mediaType == null) {
            throw new NullPointerException("type == null");
        } else if (mediaType.type().equals("multipart")) {
            this.type = mediaType;
            return this;
        } else {
            StringBuilder sb = new StringBuilder("multipart != ");
            sb.append(mediaType);
            throw new IllegalArgumentException(sb.toString());
        }
    }
}
