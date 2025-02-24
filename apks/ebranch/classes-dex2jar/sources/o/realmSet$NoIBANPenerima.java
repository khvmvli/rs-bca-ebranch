package o;

import android.graphics.Point;
import android.os.RemoteException;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.RuntimeRemoteException;
/* loaded from: classes-dex2jar.jar:o/realmSet$NoIBANPenerima.class */
public final class realmSet$NoIBANPenerima {
    private final realmSet$SumberDanaTransaksi b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public realmSet$NoIBANPenerima(realmSet$SumberDanaTransaksi realmset_sumberdanatransaksi) {
        this.b = realmset_sumberdanatransaksi;
    }

    public final Point c(LatLng latLng) {
        if (latLng != null) {
            try {
                return (Point) realmSet$jenisWarkatTransaksi.e(this.b.e(latLng));
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        } else {
            throw new NullPointerException("null reference");
        }
    }

    public final LatLng e(Point point) {
        if (point != null) {
            try {
                return this.b.e(new realmSet$jenisWarkatTransaksi(point));
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        } else {
            throw new NullPointerException("null reference");
        }
    }
}
