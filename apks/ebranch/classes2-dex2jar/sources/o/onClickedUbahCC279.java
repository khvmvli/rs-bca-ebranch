package o;

import android.content.Context;
import android.widget.OverScroller;
/* loaded from: classes2-dex2jar.jar:o/onClickedUbahCC279.class */
public class onClickedUbahCC279 extends onFocuscc275 {
    protected final OverScroller a;
    private boolean b = false;

    public onClickedUbahCC279(Context context) {
        this.a = new OverScroller(context);
    }

    @Override // o.onFocuscc275
    public final int a() {
        return this.a.getCurrX();
    }

    @Override // o.onFocuscc275
    public final void a(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
        this.a.fling(i, i2, i3, i4, 0, i6, 0, i8, 0, 0);
    }

    @Override // o.onFocuscc275
    public final int b() {
        return this.a.getCurrY();
    }

    @Override // o.onFocuscc275
    public final void c(boolean z) {
        this.a.forceFinished(true);
    }

    @Override // o.onFocuscc275
    public final boolean c() {
        return this.a.isFinished();
    }

    @Override // o.onFocuscc275
    public boolean e() {
        if (this.b) {
            this.a.computeScrollOffset();
            this.b = false;
        }
        return this.a.computeScrollOffset();
    }
}
