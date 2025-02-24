package o;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.google.firebase.messaging.Constants;
import o.realmSet;
/* loaded from: classes2-dex2jar.jar:o/setIdNum.class */
public final class setIdNum {
    private final realmGet$TxnPurpose e;

    public setIdNum(realmGet$TxnPurpose realmget_txnpurpose) {
        this.e = realmget_txnpurpose;
    }

    final boolean a() {
        return this.e.q().r.d() > 0;
    }

    final boolean b() {
        return a() && this.e.q_().e() - this.e.q().r.d() > this.e.t().d((String) null, realmSet.hasDone.r);
    }

    public final void c() {
        this.e.o_().r_();
        if (a()) {
            if (b()) {
                this.e.q().t.d(null);
                Bundle bundle = new Bundle();
                bundle.putString("source", "(not set)");
                bundle.putString("medium", "(not set)");
                bundle.putString("_cis", "intent");
                bundle.putLong("_cc", 1);
                this.e.x().e("auto", "_cmpx", bundle);
            } else {
                String b = this.e.q().t.b();
                if (TextUtils.isEmpty(b)) {
                    this.e.s_().d().b("Cache still valid but referrer not found");
                } else {
                    long d = this.e.q().r.d() / 3600000;
                    Uri parse = Uri.parse(b);
                    Bundle bundle2 = new Bundle();
                    Pair pair = new Pair(parse.getPath(), bundle2);
                    for (String str : parse.getQueryParameterNames()) {
                        bundle2.putString(str, parse.getQueryParameter(str));
                    }
                    ((Bundle) pair.second).putLong("_cc", (d - 1) * 3600000);
                    this.e.x().e((String) pair.first, Constants.ScionAnalytics.EVENT_FIREBASE_CAMPAIGN, (Bundle) pair.second);
                }
                this.e.q().t.d(null);
            }
            this.e.q().r.b(0);
        }
    }

    public final void d(String str, Bundle bundle) {
        String str2;
        this.e.o_().r_();
        if (!this.e.a()) {
            if (bundle.isEmpty()) {
                str2 = null;
            } else {
                String str3 = str;
                if (true == str.isEmpty()) {
                    str3 = "auto";
                }
                Uri.Builder builder = new Uri.Builder();
                builder.path(str3);
                for (String str4 : bundle.keySet()) {
                    builder.appendQueryParameter(str4, bundle.getString(str4));
                }
                str2 = builder.build().toString();
            }
            if (!TextUtils.isEmpty(str2)) {
                this.e.q().t.d(str2);
                this.e.q().r.b(this.e.q_().e());
            }
        }
    }

    public final void e() {
        if (a() && b()) {
            this.e.q().t.d(null);
        }
    }
}
