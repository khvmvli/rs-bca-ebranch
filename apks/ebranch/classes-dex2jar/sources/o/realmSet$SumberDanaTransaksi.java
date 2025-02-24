package o;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.maps.model.LatLng;
/* loaded from: classes-dex2jar.jar:o/realmSet$SumberDanaTransaksi.class */
public interface realmSet$SumberDanaTransaksi extends IInterface {
    LatLng e(realmSet$noHpKontakPengirim realmset_nohpkontakpengirim) throws RemoteException;

    realmSet$noHpKontakPengirim e(LatLng latLng) throws RemoteException;
}
