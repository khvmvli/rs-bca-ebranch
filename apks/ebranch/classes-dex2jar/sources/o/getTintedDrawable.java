package o;
/* loaded from: classes-dex2jar.jar:o/getTintedDrawable.class */
public final class getTintedDrawable implements name {
    public final boolean a;
    public final String b;
    private final int d;
    public final callbacks e;

    public getTintedDrawable(String str, int i, callbacks callbacks, boolean z) {
        this.b = str;
        this.d = i;
        this.e = callbacks;
        this.a = z;
    }

    @Override // o.name
    public final style e(setText settext, setPageColor setpagecolor) {
        return new OnItemLongClick(settext, setpagecolor, this);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShapePath{name=");
        sb.append(this.b);
        sb.append(", index=");
        sb.append(this.d);
        sb.append('}');
        return sb.toString();
    }
}
