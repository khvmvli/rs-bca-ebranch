package o;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.LeadingMarginSpan;
/* loaded from: classes-dex2jar.jar:o/getCardDescription.class */
public final class getCardDescription implements LeadingMarginSpan {
    private int a;
    private Path b = null;
    private int d = 20;
    private int c = 7;

    public getCardDescription(int i, int i2, int i3) {
        this.a = i2;
    }

    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, boolean z, Layout layout) {
        if (((Spanned) charSequence).getSpanStart(this) == i6) {
            Paint.Style style = paint.getStyle();
            int color = paint.getColor();
            paint.setColor(this.a);
            paint.setStyle(Paint.Style.FILL);
            float lineBaseline = layout != null ? ((float) layout.getLineBaseline(layout.getLineForOffset(i6))) - (((float) this.c) * 2.0f) : ((float) (i3 + i5)) / 2.0f;
            float f = ((float) i) + ((float) (i2 * this.c));
            if (canvas.isHardwareAccelerated()) {
                if (this.b == null) {
                    Path path = new Path();
                    this.b = path;
                    path.addCircle(0.0f, 0.0f, (float) this.c, Path.Direction.CW);
                }
                canvas.save();
                canvas.translate(f, lineBaseline);
                canvas.drawPath(this.b, paint);
                canvas.restore();
            } else {
                canvas.drawCircle(f, lineBaseline, (float) this.c, paint);
            }
            paint.setColor(color);
            paint.setStyle(style);
        }
    }

    @Override // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean z) {
        return (this.c << 1) + this.d;
    }
}
