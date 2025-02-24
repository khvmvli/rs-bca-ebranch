package o;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationResult;
/* loaded from: classes-dex2jar.jar:o/realmSet$FlagPromoCode.class */
public abstract class realmSet$FlagPromoCode extends CCOtherBankAccount implements realmSet$FlagKodeAutoCompletePenerima {
    public realmSet$FlagPromoCode() {
        super("com.google.android.gms.location.ILocationCallback");
    }

    public static realmSet$FlagKodeAutoCompletePenerima b(IBinder iBinder) {
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.ILocationCallback");
        return queryLocalInterface instanceof realmSet$FlagKodeAutoCompletePenerima ? (realmSet$FlagKodeAutoCompletePenerima) queryLocalInterface : new realmSet$FlagKodeAutoCompletePenerima(iBinder) { // from class: o.realmSet$FlagIBAN
            @Override // o.realmSet$FlagKodeAutoCompletePenerima
            public final void b(LocationResult locationResult) throws RemoteException {
                throw null;
            }

            @Override // o.realmSet$FlagKodeAutoCompletePenerima
            public final void e(LocationAvailability locationAvailability) throws RemoteException {
                throw null;
            }
        };
    }

    @Override // o.CCOtherBankAccount
    public final boolean c(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            b((LocationResult) CCOtherBankCreditCard.c(parcel, LocationResult.CREATOR));
            return true;
        } else if (i != 2) {
            return false;
        } else {
            e((LocationAvailability) CCOtherBankCreditCard.c(parcel, LocationAvailability.CREATOR));
            return true;
        }
    }
}
