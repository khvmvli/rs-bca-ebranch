package o;

import java.security.MessageDigest;
/* loaded from: classes-dex2jar.jar:o/getReceiverPhone.class */
public final class getReceiverPhone implements setCode {
    private final Object d;

    public getReceiverPhone(Object obj) {
        if (obj != null) {
            this.d = obj;
            return;
        }
        throw new NullPointerException("Argument must not be null");
    }

    @Override // o.setCode
    public final void e(MessageDigest messageDigest) {
        messageDigest.update(this.d.toString().getBytes(e));
    }

    @Override // o.setCode
    public final boolean equals(Object obj) {
        if (obj instanceof getReceiverPhone) {
            return this.d.equals(((getReceiverPhone) obj).d);
        }
        return false;
    }

    @Override // o.setCode
    public final int hashCode() {
        return this.d.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ObjectKey{object=");
        sb.append(this.d);
        sb.append('}');
        return sb.toString();
    }
}
