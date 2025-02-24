package o;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.maps.model.LatLng;
import javax.annotation.Nullable;
/* loaded from: classes-dex2jar.jar:o/cascadeDelete.class */
public interface cascadeDelete extends IInterface {
    int a() throws RemoteException;

    LatLng b() throws RemoteException;

    void d() throws RemoteException;

    void d(@Nullable realmSet$noHpKontakPengirim realmset_nohpkontakpengirim) throws RemoteException;

    boolean d(cascadeDelete cascadedelete) throws RemoteException;

    void e() throws RemoteException;

    void j() throws RemoteException;
}
