package com.google.android.material.snackbar;

import android.view.View;
import androidx.core.view.WindowInsetsCompat;
import o.instantiate;
/* loaded from: classes2-dex2jar.jar:com/google/android/material/snackbar/BaseTransientBottomBar$12.class */
final class BaseTransientBottomBar$12 implements instantiate {
    final /* synthetic */ BaseTransientBottomBar b;

    BaseTransientBottomBar$12(BaseTransientBottomBar baseTransientBottomBar) {
        this.b = baseTransientBottomBar;
    }

    public final WindowInsetsCompat d(View view, WindowInsetsCompat windowInsetsCompat) {
        this.b.f = windowInsetsCompat.j();
        this.b.j = windowInsetsCompat.i();
        this.b.m = windowInsetsCompat.f();
        BaseTransientBottomBar.b(this.b);
        return windowInsetsCompat;
    }
}
