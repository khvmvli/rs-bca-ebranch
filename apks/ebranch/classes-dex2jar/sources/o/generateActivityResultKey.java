package o;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;
/* loaded from: classes-dex2jar.jar:o/generateActivityResultKey.class */
public final class generateActivityResultKey {
    private WeakReference<View> d;
    Runnable c = null;
    Runnable e = null;
    int a = -1;

    /* JADX INFO: Access modifiers changed from: package-private */
    public generateActivityResultKey(View view) {
        this.d = new WeakReference<>(view);
    }

    private void c(final View view, final getAllowReturnTransitionOverlap getallowreturntransitionoverlap) {
        if (getallowreturntransitionoverlap != null) {
            view.animate().setListener(new AnimatorListenerAdapter() { // from class: o.generateActivityResultKey.3
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationCancel(Animator animator) {
                    getallowreturntransitionoverlap.d(view);
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    getallowreturntransitionoverlap.c(view);
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationStart(Animator animator) {
                    getallowreturntransitionoverlap.b(view);
                }
            });
        } else {
            view.animate().setListener(null);
        }
    }

    public final long a() {
        View view = this.d.get();
        if (view != null) {
            return view.animate().getDuration();
        }
        return 0;
    }

    public final generateActivityResultKey a(long j) {
        View view = this.d.get();
        if (view != null) {
            view.animate().setDuration(j);
        }
        return this;
    }

    public final generateActivityResultKey b(long j) {
        View view = this.d.get();
        if (view != null) {
            view.animate().setStartDelay(j);
        }
        return this;
    }

    public final generateActivityResultKey c(float f) {
        View view = this.d.get();
        if (view != null) {
            view.animate().translationY(f);
        }
        return this;
    }

    public final void c() {
        View view = this.d.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public final generateActivityResultKey d(getAllowReturnTransitionOverlap getallowreturntransitionoverlap) {
        View view = this.d.get();
        if (view != null) {
            c(view, getallowreturntransitionoverlap);
        }
        return this;
    }

    public final generateActivityResultKey d(final getAnimator getanimator) {
        final View view = this.d.get();
        if (view != null) {
            view.animate().setUpdateListener(getanimator != null ? new ValueAnimator.AnimatorUpdateListener() { // from class: o.generateActivityResultKey.1
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    getanimator.d();
                }
            } : null);
        }
        return this;
    }

    public final void d() {
        View view = this.d.get();
        if (view != null) {
            view.animate().start();
        }
    }

    public final generateActivityResultKey e(float f) {
        View view = this.d.get();
        if (view != null) {
            view.animate().alpha(f);
        }
        return this;
    }

    public final generateActivityResultKey e(Interpolator interpolator) {
        View view = this.d.get();
        if (view != null) {
            view.animate().setInterpolator(interpolator);
        }
        return this;
    }
}
