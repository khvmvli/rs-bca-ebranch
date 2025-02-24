package o;

import com.facebook.stetho.common.Utf8Charset;
import java.nio.charset.Charset;
import java.security.MessageDigest;
/* loaded from: classes-dex2jar.jar:o/setCode.class */
public interface setCode {
    public static final Charset e = Charset.forName(Utf8Charset.NAME);

    void e(MessageDigest messageDigest);

    boolean equals(Object obj);

    int hashCode();
}
