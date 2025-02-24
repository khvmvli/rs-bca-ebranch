package o;

import android.animation.ValueAnimator;
/* loaded from: classes2-dex2jar.jar:o/LogoutDialog_ViewBinding$1.class */
final class LogoutDialog_ViewBinding$1 implements ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ LogoutDialog_ViewBinding b;

    LogoutDialog_ViewBinding$1(LogoutDialog_ViewBinding logoutDialog_ViewBinding) {
        this.b = logoutDialog_ViewBinding;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.b.d.e(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
