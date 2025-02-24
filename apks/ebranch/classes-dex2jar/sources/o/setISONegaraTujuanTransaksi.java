package o;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import o.Category$$Parcelable;
/* loaded from: classes-dex2jar.jar:o/setISONegaraTujuanTransaksi.class */
public final class setISONegaraTujuanTransaksi extends realmGet$code implements realmSet$StatusPendudukPenerima {
    /* JADX INFO: Access modifiers changed from: package-private */
    public setISONegaraTujuanTransaksi(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.IGoogleMapDelegate");
    }

    @Override // o.realmSet$StatusPendudukPenerima
    public final cascadeDelete a(setNamaBankPenerima setnamabankpenerima) throws RemoteException {
        Parcel m_ = m_();
        getAutodebetAccountNumber.e(m_, setnamabankpenerima);
        Parcel c = c(11, m_);
        cascadeDelete d = Category$$Parcelable.AnonymousClass1.d(c.readStrongBinder());
        c.recycle();
        return d;
    }

    @Override // o.realmSet$StatusPendudukPenerima
    public final realmSet$SumberDanaTransaksiKode a() throws RemoteException {
        realmSet$SumberDanaTransaksiKode realmset_sumberdanatransaksikode;
        Parcel c = c(25, m_());
        IBinder readStrongBinder = c.readStrongBinder();
        if (readStrongBinder == null) {
            realmset_sumberdanatransaksikode = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
            realmset_sumberdanatransaksikode = queryLocalInterface instanceof realmSet$SumberDanaTransaksiKode ? (realmSet$SumberDanaTransaksiKode) queryLocalInterface : new setFlagSimpanDaftarTransferPenerima(readStrongBinder);
        }
        c.recycle();
        return realmset_sumberdanatransaksikode;
    }

    @Override // o.realmSet$StatusPendudukPenerima
    public final void a(int i) throws RemoteException {
        Parcel m_ = m_();
        m_.writeInt(i);
        e(16, m_);
    }

    @Override // o.realmSet$StatusPendudukPenerima
    public final void b(realmSet$noHpKontakPengirim realmset_nohpkontakpengirim) throws RemoteException {
        Parcel m_ = m_();
        getAutodebetAccountNumber.c(m_, realmset_nohpkontakpengirim);
        e(5, m_);
    }

    @Override // o.realmSet$StatusPendudukPenerima
    public final realmSet$SumberDanaTransaksi c() throws RemoteException {
        realmSet$SumberDanaTransaksi realmset_sumberdanatransaksi;
        Parcel c = c(26, m_());
        IBinder readStrongBinder = c.readStrongBinder();
        if (readStrongBinder == null) {
            realmset_sumberdanatransaksi = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IProjectionDelegate");
            realmset_sumberdanatransaksi = queryLocalInterface instanceof realmSet$SumberDanaTransaksi ? (realmSet$SumberDanaTransaksi) queryLocalInterface : new setFlagSettleViaBankPenerima(readStrongBinder);
        }
        c.recycle();
        return realmset_sumberdanatransaksi;
    }

    @Override // o.realmSet$StatusPendudukPenerima
    public final void c(AbstractC0033setBankBicKey setbankbickey) throws RemoteException {
        Parcel m_ = m_();
        getAutodebetAccountNumber.c(m_, setbankbickey);
        e(86, m_);
    }

    @Override // o.realmSet$StatusPendudukPenerima
    public final void c(setFlagHubunganKeuanganTransaksi setflaghubungankeuangantransaksi) throws RemoteException {
        Parcel m_ = m_();
        getAutodebetAccountNumber.c(m_, setflaghubungankeuangantransaksi);
        e(30, m_);
    }

    @Override // o.realmSet$StatusPendudukPenerima
    public final void d(realmSet$noHpKontakPengirim realmset_nohpkontakpengirim) throws RemoteException {
        Parcel m_ = m_();
        getAutodebetAccountNumber.c(m_, realmset_nohpkontakpengirim);
        e(4, m_);
    }

    @Override // o.realmSet$StatusPendudukPenerima
    public final getAutodebetPercentage e(setKotaBankPenerima setkotabankpenerima) throws RemoteException {
        Parcel m_ = m_();
        getAutodebetAccountNumber.e(m_, setkotabankpenerima);
        Parcel c = c(35, m_);
        getAutodebetPercentage a = getBcaAccountNumber.a(c.readStrongBinder());
        c.recycle();
        return a;
    }

    @Override // o.realmSet$StatusPendudukPenerima
    public final void e(boolean z) throws RemoteException {
        Parcel m_ = m_();
        int i = getAutodebetAccountNumber.e;
        m_.writeInt(z ? 1 : 0);
        e(22, m_);
    }
}
