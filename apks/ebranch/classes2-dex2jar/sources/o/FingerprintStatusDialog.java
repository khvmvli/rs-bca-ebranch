package o;

import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import o.GuestWarningDialog;
/* loaded from: classes2-dex2jar.jar:o/FingerprintStatusDialog.class */
public final class FingerprintStatusDialog {
    private static final boolean Q = false;
    private static final Paint R = null;
    public float A;
    public boolean C;
    public float D;
    public int[] E;
    public CharSequence F;
    public final TextPaint G;
    public CharSequence H;
    public StaticLayout I;
    public final TextPaint J;
    public boolean K;
    public CharSequence L;
    public final View M;
    public Paint N;
    private float O;
    private float P;
    private Typeface S;
    private Typeface T;
    private float V;
    private float W;
    private int X;
    private float Y;
    private ColorStateList Z;
    private float aa;
    private InfoCaraPembayaranDialog_ViewBinding ab;
    private float ac;
    private float ae;
    private boolean af;
    private TimeInterpolator ak;
    private TimeInterpolator am;
    public ColorStateList b;
    public InfoCaraPembayaranDialog_ViewBinding c;
    public boolean d;
    public float e;
    public float f;
    public float g;
    public ColorStateList h;
    public float i;
    public float j;
    public float k;
    public float m;
    public float n;
    public boolean q;
    public float r;
    public float s;
    public float t;
    public Bitmap u;
    public ColorStateList x;
    public float y;
    public Typeface z;
    public int v = 16;
    public int l = 16;
    public float w = 15.0f;

    /* renamed from: o  reason: collision with root package name */
    public float f26o = 15.0f;
    private boolean ad = true;
    public int B = 1;
    private float ag = 0.0f;
    private float aj = 1.0f;
    private int ah = GuestWarningDialog.d;
    public final Rect a = new Rect();
    public final Rect p = new Rect();
    private final RectF U = new RectF();

    public FingerprintStatusDialog(View view) {
        this.M = view;
        TextPaint textPaint = new TextPaint(129);
        this.G = textPaint;
        this.J = new TextPaint(textPaint);
        float f = this.ae;
        this.D = f + ((1.0f - f) * 0.5f);
    }

    private static int a(int i, int i2, float f) {
        float f2 = 1.0f - f;
        return Color.argb((int) ((((float) Color.alpha(i)) * f2) + (((float) Color.alpha(i2)) * f)), (int) ((((float) Color.red(i)) * f2) + (((float) Color.red(i2)) * f)), (int) ((((float) Color.green(i)) * f2) + (((float) Color.green(i2)) * f)), (int) ((((float) Color.blue(i)) * f2) + (((float) Color.blue(i2)) * f)));
    }

