package com.google.android.material.snackbar;

import android.util.DisplayMetrics;
import android.util.Log;
import android.view.ViewGroup;
import android.view.WindowManager;
/* loaded from: classes2-dex2jar.jar:com/google/android/material/snackbar/BaseTransientBottomBar$11.class */
final class BaseTransientBottomBar$11 implements Runnable {
    final /* synthetic */ BaseTransientBottomBar d;

    BaseTransientBottomBar$11(BaseTransientBottomBar baseTransientBottomBar) {
        this.d = baseTransientBottomBar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.d.k != null && this.d.h != null) {
            WindowManager windowManager = (WindowManager) this.d.h.getSystemService("window");
            DisplayMetrics displayMetrics = new DisplayMetrics();
            windowManager.getDefaultDisplay().getRealMetrics(displayMetrics);
            int a = (displayMetrics.heightPixels - BaseTransientBottomBar.a(this.d)) + ((int) this.d.k.getTranslationY());
            if (a < this.d.g) {
                ViewGroup.LayoutParams layoutParams = this.d.k.getLayoutParams();
                if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                    Log.w(BaseTransientBottomBar.b, "Unable to apply gesture inset because layout params are not MarginLayoutParams");
                    return;
                }
                ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin += this.d.g - a;
                this.d.k.requestLayout();
            }
        }
    }
}
