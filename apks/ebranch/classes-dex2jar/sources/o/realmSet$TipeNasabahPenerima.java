package o;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.maps.StreetViewPanoramaOptions;
import javax.annotation.Nullable;
/* loaded from: classes-dex2jar.jar:o/realmSet$TipeNasabahPenerima.class */
public interface realmSet$TipeNasabahPenerima extends IInterface {
    realmSet$noHpKontakPengirim a(realmSet$noHpKontakPengirim realmset_nohpkontakpengirim, realmSet$noHpKontakPengirim realmset_nohpkontakpengirim2, Bundle bundle) throws RemoteException;

    void a() throws RemoteException;

    void a(Bundle bundle) throws RemoteException;

    void a(setFlagAlamatBankPenerimaBelumSesuai setflagalamatbankpenerimabelumsesuai) throws RemoteException;

    void b() throws RemoteException;

    void b(realmSet$noHpKontakPengirim realmset_nohpkontakpengirim, @Nullable StreetViewPanoramaOptions streetViewPanoramaOptions, @Nullable Bundle bundle) throws RemoteException;

    void c() throws RemoteException;

    void d() throws RemoteException;

    void e() throws RemoteException;

    void e(Bundle bundle) throws RemoteException;

    void f() throws RemoteException;

    void g() throws RemoteException;
}