    private void a(float f) {
        float f2;
        int i;
        TextPaint textPaint;
        int i2;
        int i3;
        int i4;
        b(f);
        int i5 = 0;
        if (!this.C) {
            float f3 = this.W;
            float f4 = this.O;
            TimeInterpolator timeInterpolator = this.am;
            this.k = f3 + ((timeInterpolator != null ? timeInterpolator.getInterpolation(f) : f) * (f4 - f3));
            float f5 = this.V;
            float f6 = this.P;
            TimeInterpolator timeInterpolator2 = this.am;
            this.n = f5 + ((timeInterpolator2 != null ? timeInterpolator2.getInterpolation(f) : f) * (f6 - f5));
            float f7 = this.w;
            float f8 = this.f26o;
            TimeInterpolator timeInterpolator3 = this.ak;
            d(f7 + ((timeInterpolator3 != null ? timeInterpolator3.getInterpolation(f) : f) * (f8 - f7)));
            f2 = f;
        } else if (f < this.D) {
            this.k = this.W;
            this.n = this.V;
            d(this.w);
            f2 = 0.0f;
        } else {
            this.k = this.O;
            this.n = this.P - ((float) Math.max(0, this.X));
            d(this.f26o);
            f2 = 1.0f;
        }
        TimeInterpolator timeInterpolator4 = unbindViews.d;
        float f9 = 1.0f - f;
        float f10 = f9;
        if (timeInterpolator4 != null) {
            f10 = timeInterpolator4.getInterpolation(f9);
        }
        this.g = 1.0f - ((f10 * 1.0f) + 0.0f);
        findFragmentByWho.K(this.M);
        TimeInterpolator timeInterpolator5 = unbindViews.d;
        this.y = ((timeInterpolator5 != null ? timeInterpolator5.getInterpolation(f) : f) * -1.0f) + 1.0f;
        findFragmentByWho.K(this.M);
        ColorStateList colorStateList = this.h;
        ColorStateList colorStateList2 = this.x;
        if (colorStateList != colorStateList2) {
            textPaint = this.G;
            if (colorStateList2 == null) {
                i3 = 0;
            } else {
                int[] iArr = this.E;
                i3 = iArr != null ? colorStateList2.getColorForState(iArr, 0) : colorStateList2.getDefaultColor();
            }
            ColorStateList colorStateList3 = this.h;
            if (colorStateList3 == null) {
                i4 = 0;
            } else {
                int[] iArr2 = this.E;
                i4 = iArr2 != null ? colorStateList3.getColorForState(iArr2, 0) : colorStateList3.getDefaultColor();
            }
            i = a(i3, i4, f2);
        } else {
            textPaint = this.G;
            if (colorStateList == null) {
                i = 0;
            } else {
                int[] iArr3 = this.E;
                i = iArr3 != null ? colorStateList.getColorForState(iArr3, 0) : colorStateList.getDefaultColor();
            }
        }
        textPaint.setColor(i);
        float f11 = this.e;
        float f12 = this.s;
        if (f11 != f12) {
            TextPaint textPaint2 = this.G;
            TimeInterpolator timeInterpolator6 = unbindViews.d;
            textPaint2.setLetterSpacing(f12 + ((timeInterpolator6 != null ? timeInterpolator6.getInterpolation(f) : f) * (f11 - f12)));
        } else {
            this.G.setLetterSpacing(f11);
        }
        TextPaint textPaint3 = this.G;
        float f13 = this.ac;
        float f14 = this.j;
        float f15 = this.Y;
        float f16 = this.i;
        float f17 = this.aa;
        float f18 = this.f;
        ColorStateList colorStateList4 = this.Z;
        if (colorStateList4 == null) {
            i2 = 0;
        } else {
            int[] iArr4 = this.E;
            i2 = iArr4 != null ? colorStateList4.getColorForState(iArr4, 0) : colorStateList4.getDefaultColor();
        }
        ColorStateList colorStateList5 = this.b;
        if (colorStateList5 != null) {
            int[] iArr5 = this.E;
            i5 = iArr5 != null ? colorStateList5.getColorForState(iArr5, 0) : colorStateList5.getDefaultColor();
        }
        textPaint3.setShadowLayer(f13 + ((f14 - f13) * f), f15 + ((f16 - f15) * f), f17 + ((f18 - f17) * f), a(i2, i5, f));
        if (this.C) {
            float f19 = this.D;
            this.G.setAlpha((int) ((f <= f19 ? unbindViews.b(1.0f, 0.0f, this.ae, f19, f) : unbindViews.b(0.0f, 1.0f, f19, 1.0f, f)) * 255.0f));
        }
        findFragmentByWho.K(this.M);
    }

