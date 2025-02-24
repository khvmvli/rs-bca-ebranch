package o;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.maps.model.LatLng;
/* loaded from: classes-dex2jar.jar:o/setFlagSettleViaBankPenerima.class */
public final class setFlagSettleViaBankPenerima extends realmGet$code implements realmSet$SumberDanaTransaksi {
    /* JADX INFO: Access modifiers changed from: package-private */
    public setFlagSettleViaBankPenerima(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.IProjectionDelegate");
    }

    @Override // o.realmSet$SumberDanaTransaksi
    public final LatLng e(realmSet$noHpKontakPengirim realmset_nohpkontakpengirim) throws RemoteException {
        Parcel m_ = m_();
        getAutodebetAccountNumber.c(m_, realmset_nohpkontakpengirim);
        Parcel c = c(1, m_);
        LatLng latLng = (LatLng) getAutodebetAccountNumber.e(c, LatLng.CREATOR);
        c.recycle();
        return latLng;
    }

    @Override // o.realmSet$SumberDanaTransaksi
    public final realmSet$noHpKontakPengirim e(LatLng latLng) throws RemoteException {
        Parcel m_ = m_();
        getAutodebetAccountNumber.e(m_, latLng);
        Parcel c = c(2, m_);
        realmSet$noHpKontakPengirim d = realmSet$noHpKontakPengirim$MediaBrowserCompat$CustomActionResultReceiver.d(c.readStrongBinder());
        c.recycle();
        return d;
    }
}
