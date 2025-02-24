package o;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.google.android.gms.maps.model.RuntimeRemoteException;
/* loaded from: classes-dex2jar.jar:o/setTypeOfProduct.class */
final class setTypeOfProduct implements realmSet$TujuanTransaksiKode {
    private final realmSet$TipeNasabahPenerima d;
    private final Fragment e;

    public setTypeOfProduct(Fragment fragment, realmSet$TipeNasabahPenerima realmset_tipenasabahpenerima) {
        this.d = (realmSet$TipeNasabahPenerima) setFotoKtp.b(realmset_tipenasabahpenerima);
        this.e = (Fragment) setFotoKtp.b(fragment);
    }

    @Override // o.realmSet$hasManyPenerima
    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        try {
            Bundle bundle2 = new Bundle();
            setFlagKodeAutoCompletePenerima.c(bundle, bundle2);
            realmSet$noHpKontakPengirim a = this.d.a(realmSet$jenisWarkatTransaksi.d(layoutInflater), realmSet$jenisWarkatTransaksi.d(viewGroup), bundle2);
            setFlagKodeAutoCompletePenerima.c(bundle2, bundle);
            return (View) realmSet$jenisWarkatTransaksi.e(a);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    @Override // o.realmSet$hasManyPenerima
    public final void a() {
        try {
            this.d.e();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    @Override // o.realmSet$hasManyPenerima
    public final void b() {
        try {
            this.d.d();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    @Override // o.realmSet$hasManyPenerima
    public final void c() {
        try {
            this.d.a();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    @Override // o.realmSet$hasManyPenerima
    public final void c(Bundle bundle) {
        try {
            Bundle bundle2 = new Bundle();
            setFlagKodeAutoCompletePenerima.c(bundle, bundle2);
            this.d.e(bundle2);
            setFlagKodeAutoCompletePenerima.c(bundle2, bundle);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    @Override // o.realmSet$hasManyPenerima
    public final void d() {
        try {
            this.d.c();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    @Override // o.realmSet$hasManyPenerima
    public final void d(Activity activity, Bundle bundle, Bundle bundle2) {
        try {
            Bundle bundle3 = new Bundle();
            setFlagKodeAutoCompletePenerima.c(bundle2, bundle3);
            this.d.b(realmSet$jenisWarkatTransaksi.d(activity), null, bundle3);
            setFlagKodeAutoCompletePenerima.c(bundle3, bundle2);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    @Override // o.realmSet$hasManyPenerima
    public final void e() {
        try {
            this.d.b();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    @Override // o.realmSet$hasManyPenerima
    public final void e(Bundle bundle) {
        try {
            Bundle bundle2 = new Bundle();
            setFlagKodeAutoCompletePenerima.c(bundle, bundle2);
            Bundle arguments = this.e.getArguments();
            if (arguments != null && arguments.containsKey("StreetViewPanoramaOptions")) {
                setFlagKodeAutoCompletePenerima.c(bundle2, "StreetViewPanoramaOptions", arguments.getParcelable("StreetViewPanoramaOptions"));
            }
            this.d.a(bundle2);
            setFlagKodeAutoCompletePenerima.c(bundle2, bundle);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final void e(realmSet$NoHpPengirim realmset_nohppengirim) {
        try {
            this.d.a(new setTujuanTransaksiKode(this, realmset_nohppengirim));
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    @Override // o.realmSet$hasManyPenerima
    public final void h() {
        try {
            this.d.f();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    @Override // o.realmSet$hasManyPenerima
    public final void j() {
        try {
            this.d.g();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }
}
