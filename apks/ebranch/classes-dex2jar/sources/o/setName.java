package o;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
/* loaded from: classes-dex2jar.jar:o/setName.class */
public final class setName extends getBankTujuanCode implements setOfficeName {
    /* JADX INFO: Access modifiers changed from: package-private */
    public setName(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IGoogleCertificatesApi");
    }

    @Override // o.setOfficeName
    public final realmGet$token a(C0021realmGet$sumberDanaTransaksi realmget_sumberdanatransaksi) throws RemoteException {
        Parcel b = b();
        getBiayaTransfer.e(b, realmget_sumberdanatransaksi);
        Parcel a = a(8, b);
        realmGet$token realmget_token = (realmGet$token) getBiayaTransfer.a(a, realmGet$token.CREATOR);
        a.recycle();
        return realmget_token;
    }

    @Override // o.setOfficeName
    public final realmGet$token c(C0021realmGet$sumberDanaTransaksi realmget_sumberdanatransaksi) throws RemoteException {
        Parcel b = b();
        getBiayaTransfer.e(b, realmget_sumberdanatransaksi);
        Parcel a = a(6, b);
        realmGet$token realmget_token = (realmGet$token) getBiayaTransfer.a(a, realmGet$token.CREATOR);
        a.recycle();
        return realmget_token;
    }

    @Override // o.setOfficeName
    public final boolean c() throws RemoteException {
        Parcel a = a(7, b());
        boolean b = getBiayaTransfer.b(a);
        a.recycle();
        return b;
    }

    @Override // o.setOfficeName
    public final boolean d(realmGet$totalNominal realmget_totalnominal, realmSet$noHpKontakPengirim realmset_nohpkontakpengirim) throws RemoteException {
        Parcel b = b();
        getBiayaTransfer.e(b, realmget_totalnominal);
        getBiayaTransfer.b(b, realmset_nohpkontakpengirim);
        Parcel a = a(5, b);
        boolean b2 = getBiayaTransfer.b(a);
        a.recycle();
        return b2;
    }
}
