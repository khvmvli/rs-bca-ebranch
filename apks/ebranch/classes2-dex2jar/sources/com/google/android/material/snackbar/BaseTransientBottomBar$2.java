package com.google.android.material.snackbar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import o.unbindViews;
/* loaded from: classes2-dex2jar.jar:com/google/android/material/snackbar/BaseTransientBottomBar$2.class */
final class BaseTransientBottomBar$2 implements Runnable {
    final /* synthetic */ BaseTransientBottomBar a;

    BaseTransientBottomBar$2(BaseTransientBottomBar baseTransientBottomBar) {
        this.a = baseTransientBottomBar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.a.k != null) {
            if (this.a.k.getParent() != null) {
                this.a.k.setVisibility(0);
            }
            if (this.a.k.e == 1) {
                BaseTransientBottomBar baseTransientBottomBar = this.a;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.setInterpolator(unbindViews.c);
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(baseTransientBottomBar) { // from class: com.google.android.material.snackbar.BaseTransientBottomBar$3
                    final /* synthetic */ BaseTransientBottomBar b;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        this.b = r4;
                    }

                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        this.b.k.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                    }
                });
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.8f, 1.0f);
                ofFloat2.setInterpolator(unbindViews.e);
                ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(baseTransientBottomBar) { // from class: com.google.android.material.snackbar.BaseTransientBottomBar$6
                    final /* synthetic */ BaseTransientBottomBar c;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        this.c = r4;
                    }

                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        this.c.k.setScaleX(floatValue);
                        this.c.k.setScaleY(floatValue);
                    }
                });
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(ofFloat, ofFloat2);
                animatorSet.setDuration(150L);
                animatorSet.addListener(new AnimatorListenerAdapter(baseTransientBottomBar) { // from class: com.google.android.material.snackbar.BaseTransientBottomBar$4
                    final /* synthetic */ BaseTransientBottomBar e;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        this.e = r4;
                    }

                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public final void onAnimationEnd(Animator animator) {
                        this.e.j();
                    }
                });
                animatorSet.start();
                return;
            }
            BaseTransientBottomBar.d(this.a);
        }
    }
}
