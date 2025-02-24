package com.bca.smartbranch.data.localdb;

import java.util.ArrayList;
import o.subscribeReservationRescheduleEvent;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/data/localdb/KliringTemp.class */
public final class KliringTemp {
    public String a;
    public String b;
    public String c;
    public long d;
    public long e;
    public String f;
    public String g;
    public String h;
    public String i;
    public ArrayList<WarkatTemp> j;
    public String k;
    public String l;
    public String m;
    public String n;

    /* renamed from: o  reason: collision with root package name */
    public String f29o;
    public String p;
    public double r;
    public String s;
    public String t;

    public KliringTemp() {
        this(0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, null, null, 0.0d, 524287);
    }

    private KliringTemp(long j, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, long j2, String str15, ArrayList<WarkatTemp> arrayList, double d) {
        subscribeReservationRescheduleEvent.e(str, "");
        subscribeReservationRescheduleEvent.e(str2, "");
        subscribeReservationRescheduleEvent.e(str3, "");
        subscribeReservationRescheduleEvent.e(str4, "");
        subscribeReservationRescheduleEvent.e(str5, "");
        subscribeReservationRescheduleEvent.e(str6, "");
        subscribeReservationRescheduleEvent.e(str7, "");
        subscribeReservationRescheduleEvent.e(str8, "");
        subscribeReservationRescheduleEvent.e(str9, "");
        subscribeReservationRescheduleEvent.e(str10, "");
        subscribeReservationRescheduleEvent.e(str11, "");
        subscribeReservationRescheduleEvent.e(str12, "");
        subscribeReservationRescheduleEvent.e(str13, "");
        subscribeReservationRescheduleEvent.e(str14, "");
        subscribeReservationRescheduleEvent.e(str15, "");
        this.d = j;
        this.f = str;
        this.h = str2;
        this.g = str3;
        this.i = str4;
        this.a = str5;
        this.k = str6;
        this.f29o = str7;
        this.p = str8;
        this.m = str9;
        this.s = str10;
        this.l = str11;
        this.t = str12;
        this.b = str13;
        this.n = str14;
        this.e = j2;
        this.c = str15;
        this.j = arrayList;
        this.r = d;
    }

    public /* synthetic */ KliringTemp(long j, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, long j2, String str15, ArrayList arrayList, double d, int i) {
        this(0, "", "", "", "", "", "", "", "", "", "", "", "", "", "", 0, "", new ArrayList(), 0.0d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KliringTemp)) {
            return false;
        }
        KliringTemp kliringTemp = (KliringTemp) obj;
        return this.d == kliringTemp.d && subscribeReservationRescheduleEvent.b((Object) this.f, (Object) kliringTemp.f) && subscribeReservationRescheduleEvent.b((Object) this.h, (Object) kliringTemp.h) && subscribeReservationRescheduleEvent.b((Object) this.g, (Object) kliringTemp.g) && subscribeReservationRescheduleEvent.b((Object) this.i, (Object) kliringTemp.i) && subscribeReservationRescheduleEvent.b((Object) this.a, (Object) kliringTemp.a) && subscribeReservationRescheduleEvent.b((Object) this.k, (Object) kliringTemp.k) && subscribeReservationRescheduleEvent.b((Object) this.f29o, (Object) kliringTemp.f29o) && subscribeReservationRescheduleEvent.b((Object) this.p, (Object) kliringTemp.p) && subscribeReservationRescheduleEvent.b((Object) this.m, (Object) kliringTemp.m) && subscribeReservationRescheduleEvent.b((Object) this.s, (Object) kliringTemp.s) && subscribeReservationRescheduleEvent.b((Object) this.l, (Object) kliringTemp.l) && subscribeReservationRescheduleEvent.b((Object) this.t, (Object) kliringTemp.t) && subscribeReservationRescheduleEvent.b((Object) this.b, (Object) kliringTemp.b) && subscribeReservationRescheduleEvent.b((Object) this.n, (Object) kliringTemp.n) && this.e == kliringTemp.e && subscribeReservationRescheduleEvent.b((Object) this.c, (Object) kliringTemp.c) && subscribeReservationRescheduleEvent.b(this.j, kliringTemp.j) && subscribeReservationRescheduleEvent.b(Double.valueOf(this.r), Double.valueOf(kliringTemp.r));
    }

    public final int hashCode() {
        int b = KliringTemp$$ExternalSyntheticBackport0.b(this.d);
        int hashCode = this.f.hashCode();
        int hashCode2 = this.h.hashCode();
        int hashCode3 = this.g.hashCode();
        int hashCode4 = this.i.hashCode();
        int hashCode5 = this.a.hashCode();
        int hashCode6 = this.k.hashCode();
        int hashCode7 = this.f29o.hashCode();
        int hashCode8 = this.p.hashCode();
        int hashCode9 = this.m.hashCode();
        int hashCode10 = this.s.hashCode();
        int hashCode11 = this.l.hashCode();
        int hashCode12 = this.t.hashCode();
        int hashCode13 = this.b.hashCode();
        int hashCode14 = this.n.hashCode();
        int b2 = KliringTemp$$ExternalSyntheticBackport0.b(this.e);
        int hashCode15 = this.c.hashCode();
        ArrayList<WarkatTemp> arrayList = this.j;
        return (((((((((((((((((((((((((((((((((((b * 31) + hashCode) * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + hashCode11) * 31) + hashCode12) * 31) + hashCode13) * 31) + hashCode14) * 31) + b2) * 31) + hashCode15) * 31) + (arrayList == null ? 0 : arrayList.hashCode())) * 31) + Double.doubleToLongBits(this.r);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("KliringTemp(id=");
        sb.append(this.d);
        sb.append(", namaPenerima=");
        sb.append(this.f);
        sb.append(", nomorRekening=");
        sb.append(this.h);
        sb.append(", kodeNegara=");
        sb.append(this.g);
        sb.append(", nomorHp=");
        sb.append(this.i);
        sb.append(", beritaAcara=");
        sb.append(this.a);
        sb.append(", tanggalJatuhTempo=");
        sb.append(this.k);
        sb.append(", tipeNasabah=");
        sb.append(this.f29o);
        sb.append(", tipeNasabahId=");
        sb.append(this.p);
        sb.append(", sumberDana=");
        sb.append(this.m);
        sb.append(", tujuanTransaksi=");
        sb.append(this.s);
        sb.append(", sumberDanaCode=");
        sb.append(this.l);
        sb.append(", tujuanTransaksiCode=");
        sb.append(this.t);
        sb.append(", accType=");
        sb.append(this.b);
        sb.append(", saranaPembayaranPengirim=");
        sb.append(this.n);
        sb.append(", createdAt=");
        sb.append(this.e);
        sb.append(", currentPage=");
        sb.append(this.c);
        sb.append(", listWarkat=");
        sb.append(this.j);
        sb.append(", totalWarkat=");
        sb.append(this.r);
        sb.append(')');
        return sb.toString();
    }
}
