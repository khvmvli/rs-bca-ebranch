package o;
/* loaded from: classes2-dex2jar.jar:o/CC19FormKartuKreditFragment.class */
public final class CC19FormKartuKreditFragment {
    int a = -1;
    onBankPenerbitEvent b;
    public CC18FormKartuKreditFragment c;
    CC17FormKartuKreditFragment_ViewBinding d;
    SubscribeExpiredDate e;

    public final String toString() {
        StringBuilder sb = new StringBuilder(200);
        sb.append("<<\n mode: ");
        sb.append(this.b);
        sb.append("\n ecLevel: ");
        sb.append(this.d);
        sb.append("\n version: ");
        sb.append(this.e);
        sb.append("\n maskPattern: ");
        sb.append(this.a);
        if (this.c == null) {
            sb.append("\n matrix: null\n");
        } else {
            sb.append("\n matrix:\n");
            sb.append(this.c);
        }
        sb.append(">>\n");
        return sb.toString();
    }
}
