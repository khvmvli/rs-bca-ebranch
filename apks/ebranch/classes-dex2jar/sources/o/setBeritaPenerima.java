package o;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
/* loaded from: classes-dex2jar.jar:o/setBeritaPenerima.class */
public final class setBeritaPenerima extends realmSet$statusKewarganegaraanPenerima implements setMetodePengirimanPenerima {
    /* JADX INFO: Access modifiers changed from: package-private */
    public setBeritaPenerima(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.location.internal.IGoogleLocationManagerService");
    }

    @Override // o.setMetodePengirimanPenerima
    public final void b(realmSet$accountNumber realmset_accountnumber) throws RemoteException {
        Parcel b = b();
        CCOtherBankCreditCard.c(b, realmset_accountnumber);
        c(59, b);
    }

    @Override // o.setMetodePengirimanPenerima
    public final void d(realmSet$expired realmset_expired) throws RemoteException {
        Parcel b = b();
        CCOtherBankCreditCard.c(b, realmset_expired);
        c(75, b);
    }

    @Override // o.setMetodePengirimanPenerima
    public final void e(realmSet$FlagHubunganKeuanganTransaksi realmset_flaghubungankeuangantransaksi, setBiayaTransfer setbiayatransfer, String str) throws RemoteException {
        Parcel b = b();
        CCOtherBankCreditCard.c(b, realmset_flaghubungankeuangantransaksi);
        CCOtherBankCreditCard.d(b, setbiayatransfer);
        b.writeString(null);
        c(63, b);
    }

    @Override // o.setMetodePengirimanPenerima
    public final void e(boolean z) throws RemoteException {
        Parcel b = b();
        CCOtherBankCreditCard.e(b, z);
        c(12, b);
    }
}
