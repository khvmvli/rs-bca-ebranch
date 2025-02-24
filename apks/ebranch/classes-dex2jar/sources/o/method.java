package o;

import android.graphics.PointF;
import java.util.List;
import o.OnPageChange;
import o.R;
/* loaded from: classes-dex2jar.jar:o/method.class */
public final class method implements ListenerMethod<PointF, PointF> {
    private final ImmutableList a;
    private final ImmutableList b;

    public method(ImmutableList immutableList, ImmutableList immutableList2) {
        this.a = immutableList;
        this.b = immutableList2;
    }

    @Override // o.ListenerMethod
    public final OnPageChange.Callback<PointF, PointF> a() {
        return new R.layout(new OnPageChange(this.a.c), new OnPageChange(this.b.c));
    }

    @Override // o.ListenerMethod
    public final List<onClickBcaKlikpay<PointF>> d() {
        throw new UnsupportedOperationException("Cannot call getKeyframes on AnimatableSplitDimensionPathValue.");
    }

    @Override // o.ListenerMethod
    public final boolean e() {
        return this.a.e() && this.b.e();
    }
}
