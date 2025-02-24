package o;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Iterator;
/* loaded from: classes-dex2jar.jar:o/setAnnualFeeAddOnAmount.class */
public final class setAnnualFeeAddOnAmount {
    public final Context a;
    private String d;

    public setAnnualFeeAddOnAmount(Context context, String str) {
        this.a = context;
        this.d = str;
    }

    private static String c(String str) {
        if (str == null) {
            return "";
        }
        try {
            return URLEncoder.encode(str, "UTF8");
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e.getMessage(), e);
        }
    }

    public final Intent c() {
        Intent intent = new Intent("android.intent.action.SEND");
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(this.d)) {
            sb.append(this.d);
        }
        intent.putExtra("android.intent.extra.TEXT", sb.toString());
        intent.setType("text/plain");
        Iterator<ResolveInfo> it = this.a.getPackageManager().queryIntentActivities(intent, 65536).iterator();
        while (true) {
            if (!it.hasNext()) {
                intent = null;
                break;
            }
            ResolveInfo next = it.next();
            if (next.activityInfo.packageName.startsWith("com.twitter.android")) {
                intent.setClassName(next.activityInfo.packageName, next.activityInfo.name);
                break;
            }
        }
        Intent intent2 = intent;
        if (intent == null) {
            intent2 = new Intent("android.intent.action.VIEW", Uri.parse(String.format("https://twitter.com/intent/tweet?text=%s", c(this.d))));
        }
        return intent2;
    }
}
