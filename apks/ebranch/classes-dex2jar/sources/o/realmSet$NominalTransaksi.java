package o;

import android.app.Activity;
import android.os.Bundle;
import android.os.StrictMode;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
/* loaded from: classes-dex2jar.jar:o/realmSet$NominalTransaksi.class */
public class realmSet$NominalTransaksi extends Fragment {
    private final setTipeTujuanTransaksiPenerima d = new setTipeTujuanTransaksiPenerima(this);

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        ClassLoader classLoader = realmSet$NominalTransaksi.class.getClassLoader();
        if (!(bundle == null || classLoader == null)) {
            bundle.setClassLoader(classLoader);
        }
        onActivityCreated(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        onAttach(activity);
        setTipeTujuanTransaksiPenerima.b(this.d, activity);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        onCreate(bundle);
        this.d.d(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return this.d.d(layoutInflater, viewGroup, bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        this.d.b();
        onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.d.a();
        onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public void onInflate(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitAll().build());
        try {
            onInflate(activity, attributeSet, bundle);
            setTipeTujuanTransaksiPenerima.b(this.d, activity);
            this.d.d(activity, new Bundle(), bundle);
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onLowMemory() {
        this.d.d();
        onLowMemory();
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        this.d.e();
        onPause();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        onResume();
        this.d.j();
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        ClassLoader classLoader = realmSet$NominalTransaksi.class.getClassLoader();
        if (!(bundle == null || classLoader == null)) {
            bundle.setClassLoader(classLoader);
        }
        onSaveInstanceState(bundle);
        this.d.c(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        onStart();
        this.d.i();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        this.d.g();
        onStop();
    }

    @Override // androidx.fragment.app.Fragment
    public void setArguments(Bundle bundle) {
        setArguments(bundle);
    }
}
