package o;
/* loaded from: classes-dex2jar.jar:o/setSnap.class */
public final class setSnap implements name {
    public final ImmutableList a;
    public final ImmutableList b;
    public final boolean c;
    public final String d;
    public final ImmutableList e;
    public final write h;

    /* loaded from: classes-dex2jar.jar:o/setSnap$write.class */
    public enum write {
        SIMULTANEOUSLY,
        INDIVIDUALLY;

        public static write a(int i) {
            if (i == 1) {
                return SIMULTANEOUSLY;
            }
            if (i == 2) {
                return INDIVIDUALLY;
            }
            StringBuilder sb = new StringBuilder("Unknown trim path type ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    public setSnap(String str, write write2, ImmutableList immutableList, ImmutableList immutableList2, ImmutableList immutableList3, boolean z) {
        this.d = str;
        this.h = write2;
        this.a = immutableList;
        this.b = immutableList2;
        this.e = immutableList3;
        this.c = z;
    }

    @Override // o.name
    public final style e(setText settext, setPageColor setpagecolor) {
        return new OnTouch(setpagecolor, this);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Trim Path: {start: ");
        sb.append(this.a);
        sb.append(", end: ");
        sb.append(this.b);
        sb.append(", offset: ");
        sb.append(this.e);
        sb.append("}");
        return sb.toString();
    }
}
