package o;

import java.security.MessageDigest;
/* loaded from: classes-dex2jar.jar:o/setAccountID.class */
final class setAccountID implements setCode {
    private final setCode b;
    private final setCode c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public setAccountID(setCode setcode, setCode setcode2) {
        this.b = setcode;
        this.c = setcode2;
    }

    @Override // o.setCode
    public final void e(MessageDigest messageDigest) {
        this.b.e(messageDigest);
        this.c.e(messageDigest);
    }

    @Override // o.setCode
    public final boolean equals(Object obj) {
        boolean z = false;
        if (obj instanceof setAccountID) {
            setAccountID setaccountid = (setAccountID) obj;
            z = false;
            if (this.b.equals(setaccountid.b)) {
                z = false;
                if (this.c.equals(setaccountid.c)) {
                    z = true;
                }
            }
        }
        return z;
    }

    @Override // o.setCode
    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.c.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DataCacheKey{sourceKey=");
        sb.append(this.b);
        sb.append(", signature=");
        sb.append(this.c);
        sb.append('}');
        return sb.toString();
    }
}
