package com.google.android.material.snackbar;

import android.os.Handler;
import o.KetentuanORDialog;
/* loaded from: classes2-dex2jar.jar:com/google/android/material/snackbar/BaseTransientBottomBar$13.class */
final class BaseTransientBottomBar$13 implements KetentuanORDialog.write {
    final /* synthetic */ BaseTransientBottomBar a;

    BaseTransientBottomBar$13(BaseTransientBottomBar baseTransientBottomBar) {
        this.a = baseTransientBottomBar;
    }

    @Override // o.KetentuanORDialog.write
    public final void d() {
        Handler handler = BaseTransientBottomBar.a;
        handler.sendMessage(handler.obtainMessage(0, this.a));
    }

    @Override // o.KetentuanORDialog.write
    public final void e(int i) {
        BaseTransientBottomBar.a.sendMessage(BaseTransientBottomBar.a.obtainMessage(1, i, 0, this.a));
    }
}
