package o;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes-dex2jar.jar:o/realmGet$tipeNasabah.class */
public final class realmGet$tipeNasabah extends setFotoPribadi {
    public static final Parcelable.Creator<realmGet$tipeNasabah> CREATOR = new realmGet$tipeNasabahId();
    public final realmGet$nomorRekening a;
    public final long c;
    public final String d;
    public final String e;

    public realmGet$tipeNasabah(String str, realmGet$nomorRekening realmget_nomorrekening, String str2, long j) {
        this.e = str;
        this.a = realmget_nomorrekening;
        this.d = str2;
        this.c = j;
    }

    realmGet$tipeNasabah(realmGet$tipeNasabah realmget_tipenasabah, long j) {
        setFotoKtp.b(realmget_tipenasabah);
        this.e = realmget_tipenasabah.e;
        this.a = realmget_tipenasabah.a;
        this.d = realmget_tipenasabah.d;
        this.c = j;
    }

    @Override // java.lang.Object
    public final String toString() {
        String str = this.d;
        String str2 = this.e;
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 21 + String.valueOf(str2).length() + String.valueOf(valueOf).length());
        sb.append("origin=");
        sb.append(str);
        sb.append(",name=");
        sb.append(str2);
        sb.append(",params=");
        sb.append(valueOf);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        realmGet$tipeNasabahId.a(this, parcel, i);
    }
}
