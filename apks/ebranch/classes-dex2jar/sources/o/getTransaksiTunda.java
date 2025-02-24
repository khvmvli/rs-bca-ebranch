package o;

import java.util.Map;
/* loaded from: classes-dex2jar.jar:o/getTransaksiTunda.class */
final class getTransaksiTunda extends setTransaksiTunda {
    private final Map<String, String> a;
    private final long b;
    private final setTxbType c;
    private final String d;
    private final Integer e;
    private final long j;

    private getTransaksiTunda(String str, Integer num, setTxbType settxbtype, long j, long j2, Map<String, String> map) {
        this.d = str;
        this.e = num;
        this.c = settxbtype;
        this.b = j;
        this.j = j2;
        this.a = map;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ getTransaksiTunda(String str, Integer num, setTxbType settxbtype, long j, long j2, Map map, byte b) {
        this(str, num, settxbtype, j, j2, map);
    }

    @Override // o.setTransaksiTunda
    public final long a() {
        return this.b;
    }

    @Override // o.setTransaksiTunda
    public final Integer b() {
        return this.e;
    }

    @Override // o.setTransaksiTunda
    public final String c() {
        return this.d;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.setTransaksiTunda
    public final Map<String, String> d() {
        return this.a;
    }

    @Override // o.setTransaksiTunda
    public final setTxbType e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        Integer num;
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof setTransaksiTunda)) {
            return false;
        }
        setTransaksiTunda settransaksitunda = (setTransaksiTunda) obj;
        if (!this.d.equals(settransaksitunda.c()) || ((num = this.e) != null ? !num.equals(settransaksitunda.b()) : settransaksitunda.b() != null) || !this.c.equals(settransaksitunda.e()) || this.b != settransaksitunda.a() || this.j != settransaksitunda.h() || !this.a.equals(settransaksitunda.d())) {
            z = false;
        }
        return z;
    }

    @Override // o.setTransaksiTunda
    public final long h() {
        return this.j;
    }

    public final int hashCode() {
        int hashCode = this.d.hashCode();
        Integer num = this.e;
        int hashCode2 = num == null ? 0 : num.hashCode();
        int hashCode3 = this.c.hashCode();
        long j = this.b;
        int i = (int) (j ^ (j >>> 32));
        long j2 = this.j;
        return ((((((((((hashCode ^ 1000003) * 1000003) ^ hashCode2) * 1000003) ^ hashCode3) * 1000003) ^ i) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ this.a.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EventInternal{transportName=");
        sb.append(this.d);
        sb.append(", code=");
        sb.append(this.e);
        sb.append(", encodedPayload=");
        sb.append(this.c);
        sb.append(", eventMillis=");
        sb.append(this.b);
        sb.append(", uptimeMillis=");
        sb.append(this.j);
        sb.append(", autoMetadata=");
        sb.append(this.a);
        sb.append("}");
        return sb.toString();
    }
}
