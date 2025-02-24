package o;

import android.os.RemoteException;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.RuntimeRemoteException;
/* loaded from: classes-dex2jar.jar:o/setLimitMaxNominalTransaksi.class */
public class setLimitMaxNominalTransaksi {
    protected final cascadeDelete a;

    public setLimitMaxNominalTransaksi(cascadeDelete cascadedelete) {
        if (cascadedelete != null) {
            this.a = cascadedelete;
            return;
        }
        throw new NullPointerException("null reference");
    }

    public final LatLng b() {
        try {
            return this.a.b();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final void b(setKeteranganAlamatBankPenerima setketeranganalamatbankpenerima) {
        try {
            if (setketeranganalamatbankpenerima == null) {
                this.a.d((realmSet$noHpKontakPengirim) null);
                return;
            }
            this.a.d(setketeranganalamatbankpenerima.e);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final void c() {
        try {
            this.a.e();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final void d() {
        try {
            this.a.j();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final void e() {
        try {
            this.a.d();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof setLimitMaxNominalTransaksi)) {
            return false;
        }
        try {
            return this.a.d(((setLimitMaxNominalTransaksi) obj).a);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public int hashCode() {
        try {
            return this.a.a();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }
}
