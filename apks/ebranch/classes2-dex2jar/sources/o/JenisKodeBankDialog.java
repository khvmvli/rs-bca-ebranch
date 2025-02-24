package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import java.util.BitSet;
import o.JenisKodeBankDialog_ViewBinding;
import o.KategoriTujuanTransaksiORDialog_ViewBinding;
/* loaded from: classes2-dex2jar.jar:o/JenisKodeBankDialog.class */
public class JenisKodeBankDialog extends Drawable implements getVisibleInsets, KategoriTujuanTransaksiORDialog {
    private static final String c;
    private static final Paint d = new Paint(1);
    final BitSet A;
    final JenisKodeBankDialog_ViewBinding.MediaDescriptionCompat[] C;
    public read F;
    public boolean G;
    public boolean H;
    final JenisKodeBankDialog_ViewBinding.MediaDescriptionCompat[] I;
    private final Matrix a;
    private final Paint b;
    private final RectF e;
    private final KategoriTujuanTransaksiORDialog_ViewBinding f;
    private final KategoriTujuanTransaksiORDialog_ViewBinding.IconCompatParcelizer g;
    private final RectF h;
    private final Path i;
    private final Path j;
    private final Paint k;
    private final Region l;
    private final InfoEchannelDialog_ViewBinding m;
    private JenisPekerjaanDialog n;

    /* renamed from: o */
    private final RectF f35o;
    private PorterDuffColorFilter p;
    private final Region r;
    private PorterDuffColorFilter s;

    /* loaded from: classes2-dex2jar.jar:o/JenisKodeBankDialog$read.class */
    public static final class read extends Drawable.ConstantState {
        public float a;
        public int b;
        public ColorFilter c;
        public ColorStateList d;
        public ExitReservasiDialog e;
        public Paint.Style f;
        public float g;
        public Rect h;
        public float i;
        public float j;
        public int k;
        public JenisPekerjaanDialog l;
        public int m;
        public int n;

        /* renamed from: o */
        public int f36o;
        public ColorStateList p;
        public ColorStateList q;
        public ColorStateList r;
        public float s;
        public PorterDuff.Mode t;
        public boolean u;
        public float x;

        public read(read read) {
            this.d = null;
            this.r = null;
            this.p = null;
            this.q = null;
            this.t = PorterDuff.Mode.SRC_IN;
            this.h = null;
            this.g = 1.0f;
            this.i = 1.0f;
            this.b = 255;
            this.j = 0.0f;
            this.a = 0.0f;
            this.x = 0.0f;
            this.m = 0;
            this.f36o = 0;
            this.n = 0;
            this.k = 0;
            this.u = false;
            this.f = Paint.Style.FILL_AND_STROKE;
            this.l = read.l;
            this.e = read.e;
            this.s = read.s;
            this.c = read.c;
            this.d = read.d;
            this.r = read.r;
            this.t = read.t;
            this.q = read.q;
            this.b = read.b;
            this.g = read.g;
            this.n = read.n;
            this.m = read.m;
            this.u = read.u;
            this.i = read.i;
            this.j = read.j;
            this.a = read.a;
            this.x = read.x;
            this.f36o = read.f36o;
            this.k = read.k;
            this.p = read.p;
            this.f = read.f;
            if (read.h != null) {
                this.h = new Rect(read.h);
            }
        }

        public read(JenisPekerjaanDialog jenisPekerjaanDialog, ExitReservasiDialog exitReservasiDialog) {
            this.d = null;
            this.r = null;
            this.p = null;
            this.q = null;
            this.t = PorterDuff.Mode.SRC_IN;
            this.h = null;
            this.g = 1.0f;
            this.i = 1.0f;
            this.b = 255;
            this.j = 0.0f;
            this.a = 0.0f;
            this.x = 0.0f;
            this.m = 0;
            this.f36o = 0;
            this.n = 0;
            this.k = 0;
            this.u = false;
            this.f = Paint.Style.FILL_AND_STROKE;
            this.l = jenisPekerjaanDialog;
            this.e = exitReservasiDialog;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable() {
            JenisKodeBankDialog jenisKodeBankDialog = new JenisKodeBankDialog(this, (byte) 0);
            jenisKodeBankDialog.H = true;
            return jenisKodeBankDialog;
        }
    }

    public JenisKodeBankDialog() {
        this(new JenisPekerjaanDialog());
    }

    public JenisKodeBankDialog(Context context, AttributeSet attributeSet, int i, int i2) {
        this(new JenisPekerjaanDialog(JenisPekerjaanDialog.d(context, attributeSet, i, i2, new InfoTarikanDialog_ViewBinding(0.0f)), (byte) 0));
    }

