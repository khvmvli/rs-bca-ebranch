package o;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
/* loaded from: classes-dex2jar.jar:o/onCreateAnimator.class */
public class onCreateAnimator implements setLayoutFrozen, performStart {
    private final performPrimaryNavigationFragmentChanged d;
    private final Fragment e;
    performCreate c = null;
    setLayoutManager b = null;

    public onCreateAnimator(Fragment fragment, performPrimaryNavigationFragmentChanged performprimarynavigationfragmentchanged) {
        this.e = fragment;
        this.d = performprimarynavigationfragmentchanged;
    }

    public final void a(Bundle bundle) {
        this.b.e(bundle);
    }

    public final void c() {
        if (this.c == null) {
            this.c = new performCreate(this);
            this.b = setLayoutManager.c(this);
        }
    }

    public final void c(onRequestPermissionsResult$MediaBrowserCompat$CustomActionResultReceiver onrequestpermissionsresult_mediabrowsercompat_customactionresultreceiver) {
        performCreate performcreate = this.c;
        performcreate.b("handleLifecycleEvent");
        performcreate.b(onrequestpermissionsresult_mediabrowsercompat_customactionresultreceiver.e());
    }

    public final boolean e() {
        return this.c != null;
    }

    @Override // o.performContextItemSelected
    public onRequestPermissionsResult getLifecycle() {
        if (this.c == null) {
            this.c = new performCreate(this);
            this.b = setLayoutManager.c(this);
        }
        return this.c;
    }

    @Override // o.setLayoutFrozen
    public setOnFlingListener getSavedStateRegistry() {
        if (this.c == null) {
            this.c = new performCreate(this);
            this.b = setLayoutManager.c(this);
        }
        return this.b.b;
    }

    @Override // o.performStart
    public performPrimaryNavigationFragmentChanged getViewModelStore() {
        if (this.c == null) {
            this.c = new performCreate(this);
            this.b = setLayoutManager.c(this);
        }
        return this.d;
    }
}
