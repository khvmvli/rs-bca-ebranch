package o;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.FloatEvaluator;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.StateSet;
import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;
import java.util.Iterator;
import o.BaseDialogKotlin;
import o.signup;
/* loaded from: classes2-dex2jar.jar:o/FingerprintDialog.class */
public class FingerprintDialog {
    public ArrayList<Animator.AnimatorListener> A;
    public BaseKonfirmasiDialog B;
    public JenisKodeBankDialog C;
    private BaseKonfirmasiDialog E;
    private final signup F;
    public final FloatingActionButton G;
    public ArrayList<FingerprintDialog$MediaBrowserCompat$CustomActionResultReceiver> H;
    private BaseKonfirmasiDialog I;
    public onClickBtnOk f;
    Drawable j;
    Animator k;
    public BaseKonfirmasiDialog l;
    public float m;
    public boolean n;

    /* renamed from: o */
    public ArrayList<Animator.AnimatorListener> f25o;
    public ViewTreeObserver.OnPreDrawListener p;
    public float q;
    public int r;
    public int s;
    public float u;
    float v;
    Drawable w;
    final IsiPernyataanDialog y;
    public JenisPekerjaanDialog z;
    static final TimeInterpolator a = unbindViews.a;
    static final int[] i = {16842919, 16842910};
    static final int[] h = {16843623, 16842908, 16842910};
    static final int[] b = {16842908, 16842910};
    static final int[] c = {16843623, 16842910};
    static final int[] e = {16842910};
    static final int[] d = new int[0];
    public boolean x = true;
    public float t = 1.0f;
    int g = 0;
    private final Rect M = new Rect();
    private final RectF N = new RectF();
    private final RectF K = new RectF();
    public final Matrix D = new Matrix();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2-dex2jar.jar:o/FingerprintDialog$IconCompatParcelizer.class */
    public final class IconCompatParcelizer extends MediaDescriptionCompat {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IconCompatParcelizer() {
            super(r5, (byte) 0);
            FingerprintDialog.this = r5;
        }

