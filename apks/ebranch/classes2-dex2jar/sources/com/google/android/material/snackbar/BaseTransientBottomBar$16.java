package com.google.android.material.snackbar;

import android.os.Build;
import android.view.WindowInsets;
import o.KetentuanORDialog;
/* loaded from: classes2-dex2jar.jar:com/google/android/material/snackbar/BaseTransientBottomBar$16.class */
final class BaseTransientBottomBar$16 implements BaseTransientBottomBar$MediaBrowserCompat$CustomActionResultReceiver {
    final /* synthetic */ BaseTransientBottomBar c;

    BaseTransientBottomBar$16(BaseTransientBottomBar baseTransientBottomBar) {
        this.c = baseTransientBottomBar;
    }

    @Override // com.google.android.material.snackbar.BaseTransientBottomBar$MediaBrowserCompat$CustomActionResultReceiver
    public final void b() {
        WindowInsets rootWindowInsets;
        if (Build.VERSION.SDK_INT >= 29 && (rootWindowInsets = this.c.k.getRootWindowInsets()) != null) {
            this.c.g = rootWindowInsets.getMandatorySystemGestureInsets().bottom;
            BaseTransientBottomBar.b(this.c);
        }
    }

    @Override // com.google.android.material.snackbar.BaseTransientBottomBar$MediaBrowserCompat$CustomActionResultReceiver
    public final void c() {
        BaseTransientBottomBar baseTransientBottomBar = this.c;
        if (KetentuanORDialog.e == null) {
            KetentuanORDialog.e = new KetentuanORDialog();
        }
        if (KetentuanORDialog.e.e(baseTransientBottomBar.o)) {
            BaseTransientBottomBar.a.post(new Runnable() { // from class: com.google.android.material.snackbar.BaseTransientBottomBar$16.5
                @Override // java.lang.Runnable
                public final void run() {
                    BaseTransientBottomBar$16.this.c.a(3);
                }
            });
        }
    }
}