    private void a(float f, boolean z) {
        boolean z2;
        float f2;
        float f3;
        if (this.F != null) {
            float width = (float) this.a.width();
            float width2 = (float) this.p.width();
            int i = 1;
            boolean z3 = false;
            if (Math.abs(f - this.f26o) < 0.001f) {
                f2 = this.f26o;
                this.A = 1.0f;
                Typeface typeface = this.T;
                Typeface typeface2 = this.S;
                if (typeface != typeface2) {
                    this.T = typeface2;
                    z2 = true;
                    f3 = width;
                } else {
                    z2 = false;
                    f3 = width;
                }
            } else {
                f2 = this.w;
                Typeface typeface3 = this.T;
                Typeface typeface4 = this.z;
                if (typeface3 != typeface4) {
                    this.T = typeface4;
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (Math.abs(f - f2) < 0.001f) {
                    this.A = 1.0f;
                } else {
                    this.A = f / this.w;
                }
                float f4 = this.f26o / this.w;
                f3 = (!z && width2 * f4 > width) ? Math.min(width / f4, width2) : width2;
            }
            boolean z4 = z2;
            if (f3 > 0.0f) {
                z4 = this.m != f2 || this.d || z2;
                this.m = f2;
                this.d = false;
            }
            if (this.H == null || z4) {
                this.G.setTextSize(this.m);
                this.G.setTypeface(this.T);
                TextPaint textPaint = this.G;
                if (this.A != 1.0f) {
                    z3 = true;
                }
                textPaint.setLinearText(z3);
                this.af = b(this.F);
                if (c()) {
                    i = this.B;
                }
                StaticLayout c = c(i, f3, this.af);
                this.I = c;
                this.H = c.getText();
            }
        }
    }

    private void b(float f) {
        if (this.C) {
            this.U.set(f < this.D ? this.p : this.a);
            return;
        }
        RectF rectF = this.U;
        float f2 = (float) this.p.left;
        float f3 = (float) this.a.left;
        TimeInterpolator timeInterpolator = this.am;
        rectF.left = f2 + ((timeInterpolator != null ? timeInterpolator.getInterpolation(f) : f) * (f3 - f2));
        RectF rectF2 = this.U;
        float f4 = this.V;
        float f5 = this.P;
        TimeInterpolator timeInterpolator2 = this.am;
        rectF2.top = f4 + ((timeInterpolator2 != null ? timeInterpolator2.getInterpolation(f) : f) * (f5 - f4));
        RectF rectF3 = this.U;
        float f6 = (float) this.p.right;
        float f7 = (float) this.a.right;
        TimeInterpolator timeInterpolator3 = this.am;
        rectF3.right = f6 + ((timeInterpolator3 != null ? timeInterpolator3.getInterpolation(f) : f) * (f7 - f6));
        RectF rectF4 = this.U;
        float f8 = (float) this.p.bottom;
        float f9 = (float) this.a.bottom;
        TimeInterpolator timeInterpolator4 = this.am;
        float f10 = f;
        if (timeInterpolator4 != null) {
            f10 = timeInterpolator4.getInterpolation(f);
        }
        rectF4.bottom = f8 + (f10 * (f9 - f8));
    }

    private boolean b(CharSequence charSequence) {
        boolean z = true;
        if (findFragmentByWho.k(this.M) != 1) {
            z = false;
        }
        boolean z2 = z;
        if (this.ad) {
            z2 = (z ? getTheme.e : getTheme.a).d(charSequence, 0, charSequence.length());
        }
        return z2;
    }

    private StaticLayout c(int i, float f, boolean z) {
        StaticLayout staticLayout;
        try {
            GuestWarningDialog guestWarningDialog = new GuestWarningDialog(this.F, this.G, (int) f);
            guestWarningDialog.b = TextUtils.TruncateAt.END;
            guestWarningDialog.i = z;
            guestWarningDialog.a = Layout.Alignment.ALIGN_NORMAL;
            guestWarningDialog.c = false;
            guestWarningDialog.j = i;
            float f2 = this.ag;
            float f3 = this.aj;
            guestWarningDialog.g = f2;
            guestWarningDialog.h = f3;
            guestWarningDialog.e = this.ah;
            staticLayout = guestWarningDialog.e();
        } catch (GuestWarningDialog.write e) {
            Log.e("CollapsingTextHelper", e.getCause().getMessage(), e);
            staticLayout = null;
        }
        return staticLayout;
    }

    private void d(float f) {
        a(f, false);
        boolean z = false;
        if (Q) {
            z = false;
            if (this.A != 1.0f) {
                z = true;
            }
        }
        this.K = z;
        if (z) {
            e();
        }
        findFragmentByWho.K(this.M);
    }

    private void e() {
        if (this.u == null && !this.p.isEmpty() && !TextUtils.isEmpty(this.H)) {
            a(0.0f);
            int width = this.I.getWidth();
            int height = this.I.getHeight();
            if (width > 0 && height > 0) {
                this.u = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
                this.I.draw(new Canvas(this.u));
                if (this.N == null) {
                    this.N = new Paint(3);
                }
            }
        }
    }

    public static boolean e(Rect rect, int i, int i2, int i3, int i4) {
        return rect.left == i && rect.top == i2 && rect.right == i3 && rect.bottom == i4;
    }

    private float g() {
        if (this.F == null) {
            return 0.0f;
        }
        TextPaint textPaint = this.J;
        textPaint.setTextSize(this.f26o);
        textPaint.setTypeface(this.S);
        textPaint.setLetterSpacing(this.e);
        TextPaint textPaint2 = this.J;
        CharSequence charSequence = this.F;
        return textPaint2.measureText(charSequence, 0, charSequence.length());
    }

    public final void a() {
        StaticLayout staticLayout;
        if (this.M.getHeight() > 0 && this.M.getWidth() > 0) {
            float f = this.m;
            a(this.f26o, false);
            CharSequence charSequence = this.H;
            if (!(charSequence == null || (staticLayout = this.I) == null)) {
                this.L = TextUtils.ellipsize(charSequence, this.G, (float) staticLayout.getWidth(), TextUtils.TruncateAt.END);
            }
            CharSequence charSequence2 = this.L;
            float f2 = 0.0f;
            float measureText = charSequence2 != null ? this.G.measureText(charSequence2, 0, charSequence2.length()) : 0.0f;
            int c = onGetLayoutInflater.c(this.l, this.af ? 1 : 0);
            int i = c & 112;
            if (i == 48) {
                this.P = (float) this.a.top;
            } else if (i != 80) {
                this.P = ((float) this.a.centerY()) - ((this.G.descent() - this.G.ascent()) / 2.0f);
            } else {
                this.P = ((float) this.a.bottom) + this.G.ascent();
            }
            int i2 = c & 8388615;
            if (i2 == 1) {
                this.O = ((float) this.a.centerX()) - (measureText / 2.0f);
            } else if (i2 != 5) {
                this.O = (float) this.a.left;
            } else {
                this.O = ((float) this.a.right) - measureText;
            }
            a(this.w, false);
            StaticLayout staticLayout2 = this.I;
            float height = staticLayout2 != null ? (float) staticLayout2.getHeight() : 0.0f;
            CharSequence charSequence3 = this.H;
            float measureText2 = charSequence3 != null ? this.G.measureText(charSequence3, 0, charSequence3.length()) : 0.0f;
            StaticLayout staticLayout3 = this.I;
            float f3 = measureText2;
            if (staticLayout3 != null) {
                f3 = measureText2;
                if (this.B > 1) {
                    f3 = (float) staticLayout3.getWidth();
                }
            }
            StaticLayout staticLayout4 = this.I;
            if (staticLayout4 != null) {
                f2 = this.B > 1 ? (float) staticLayout4.getLineStart(0) : staticLayout4.getLineLeft(0);
            }
            this.r = f2;
            int c2 = onGetLayoutInflater.c(this.v, this.af ? 1 : 0);
            int i3 = c2 & 112;
            if (i3 == 48) {
                this.V = (float) this.p.top;
            } else if (i3 != 80) {
                this.V = ((float) this.p.centerY()) - (height / 2.0f);
            } else {
                this.V = (((float) this.p.bottom) - height) + this.G.descent();
            }
            int i4 = c2 & 8388615;
            if (i4 == 1) {
                this.W = ((float) this.p.centerX()) - (f3 / 2.0f);
            } else if (i4 != 5) {
                this.W = (float) this.p.left;
            } else {
                this.W = ((float) this.p.right) - f3;
            }
            Bitmap bitmap = this.u;
            if (bitmap != null) {
                bitmap.recycle();
                this.u = null;
            }
            d(f);
            a(this.t);
        }
    }

    public final void a(int i) {
        if (this.l != i) {
            this.l = i;
            a();
        }
    }

    public final void a(TimeInterpolator timeInterpolator) {
        this.am = timeInterpolator;
        a();
    }

    public final void b() {
        this.q = this.a.width() > 0 && this.a.height() > 0 && this.p.width() > 0 && this.p.height() > 0;
    }

    public final void c(TimeInterpolator timeInterpolator) {
        this.ak = timeInterpolator;
        a();
    }

    public boolean c() {
        boolean z = true;
        if (this.B <= 1 || ((this.af && !this.C) || this.K)) {
            z = false;
        }
        return z;
    }

    boolean c(Typeface typeface) {
        InfoCaraPembayaranDialog_ViewBinding infoCaraPembayaranDialog_ViewBinding = this.c;
        if (infoCaraPembayaranDialog_ViewBinding != null) {
            infoCaraPembayaranDialog_ViewBinding.a = true;
        }
        if (this.S == typeface) {
            return false;
        }
        this.S = typeface;
        return true;
    }

    public final float d() {
        TextPaint textPaint = this.J;
        textPaint.setTextSize(this.f26o);
        textPaint.setTypeface(this.S);
        textPaint.setLetterSpacing(this.e);
        return -this.J.ascent();
    }

    public final void d(Typeface typeface) {
        boolean c = c(typeface);
        InfoCaraPembayaranDialog_ViewBinding infoCaraPembayaranDialog_ViewBinding = this.ab;
        boolean z = true;
        if (infoCaraPembayaranDialog_ViewBinding != null) {
            infoCaraPembayaranDialog_ViewBinding.a = true;
        }
        if (this.z != typeface) {
            this.z = typeface;
        } else {
            z = false;
        }
        if (c || z) {
            a();
        }
    }

    public final void e(float f) {
        float f2;
        if (f < 0.0f) {
            f2 = 0.0f;
        } else {
            f2 = f;
            if (f > 1.0f) {
                f2 = 1.0f;
            }
        }
        if (f2 != this.t) {
            this.t = f2;
            a(f2);
        }
    }

    public final void e(RectF rectF, int i, int i2) {
        float f;
        float f2;
        float f3;
        float f4;
        int i3;
        float f5;
        float f6;
        int i4;
        boolean b = b(this.F);
        this.af = b;
        if (i2 == 17 || (i2 & 7) == 1) {
            f6 = ((float) i) / 2.0f;
            f5 = g() / 2.0f;
        } else {
            if ((i2 & 8388613) == 8388613 || (i2 & 5) == 5) {
                if (this.af) {
                    i4 = this.a.left;
                    f = (float) i4;
                } else {
                    f6 = (float) this.a.right;
                    f5 = g();
                }
            } else if (b) {
                f6 = (float) this.a.right;
                f5 = g();
            } else {
                i4 = this.a.left;
                f = (float) i4;
            }
            rectF.left = f;
            rectF.top = (float) this.a.top;
            if (i2 != 17 || (i2 & 7) == 1) {
                f4 = ((float) i) / 2.0f;
                f3 = g() / 2.0f;
            } else {
                if ((i2 & 8388613) == 8388613 || (i2 & 5) == 5) {
                    if (this.af) {
                        f4 = rectF.left;
                        f3 = g();
                    } else {
                        i3 = this.a.right;
                        f2 = (float) i3;
                    }
                } else if (this.af) {
                    i3 = this.a.right;
                    f2 = (float) i3;
                } else {
                    f4 = rectF.left;
                    f3 = g();
                }
                rectF.right = f2;
                float f7 = (float) this.a.top;
                TextPaint textPaint = this.J;
                textPaint.setTextSize(this.f26o);
                textPaint.setTypeface(this.S);
                textPaint.setLetterSpacing(this.e);
                rectF.bottom = f7 - this.J.ascent();
            }
            f2 = f4 + f3;
            rectF.right = f2;
            float f72 = (float) this.a.top;
            TextPaint textPaint2 = this.J;
            textPaint2.setTextSize(this.f26o);
            textPaint2.setTypeface(this.S);
            textPaint2.setLetterSpacing(this.e);
            rectF.bottom = f72 - this.J.ascent();
        }
        f = f6 - f5;
        rectF.left = f;
        rectF.top = (float) this.a.top;
        if (i2 != 17) {
        }
        f4 = ((float) i) / 2.0f;
        f3 = g() / 2.0f;
        f2 = f4 + f3;
        rectF.right = f2;
        float f722 = (float) this.a.top;
        TextPaint textPaint22 = this.J;
        textPaint22.setTextSize(this.f26o);
        textPaint22.setTypeface(this.S);
        textPaint22.setLetterSpacing(this.e);
        rectF.bottom = f722 - this.J.ascent();
    }
}
