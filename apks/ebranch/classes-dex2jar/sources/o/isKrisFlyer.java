package o;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
/* loaded from: classes-dex2jar.jar:o/isKrisFlyer.class */
public abstract class isKrisFlyer extends getGender implements getSelectedCardOptions {
    public isKrisFlyer() {
        super("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
    }

    @Override // o.getGender
    protected final boolean d(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            e(parcel.readString(), parcel.readString(), (Bundle) getHmStayPeriod.c(parcel, Bundle.CREATOR), parcel.readLong());
            parcel2.writeNoException();
            return true;
        } else if (i != 2) {
            return false;
        } else {
            int e = e();
            parcel2.writeNoException();
            parcel2.writeInt(e);
            return true;
        }
    }
}
