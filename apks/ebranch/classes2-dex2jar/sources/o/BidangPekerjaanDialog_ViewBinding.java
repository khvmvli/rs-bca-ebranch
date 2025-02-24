package o;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
/* loaded from: classes2-dex2jar.jar:o/BidangPekerjaanDialog_ViewBinding.class */
public final class BidangPekerjaanDialog_ViewBinding {
    int a;
    int b;
    public TimeInterpolator c;
    public long d;
    public long e;

    public BidangPekerjaanDialog_ViewBinding(long j, long j2) {
        this.c = null;
        this.b = 0;
        this.a = 1;
        this.d = j;
        this.e = 150;
    }

    public BidangPekerjaanDialog_ViewBinding(long j, long j2, TimeInterpolator timeInterpolator) {
        this.b = 0;
        this.a = 1;
        this.d = j;
        this.e = j2;
        this.c = timeInterpolator;
    }

    public final void b(Animator animator) {
        animator.setStartDelay(this.d);
        animator.setDuration(this.e);
        TimeInterpolator timeInterpolator = this.c;
        TimeInterpolator timeInterpolator2 = timeInterpolator;
        if (timeInterpolator == null) {
            timeInterpolator2 = unbindViews.d;
        }
        animator.setInterpolator(timeInterpolator2);
        if (animator instanceof ValueAnimator) {
            ValueAnimator valueAnimator = (ValueAnimator) animator;
            valueAnimator.setRepeatCount(this.b);
            valueAnimator.setRepeatMode(this.a);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BidangPekerjaanDialog_ViewBinding)) {
            return false;
        }
        BidangPekerjaanDialog_ViewBinding bidangPekerjaanDialog_ViewBinding = (BidangPekerjaanDialog_ViewBinding) obj;
        if (this.d != bidangPekerjaanDialog_ViewBinding.d || this.e != bidangPekerjaanDialog_ViewBinding.e || this.b != bidangPekerjaanDialog_ViewBinding.b || this.a != bidangPekerjaanDialog_ViewBinding.a) {
            return false;
        }
        TimeInterpolator timeInterpolator = this.c;
        TimeInterpolator timeInterpolator2 = timeInterpolator;
        if (timeInterpolator == null) {
            timeInterpolator2 = unbindViews.d;
        }
        Class<?> cls = timeInterpolator2.getClass();
        TimeInterpolator timeInterpolator3 = bidangPekerjaanDialog_ViewBinding.c;
        TimeInterpolator timeInterpolator4 = timeInterpolator3;
        if (timeInterpolator3 == null) {
            timeInterpolator4 = unbindViews.d;
        }
        return cls.equals(timeInterpolator4.getClass());
    }

    public final int hashCode() {
        long j = this.d;
        int i = (int) (j ^ (j >>> 32));
        long j2 = this.e;
        int i2 = (int) (j2 ^ (j2 >>> 32));
        TimeInterpolator timeInterpolator = this.c;
        TimeInterpolator timeInterpolator2 = timeInterpolator;
        if (timeInterpolator == null) {
            timeInterpolator2 = unbindViews.d;
        }
        return (((((((i * 31) + i2) * 31) + timeInterpolator2.getClass().hashCode()) * 31) + this.b) * 31) + this.a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("\n");
        sb.append(getClass().getName());
        sb.append('{');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" delay: ");
        sb.append(this.d);
        sb.append(" duration: ");
        sb.append(this.e);
        sb.append(" interpolator: ");
        TimeInterpolator timeInterpolator = this.c;
        TimeInterpolator timeInterpolator2 = timeInterpolator;
        if (timeInterpolator == null) {
            timeInterpolator2 = unbindViews.d;
        }
        sb.append(timeInterpolator2.getClass());
        sb.append(" repeatCount: ");
        sb.append(this.b);
        sb.append(" repeatMode: ");
        sb.append(this.a);
        sb.append("}\n");
        return sb.toString();
    }
}
