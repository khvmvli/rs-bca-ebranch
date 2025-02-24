package o;

import android.os.Parcel;
import android.os.RemoteException;
import o.Category$$Parcelable;
/* loaded from: classes-dex2jar.jar:o/setFlagBicCode.class */
public abstract class setFlagBicCode extends Category$$Parcelable implements setFlagHubunganKeuanganTransaksi {
    public setFlagBicCode() {
        super("com.google.android.gms.maps.internal.IOnMarkerClickListener");
    }

    @Override // o.Category$$Parcelable
    public final boolean c(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        cascadeDelete d = Category$$Parcelable.AnonymousClass1.d(parcel.readStrongBinder());
        getAutodebetAccountNumber.c(parcel);
        boolean d2 = d(d);
        parcel2.writeNoException();
        parcel2.writeInt(d2 ? 1 : 0);
        return true;
    }
}
