package o;

import android.os.Parcel;
import android.os.RemoteException;
import o.Category$$Parcelable;
/* loaded from: classes-dex2jar.jar:o/setAlamatBankPenerima.class */
public abstract class setAlamatBankPenerima extends Category$$Parcelable implements AbstractC0033setBankBicKey {
    public setAlamatBankPenerima() {
        super("com.google.android.gms.maps.internal.IOnInfoWindowCloseListener");
    }

    @Override // o.Category$$Parcelable
    public final boolean c(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        cascadeDelete d = Category$$Parcelable.AnonymousClass1.d(parcel.readStrongBinder());
        getAutodebetAccountNumber.c(parcel);
        d(d);
        parcel2.writeNoException();
        return true;
    }
}
