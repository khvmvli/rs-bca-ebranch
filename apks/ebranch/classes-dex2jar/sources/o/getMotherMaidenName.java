package o;
/* loaded from: classes-dex2jar.jar:o/getMotherMaidenName.class */
final class getMotherMaidenName extends getNumberID {
    private final long c;
    private final setTransaksiTunda d;
    private final TransaksiTundaDetail$$Parcelable e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public getMotherMaidenName(long j, TransaksiTundaDetail$$Parcelable transaksiTundaDetail$$Parcelable, setTransaksiTunda settransaksitunda) {
        this.c = j;
        if (transaksiTundaDetail$$Parcelable != null) {
            this.e = transaksiTundaDetail$$Parcelable;
            if (settransaksitunda != null) {
                this.d = settransaksitunda;
                return;
            }
            throw new NullPointerException("Null event");
        }
        throw new NullPointerException("Null transportContext");
    }

    @Override // o.getNumberID
    public final long b() {
        return this.c;
    }

    @Override // o.getNumberID
    public final setTransaksiTunda c() {
        return this.d;
    }

    @Override // o.getNumberID
    public final TransaksiTundaDetail$$Parcelable d() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof getNumberID)) {
            return false;
        }
        getNumberID getnumberid = (getNumberID) obj;
        if (this.c != getnumberid.b() || !this.e.equals(getnumberid.d()) || !this.d.equals(getnumberid.c())) {
            z = false;
        }
        return z;
    }

    public final int hashCode() {
        long j = this.c;
        return ((this.e.hashCode() ^ ((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003)) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PersistedEvent{id=");
        sb.append(this.c);
        sb.append(", transportContext=");
        sb.append(this.e);
        sb.append(", event=");
        sb.append(this.d);
        sb.append("}");
        return sb.toString();
    }
}
