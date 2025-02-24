package o;

import android.graphics.PointF;
/* loaded from: classes-dex2jar.jar:o/type.class */
public final class type implements name {
    public final ListenerMethod<PointF, PointF> a;
    public final size b;
    public final ImmutableList c;
    public final ImmutableList d;
    public final contains e;
    public final ImmutableList f;
    public final ImmutableList g;
    public final ListenerClass h;
    public final ImmutableList j;

    public type() {
        this(null, null, null, null, null, null, null, null, null);
    }

    public type(contains contains, ListenerMethod<PointF, PointF> listenerMethod, ListenerClass listenerClass, ImmutableList immutableList, size size, ImmutableList immutableList2, ImmutableList immutableList3, ImmutableList immutableList4, ImmutableList immutableList5) {
        this.e = contains;
        this.a = listenerMethod;
        this.h = listenerClass;
        this.c = immutableList;
        this.b = size;
        this.f = immutableList2;
        this.d = immutableList3;
        this.g = immutableList4;
        this.j = immutableList5;
    }

    @Override // o.name
    public final style e(setText settext, setPageColor setpagecolor) {
        return null;
    }
}
