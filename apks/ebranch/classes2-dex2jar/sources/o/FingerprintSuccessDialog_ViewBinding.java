package o;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
/* loaded from: classes2-dex2jar.jar:o/FingerprintSuccessDialog_ViewBinding.class */
public class FingerprintSuccessDialog_ViewBinding extends setWeightSum {
    protected boolean a;
    boolean b;
    private Drawable c;
    private final Rect d;
    private int e;
    private final Rect h;

    public FingerprintSuccessDialog_ViewBinding(Context context) {
        this(context, null);
    }

    public FingerprintSuccessDialog_ViewBinding(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FingerprintSuccessDialog_ViewBinding(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.h = new Rect();
        this.d = new Rect();
        this.e = 119;
        this.a = true;
        this.b = false;
        TypedArray c = GuestWarningWebViewDialog_ViewBinding.c(context, attributeSet, BaseDialogKotlin$MediaSessionCompat$Token.cx, i, 0, new int[0]);
        this.e = c.getInt(BaseDialogKotlin$MediaSessionCompat$Token.cv, this.e);
        Drawable drawable = c.getDrawable(BaseDialogKotlin$MediaSessionCompat$Token.cu);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.a = c.getBoolean(BaseDialogKotlin$MediaSessionCompat$Token.cy, true);
        c.recycle();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void draw(Canvas canvas) {
        draw(canvas);
        Drawable drawable = this.c;
        if (drawable != null) {
            if (this.b) {
                this.b = false;
                Rect rect = this.h;
                Rect rect2 = this.d;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                if (this.a) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                Gravity.apply(this.e, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    public void drawableHotspotChanged(float f, float f2) {
        drawableHotspotChanged(f, f2);
        Drawable drawable = this.c;
        if (drawable != null) {
            drawable.setHotspot(f, f2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected void drawableStateChanged() {
        drawableStateChanged();
        Drawable drawable = this.c;
        if (drawable != null && drawable.isStateful()) {
            this.c.setState(getDrawableState());
        }
    }

    public Drawable getForeground() {
        return this.c;
    }

    public int getForegroundGravity() {
        return this.e;
    }

    public void jumpDrawablesToCurrentState() {
        jumpDrawablesToCurrentState();
        Drawable drawable = this.c;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        onLayout(z, i, i2, i3, i4);
        this.b = z | this.b;
    }

    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        onSizeChanged(i, i2, i3, i4);
        this.b = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setForeground(Drawable drawable) {
        Drawable drawable2 = this.c;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
                unscheduleDrawable(this.c);
            }
            this.c = drawable;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.e == 119) {
                    drawable.getPadding(new Rect());
                }
            } else {
                setWillNotDraw(true);
            }
            requestLayout();
            invalidate();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setForegroundGravity(int i) {
        if (this.e != i) {
            int i2 = i;
            if ((8388615 & i) == 0) {
                i2 = i | 8388611;
            }
            int i3 = i2;
            if ((i2 & 112) == 0) {
                i3 = i2 | 48;
            }
            this.e = i3;
            if (i3 == 119 && this.c != null) {
                this.c.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    protected boolean verifyDrawable(Drawable drawable) {
        return verifyDrawable(drawable) || drawable == this.c;
    }
}
