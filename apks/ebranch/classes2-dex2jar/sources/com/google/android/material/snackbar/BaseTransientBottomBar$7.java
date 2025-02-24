package com.google.android.material.snackbar;

import android.animation.ValueAnimator;
import o.findFragmentByWho;
/* loaded from: classes2-dex2jar.jar:com/google/android/material/snackbar/BaseTransientBottomBar$7.class */
final class BaseTransientBottomBar$7 implements ValueAnimator.AnimatorUpdateListener {
    private int d = 0;
    final /* synthetic */ BaseTransientBottomBar e;

    BaseTransientBottomBar$7(BaseTransientBottomBar baseTransientBottomBar) {
        this.e = baseTransientBottomBar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        if (BaseTransientBottomBar.e) {
            findFragmentByWho.e(this.e.k, intValue - this.d);
        } else {
            this.e.k.setTranslationY((float) intValue);
        }
        this.d = intValue;
    }
}
