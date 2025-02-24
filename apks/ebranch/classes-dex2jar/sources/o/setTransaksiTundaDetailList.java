package o;

import com.google.firebase.encoders.annotations.Encodable;
import java.util.List;
import o.TransaksiTunda$$Parcelable;
/* loaded from: classes-dex2jar.jar:o/setTransaksiTundaDetailList.class */
final class setTransaksiTundaDetailList extends TransaksiTunda$$Parcelable {
    private final setTxbDateFormatted a;
    private final String b;
    private final Integer c;
    private final List<TransaksiTundaDetail> d;
    private final getTxbType e;
    private final long f;
    private final long g;

    /* loaded from: classes-dex2jar.jar:o/setTransaksiTundaDetailList$IconCompatParcelizer.class */
    public static final class IconCompatParcelizer extends TransaksiTunda$$Parcelable.IconCompatParcelizer {
        private String a;
        private getTxbType b;
        private Integer c;
        private List<TransaksiTundaDetail> d;
        private setTxbDateFormatted e;
        private Long g;
        private Long j;

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // o.TransaksiTunda$$Parcelable.IconCompatParcelizer
        public final TransaksiTunda$$Parcelable.IconCompatParcelizer a(Integer num) {
            this.c = num;
            return this;
        }

        @Override // o.TransaksiTunda$$Parcelable.IconCompatParcelizer
        public final TransaksiTunda$$Parcelable.IconCompatParcelizer b(long j) {
            this.j = Long.valueOf(j);
            return this;
        }

        @Override // o.TransaksiTunda$$Parcelable.IconCompatParcelizer
        public final TransaksiTunda$$Parcelable.IconCompatParcelizer c(List<TransaksiTundaDetail> list) {
            this.d = list;
            return this;
        }

        @Override // o.TransaksiTunda$$Parcelable.IconCompatParcelizer
        public final TransaksiTunda$$Parcelable c() {
            String str = this.j == null ? " requestTimeMs" : "";
            String str2 = str;
            if (this.g == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" requestUptimeMs");
                str2 = sb.toString();
            }
            if (str2.isEmpty()) {
                return new setTransaksiTundaDetailList(this.j.longValue(), this.g.longValue(), this.e, this.c, this.a, this.d, this.b, (byte) 0);
            }
            StringBuilder sb2 = new StringBuilder("Missing required properties:");
            sb2.append(str2);
            throw new IllegalStateException(sb2.toString());
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // o.TransaksiTunda$$Parcelable.IconCompatParcelizer
        public final TransaksiTunda$$Parcelable.IconCompatParcelizer d(String str) {
            this.a = str;
            return this;
        }

        @Override // o.TransaksiTunda$$Parcelable.IconCompatParcelizer
        public final TransaksiTunda$$Parcelable.IconCompatParcelizer d(getTxbType gettxbtype) {
            this.b = gettxbtype;
            return this;
        }

        @Override // o.TransaksiTunda$$Parcelable.IconCompatParcelizer
        public final TransaksiTunda$$Parcelable.IconCompatParcelizer e(long j) {
            this.g = Long.valueOf(j);
            return this;
        }

        @Override // o.TransaksiTunda$$Parcelable.IconCompatParcelizer
        public final TransaksiTunda$$Parcelable.IconCompatParcelizer e(setTxbDateFormatted settxbdateformatted) {
            this.e = settxbdateformatted;
            return this;
        }
    }

    private setTransaksiTundaDetailList(long j, long j2, setTxbDateFormatted settxbdateformatted, Integer num, String str, List<TransaksiTundaDetail> list, getTxbType gettxbtype) {
        this.g = j;
        this.f = j2;
        this.a = settxbdateformatted;
        this.c = num;
        this.b = str;
        this.d = list;
        this.e = gettxbtype;
    }

