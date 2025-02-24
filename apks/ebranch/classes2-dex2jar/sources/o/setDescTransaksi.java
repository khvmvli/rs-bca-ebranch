package o;

import android.os.Bundle;
import o.realmGet;
/* loaded from: classes2-dex2jar.jar:o/setDescTransaksi.class */
public final class setDescTransaksi {
    public final String a;
    public final Bundle b;
    public final long d;
    public final String e;

    public setDescTransaksi(String str, String str2, Bundle bundle, long j) {
        this.e = str;
        this.a = str2;
        this.b = bundle;
        this.d = j;
    }

    public static setDescTransaksi c(realmGet.tipeNasabah tipenasabah) {
        return new setDescTransaksi(tipenasabah.e, tipenasabah.d, tipenasabah.a.e(), tipenasabah.c);
    }

    public final realmGet.tipeNasabah b() {
        return new realmGet.tipeNasabah(this.e, new realmGet.nomorRekening(new Bundle(this.b)), this.a, this.d);
    }

    public final String toString() {
        String str = this.a;
        String str2 = this.e;
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 21 + String.valueOf(str2).length() + String.valueOf(valueOf).length());
        sb.append("origin=");
        sb.append(str);
        sb.append(",name=");
        sb.append(str2);
        sb.append(",params=");
        sb.append(valueOf);
        return sb.toString();
    }
}