        @Override // o.FingerprintDialog.MediaDescriptionCompat
        protected final float a() {
            return 0.0f;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2-dex2jar.jar:o/FingerprintDialog$MediaDescriptionCompat.class */
    public abstract class MediaDescriptionCompat extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {
        private boolean b;
        private float c;
        private float e;

        private MediaDescriptionCompat() {
            FingerprintDialog.this = r4;
        }

        public /* synthetic */ MediaDescriptionCompat(FingerprintDialog fingerprintDialog, byte b) {
            this();
        }

        protected abstract float a();

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            FingerprintDialog fingerprintDialog = FingerprintDialog.this;
            float f = (float) ((int) this.c);
            JenisKodeBankDialog jenisKodeBankDialog = fingerprintDialog.C;
            if (jenisKodeBankDialog != null) {
                jenisKodeBankDialog.l(f);
            }
            this.b = false;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (!this.b) {
                this.e = FingerprintDialog.this.C == null ? 0.0f : FingerprintDialog.this.C.F.a;
                this.c = a();
                this.b = true;
            }
            FingerprintDialog fingerprintDialog = FingerprintDialog.this;
            float f = this.e;
            float animatedFraction = (float) ((int) (f + ((this.c - f) * valueAnimator.getAnimatedFraction())));
            JenisKodeBankDialog jenisKodeBankDialog = fingerprintDialog.C;
            if (jenisKodeBankDialog != null) {
                jenisKodeBankDialog.l(animatedFraction);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2-dex2jar.jar:o/FingerprintDialog$RemoteActionCompatParcelizer.class */
    public final class RemoteActionCompatParcelizer extends MediaDescriptionCompat {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        RemoteActionCompatParcelizer() {
            super(r5, (byte) 0);
            FingerprintDialog.this = r5;
        }

        @Override // o.FingerprintDialog.MediaDescriptionCompat
        protected final float a() {
            return FingerprintDialog.this.m + FingerprintDialog.this.q;
        }
    }

    /* loaded from: classes2-dex2jar.jar:o/FingerprintDialog$read.class */
    public interface read {
        void c();

        void d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2-dex2jar.jar:o/FingerprintDialog$write.class */
    public final class write extends MediaDescriptionCompat {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        write() {
            super(r5, (byte) 0);
            FingerprintDialog.this = r5;
        }

        @Override // o.FingerprintDialog.MediaDescriptionCompat
        protected final float a() {
            return FingerprintDialog.this.m + FingerprintDialog.this.u;
        }
    }

    public FingerprintDialog(FloatingActionButton floatingActionButton, IsiPernyataanDialog isiPernyataanDialog) {
        this.G = floatingActionButton;
        this.y = isiPernyataanDialog;
        signup signup = new signup();
        this.F = signup;
        int[] iArr = i;
        ValueAnimator d2 = d(new write());
        signup.IconCompatParcelizer iconCompatParcelizer = new signup.IconCompatParcelizer(iArr, d2);
        d2.addListener(signup.e);
        signup.b.add(iconCompatParcelizer);
        int[] iArr2 = h;
        ValueAnimator d3 = d(new RemoteActionCompatParcelizer());
        signup.IconCompatParcelizer iconCompatParcelizer2 = new signup.IconCompatParcelizer(iArr2, d3);
        d3.addListener(signup.e);
        signup.b.add(iconCompatParcelizer2);
        int[] iArr3 = b;
        ValueAnimator d4 = d(new RemoteActionCompatParcelizer());
        signup.IconCompatParcelizer iconCompatParcelizer3 = new signup.IconCompatParcelizer(iArr3, d4);
        d4.addListener(signup.e);
        signup.b.add(iconCompatParcelizer3);
        int[] iArr4 = c;
        ValueAnimator d5 = d(new RemoteActionCompatParcelizer());
        signup.IconCompatParcelizer iconCompatParcelizer4 = new signup.IconCompatParcelizer(iArr4, d5);
        d5.addListener(signup.e);
        signup.b.add(iconCompatParcelizer4);
        int[] iArr5 = e;
        ValueAnimator d6 = d(new MediaDescriptionCompat() { // from class: o.FingerprintDialog$MediaBrowserCompat$MediaItem
            @Override // o.FingerprintDialog.MediaDescriptionCompat
            protected final float a() {
                return FingerprintDialog.this.m;
            }
        });
        signup.IconCompatParcelizer iconCompatParcelizer5 = new signup.IconCompatParcelizer(iArr5, d6);
        d6.addListener(signup.e);
        signup.b.add(iconCompatParcelizer5);
        int[] iArr6 = d;
        ValueAnimator d7 = d(new IconCompatParcelizer());
        signup.IconCompatParcelizer iconCompatParcelizer6 = new signup.IconCompatParcelizer(iArr6, d7);
        d7.addListener(signup.e);
        signup.b.add(iconCompatParcelizer6);
        this.v = floatingActionButton.getRotation();
    }

    private AnimatorSet a(BaseKonfirmasiDialog baseKonfirmasiDialog, float f, float f2, float f3) {
        ArrayList arrayList = new ArrayList();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.G, View.ALPHA, f);
        baseKonfirmasiDialog.c("opacity").b(ofFloat);
        arrayList.add(ofFloat);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.G, View.SCALE_X, f2);
        baseKonfirmasiDialog.c("scale").b(ofFloat2);
        if (Build.VERSION.SDK_INT == 26) {
            ofFloat2.setEvaluator(new TypeEvaluator<Float>() { // from class: o.FingerprintDialog.3
                FloatEvaluator a = new FloatEvaluator();

                @Override // android.animation.TypeEvaluator
                public final /* synthetic */ Float evaluate(float f4, Float f5, Float f6) {
                    float floatValue = this.a.evaluate(f4, (Number) f5, (Number) f6).floatValue();
                    float f7 = floatValue;
                    if (floatValue < 0.1f) {
                        f7 = 0.0f;
                    }
                    return Float.valueOf(f7);
                }
            });
        }
        arrayList.add(ofFloat2);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.G, View.SCALE_Y, f2);
        baseKonfirmasiDialog.c("scale").b(ofFloat3);
        if (Build.VERSION.SDK_INT == 26) {
            ofFloat3.setEvaluator(new TypeEvaluator<Float>() { // from class: o.FingerprintDialog.3
                FloatEvaluator a = new FloatEvaluator();

                @Override // android.animation.TypeEvaluator
                public final /* synthetic */ Float evaluate(float f4, Float f5, Float f6) {
                    float floatValue = this.a.evaluate(f4, (Number) f5, (Number) f6).floatValue();
                    float f7 = floatValue;
                    if (floatValue < 0.1f) {
                        f7 = 0.0f;
                    }
                    return Float.valueOf(f7);
                }
            });
        }
        arrayList.add(ofFloat3);
        e(f3, this.D);
        ObjectAnimator ofObject = ObjectAnimator.ofObject(this.G, new BaseInfoDialog_ViewBinding(), new BidangPekerjaanDialog() { // from class: o.FingerprintDialog.4
            @Override // o.BidangPekerjaanDialog
            public final Matrix e(float f4, Matrix matrix, Matrix matrix2) {
                FingerprintDialog.this.t = f4;
                return evaluate(f4, matrix, matrix2);
            }

            @Override // o.BidangPekerjaanDialog, android.animation.TypeEvaluator
            public final /* synthetic */ Matrix evaluate(float f4, Matrix matrix, Matrix matrix2) {
                FingerprintDialog.this.t = f4;
                return evaluate(f4, matrix, matrix2);
            }
        }, new Matrix(this.D));
        baseKonfirmasiDialog.c("iconScale").b(ofObject);
        arrayList.add(ofObject);
        AnimatorSet animatorSet = new AnimatorSet();
        initView.a(animatorSet, arrayList);
        return animatorSet;
    }

    private void b(Rect rect) {
        if (this.j == null) {
            throw new NullPointerException("Didn't initialize content background");
        } else if (i()) {
            this.y.c(new InsetDrawable(this.j, rect.left, rect.top, rect.right, rect.bottom));
        } else {
            this.y.c(this.j);
        }
    }

    private static ValueAnimator d(MediaDescriptionCompat mediaDescriptionCompat) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setInterpolator(a);
        valueAnimator.setDuration(100L);
        valueAnimator.addListener(mediaDescriptionCompat);
        valueAnimator.addUpdateListener(mediaDescriptionCompat);
        valueAnimator.setFloatValues(0.0f, 1.0f);
        return valueAnimator;
    }

