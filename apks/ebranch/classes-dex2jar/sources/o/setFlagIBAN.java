package o;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.maps.StreetViewPanoramaOptions;
/* loaded from: classes-dex2jar.jar:o/setFlagIBAN.class */
public final class setFlagIBAN extends realmGet$code implements realmSet$TipeNasabahPenerima {
    /* JADX INFO: Access modifiers changed from: package-private */
    public setFlagIBAN(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate");
    }

    @Override // o.realmSet$TipeNasabahPenerima
    public final realmSet$noHpKontakPengirim a(realmSet$noHpKontakPengirim realmset_nohpkontakpengirim, realmSet$noHpKontakPengirim realmset_nohpkontakpengirim2, Bundle bundle) throws RemoteException {
        Parcel m_ = m_();
        getAutodebetAccountNumber.c(m_, realmset_nohpkontakpengirim);
        getAutodebetAccountNumber.c(m_, realmset_nohpkontakpengirim2);
        getAutodebetAccountNumber.e(m_, bundle);
        Parcel c = c(4, m_);
        realmSet$noHpKontakPengirim d = realmSet$noHpKontakPengirim$MediaBrowserCompat$CustomActionResultReceiver.d(c.readStrongBinder());
        c.recycle();
        return d;
    }

    @Override // o.realmSet$TipeNasabahPenerima
    public final void a() throws RemoteException {
        e(6, m_());
    }

    @Override // o.realmSet$TipeNasabahPenerima
    public final void a(Bundle bundle) throws RemoteException {
        Parcel m_ = m_();
        getAutodebetAccountNumber.e(m_, bundle);
        e(3, m_);
    }

    @Override // o.realmSet$TipeNasabahPenerima
    public final void a(setFlagAlamatBankPenerimaBelumSesuai setflagalamatbankpenerimabelumsesuai) throws RemoteException {
        Parcel m_ = m_();
        getAutodebetAccountNumber.c(m_, setflagalamatbankpenerimabelumsesuai);
        e(12, m_);
    }

    @Override // o.realmSet$TipeNasabahPenerima
    public final void b() throws RemoteException {
        e(5, m_());
    }

    @Override // o.realmSet$TipeNasabahPenerima
    public final void b(realmSet$noHpKontakPengirim realmset_nohpkontakpengirim, StreetViewPanoramaOptions streetViewPanoramaOptions, Bundle bundle) throws RemoteException {
        Parcel m_ = m_();
        getAutodebetAccountNumber.c(m_, realmset_nohpkontakpengirim);
        getAutodebetAccountNumber.e(m_, streetViewPanoramaOptions);
        getAutodebetAccountNumber.e(m_, bundle);
        e(2, m_);
    }

    @Override // o.realmSet$TipeNasabahPenerima
    public final void c() throws RemoteException {
        e(9, m_());
    }

    @Override // o.realmSet$TipeNasabahPenerima
    public final void d() throws RemoteException {
        e(7, m_());
    }

    @Override // o.realmSet$TipeNasabahPenerima
    public final void e() throws RemoteException {
        e(8, m_());
    }

    @Override // o.realmSet$TipeNasabahPenerima
    public final void e(Bundle bundle) throws RemoteException {
        Parcel m_ = m_();
        getAutodebetAccountNumber.e(m_, bundle);
        Parcel c = c(10, m_);
        if (c.readInt() != 0) {
            bundle.readFromParcel(c);
        }
        c.recycle();
    }

    @Override // o.realmSet$TipeNasabahPenerima
    public final void f() throws RemoteException {
        e(13, m_());
    }

    @Override // o.realmSet$TipeNasabahPenerima
    public final void g() throws RemoteException {
        e(14, m_());
    }
}
