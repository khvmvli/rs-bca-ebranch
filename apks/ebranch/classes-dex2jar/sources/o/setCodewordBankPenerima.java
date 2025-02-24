package o;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
/* loaded from: classes-dex2jar.jar:o/setCodewordBankPenerima.class */
public abstract class setCodewordBankPenerima extends Category$$Parcelable implements setFlagAlamatBankPenerimaBelumSesuai {
    public setCodewordBankPenerima() {
        super("com.google.android.gms.maps.internal.IOnStreetViewPanoramaReadyCallback");
    }

    @Override // o.Category$$Parcelable
    public final boolean c(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        realmSet$TipeTujuanTransaksiPenerima realmset_tipetujuantransaksipenerima;
        if (i != 1) {
            return false;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        if (readStrongBinder == null) {
            realmset_tipetujuantransaksipenerima = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
            realmset_tipetujuantransaksipenerima = queryLocalInterface instanceof realmSet$TipeTujuanTransaksiPenerima ? (realmSet$TipeTujuanTransaksiPenerima) queryLocalInterface : new setFlagPromoCode(readStrongBinder);
        }
        getAutodebetAccountNumber.c(parcel);
        c(realmset_tipetujuantransaksipenerima);
        parcel2.writeNoException();
        return true;
    }
}
