package o;

import android.os.RemoteException;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.RuntimeRemoteException;
/* loaded from: classes-dex2jar.jar:o/realmSet$NamaPenerima.class */
public final class realmSet$NamaPenerima {
    static realmSet$PPUNumber e;

    public static realmSet$NegaraBagianPenerima a(CameraPosition cameraPosition) {
        if (cameraPosition != null) {
            try {
                realmSet$PPUNumber realmset_ppunumber = e;
                if (realmset_ppunumber != null) {
                    return new realmSet$NegaraBagianPenerima(realmset_ppunumber.a(cameraPosition));
                }
                throw new NullPointerException("CameraUpdateFactory is not initialized");
            } catch (RemoteException e2) {
                throw new RuntimeRemoteException(e2);
            }
        } else {
            throw new NullPointerException("cameraPosition must not be null");
        }
    }

    public static realmSet$NegaraBagianPenerima c(LatLng latLng) {
        if (latLng != null) {
            try {
                realmSet$PPUNumber realmset_ppunumber = e;
                if (realmset_ppunumber != null) {
                    return new realmSet$NegaraBagianPenerima(realmset_ppunumber.c(latLng));
                }
                throw new NullPointerException("CameraUpdateFactory is not initialized");
            } catch (RemoteException e2) {
                throw new RuntimeRemoteException(e2);
            }
        } else {
            throw new NullPointerException("latLng must not be null");
        }
    }

    public static realmSet$NegaraBagianPenerima c(LatLngBounds latLngBounds, int i) {
        if (latLngBounds != null) {
            try {
                realmSet$PPUNumber realmset_ppunumber = e;
                if (realmset_ppunumber != null) {
                    return new realmSet$NegaraBagianPenerima(realmset_ppunumber.a(latLngBounds, i));
                }
                throw new NullPointerException("CameraUpdateFactory is not initialized");
            } catch (RemoteException e2) {
                throw new RuntimeRemoteException(e2);
            }
        } else {
            throw new NullPointerException("bounds must not be null");
        }
    }
}
