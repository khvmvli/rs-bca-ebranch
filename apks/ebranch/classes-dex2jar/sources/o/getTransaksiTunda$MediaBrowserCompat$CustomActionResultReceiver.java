package o;

import java.util.Map;
import o.setTransaksiTunda;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes-dex2jar.jar:o/getTransaksiTunda$MediaBrowserCompat$CustomActionResultReceiver.class */
public final class getTransaksiTunda$MediaBrowserCompat$CustomActionResultReceiver extends setTransaksiTunda.RemoteActionCompatParcelizer {
    Map<String, String> a;
    private Integer b;
    private setTxbType c;
    private Long d;
    String e;
    private Long i;

    @Override // o.setTransaksiTunda.RemoteActionCompatParcelizer
    protected final Map<String, String> a() {
        Map<String, String> map = this.a;
        if (map != null) {
            return map;
        }
        throw new IllegalStateException("Property \"autoMetadata\" has not been set");
    }

    @Override // o.setTransaksiTunda.RemoteActionCompatParcelizer
    public final setTransaksiTunda.RemoteActionCompatParcelizer b(long j) {
        this.i = Long.valueOf(j);
        return this;
    }

    @Override // o.setTransaksiTunda.RemoteActionCompatParcelizer
    public final setTransaksiTunda.RemoteActionCompatParcelizer b(Integer num) {
        this.b = num;
        return this;
    }

    @Override // o.setTransaksiTunda.RemoteActionCompatParcelizer
    protected final setTransaksiTunda.RemoteActionCompatParcelizer b(Map<String, String> map) {
        this.a = map;
        return this;
    }

    @Override // o.setTransaksiTunda.RemoteActionCompatParcelizer
    public final setTransaksiTunda.RemoteActionCompatParcelizer c(setTxbType settxbtype) {
        if (settxbtype != null) {
            this.c = settxbtype;
            return this;
        }
        throw new NullPointerException("Null encodedPayload");
    }

    @Override // o.setTransaksiTunda.RemoteActionCompatParcelizer
    public final setTransaksiTunda c() {
        String str = this.e == null ? " transportName" : "";
        String str2 = str;
        if (this.c == null) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(" encodedPayload");
            str2 = sb.toString();
        }
        String str3 = str2;
        if (this.d == null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str2);
            sb2.append(" eventMillis");
            str3 = sb2.toString();
        }
        String str4 = str3;
        if (this.i == null) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(str3);
            sb3.append(" uptimeMillis");
            str4 = sb3.toString();
        }
        String str5 = str4;
        if (this.a == null) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(str4);
            sb4.append(" autoMetadata");
            str5 = sb4.toString();
        }
        if (str5.isEmpty()) {
            return new getTransaksiTunda(this.e, this.b, this.c, this.d.longValue(), this.i.longValue(), this.a, (byte) 0);
        }
        StringBuilder sb5 = new StringBuilder("Missing required properties:");
        sb5.append(str5);
        throw new IllegalStateException(sb5.toString());
    }

    @Override // o.setTransaksiTunda.RemoteActionCompatParcelizer
    public final setTransaksiTunda.RemoteActionCompatParcelizer d(long j) {
        this.d = Long.valueOf(j);
        return this;
    }

    @Override // o.setTransaksiTunda.RemoteActionCompatParcelizer
    public final setTransaksiTunda.RemoteActionCompatParcelizer e(String str) {
        if (str != null) {
            this.e = str;
            return this;
        }
        throw new NullPointerException("Null transportName");
    }
}
