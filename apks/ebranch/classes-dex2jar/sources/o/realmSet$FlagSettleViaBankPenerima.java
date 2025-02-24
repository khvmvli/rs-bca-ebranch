package o;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
/* loaded from: classes-dex2jar.jar:o/realmSet$FlagSettleViaBankPenerima.class */
public class realmSet$FlagSettleViaBankPenerima extends CCOtherBankAccount implements realmSet$FlagSimpanDaftarTransferPenerima {
    public static realmSet$FlagSimpanDaftarTransferPenerima e(IBinder iBinder) {
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.IDeviceOrientationListener");
        return queryLocalInterface instanceof realmSet$FlagSimpanDaftarTransferPenerima ? (realmSet$FlagSimpanDaftarTransferPenerima) queryLocalInterface : new realmSet$FlagSimpanDaftarTransferPenerima(iBinder) { // from class: o.realmSet$FlagDaftarSwift
        };
    }

    @Override // o.CCOtherBankAccount
    public final boolean c(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        throw null;
    }
}
