package com.google.android.material.snackbar;

import android.animation.ValueAnimator;
import o.findFragmentByWho;
/* loaded from: classes2-dex2jar.jar:com/google/android/material/snackbar/BaseTransientBottomBar$8.class */
final class BaseTransientBottomBar$8 implements ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ BaseTransientBottomBar b;
    private int c;
    final /* synthetic */ int e;

    BaseTransientBottomBar$8(BaseTransientBottomBar baseTransientBottomBar, int i) {
        this.b = baseTransientBottomBar;
        this.e = i;
        this.c = i;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        if (BaseTransientBottomBar.e) {
            findFragmentByWho.e(this.b.k, intValue - this.c);
        } else {
            this.b.k.setTranslationY((float) intValue);
        }
        this.c = intValue;
    }
}
