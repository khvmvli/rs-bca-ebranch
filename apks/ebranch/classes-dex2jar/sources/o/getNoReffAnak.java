package o;

import o.getTransaksiTundaDetail;
/* loaded from: classes-dex2jar.jar:o/getNoReffAnak.class */
final class getNoReffAnak extends getTransaksiTundaDetail {
    private final getFlagRating a;
    private final String b;
    private final getStatus<?, byte[]> c;
    private final TransaksiTundaDetail$$Parcelable d;
    private final getServiceType<?> e;

    /* loaded from: classes-dex2jar.jar:o/getNoReffAnak$read.class */
    static final class read extends getTransaksiTundaDetail.write {
        private getStatus<?, byte[]> a;
        private String b;
        private getServiceType<?> c;
        private TransaksiTundaDetail$$Parcelable d;
        private getFlagRating e;

        @Override // o.getTransaksiTundaDetail.write
        public final getTransaksiTundaDetail.write a(TransaksiTundaDetail$$Parcelable transaksiTundaDetail$$Parcelable) {
            if (transaksiTundaDetail$$Parcelable != null) {
                this.d = transaksiTundaDetail$$Parcelable;
                return this;
            }
            throw new NullPointerException("Null transportContext");
        }

        @Override // o.getTransaksiTundaDetail.write
        public final getTransaksiTundaDetail.write b(String str) {
            if (str != null) {
                this.b = str;
                return this;
            }
            throw new NullPointerException("Null transportName");
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // o.getTransaksiTundaDetail.write
        public final getTransaksiTundaDetail.write b(getFlagRating getflagrating) {
            if (getflagrating != null) {
                this.e = getflagrating;
                return this;
            }
            throw new NullPointerException("Null encoding");
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // o.getTransaksiTundaDetail.write
        public final getTransaksiTundaDetail.write b(getServiceType<?> getservicetype) {
            if (getservicetype != null) {
                this.c = getservicetype;
                return this;
            }
            throw new NullPointerException("Null event");
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // o.getTransaksiTundaDetail.write
        public final getTransaksiTundaDetail.write b(getStatus<?, byte[]> getstatus) {
            if (getstatus != null) {
                this.a = getstatus;
                return this;
            }
            throw new NullPointerException("Null transformer");
        }

        @Override // o.getTransaksiTundaDetail.write
        public final getTransaksiTundaDetail d() {
            String str = this.d == null ? " transportContext" : "";
            String str2 = str;
            if (this.b == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" transportName");
                str2 = sb.toString();
            }
            String str3 = str2;
            if (this.c == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str2);
                sb2.append(" event");
                str3 = sb2.toString();
            }
            String str4 = str3;
            if (this.a == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str3);
                sb3.append(" transformer");
                str4 = sb3.toString();
            }
            String str5 = str4;
            if (this.e == null) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str4);
                sb4.append(" encoding");
                str5 = sb4.toString();
            }
            if (str5.isEmpty()) {
                return new getNoReffAnak(this.d, this.b, this.c, this.a, this.e, (byte) 0);
            }
            StringBuilder sb5 = new StringBuilder("Missing required properties:");
            sb5.append(str5);
            throw new IllegalStateException(sb5.toString());
        }
    }

    private getNoReffAnak(TransaksiTundaDetail$$Parcelable transaksiTundaDetail$$Parcelable, String str, getServiceType<?> getservicetype, getStatus<?, byte[]> getstatus, getFlagRating getflagrating) {
        this.d = transaksiTundaDetail$$Parcelable;
        this.b = str;
        this.e = getservicetype;
        this.c = getstatus;
        this.a = getflagrating;
    }

    /* synthetic */ getNoReffAnak(TransaksiTundaDetail$$Parcelable transaksiTundaDetail$$Parcelable, String str, getServiceType getservicetype, getStatus getstatus, getFlagRating getflagrating, byte b) {
        this(transaksiTundaDetail$$Parcelable, str, getservicetype, getstatus, getflagrating);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.getTransaksiTundaDetail
    public final getServiceType<?> a() {
        return this.e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.getTransaksiTundaDetail
    public final getStatus<?, byte[]> b() {
        return this.c;
    }

    @Override // o.getTransaksiTundaDetail
    public final getFlagRating c() {
        return this.a;
    }

    @Override // o.getTransaksiTundaDetail
    public final String d() {
        return this.b;
    }

    @Override // o.getTransaksiTundaDetail
    public final TransaksiTundaDetail$$Parcelable e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof getTransaksiTundaDetail)) {
            return false;
        }
        getTransaksiTundaDetail gettransaksitundadetail = (getTransaksiTundaDetail) obj;
        if (!this.d.equals(gettransaksitundadetail.e()) || !this.b.equals(gettransaksitundadetail.d()) || !this.e.equals(gettransaksitundadetail.a()) || !this.c.equals(gettransaksitundadetail.b()) || !this.a.equals(gettransaksitundadetail.c())) {
            z = false;
        }
        return z;
    }

    public final int hashCode() {
        return ((((((((this.d.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.a.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SendRequest{transportContext=");
        sb.append(this.d);
        sb.append(", transportName=");
        sb.append(this.b);
        sb.append(", event=");
        sb.append(this.e);
        sb.append(", transformer=");
        sb.append(this.c);
        sb.append(", encoding=");
        sb.append(this.a);
        sb.append("}");
        return sb.toString();
    }
}
