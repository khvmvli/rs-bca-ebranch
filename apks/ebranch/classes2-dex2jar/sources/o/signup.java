package o;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import java.util.ArrayList;
/* loaded from: classes2-dex2jar.jar:o/signup.class */
public final class signup {
    public final ArrayList<IconCompatParcelizer> b = new ArrayList<>();
    public IconCompatParcelizer a = null;
    public ValueAnimator d = null;
    public final Animator.AnimatorListener e = new AnimatorListenerAdapter() { // from class: o.signup.5
        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            if (signup.this.d == animator) {
                signup.this.d = null;
            }
        }
    };

    /* loaded from: classes2-dex2jar.jar:o/signup$IconCompatParcelizer.class */
    public static final class IconCompatParcelizer {
        public final ValueAnimator c;
        public final int[] e;

        public IconCompatParcelizer(int[] iArr, ValueAnimator valueAnimator) {
            this.e = iArr;
            this.c = valueAnimator;
        }
    }
}
