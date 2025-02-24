package o;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.provider.Settings;
import android.util.Property;
import java.util.ArrayList;
import java.util.List;
import o.getPivotY;
/* loaded from: classes2-dex2jar.jar:o/HubunganDialog.class */
public abstract class HubunganDialog extends Drawable implements getPivotY {
    private static final Property<HubunganDialog, Float> c = new Property<HubunganDialog, Float>(Float.class, "growFraction") { // from class: o.HubunganDialog.1
        @Override // android.util.Property
        public final /* synthetic */ Float get(HubunganDialog hubunganDialog) {
            return Float.valueOf(hubunganDialog.e());
        }

        @Override // android.util.Property
        public final /* synthetic */ void set(HubunganDialog hubunganDialog, Float f) {
            HubunganDialog hubunganDialog2 = hubunganDialog;
            float floatValue = f.floatValue();
            if (hubunganDialog2.i != floatValue) {
                hubunganDialog2.i = floatValue;
                hubunganDialog2.invalidateSelf();
            }
        }
    };
    final HapusTransaksiWarkatDialog_ViewBinding a;
    List<getPivotY.IconCompatParcelizer> d;
    private ValueAnimator e;
    getPivotY.IconCompatParcelizer f;
    final Context g;
    boolean h;
    float i;
    private ValueAnimator k;
    private float l;
    private boolean m;
    private boolean n;

    /* renamed from: o */
    private int f31o;
    final Paint j = new Paint();
    HapusDaftarTransferDialog_ViewBinding b = new HapusDaftarTransferDialog_ViewBinding();

    public HubunganDialog(Context context, HapusTransaksiWarkatDialog_ViewBinding hapusTransaksiWarkatDialog_ViewBinding) {
        this.g = context;
        this.a = hapusTransaksiWarkatDialog_ViewBinding;
        setAlpha(255);
    }

    private void d(ValueAnimator... valueAnimatorArr) {
        boolean z = this.h;
        this.h = true;
        for (int i = 0; i <= 0; i++) {
            valueAnimatorArr[0].end();
        }
        this.h = z;
    }

    public boolean a(getPivotY.IconCompatParcelizer iconCompatParcelizer) {
        List<getPivotY.IconCompatParcelizer> list = this.d;
        if (list == null || !list.contains(iconCompatParcelizer)) {
            return false;
        }
        this.d.remove(iconCompatParcelizer);
        if (!this.d.isEmpty()) {
            return true;
        }
        this.d = null;
        return true;
    }

    public void b(getPivotY.IconCompatParcelizer iconCompatParcelizer) {
        if (this.d == null) {
            this.d = new ArrayList();
        }
        if (!this.d.contains(iconCompatParcelizer)) {
            this.d.add(iconCompatParcelizer);
        }
    }

    public boolean b() {
        ValueAnimator valueAnimator = this.k;
        return (valueAnimator != null && valueAnimator.isRunning()) || this.m;
    }

    public boolean c() {
        ValueAnimator valueAnimator = this.e;
        return (valueAnimator != null && valueAnimator.isRunning()) || this.n;
    }

    public boolean c(boolean z, boolean z2, boolean z3) {
        if (this.k == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, c, 0.0f, 1.0f);
            this.k = ofFloat;
            ofFloat.setDuration(500L);
            this.k.setInterpolator(unbindViews.d);
            ValueAnimator valueAnimator = this.k;
            if (valueAnimator == null || !valueAnimator.isRunning()) {
                this.k = valueAnimator;
                valueAnimator.addListener(new AnimatorListenerAdapter() { // from class: o.HubunganDialog.5
                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public final void onAnimationStart(Animator animator) {
                        onAnimationStart(animator);
                        HubunganDialog hubunganDialog = HubunganDialog.this;
                        getPivotY.IconCompatParcelizer iconCompatParcelizer = hubunganDialog.f;
                        if (iconCompatParcelizer != null) {
                            iconCompatParcelizer.e(hubunganDialog);
                        }
                        List<getPivotY.IconCompatParcelizer> list = hubunganDialog.d;
                        if (!(list == null || hubunganDialog.h)) {
                            for (getPivotY.IconCompatParcelizer iconCompatParcelizer2 : list) {
                                iconCompatParcelizer2.e(hubunganDialog);
                            }
                        }
                    }
                });
            } else {
                throw new IllegalArgumentException("Cannot set showAnimator while the current showAnimator is running.");
            }
        }
        if (this.e == null) {
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, c, 1.0f, 0.0f);
            this.e = ofFloat2;
            ofFloat2.setDuration(500L);
            this.e.setInterpolator(unbindViews.d);
            ValueAnimator valueAnimator2 = this.e;
            if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
                this.e = valueAnimator2;
                valueAnimator2.addListener(new AnimatorListenerAdapter() { // from class: o.HubunganDialog.2
                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public final void onAnimationEnd(Animator animator) {
                        onAnimationEnd(animator);
                        HubunganDialog.this.setVisible(false, false);
                        HubunganDialog hubunganDialog = HubunganDialog.this;
                        getPivotY.IconCompatParcelizer iconCompatParcelizer = hubunganDialog.f;
                        if (iconCompatParcelizer != null) {
                            iconCompatParcelizer.a(hubunganDialog);
                        }
                        List<getPivotY.IconCompatParcelizer> list = hubunganDialog.d;
                        if (!(list == null || hubunganDialog.h)) {
                            for (getPivotY.IconCompatParcelizer iconCompatParcelizer2 : list) {
                                iconCompatParcelizer2.a(hubunganDialog);
                            }
                        }
                    }
                });
            } else {
                throw new IllegalArgumentException("Cannot set hideAnimator while the current hideAnimator is running.");
            }
        }
        if (!isVisible() && !z) {
            return false;
        }
        ValueAnimator valueAnimator3 = z ? this.k : this.e;
        if (!z3) {
            if (valueAnimator3.isRunning()) {
                valueAnimator3.end();
            } else {
                d(valueAnimator3);
            }
            return setVisible(z, false);
        } else if (z3 && valueAnimator3.isRunning()) {
            return false;
        } else {
            boolean z4 = !z || setVisible(z, false);
            if (!(!z ? this.a.a != 0 : this.a.e != 0)) {
                d(valueAnimator3);
                return z4;
            }
            if (z2 || !valueAnimator3.isPaused()) {
                valueAnimator3.start();
            } else {
                valueAnimator3.resume();
            }
            return z4;
        }
    }

    public boolean d() {
        return d(false, false, false);
    }

    public boolean d(boolean z, boolean z2, boolean z3) {
        return c(z, z2, z3 && Settings.Global.getFloat(this.g.getContentResolver(), "animator_duration_scale", 1.0f) > 0.0f);
    }

    final float e() {
        boolean z = true;
        if (!(this.a.e != 0)) {
            if (this.a.a == 0) {
                z = false;
            }
            if (!z) {
                return 1.0f;
            }
        }
        return (this.n || this.m) ? this.l : this.i;
    }

    final void e(float f) {
        if (this.i != f) {
            this.i = f;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f31o;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public boolean isRunning() {
        return b() || c();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.f31o = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.j.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        return d(z, z2, true);
    }

    public void start() {
        c(true, true, false);
    }

    public void stop() {
        c(false, true, false);
    }
}
