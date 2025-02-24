package o;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.List;
/* loaded from: classes2-dex2jar.jar:o/setCreditCards.class */
public final class setCreditCards extends setFotoPribadi {
    public static final Parcelable.Creator<setCreditCards> CREATOR = new setFlagContactKU();
    public final long a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final long f;
    public final String g;
    public final long h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final long l;
    public final String m;
    public final long n;

    /* renamed from: o */
    public final int f92o;
    public final boolean p;
    public final List<String> q;
    public final long r;
    public final String s;
    public final Boolean t;
    public final String u;
    public final String v;

    public setCreditCards(String str, String str2, String str3, long j, String str4, long j2, long j3, String str5, boolean z, boolean z2, String str6, long j4, long j5, int i, boolean z3, boolean z4, String str7, Boolean bool, long j6, List<String> list, String str8, String str9) {
        setFotoKtp.c(str);
        this.d = str;
        this.c = true != TextUtils.isEmpty(str2) ? str2 : null;
        this.e = str3;
        this.f = j;
        this.b = str4;
        this.a = j2;
        this.h = j3;
        this.g = str5;
        this.j = z;
        this.i = z2;
        this.m = str6;
        this.n = j4;
        this.l = j5;
        this.f92o = i;
        this.k = z3;
        this.p = z4;
        this.s = str7;
        this.t = bool;
        this.r = j6;
        this.q = list;
        this.v = str8;
        this.u = str9;
    }

    public setCreditCards(String str, String str2, String str3, String str4, long j, long j2, String str5, boolean z, boolean z2, long j3, String str6, long j4, long j5, int i, boolean z3, boolean z4, String str7, Boolean bool, long j6, List<String> list, String str8, String str9) {
        this.d = str;
        this.c = str2;
        this.e = str3;
        this.f = j3;
        this.b = str4;
        this.a = j;
        this.h = j2;
        this.g = str5;
        this.j = z;
        this.i = z2;
        this.m = str6;
        this.n = j4;
        this.l = j5;
        this.f92o = i;
        this.k = z3;
        this.p = z4;
        this.s = str7;
        this.t = bool;
        this.r = j6;
        this.q = list;
        this.v = str8;
        this.u = str9;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int b = setHmAddress.b(parcel);
        setHmAddress.c(parcel, 2, this.d, false);
        setHmAddress.c(parcel, 3, this.c, false);
        setHmAddress.c(parcel, 4, this.e, false);
        setHmAddress.c(parcel, 5, this.b, false);
        setHmAddress.e(parcel, 6, this.a);
        setHmAddress.e(parcel, 7, this.h);
        setHmAddress.c(parcel, 8, this.g, false);
        setHmAddress.b(parcel, 9, this.j);
        setHmAddress.b(parcel, 10, this.i);
        setHmAddress.e(parcel, 11, this.f);
        setHmAddress.c(parcel, 12, this.m, false);
        setHmAddress.e(parcel, 13, this.n);
        setHmAddress.e(parcel, 14, this.l);
        setHmAddress.d(parcel, 15, this.f92o);
        setHmAddress.b(parcel, 16, this.k);
        setHmAddress.b(parcel, 18, this.p);
        setHmAddress.c(parcel, 19, this.s, false);
        setHmAddress.d(parcel, 21, this.t, false);
        setHmAddress.e(parcel, 22, this.r);
        setHmAddress.b(parcel, 23, this.q, false);
        setHmAddress.c(parcel, 24, this.v, false);
        setHmAddress.c(parcel, 25, this.u, false);
        setHmAddress.e(parcel, b);
    }
}
