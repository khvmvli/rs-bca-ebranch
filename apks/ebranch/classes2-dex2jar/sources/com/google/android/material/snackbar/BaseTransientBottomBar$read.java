package com.google.android.material.snackbar;

import com.google.android.material.behavior.SwipeDismissBehavior;
import o.KetentuanORDialog;
/* loaded from: classes2-dex2jar.jar:com/google/android/material/snackbar/BaseTransientBottomBar$read.class */
public final class BaseTransientBottomBar$read {
    KetentuanORDialog.write c;

    public BaseTransientBottomBar$read(SwipeDismissBehavior<?> swipeDismissBehavior) {
        swipeDismissBehavior.a = Math.min(Math.max(0.0f, 0.1f), 1.0f);
        swipeDismissBehavior.c = Math.min(Math.max(0.0f, 0.6f), 1.0f);
        swipeDismissBehavior.d = 0;
    }
}
