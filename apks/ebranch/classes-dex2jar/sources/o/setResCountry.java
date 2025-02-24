package o;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
/* loaded from: classes-dex2jar.jar:o/setResCountry.class */
public final class setResCountry {
    private static final Uri d = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").build();
    private final String b;
    private final String c;
    private final boolean f;
    private final ComponentName e = null;
    private final int a = 4225;

    public setResCountry(String str, String str2, int i, boolean z) {
        setFotoKtp.c(str);
        this.c = str;
        setFotoKtp.c(str2);
        this.b = str2;
        this.f = z;
    }

    public final Intent d(Context context) {
        Intent intent;
        Bundle bundle;
        if (this.c != null) {
            Intent intent2 = null;
            Intent intent3 = null;
            if (this.f) {
                Bundle bundle2 = new Bundle();
                bundle2.putString("serviceActionBundleKey", this.c);
                try {
                    bundle = context.getContentResolver().call(d, "serviceIntentCall", (String) null, bundle2);
                } catch (IllegalArgumentException e) {
                    Log.w("ConnectionStatusConfig", "Dynamic intent resolution failed: ".concat(e.toString()));
                    bundle = null;
                }
                if (bundle != null) {
                    intent3 = (Intent) bundle.getParcelable("serviceResponseIntentKey");
                }
                intent2 = intent3;
                if (intent3 == null) {
                    Log.w("ConnectionStatusConfig", "Dynamic lookup for intent failed for action: ".concat(String.valueOf(this.c)));
                    intent2 = intent3;
                }
            }
            intent = intent2;
            if (intent2 == null) {
                return new Intent(this.c).setPackage(this.b);
            }
        } else {
            intent = new Intent().setComponent(this.e);
        }
        return intent;
    }

    public final String d() {
        return this.b;
    }

    public final ComponentName e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setResCountry)) {
            return false;
        }
        setResCountry setrescountry = (setResCountry) obj;
        if (!setFlagIB.d(this.c, setrescountry.c) || !setFlagIB.d(this.b, setrescountry.b) || !setFlagIB.d(this.e, setrescountry.e)) {
            return false;
        }
        int i = setrescountry.a;
        return this.f == setrescountry.f;
    }

    public final int hashCode() {
        return setFlagIB.b(this.c, this.b, this.e, 4225, Boolean.valueOf(this.f));
    }

    public final String toString() {
        String str = this.c;
        String str2 = str;
        if (str == null) {
            setFotoKtp.b(this.e);
            str2 = this.e.flattenToString();
        }
        return str2;
    }
}
