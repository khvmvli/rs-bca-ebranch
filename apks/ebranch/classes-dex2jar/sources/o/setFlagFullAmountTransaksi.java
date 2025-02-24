package o;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
/* loaded from: classes-dex2jar.jar:o/setFlagFullAmountTransaksi.class */
public final class setFlagFullAmountTransaksi extends realmGet$code implements realmSet$PPUNumber {
    /* JADX INFO: Access modifiers changed from: package-private */
    public setFlagFullAmountTransaksi(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
    }

    @Override // o.realmSet$PPUNumber
    public final realmSet$noHpKontakPengirim a(CameraPosition cameraPosition) throws RemoteException {
        Parcel m_ = m_();
        getAutodebetAccountNumber.e(m_, cameraPosition);
        Parcel c = c(7, m_);
        realmSet$noHpKontakPengirim d = realmSet$noHpKontakPengirim$MediaBrowserCompat$CustomActionResultReceiver.d(c.readStrongBinder());
        c.recycle();
        return d;
    }

    @Override // o.realmSet$PPUNumber
    public final realmSet$noHpKontakPengirim a(LatLngBounds latLngBounds, int i) throws RemoteException {
        Parcel m_ = m_();
        getAutodebetAccountNumber.e(m_, latLngBounds);
        m_.writeInt(i);
        Parcel c = c(10, m_);
        realmSet$noHpKontakPengirim d = realmSet$noHpKontakPengirim$MediaBrowserCompat$CustomActionResultReceiver.d(c.readStrongBinder());
        c.recycle();
        return d;
    }

    @Override // o.realmSet$PPUNumber
    public final realmSet$noHpKontakPengirim c(LatLng latLng) throws RemoteException {
        Parcel m_ = m_();
        getAutodebetAccountNumber.e(m_, latLng);
        Parcel c = c(8, m_);
        realmSet$noHpKontakPengirim d = realmSet$noHpKontakPengirim$MediaBrowserCompat$CustomActionResultReceiver.d(c.readStrongBinder());
        c.recycle();
        return d;
    }
}