    private JenisKodeBankDialog(read read2) {
        this.C = new JenisKodeBankDialog_ViewBinding.MediaDescriptionCompat[4];
        this.I = new JenisKodeBankDialog_ViewBinding.MediaDescriptionCompat[4];
        this.A = new BitSet(8);
        this.a = new Matrix();
        this.j = new Path();
        this.i = new Path();
        this.f35o = new RectF();
        this.e = new RectF();
        this.r = new Region();
        this.l = new Region();
        Paint paint = new Paint(1);
        this.b = paint;
        Paint paint2 = new Paint(1);
        this.k = paint2;
        this.m = new InfoEchannelDialog_ViewBinding();
        this.f = Looper.getMainLooper().getThread() == Thread.currentThread() ? KategoriTujuanTransaksiORDialog_ViewBinding.write.a : new KategoriTujuanTransaksiORDialog_ViewBinding();
        this.h = new RectF();
        this.G = true;
        this.F = read2;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        Paint paint3 = d;
        paint3.setColor(-1);
        paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        e();
        b(getState());
        this.g = new KategoriTujuanTransaksiORDialog_ViewBinding.IconCompatParcelizer() { // from class: o.JenisKodeBankDialog.2
            @Override // o.KategoriTujuanTransaksiORDialog_ViewBinding.IconCompatParcelizer
            public final void a(JenisKodeBankDialog_ViewBinding jenisKodeBankDialog_ViewBinding, Matrix matrix, int i) {
                JenisKodeBankDialog.this.A.set(i + 4, jenisKodeBankDialog_ViewBinding.b);
                JenisKodeBankDialog.this.I[i] = jenisKodeBankDialog_ViewBinding.c(matrix);
            }

            @Override // o.KategoriTujuanTransaksiORDialog_ViewBinding.IconCompatParcelizer
            public final void e(JenisKodeBankDialog_ViewBinding jenisKodeBankDialog_ViewBinding, Matrix matrix, int i) {
                JenisKodeBankDialog.this.A.set(i, jenisKodeBankDialog_ViewBinding.b);
                JenisKodeBankDialog.this.C[i] = jenisKodeBankDialog_ViewBinding.c(matrix);
            }
        };
    }

    /* synthetic */ JenisKodeBankDialog(read read2, byte b) {
        this(read2);
    }

    public JenisKodeBankDialog(JenisPekerjaanDialog jenisPekerjaanDialog) {
        this(new read(jenisPekerjaanDialog, null));
    }

    public static JenisKodeBankDialog a(Context context, float f) {
        int c2 = HubunganDialog_ViewBinding.c(context, BaseDialogKotlin$MediaBrowserCompat$CustomActionResultReceiver.t, c);
        JenisKodeBankDialog jenisKodeBankDialog = new JenisKodeBankDialog();
        jenisKodeBankDialog.F.e = new ExitReservasiDialog(context);
        jenisKodeBankDialog.k();
        ColorStateList valueOf = ColorStateList.valueOf(c2);
        if (jenisKodeBankDialog.F.d != valueOf) {
            jenisKodeBankDialog.F.d = valueOf;
            jenisKodeBankDialog.onStateChange(jenisKodeBankDialog.getState());
        }
        if (jenisKodeBankDialog.F.a != f) {
            jenisKodeBankDialog.F.a = f;
            jenisKodeBankDialog.k();
        }
        return jenisKodeBankDialog;
    }

    private void a(Canvas canvas, Paint paint, Path path, JenisPekerjaanDialog jenisPekerjaanDialog, RectF rectF) {
        if (jenisPekerjaanDialog.a(rectF)) {
            float e = jenisPekerjaanDialog.l.e(rectF) * this.F.i;
            canvas.drawRoundRect(rectF, e, e, paint);
            return;
        }
        canvas.drawPath(path, paint);
    }

