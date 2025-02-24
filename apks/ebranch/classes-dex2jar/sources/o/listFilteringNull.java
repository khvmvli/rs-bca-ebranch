package o;

import android.graphics.Path;
/* loaded from: classes-dex2jar.jar:o/listFilteringNull.class */
public final class listFilteringNull implements name {
    public final boolean a;
    public final size b;
    public final run c;
    public final Path.FillType d;
    public final String e;
    private final boolean g;

    public listFilteringNull(String str, boolean z, Path.FillType fillType, run run, size size, boolean z2) {
        this.e = str;
        this.g = z;
        this.d = fillType;
        this.c = run;
        this.b = size;
        this.a = z2;
    }

    @Override // o.name
    public final style e(setText settext, setPageColor setpagecolor) {
        return new bind(settext, setpagecolor, this);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShapeFill{color=, fillEnabled=");
        sb.append(this.g);
        sb.append('}');
        return sb.toString();
    }
}
