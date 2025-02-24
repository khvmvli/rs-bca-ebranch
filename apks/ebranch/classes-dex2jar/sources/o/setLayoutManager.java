package o;

import android.os.Bundle;
import androidx.savedstate.Recreator;
import o.onRequestPermissionsResult;
/* loaded from: classes-dex2jar.jar:o/setLayoutManager.class */
public final class setLayoutManager {
    private final setLayoutFrozen a;
    public final setOnFlingListener b = new setOnFlingListener();

    private setLayoutManager(setLayoutFrozen setlayoutfrozen) {
        this.a = setlayoutfrozen;
    }

    public static setLayoutManager c(setLayoutFrozen setlayoutfrozen) {
        return new setLayoutManager(setlayoutfrozen);
    }

    public final setOnFlingListener d() {
        return this.b;
    }

    public final void d(Bundle bundle) {
        this.b.c(bundle);
    }

    public final void e(Bundle bundle) {
        onRequestPermissionsResult lifecycle = this.a.getLifecycle();
        if (lifecycle.a() == onRequestPermissionsResult.read.INITIALIZED) {
            lifecycle.c(new Recreator(this.a));
            this.b.d(lifecycle, bundle);
            return;
        }
        throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
    }
}
