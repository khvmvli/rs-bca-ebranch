package com.google.android.material.snackbar;

import android.view.ViewTreeObserver;
/* loaded from: classes2-dex2jar.jar:com/google/android/material/snackbar/BaseTransientBottomBar$15.class */
final class BaseTransientBottomBar$15 implements ViewTreeObserver.OnGlobalLayoutListener {
    final /* synthetic */ BaseTransientBottomBar d;

    BaseTransientBottomBar$15(BaseTransientBottomBar baseTransientBottomBar) {
        this.d = baseTransientBottomBar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        if (this.d.c) {
            BaseTransientBottomBar baseTransientBottomBar = this.d;
            baseTransientBottomBar.i = baseTransientBottomBar.a();
            BaseTransientBottomBar.b(this.d);
        }
    }
}
