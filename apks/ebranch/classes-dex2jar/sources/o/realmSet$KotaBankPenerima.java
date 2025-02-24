package o;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes-dex2jar.jar:o/realmSet$KotaBankPenerima.class */
public final class realmSet$KotaBankPenerima extends setFotoPribadi {
    public static final Parcelable.Creator<realmSet$KotaBankPenerima> CREATOR = new Parcelable.Creator<realmSet$KotaBankPenerima>() { // from class: o.realmSet$LimitMinNominalTransaksi
        @Override // android.os.Parcelable.Creator
        /* Code decompiled incorrectly, please refer to instructions dump */
        public final /* synthetic */ o.realmSet$KotaBankPenerima createFromParcel(android.os.Parcel r10) {
            /*
                r9 = this;
                r0 = r10
                int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.a(r0)
                r11 = r0
                r0 = -1
                r12 = r0
                r0 = r12
                r14 = r0
                r0 = 1
                r16 = r0
                r0 = 1
                r17 = r0
            L_0x0012:
                r0 = r10
                int r0 = r0.dataPosition()
                r1 = r11
                if (r0 >= r1) goto L_0x0073
                r0 = r10
                int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.b(r0)
                r18 = r0
                r0 = r18
                int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.b(r0)
                r19 = r0
                r0 = r19
                r1 = 1
                if (r0 == r1) goto L_0x0068
                r0 = r19
                r1 = 2
                if (r0 == r1) goto L_0x005d
                r0 = r19
                r1 = 3
                if (r0 == r1) goto L_0x0053
                r0 = r19
                r1 = 4
                if (r0 == r1) goto L_0x0048
                r0 = r10
                r1 = r18
                com.google.android.gms.common.internal.safeparcel.SafeParcelReader.p(r0, r1)
                goto L_0x0012
            L_0x0048:
                r0 = r10
                r1 = r18
                long r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.r(r0, r1)
                r14 = r0
                goto L_0x0012
            L_0x0053:
                r0 = r10
                r1 = r18
                long r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.r(r0, r1)
                r12 = r0
                goto L_0x0012
            L_0x005d:
                r0 = r10
                r1 = r18
                int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.k(r0, r1)
                r17 = r0
                goto L_0x0012
            L_0x0068:
                r0 = r10
                r1 = r18
                int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.k(r0, r1)
                r16 = r0
                goto L_0x0012
            L_0x0073:
                r0 = r10
                r1 = r11
                com.google.android.gms.common.internal.safeparcel.SafeParcelReader.d(r0, r1)
                o.realmSet$KotaBankPenerima r0 = new o.realmSet$KotaBankPenerima
                r1 = r0
                r2 = r16
                r3 = r17
                r4 = r12
                r5 = r14
                r1.<init>(r2, r3, r4, r5)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: o.realmSet$LimitMinNominalTransaksi.createFromParcel(android.os.Parcel):java.lang.Object");
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ realmSet$KotaBankPenerima[] newArray(int i) {
            return new realmSet$KotaBankPenerima[i];
        }
    };
    public final long a;
    public final int b;
    public final int c;
    public final long d;

    public realmSet$KotaBankPenerima(int i, int i2, long j, long j2) {
        this.c = i;
        this.b = i2;
        this.d = j;
        this.a = j2;
    }

    @Override // java.lang.Object
    public final boolean equals(Object obj) {
        if (!(obj instanceof realmSet$KotaBankPenerima)) {
            return false;
        }
        realmSet$KotaBankPenerima realmset_kotabankpenerima = (realmSet$KotaBankPenerima) obj;
        return this.c == realmset_kotabankpenerima.c && this.b == realmset_kotabankpenerima.b && this.d == realmset_kotabankpenerima.d && this.a == realmset_kotabankpenerima.a;
    }

    @Override // java.lang.Object
    public final int hashCode() {
        return setFlagIB.b(Integer.valueOf(this.b), Integer.valueOf(this.c), Long.valueOf(this.a), Long.valueOf(this.d));
    }

    @Override // java.lang.Object
    public final String toString() {
        return "NetworkLocationStatus: Wifi status: " + this.c + " Cell status: " + this.b + " elapsed time NS: " + this.a + " system time ms: " + this.d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int b = setHmAddress.b(parcel);
        setHmAddress.d(parcel, 1, this.c);
        setHmAddress.d(parcel, 2, this.b);
        setHmAddress.e(parcel, 3, this.d);
        setHmAddress.e(parcel, 4, this.a);
        setHmAddress.e(parcel, b);
    }
}
