package o;

import android.graphics.PointF;
/* loaded from: classes-dex2jar.jar:o/findOptionalViewAsType.class */
public final class findOptionalViewAsType implements name {
    public final ListenerMethod<PointF, PointF> a;
    public final ListenerMethod<PointF, PointF> b;
    public final String c;
    public final ImmutableList d;
    public final boolean e;

    public findOptionalViewAsType(String str, ListenerMethod<PointF, PointF> listenerMethod, ListenerMethod<PointF, PointF> listenerMethod2, ImmutableList immutableList, boolean z) {
        this.c = str;
        this.a = listenerMethod;
        this.b = listenerMethod2;
        this.d = immutableList;
        this.e = z;
    }

    @Override // o.name
    public final style e(setText settext, setPageColor setpagecolor) {
        return new OnItemSelected(settext, setpagecolor, this);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RectangleShape{position=");
        sb.append(this.a);
        sb.append(", size=");
        sb.append(this.b);
        sb.append('}');
        return sb.toString();
    }
}
