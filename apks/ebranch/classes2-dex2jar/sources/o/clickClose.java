package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import o.GuestWarningDialog_ViewBinding;
/* loaded from: classes2-dex2jar.jar:o/clickClose.class */
public class clickClose extends JenisKodeBankDialog implements Drawable.Callback, GuestWarningDialog_ViewBinding.IconCompatParcelizer {
    private static final int[] E = {16842910};
    private static final ShapeDrawable N = new ShapeDrawable(new OvalShape());
    TextUtils.TruncateAt B;
    float D;
    private ColorStateList J;
    private Drawable K;
    private boolean M;
    private Drawable O;
    private ColorStateList P;
    private boolean R;
    private float S;
    private Drawable T;
    private float U;
    private ColorStateList V;
    private ColorStateList W;
    private int[] X;
    private boolean Y;
    private ColorFilter Z;
    ColorStateList a;
    private int aa;
    private int ab;
    private int ac;
    private int ad;
    private int ae;
    private int ag;
    private int ah;
    private float ai;
    private float ak;
    private boolean al;
    private PorterDuffColorFilter an;
    private ColorStateList ar;
    boolean b;
    float c;
    float d;
    float f;
    CharSequence g;
    float h;
    Drawable i;
    ColorStateList j;
    ColorStateList k;
    boolean l;
    float m;
    final Context n;

    /* renamed from: o  reason: collision with root package name */
    float f62o;
    ColorStateList q;
    boolean r;
    int s;
    BaseKonfirmasiDialog t;
    float u;
    BaseKonfirmasiDialog w;
    final GuestWarningDialog_ViewBinding x;
    boolean z;
    float e = -1.0f;
    private final Paint Q = new Paint(1);
    private final Paint.FontMetrics am = new Paint.FontMetrics();
    private final RectF ao = new RectF();
    private final PointF aj = new PointF();
    private final Path ap = new Path();
    private int L = 255;
    private PorterDuff.Mode aq = PorterDuff.Mode.SRC_IN;
    WeakReference<clickClose$MediaBrowserCompat$CustomActionResultReceiver> p = new WeakReference<>(null);
    CharSequence y = "";
    private final Paint af = null;
    boolean v = true;

    /* JADX INFO: Access modifiers changed from: package-private */
    public clickClose(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        b(context);
        this.n = context;
        GuestWarningDialog_ViewBinding guestWarningDialog_ViewBinding = new GuestWarningDialog_ViewBinding(this);
        this.x = guestWarningDialog_ViewBinding;
        guestWarningDialog_ViewBinding.e.density = context.getResources().getDisplayMetrics().density;
        int[] iArr = E;
        setState(iArr);
        b(iArr);
        if (InfoDialog_ViewBinding.c) {
            N.setTint(-1);
        }
    }

    private void c(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (this.l && this.i != null) {
            float f = this.d + this.f;
            if (getInsetsForType.c(this) == 0) {
                rectF.right = ((float) rect.right) - f;
                rectF.left = rectF.right - this.m;
            } else {
                rectF.left = ((float) rect.left) + f;
                rectF.right = rectF.left + this.m;
            }
            rectF.top = rect.exactCenterY() - (this.m / 2.0f);
            rectF.bottom = rectF.top + this.m;
        }
    }

    private void d(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (!(this.R && this.O != null)) {
            boolean z = false;
            if (this.M) {
                z = false;
                if (this.K != null) {
                    z = false;
                    if (this.Y) {
                        z = true;
                    }
                }
            }
            if (!z) {
                return;
            }
        }
        float f = this.h + this.ai;
        float n = n();
        if (getInsetsForType.c(this) == 0) {
            rectF.left = ((float) rect.left) + f;
            rectF.right = rectF.left + n;
        } else {
            rectF.right = ((float) rect.right) - f;
            rectF.left = rectF.right - n;
        }
        Drawable drawable = this.Y ? this.K : this.O;
        float f2 = this.S;
        float f3 = f2;
        if (f2 <= 0.0f) {
            f3 = f2;
            if (drawable != null) {
                float ceil = (float) Math.ceil((double) TypedValue.applyDimension(1, (float) 24, this.n.getResources().getDisplayMetrics()));
                f3 = ceil;
                if (((float) drawable.getIntrinsicHeight()) <= ceil) {
                    f3 = (float) drawable.getIntrinsicHeight();
                }
            }
        }
        rectF.top = rect.exactCenterY() - (f3 / 2.0f);
        rectF.bottom = rectF.top + f3;
    }

