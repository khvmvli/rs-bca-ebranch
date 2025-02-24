package o;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes-dex2jar.jar:o/setFillViewport.class */
public class setFillViewport extends Drawable implements Drawable.Callback, WindowInsetsCompat$Impl30, getVisibleInsets {
    static final PorterDuff.Mode b = PorterDuff.Mode.SRC_IN;
    WindowInsetsCompat$Impl21 a;
    Drawable c;
    private int d;
    private boolean e;
    private PorterDuff.Mode f;
    private boolean h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public setFillViewport(Drawable drawable) {
        this.a = c();
        b(drawable);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public setFillViewport(WindowInsetsCompat$Impl21 windowInsetsCompat$Impl21, Resources resources) {
        this.a = windowInsetsCompat$Impl21;
        b(resources);
    }

    private void b(Resources resources) {
        WindowInsetsCompat$Impl21 windowInsetsCompat$Impl21 = this.a;
        if (windowInsetsCompat$Impl21 != null && windowInsetsCompat$Impl21.b != null) {
            b(this.a.b.newDrawable(resources));
        }
    }

    private boolean b(int[] iArr) {
        if (!d()) {
            return false;
        }
        ColorStateList colorStateList = this.a.a;
        PorterDuff.Mode mode = this.a.d;
        if (colorStateList == null || mode == null) {
            this.e = false;
            clearColorFilter();
            return false;
        }
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        if (this.e && colorForState == this.d && mode == this.f) {
            return false;
        }
        setColorFilter(colorForState, mode);
        this.d = colorForState;
        this.f = mode;
        this.e = true;
        return true;
    }

    private WindowInsetsCompat$Impl21 c() {
        return new WindowInsetsCompat$Impl21(this.a);
    }

    @Override // o.WindowInsetsCompat$Impl30
    public final void b(Drawable drawable) {
        Drawable drawable2 = this.c;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.c = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            setVisible(drawable.isVisible(), true);
            setState(drawable.getState());
            setLevel(drawable.getLevel());
            setBounds(drawable.getBounds());
            WindowInsetsCompat$Impl21 windowInsetsCompat$Impl21 = this.a;
            if (windowInsetsCompat$Impl21 != null) {
                windowInsetsCompat$Impl21.b = drawable.getConstantState();
            }
        }
        invalidateSelf();
    }

    protected boolean d() {
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.c.draw(canvas);
    }

    @Override // o.WindowInsetsCompat$Impl30
    public final Drawable e() {
        return this.c;
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        int changingConfigurations = getChangingConfigurations();
        WindowInsetsCompat$Impl21 windowInsetsCompat$Impl21 = this.a;
        return changingConfigurations | (windowInsetsCompat$Impl21 != null ? windowInsetsCompat$Impl21.getChangingConfigurations() : 0) | this.c.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        WindowInsetsCompat$Impl21 windowInsetsCompat$Impl21 = this.a;
        if (windowInsetsCompat$Impl21 == null) {
            return null;
        }
        if (!(windowInsetsCompat$Impl21.b != null)) {
            return null;
        }
        this.a.c = getChangingConfigurations();
        return this.a;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable getCurrent() {
        return this.c.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.c.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.c.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getLayoutDirection() {
        return getInsetsForType.c(this.c);
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        return this.c.getMinimumHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        return this.c.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.c.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        return this.c.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public int[] getState() {
        return this.c.getState();
    }

    @Override // android.graphics.drawable.Drawable
    public Region getTransparentRegion() {
        return this.c.getTransparentRegion();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        return getInsetsForType.f(this.c);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        WindowInsetsCompat$Impl21 windowInsetsCompat$Impl21;
        ColorStateList colorStateList = (!d() || (windowInsetsCompat$Impl21 = this.a) == null) ? null : windowInsetsCompat$Impl21.a;
        return (colorStateList != null && colorStateList.isStateful()) || this.c.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        this.c.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.h && mutate() == this) {
            this.a = c();
            Drawable drawable = this.c;
            if (drawable != null) {
                drawable.mutate();
            }
            WindowInsetsCompat$Impl21 windowInsetsCompat$Impl21 = this.a;
            if (windowInsetsCompat$Impl21 != null) {
                Drawable drawable2 = this.c;
                windowInsetsCompat$Impl21.b = drawable2 != null ? drawable2.getConstantState() : null;
            }
            this.h = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        Drawable drawable = this.c;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int i) {
        return getInsetsForType.c(this.c, i);
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i) {
        return this.c.setLevel(i);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.c.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z) {
        getInsetsForType.d(this.c, z);
    }

    @Override // android.graphics.drawable.Drawable
    public void setChangingConfigurations(int i) {
        this.c.setChangingConfigurations(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.c.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z) {
        this.c.setDither(z);
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z) {
        this.c.setFilterBitmap(z);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setState(int[] iArr) {
        return b(iArr) || this.c.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.a.a = colorStateList;
        b(getState());
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        this.a.d = mode;
        b(getState());
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        return setVisible(z, z2) || this.c.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
