package o;

import android.os.Parcel;
import android.os.Parcelable;
import o.realmSet;
/* loaded from: classes-dex2jar.jar:o/getNomorHp.class */
public final class getNomorHp extends setFotoPribadi {
    public static final Parcelable.Creator<getNomorHp> CREATOR = new getBeritaAcara();
    public long a;
    public String b;
    public boolean c;
    public realmSet.tarikans d;
    public String e;
    public long f;
    public final realmGet$tipeNasabah g;
    public realmGet$tipeNasabah h;
    public String i;
    public final long j;
    public final realmGet$tipeNasabah l;

    /* JADX INFO: Access modifiers changed from: package-private */
    public getNomorHp(String str, String str2, realmSet.tarikans tarikans, long j, boolean z, String str3, realmGet$tipeNasabah realmget_tipenasabah, long j2, realmGet$tipeNasabah realmget_tipenasabah2, long j3, realmGet$tipeNasabah realmget_tipenasabah3) {
        this.e = str;
        this.b = str2;
        this.d = tarikans;
        this.a = j;
        this.c = z;
        this.i = str3;
        this.g = realmget_tipenasabah;
        this.f = j2;
        this.h = realmget_tipenasabah2;
        this.j = j3;
        this.l = realmget_tipenasabah3;
    }

    getNomorHp(getNomorHp getnomorhp) {
        setFotoKtp.b(getnomorhp);
        this.e = getnomorhp.e;
        this.b = getnomorhp.b;
        this.d = getnomorhp.d;
        this.a = getnomorhp.a;
        this.c = getnomorhp.c;
        this.i = getnomorhp.i;
        this.g = getnomorhp.g;
        this.f = getnomorhp.f;
        this.h = getnomorhp.h;
        this.j = getnomorhp.j;
        this.l = getnomorhp.l;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int b = setHmAddress.b(parcel);
        setHmAddress.c(parcel, 2, this.e, false);
        setHmAddress.c(parcel, 3, this.b, false);
        setHmAddress.b(parcel, 4, (Parcelable) this.d, i, false);
        setHmAddress.e(parcel, 5, this.a);
        setHmAddress.b(parcel, 6, this.c);
        setHmAddress.c(parcel, 7, this.i, false);
        setHmAddress.b(parcel, 8, (Parcelable) this.g, i, false);
        setHmAddress.e(parcel, 9, this.f);
        setHmAddress.b(parcel, 10, (Parcelable) this.h, i, false);
        setHmAddress.e(parcel, 11, this.j);
        setHmAddress.b(parcel, 12, (Parcelable) this.l, i, false);
        setHmAddress.e(parcel, b);
    }
}
