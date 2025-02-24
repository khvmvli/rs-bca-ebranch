package okhttp3;

import java.nio.charset.Charset;
import o.setResponseMessage;
import okhttp3.internal.Util;
/* loaded from: classes2-dex2jar.jar:okhttp3/Credentials.class */
public final class Credentials {
    private Credentials() {
    }

    public static String basic(String str, String str2) {
        return basic(str, str2, Util.ISO_8859_1);
    }

    public static String basic(String str, String str2, Charset charset) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(":");
        sb.append(str2);
        String c = setResponseMessage.e(sb.toString(), charset).c();
        StringBuilder sb2 = new StringBuilder("Basic ");
        sb2.append(c);
        return sb2.toString();
    }
}
