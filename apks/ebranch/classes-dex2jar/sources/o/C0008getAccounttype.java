package o;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.location.LocationRequest;
import java.util.Collections;
import java.util.List;
/* renamed from: o.getAccounttype */
/* loaded from: classes-dex2jar.jar:o/getAccounttype.class */
public final class C0008getAccounttype extends setFotoPribadi {
    final String b;
    final boolean c;
    final LocationRequest d;
    final List<setCobIsoCode> e;
    final boolean f;
    final boolean g;
    boolean h;
    final boolean i;
    final String j;
    long l;
    String m;
    static final List<setCobIsoCode> a = Collections.emptyList();
    public static final Parcelable.Creator<C0008getAccounttype> CREATOR = new Parcelable.Creator<C0008getAccounttype>() { // from class: o.realmSet$bankName
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ C0008getAccounttype createFromParcel(Parcel parcel) {
            int a2 = SafeParcelReader.a(parcel);
            List<setCobIsoCode> list = C0008getAccounttype.a;
            LocationRequest locationRequest = null;
            String str = null;
            String str2 = null;
            String str3 = null;
            long j = Long.MAX_VALUE;
            boolean z = false;
            boolean z2 = false;
            boolean z3 = false;
            boolean z4 = false;
            boolean z5 = false;
            while (parcel.dataPosition() < a2) {
                int b = SafeParcelReader.b(parcel);
                int b2 = SafeParcelReader.b(b);
                if (b2 != 1) {
                    switch (b2) {
                        case 5:
                            list = SafeParcelReader.c(parcel, b, setCobIsoCode.CREATOR);
                            continue;
                        case 6:
                            str = SafeParcelReader.b(parcel, b);
                            continue;
                        case 7:
                            z = SafeParcelReader.j(parcel, b);
                            continue;
                        case 8:
                            z2 = SafeParcelReader.j(parcel, b);
                            continue;
                        case 9:
                            z3 = SafeParcelReader.j(parcel, b);
                            continue;
                        case 10:
                            str2 = SafeParcelReader.b(parcel, b);
                            continue;
                        case 11:
                            z4 = SafeParcelReader.j(parcel, b);
                            continue;
                        case 12:
                            z5 = SafeParcelReader.j(parcel, b);
                            continue;
                        case 13:
                            str3 = SafeParcelReader.b(parcel, b);
                            continue;
                        case 14:
                            j = SafeParcelReader.r(parcel, b);
                            continue;
                        default:
                            SafeParcelReader.p(parcel, b);
                            continue;
                    }
                } else {
                    locationRequest = (LocationRequest) SafeParcelReader.b(parcel, b, LocationRequest.CREATOR);
                }
            }
            SafeParcelReader.d(parcel, a2);
            return new C0008getAccounttype(locationRequest, list, str, z, z2, z3, str2, z4, z5, str3, j);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ C0008getAccounttype[] newArray(int i) {
            return new C0008getAccounttype[i];
        }
    };

    public C0008getAccounttype(LocationRequest locationRequest, List<setCobIsoCode> list, String str, boolean z, boolean z2, boolean z3, String str2, boolean z4, boolean z5, String str3, long j) {
        this.d = locationRequest;
        this.e = list;
        this.b = str;
        this.c = z;
        this.g = z2;
        this.i = z3;
        this.j = str2;
        this.f = z4;
        this.h = z5;
        this.m = str3;
        this.l = j;
    }

    public static C0008getAccounttype a(String str, LocationRequest locationRequest) {
        return new C0008getAccounttype(locationRequest, a, null, false, false, false, null, false, false, null, Long.MAX_VALUE);
    }

    @Override // java.lang.Object
    public final boolean equals(Object obj) {
        if (!(obj instanceof C0008getAccounttype)) {
            return false;
        }
        C0008getAccounttype getaccounttype = (C0008getAccounttype) obj;
        return setFlagIB.d(this.d, getaccounttype.d) && setFlagIB.d(this.e, getaccounttype.e) && setFlagIB.d(this.b, getaccounttype.b) && this.c == getaccounttype.c && this.g == getaccounttype.g && this.i == getaccounttype.i && setFlagIB.d(this.j, getaccounttype.j) && this.f == getaccounttype.f && this.h == getaccounttype.h && setFlagIB.d(this.m, getaccounttype.m);
    }

    @Override // java.lang.Object
    public final int hashCode() {
        return this.d.hashCode();
    }

    @Override // java.lang.Object
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.d);
        if (this.b != null) {
            sb.append(" tag=");
            sb.append(this.b);
        }
        if (this.j != null) {
            sb.append(" moduleId=");
            sb.append(this.j);
        }
        if (this.m != null) {
            sb.append(" contextAttributionTag=");
            sb.append(this.m);
        }
        sb.append(" hideAppOps=");
        sb.append(this.c);
        sb.append(" clients=");
        sb.append(this.e);
        sb.append(" forceCoarseLocation=");
        sb.append(this.g);
        if (this.i) {
            sb.append(" exemptFromBackgroundThrottle");
        }
        if (this.f) {
            sb.append(" locationSettingsIgnored");
        }
        if (this.h) {
            sb.append(" inaccurateLocationsDelayed");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int b = setHmAddress.b(parcel);
        setHmAddress.b(parcel, 1, (Parcelable) this.d, i, false);
        setHmAddress.a(parcel, 5, (List) this.e, false);
        setHmAddress.c(parcel, 6, this.b, false);
        setHmAddress.b(parcel, 7, this.c);
        setHmAddress.b(parcel, 8, this.g);
        setHmAddress.b(parcel, 9, this.i);
        setHmAddress.c(parcel, 10, this.j, false);
        setHmAddress.b(parcel, 11, this.f);
        setHmAddress.b(parcel, 12, this.h);
        setHmAddress.c(parcel, 13, this.m, false);
        setHmAddress.e(parcel, 14, this.l);
        setHmAddress.e(parcel, b);
    }
}
