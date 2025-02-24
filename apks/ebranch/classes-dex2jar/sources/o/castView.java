package o;
/* loaded from: classes-dex2jar.jar:o/castView.class */
public final class castView implements name {
    public final boolean a;
    public final ImmutableList b;
    public final ImmutableList c;
    public final String d;
    public final type e;

    public castView(String str, ImmutableList immutableList, ImmutableList immutableList2, type type, boolean z) {
        this.d = str;
        this.c = immutableList;
        this.b = immutableList2;
        this.e = type;
        this.a = z;
    }

    @Override // o.name
    public final style e(setText settext, setPageColor setpagecolor) {
        return new callback(settext, setpagecolor, this);
    }
}
