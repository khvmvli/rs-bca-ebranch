package o;

import android.text.TextUtils;
import android.util.Log;
import com.google.firebase.messaging.Constants;
import java.util.Arrays;
import java.util.regex.Pattern;
/* loaded from: classes2-dex2jar.jar:o/YakinKeluarDialog.class */
public final class YakinKeluarDialog {
    private static final Pattern e = Pattern.compile("[a-zA-Z0-9-_.~%]{1,900}");
    final String b;
    final String c;
    final String d;

    private YakinKeluarDialog(String str, String str2) {
        String str3;
        if (str2 == null || !str2.startsWith("/topics/")) {
            str3 = str2;
        } else {
            Log.w(Constants.TAG, String.format("Format /topics/topic-name is deprecated. Only 'topic-name' should be used in %s.", str));
            str3 = str2.substring(8);
        }
        if (str3 == null || !e.matcher(str3).matches()) {
            throw new IllegalArgumentException(String.format("Invalid topic name: %s does not match the allowed format %s.", str3, "[a-zA-Z0-9-_.~%]{1,900}"));
        }
        this.c = str3;
        this.d = str;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(str2).length());
        sb.append(str);
        sb.append("!");
        sb.append(str2);
        this.b = sb.toString();
    }

    public static YakinKeluarDialog a(String str) {
        return new YakinKeluarDialog("S", str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static YakinKeluarDialog d(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] split = str.split("!", -1);
        if (split.length != 2) {
            return null;
        }
        return new YakinKeluarDialog(split[0], split[1]);
    }

    public static YakinKeluarDialog e(String str) {
        return new YakinKeluarDialog("U", str);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof YakinKeluarDialog)) {
            return false;
        }
        YakinKeluarDialog yakinKeluarDialog = (YakinKeluarDialog) obj;
        return this.c.equals(yakinKeluarDialog.c) && this.d.equals(yakinKeluarDialog.d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.d, this.c});
    }
}
