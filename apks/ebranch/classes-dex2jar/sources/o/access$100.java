package o;

import android.util.Base64;
import java.util.List;
/* loaded from: classes-dex2jar.jar:o/access$100.class */
public final class access$100 {
    final String a;
    final String b;
    final int c = 0;
    final List<List<byte[]>> d;
    final String e;
    final String g;

    public access$100(String str, String str2, String str3, List<List<byte[]>> list) {
        this.a = str;
        this.e = str2;
        this.g = str3;
        this.d = list;
        StringBuilder sb = new StringBuilder(str);
        sb.append("-");
        sb.append(str2);
        sb.append("-");
        sb.append(str3);
        this.b = sb.toString();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder("FontRequest {mProviderAuthority: ");
        sb2.append(this.a);
        sb2.append(", mProviderPackage: ");
        sb2.append(this.e);
        sb2.append(", mQuery: ");
        sb2.append(this.g);
        sb2.append(", mCertificates:");
        sb.append(sb2.toString());
        for (int i = 0; i < this.d.size(); i++) {
            sb.append(" [");
            List<byte[]> list = this.d.get(i);
            for (int i2 = 0; i2 < list.size(); i2++) {
                sb.append(" \"");
                sb.append(Base64.encodeToString(list.get(i2), 0));
                sb.append("\"");
            }
            sb.append(" ]");
        }
        sb.append("}");
        StringBuilder sb3 = new StringBuilder("mCertificatesArray: ");
        sb3.append(this.c);
        sb.append(sb3.toString());
        return sb.toString();
    }
}
