package o;

import android.location.Location;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
/* loaded from: classes-dex2jar.jar:o/realmSet$FlagUpdateDaftarTransferPenerima.class */
public abstract class realmSet$FlagUpdateDaftarTransferPenerima extends CCOtherBankAccount implements realmSet$FlagValueTodayTransaksi {
    public realmSet$FlagUpdateDaftarTransferPenerima() {
        super("com.google.android.gms.location.ILocationListener");
    }

    public static realmSet$FlagValueTodayTransaksi e(IBinder iBinder) {
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.ILocationListener");
        return queryLocalInterface instanceof realmSet$FlagValueTodayTransaksi ? (realmSet$FlagValueTodayTransaksi) queryLocalInterface : new realmSet$FlagValueTodayTransaksi(iBinder) { // from class: o.realmSet$JenisMataUangTransaksi
            @Override // o.realmSet$FlagValueTodayTransaksi
            public final void c(Location location) throws RemoteException {
                throw null;
            }
        };
    }

    @Override // o.CCOtherBankAccount
    public final boolean c(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        c((Location) CCOtherBankCreditCard.c(parcel, Location.CREATOR));
        return true;
    }
}
