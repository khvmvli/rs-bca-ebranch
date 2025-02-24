package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.location.LocationRequest;
import java.util.Arrays;
import o.setFotoPribadi;
import o.setHmAddress;
import o.setMinWidth$MediaBrowserCompat$CustomActionResultReceiver;
/* loaded from: classes-dex2jar.jar:com/google/android/gms/location/LocationRequest.class */
public final class LocationRequest extends setFotoPribadi implements ReflectedParcelable {
    public static final Parcelable.Creator<LocationRequest> CREATOR = new Parcelable.Creator<LocationRequest>() { // from class: o.realmSet$ISONegaraTujuanTransaksi
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ LocationRequest createFromParcel(Parcel parcel) {
            int a = SafeParcelReader.a(parcel);
            long j = 3600000;
            long j2 = 600000;
            long j3 = Long.MAX_VALUE;
            long j4 = 0;
            int i = setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.cw;
            boolean z = false;
            int i2 = Integer.MAX_VALUE;
            float f = 0.0f;
            boolean z2 = false;
            while (parcel.dataPosition() < a) {
                int b = SafeParcelReader.b(parcel);
                switch (SafeParcelReader.b(b)) {
                    case 1:
                        i = SafeParcelReader.k(parcel, b);
                        break;
                    case 2:
                        j = SafeParcelReader.r(parcel, b);
                        break;
                    case 3:
                        j2 = SafeParcelReader.r(parcel, b);
                        break;
                    case 4:
                        z = SafeParcelReader.j(parcel, b);
                        break;
                    case 5:
                        j3 = SafeParcelReader.r(parcel, b);
                        break;
                    case 6:
                        i2 = SafeParcelReader.k(parcel, b);
                        break;
                    case 7:
                        f = SafeParcelReader.m(parcel, b);
                        break;
                    case 8:
                        j4 = SafeParcelReader.r(parcel, b);
                        break;
                    case 9:
                        z2 = SafeParcelReader.j(parcel, b);
                        break;
                    default:
                        SafeParcelReader.p(parcel, b);
                        break;
                }
            }
            SafeParcelReader.d(parcel, a);
            return new LocationRequest(i, j, j2, z, j3, i2, f, j4, z2);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ LocationRequest[] newArray(int i) {
            return new LocationRequest[i];
        }
    };
    boolean a;
    long b;
    public int c;
    long d;
    long e;
    public boolean f;
    int g;
    float h;
    long i;

    @Deprecated
    public LocationRequest() {
        this.c = setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.cw;
        this.e = 3600000;
        this.d = 600000;
        this.a = false;
        this.b = Long.MAX_VALUE;
        this.g = Integer.MAX_VALUE;
        this.h = 0.0f;
        this.i = 0;
        this.f = false;
    }

    public LocationRequest(int i, long j, long j2, boolean z, long j3, int i2, float f, long j4, boolean z2) {
        this.c = i;
        this.e = j;
        this.d = j2;
        this.a = z;
        this.b = j3;
        this.g = i2;
        this.h = f;
        this.i = j4;
        this.f = z2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v36, types: [long] */
    /* JADX WARN: Type inference failed for: r0v38, types: [long] */
    /* JADX WARN: Type inference failed for: r0v9, types: [long] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Unknown variable types count: 4 */
    @Override // java.lang.Object
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            r0 = r6
            boolean r0 = r0 instanceof com.google.android.gms.location.LocationRequest
            if (r0 == 0) goto L_0x00a0
            r0 = r6
            com.google.android.gms.location.LocationRequest r0 = (com.google.android.gms.location.LocationRequest) r0
            r6 = r0
            r0 = r5
            int r0 = r0.c
            r1 = r6
            int r1 = r1.c
            if (r0 != r1) goto L_0x00a0
            r0 = r5
            long r0 = r0.e
            r7 = r0
            r0 = r7
            r1 = r6
            long r1 = r1.e
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x00a0
            r0 = r5
            long r0 = r0.d
            r1 = r6
            long r1 = r1.d
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x00a0
            r0 = r5
            boolean r0 = r0.a
            r1 = r6
            boolean r1 = r1.a
            if (r0 != r1) goto L_0x00a0
            r0 = r5
            long r0 = r0.b
            r1 = r6
            long r1 = r1.b
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x00a0
            r0 = r5
            int r0 = r0.g
            r1 = r6
            int r1 = r1.g
            if (r0 != r1) goto L_0x00a0
            r0 = r5
            float r0 = r0.h
            r1 = r6
            float r1 = r1.h
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x00a0
            r0 = r5
            long r0 = r0.i
            r9 = r0
            r0 = r9
            r1 = r7
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0072
            r0 = r7
            r9 = r0
            goto L_0x0072
        L_0x0072:
            r0 = r6
            long r0 = r0.i
            r11 = r0
            r0 = r6
            long r0 = r0.e
            r13 = r0
            r0 = r11
            r7 = r0
            r0 = r11
            r1 = r13
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x008c
            r0 = r13
            r7 = r0
        L_0x008c:
            r0 = r9
            r1 = r7
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x00a0
            r0 = r5
            boolean r0 = r0.f
            r1 = r6
            boolean r1 = r1.f
            if (r0 != r1) goto L_0x00a0
            r0 = 1
            return r0
        L_0x00a0:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.location.LocationRequest.equals(java.lang.Object):boolean");
    }

    @Override // java.lang.Object
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.c), Long.valueOf(this.e), Float.valueOf(this.h), Long.valueOf(this.i)});
    }

    @Override // java.lang.Object
    public final String toString() {
        StringBuilder sb = new StringBuilder("Request[");
        int i = this.c;
        sb.append(i != 100 ? i != 102 ? i != 104 ? i != 105 ? "???" : "PRIORITY_NO_POWER" : "PRIORITY_LOW_POWER" : "PRIORITY_BALANCED_POWER_ACCURACY" : "PRIORITY_HIGH_ACCURACY");
        if (this.c != 105) {
            sb.append(" requested=");
            sb.append(this.e);
            sb.append("ms");
        }
        sb.append(" fastest=");
        sb.append(this.d);
        sb.append("ms");
        if (this.i > this.e) {
            sb.append(" maxWait=");
            sb.append(this.i);
            sb.append("ms");
        }
        if (this.h > 0.0f) {
            sb.append(" smallestDisplacement=");
            sb.append(this.h);
            sb.append("m");
        }
        long j = this.b;
        if (j != Long.MAX_VALUE) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            sb.append(" expireIn=");
            sb.append(j - elapsedRealtime);
            sb.append("ms");
        }
        if (this.g != Integer.MAX_VALUE) {
            sb.append(" num=");
            sb.append(this.g);
        }
        sb.append(']');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(-45243);
        parcel.writeInt(0);
        int dataPosition = parcel.dataPosition();
        int i2 = this.c;
        parcel.writeInt(262145);
        parcel.writeInt(i2);
        long j = this.e;
        parcel.writeInt(524290);
        parcel.writeLong(j);
        long j2 = this.d;
        parcel.writeInt(524291);
        parcel.writeLong(j2);
        boolean z = this.a;
        parcel.writeInt(262148);
        parcel.writeInt(z ? 1 : 0);
        long j3 = this.b;
        parcel.writeInt(524293);
        parcel.writeLong(j3);
        int i3 = this.g;
        parcel.writeInt(262150);
        parcel.writeInt(i3);
        float f = this.h;
        parcel.writeInt(262151);
        parcel.writeFloat(f);
        long j4 = this.i;
        parcel.writeInt(524296);
        parcel.writeLong(j4);
        boolean z2 = this.f;
        parcel.writeInt(262153);
        parcel.writeInt(z2 ? 1 : 0);
        setHmAddress.e(parcel, dataPosition);
    }
}
