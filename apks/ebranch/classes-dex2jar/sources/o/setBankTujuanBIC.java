package o;

import android.os.Parcel;
import android.os.RemoteException;
/* loaded from: classes-dex2jar.jar:o/setBankTujuanBIC.class */
public abstract class setBankTujuanBIC extends CCOtherBankAccount implements setBankTujuanPenerima {
    public setBankTujuanBIC() {
        super("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
    }

    @Override // o.CCOtherBankAccount
    protected final boolean c(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            d((C0026realmSet$norekPenerima) CCOtherBankCreditCard.c(parcel, C0026realmSet$norekPenerima.CREATOR));
            return true;
        } else if (i != 2) {
            return false;
        } else {
            d();
            return true;
        }
    }
}
