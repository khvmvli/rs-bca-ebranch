package o;
/* loaded from: classes-dex2jar.jar:o/castParam.class */
public final class castParam implements name {
    public final boolean a;
    public final IconCompatParcelizer c;
    public final String d;

    /* loaded from: classes-dex2jar.jar:o/castParam$IconCompatParcelizer.class */
    public enum IconCompatParcelizer {
        MERGE,
        ADD,
        SUBTRACT,
        INTERSECT,
        EXCLUDE_INTERSECTIONS;

        public static IconCompatParcelizer b(int i2) {
            return i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? i2 != 5 ? MERGE : EXCLUDE_INTERSECTIONS : INTERSECT : SUBTRACT : ADD : MERGE;
        }
    }

    public castParam(String str, IconCompatParcelizer iconCompatParcelizer, boolean z) {
        this.d = str;
        this.c = iconCompatParcelizer;
        this.a = z;
    }

    @Override // o.name
    public final style e(setText settext, setPageColor setpagecolor) {
        if (settext.e) {
            return new OnClick(this);
        }
        AvailableBookingTimeActivity_ViewBinding.b("Animation contains merge paths but they are disabled.");
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MergePaths{mode=");
        sb.append(this.c);
        sb.append('}');
        return sb.toString();
    }
}
