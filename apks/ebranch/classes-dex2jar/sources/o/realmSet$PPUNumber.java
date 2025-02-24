package o;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
/* loaded from: classes-dex2jar.jar:o/realmSet$PPUNumber.class */
public interface realmSet$PPUNumber extends IInterface {
    realmSet$noHpKontakPengirim a(CameraPosition cameraPosition) throws RemoteException;

    realmSet$noHpKontakPengirim a(LatLngBounds latLngBounds, int i) throws RemoteException;

    realmSet$noHpKontakPengirim c(LatLng latLng) throws RemoteException;
}
