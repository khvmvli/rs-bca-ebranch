package o;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import o.OnPageChange;
/* loaded from: classes-dex2jar.jar:o/setRealViewCount.class */
public final class setRealViewCount extends setPageColor {
    private OnPageChange.Callback<ColorFilter, ColorFilter> j;
    private OnPageChange.Callback<Bitmap, Bitmap> m;
    private final Paint n = new BindInt(3);
    private final Rect k = new Rect();
    private final Rect l = new Rect();

    /* JADX INFO: Access modifiers changed from: package-private */
    public setRealViewCount(setText settext, setCentered setcentered) {
        super(settext, setcentered);
    }

    private Bitmap c() {
        Setter setter;
        Bitmap h;
        OnPageChange.Callback<Bitmap, Bitmap> callback = this.m;
        if (callback != null && (h = callback.h()) != null) {
            return h;
        }
        String str = this.h.f204o;
        setText settext = this.f;
        if (settext.getCallback() == null) {
            setter = null;
        } else {
            Setter setter2 = settext.f;
            if (setter2 != null) {
                Drawable.Callback callback2 = settext.getCallback();
                Context context = (callback2 == null || !(callback2 instanceof View)) ? null : ((View) callback2).getContext();
                if (!((context == null && setter2.d == null) || setter2.d.equals(context))) {
                    settext.f = null;
                }
            }
            if (settext.f == null) {
                settext.f = new Setter(settext.getCallback(), settext.i, settext.j, settext.d.i);
            }
            setter = settext.f;
        }
        if (setter != null) {
            return setter.e(str);
        }
        BindAnim bindAnim = settext.d;
        BindColor bindColor = bindAnim == null ? null : bindAnim.i.get(str);
        if (bindColor != null) {
            return bindColor.d;
        }
        return null;
    }

    @Override // o.setPageColor, o.doClick
    public final <T> void a(T t, onClickBcaMobile<T> onclickbcamobile) {
        a(t, onclickbcamobile);
        if (t == value.b) {
            if (onclickbcamobile == null) {
                this.j = null;
            } else {
                this.j = new Unbinder(onclickbcamobile);
            }
        } else if (t != value.m) {
        } else {
            if (onclickbcamobile == null) {
                this.m = null;
            } else {
                this.m = new Unbinder(onclickbcamobile);
            }
        }
    }

    @Override // o.setPageColor
    public final void b(Canvas canvas, Matrix matrix, int i) {
        Bitmap c = c();
        if (c != null && !c.isRecycled()) {
            float d = copyNoRef.d();
            this.n.setAlpha(i);
            OnPageChange.Callback<ColorFilter, ColorFilter> callback = this.j;
            if (callback != null) {
                this.n.setColorFilter(callback.h());
            }
            canvas.save();
            canvas.concat(matrix);
            this.k.set(0, 0, c.getWidth(), c.getHeight());
            this.l.set(0, 0, (int) (((float) c.getWidth()) * d), (int) (((float) c.getHeight()) * d));
            canvas.drawBitmap(c, this.k, this.l, this.n);
            canvas.restore();
        }
    }

    @Override // o.setPageColor, o.ButterKnife
    public final void d(RectF rectF, Matrix matrix, boolean z) {
        d(rectF, matrix, z);
        Bitmap c = c();
        if (c != null) {
            rectF.set(0.0f, 0.0f, ((float) c.getWidth()) * copyNoRef.d(), ((float) c.getHeight()) * copyNoRef.d());
            this.b.mapRect(rectF);
        }
    }
}
