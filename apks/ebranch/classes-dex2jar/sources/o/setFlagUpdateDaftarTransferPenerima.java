package o;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.maps.GoogleMapOptions;
/* loaded from: classes-dex2jar.jar:o/setFlagUpdateDaftarTransferPenerima.class */
public final class setFlagUpdateDaftarTransferPenerima extends realmGet$code implements realmSet$ProdukRekomendasi {
    /* JADX INFO: Access modifiers changed from: package-private */
    public setFlagUpdateDaftarTransferPenerima(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.IMapFragmentDelegate");
    }

    @Override // o.realmSet$ProdukRekomendasi
    public final void a() throws RemoteException {
        e(5, m_());
    }

    @Override // o.realmSet$ProdukRekomendasi
    public final void b() throws RemoteException {
        e(9, m_());
    }

    @Override // o.realmSet$ProdukRekomendasi
    public final void b(setBeritaTransaksi setberitatransaksi) throws RemoteException {
        Parcel m_ = m_();
        getAutodebetAccountNumber.c(m_, setberitatransaksi);
        e(12, m_);
    }

    @Override // o.realmSet$ProdukRekomendasi
    public final realmSet$noHpKontakPengirim c(realmSet$noHpKontakPengirim realmset_nohpkontakpengirim, realmSet$noHpKontakPengirim realmset_nohpkontakpengirim2, Bundle bundle) throws RemoteException {
        Parcel m_ = m_();
        getAutodebetAccountNumber.c(m_, realmset_nohpkontakpengirim);
        getAutodebetAccountNumber.c(m_, realmset_nohpkontakpengirim2);
        getAutodebetAccountNumber.e(m_, bundle);
        Parcel c = c(4, m_);
        realmSet$noHpKontakPengirim d = realmSet$noHpKontakPengirim$MediaBrowserCompat$CustomActionResultReceiver.d(c.readStrongBinder());
        c.recycle();
        return d;
    }

    @Override // o.realmSet$ProdukRekomendasi
    public final void c() throws RemoteException {
        e(6, m_());
    }

    @Override // o.realmSet$ProdukRekomendasi
    public final void d() throws RemoteException {
        e(7, m_());
    }

    @Override // o.realmSet$ProdukRekomendasi
    public final void d(Bundle bundle) throws RemoteException {
        Parcel m_ = m_();
        getAutodebetAccountNumber.e(m_, bundle);
        Parcel c = c(10, m_);
        if (c.readInt() != 0) {
            bundle.readFromParcel(c);
        }
        c.recycle();
    }

    @Override // o.realmSet$ProdukRekomendasi
    public final void e() throws RemoteException {
        e(8, m_());
    }

    @Override // o.realmSet$ProdukRekomendasi
    public final void e(Bundle bundle) throws RemoteException {
        Parcel m_ = m_();
        getAutodebetAccountNumber.e(m_, bundle);
        e(3, m_);
    }

    @Override // o.realmSet$ProdukRekomendasi
    public final void e(realmSet$noHpKontakPengirim realmset_nohpkontakpengirim, GoogleMapOptions googleMapOptions, Bundle bundle) throws RemoteException {
        Parcel m_ = m_();
        getAutodebetAccountNumber.c(m_, realmset_nohpkontakpengirim);
        getAutodebetAccountNumber.e(m_, googleMapOptions);
        getAutodebetAccountNumber.e(m_, bundle);
        e(2, m_);
    }

    @Override // o.realmSet$ProdukRekomendasi
    public final void h() throws RemoteException {
        e(15, m_());
    }

    @Override // o.realmSet$ProdukRekomendasi
    public final void i() throws RemoteException {
        e(16, m_());
    }
}
