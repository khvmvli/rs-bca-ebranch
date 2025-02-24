package o;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import o.OnPageChange;
/* loaded from: classes-dex2jar.jar:o/setAnimationFromUrl.class */
public final class setAnimationFromUrl extends setPageColor {
    private OnPageChange.Callback<ColorFilter, ColorFilter> j;
    private final setCentered k;

    /* renamed from: o  reason: collision with root package name */
    private final Paint f196o;
    private final RectF n = new RectF();
    private final float[] m = new float[8];
    private final Path l = new Path();

    /* JADX INFO: Access modifiers changed from: package-private */
    public setAnimationFromUrl(setText settext, setCentered setcentered) {
        super(settext, setcentered);
        BindInt bindInt = new BindInt();
        this.f196o = bindInt;
        this.k = setcentered;
        bindInt.setAlpha(0);
        bindInt.setStyle(Paint.Style.FILL);
        bindInt.setColor(setcentered.r);
    }

    @Override // o.setPageColor, o.doClick
    public final <T> void a(T t, onClickBcaMobile<T> onclickbcamobile) {
        a(t, onclickbcamobile);
        if (t != value.b) {
            return;
        }
        if (onclickbcamobile == null) {
            this.j = null;
        } else {
            this.j = new Unbinder(onclickbcamobile);
        }
    }

    @Override // o.setPageColor
    public final void b(Canvas canvas, Matrix matrix, int i) {
        int alpha = Color.alpha(this.k.r);
        if (alpha != 0) {
            int intValue = (int) ((((float) i) / 255.0f) * (((((float) alpha) / 255.0f) * ((float) (this.g.b == null ? 100 : this.g.b.h().intValue()))) / 100.0f) * 255.0f);
            this.f196o.setAlpha(intValue);
            OnPageChange.Callback<ColorFilter, ColorFilter> callback = this.j;
            if (callback != null) {
                this.f196o.setColorFilter(callback.h());
            }
            if (intValue > 0) {
                float[] fArr = this.m;
                fArr[0] = 0.0f;
                fArr[1] = 0.0f;
                fArr[2] = (float) this.k.p;
                float[] fArr2 = this.m;
                fArr2[3] = 0.0f;
                fArr2[4] = (float) this.k.p;
                this.m[5] = (float) this.k.t;
                float[] fArr3 = this.m;
                fArr3[6] = 0.0f;
                fArr3[7] = (float) this.k.t;
                matrix.mapPoints(this.m);
                this.l.reset();
                Path path = this.l;
                float[] fArr4 = this.m;
                path.moveTo(fArr4[0], fArr4[1]);
                Path path2 = this.l;
                float[] fArr5 = this.m;
                path2.lineTo(fArr5[2], fArr5[3]);
                Path path3 = this.l;
                float[] fArr6 = this.m;
                path3.lineTo(fArr6[4], fArr6[5]);
                Path path4 = this.l;
                float[] fArr7 = this.m;
                path4.lineTo(fArr7[6], fArr7[7]);
                Path path5 = this.l;
                float[] fArr8 = this.m;
                path5.lineTo(fArr8[0], fArr8[1]);
                this.l.close();
                canvas.drawPath(this.l, this.f196o);
            }
        }
    }

    @Override // o.setPageColor, o.ButterKnife
    public final void d(RectF rectF, Matrix matrix, boolean z) {
        d(rectF, matrix, z);
        this.n.set(0.0f, 0.0f, (float) this.k.p, (float) this.k.t);
        this.b.mapRect(this.n);
        rectF.set(this.n);
    }
}
