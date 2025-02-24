package o;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.StrictMode;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.model.RuntimeRemoteException;
/* loaded from: classes-dex2jar.jar:o/setNominalTransaksi.class */
public final class setNominalTransaksi implements realmSet$TujuanTransaksi {
    private final Fragment b;
    private final realmSet$ProdukRekomendasi d;

    public setNominalTransaksi(Fragment fragment, realmSet$ProdukRekomendasi realmset_produkrekomendasi) {
        this.d = (realmSet$ProdukRekomendasi) setFotoKtp.b(realmset_produkrekomendasi);
        this.b = (Fragment) setFotoKtp.b(fragment);
    }

    @Override // o.realmSet$hasManyPenerima
    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        try {
            Bundle bundle2 = new Bundle();
            setFlagKodeAutoCompletePenerima.c(bundle, bundle2);
            StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitAll().build());
            realmSet$noHpKontakPengirim c = this.d.c(realmSet$jenisWarkatTransaksi.d(layoutInflater), realmSet$jenisWarkatTransaksi.d(viewGroup), bundle2);
            StrictMode.setThreadPolicy(threadPolicy);
            setFlagKodeAutoCompletePenerima.c(bundle2, bundle);
            return (View) realmSet$jenisWarkatTransaksi.e(c);
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

    public final void a(realmSet$NegaraTujuanTransaksi realmset_negaratujuantransaksi) {
        try {
            this.d.b(new setProdukRekomendasi(this, realmset_negaratujuantransaksi));
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
            this.d.c();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    @Override // o.realmSet$hasManyPenerima
    public final void c(Bundle bundle) {
        try {
            Bundle bundle2 = new Bundle();
            setFlagKodeAutoCompletePenerima.c(bundle, bundle2);
            this.d.d(bundle2);
            setFlagKodeAutoCompletePenerima.c(bundle2, bundle);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    @Override // o.realmSet$hasManyPenerima
    public final void d() {
        try {
            this.d.b();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    @Override // o.realmSet$hasManyPenerima
    public final void d(Activity activity, Bundle bundle, Bundle bundle2) {
        GoogleMapOptions googleMapOptions = (GoogleMapOptions) bundle.getParcelable("MapOptions");
        try {
            Bundle bundle3 = new Bundle();
            setFlagKodeAutoCompletePenerima.c(bundle2, bundle3);
            this.d.e(realmSet$jenisWarkatTransaksi.d(activity), googleMapOptions, bundle3);
            setFlagKodeAutoCompletePenerima.c(bundle3, bundle2);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    @Override // o.realmSet$hasManyPenerima
    public final void e() {
        try {
            this.d.a();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    @Override // o.realmSet$hasManyPenerima
    public final void e(Bundle bundle) {
        try {
            Bundle bundle2 = new Bundle();
            setFlagKodeAutoCompletePenerima.c(bundle, bundle2);
            Bundle arguments = this.b.getArguments();
            if (arguments != null && arguments.containsKey("MapOptions")) {
                setFlagKodeAutoCompletePenerima.c(bundle2, "MapOptions", arguments.getParcelable("MapOptions"));
            }
            this.d.e(bundle2);
            setFlagKodeAutoCompletePenerima.c(bundle2, bundle);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    @Override // o.realmSet$hasManyPenerima
    public final void h() {
        try {
            this.d.h();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    @Override // o.realmSet$hasManyPenerima
    public final void j() {
        try {
            this.d.i();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }
}
