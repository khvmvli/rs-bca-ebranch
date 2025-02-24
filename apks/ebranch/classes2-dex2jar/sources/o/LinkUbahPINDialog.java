package o;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.List;
import o.BaseDialogKotlin;
/* loaded from: classes2-dex2jar.jar:o/LinkUbahPINDialog.class */
final class LinkUbahPINDialog {
    Animator a;
    int b;
    int c;
    boolean d;
    final Context e;
    ColorStateList f;
    CharSequence g;
    int h;
    TextView i;
    CharSequence j;
    CharSequence k;
    ColorStateList l;
    int m;
    TextView n;

    /* renamed from: o  reason: collision with root package name */
    boolean f40o;
    Typeface p;
    private LinearLayout q;
    private FrameLayout r;
    final LogoutDialog_ViewBinding s;
    private final float t;
    private int x;

    public LinkUbahPINDialog(LogoutDialog_ViewBinding logoutDialog_ViewBinding) {
        Context context = logoutDialog_ViewBinding.getContext();
        this.e = context;
        this.s = logoutDialog_ViewBinding;
        this.t = (float) context.getResources().getDimensionPixelSize(BaseDialogKotlin.read.k);
    }

    private void e(List<Animator> list, boolean z, TextView textView, int i, int i2, int i3) {
        if (textView != null && z) {
            if (i == i3 || i == i2) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, View.ALPHA, i3 == i ? 1.0f : 0.0f);
                ofFloat.setDuration(167L);
                ofFloat.setInterpolator(unbindViews.c);
                list.add(ofFloat);
                if (i3 == i) {
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(textView, View.TRANSLATION_Y, -this.t, 0.0f);
                    ofFloat2.setDuration(217L);
                    ofFloat2.setInterpolator(unbindViews.e);
                    list.add(ofFloat2);
                }
            }
        }
    }

    final void a() {
        boolean z = true;
        if ((this.q == null || this.s.f == null) ? false : true) {
            EditText editText = this.s.f;
            if (this.e.getResources().getConfiguration().fontScale < 1.3f) {
                z = false;
            }
            LinearLayout linearLayout = this.q;
            int i = BaseDialogKotlin.read.w;
            int t = findFragmentByWho.t(editText);
            if (z) {
                t = this.e.getResources().getDimensionPixelSize(i);
            }
            int i2 = BaseDialogKotlin.read.y;
            int dimensionPixelSize = this.e.getResources().getDimensionPixelSize(BaseDialogKotlin.read.v);
            if (z) {
                dimensionPixelSize = this.e.getResources().getDimensionPixelSize(i2);
            }
            int i3 = BaseDialogKotlin.read.w;
            int s = findFragmentByWho.s(editText);
            if (z) {
                s = this.e.getResources().getDimensionPixelSize(i3);
            }
            findFragmentByWho.c(linearLayout, t, dimensionPixelSize, s, 0);
        }
    }

    final void a(TextView textView, int i) {
        if (this.q == null && this.r == null) {
            LinearLayout linearLayout = new LinearLayout(this.e);
            this.q = linearLayout;
            linearLayout.setOrientation(0);
            this.s.addView(this.q, -1, -2);
            this.r = new FrameLayout(this.e);
            this.q.addView(this.r, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (this.s.f != null) {
                a();
            }
        }
        if (i == 0 || i == 1) {
            this.r.setVisibility(0);
            this.r.addView(textView);
        } else {
            this.q.addView(textView, new LinearLayout.LayoutParams(-2, -2));
        }
        this.q.setVisibility(0);
        this.x++;
    }

    final boolean b() {
        boolean z = true;
        if (this.c != 1 || this.i == null || TextUtils.isEmpty(this.g)) {
            z = false;
        }
        return z;
    }

    final void c() {
        this.g = null;
        Animator animator = this.a;
        if (animator != null) {
            animator.cancel();
        }
        if (this.b == 1) {
            if (!this.f40o || TextUtils.isEmpty(this.k)) {
                this.c = 0;
            } else {
                this.c = 2;
            }
        }
        e(this.b, this.c, e(this.i, null));
    }

    final void c(TextView textView, int i) {
        FrameLayout frameLayout;
        if (this.q != null) {
            if (!(i == 0 || i == 1) || (frameLayout = this.r) == null) {
                this.q.removeView(textView);
            } else {
                frameLayout.removeView(textView);
            }
            int i2 = this.x - 1;
            this.x = i2;
            LinearLayout linearLayout = this.q;
            if (i2 == 0) {
                linearLayout.setVisibility(8);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008b  */
    /* Code decompiled incorrectly, please refer to instructions dump */
    void e(final int r10, final int r11, boolean r12) {
        /*
        // Method dump skipped, instructions count: 314
        */
        throw new UnsupportedOperationException("Method not decompiled: o.LinkUbahPINDialog.e(int, int, boolean):void");
    }

    boolean e(TextView textView, CharSequence charSequence) {
        return findFragmentByWho.G(this.s) && this.s.isEnabled() && (this.c != this.b || textView == null || !TextUtils.equals(textView.getText(), charSequence));
    }
}
