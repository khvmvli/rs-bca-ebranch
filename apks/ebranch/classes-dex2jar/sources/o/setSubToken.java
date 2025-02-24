package o;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes-dex2jar.jar:o/setSubToken.class */
public final class setSubToken extends setTxbDate {
    private final long d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public setSubToken(long j) {
        this.d = j;
    }

    @Override // o.setTxbDate
    public final long c() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof setTxbDate)) {
            return false;
        }
        if (this.d != ((setTxbDate) obj).c()) {
            z = false;
        }
        return z;
    }

    public final int hashCode() {
        long j = this.d;
        return 1000003 ^ ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LogResponse{nextRequestWaitMillis=");
        sb.append(this.d);
        sb.append("}");
        return sb.toString();
    }
}
