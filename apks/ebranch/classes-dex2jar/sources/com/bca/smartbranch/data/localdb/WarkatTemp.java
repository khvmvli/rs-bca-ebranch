package com.bca.smartbranch.data.localdb;

import o.subscribeReservationRescheduleEvent;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/data/localdb/WarkatTemp.class */
public final class WarkatTemp {
    public long a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public double h;
    public String j;

    public WarkatTemp() {
        this(0, null, null, null, null, null, null, 0.0d, null, 511);
    }

    private WarkatTemp(long j, String str, String str2, String str3, String str4, String str5, String str6, double d, String str7) {
        subscribeReservationRescheduleEvent.e(str, "");
        subscribeReservationRescheduleEvent.e(str2, "");
        subscribeReservationRescheduleEvent.e(str3, "");
        subscribeReservationRescheduleEvent.e(str4, "");
        subscribeReservationRescheduleEvent.e(str5, "");
        subscribeReservationRescheduleEvent.e(str6, "");
        subscribeReservationRescheduleEvent.e(str7, "");
        this.a = j;
        this.f = str;
        this.g = str2;
        this.d = str3;
        this.j = str4;
        this.e = str5;
        this.c = str6;
        this.h = d;
        this.b = str7;
    }

    public /* synthetic */ WarkatTemp(long j, String str, String str2, String str3, String str4, String str5, String str6, double d, String str7, int i) {
        this(0, "", "", "", "", "", "", 0.0d, "");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WarkatTemp)) {
            return false;
        }
        WarkatTemp warkatTemp = (WarkatTemp) obj;
        return this.a == warkatTemp.a && subscribeReservationRescheduleEvent.b((Object) this.f, (Object) warkatTemp.f) && subscribeReservationRescheduleEvent.b((Object) this.g, (Object) warkatTemp.g) && subscribeReservationRescheduleEvent.b((Object) this.d, (Object) warkatTemp.d) && subscribeReservationRescheduleEvent.b((Object) this.j, (Object) warkatTemp.j) && subscribeReservationRescheduleEvent.b((Object) this.e, (Object) warkatTemp.e) && subscribeReservationRescheduleEvent.b((Object) this.c, (Object) warkatTemp.c) && subscribeReservationRescheduleEvent.b(Double.valueOf(this.h), Double.valueOf(warkatTemp.h)) && subscribeReservationRescheduleEvent.b((Object) this.b, (Object) warkatTemp.b);
    }

    public final int hashCode() {
        return (((((((((((((((KliringTemp$$ExternalSyntheticBackport0.b(this.a) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31) + this.d.hashCode()) * 31) + this.j.hashCode()) * 31) + this.e.hashCode()) * 31) + this.c.hashCode()) * 31) + Double.doubleToLongBits(this.h)) * 31) + this.b.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WarkatTemp(id=");
        sb.append(this.a);
        sb.append(", nomorWarkat=");
        sb.append(this.f);
        sb.append(", namaBank=");
        sb.append(this.g);
        sb.append(", kodeBank=");
        sb.append(this.d);
        sb.append(", localClearingCodeBank=");
        sb.append(this.j);
        sb.append(", jenisWarkat=");
        sb.append(this.e);
        sb.append(", kodeJenisWarkat=");
        sb.append(this.c);
        sb.append(", nominal=");
        sb.append(this.h);
        sb.append(", jatuhTempo=");
        sb.append(this.b);
        sb.append(')');
        return sb.toString();
    }
}
