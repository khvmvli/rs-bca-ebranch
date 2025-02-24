package o;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import o.KategoriTujuanTransaksiORDialog_ViewBinding;
/* loaded from: classes2-dex2jar.jar:o/onClickBtnOk.class */
public final class onClickBtnOk extends Drawable {
    int a;
    final Paint c;
    int d;
    float e;
    private ColorStateList g;
    int h;
    JenisPekerjaanDialog i;
    int j;
    private int l;
    private final KategoriTujuanTransaksiORDialog_ViewBinding k = KategoriTujuanTransaksiORDialog_ViewBinding.write.a;
    private final Path m = new Path();

    /* renamed from: o  reason: collision with root package name */
    private final Rect f70o = new Rect();
    private final RectF n = new RectF();
    private final RectF f = new RectF();
    private final IconCompatParcelizer s = new IconCompatParcelizer(this, (byte) 0);
    boolean b = true;

    /* loaded from: classes2-dex2jar.jar:o/onClickBtnOk$IconCompatParcelizer.class */
    final class IconCompatParcelizer extends Drawable.ConstantState {
        private IconCompatParcelizer() {
        }

        /* synthetic */ IconCompatParcelizer(onClickBtnOk onclickbtnok, byte b) {
            this();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable() {
            return onClickBtnOk.this;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public onClickBtnOk(JenisPekerjaanDialog jenisPekerjaanDialog) {
        this.i = jenisPekerjaanDialog;
        Paint paint = new Paint(1);
        this.c = paint;
        paint.setStyle(Paint.Style.STROKE);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (this.b) {
            Paint paint = this.c;
            Rect rect = this.f70o;
            copyBounds(rect);
            float height = this.e / ((float) rect.height());
            paint.setShader(new LinearGradient(0.0f, (float) rect.top, 0.0f, (float) rect.bottom, new int[]{isRound.a(this.j, this.l), isRound.a(this.h, this.l), isRound.a(isRound.b(this.h, 0), this.l), isRound.a(isRound.b(this.d, 0), this.l), isRound.a(this.d, this.l), isRound.a(this.a, this.l)}, new float[]{0.0f, height, 0.5f, 0.5f, 1.0f - height, 1.0f}, Shader.TileMode.CLAMP));
            this.b = false;
        }
        float strokeWidth = this.c.getStrokeWidth() / 2.0f;
        copyBounds(this.f70o);
        this.n.set(this.f70o);
        IsiPernyataanDialog_ViewBinding isiPernyataanDialog_ViewBinding = this.i.m;
        this.f.set(getBounds());
        float min = Math.min(isiPernyataanDialog_ViewBinding.e(this.f), this.n.width() / 2.0f);
        JenisPekerjaanDialog jenisPekerjaanDialog = this.i;
        this.f.set(getBounds());
        if (jenisPekerjaanDialog.a(this.f)) {
            this.n.inset(strokeWidth, strokeWidth);
            canvas.drawRoundRect(this.n, min, min, this.c);
        }
    }

    public final void e(ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.l = colorStateList.getColorForState(getState(), this.l);
        }
        this.g = colorStateList;
        this.b = true;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.s;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return this.e > 0.0f ? -3 : -2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        JenisPekerjaanDialog jenisPekerjaanDialog = this.i;
        this.f.set(getBounds());
        if (jenisPekerjaanDialog.a(this.f)) {
            IsiPernyataanDialog_ViewBinding isiPernyataanDialog_ViewBinding = this.i.m;
            this.f.set(getBounds());
            outline.setRoundRect(getBounds(), isiPernyataanDialog_ViewBinding.e(this.f));
            return;
        }
        copyBounds(this.f70o);
        this.n.set(this.f70o);
        this.k.b(this.i, 1.0f, this.n, null, this.m);
        if (this.m.isConvex()) {
            outline.setConvexPath(this.m);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        JenisPekerjaanDialog jenisPekerjaanDialog = this.i;
        this.f.set(getBounds());
        if (!jenisPekerjaanDialog.a(this.f)) {
            return true;
        }
        int round = Math.round(this.e);
        rect.set(round, round, round, round);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList = this.g;
        return (colorStateList != null && colorStateList.isStateful()) || isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    protected final void onBoundsChange(Rect rect) {
        this.b = true;
    }

    @Override // android.graphics.drawable.Drawable
    protected final boolean onStateChange(int[] iArr) {
        int colorForState;
        ColorStateList colorStateList = this.g;
        if (!(colorStateList == null || (colorForState = colorStateList.getColorForState(iArr, this.l)) == this.l)) {
            this.b = true;
            this.l = colorForState;
        }
        if (this.b) {
            invalidateSelf();
        }
        return this.b;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.c.setAlpha(i);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.c.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
