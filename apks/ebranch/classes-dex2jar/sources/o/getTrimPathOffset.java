package o;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.os.Build;
/* loaded from: classes-dex2jar.jar:o/getTrimPathOffset.class */
final class getTrimPathOffset {
    private static final boolean a = true;
    private static final boolean b = true;
    private static final boolean d;

    static {
        d = Build.VERSION.SDK_INT >= 28;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Animator e(Animator animator, Animator animator2) {
        if (animator == null) {
            return animator2;
        }
        if (animator2 == null) {
            return animator;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(animator, animator2);
        return animatorSet;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01c2  */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public static android.view.View e(android.view.ViewGroup r7, android.view.View r8, android.view.View r9) {
        /*
        // Method dump skipped, instructions count: 498
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getTrimPathOffset.e(android.view.ViewGroup, android.view.View, android.view.View):android.view.View");
    }
}
