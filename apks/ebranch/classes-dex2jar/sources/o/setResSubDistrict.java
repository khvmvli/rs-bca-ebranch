package o;

import android.accounts.Account;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
/* loaded from: classes-dex2jar.jar:o/setResSubDistrict.class */
public final class setResSubDistrict extends getBankTujuanCode implements setExpID {
    /* JADX INFO: Access modifiers changed from: package-private */
    public setResSubDistrict(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IAccountAccessor");
    }

    @Override // o.setExpID
    public final Account d() throws RemoteException {
        Parcel a = a(2, b());
        Account account = (Account) getBiayaTransfer.a(a, Account.CREATOR);
        a.recycle();
        return account;
    }
}
