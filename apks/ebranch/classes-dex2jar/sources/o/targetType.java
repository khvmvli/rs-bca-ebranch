package o;

import android.graphics.PointF;
/* loaded from: classes-dex2jar.jar:o/targetType.class */
public final class targetType implements name {
    public final DebouncingOnClickListener$$ExternalSyntheticLambda0 a;
    public final boolean b;
    public final String c;
    public final boolean d;
    public final ListenerMethod<PointF, PointF> e;

    public targetType(String str, ListenerMethod<PointF, PointF> listenerMethod, DebouncingOnClickListener$$ExternalSyntheticLambda0 debouncingOnClickListener$$ExternalSyntheticLambda0, boolean z, boolean z2) {
        this.c = str;
        this.e = listenerMethod;
        this.a = debouncingOnClickListener$$ExternalSyntheticLambda0;
        this.b = z;
        this.d = z2;
    }

    @Override // o.name
    public final style e(setText settext, setPageColor setpagecolor) {
        return new BindViews(settext, setpagecolor, this);
    }
}
