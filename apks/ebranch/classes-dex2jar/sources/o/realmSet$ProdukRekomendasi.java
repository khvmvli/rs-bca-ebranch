package o;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.maps.GoogleMapOptions;
import javax.annotation.Nullable;
/* loaded from: classes-dex2jar.jar:o/realmSet$ProdukRekomendasi.class */
public interface realmSet$ProdukRekomendasi extends IInterface {
    void a() throws RemoteException;

    void b() throws RemoteException;

    void b(setBeritaTransaksi setberitatransaksi) throws RemoteException;

    realmSet$noHpKontakPengirim c(realmSet$noHpKontakPengirim realmset_nohpkontakpengirim, realmSet$noHpKontakPengirim realmset_nohpkontakpengirim2, Bundle bundle) throws RemoteException;

    void c() throws RemoteException;

    void d() throws RemoteException;

    void d(Bundle bundle) throws RemoteException;

    void e() throws RemoteException;

    void e(Bundle bundle) throws RemoteException;

    void e(realmSet$noHpKontakPengirim realmset_nohpkontakpengirim, @Nullable GoogleMapOptions googleMapOptions, Bundle bundle) throws RemoteException;

    void h() throws RemoteException;

    void i() throws RemoteException;
}
