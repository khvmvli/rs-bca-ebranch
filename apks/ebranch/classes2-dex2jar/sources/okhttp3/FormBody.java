package okhttp3;

import java.io.EOFException;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;
import o.setResponseContentType;
import o.setScheme;
import okhttp3.internal.Util;
/* loaded from: classes2-dex2jar.jar:okhttp3/FormBody.class */
public final class FormBody extends RequestBody {
    private static final MediaType CONTENT_TYPE = MediaType.get("application/x-www-form-urlencoded");
    private final List<String> encodedNames;
    private final List<String> encodedValues;

    /* loaded from: classes2-dex2jar.jar:okhttp3/FormBody$Builder.class */
    public static final class Builder {
        private final Charset charset;
        private final List<String> names;
        private final List<String> values;

        public Builder() {
            this(null);
        }

        public Builder(Charset charset) {
            this.names = new ArrayList();
            this.values = new ArrayList();
            this.charset = charset;
        }

        public final Builder add(String str, String str2) {
            if (str == null) {
                throw new NullPointerException("name == null");
            } else if (str2 != null) {
                this.names.add(HttpUrl.canonicalize(str, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, true, this.charset));
                this.values.add(HttpUrl.canonicalize(str2, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, true, this.charset));
                return this;
            } else {
                throw new NullPointerException("value == null");
            }
        }

        public final Builder addEncoded(String str, String str2) {
            if (str == null) {
                throw new NullPointerException("name == null");
            } else if (str2 != null) {
                this.names.add(HttpUrl.canonicalize(str, " \"':;<=>@[]^`{}|/\\?#&!$(),~", true, false, true, true, this.charset));
                this.values.add(HttpUrl.canonicalize(str2, " \"':;<=>@[]^`{}|/\\?#&!$(),~", true, false, true, true, this.charset));
                return this;
            } else {
                throw new NullPointerException("value == null");
            }
        }

        public final FormBody build() {
            return new FormBody(this.names, this.values);
        }
    }

    FormBody(List<String> list, List<String> list2) {
        this.encodedNames = Util.immutableList(list);
        this.encodedValues = Util.immutableList(list2);
    }

    private long writeOrCountBytes(@Nullable setScheme.com_github_ChuckerTeam_Chucker_library com_github_chuckerteam_chucker_library, boolean z) {
        long j;
        setResponseContentType setresponsecontenttype = z ? new setResponseContentType() : com_github_chuckerteam_chucker_library.c();
        int size = this.encodedNames.size();
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                setresponsecontenttype.b(38);
            }
            String str = this.encodedNames.get(i);
            setresponsecontenttype.d(str, 0, str.length());
            setresponsecontenttype.b(61);
            String str2 = this.encodedValues.get(i);
            setresponsecontenttype.d(str2, 0, str2.length());
        }
        if (z) {
            j = setresponsecontenttype.b;
            try {
                setresponsecontenttype.f(setresponsecontenttype.b);
            } catch (EOFException e) {
                throw new AssertionError(e);
            }
        } else {
            j = 0;
        }
        return j;
    }

    public final long contentLength() {
        return writeOrCountBytes(null, true);
    }

    public final MediaType contentType() {
        return CONTENT_TYPE;
    }

    public final String encodedName(int i) {
        return this.encodedNames.get(i);
    }

    public final String encodedValue(int i) {
        return this.encodedValues.get(i);
    }

    public final String name(int i) {
        return HttpUrl.percentDecode(encodedName(i), true);
    }

    public final int size() {
        return this.encodedNames.size();
    }

    public final String value(int i) {
        return HttpUrl.percentDecode(encodedValue(i), true);
    }

    public final void writeTo(setScheme.com_github_ChuckerTeam_Chucker_library com_github_chuckerteam_chucker_library) throws IOException {
        writeOrCountBytes(com_github_chuckerteam_chucker_library, false);
    }
}
