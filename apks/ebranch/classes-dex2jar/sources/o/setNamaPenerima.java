package o;

import android.os.Parcel;
import android.os.RemoteException;
/* loaded from: classes-dex2jar.jar:o/setNamaPenerima.class */
public abstract class setNamaPenerima extends CCOtherBankAccount implements setBiayaTransfer {
    public setNamaPenerima() {
        super("com.google.android.gms.location.internal.ISettingsCallbacks");
    }

    @Override // o.CCOtherBankAccount
    protected final boolean c(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        c((realmSet$FlagBicCode) CCOtherBankCreditCard.c(parcel, realmSet$FlagBicCode.CREATOR));
        return true;
    }
}
