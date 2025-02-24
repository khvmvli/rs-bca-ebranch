package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.List;
import o.ExitReservasiDialog_ViewBinding;
import o.findFragmentByWho;
@Deprecated
/* loaded from: classes2-dex2jar.jar:com/google/android/material/transformation/ExpandableBehavior.class */
public abstract class ExpandableBehavior extends CoordinatorLayout.write<View> {
    int a = 0;

    public ExpandableBehavior() {
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private boolean b(boolean z) {
        boolean z2 = false;
        boolean z3 = false;
        if (z) {
            int i = this.a;
            if (i == 0 || i == 2) {
                z3 = true;
            }
            return z3;
        }
        if (this.a == 1) {
            z2 = true;
        }
        return z2;
    }

    public final boolean b(CoordinatorLayout coordinatorLayout, View view, View view2) {
        ExitReservasiDialog_ViewBinding exitReservasiDialog_ViewBinding = (ExitReservasiDialog_ViewBinding) view2;
        if (!b(exitReservasiDialog_ViewBinding.d())) {
            return false;
        }
        this.a = exitReservasiDialog_ViewBinding.d() ? 1 : 2;
        return d((View) exitReservasiDialog_ViewBinding, view, exitReservasiDialog_ViewBinding.d(), true);
    }

    protected abstract boolean d(View view, View view2, boolean z, boolean z2);

    public final boolean e(CoordinatorLayout coordinatorLayout, final View view, int i) {
        final ExitReservasiDialog_ViewBinding exitReservasiDialog_ViewBinding;
        if (findFragmentByWho.G(view)) {
            return false;
        }
        List a = coordinatorLayout.a(view);
        int size = a.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                exitReservasiDialog_ViewBinding = null;
                break;
            }
            View view2 = (View) a.get(i2);
            if (c(view, view2)) {
                exitReservasiDialog_ViewBinding = (ExitReservasiDialog_ViewBinding) view2;
                break;
            }
            i2++;
        }
        if (exitReservasiDialog_ViewBinding == null || !b(exitReservasiDialog_ViewBinding.d())) {
            return false;
        }
        final int i3 = exitReservasiDialog_ViewBinding.d() ? 1 : 2;
        this.a = i3;
        view.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() { // from class: com.google.android.material.transformation.ExpandableBehavior.1
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public final boolean onPreDraw() {
                view.getViewTreeObserver().removeOnPreDrawListener(this);
                if (ExpandableBehavior.this.a != i3) {
                    return false;
                }
                ExpandableBehavior expandableBehavior = ExpandableBehavior.this;
                ExitReservasiDialog_ViewBinding exitReservasiDialog_ViewBinding2 = exitReservasiDialog_ViewBinding;
                expandableBehavior.d((View) exitReservasiDialog_ViewBinding2, view, exitReservasiDialog_ViewBinding2.d(), false);
                return false;
            }
        });
        return false;
    }
}