    private BaseKonfirmasiDialog m() {
        if (this.I == null) {
            this.I = BaseKonfirmasiDialog.b(this.G.getContext(), BaseDialogKotlin.write.e);
        }
        return this.I;
    }

    private BaseKonfirmasiDialog n() {
        if (this.E == null) {
            this.E = BaseKonfirmasiDialog.b(this.G.getContext(), BaseDialogKotlin.write.a);
        }
        return this.E;
    }

    public final boolean a() {
        boolean z = false;
        boolean z2 = false;
        if (this.G.getVisibility() != 0) {
            if (this.g == 2) {
                z2 = true;
            }
            return z2;
        }
        if (this.g != 1) {
            z = true;
        }
        return z;
    }

    float b() {
        return this.m;
    }

    public void b(ColorStateList colorStateList) {
        Drawable drawable = this.w;
        if (drawable != null) {
            getInsetsForType.e(drawable, InfoDialog_ViewBinding.d(colorStateList));
        }
    }

    public final void b(final read read2, final boolean z) {
        if (!d()) {
            Animator animator = this.k;
            if (animator != null) {
                animator.cancel();
            }
            if (findFragmentByWho.G(this.G) && !this.G.isInEditMode()) {
                BaseKonfirmasiDialog baseKonfirmasiDialog = this.l;
                BaseKonfirmasiDialog baseKonfirmasiDialog2 = baseKonfirmasiDialog;
                if (baseKonfirmasiDialog == null) {
                    baseKonfirmasiDialog2 = n();
                }
                AnimatorSet a2 = a(baseKonfirmasiDialog2, 0.0f, 0.0f, 0.0f);
                a2.addListener(new AnimatorListenerAdapter() { // from class: o.FingerprintDialog.5
                    private boolean a;

                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public final void onAnimationCancel(Animator animator2) {
                        this.a = true;
                    }

                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public final void onAnimationEnd(Animator animator2) {
                        FingerprintDialog.this.g = 0;
                        FingerprintDialog.this.k = null;
                        if (!this.a) {
                            FloatingActionButton floatingActionButton = FingerprintDialog.this.G;
                            boolean z2 = z;
                            floatingActionButton.e(z2 ? 8 : 4, z2);
                            read read3 = read2;
                            if (read3 != null) {
                                read3.c();
                            }
                        }
                    }

                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public final void onAnimationStart(Animator animator2) {
                        FingerprintDialog.this.G.e(0, z);
                        FingerprintDialog.this.g = 1;
                        FingerprintDialog.this.k = animator2;
                        this.a = false;
                    }
                });
                ArrayList<Animator.AnimatorListener> arrayList = this.f25o;
                if (arrayList != null) {
                    Iterator<Animator.AnimatorListener> it = arrayList.iterator();
                    while (it.hasNext()) {
                        a2.addListener(it.next());
                    }
                }
                a2.start();
                return;
            }
            this.G.e(z ? 8 : 4, z);
            if (read2 != null) {
                read2.c();
            }
        }
    }

