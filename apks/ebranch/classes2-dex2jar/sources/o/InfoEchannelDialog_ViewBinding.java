package o;

import android.graphics.Paint;
import android.graphics.Path;
/* loaded from: classes2-dex2jar.jar:o/InfoEchannelDialog_ViewBinding.class */
public final class InfoEchannelDialog_ViewBinding {
    public final Paint b;
    public int f;
    public final Paint g;
    public int h;
    public final Path i;
    public final Paint j;
    public int l;

    /* renamed from: o  reason: collision with root package name */
    public Paint f34o;
    public static final int[] d = new int[3];
    public static final float[] e = {0.0f, 0.5f, 1.0f};
    public static final int[] a = new int[4];
    public static final float[] c = {0.0f, 0.0f, 0.5f, 1.0f};

    public InfoEchannelDialog_ViewBinding() {
        this(-16777216);
    }

    private InfoEchannelDialog_ViewBinding(int i) {
        this.i = new Path();
        this.f34o = new Paint();
        this.j = new Paint();
        a(-16777216);
        this.f34o.setColor(0);
        Paint paint = new Paint(4);
        this.b = paint;
        paint.setStyle(Paint.Style.FILL);
        this.g = new Paint(paint);
    }

    public final void a(int i) {
        this.l = isRound.b(i, 68);
        this.h = isRound.b(i, 20);
        this.f = isRound.b(i, 0);
        this.j.setColor(this.l);
    }
}
