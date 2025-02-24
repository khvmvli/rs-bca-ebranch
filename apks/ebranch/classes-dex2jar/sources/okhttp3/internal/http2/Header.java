package okhttp3.internal.http2;

import o.setResponseMessage;
import okhttp3.Headers;
import okhttp3.internal.Util;
/* loaded from: classes-dex2jar.jar:okhttp3/internal/http2/Header.class */
public final class Header {
    final int hpackSize;
    public final setResponseMessage name;
    public final setResponseMessage value;
    public static final setResponseMessage PSEUDO_PREFIX = setResponseMessage.a(":");
    public static final String RESPONSE_STATUS_UTF8 = ":status";
    public static final setResponseMessage RESPONSE_STATUS = setResponseMessage.a(RESPONSE_STATUS_UTF8);
    public static final String TARGET_METHOD_UTF8 = ":method";
    public static final setResponseMessage TARGET_METHOD = setResponseMessage.a(TARGET_METHOD_UTF8);
    public static final String TARGET_PATH_UTF8 = ":path";
    public static final setResponseMessage TARGET_PATH = setResponseMessage.a(TARGET_PATH_UTF8);
    public static final String TARGET_SCHEME_UTF8 = ":scheme";
    public static final setResponseMessage TARGET_SCHEME = setResponseMessage.a(TARGET_SCHEME_UTF8);
    public static final String TARGET_AUTHORITY_UTF8 = ":authority";
    public static final setResponseMessage TARGET_AUTHORITY = setResponseMessage.a(TARGET_AUTHORITY_UTF8);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes-dex2jar.jar:okhttp3/internal/http2/Header$Listener.class */
    public interface Listener {
        void onHeaders(Headers headers);
    }

    public Header(String str, String str2) {
        this(setResponseMessage.a(str), setResponseMessage.a(str2));
    }

    public Header(setResponseMessage setresponsemessage, String str) {
        this(setresponsemessage, setResponseMessage.a(str));
    }

    public Header(setResponseMessage setresponsemessage, setResponseMessage setresponsemessage2) {
        this.name = setresponsemessage;
        this.value = setresponsemessage2;
        this.hpackSize = setresponsemessage.g() + 32 + setresponsemessage2.g();
    }

    public final boolean equals(Object obj) {
        boolean z = false;
        if (obj instanceof Header) {
            Header header = (Header) obj;
            z = false;
            if (this.name.equals(header.name)) {
                z = false;
                if (this.value.equals(header.value)) {
                    z = true;
                }
            }
        }
        return z;
    }

    public final int hashCode() {
        return ((this.name.hashCode() + 527) * 31) + this.value.hashCode();
    }

    public final String toString() {
        return Util.format("%s: %s", this.name.j(), this.value.j());
    }
}