    private void e(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(this);
            getInsetsForType.c(drawable, getInsetsForType.c(this));
            drawable.setLevel(getLevel());
            drawable.setVisible(isVisible(), false);
            if (drawable == this.i) {
                if (drawable.isStateful()) {
                    drawable.setState(this.X);
                }
                getInsetsForType.e(drawable, this.V);
                return;
            }
            if (drawable.isStateful()) {
                drawable.setState(getState());
            }
            Drawable drawable2 = this.O;
            if (drawable == drawable2 && this.al) {
                getInsetsForType.e(drawable2, this.P);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0256  */
    /* Code decompiled incorrectly, please refer to instructions dump */
    private boolean e(int[] r7, int[] r8) {
        /*
        // Method dump skipped, instructions count: 829
        */
        throw new UnsupportedOperationException("Method not decompiled: o.clickClose.e(int[], int[]):boolean");
    }

    private float n() {
        Drawable drawable = this.Y ? this.K : this.O;
        float f = this.S;
        return (f > 0.0f || drawable == null) ? f : (float) drawable.getIntrinsicWidth();
    }

    public final void a(float f) {
        if (this.d != f) {
            this.d = f;
            invalidateSelf();
            clickClose$MediaBrowserCompat$CustomActionResultReceiver clickclose_mediabrowsercompat_customactionresultreceiver = this.p.get();
            if (clickclose_mediabrowsercompat_customactionresultreceiver != null) {
                clickclose_mediabrowsercompat_customactionresultreceiver.d();
            }
        }
    }

    public final void a(ColorStateList colorStateList) {
        if (this.V != colorStateList) {
            this.V = colorStateList;
            if (this.l && this.i != null) {
                getInsetsForType.e(this.i, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void a(Drawable drawable) {
        clickClose$MediaBrowserCompat$CustomActionResultReceiver clickclose_mediabrowsercompat_customactionresultreceiver;
        if (this.K != drawable) {
            float c = c();
            this.K = drawable;
            float c2 = c();
            Drawable drawable2 = this.K;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            e(this.K);
            invalidateSelf();
            if (c != c2 && (clickclose_mediabrowsercompat_customactionresultreceiver = this.p.get()) != null) {
                clickclose_mediabrowsercompat_customactionresultreceiver.d();
            }
        }
    }

    public final void a(boolean z) {
        boolean z2 = this.M;
        if (z2 != z) {
            boolean z3 = true;
            boolean z4 = z2 && this.K != null && this.Y;
            this.M = z;
            boolean z5 = z && this.K != null && this.Y;
            if (z4 == z5) {
                z3 = false;
            }
            if (z3) {
                if (z5) {
                    e(this.K);
                } else {
                    Drawable drawable = this.K;
                    if (drawable != null) {
                        drawable.setCallback(null);
                    }
                }
                invalidateSelf();
                clickClose$MediaBrowserCompat$CustomActionResultReceiver clickclose_mediabrowsercompat_customactionresultreceiver = this.p.get();
                if (clickclose_mediabrowsercompat_customactionresultreceiver != null) {
                    clickclose_mediabrowsercompat_customactionresultreceiver.d();
                }
            }
        }
    }

    public final void b(float f) {
        if (this.U != f) {
            this.U = f;
            this.Q.setStrokeWidth(f);
            if (this.r) {
                m(f);
            }
            invalidateSelf();
        }
    }

    public final void b(ColorStateList colorStateList) {
        if (this.W != colorStateList) {
            this.W = colorStateList;
            if (this.r) {
                i(colorStateList);
            }
            onStateChange(getState());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (this.l && this.i != null) {
            float f = this.d + this.f + this.m + this.f62o + this.u;
            if (getInsetsForType.c(this) == 0) {
                rectF.right = (float) rect.right;
                rectF.left = rectF.right - f;
            } else {
                rectF.left = (float) rect.left;
                rectF.right = ((float) rect.left) + f;
            }
            rectF.top = (float) rect.top;
            rectF.bottom = (float) rect.bottom;
        }
    }

    public final void b(Drawable drawable) {
        clickClose$MediaBrowserCompat$CustomActionResultReceiver clickclose_mediabrowsercompat_customactionresultreceiver;
        Drawable drawable2 = this.i;
        Drawable g = drawable2 != null ? getInsetsForType.g(drawable2) : null;
        if (g != drawable) {
            float e = e();
            this.i = drawable != null ? getInsetsForType.h(drawable).mutate() : null;
            if (InfoDialog_ViewBinding.c) {
                this.T = new RippleDrawable(InfoDialog_ViewBinding.d(this.q), this.i, N);
            }
            float e2 = e();
            if (g != null) {
                g.setCallback(null);
            }
            if (this.l && this.i != null) {
                e(this.i);
            }
            invalidateSelf();
            if (e != e2 && (clickclose_mediabrowsercompat_customactionresultreceiver = this.p.get()) != null) {
                clickclose_mediabrowsercompat_customactionresultreceiver.d();
            }
        }
    }

    public final void b(CharSequence charSequence) {
        CharSequence charSequence2 = charSequence;
        if (charSequence == null) {
            charSequence2 = "";
        }
        if (!TextUtils.equals(this.y, charSequence2)) {
            this.y = charSequence2;
            this.x.j = true;
            invalidateSelf();
            clickClose$MediaBrowserCompat$CustomActionResultReceiver clickclose_mediabrowsercompat_customactionresultreceiver = this.p.get();
            if (clickclose_mediabrowsercompat_customactionresultreceiver != null) {
                clickclose_mediabrowsercompat_customactionresultreceiver.d();
            }
        }
    }

    public final boolean b(int[] iArr) {
        if (Arrays.equals(this.X, iArr)) {
            return false;
        }
        this.X = iArr;
        if (this.l && this.i != null) {
            return e(getState(), iArr);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final float c() {
        boolean z = true;
        if (!(this.R && this.O != null)) {
            if (!this.M || this.K == null || !this.Y) {
                z = false;
            }
            if (!z) {
                return 0.0f;
            }
        }
        return this.ai + n() + this.ak;
    }

    public final void c(float f) {
        if (this.c != f) {
            this.c = f;
            invalidateSelf();
            clickClose$MediaBrowserCompat$CustomActionResultReceiver clickclose_mediabrowsercompat_customactionresultreceiver = this.p.get();
            if (clickclose_mediabrowsercompat_customactionresultreceiver != null) {
                clickclose_mediabrowsercompat_customactionresultreceiver.d();
            }
        }
    }

    public final void c(boolean z) {
        boolean z2 = this.R;
        if (z2 != z) {
            boolean z3 = true;
            boolean z4 = z2 && this.O != null;
            this.R = z;
            boolean z5 = z && this.O != null;
            if (z4 == z5) {
                z3 = false;
            }
            if (z3) {
                if (z5) {
                    e(this.O);
                } else {
                    Drawable drawable = this.O;
                    if (drawable != null) {
                        drawable.setCallback(null);
                    }
                }
                invalidateSelf();
                clickClose$MediaBrowserCompat$CustomActionResultReceiver clickclose_mediabrowsercompat_customactionresultreceiver = this.p.get();
                if (clickclose_mediabrowsercompat_customactionresultreceiver != null) {
                    clickclose_mediabrowsercompat_customactionresultreceiver.d();
                }
            }
        }
    }

    @Override // o.GuestWarningDialog_ViewBinding.IconCompatParcelizer
    public final void d() {
        clickClose$MediaBrowserCompat$CustomActionResultReceiver clickclose_mediabrowsercompat_customactionresultreceiver = this.p.get();
        if (clickclose_mediabrowsercompat_customactionresultreceiver != null) {
            clickclose_mediabrowsercompat_customactionresultreceiver.d();
        }
        invalidateSelf();
    }

    public final void d(float f) {
        if (this.h != f) {
            this.h = f;
            invalidateSelf();
            clickClose$MediaBrowserCompat$CustomActionResultReceiver clickclose_mediabrowsercompat_customactionresultreceiver = this.p.get();
            if (clickclose_mediabrowsercompat_customactionresultreceiver != null) {
                clickclose_mediabrowsercompat_customactionresultreceiver.d();
            }
        }
    }

    public final void d(ColorStateList colorStateList) {
        boolean z = true;
        this.al = true;
        if (this.P != colorStateList) {
            this.P = colorStateList;
            if (!this.R || this.O == null) {
                z = false;
            }
            if (z) {
                getInsetsForType.e(this.O, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void d(Drawable drawable) {
        clickClose$MediaBrowserCompat$CustomActionResultReceiver clickclose_mediabrowsercompat_customactionresultreceiver;
        Drawable drawable2 = this.O;
        Drawable g = drawable2 != null ? getInsetsForType.g(drawable2) : null;
        if (g != drawable) {
            float c = c();
            this.O = drawable != null ? getInsetsForType.h(drawable).mutate() : null;
            float c2 = c();
            if (g != null) {
                g.setCallback(null);
            }
            if (this.R && this.O != null) {
                e(this.O);
            }
            invalidateSelf();
            if (c != c2 && (clickclose_mediabrowsercompat_customactionresultreceiver = this.p.get()) != null) {
                clickclose_mediabrowsercompat_customactionresultreceiver.d();
            }
        }
    }

    public final void d(boolean z) {
        boolean z2 = this.l;
        if (z2 != z) {
            boolean z3 = true;
            boolean z4 = z2 && this.i != null;
            this.l = z;
            boolean z5 = z && this.i != null;
            if (z4 == z5) {
                z3 = false;
            }
            if (z3) {
                if (z5) {
                    e(this.i);
                } else {
                    Drawable drawable = this.i;
                    if (drawable != null) {
                        drawable.setCallback(null);
                    }
                }
                invalidateSelf();
                clickClose$MediaBrowserCompat$CustomActionResultReceiver clickclose_mediabrowsercompat_customactionresultreceiver = this.p.get();
                if (clickclose_mediabrowsercompat_customactionresultreceiver != null) {
                    clickclose_mediabrowsercompat_customactionresultreceiver.d();
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:161:0x06a6, code lost:
        if ((r8.M && r8.K != null && r8.Y) != false) goto L_0x06a9;
     */
    @Override // o.JenisKodeBankDialog, android.graphics.drawable.Drawable
    /* Code decompiled incorrectly, please refer to instructions dump */
    public void draw(android.graphics.Canvas r9) {
        /*
        // Method dump skipped, instructions count: 1991
        */
        throw new UnsupportedOperationException("Method not decompiled: o.clickClose.draw(android.graphics.Canvas):void");
    }

    final float e() {
        if (this.l && this.i != null) {
            return this.f62o + this.m + this.f;
        }
        return 0.0f;
    }

    public final void e(float f) {
        clickClose$MediaBrowserCompat$CustomActionResultReceiver clickclose_mediabrowsercompat_customactionresultreceiver;
        if (this.S != f) {
            float c = c();
            this.S = f;
            float c2 = c();
            invalidateSelf();
            if (c != c2 && (clickclose_mediabrowsercompat_customactionresultreceiver = this.p.get()) != null) {
                clickclose_mediabrowsercompat_customactionresultreceiver.d();
            }
        }
    }

    public final void e(ColorStateList colorStateList) {
        if (this.J != colorStateList) {
            this.J = colorStateList;
            if (this.M && this.K != null && this.b) {
                getInsetsForType.e(this.K, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void e(boolean z) {
        clickClose$MediaBrowserCompat$CustomActionResultReceiver clickclose_mediabrowsercompat_customactionresultreceiver;
        if (this.b != z) {
            this.b = z;
            float c = c();
            if (!z && this.Y) {
                this.Y = false;
            }
            float c2 = c();
            invalidateSelf();
            if (c != c2 && (clickclose_mediabrowsercompat_customactionresultreceiver = this.p.get()) != null) {
                clickclose_mediabrowsercompat_customactionresultreceiver.d();
            }
        }
    }

    public final void f(float f) {
        clickClose$MediaBrowserCompat$CustomActionResultReceiver clickclose_mediabrowsercompat_customactionresultreceiver;
        if (this.f62o != f) {
            this.f62o = f;
            invalidateSelf();
            if ((this.l && this.i != null) && (clickclose_mediabrowsercompat_customactionresultreceiver = this.p.get()) != null) {
                clickclose_mediabrowsercompat_customactionresultreceiver.d();
            }
        }
    }

    public final void g(float f) {
        clickClose$MediaBrowserCompat$CustomActionResultReceiver clickclose_mediabrowsercompat_customactionresultreceiver;
        if (this.m != f) {
            this.m = f;
            invalidateSelf();
            if ((this.l && this.i != null) && (clickclose_mediabrowsercompat_customactionresultreceiver = this.p.get()) != null) {
                clickclose_mediabrowsercompat_customactionresultreceiver.d();
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.L;
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        return this.Z;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return (int) this.c;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        float f;
        float f2 = this.h;
        float c = c();
        float f3 = this.D;
        GuestWarningDialog_ViewBinding guestWarningDialog_ViewBinding = this.x;
        String charSequence = this.y.toString();
        if (!guestWarningDialog_ViewBinding.j) {
            f = guestWarningDialog_ViewBinding.c;
        } else {
            f = charSequence == null ? 0.0f : guestWarningDialog_ViewBinding.e.measureText((CharSequence) charSequence, 0, charSequence.length());
            guestWarningDialog_ViewBinding.c = f;
            guestWarningDialog_ViewBinding.j = false;
        }
        return Math.min(Math.round(f2 + c + f3 + f + this.u + e() + this.d), this.s);
    }

    @Override // o.JenisKodeBankDialog, android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // o.JenisKodeBankDialog, android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        if (this.r) {
            getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (!bounds.isEmpty()) {
            outline.setRoundRect(bounds, this.e);
        } else {
            outline.setRoundRect(0, 0, getIntrinsicWidth(), getIntrinsicHeight(), this.e);
        }
        outline.setAlpha(((float) getAlpha()) / 255.0f);
    }

    public final void h(float f) {
        clickClose$MediaBrowserCompat$CustomActionResultReceiver clickclose_mediabrowsercompat_customactionresultreceiver;
        if (this.ai != f) {
            float c = c();
            this.ai = f;
            float c2 = c();
            invalidateSelf();
            if (c != c2 && (clickclose_mediabrowsercompat_customactionresultreceiver = this.p.get()) != null) {
                clickclose_mediabrowsercompat_customactionresultreceiver.d();
            }
        }
    }

    public final void i(float f) {
        clickClose$MediaBrowserCompat$CustomActionResultReceiver clickclose_mediabrowsercompat_customactionresultreceiver;
        if (this.f != f) {
            this.f = f;
            invalidateSelf();
            if ((this.l && this.i != null) && (clickclose_mediabrowsercompat_customactionresultreceiver = this.p.get()) != null) {
                clickclose_mediabrowsercompat_customactionresultreceiver.d();
            }
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x007e, code lost:
        if ((r0 != null && r0.isStateful()) == false) goto L_0x0081;
     */
    @Override // o.JenisKodeBankDialog, android.graphics.drawable.Drawable
    /* Code decompiled incorrectly, please refer to instructions dump */
    public boolean isStateful() {
        /*
        // Method dump skipped, instructions count: 303
        */
        throw new UnsupportedOperationException("Method not decompiled: o.clickClose.isStateful():boolean");
    }

    public final void j(float f) {
        clickClose$MediaBrowserCompat$CustomActionResultReceiver clickclose_mediabrowsercompat_customactionresultreceiver;
        if (this.ak != f) {
            float c = c();
            this.ak = f;
            float c2 = c();
            invalidateSelf();
            if (c != c2 && (clickclose_mediabrowsercompat_customactionresultreceiver = this.p.get()) != null) {
                clickclose_mediabrowsercompat_customactionresultreceiver.d();
            }
        }
    }

    public final void k(float f) {
        if (this.u != f) {
            this.u = f;
            invalidateSelf();
            clickClose$MediaBrowserCompat$CustomActionResultReceiver clickclose_mediabrowsercompat_customactionresultreceiver = this.p.get();
            if (clickclose_mediabrowsercompat_customactionresultreceiver != null) {
                clickclose_mediabrowsercompat_customactionresultreceiver.d();
            }
        }
    }

    public final void o(float f) {
        if (this.D != f) {
            this.D = f;
            invalidateSelf();
            clickClose$MediaBrowserCompat$CustomActionResultReceiver clickclose_mediabrowsercompat_customactionresultreceiver = this.p.get();
            if (clickclose_mediabrowsercompat_customactionresultreceiver != null) {
                clickclose_mediabrowsercompat_customactionresultreceiver.d();
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int i) {
        boolean onLayoutDirectionChanged = onLayoutDirectionChanged(i);
        boolean z = onLayoutDirectionChanged;
        if (this.R && this.O != null) {
            z = onLayoutDirectionChanged | getInsetsForType.c(this.O, i);
        }
        boolean z2 = z;
        if (this.M && this.K != null && this.Y) {
            z2 = z | getInsetsForType.c(this.K, i);
        }
        boolean z3 = false;
        if (this.l) {
            z3 = false;
            if (this.i != null) {
                z3 = true;
            }
        }
        boolean z4 = z2;
        if (z3) {
            z4 = z2 | getInsetsForType.c(this.i, i);
        }
        if (!z4) {
            return true;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i) {
        boolean onLevelChange = onLevelChange(i);
        boolean z = true;
        boolean z2 = onLevelChange;
        if (this.R && this.O != null) {
            z2 = onLevelChange | this.O.setLevel(i);
        }
        boolean z3 = z2;
        if (this.M && this.K != null && this.Y) {
            z3 = z2 | this.K.setLevel(i);
        }
        if (!this.l || this.i == null) {
            z = false;
        }
        boolean z4 = z3;
        if (z) {
            z4 = z3 | this.i.setLevel(i);
        }
        if (z4) {
            invalidateSelf();
        }
        return z4;
    }

    @Override // o.JenisKodeBankDialog, android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        if (this.r) {
            onStateChange(iArr);
        }
        return e(iArr, this.X);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j);
        }
    }

    @Override // o.JenisKodeBankDialog, android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        if (this.L != i) {
            this.L = i;
            invalidateSelf();
        }
    }

    @Override // o.JenisKodeBankDialog, android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        if (this.Z != colorFilter) {
            this.Z = colorFilter;
            invalidateSelf();
        }
    }

    @Override // o.JenisKodeBankDialog, android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        if (this.ar != colorStateList) {
            this.ar = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // o.JenisKodeBankDialog, android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        if (this.aq != mode) {
            this.aq = mode;
            this.an = ErrorGetCityListDialog_ViewBinding.d(this, this.ar, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = setVisible(z, z2);
        boolean z3 = true;
        boolean z4 = visible;
        if (this.R && this.O != null) {
            z4 = visible | this.O.setVisible(z, z2);
        }
        boolean z5 = z4;
        if (this.M && this.K != null && this.Y) {
            z5 = z4 | this.K.setVisible(z, z2);
        }
        if (!this.l || this.i == null) {
            z3 = false;
        }
        boolean z6 = z5;
        if (z3) {
            z6 = z5 | this.i.setVisible(z, z2);
        }
        if (z6) {
            invalidateSelf();
        }
        return z6;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }
}