    private void a(RectF rectF, Path path) {
        this.f.b(this.F.l, this.F.i, rectF, this.g, path);
        if (this.F.g != 1.0f) {
            this.a.reset();
            this.a.setScale(this.F.g, this.F.g, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(this.a);
        }
        path.computeBounds(this.h, true);
    }

    private void b(Canvas canvas) {
        if (this.A.cardinality() > 0) {
            Log.w(c, "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        if (this.F.n != 0) {
            canvas.drawPath(this.j, this.m.j);
        }
        for (int i = 0; i < 4; i++) {
            this.C[i].e(JenisKodeBankDialog_ViewBinding.MediaDescriptionCompat.e, this.m, this.F.f36o, canvas);
            this.I[i].e(JenisKodeBankDialog_ViewBinding.MediaDescriptionCompat.e, this.m, this.F.f36o, canvas);
        }
        if (this.G) {
            int sin = (int) (((double) this.F.n) * Math.sin(Math.toRadians((double) this.F.k)));
            int cos = (int) (((double) this.F.n) * Math.cos(Math.toRadians((double) this.F.k)));
            canvas.translate((float) (-sin), (float) (-cos));
            canvas.drawPath(this.j, d);
            canvas.translate((float) sin, (float) cos);
        }
    }

    private boolean b(int[] iArr) {
        int color;
        int colorForState;
        int color2;
        int colorForState2;
        boolean z = true;
        if (this.F.d == null || color2 == (colorForState2 = this.F.d.getColorForState(iArr, (color2 = this.b.getColor())))) {
            z = false;
        } else {
            this.b.setColor(colorForState2);
            z = true;
        }
        if (!(this.F.r == null || color == (colorForState = this.F.r.getColorForState(iArr, (color = this.k.getColor()))))) {
            this.k.setColor(colorForState);
        }
        return z;
    }

    private RectF c() {
        RectF rectF = this.e;
        this.f35o.set(getBounds());
        rectF.set(this.f35o);
        float strokeWidth = d() ? this.k.getStrokeWidth() / 2.0f : 0.0f;
        this.e.inset(strokeWidth, strokeWidth);
        return this.e;
    }

    private PorterDuffColorFilter d(ColorStateList colorStateList, PorterDuff.Mode mode, Paint paint, boolean z) {
        PorterDuffColorFilter porterDuffColorFilter;
        int color;
        int c2;
        if (colorStateList == null || mode == null) {
            porterDuffColorFilter = (!z || (c2 = c((color = paint.getColor()))) == color) ? null : new PorterDuffColorFilter(c2, PorterDuff.Mode.SRC_IN);
        } else {
            int colorForState = colorStateList.getColorForState(getState(), 0);
            int i = colorForState;
            if (z) {
                i = c(colorForState);
            }
            porterDuffColorFilter = new PorterDuffColorFilter(i, mode);
        }
        return porterDuffColorFilter;
    }

    private boolean d() {
        return (this.F.f == Paint.Style.FILL_AND_STROKE || this.F.f == Paint.Style.STROKE) && this.k.getStrokeWidth() > 0.0f;
    }

    private boolean e() {
        PorterDuffColorFilter porterDuffColorFilter = this.s;
        PorterDuffColorFilter porterDuffColorFilter2 = this.p;
        this.s = d(this.F.q, this.F.t, this.b, true);
        this.p = d(this.F.p, this.F.t, this.k, false);
        if (this.F.u) {
            this.m.a(this.F.q.getColorForState(getState(), 0));
        }
        boolean z = true;
        if (onDetach.a(porterDuffColorFilter, this.s)) {
            z = !onDetach.a(porterDuffColorFilter2, this.p);
        }
        return z;
    }

    private void k() {
        float f = this.F.a + this.F.x;
        this.F.f36o = (int) Math.ceil((double) (0.75f * f));
        this.F.n = (int) Math.ceil((double) (f * 0.25f));
        e();
        invalidateSelf();
    }

    public void a() {
        invalidateSelf();
    }

    public final void a(float f, int i) {
        this.F.s = f;
        invalidateSelf();
        ColorStateList valueOf = ColorStateList.valueOf(i);
        if (this.F.r != valueOf) {
            this.F.r = valueOf;
            onStateChange(getState());
        }
    }

    public final void a(int i) {
        this.m.a(-12303292);
        this.F.u = false;
        invalidateSelf();
    }

    public final float b() {
        IsiPernyataanDialog_ViewBinding isiPernyataanDialog_ViewBinding = this.F.l.c;
        this.f35o.set(getBounds());
        return isiPernyataanDialog_ViewBinding.e(this.f35o);
    }

    public final void b(Context context) {
        this.F.e = new ExitReservasiDialog(context);
        k();
    }

    public final void b(Canvas canvas, Paint paint, Path path, RectF rectF) {
        a(canvas, paint, path, this.F.l, rectF);
    }

    protected final int c(int i) {
        float f = this.F.a;
        float f2 = this.F.x;
        float f3 = this.F.j;
        int i2 = i;
        if (this.F.e != null) {
            i2 = this.F.e.d(i, f + f2 + f3);
        }
        return i2;
    }

    public final void c(float f, ColorStateList colorStateList) {
        this.F.s = f;
        invalidateSelf();
        if (this.F.r != colorStateList) {
            this.F.r = colorStateList;
            onStateChange(getState());
        }
    }

    public final void c(ColorStateList colorStateList) {
        if (this.F.d != colorStateList) {
            this.F.d = colorStateList;
            onStateChange(getState());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x019e, code lost:
        if ((!r0.a(r7.f35o) && !r7.j.isConvex() && android.os.Build.VERSION.SDK_INT < 29) != false) goto L_0x01a1;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0329  */
    @Override // android.graphics.drawable.Drawable
    /* Code decompiled incorrectly, please refer to instructions dump */
    public void draw(android.graphics.Canvas r8) {
        /*
        // Method dump skipped, instructions count: 848
        */
        throw new UnsupportedOperationException("Method not decompiled: o.JenisKodeBankDialog.draw(android.graphics.Canvas):void");
    }

    protected final void e(RectF rectF, Path path) {
        this.f.b(this.F.l, this.F.i, rectF, this.g, path);
    }

    protected final RectF f() {
        this.f35o.set(getBounds());
        return this.f35o;
    }

    public final ColorStateList g() {
        return this.F.d;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.F;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        if (this.F.m != 2) {
            JenisPekerjaanDialog jenisPekerjaanDialog = this.F.l;
            this.f35o.set(getBounds());
            if (jenisPekerjaanDialog.a(this.f35o)) {
                IsiPernyataanDialog_ViewBinding isiPernyataanDialog_ViewBinding = this.F.l.m;
                this.f35o.set(getBounds());
                outline.setRoundRect(getBounds(), isiPernyataanDialog_ViewBinding.e(this.f35o) * this.F.i);
                return;
            }
            this.f35o.set(getBounds());
            a(this.f35o, this.j);
            if (this.j.isConvex() || Build.VERSION.SDK_INT >= 29) {
                try {
                    outline.setConvexPath(this.j);
                } catch (IllegalArgumentException e) {
                }
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        if (this.F.h == null) {
            return getPadding(rect);
        }
        rect.set(this.F.h);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public Region getTransparentRegion() {
        this.r.set(getBounds());
        this.f35o.set(getBounds());
        a(this.f35o, this.j);
        this.l.setPath(this.j, this.r);
        this.r.op(this.l, Region.Op.DIFFERENCE);
        return this.r;
    }

    public final float h() {
        IsiPernyataanDialog_ViewBinding isiPernyataanDialog_ViewBinding = this.F.l.l;
        this.f35o.set(getBounds());
        return isiPernyataanDialog_ViewBinding.e(this.f35o);
    }

    public final float i() {
        IsiPernyataanDialog_ViewBinding isiPernyataanDialog_ViewBinding = this.F.l.i;
        this.f35o.set(getBounds());
        return isiPernyataanDialog_ViewBinding.e(this.f35o);
    }

    public final void i(ColorStateList colorStateList) {
        if (this.F.r != colorStateList) {
            this.F.r = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        this.H = true;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return isStateful() || (this.F.q != null && this.F.q.isStateful()) || ((this.F.p != null && this.F.p.isStateful()) || ((this.F.r != null && this.F.r.isStateful()) || (this.F.d != null && this.F.d.isStateful())));
    }

    public final float j() {
        IsiPernyataanDialog_ViewBinding isiPernyataanDialog_ViewBinding = this.F.l.m;
        this.f35o.set(getBounds());
        return isiPernyataanDialog_ViewBinding.e(this.f35o);
    }

    public final void l(float f) {
        if (this.F.a != f) {
            this.F.a = f;
            k();
        }
    }

    public final boolean l() {
        return this.F.e != null && this.F.e.e;
    }

    public final void m(float f) {
        this.F.s = f;
        invalidateSelf();
    }

    public final boolean m() {
        JenisPekerjaanDialog jenisPekerjaanDialog = this.F.l;
        this.f35o.set(getBounds());
        return jenisPekerjaanDialog.a(this.f35o);
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.F = new read(this.F);
        return this;
    }

    public final void n(float f) {
        if (this.F.j != f) {
            this.F.j = f;
            k();
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        this.H = true;
        onBoundsChange(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        boolean z = b(iArr) || e();
        if (z) {
            invalidateSelf();
        }
        return z;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        if (this.F.b != i) {
            this.F.b = i;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.F.c = colorFilter;
        invalidateSelf();
    }

    @Override // o.KategoriTujuanTransaksiORDialog
    public void setShapeAppearanceModel(JenisPekerjaanDialog jenisPekerjaanDialog) {
        this.F.l = jenisPekerjaanDialog;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.F.q = colorStateList;
        e();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        if (this.F.t != mode) {
            this.F.t = mode;
            e();
            invalidateSelf();
        }
    }
}
