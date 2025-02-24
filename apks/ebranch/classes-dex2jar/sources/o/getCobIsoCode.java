package o;

import o.getDollarCurrCode;
/* loaded from: classes-dex2jar.jar:o/getCobIsoCode.class */
public final class getCobIsoCode extends getDollarCurrCode {
    private final getDollarCurrCode.RemoteActionCompatParcelizer d;
    private final long e;

    public getCobIsoCode(getDollarCurrCode.RemoteActionCompatParcelizer remoteActionCompatParcelizer, long j) {
        if (remoteActionCompatParcelizer != null) {
            this.d = remoteActionCompatParcelizer;
            this.e = j;
            return;
        }
        throw new NullPointerException("Null status");
    }

    @Override // o.getDollarCurrCode
    public final getDollarCurrCode.RemoteActionCompatParcelizer b() {
        return this.d;
    }

    @Override // o.getDollarCurrCode
    public final long c() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof getDollarCurrCode)) {
            return false;
        }
        getDollarCurrCode getdollarcurrcode = (getDollarCurrCode) obj;
        if (!this.d.equals(getdollarcurrcode.b()) || this.e != getdollarcurrcode.c()) {
            z = false;
        }
        return z;
    }

    public final int hashCode() {
        int hashCode = this.d.hashCode();
        long j = this.e;
        return ((hashCode ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BackendResponse{status=");
        sb.append(this.d);
        sb.append(", nextRequestWaitMillis=");
        sb.append(this.e);
        sb.append("}");
        return sb.toString();
    }
}
