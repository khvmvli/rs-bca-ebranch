package o;
/* loaded from: classes-dex2jar.jar:o/getFlagRating.class */
public final class getFlagRating {
    public final String e;

    public getFlagRating(String str) {
        if (str != null) {
            this.e = str;
            return;
        }
        throw new NullPointerException("name is null");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getFlagRating)) {
            return false;
        }
        return this.e.equals(((getFlagRating) obj).e);
    }

    public final int hashCode() {
        return this.e.hashCode() ^ 1000003;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Encoding{name=\"");
        sb.append(this.e);
        sb.append("\"}");
        return sb.toString();
    }
}
