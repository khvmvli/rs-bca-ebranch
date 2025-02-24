package o;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
/* loaded from: classes2-dex2jar.jar:o/LimitPengaturanPINDialog.class */
final class LimitPengaturanPINDialog extends JenisKodeBankDialog {
    private final Paint c;
    final RectF d;
    private int e;

    LimitPengaturanPINDialog() {
        this(null);
    }

    LimitPengaturanPINDialog(JenisPekerjaanDialog jenisPekerjaanDialog) {
        super(jenisPekerjaanDialog == null ? new JenisPekerjaanDialog() : jenisPekerjaanDialog);
        Paint paint = new Paint(1);
        this.c = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        this.c.setColor(-1);
        this.c.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        this.d = new RectF();
    }

    final void a(float f, float f2, float f3, float f4) {
        if (f != this.d.left || f2 != this.d.top || f3 != this.d.right || f4 != this.d.bottom) {
            this.d.set(f, f2, f3, f4);
            invalidateSelf();
        }
    }

    @Override // o.JenisKodeBankDialog, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable.Callback callback = getCallback();
        if (callback instanceof View) {
            View view = (View) callback;
            if (view.getLayerType() != 2) {
                view.setLayerType(2, null);
            }
        } else {
            this.e = canvas.saveLayer(0.0f, 0.0f, (float) canvas.getWidth(), (float) canvas.getHeight(), null);
        }
        draw(canvas);
        canvas.drawRect(this.d, this.c);
        if (!(getCallback() instanceof View)) {
            canvas.restoreToCount(this.e);
        }
    }
}
