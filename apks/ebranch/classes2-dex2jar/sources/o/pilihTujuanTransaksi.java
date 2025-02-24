package o;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
/* loaded from: classes2-dex2jar.jar:o/pilihTujuanTransaksi.class */
public final class pilihTujuanTransaksi extends View {
    int a;
    int b;
    int c;
    float d;
    boolean e;
    String f;
    final Paint g = new Paint();
    boolean h = false;
    float i;
    int j;
    boolean k;
    int l;
    int m;
    int n;

    /* renamed from: o  reason: collision with root package name */
    String f86o;
    private int p;
    private int q;
    private int r;
    int s;
    private int t;
    private int w;
    private boolean x;

    public pilihTujuanTransaksi(Context context) {
        super(context);
    }

    public final int e(float f, float f2) {
        if (!this.x) {
            return -1;
        }
        float f3 = f2 - ((float) this.p);
        float f4 = (float) ((int) (f3 * f3));
        float f5 = f - ((float) this.t);
        if (((int) Math.sqrt((double) ((f5 * f5) + f4))) <= this.q && !this.e) {
            return 0;
        }
        float f6 = f - ((float) this.w);
        return (((int) Math.sqrt((double) ((f6 * f6) + f4))) > this.q || this.k) ? -1 : 1;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        if (getWidth() != 0 && this.h) {
            if (!this.x) {
                int width = getWidth() / 2;
                int height = getHeight() / 2;
                int min = (int) (((float) Math.min(width, height)) * this.i);
                int i7 = (int) (((float) min) * this.d);
                this.q = i7;
                int i8 = (int) (((double) height) + (((double) i7) * 0.75d));
                this.g.setTextSize((float) ((i7 * 3) / 4));
                int i9 = this.q;
                this.p = (i8 - (i9 / 2)) + min;
                this.t = (width - min) + i9;
                this.w = (width + min) - i9;
                this.x = true;
            }
            int i10 = this.s;
            int i11 = this.j;
            int i12 = this.r;
            if (i12 == 0) {
                i3 = this.n;
                i2 = this.l;
                i11 = this.b;
                i10 = i10;
                i = 255;
                i4 = i11;
            } else if (i12 == 1) {
                i10 = this.n;
                i = this.l;
                i4 = this.b;
                i2 = 255;
                i3 = i10;
            } else {
                i3 = i10;
                i10 = i3;
                i4 = i11;
                i2 = 255;
                i = 255;
            }
            int i13 = this.a;
            if (i13 == 0) {
                i6 = this.m;
                i5 = this.l;
            } else {
                i6 = i3;
                i5 = i2;
                if (i13 == 1) {
                    i10 = this.m;
                    i = this.l;
                    i5 = i2;
                    i6 = i3;
                }
            }
            if (this.e) {
                i11 = this.c;
                i6 = i10;
            }
            if (this.k) {
                i4 = this.c;
            }
            this.g.setColor(i6);
            this.g.setAlpha(i5);
            canvas.drawCircle((float) this.t, (float) this.p, (float) this.q, this.g);
            this.g.setColor(i10);
            this.g.setAlpha(i);
            canvas.drawCircle((float) this.w, (float) this.p, (float) this.q, this.g);
            this.g.setColor(i11);
            int i14 = this.p;
            int descent = ((int) (this.g.descent() + this.g.ascent())) / 2;
            float f = (float) (i14 - descent);
            canvas.drawText(this.f, (float) this.t, f, this.g);
            this.g.setColor(i4);
            canvas.drawText(this.f86o, (float) this.w, f, this.g);
        }
    }

    public final void setAmOrPm(int i) {
        this.r = i;
    }

    public final void setAmOrPmPressed(int i) {
        this.a = i;
    }
}
