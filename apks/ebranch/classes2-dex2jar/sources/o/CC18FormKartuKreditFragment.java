package o;
/* loaded from: classes2-dex2jar.jar:o/CC18FormKartuKreditFragment.class */
public final class CC18FormKartuKreditFragment {
    public final int b;
    public final int c;
    public final byte[][] e;

    /* JADX WARN: Type inference failed for: r1v1, types: [byte[][][][], byte[][]] */
    public CC18FormKartuKreditFragment(int i, int i2) {
        this.e = new byte[i2][i][];
        this.c = i;
        this.b = i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(((this.c << 1) * this.b) + 2);
        for (int i = 0; i < this.b; i++) {
            for (int i2 = 0; i2 < this.c; i2++) {
                byte b = this.e[i][i2];
                if (b == 0) {
                    sb.append(" 0");
                } else if (b != 1) {
                    sb.append("  ");
                } else {
                    sb.append(" 1");
                }
            }
            sb.append('\n');
        }
        return sb.toString();
    }
}
