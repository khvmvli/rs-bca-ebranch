package o;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
/* loaded from: classes-dex2jar.jar:o/setFlagValueTodayTransaksi.class */
public final class setFlagValueTodayTransaksi extends realmGet$code implements setJenisKodeBankTransaksi {
    /* JADX INFO: Access modifiers changed from: package-private */
    public setFlagValueTodayTransaksi(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.ICreator");
    }

    @Override // o.setJenisKodeBankTransaksi
    public final realmSet$PPUNumber a() throws RemoteException {
        realmSet$PPUNumber realmset_ppunumber;
        Parcel c = c(4, m_());
        IBinder readStrongBinder = c.readStrongBinder();
        if (readStrongBinder == null) {
            realmset_ppunumber = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
            realmset_ppunumber = queryLocalInterface instanceof realmSet$PPUNumber ? (realmSet$PPUNumber) queryLocalInterface : new setFlagFullAmountTransaksi(readStrongBinder);
        }
        c.recycle();
        return realmset_ppunumber;
    }

    @Override // o.setJenisKodeBankTransaksi
    public final realmSet$TipeNasabahPenerima a(realmSet$noHpKontakPengirim realmset_nohpkontakpengirim) throws RemoteException {
        realmSet$TipeNasabahPenerima realmset_tipenasabahpenerima;
        Parcel m_ = m_();
        getAutodebetAccountNumber.c(m_, realmset_nohpkontakpengirim);
        Parcel c = c(8, m_);
        IBinder readStrongBinder = c.readStrongBinder();
        if (readStrongBinder == null) {
            realmset_tipenasabahpenerima = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate");
            realmset_tipenasabahpenerima = queryLocalInterface instanceof realmSet$TipeNasabahPenerima ? (realmSet$TipeNasabahPenerima) queryLocalInterface : new setFlagIBAN(readStrongBinder);
        }
        c.recycle();
        return realmset_tipenasabahpenerima;
    }

    @Override // o.setJenisKodeBankTransaksi
    public final void b(realmSet$noHpKontakPengirim realmset_nohpkontakpengirim, int i) throws RemoteException {
        Parcel m_ = m_();
        getAutodebetAccountNumber.c(m_, realmset_nohpkontakpengirim);
        m_.writeInt(i);
        e(10, m_);
    }

    @Override // o.setJenisKodeBankTransaksi
    public final realmSet$ProdukRekomendasi c(realmSet$noHpKontakPengirim realmset_nohpkontakpengirim) throws RemoteException {
        realmSet$ProdukRekomendasi realmset_produkrekomendasi;
        Parcel m_ = m_();
        getAutodebetAccountNumber.c(m_, realmset_nohpkontakpengirim);
        Parcel c = c(2, m_);
        IBinder readStrongBinder = c.readStrongBinder();
        if (readStrongBinder == null) {
            realmset_produkrekomendasi = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IMapFragmentDelegate");
            realmset_produkrekomendasi = queryLocalInterface instanceof realmSet$ProdukRekomendasi ? (realmSet$ProdukRekomendasi) queryLocalInterface : new setFlagUpdateDaftarTransferPenerima(readStrongBinder);
        }
        c.recycle();
        return realmset_produkrekomendasi;
    }

    @Override // o.setJenisKodeBankTransaksi
    public final int d() throws RemoteException {
        Parcel c = c(9, m_());
        int readInt = c.readInt();
        c.recycle();
        return readInt;
    }

    @Override // o.setJenisKodeBankTransaksi
    public final void d(realmSet$noHpKontakPengirim realmset_nohpkontakpengirim) throws RemoteException {
        Parcel m_ = m_();
        getAutodebetAccountNumber.c(m_, realmset_nohpkontakpengirim);
        e(11, m_);
    }

    @Override // o.setJenisKodeBankTransaksi
    public final getBcaDebitCardType e() throws RemoteException {
        Parcel c = c(5, m_());
        getBcaDebitCardType c2 = getBirthDate.c(c.readStrongBinder());
        c.recycle();
        return c2;
    }

    @Override // o.setJenisKodeBankTransaksi
    public final void e(realmSet$noHpKontakPengirim realmset_nohpkontakpengirim, int i) throws RemoteException {
        Parcel m_ = m_();
        getAutodebetAccountNumber.c(m_, realmset_nohpkontakpengirim);
        m_.writeInt(19000000);
        e(6, m_);
    }
}
