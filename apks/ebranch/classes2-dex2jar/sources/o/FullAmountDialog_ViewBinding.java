package o;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.core.view.WindowInsetsCompat;
import o.BaseDialogKotlin;
/* loaded from: classes2-dex2jar.jar:o/FullAmountDialog_ViewBinding.class */
public class FullAmountDialog_ViewBinding extends FrameLayout {
    Rect a;
    private boolean b;
    private Rect c;
    Drawable d;
    private boolean e;

    public FullAmountDialog_ViewBinding(Context context) {
        this(context, null);
    }

    public FullAmountDialog_ViewBinding(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FullAmountDialog_ViewBinding(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.c = new Rect();
        this.e = true;
        this.b = true;
        TypedArray c = GuestWarningWebViewDialog_ViewBinding.c(context, attributeSet, BaseDialogKotlin$MediaSessionCompat$Token.fo, i, BaseDialogKotlin.MediaDescriptionCompat.k, new int[0]);
        this.d = c.getDrawable(BaseDialogKotlin$MediaSessionCompat$Token.fq);
        c.recycle();
        setWillNotDraw(true);
        findFragmentByWho.d(this, new instantiate() { // from class: o.FullAmountDialog_ViewBinding.4
            public final WindowInsetsCompat d(View view, WindowInsetsCompat windowInsetsCompat) {
                if (FullAmountDialog_ViewBinding.this.a == null) {
                    FullAmountDialog_ViewBinding.this.a = new Rect();
                }
                FullAmountDialog_ViewBinding.this.a.set(windowInsetsCompat.i(), windowInsetsCompat.h(), windowInsetsCompat.f(), windowInsetsCompat.j());
                FullAmountDialog_ViewBinding.this.c(windowInsetsCompat);
                FullAmountDialog_ViewBinding.this.setWillNotDraw(!windowInsetsCompat.m() || FullAmountDialog_ViewBinding.this.d == null);
                findFragmentByWho.K(FullAmountDialog_ViewBinding.this);
                return windowInsetsCompat.d();
            }
        });
    }

    protected void c(WindowInsetsCompat windowInsetsCompat) {
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        draw(canvas);
        int width = getWidth();
        int height = getHeight();
        if (this.a != null && this.d != null) {
            int save = canvas.save();
            canvas.translate((float) getScrollX(), (float) getScrollY());
            if (this.e) {
                this.c.set(0, 0, width, this.a.top);
                this.d.setBounds(this.c);
                this.d.draw(canvas);
            }
            if (this.b) {
                this.c.set(0, height - this.a.bottom, width, height);
                this.d.setBounds(this.c);
                this.d.draw(canvas);
            }
            this.c.set(0, this.a.top, this.a.left, height - this.a.bottom);
            this.d.setBounds(this.c);
            this.d.draw(canvas);
            this.c.set(width - this.a.right, this.a.top, width, height - this.a.bottom);
            this.d.setBounds(this.c);
            this.d.draw(canvas);
            canvas.restoreToCount(save);
        }
    }

    @Override // android.view.View, android.view.ViewGroup
    public void onAttachedToWindow() {
        onAttachedToWindow();
        Drawable drawable = this.d;
        if (drawable != null) {
            drawable.setCallback(this);
        }
    }

    @Override // android.view.View, android.view.ViewGroup
    public void onDetachedFromWindow() {
        onDetachedFromWindow();
        Drawable drawable = this.d;
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    public void setDrawBottomInsetForeground(boolean z) {
        this.b = z;
    }

    public void setDrawTopInsetForeground(boolean z) {
        this.e = z;
    }

    public void setScrimInsetForeground(Drawable drawable) {
        this.d = drawable;
    }
}
