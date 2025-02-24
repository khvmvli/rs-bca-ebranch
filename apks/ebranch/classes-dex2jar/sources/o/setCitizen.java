package o;

import android.accounts.Account;
import android.os.Binder;
import android.os.RemoteException;
import android.util.Log;
import o.setExpID;
/* loaded from: classes-dex2jar.jar:o/setCitizen.class */
public final class setCitizen extends setExpID.read {
    public static Account c(setExpID setexpid) {
        long clearCallingIdentity;
        Account account = null;
        account = null;
        if (setexpid != null) {
            try {
                clearCallingIdentity = Binder.clearCallingIdentity();
                try {
                    account = setexpid.d();
                } catch (RemoteException e) {
                    Log.w("AccountAccessor", "Remote account accessor probably died");
                }
            } finally {
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        }
        return account;
    }

    @Override // o.setExpID
    public final Account d() {
        throw null;
    }

    @Override // java.lang.Object
    public final boolean equals(Object obj) {
        throw null;
    }
}
