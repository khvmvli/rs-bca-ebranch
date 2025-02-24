package o;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
/* loaded from: classes-dex2jar.jar:o/setOccupationValue.class */
public abstract class setOccupationValue extends getBeritaPenerima implements setFlagDifResidency {
    public setOccupationValue() {
        super("com.google.android.gms.common.internal.IGmsCallbacks");
    }

    @Override // o.getBeritaPenerima
    public final boolean c(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            getBiayaTransfer.a(parcel);
            b(parcel.readInt(), parcel.readStrongBinder(), (Bundle) getBiayaTransfer.a(parcel, Bundle.CREATOR));
        } else if (i == 2) {
            getBiayaTransfer.a(parcel);
            c(parcel.readInt(), (Bundle) getBiayaTransfer.a(parcel, Bundle.CREATOR));
        } else if (i != 3) {
            return false;
        } else {
            getBiayaTransfer.a(parcel);
            d(parcel.readInt(), parcel.readStrongBinder(), (setReligion) getBiayaTransfer.a(parcel, setReligion.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
