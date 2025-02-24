package o;

import java.security.MessageDigest;
import o.getCode;
/* loaded from: classes-dex2jar.jar:o/CategoryResponse.class */
public final class CategoryResponse implements setCode {
    public final setThumbTextPadding<getCode<?>, Object> c = new getReceiverStatesName();

    @Override // o.setCode
    public final void e(MessageDigest messageDigest) {
        for (int i = 0; i < this.c.size(); i++) {
            int i2 = i << 1;
            getCode getcode = (getCode) this.c.h[i2];
            Object obj = this.c.h[i2 + 1];
            getCode.read<T> read = getcode.d;
            if (getcode.e == null) {
                getcode.e = getcode.b.getBytes(setCode.e);
            }
            read.c(getcode.e, obj, messageDigest);
        }
    }

    @Override // o.setCode
    public final boolean equals(Object obj) {
        if (obj instanceof CategoryResponse) {
            return this.c.equals(((CategoryResponse) obj).c);
        }
        return false;
    }

    @Override // o.setCode
    public final int hashCode() {
        return this.c.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Options{values=");
        sb.append(this.c);
        sb.append('}');
        return sb.toString();
    }
}
