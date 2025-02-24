package o;

import android.content.Context;
import android.view.animation.Interpolator;
import android.widget.Scroller;
/* loaded from: classes-dex2jar.jar:o/TransaksiTunda.class */
public final class TransaksiTunda extends Scroller {
    int a;

    public TransaksiTunda(Context context, Interpolator interpolator) {
        super(context, interpolator);
    }

    @Override // android.widget.Scroller
    public final void startScroll(int i, int i2, int i3, int i4) {
        startScroll(i, i2, i3, i4, this.a);
    }

    @Override // android.widget.Scroller
    public final void startScroll(int i, int i2, int i3, int i4, int i5) {
        startScroll(i, i2, i3, i4, this.a);
    }
}
