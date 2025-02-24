package o;

import android.os.IInterface;
import android.os.RemoteException;
/* loaded from: classes-dex2jar.jar:o/setMetodePengirimanPenerima.class */
public interface setMetodePengirimanPenerima extends IInterface {
    void b(realmSet$accountNumber realmset_accountnumber) throws RemoteException;

    void d(realmSet$expired realmset_expired) throws RemoteException;

    void e(realmSet$FlagHubunganKeuanganTransaksi realmset_flaghubungankeuangantransaksi, setBiayaTransfer setbiayatransfer, String str) throws RemoteException;

    void e(boolean z) throws RemoteException;
}
