package o;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
/* loaded from: classes-dex2jar.jar:o/setSwitchTypeface.class */
final class setSwitchTypeface extends Drawable {
    ColorStateList a;
    float b;
    float d;
    private PorterDuffColorFilter f;
    private ColorStateList g;
    boolean c = false;
    boolean e = true;

    /* renamed from: o  reason: collision with root package name */
    private PorterDuff.Mode f275o = PorterDuff.Mode.SRC_IN;
    private final Paint j = new Paint(5);
    private final RectF i = new RectF();
    private final Rect h = new Rect();

    /* JADX INFO: Access modifiers changed from: package-private */
    public setSwitchTypeface(ColorStateList colorStateList, float f) {
        this.d = f;
        b(colorStateList);
    }

    private PorterDuffColorFilter d(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(ColorStateList colorStateList) {
        ColorStateList colorStateList2 = colorStateList;
        if (colorStateList == null) {
            colorStateList2 = ColorStateList.valueOf(0);
        }
        this.a = colorStateList2;
        this.j.setColor(colorStateList2.getColorForState(getState(), this.a.getDefaultColor()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d(Rect rect) {
        Rect rect2 = rect;
        if (rect == null) {
            rect2 = getBounds();
        }
        this.i.set((float) rect2.left, (float) rect2.top, (float) rect2.right, (float) rect2.bottom);
        this.h.set(rect2);
        if (this.c) {
            float b = setSwitchTextAppearance.b(this.b, this.d, this.e);
            this.h.inset((int) Math.ceil((double) setSwitchTextAppearance.e(this.b, this.d, this.e)), (int) Math.ceil((double) b));
            this.i.set(this.h);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        boolean z;
        Paint paint = this.j;
        if (this.f == null || paint.getColorFilter() != null) {
            z = false;
        } else {
            paint.setColorFilter(this.f);
            z = true;
        }
        RectF rectF = this.i;
        float f = this.d;
        canvas.drawRoundRect(rectF, f, f, paint);
        if (z) {
            paint.setColorFilter(null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        outline.setRoundRect(this.h, this.d);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.g;
        return (colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = this.a) != null && colorStateList.isStateful()) || isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    protected final void onBoundsChange(Rect rect) {
        onBoundsChange(rect);
        d(rect);
    }

    @Override // android.graphics.drawable.Drawable
    protected final boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        ColorStateList colorStateList = this.a;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        boolean z = colorForState != this.j.getColor();
        if (z) {
            this.j.setColor(colorForState);
        }
        ColorStateList colorStateList2 = this.g;
        if (colorStateList2 == null || (mode = this.f275o) == null) {
            return z;
        }
        this.f = d(colorStateList2, mode);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.j.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.j.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        this.g = colorStateList;
        this.f = d(colorStateList, this.f275o);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        this.f275o = mode;
        this.f = d(this.g, mode);
        invalidateSelf();
    }
}
