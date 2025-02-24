package com.google.android.material.snackbar;

import android.view.View;
import com.google.android.material.behavior.SwipeDismissBehavior$MediaBrowserCompat$CustomActionResultReceiver;
import o.KetentuanORDialog;
/* loaded from: classes2-dex2jar.jar:com/google/android/material/snackbar/BaseTransientBottomBar$19.class */
final class BaseTransientBottomBar$19 implements SwipeDismissBehavior$MediaBrowserCompat$CustomActionResultReceiver {
    final /* synthetic */ BaseTransientBottomBar d;

    BaseTransientBottomBar$19(BaseTransientBottomBar baseTransientBottomBar) {
        this.d = baseTransientBottomBar;
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior$MediaBrowserCompat$CustomActionResultReceiver
    public final void c(int i) {
        if (i == 0) {
            if (KetentuanORDialog.e == null) {
                KetentuanORDialog.e = new KetentuanORDialog();
            }
            KetentuanORDialog.e.c(this.d.o);
        } else if (i == 1 || i == 2) {
            if (KetentuanORDialog.e == null) {
                KetentuanORDialog.e = new KetentuanORDialog();
            }
            KetentuanORDialog.e.a(this.d.o);
        }
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior$MediaBrowserCompat$CustomActionResultReceiver
    public final void d(View view) {
        if (view.getParent() != null) {
            view.setVisibility(8);
        }
        BaseTransientBottomBar baseTransientBottomBar = this.d;
        if (KetentuanORDialog.e == null) {
            KetentuanORDialog.e = new KetentuanORDialog();
        }
        KetentuanORDialog.e.c(baseTransientBottomBar.o, 0);
    }
}
