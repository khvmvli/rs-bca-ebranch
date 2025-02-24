package o;

import android.os.IInterface;
import android.os.RemoteException;
/* loaded from: classes-dex2jar.jar:o/setJenisKodeBankTransaksi.class */
public interface setJenisKodeBankTransaksi extends IInterface {
    realmSet$PPUNumber a() throws RemoteException;

    realmSet$TipeNasabahPenerima a(realmSet$noHpKontakPengirim realmset_nohpkontakpengirim) throws RemoteException;

    void b(realmSet$noHpKontakPengirim realmset_nohpkontakpengirim, int i) throws RemoteException;

    realmSet$ProdukRekomendasi c(realmSet$noHpKontakPengirim realmset_nohpkontakpengirim) throws RemoteException;

    int d() throws RemoteException;

    void d(realmSet$noHpKontakPengirim realmset_nohpkontakpengirim) throws RemoteException;

    getBcaDebitCardType e() throws RemoteException;

    void e(realmSet$noHpKontakPengirim realmset_nohpkontakpengirim, int i) throws RemoteException;
}
