package o;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.Log;
import java.lang.reflect.Method;
/* loaded from: classes-dex2jar.jar:o/WindowInsetsCompat$Impl28.class */
public class WindowInsetsCompat$Impl28 extends setFillViewport {
    private static Method d;

    public WindowInsetsCompat$Impl28(Drawable drawable) {
        super(drawable);
        a();
    }

    public WindowInsetsCompat$Impl28(WindowInsetsCompat$Impl21 windowInsetsCompat$Impl21, Resources resources) {
        super(windowInsetsCompat$Impl21, resources);
        a();
    }

    private void a() {
        if (d == null) {
            try {
                d = Drawable.class.getDeclaredMethod("isProjected", new Class[0]);
            } catch (Exception e) {
                Log.w("WrappedDrawableApi21", "Failed to retrieve Drawable#isProjected() method", e);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0033, code lost:
        if ((r0 instanceof android.graphics.drawable.RippleDrawable) != false) goto L_0x0036;
     */
    @Override // o.setFillViewport
    /* Code decompiled incorrectly, please refer to instructions dump */
    protected boolean d() {
        /*
            r3 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r4 = r0
            r0 = 0
            r5 = r0
            r0 = r5
            r6 = r0
            r0 = r4
            r1 = 21
            if (r0 != r1) goto L_0x0038
            r0 = r3
            android.graphics.drawable.Drawable r0 = r0.c
            r7 = r0
            r0 = r7
            boolean r0 = r0 instanceof android.graphics.drawable.GradientDrawable
            if (r0 != 0) goto L_0x0036
            r0 = r7
            boolean r0 = r0 instanceof android.graphics.drawable.DrawableContainer
            if (r0 != 0) goto L_0x0036
            r0 = r7
            boolean r0 = r0 instanceof android.graphics.drawable.InsetDrawable
            if (r0 != 0) goto L_0x0036
            r0 = r5
            r6 = r0
            r0 = r7
            boolean r0 = r0 instanceof android.graphics.drawable.RippleDrawable
            if (r0 == 0) goto L_0x0038
        L_0x0036:
            r0 = 1
            r6 = r0
        L_0x0038:
            r0 = r6
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.WindowInsetsCompat$Impl28.d():boolean");
    }

    @Override // android.graphics.drawable.Drawable
    public Rect getDirtyBounds() {
        return this.c.getDirtyBounds();
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        this.c.getOutline(outline);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isProjected() {
        Method method;
        if (this.c == null || (method = d) == null) {
            return false;
        }
        try {
            return ((Boolean) method.invoke(this.c, new Object[0])).booleanValue();
        } catch (Exception e) {
            Log.w("WrappedDrawableApi21", "Error calling Drawable#isProjected() method", e);
            return false;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspot(float f, float f2) {
        this.c.setHotspot(f, f2);
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        this.c.setHotspotBounds(i, i2, i3, i4);
    }

    @Override // o.setFillViewport, android.graphics.drawable.Drawable
    public boolean setState(int[] iArr) {
        if (!setState(iArr)) {
            return false;
        }
        invalidateSelf();
        return true;
    }

    @Override // o.setFillViewport, android.graphics.drawable.Drawable
    public void setTint(int i) {
        if (d()) {
            setTint(i);
        } else {
            this.c.setTint(i);
        }
    }

    @Override // o.setFillViewport, android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        if (d()) {
            setTintList(colorStateList);
        } else {
            this.c.setTintList(colorStateList);
        }
    }

    @Override // o.setFillViewport, android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        if (d()) {
            setTintMode(mode);
        } else {
            this.c.setTintMode(mode);
        }
    }
}
