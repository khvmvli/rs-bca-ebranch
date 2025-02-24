package o;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import o.realmGet;
import o.setCitizenValue;
/* loaded from: classes2-dex2jar.jar:o/Warkat.class */
public final class Warkat extends setDollarCurrCode<getLocalClearingCodeBank> implements realmGet$nomorWarkat {
    public static final /* synthetic */ int f = 0;
    private final boolean g = true;
    private final Integer h;
    private final setDob i;
    private final Bundle j;

    public Warkat(Context context, Looper looper, boolean z, setDob setdob, Bundle bundle, realmGet.occupation.IconCompatParcelizer iconCompatParcelizer, realmGet.occupation.read read) {
        super(context, looper, 44, setdob, iconCompatParcelizer, read);
        this.i = setdob;
        this.j = bundle;
        this.h = setdob.e;
    }

    public static Bundle e(setDob setdob) {
        setNoHandphone setnohandphone = setdob.c;
        Integer num = setdob.e;
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", setdob.d);
        if (num != null) {
            bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", num.intValue());
        }
        bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", false);
        bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", false);
        bundle.putString("com.google.android.gms.signin.internal.serverClientId", null);
        bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
        bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", false);
        bundle.putString("com.google.android.gms.signin.internal.hostedDomain", null);
        bundle.putString("com.google.android.gms.signin.internal.logSessionId", null);
        bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", false);
        return bundle;
    }

    public final String A() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    public final String D() {
        return "com.google.android.gms.signin.service.START";
    }

    @Override // o.realmGet$nomorWarkat
    public final void F() {
        try {
            getLocalClearingCodeBank getlocalclearingcodebank = (getLocalClearingCodeBank) u();
            Integer num = this.h;
            if (num != null) {
                getlocalclearingcodebank.c(num.intValue());
                return;
            }
            throw new NullPointerException("null reference");
        } catch (RemoteException e) {
            Log.w("SignInClientImpl", "Remote service probably died when clearAccountFromSessionStore is called");
        }
    }

    @Override // o.realmGet$nomorWarkat
    public final void K() {
        a(new setCitizenValue.read(this));
    }

    public final int a() {
        return 12451000;
    }

    @Override // o.realmGet$nomorWarkat
    public final void c(setExpID setexpid, boolean z) {
        try {
            getLocalClearingCodeBank getlocalclearingcodebank = (getLocalClearingCodeBank) u();
            Integer num = this.h;
            if (num != null) {
                getlocalclearingcodebank.e(setexpid, num.intValue(), z);
                return;
            }
            throw new NullPointerException("null reference");
        } catch (RemoteException e) {
            Log.w("SignInClientImpl", "Remote service probably died when saveDefaultAccount is called");
        }
    }

    public final /* synthetic */ IInterface d(IBinder iBinder) {
        getLocalClearingCodeBank getlocalclearingcodebank;
        if (iBinder == null) {
            getlocalclearingcodebank = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
            getlocalclearingcodebank = queryLocalInterface instanceof getLocalClearingCodeBank ? (getLocalClearingCodeBank) queryLocalInterface : new getLocalClearingCodeBank(iBinder);
        }
        return getlocalclearingcodebank;
    }

    @Override // o.realmGet$nomorWarkat
    public final void d(getKodeJenisWarkat getkodejeniswarkat) {
        if (getkodejeniswarkat != null) {
            try {
                Account account = this.i.d;
                if (account == null) {
                    account = new Account("<<default account>>", "com.google");
                }
                GoogleSignInAccount d = "<<default account>>".equals(account.name) ? realmGet.cobIsoCode.d(s()).d() : null;
                Integer num = this.h;
                if (num != null) {
                    ((getLocalClearingCodeBank) u()).a(new getJenisWarkat(1, new setLanguage(account, num.intValue(), d)), getkodejeniswarkat);
                    return;
                }
                throw new NullPointerException("null reference");
            } catch (RemoteException e) {
                Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
                try {
                    getkodejeniswarkat.c(new realmGet$kodeBank(1, new realmGet.jobValue(8, (PendingIntent) null), null));
                } catch (RemoteException e2) {
                    Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e);
                }
            }
        } else {
            throw new NullPointerException("Expecting a valid ISignInCallbacks");
        }
    }

    public final boolean n() {
        return this.g;
    }

    public final Bundle w() {
        if (!s().getPackageName().equals(this.i.a)) {
            this.j.putString("com.google.android.gms.signin.internal.realClientPackageName", this.i.a);
        }
        return this.j;
    }
}
