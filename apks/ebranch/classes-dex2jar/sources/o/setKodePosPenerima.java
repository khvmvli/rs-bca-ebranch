package o;

import android.os.RemoteException;
import com.google.android.gms.maps.model.RuntimeRemoteException;
/* loaded from: classes-dex2jar.jar:o/setKodePosPenerima.class */
public final class setKodePosPenerima {
    public final getAutodebetPercentage b;

    public setKodePosPenerima(getAutodebetPercentage getautodebetpercentage) {
        if (getautodebetpercentage != null) {
            this.b = getautodebetpercentage;
            return;
        }
        throw new NullPointerException("null reference");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof setKodePosPenerima)) {
            return false;
        }
        try {
            return this.b.a(((setKodePosPenerima) obj).b);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final int hashCode() {
        try {
            return this.b.a();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }
}
