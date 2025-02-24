package o;

import java.util.Arrays;
/* loaded from: classes-dex2jar.jar:o/setTxbType.class */
public final class setTxbType {
    public final getFlagRating b;
    public final byte[] e;

    public setTxbType(getFlagRating getflagrating, byte[] bArr) {
        if (getflagrating == null) {
            throw new NullPointerException("encoding is null");
        } else if (bArr != null) {
            this.b = getflagrating;
            this.e = bArr;
        } else {
            throw new NullPointerException("bytes is null");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setTxbType)) {
            return false;
        }
        setTxbType settxbtype = (setTxbType) obj;
        if (!this.b.equals(settxbtype.b)) {
            return false;
        }
        return Arrays.equals(this.e, settxbtype.e);
    }

    public final int hashCode() {
        return ((this.b.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EncodedPayload{encoding=");
        sb.append(this.b);
        sb.append(", bytes=[...]}");
        return sb.toString();
    }
}
