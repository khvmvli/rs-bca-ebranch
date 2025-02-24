package o;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Typeface;
import android.util.AttributeSet;
/* loaded from: classes2-dex2jar.jar:o/pilihSumberDanaOR.class */
public final class pilihSumberDanaOR extends onChooseProductOR {
    public pilihSumberDanaOR(Context context, AttributeSet attributeSet, OR2PilihProductFragment oR2PilihProductFragment) {
        super(context, attributeSet, oR2PilihProductFragment);
    }

    @Override // o.onChooseProductOR
    public final void b(Canvas canvas, int i, int i2, int i3, int i4, int i5) {
        if (this.B == i3) {
            canvas.drawCircle((float) i4, (float) (i5 - (j / 3)), (float) d, this.z);
        }
        if (!a(i, i2, i3) || this.B == i3) {
            this.x.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
        } else {
            canvas.drawCircle((float) i4, (float) ((j + i5) - e), (float) a, this.z);
            this.x.setTypeface(Typeface.create(Typeface.DEFAULT, 1));
        }
        if (this.m.b(i, i2, i3)) {
            this.x.setColor(this.l);
        } else if (this.B == i3) {
            this.x.setTypeface(Typeface.create(Typeface.DEFAULT, 1));
            this.x.setColor(this.I);
        } else if (!this.t || this.E != i3) {
            this.x.setColor(a(i, i2, i3) ? this.r : this.k);
        } else {
            this.x.setColor(this.G);
        }
        canvas.drawText(String.format(this.m.d(), "%d", Integer.valueOf(i3)), (float) i4, (float) i5, this.x);
    }
}
