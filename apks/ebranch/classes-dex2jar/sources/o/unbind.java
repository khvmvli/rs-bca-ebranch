package o;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/* loaded from: classes-dex2jar.jar:o/unbind.class */
public final class unbind {
    public static final unbind c = new unbind("COMPOSITION");
    public doClick a;
    public final List<String> e;

    public unbind(unbind unbind) {
        this.e = new ArrayList(unbind.e);
        this.a = unbind.a;
    }

    public unbind(String... strArr) {
        this.e = Arrays.asList(strArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0098, code lost:
        if (r0.get(r0.size() - 1).equals("**") != false) goto L_0x009b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0113, code lost:
        if (r0.get(r0.size() - 1).equals("**") != false) goto L_0x0116;
     */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final boolean b(java.lang.String r5, int r6) {
        /*
        // Method dump skipped, instructions count: 328
        */
        throw new UnsupportedOperationException("Method not decompiled: o.unbind.b(java.lang.String, int):boolean");
    }

    public final boolean c(String str, int i) {
        if ("__container".equals(str)) {
            return true;
        }
        if (i >= this.e.size()) {
            return false;
        }
        return this.e.get(i).equals(str) || this.e.get(i).equals("**") || this.e.get(i).equals("*");
    }

    public final int d(String str, int i) {
        if ("__container".equals(str)) {
            return 0;
        }
        if (!this.e.get(i).equals("**")) {
            return 1;
        }
        return (i != this.e.size() - 1 && this.e.get(i + 1).equals(str)) ? 2 : 0;
    }

    public final boolean e(String str, int i) {
        if ("__container".equals(str)) {
            return true;
        }
        boolean z = true;
        if (i >= this.e.size() - 1) {
            z = this.e.get(i).equals("**");
        }
        return z;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("KeyPath{keys=");
        sb.append(this.e);
        sb.append(",resolved=");
        sb.append(this.a != null);
        sb.append('}');
        return sb.toString();
    }
}
