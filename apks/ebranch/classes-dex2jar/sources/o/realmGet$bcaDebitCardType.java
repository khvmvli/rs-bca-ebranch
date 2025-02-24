package o;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes-dex2jar.jar:o/realmGet$bcaDebitCardType.class */
public final class realmGet$bcaDebitCardType extends setFotoPribadi {
    public static final Parcelable.Creator<realmGet$bcaDebitCardType> CREATOR = new Parcelable.Creator<realmGet$bcaDebitCardType>() { // from class: o.realmGet$bcaDebitCardNumber
        @Override // android.os.Parcelable.Creator
        /* Code decompiled incorrectly, please refer to instructions dump */
        public final /* synthetic */ o.realmGet$bcaDebitCardType createFromParcel(android.os.Parcel r14) {
            /*
                r13 = this;
                r0 = r14
                int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.a(r0)
                r15 = r0
                r0 = 0
                r16 = r0
                r0 = r16
                r18 = r0
                r0 = 0
                r20 = r0
                r0 = r20
                r21 = r0
                r0 = r21
                r22 = r0
                r0 = r22
                r23 = r0
                r0 = r23
                r24 = r0
                r0 = 0
                r25 = r0
            L_0x0020:
                r0 = r14
                int r0 = r0.dataPosition()
                r1 = r15
                if (r0 >= r1) goto L_0x00c0
                r0 = r14
                int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.b(r0)
                r26 = r0
                r0 = r26
                int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.b(r0)
                switch(r0) {
                    case 1: goto L_0x00b6;
                    case 2: goto L_0x00ab;
                    case 3: goto L_0x00a0;
                    case 4: goto L_0x0095;
                    case 5: goto L_0x008a;
                    case 6: goto L_0x007f;
                    case 7: goto L_0x0074;
                    case 8: goto L_0x0069;
                    default: goto L_0x0060;
                }
            L_0x0060:
                r0 = r14
                r1 = r26
                com.google.android.gms.common.internal.safeparcel.SafeParcelReader.p(r0, r1)
                goto L_0x0020
            L_0x0069:
                r0 = r14
                r1 = r26
                java.lang.String r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.b(r0, r1)
                r24 = r0
                goto L_0x0020
            L_0x0074:
                r0 = r14
                r1 = r26
                android.os.Bundle r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.c(r0, r1)
                r23 = r0
                goto L_0x0020
            L_0x007f:
                r0 = r14
                r1 = r26
                java.lang.String r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.b(r0, r1)
                r22 = r0
                goto L_0x0020
            L_0x008a:
                r0 = r14
                r1 = r26
                java.lang.String r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.b(r0, r1)
                r21 = r0
                goto L_0x0020
            L_0x0095:
                r0 = r14
                r1 = r26
                java.lang.String r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.b(r0, r1)
                r20 = r0
                goto L_0x0020
            L_0x00a0:
                r0 = r14
                r1 = r26
                boolean r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.j(r0, r1)
                r25 = r0
                goto L_0x0020
            L_0x00ab:
                r0 = r14
                r1 = r26
                long r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.r(r0, r1)
                r18 = r0
                goto L_0x0020
            L_0x00b6:
                r0 = r14
                r1 = r26
                long r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.r(r0, r1)
                r16 = r0
                goto L_0x0020
            L_0x00c0:
                r0 = r14
                r1 = r15
                com.google.android.gms.common.internal.safeparcel.SafeParcelReader.d(r0, r1)
                o.realmGet$bcaDebitCardType r0 = new o.realmGet$bcaDebitCardType
                r1 = r0
                r2 = r16
                r3 = r18
                r4 = r25
                r5 = r20
                r6 = r21
                r7 = r22
                r8 = r23
                r9 = r24
                r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: o.realmGet$bcaDebitCardNumber.createFromParcel(android.os.Parcel):java.lang.Object");
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ realmGet$bcaDebitCardType[] newArray(int i) {
            return new realmGet$bcaDebitCardType[i];
        }
    };
    public final long a;
    public final String b;
    public final String c;
    public final boolean d;
    public final long e;
    public final Bundle f;
    public final String h;
    public final String j;

    public realmGet$bcaDebitCardType(long j, long j2, boolean z, String str, String str2, String str3, Bundle bundle, String str4) {
        this.e = j;
        this.a = j2;
        this.d = z;
        this.c = str;
        this.b = str2;
        this.h = str3;
        this.f = bundle;
        this.j = str4;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int b = setHmAddress.b(parcel);
        setHmAddress.e(parcel, 1, this.e);
        setHmAddress.e(parcel, 2, this.a);
        setHmAddress.b(parcel, 3, this.d);
        setHmAddress.c(parcel, 4, this.c, false);
        setHmAddress.c(parcel, 5, this.b, false);
        setHmAddress.c(parcel, 6, this.h, false);
        setHmAddress.a(parcel, 7, this.f, false);
        setHmAddress.c(parcel, 8, this.j, false);
        setHmAddress.e(parcel, b);
    }
}
