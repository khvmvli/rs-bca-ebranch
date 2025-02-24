package o;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.StrictMode;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import java.util.ArrayList;
import java.util.List;
import o.KirimanUang$$Parcelable;
/* loaded from: classes-dex2jar.jar:o/realmSet$NorekPenerima.class */
public class realmSet$NorekPenerima extends Fragment {
    public final KirimanUang$$Parcelable.AnonymousClass1 a = new AbstractC0025realmSet$namaPengirim(this) { // from class: o.KirimanUang$$Parcelable.1
        protected realmSet$namaKontakPengirim a;
        private final Fragment b;
        private Activity d;
        private final List e = new ArrayList();

        /* JADX INFO: Access modifiers changed from: package-private */
        {
            this.b = r5;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public static /* synthetic */ void d(AnonymousClass1 r3, Activity activity) {
            r3.d = activity;
            r3.h();
        }

        public final void d(realmSet$NegaraTujuanTransaksi realmset_negaratujuantransaksi) {
            if (c() != null) {
                ((setNominalTransaksi) c()).a(realmset_negaratujuantransaksi);
            } else {
                this.e.add(realmset_negaratujuantransaksi);
            }
        }

        @Override // o.AbstractC0025realmSet$namaPengirim
        public final void d(realmSet$namaKontakPengirim realmset_namakontakpengirim) {
            this.a = realmset_namakontakpengirim;
            h();
        }

        public final void h() {
            if (this.d != null && this.a != null && c() == null) {
                try {
                    realmSet$NegaraTujuanPenerima.a(this.d);
                    realmSet$ProdukRekomendasi c = setJenisMataUangTransaksi.c(this.d, null).c(realmSet$jenisWarkatTransaksi.d(this.d));
                    if (c != null) {
                        this.a.a(new setNominalTransaksi(this.b, c));
                        for (realmSet$NegaraTujuanTransaksi realmset_negaratujuantransaksi : this.e) {
                            ((setNominalTransaksi) c()).a(realmset_negaratujuantransaksi);
                        }
                        this.e.clear();
                    }
                } catch (RemoteException e) {
                    throw new RuntimeRemoteException(e);
                } catch (GooglePlayServicesNotAvailableException e2) {
                }
            }
        }
    };

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        ClassLoader classLoader = realmSet$NorekPenerima.class.getClassLoader();
        if (!(bundle == null || classLoader == null)) {
            bundle.setClassLoader(classLoader);
        }
        onActivityCreated(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        onAttach(activity);
        KirimanUang$$Parcelable.AnonymousClass1.d(this.a, activity);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitAll().build());
        try {
            onCreate(bundle);
            this.a.d(bundle);
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View d = this.a.d(layoutInflater, viewGroup, bundle);
        d.setClickable(true);
        return d;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        this.a.b();
        onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.a.a();
        onDestroyView();
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x0354  */
    @Override // androidx.fragment.app.Fragment
    /* Code decompiled incorrectly, please refer to instructions dump */
    public void onInflate(android.app.Activity r7, android.util.AttributeSet r8, android.os.Bundle r9) {
        /*
        // Method dump skipped, instructions count: 1130
        */
        throw new UnsupportedOperationException("Method not decompiled: o.realmSet$NorekPenerima.onInflate(android.app.Activity, android.util.AttributeSet, android.os.Bundle):void");
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onLowMemory() {
        this.a.d();
        onLowMemory();
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        this.a.e();
        onPause();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        onResume();
        this.a.j();
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        ClassLoader classLoader = realmSet$NorekPenerima.class.getClassLoader();
        if (!(bundle == null || classLoader == null)) {
            bundle.setClassLoader(classLoader);
        }
        onSaveInstanceState(bundle);
        this.a.c(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        onStart();
        this.a.i();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        this.a.g();
        onStop();
    }

    @Override // androidx.fragment.app.Fragment
    public void setArguments(Bundle bundle) {
        setArguments(bundle);
    }
}
