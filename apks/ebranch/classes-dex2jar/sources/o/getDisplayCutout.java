package o;

import android.content.LocusId;
/* loaded from: classes-dex2jar.jar:o/getDisplayCutout.class */
public final class getDisplayCutout {
    private final LocusId a;
    private final String b;

    private String a() {
        int length = this.b.length();
        StringBuilder sb = new StringBuilder();
        sb.append(length);
        sb.append("_chars");
        return sb.toString();
    }

    public final LocusId b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        getDisplayCutout getdisplaycutout = (getDisplayCutout) obj;
        String str = this.b;
        if (str != null) {
            return str.equals(getdisplaycutout.b);
        }
        if (getdisplaycutout.b != null) {
            z = false;
        }
        return z;
    }

    public final int hashCode() {
        String str = this.b;
        return (str == null ? 0 : str.hashCode()) + 31;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LocusIdCompat[");
        sb.append(a());
        sb.append("]");
        return sb.toString();
    }
}
