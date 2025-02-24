package o;

import android.os.IInterface;
import android.os.RemoteException;
import javax.annotation.Nullable;
/* loaded from: classes-dex2jar.jar:o/realmSet$StatusPendudukPenerima.class */
public interface realmSet$StatusPendudukPenerima extends IInterface {
    cascadeDelete a(setNamaBankPenerima setnamabankpenerima) throws RemoteException;

    realmSet$SumberDanaTransaksiKode a() throws RemoteException;

    void a(int i) throws RemoteException;

    void b(realmSet$noHpKontakPengirim realmset_nohpkontakpengirim) throws RemoteException;

    realmSet$SumberDanaTransaksi c() throws RemoteException;

    void c(@Nullable AbstractC0033setBankBicKey setbankbickey) throws RemoteException;

    void c(@Nullable setFlagHubunganKeuanganTransaksi setflaghubungankeuangantransaksi) throws RemoteException;

    void d(realmSet$noHpKontakPengirim realmset_nohpkontakpengirim) throws RemoteException;

    getAutodebetPercentage e(setKotaBankPenerima setkotabankpenerima) throws RemoteException;

    void e(boolean z) throws RemoteException;
}
