package o;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.view.View;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;
import o.BaseDialogKotlin;
/* loaded from: classes2-dex2jar.jar:o/onClickBtnCancel.class */
public final class onClickBtnCancel extends FingerprintDialog {

    /* loaded from: classes2-dex2jar.jar:o/onClickBtnCancel$read.class */
    static final class read extends JenisKodeBankDialog {
        read(JenisPekerjaanDialog jenisPekerjaanDialog) {
            super(jenisPekerjaanDialog);
        }

        @Override // o.JenisKodeBankDialog, android.graphics.drawable.Drawable
        public final boolean isStateful() {
            return true;
        }
    }

    public onClickBtnCancel(FloatingActionButton floatingActionButton, IsiPernyataanDialog isiPernyataanDialog) {
        super(floatingActionButton, isiPernyataanDialog);
    }

    private Animator c(float f, float f2) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ObjectAnimator.ofFloat(this.G, "elevation", f).setDuration(0L)).with(ObjectAnimator.ofFloat(this.G, View.TRANSLATION_Z, f2).setDuration(100L));
        animatorSet.setInterpolator(a);
        return animatorSet;
    }

    @Override // o.FingerprintDialog
    public final float b() {
        return this.G.getElevation();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.FingerprintDialog
    public final void b(ColorStateList colorStateList) {
        if (this.w instanceof RippleDrawable) {
            ((RippleDrawable) this.w).setColor(InfoDialog_ViewBinding.d(colorStateList));
        } else {
            b(colorStateList);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.FingerprintDialog
    public final void b(int[] iArr) {
        if (Build.VERSION.SDK_INT != 21) {
            return;
        }
        if (this.G.isEnabled()) {
            this.G.setElevation(this.m);
            if (this.G.isPressed()) {
                this.G.setTranslationZ(this.u);
            } else if (this.G.isFocused() || this.G.isHovered()) {
                this.G.setTranslationZ(this.q);
            } else {
                this.G.setTranslationZ(0.0f);
            }
        } else {
            this.G.setElevation(0.0f);
            this.G.setTranslationZ(0.0f);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.FingerprintDialog
    public final void c() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.FingerprintDialog
    public final void c(ColorStateList colorStateList, PorterDuff.Mode mode, ColorStateList colorStateList2, int i) {
        Drawable drawable;
        this.C = new read(this.z);
        this.C.setTintList(colorStateList);
        if (mode != null) {
            this.C.setTintMode(mode);
        }
        this.C.b(this.G.getContext());
        if (i > 0) {
            Context context = this.G.getContext();
            onClickBtnOk onclickbtnok = new onClickBtnOk(this.z);
            int a = copyWindowDataInto.a(context, BaseDialogKotlin.RemoteActionCompatParcelizer.e);
            int a2 = copyWindowDataInto.a(context, BaseDialogKotlin.RemoteActionCompatParcelizer.c);
            int a3 = copyWindowDataInto.a(context, BaseDialogKotlin.RemoteActionCompatParcelizer.d);
            int a4 = copyWindowDataInto.a(context, BaseDialogKotlin.RemoteActionCompatParcelizer.b);
            onclickbtnok.j = a;
            onclickbtnok.h = a2;
            onclickbtnok.a = a3;
            onclickbtnok.d = a4;
            float f = (float) i;
            if (onclickbtnok.e != f) {
                onclickbtnok.e = f;
                onclickbtnok.c.setStrokeWidth(f * 1.3333f);
                onclickbtnok.b = true;
                onclickbtnok.invalidateSelf();
            }
            onclickbtnok.e(colorStateList);
            this.f = onclickbtnok;
            drawable = new LayerDrawable(new Drawable[]{this.f, this.C});
        } else {
            this.f = null;
            drawable = this.C;
        }
        this.w = new RippleDrawable(InfoDialog_ViewBinding.d(colorStateList2), drawable, null);
        this.j = this.w;
    }

    @Override // o.FingerprintDialog
    final JenisKodeBankDialog e() {
        return new read(this.z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.FingerprintDialog
    public final void e(float f, float f2, float f3) {
        if (Build.VERSION.SDK_INT == 21) {
            this.G.refreshDrawableState();
        } else {
            StateListAnimator stateListAnimator = new StateListAnimator();
            stateListAnimator.addState(i, c(f, f3));
            stateListAnimator.addState(h, c(f, f2));
            stateListAnimator.addState(b, c(f, f2));
            stateListAnimator.addState(c, c(f, f2));
            AnimatorSet animatorSet = new AnimatorSet();
            ArrayList arrayList = new ArrayList();
            arrayList.add(ObjectAnimator.ofFloat(this.G, "elevation", f).setDuration(0L));
            if (Build.VERSION.SDK_INT >= 22 && Build.VERSION.SDK_INT <= 24) {
                arrayList.add(ObjectAnimator.ofFloat(this.G, View.TRANSLATION_Z, this.G.getTranslationZ()).setDuration(100L));
            }
            arrayList.add(ObjectAnimator.ofFloat(this.G, View.TRANSLATION_Z, 0.0f).setDuration(100L));
            animatorSet.playSequentially((Animator[]) arrayList.toArray(new Animator[0]));
            animatorSet.setInterpolator(a);
            stateListAnimator.addState(e, animatorSet);
            stateListAnimator.addState(d, c(0.0f, 0.0f));
            this.G.setStateListAnimator(stateListAnimator);
        }
        boolean z = true;
        if (!this.y.c()) {
            z = true;
            if (l()) {
                z = false;
            }
        }
        if (z) {
            k();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.FingerprintDialog
    public final void e(Rect rect) {
        if (this.y.c()) {
            e(rect);
        } else if (!l()) {
            int i = this.s;
            FloatingActionButton floatingActionButton = this.G;
            int c = (i - floatingActionButton.c(floatingActionButton.h)) / 2;
            rect.set(c, c, c, c);
        } else {
            rect.set(0, 0, 0, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.FingerprintDialog
    public final void f() {
        k();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.FingerprintDialog
    public final boolean g() {
        return false;
    }

    @Override // o.FingerprintDialog
    final boolean i() {
        return this.y.c() || !l();
    }

    @Override // o.FingerprintDialog
    final void o() {
    }
}
