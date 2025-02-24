package o;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
/* loaded from: classes2-dex2jar.jar:o/HariDialog.class */
final class HariDialog extends HariDialog_ViewBinding<HapusWarkatBerhasilDialog_ViewBinding> {
    private float a;
    private int c = 1;
    private float d;
    private float h;

    public HariDialog(HapusWarkatBerhasilDialog_ViewBinding hapusWarkatBerhasilDialog_ViewBinding) {
        super(hapusWarkatBerhasilDialog_ViewBinding);
    }

    private void e(Canvas canvas, Paint paint, float f, float f2, float f3, boolean z, RectF rectF) {
        float f4 = z ? -1.0f : 1.0f;
        canvas.save();
        canvas.rotate(f3);
        float f5 = f / 2.0f;
        float f6 = f4 * f2;
        canvas.drawRect((this.d - f5) + f2, Math.min(0.0f, ((float) this.c) * f6), (this.d + f5) - f2, Math.max(0.0f, f6 * ((float) this.c)), paint);
        canvas.translate((this.d - f5) + f2, 0.0f);
        canvas.drawArc(rectF, 180.0f, (-f4) * 90.0f * ((float) this.c), true, paint);
        canvas.translate(f - (f2 * 2.0f), 0.0f);
        canvas.drawArc(rectF, 0.0f, f4 * 90.0f * ((float) this.c), true, paint);
        canvas.restore();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.HariDialog_ViewBinding
    public final void a(Canvas canvas, Paint paint) {
        int i = ((HapusWarkatBerhasilDialog_ViewBinding) this.e).c;
        int b = isRound.b(i, (Color.alpha(i) * this.b.getAlpha()) / 255);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.BUTT);
        paint.setAntiAlias(true);
        paint.setColor(b);
        paint.setStrokeWidth(this.h);
        float f = this.d;
        float f2 = -f;
        canvas.drawArc(new RectF(f2, f2, f, f), 0.0f, 360.0f, false, paint);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.HariDialog_ViewBinding
    public final void a(Canvas canvas, Paint paint, float f, float f2, int i) {
        if (f != f2) {
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeCap(Paint.Cap.BUTT);
            paint.setAntiAlias(true);
            paint.setColor(i);
            paint.setStrokeWidth(this.h);
            float f3 = (float) this.c;
            float f4 = f * 360.0f * f3;
            if (f2 < f) {
                f2 += 1.0f;
            }
            float f5 = (f2 - f) * 360.0f * f3;
            float f6 = this.d;
            float f7 = -f6;
            canvas.drawArc(new RectF(f7, f7, f6, f6), f4, f5, false, paint);
            if (this.a > 0.0f && Math.abs(f5) < 360.0f) {
                paint.setStyle(Paint.Style.FILL);
                float f8 = this.a;
                float f9 = -f8;
                RectF rectF = new RectF(f9, f9, f8, f8);
                e(canvas, paint, this.h, this.a, f4, true, rectF);
                e(canvas, paint, this.h, this.a, f4 + f5, false, rectF);
            }
        }
    }

    @Override // o.HariDialog_ViewBinding
    public final int b() {
        return ((HapusWarkatBerhasilDialog_ViewBinding) this.e).f + (((HapusWarkatBerhasilDialog_ViewBinding) this.e).j << 1);
    }

    @Override // o.HariDialog_ViewBinding
    public final int c() {
        return ((HapusWarkatBerhasilDialog_ViewBinding) this.e).f + (((HapusWarkatBerhasilDialog_ViewBinding) this.e).j << 1);
    }

    @Override // o.HariDialog_ViewBinding
    public final void c(Canvas canvas, float f) {
        float f2 = (((float) ((HapusWarkatBerhasilDialog_ViewBinding) this.e).f) / 2.0f) + ((float) ((HapusWarkatBerhasilDialog_ViewBinding) this.e).j);
        canvas.translate(f2, f2);
        canvas.rotate(-90.0f);
        float f3 = -f2;
        canvas.clipRect(f3, f3, f2, f2);
        this.c = ((HapusWarkatBerhasilDialog_ViewBinding) this.e).h == 0 ? 1 : -1;
        this.h = ((float) ((HapusWarkatBerhasilDialog_ViewBinding) this.e).i) * f;
        this.a = ((float) ((HapusWarkatBerhasilDialog_ViewBinding) this.e).b) * f;
        this.d = ((float) (((HapusWarkatBerhasilDialog_ViewBinding) this.e).f - ((HapusWarkatBerhasilDialog_ViewBinding) this.e).i)) / 2.0f;
        if ((this.b.b() && ((HapusWarkatBerhasilDialog_ViewBinding) this.e).e == 2) || (this.b.c() && ((HapusWarkatBerhasilDialog_ViewBinding) this.e).a == 1)) {
            this.d += ((1.0f - f) * ((float) ((HapusWarkatBerhasilDialog_ViewBinding) this.e).i)) / 2.0f;
        } else if ((this.b.b() && ((HapusWarkatBerhasilDialog_ViewBinding) this.e).e == 1) || (this.b.c() && ((HapusWarkatBerhasilDialog_ViewBinding) this.e).a == 2)) {
            this.d -= ((1.0f - f) * ((float) ((HapusWarkatBerhasilDialog_ViewBinding) this.e).i)) / 2.0f;
        }
    }
}
