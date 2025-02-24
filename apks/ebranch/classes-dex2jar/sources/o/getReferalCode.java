package o;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
/* loaded from: classes-dex2jar.jar:o/getReferalCode.class */
public abstract class getReferalCode extends getGender implements getTotalSupplementCard {
    public getReferalCode() {
        super("com.google.android.gms.measurement.api.internal.IBundleReceiver");
    }

    @Override // o.getGender
    protected final boolean d(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        c((Bundle) getHmStayPeriod.c(parcel, Bundle.CREATOR));
        parcel2.writeNoException();
        return true;
    }
}
