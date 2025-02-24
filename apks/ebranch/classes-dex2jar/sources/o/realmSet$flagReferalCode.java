package o;

import android.net.Uri;
import java.util.Map;
import javax.annotation.Nullable;
/* loaded from: classes-dex2jar.jar:o/realmSet$flagReferalCode.class */
public final class realmSet$flagReferalCode {
    private final Map<String, Map<String, String>> b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public realmSet$flagReferalCode(Map<String, Map<String, String>> map) {
        this.b = map;
    }

    @Nullable
    public final String e(@Nullable Uri uri, @Nullable String str, @Nullable String str2, String str3) {
        Map<String, String> map;
        if (uri == null || (map = this.b.get(uri.toString())) == null) {
            return null;
        }
        String valueOf = String.valueOf(str3);
        return map.get(valueOf.length() != 0 ? "".concat(valueOf) : new String(""));
    }
}