    /* synthetic */ setTransaksiTundaDetailList(long j, long j2, setTxbDateFormatted settxbdateformatted, Integer num, String str, List list, getTxbType gettxbtype, byte b) {
        this(j, j2, settxbdateformatted, num, str, list, gettxbtype);
    }

    @Override // o.TransaksiTunda$$Parcelable
    @Encodable.Field(name = "logEvent")
    public final List<TransaksiTundaDetail> a() {
        return this.d;
    }

    @Override // o.TransaksiTunda$$Parcelable
    public final String b() {
        return this.b;
    }

    @Override // o.TransaksiTunda$$Parcelable
    public final getTxbType c() {
        return this.e;
    }

    @Override // o.TransaksiTunda$$Parcelable
    public final setTxbDateFormatted d() {
        return this.a;
    }

    @Override // o.TransaksiTunda$$Parcelable
    public final Integer e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        setTxbDateFormatted settxbdateformatted;
        Integer num;
        String str;
        List<TransaksiTundaDetail> list;
        getTxbType gettxbtype;
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TransaksiTunda$$Parcelable)) {
            return false;
        }
        TransaksiTunda$$Parcelable transaksiTunda$$Parcelable = (TransaksiTunda$$Parcelable) obj;
        if (this.g != transaksiTunda$$Parcelable.i() || this.f != transaksiTunda$$Parcelable.j() || ((settxbdateformatted = this.a) != null ? !settxbdateformatted.equals(transaksiTunda$$Parcelable.d()) : transaksiTunda$$Parcelable.d() != null) || ((num = this.c) != null ? !num.equals(transaksiTunda$$Parcelable.e()) : transaksiTunda$$Parcelable.e() != null) || ((str = this.b) != null ? !str.equals(transaksiTunda$$Parcelable.b()) : transaksiTunda$$Parcelable.b() != null) || ((list = this.d) != null ? !list.equals(transaksiTunda$$Parcelable.a()) : transaksiTunda$$Parcelable.a() != null) || ((gettxbtype = this.e) != null ? !gettxbtype.equals(transaksiTunda$$Parcelable.c()) : transaksiTunda$$Parcelable.c() != null)) {
            z = false;
        }
        return z;
    }

    public final int hashCode() {
        long j = this.g;
        int i = (int) (j ^ (j >>> 32));
        long j2 = this.f;
        int i2 = (int) ((j2 >>> 32) ^ j2);
        setTxbDateFormatted settxbdateformatted = this.a;
        int i3 = 0;
        int hashCode = settxbdateformatted == null ? 0 : settxbdateformatted.hashCode();
        Integer num = this.c;
        int hashCode2 = num == null ? 0 : num.hashCode();
        String str = this.b;
        int hashCode3 = str == null ? 0 : str.hashCode();
        List<TransaksiTundaDetail> list = this.d;
        int hashCode4 = list == null ? 0 : list.hashCode();
        getTxbType gettxbtype = this.e;
        if (gettxbtype != null) {
            i3 = gettxbtype.hashCode();
        }
        return ((((((((((i2 ^ ((i ^ 1000003) * 1000003)) * 1000003) ^ hashCode) * 1000003) ^ hashCode2) * 1000003) ^ hashCode3) * 1000003) ^ hashCode4) * 1000003) ^ i3;
    }

    @Override // o.TransaksiTunda$$Parcelable
    public final long i() {
        return this.g;
    }

    @Override // o.TransaksiTunda$$Parcelable
    public final long j() {
        return this.f;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LogRequest{requestTimeMs=");
        sb.append(this.g);
        sb.append(", requestUptimeMs=");
        sb.append(this.f);
        sb.append(", clientInfo=");
        sb.append(this.a);
        sb.append(", logSource=");
        sb.append(this.c);
        sb.append(", logSourceName=");
        sb.append(this.b);
        sb.append(", logEvents=");
        sb.append(this.d);
        sb.append(", qosTier=");
        sb.append(this.e);
        sb.append("}");
        return sb.toString();
    }
}
