package com.google.android.material.snackbar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
/* loaded from: classes2-dex2jar.jar:com/google/android/material/snackbar/BaseTransientBottomBar$1.class */
final class BaseTransientBottomBar$1 extends AnimatorListenerAdapter {
    final /* synthetic */ BaseTransientBottomBar b;
    final /* synthetic */ int e;

    BaseTransientBottomBar$1(BaseTransientBottomBar baseTransientBottomBar, int i) {
        this.b = baseTransientBottomBar;
        this.e = i;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.b.a(this.e);
    }
}
