package o;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.graphics.Color;
import android.util.Property;
import o.getPivotY;
import org.joda.time.DateTimeConstants;
/* loaded from: classes2-dex2jar.jar:o/HapusWarkatBerhasilDialog.class */
final class HapusWarkatBerhasilDialog extends onSelectHari<ObjectAnimator> {
    ObjectAnimator a;
    float b;
    final HapusTransaksiWarkatDialog_ViewBinding c;
    float d;
    private ObjectAnimator l;
    private static final int[] n = {0, 1350, 2700, 4050};

    /* renamed from: o  reason: collision with root package name */
    private static final int[] f30o = {667, 2017, 3367, 4717};
    private static final int[] k = {DateTimeConstants.MILLIS_PER_SECOND, 2350, 3700, 5050};
    private static final Property<HapusWarkatBerhasilDialog, Float> g = new Property<HapusWarkatBerhasilDialog, Float>(Float.class, "animationFraction") { // from class: o.HapusWarkatBerhasilDialog.1
        @Override // android.util.Property
        public final /* synthetic */ Float get(HapusWarkatBerhasilDialog hapusWarkatBerhasilDialog) {
            return Float.valueOf(hapusWarkatBerhasilDialog.b);
        }

        @Override // android.util.Property
        public final /* synthetic */ void set(HapusWarkatBerhasilDialog hapusWarkatBerhasilDialog, Float f) {
            hapusWarkatBerhasilDialog.d(f.floatValue());
        }
    };
    private static final Property<HapusWarkatBerhasilDialog, Float> m = new Property<HapusWarkatBerhasilDialog, Float>(Float.class, "completeEndFraction") { // from class: o.HapusWarkatBerhasilDialog.3
        @Override // android.util.Property
        public final /* synthetic */ Float get(HapusWarkatBerhasilDialog hapusWarkatBerhasilDialog) {
            return Float.valueOf(hapusWarkatBerhasilDialog.d);
        }

        @Override // android.util.Property
        public final /* synthetic */ void set(HapusWarkatBerhasilDialog hapusWarkatBerhasilDialog, Float f) {
            hapusWarkatBerhasilDialog.d = f.floatValue();
        }
    };
    int i = 0;
    getPivotY.IconCompatParcelizer e = null;
    private final onDestroy s = new onDestroy();

    public HapusWarkatBerhasilDialog(HapusWarkatBerhasilDialog_ViewBinding hapusWarkatBerhasilDialog_ViewBinding) {
        super(1);
        this.c = hapusWarkatBerhasilDialog_ViewBinding;
    }

    private void i() {
        this.i = 0;
        int[] iArr = this.h;
        int i = this.c.d[0];
        iArr[0] = isRound.b(i, (Color.alpha(i) * this.j.getAlpha()) / 255);
        this.d = 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.onSelectHari
    public final void a() {
        ObjectAnimator objectAnimator = this.a;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // o.onSelectHari
    public final void b() {
        this.e = null;
    }

    @Override // o.onSelectHari
    public final void c() {
        i();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.onSelectHari
    public final void d() {
        if (this.a == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, g, 0.0f, 1.0f);
            this.a = ofFloat;
            ofFloat.setDuration(5400L);
            this.a.setInterpolator(null);
            this.a.setRepeatCount(-1);
            this.a.addListener(new AnimatorListenerAdapter() { // from class: o.HapusWarkatBerhasilDialog.5
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationRepeat(Animator animator) {
                    onAnimationRepeat(animator);
                    HapusWarkatBerhasilDialog hapusWarkatBerhasilDialog = HapusWarkatBerhasilDialog.this;
                    hapusWarkatBerhasilDialog.i = (hapusWarkatBerhasilDialog.i + 4) % HapusWarkatBerhasilDialog.this.c.d.length;
                }
            });
        }
        if (this.l == null) {
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, m, 0.0f, 1.0f);
            this.l = ofFloat2;
            ofFloat2.setDuration(333L);
            this.l.setInterpolator(this.s);
            this.l.addListener(new AnimatorListenerAdapter() { // from class: o.HapusWarkatBerhasilDialog.2
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                    onAnimationEnd(animator);
                    ObjectAnimator objectAnimator = HapusWarkatBerhasilDialog.this.a;
                    if (objectAnimator != null) {
                        objectAnimator.cancel();
                    }
                    HapusWarkatBerhasilDialog.this.e.a(HapusWarkatBerhasilDialog.this.j);
                }
            });
        }
        i();
        this.a.start();
    }

    final void d(float f) {
        this.b = f;
        int i = (int) (f * 5400.0f);
        this.f[0] = (this.b * 1520.0f) - 20.0f;
        this.f[1] = this.b * 1520.0f;
        for (int i2 = 0; i2 < 4; i2++) {
            float f2 = (float) (i - n[i2]);
            float f3 = (float) 667;
            float f4 = f2 / f3;
            float[] fArr = this.f;
            fArr[1] = fArr[1] + (this.s.getInterpolation(f4) * 250.0f);
            float f5 = ((float) (i - f30o[i2])) / f3;
            float[] fArr2 = this.f;
            fArr2[0] = fArr2[0] + (this.s.getInterpolation(f5) * 250.0f);
        }
        float[] fArr3 = this.f;
        fArr3[0] = fArr3[0] + ((this.f[1] - this.f[0]) * this.d);
        float[] fArr4 = this.f;
        fArr4[0] = fArr4[0] / 360.0f;
        float[] fArr5 = this.f;
        fArr5[1] = fArr5[1] / 360.0f;
        int i3 = 0;
        while (true) {
            if (i3 >= 4) {
                break;
            }
            float f6 = ((float) (i - k[i3])) / ((float) 333);
            if (f6 >= 0.0f && f6 <= 1.0f) {
                int length = (i3 + this.i) % this.c.d.length;
                int length2 = this.c.d.length;
                int i4 = this.c.d[length];
                int b = isRound.b(i4, (Color.alpha(i4) * this.j.getAlpha()) / 255);
                int i5 = this.c.d[(length + 1) % length2];
                int b2 = isRound.b(i5, (Color.alpha(i5) * this.j.getAlpha()) / 255);
                this.h[0] = BaseInfoDialog.a(this.s.getInterpolation(f6), Integer.valueOf(b), Integer.valueOf(b2)).intValue();
                break;
            }
            i3++;
        }
        this.j.invalidateSelf();
    }

    @Override // o.onSelectHari
    public final void d(getPivotY.IconCompatParcelizer iconCompatParcelizer) {
        this.e = iconCompatParcelizer;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.onSelectHari
    public final void e() {
        if (!this.l.isRunning()) {
            if (this.j.isVisible()) {
                this.l.start();
                return;
            }
            ObjectAnimator objectAnimator = this.a;
            if (objectAnimator != null) {
                objectAnimator.cancel();
            }
        }
    }
}