    public void b(int[] iArr) {
        signup.IconCompatParcelizer iconCompatParcelizer;
        ValueAnimator valueAnimator;
        signup signup = this.F;
        int size = signup.b.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                iconCompatParcelizer = null;
                break;
            }
            signup.IconCompatParcelizer iconCompatParcelizer2 = signup.b.get(i2);
            if (StateSet.stateSetMatches(iconCompatParcelizer2.e, iArr)) {
                iconCompatParcelizer = iconCompatParcelizer2;
                break;
            }
            i2++;
        }
        signup.IconCompatParcelizer iconCompatParcelizer3 = signup.a;
        if (iconCompatParcelizer != iconCompatParcelizer3) {
            if (!(iconCompatParcelizer3 == null || (valueAnimator = signup.d) == null)) {
                valueAnimator.cancel();
                signup.d = null;
            }
            signup.a = iconCompatParcelizer;
            if (iconCompatParcelizer != null) {
                ValueAnimator valueAnimator2 = iconCompatParcelizer.c;
                signup.d = valueAnimator2;
                valueAnimator2.start();
            }
        }
    }

    public void c() {
        signup signup = this.F;
        ValueAnimator valueAnimator = signup.d;
        if (valueAnimator != null) {
            valueAnimator.end();
            signup.d = null;
        }
    }

    public void c(ColorStateList colorStateList, PorterDuff.Mode mode, ColorStateList colorStateList2, int i2) {
        JenisKodeBankDialog e2 = e();
        this.C = e2;
        e2.setTintList(colorStateList);
        if (mode != null) {
            this.C.setTintMode(mode);
        }
        this.C.a(-12303292);
        this.C.b(this.G.getContext());
        InfoNegaraORDialog infoNegaraORDialog = new InfoNegaraORDialog(this.C.F.l);
        infoNegaraORDialog.setTintList(InfoDialog_ViewBinding.d(colorStateList2));
        this.w = infoNegaraORDialog;
        this.j = new LayerDrawable(new Drawable[]{this.C, infoNegaraORDialog});
    }

    public final void c(final read read2, final boolean z) {
        if (!a()) {
            Animator animator = this.k;
            if (animator != null) {
                animator.cancel();
            }
            if (findFragmentByWho.G(this.G) && !this.G.isInEditMode()) {
                if (this.G.getVisibility() != 0) {
                    this.G.setAlpha(0.0f);
                    this.G.setScaleY(0.0f);
                    this.G.setScaleX(0.0f);
                    this.t = 0.0f;
                    Matrix matrix = this.D;
                    e(0.0f, matrix);
                    this.G.setImageMatrix(matrix);
                }
                BaseKonfirmasiDialog baseKonfirmasiDialog = this.B;
                BaseKonfirmasiDialog baseKonfirmasiDialog2 = baseKonfirmasiDialog;
                if (baseKonfirmasiDialog == null) {
                    baseKonfirmasiDialog2 = m();
                }
                AnimatorSet a2 = a(baseKonfirmasiDialog2, 1.0f, 1.0f, 1.0f);
                a2.addListener(new AnimatorListenerAdapter() { // from class: o.FingerprintDialog.1
                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public final void onAnimationEnd(Animator animator2) {
                        FingerprintDialog.this.g = 0;
                        FingerprintDialog.this.k = null;
                        read read3 = read2;
                        if (read3 != null) {
                            read3.d();
                        }
                    }

                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public final void onAnimationStart(Animator animator2) {
                        FingerprintDialog.this.G.e(0, z);
                        FingerprintDialog.this.g = 2;
                        FingerprintDialog.this.k = animator2;
                    }
                });
                ArrayList<Animator.AnimatorListener> arrayList = this.A;
                if (arrayList != null) {
                    Iterator<Animator.AnimatorListener> it = arrayList.iterator();
                    while (it.hasNext()) {
                        a2.addListener(it.next());
                    }
                }
                a2.start();
                return;
            }
            this.G.e(0, z);
            this.G.setAlpha(1.0f);
            this.G.setScaleY(1.0f);
            this.G.setScaleX(1.0f);
            this.t = 1.0f;
            Matrix matrix2 = this.D;
            e(1.0f, matrix2);
            this.G.setImageMatrix(matrix2);
            if (read2 != null) {
                read2.d();
            }
        }
    }

    public final boolean d() {
        boolean z = false;
        boolean z2 = false;
        if (this.G.getVisibility() == 0) {
            if (this.g == 1) {
                z2 = true;
            }
            return z2;
        }
        if (this.g != 2) {
            z = true;
        }
        return z;
    }

    JenisKodeBankDialog e() {
        return new JenisKodeBankDialog(this.z);
    }

    public void e(float f, float f2, float f3) {
        k();
        JenisKodeBankDialog jenisKodeBankDialog = this.C;
        if (jenisKodeBankDialog != null) {
            jenisKodeBankDialog.l(f);
        }
    }

    public void e(float f, Matrix matrix) {
        matrix.reset();
        Drawable drawable = this.G.getDrawable();
        if (drawable != null && this.r != 0) {
            RectF rectF = this.N;
            RectF rectF2 = this.K;
            rectF.set(0.0f, 0.0f, (float) drawable.getIntrinsicWidth(), (float) drawable.getIntrinsicHeight());
            float f2 = (float) this.r;
            rectF2.set(0.0f, 0.0f, f2, f2);
            matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
            float f3 = ((float) this.r) / 2.0f;
            matrix.postScale(f, f, f3, f3);
        }
    }

    public void e(Rect rect) {
        int i2;
        if (this.n) {
            int i3 = this.s;
            FloatingActionButton floatingActionButton = this.G;
            i2 = (i3 - floatingActionButton.c(floatingActionButton.h)) / 2;
        } else {
            i2 = 0;
        }
        float b2 = this.x ? b() + this.u : 0.0f;
        int max = Math.max(i2, (int) Math.ceil((double) b2));
        int max2 = Math.max(i2, (int) Math.ceil((double) (b2 * 1.5f)));
        rect.set(max, max2, max, max2);
    }

    public final void e(JenisPekerjaanDialog jenisPekerjaanDialog) {
        this.z = jenisPekerjaanDialog;
        JenisKodeBankDialog jenisKodeBankDialog = this.C;
        if (jenisKodeBankDialog != null) {
            jenisKodeBankDialog.setShapeAppearanceModel(jenisPekerjaanDialog);
        }
        Drawable drawable = this.w;
        if (drawable instanceof KategoriTujuanTransaksiORDialog) {
            ((KategoriTujuanTransaksiORDialog) drawable).setShapeAppearanceModel(jenisPekerjaanDialog);
        }
        onClickBtnOk onclickbtnok = this.f;
        if (onclickbtnok != null) {
            onclickbtnok.i = jenisPekerjaanDialog;
            onclickbtnok.invalidateSelf();
        }
    }

    public void f() {
    }

    public boolean g() {
        return true;
    }

    public final void h() {
        ArrayList<FingerprintDialog$MediaBrowserCompat$CustomActionResultReceiver> arrayList = this.H;
        if (arrayList != null) {
            Iterator<FingerprintDialog$MediaBrowserCompat$CustomActionResultReceiver> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().c();
            }
        }
    }

    boolean i() {
        return true;
    }

    public final void j() {
        ArrayList<FingerprintDialog$MediaBrowserCompat$CustomActionResultReceiver> arrayList = this.H;
        if (arrayList != null) {
            Iterator<FingerprintDialog$MediaBrowserCompat$CustomActionResultReceiver> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().d();
            }
        }
    }

    public final void k() {
        Rect rect = this.M;
        e(rect);
        b(rect);
        this.y.d(rect.left, rect.top, rect.right, rect.bottom);
    }

    final boolean l() {
        boolean z;
        if (this.n) {
            FloatingActionButton floatingActionButton = this.G;
            if (floatingActionButton.c(floatingActionButton.h) < this.s) {
                z = false;
                return z;
            }
        }
        z = true;
        return z;
    }

    void o() {
        int i2;
        JenisKodeBankDialog jenisKodeBankDialog = this.C;
        if (jenisKodeBankDialog != null && jenisKodeBankDialog.F.k != (i2 = (int) this.v)) {
            jenisKodeBankDialog.F.k = i2;
            jenisKodeBankDialog.a();
        }
    }
}
