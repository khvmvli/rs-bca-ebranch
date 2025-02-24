package com.google.android.material.snackbar;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;
import o.KetentuanORDialog;
/* loaded from: classes2-dex2jar.jar:com/google/android/material/snackbar/BaseTransientBottomBar$Behavior.class */
public class BaseTransientBottomBar$Behavior extends SwipeDismissBehavior<View> {
    final BaseTransientBottomBar$read j = new BaseTransientBottomBar$read(this);

    @Override // com.google.android.material.behavior.SwipeDismissBehavior
    public final boolean a(View view) {
        return view instanceof BaseTransientBottomBar$RemoteActionCompatParcelizer;
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior
    public final boolean c(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        BaseTransientBottomBar$read baseTransientBottomBar$read = this.j;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                if (KetentuanORDialog.e == null) {
                    KetentuanORDialog.e = new KetentuanORDialog();
                }
                KetentuanORDialog.e.c(baseTransientBottomBar$read.c);
            }
        } else if (coordinatorLayout.c(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
            if (KetentuanORDialog.e == null) {
                KetentuanORDialog.e = new KetentuanORDialog();
            }
            KetentuanORDialog.e.a(baseTransientBottomBar$read.c);
        }
        return c(coordinatorLayout, view, motionEvent);
    }
}
