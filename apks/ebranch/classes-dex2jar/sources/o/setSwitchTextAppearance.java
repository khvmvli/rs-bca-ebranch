package o;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
/* loaded from: classes-dex2jar.jar:o/setSwitchTextAppearance.class */
final class setSwitchTextAppearance extends Drawable {
    private static final double a = Math.cos(Math.toRadians(45.0d));
    private final RectF b;
    private float c;
    private boolean d;
    private ColorStateList e;
    private final int f;
    private Path g;
    private boolean h;
    private Paint i;
    private Paint j;
    private float k;
    private Paint l;
    private final int m;
    private float n;

    /* renamed from: o  reason: collision with root package name */
    private float f274o;
    private final int p;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static float b(float f, float f2, boolean z) {
        return z ? (float) (((double) (f * 1.5f)) + ((1.0d - a) * ((double) f2))) : f * 1.5f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static float e(float f, float f2, boolean z) {
        float f3 = f;
        if (z) {
            f3 = (float) (((double) f) + ((1.0d - a) * ((double) f2)));
        }
        return f3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (this.h) {
            Rect bounds = getBounds();
            float f = this.f274o * 1.5f;
            this.b.set(((float) bounds.left) + this.f274o, ((float) bounds.top) + f, ((float) bounds.right) - this.f274o, ((float) bounds.bottom) - f);
            float f2 = this.c;
            float f3 = -f2;
            RectF rectF = new RectF(f3, f3, f2, f2);
            RectF rectF2 = new RectF(rectF);
            float f4 = -this.n;
            rectF2.inset(f4, f4);
            Path path = this.g;
            if (path == null) {
                this.g = new Path();
            } else {
                path.reset();
            }
            this.g.setFillType(Path.FillType.EVEN_ODD);
            this.g.moveTo(-this.c, 0.0f);
            this.g.rLineTo(-this.n, 0.0f);
            this.g.arcTo(rectF2, 180.0f, 90.0f, false);
            this.g.arcTo(rectF, 270.0f, -90.0f, false);
            this.g.close();
            float f5 = this.c;
            float f6 = this.n;
            float f7 = f5 / (f6 + f5);
            Paint paint = this.i;
            int i = this.p;
            paint.setShader(new RadialGradient(0.0f, 0.0f, f5 + f6, new int[]{i, i, this.m}, new float[]{0.0f, f7, 1.0f}, Shader.TileMode.CLAMP));
            Paint paint2 = this.j;
            float f8 = -this.c;
            float f9 = this.n;
            int i2 = this.p;
            paint2.setShader(new LinearGradient(0.0f, f8 + f9, 0.0f, f8 - f9, new int[]{i2, i2, this.m}, new float[]{0.0f, 0.5f, 1.0f}, Shader.TileMode.CLAMP));
            this.j.setAntiAlias(false);
            this.h = false;
        }
        canvas.translate(0.0f, this.k / 2.0f);
        float f10 = this.c;
        float f11 = (-f10) - this.n;
        float f12 = f10 + ((float) this.f) + (this.k / 2.0f);
        float f13 = f12 * 2.0f;
        boolean z = this.b.width() - f13 > 0.0f;
        boolean z2 = this.b.height() - f13 > 0.0f;
        int save = canvas.save();
        canvas.translate(this.b.left + f12, this.b.top + f12);
        canvas.drawPath(this.g, this.i);
        if (z) {
            canvas.drawRect(0.0f, f11, this.b.width() - f13, -this.c, this.j);
        }
        canvas.restoreToCount(save);
        int save2 = canvas.save();
        canvas.translate(this.b.right - f12, this.b.bottom - f12);
        canvas.rotate(180.0f);
        canvas.drawPath(this.g, this.i);
        if (z) {
            canvas.drawRect(0.0f, f11, this.b.width() - f13, (-this.c) + this.n, this.j);
        }
        canvas.restoreToCount(save2);
        int save3 = canvas.save();
        canvas.translate(this.b.left + f12, this.b.bottom - f12);
        canvas.rotate(270.0f);
        canvas.drawPath(this.g, this.i);
        if (z2) {
            canvas.drawRect(0.0f, f11, this.b.height() - f13, -this.c, this.j);
        }
        canvas.restoreToCount(save3);
        int save4 = canvas.save();
        canvas.translate(this.b.right - f12, this.b.top + f12);
        canvas.rotate(90.0f);
        canvas.drawPath(this.g, this.i);
        if (z2) {
            canvas.drawRect(0.0f, f11, this.b.height() - f13, -this.c, this.j);
        }
        canvas.restoreToCount(save4);
        canvas.translate(0.0f, (-this.k) / 2.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        float f = this.f274o;
        int ceil = (int) Math.ceil((double) (this.d ? (float) (((double) (f * 1.5f)) + ((1.0d - a) * ((double) this.c))) : f * 1.5f));
        float f2 = this.f274o;
        float f3 = this.c;
        float f4 = f2;
        if (this.d) {
            f4 = (float) (((double) f2) + ((1.0d - a) * ((double) f3)));
        }
        int ceil2 = (int) Math.ceil((double) f4);
        rect.set(ceil2, ceil, ceil2, ceil);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList = this.e;
        return (colorStateList != null && colorStateList.isStateful()) || isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    protected final void onBoundsChange(Rect rect) {
        onBoundsChange(rect);
        this.h = true;
    }

    @Override // android.graphics.drawable.Drawable
    protected final boolean onStateChange(int[] iArr) {
        ColorStateList colorStateList = this.e;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        if (this.l.getColor() == colorForState) {
            return false;
        }
        this.l.setColor(colorForState);
        this.h = true;
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.l.setAlpha(i);
        this.i.setAlpha(i);
        this.j.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.l.setColorFilter(colorFilter);
    }
}
