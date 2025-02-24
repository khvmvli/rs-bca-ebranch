package o;

import java.util.Arrays;
import java.util.List;
/* loaded from: classes-dex2jar.jar:o/setViewPager.class */
public final class setViewPager implements name {
    public final boolean a;
    public final String d;
    public final List<name> e;

    public setViewPager(String str, List<name> list, boolean z) {
        this.d = str;
        this.e = list;
        this.a = z;
    }

    @Override // o.name
    public final style e(setText settext, setPageColor setpagecolor) {
        return new setDebug(settext, setpagecolor, this);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShapeGroup{name='");
        sb.append(this.d);
        sb.append("' Shapes: ");
        sb.append(Arrays.toString(this.e.toArray()));
        sb.append('}');
        return sb.toString();
    }
}
