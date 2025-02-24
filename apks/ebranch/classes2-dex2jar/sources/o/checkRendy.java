package o;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
/* loaded from: classes2-dex2jar.jar:o/checkRendy.class */
public final class checkRendy extends View {
    boolean a;
    float b;
    float c;
    int d;
    int e;
    private int g;
    private boolean i;
    private int j;
    private int l;
    final Paint h = new Paint();
    boolean f = false;

    public checkRendy(Context context) {
        super(context);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (getWidth() != 0 && this.f) {
            if (!this.i) {
                this.g = getWidth() / 2;
                int height = getHeight() / 2;
                this.l = height;
                int min = (int) (((float) Math.min(this.g, height)) * this.b);
                this.j = min;
                if (!this.a) {
                    this.l = (int) (((double) this.l) - (((double) ((int) (((float) min) * this.c))) * 0.75d));
                }
                this.i = true;
            }
            this.h.setColor(this.d);
            canvas.drawCircle((float) this.g, (float) this.l, (float) this.j, this.h);
            this.h.setColor(this.e);
            canvas.drawCircle((float) this.g, (float) this.l, 8.0f, this.h);
        }
    }
}
