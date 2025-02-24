package o;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONException;
/* loaded from: classes-dex2jar.jar:o/realmGet$cobIsoCode.class */
public final class realmGet$cobIsoCode {
    private static realmGet$cobIsoCode b;
    private static final Lock c = new ReentrantLock();
    private final Lock a = new ReentrantLock();
    private final SharedPreferences d;

    private realmGet$cobIsoCode(Context context) {
        this.d = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    public static realmGet$cobIsoCode d(Context context) {
        if (context != null) {
            Lock lock = c;
            lock.lock();
            try {
                if (b == null) {
                    b = new realmGet$cobIsoCode(context.getApplicationContext());
                }
                realmGet$cobIsoCode realmget_cobisocode = b;
                lock.unlock();
                return realmget_cobisocode;
            } catch (Throwable th) {
                c.unlock();
                throw th;
            }
        } else {
            throw new NullPointerException("null reference");
        }
    }

    private String e(String str) {
        this.a.lock();
        try {
            return this.d.getString(str, null);
        } finally {
            this.a.unlock();
        }
    }

    public final GoogleSignInAccount d() {
        GoogleSignInAccount googleSignInAccount;
        String e = e("defaultGoogleSignInAccount");
        if (!TextUtils.isEmpty(e)) {
            StringBuilder sb = new StringBuilder();
            sb.append("googleSignInAccount");
            sb.append(":");
            sb.append(e);
            String e2 = e(sb.toString());
            if (e2 != null) {
                try {
                    googleSignInAccount = GoogleSignInAccount.a(e2);
                } catch (JSONException e3) {
                }
                return googleSignInAccount;
            }
        }
        googleSignInAccount = null;
        return googleSignInAccount;
    }
}
