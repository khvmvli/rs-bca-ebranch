package o;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import java.io.IOException;
import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import o.realmGet;
import o.realmSet;
/* loaded from: classes-dex2jar.jar:o/realmGet$kodeNegara.class */
public final class realmGet$kodeNegara extends realmSet.RepresentativeRelationship {
    private String a;
    private AccountManager b;
    private long c;
    private Boolean d;
    private long e;

    realmGet$kodeNegara(realmGet.TxnPurpose txnPurpose) {
        super(txnPurpose);
    }

    final void a() {
        r_();
        this.d = null;
        this.e = 0;
    }

    public final String b() {
        s();
        return this.a;
    }

    final long c() {
        r_();
        return this.e;
    }

    public final long d() {
        s();
        return this.c;
    }

    protected final boolean e() {
        Calendar instance = Calendar.getInstance();
        this.c = TimeUnit.MINUTES.convert((long) (instance.get(15) + instance.get(16)), TimeUnit.MILLISECONDS);
        Locale locale = Locale.getDefault();
        String lowerCase = locale.getLanguage().toLowerCase(Locale.ENGLISH);
        String lowerCase2 = locale.getCountry().toLowerCase(Locale.ENGLISH);
        StringBuilder sb = new StringBuilder(String.valueOf(lowerCase).length() + 1 + String.valueOf(lowerCase2).length());
        sb.append(lowerCase);
        sb.append("-");
        sb.append(lowerCase2);
        this.a = sb.toString();
        return false;
    }

    final boolean j() {
        Account[] result;
        r_();
        long e = ((realmSet.RepresentativeName) this).q.q_().e();
        if (e - this.e > 86400000) {
            this.d = null;
        }
        Boolean bool = this.d;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (copyWindowDataInto.b(((realmSet.RepresentativeName) this).q.t_(), "android.permission.GET_ACCOUNTS") != 0) {
            ((realmSet.RepresentativeName) this).q.s_().j().b("Permission error checking for dasher/unicorn accounts");
            this.e = e;
            this.d = false;
            return false;
        }
        if (this.b == null) {
            this.b = AccountManager.get(((realmSet.RepresentativeName) this).q.t_());
        }
        try {
            result = this.b.getAccountsByTypeAndFeatures("com.google", new String[]{"service_HOSTED"}, null, null).getResult();
        } catch (AuthenticatorException | OperationCanceledException | IOException e2) {
            ((realmSet.RepresentativeName) this).q.s_().d().e("Exception checking account types", e2);
        }
        if (result == null || result.length <= 0) {
            Account[] result2 = this.b.getAccountsByTypeAndFeatures("com.google", new String[]{"service_uca"}, null, null).getResult();
            if (result2 != null && result2.length > 0) {
                this.d = true;
                this.e = e;
                return true;
            }
            this.e = e;
            this.d = false;
            return false;
        }
        this.d = true;
        this.e = e;
        return true;
    }
}
