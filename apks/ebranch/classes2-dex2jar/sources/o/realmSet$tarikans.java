package o;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes2-dex2jar.jar:o/realmSet$tarikans.class */
public final class realmSet$tarikans extends setFotoPribadi {
    public static final Parcelable.Creator<realmSet$tarikans> CREATOR = new realmSet$setorans();
    public final int a;
    public final String b;
    public final String c;
    public final long d;
    public final Long e;
    public final Double f;
    public final String i;

    public realmSet$tarikans(int i, String str, long j, Long l, Float f, String str2, String str3, Double d) {
        this.a = i;
        this.c = str;
        this.d = j;
        this.e = l;
        if (i == 1) {
            this.f = f != null ? Double.valueOf(f.doubleValue()) : null;
        } else {
            this.f = d;
        }
        this.b = str2;
        this.i = str3;
    }

    public realmSet$tarikans(String str, long j, Object obj, String str2) {
        setFotoKtp.c(str);
        this.a = 2;
        this.c = str;
        this.d = j;
        this.i = str2;
        if (obj == null) {
            this.e = null;
            this.f = null;
            this.b = null;
        } else if (obj instanceof Long) {
            this.e = (Long) obj;
            this.f = null;
            this.b = null;
        } else if (obj instanceof String) {
            this.e = null;
            this.f = null;
            this.b = (String) obj;
        } else if (obj instanceof Double) {
            this.e = null;
            this.f = (Double) obj;
            this.b = null;
        } else {
            throw new IllegalArgumentException("User attribute given of un-supported type");
        }
    }

    public realmSet$tarikans(realmSet$verified realmset_verified) {
        this(realmset_verified.d, realmset_verified.a, realmset_verified.e, realmset_verified.b);
    }

    public final Object a() {
        Long l = this.e;
        if (l != null) {
            return l;
        }
        Double d = this.f;
        if (d != null) {
            return d;
        }
        String str = this.b;
        if (str != null) {
            return str;
        }
        return null;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        realmSet$setorans.c(this, parcel, i);
    }
}
