package com.google.android.material.snackbar;

import android.os.Bundle;
import android.view.View;
import o.getChildFragmentManager;
import o.onDismiss;
/* loaded from: classes2-dex2jar.jar:com/google/android/material/snackbar/BaseTransientBottomBar$14.class */
final class BaseTransientBottomBar$14 extends onDismiss {
    final /* synthetic */ BaseTransientBottomBar a;

    BaseTransientBottomBar$14(BaseTransientBottomBar baseTransientBottomBar) {
        this.a = baseTransientBottomBar;
    }

    public final void b(View view, getChildFragmentManager getchildfragmentmanager) {
        b(view, getchildfragmentmanager);
        getchildfragmentmanager.e(1048576);
        getchildfragmentmanager.g(true);
    }

    public final boolean b(View view, int i, Bundle bundle) {
        if (i != 1048576) {
            return b(view, i, bundle);
        }
        this.a.d();
        return true;
    }
}
