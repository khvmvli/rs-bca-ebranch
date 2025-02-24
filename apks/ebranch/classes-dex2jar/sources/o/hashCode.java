package o;

import android.graphics.Insets;
import android.graphics.Rect;
/* loaded from: classes-dex2jar.jar:o/hashCode.class */
public final class hashCode {
    public static final hashCode b = new hashCode(0, 0, 0, 0);
    public final int a;
    public final int c;
    public final int d;
    public final int e;

    private hashCode(int i, int i2, int i3, int i4) {
        this.e = i;
        this.a = i2;
        this.c = i3;
        this.d = i4;
    }

    public static hashCode b(int i, int i2, int i3, int i4) {
        return (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) ? b : new hashCode(i, i2, i3, i4);
    }

    public static hashCode d(Rect rect) {
        int i = rect.left;
        int i2 = rect.top;
        int i3 = rect.right;
        int i4 = rect.bottom;
        return (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) ? b : new hashCode(i, i2, i3, i4);
    }

    public static hashCode d(hashCode hashcode, hashCode hashcode2) {
        int max = Math.max(hashcode.e, hashcode2.e);
        int max2 = Math.max(hashcode.a, hashcode2.a);
        int max3 = Math.max(hashcode.c, hashcode2.c);
        int max4 = Math.max(hashcode.d, hashcode2.d);
        return (max == 0 && max2 == 0 && max3 == 0 && max4 == 0) ? b : new hashCode(max, max2, max3, max4);
    }

    public static hashCode e(Insets insets) {
        int i = insets.left;
        int i2 = insets.top;
        int i3 = insets.right;
        int i4 = insets.bottom;
        return (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) ? b : new hashCode(i, i2, i3, i4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        hashCode hashcode = (hashCode) obj;
        return this.d == hashcode.d && this.e == hashcode.e && this.c == hashcode.c && this.a == hashcode.a;
    }

    public final int hashCode() {
        return (((((this.e * 31) + this.a) * 31) + this.c) * 31) + this.d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Insets{left=");
        sb.append(this.e);
        sb.append(", top=");
        sb.append(this.a);
        sb.append(", right=");
        sb.append(this.c);
        sb.append(", bottom=");
        sb.append(this.d);
        sb.append('}');
        return sb.toString();
    }
}
